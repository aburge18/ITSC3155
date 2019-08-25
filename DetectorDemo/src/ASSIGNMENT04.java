/**
 * @description: This program is intended to act as a jungle creator game where users maybe create a jungle
 * to custom specifications and explore it whilst observing various species of creatures. The coordinate values for
 * our jungle space are held by two two-dimensional arrays, our two dimensional string array holds the tabular data that
 * will be eventually displayed to the user. O's, x's and *'s represent the varying conditions the user will encounter in their jungle.
 * Our boolean two dimensional array contains values for each combination of x and y coordinates, a true value represents a space not occupied
 * by an animal or been explored while true represents a space that has. Next methods generate our visual world and the boolean values for the explored space.
 * This is done through a series of loops, if statements and string array methods that is constantly checking against our isEmpty and isExplored methods
 * in order to properly traverse the jungle with proper results and feedback. Our insertAnimal and RemoveAnimal methods use user feedback to determine
 * the species and location desired for their animal placement and uses if statements and for loops to cycle through species and grid spaces while checking
 * for their availability and eventually initializes the desired species in the desired spot or likewise removes a species from a particular location. 
 * Our print method uses cleverly placed for loops and print statements to print the jungle back to our user. Our sort method uses a bubble sort method to
 * sort the species our player has observed. We use to for loops, one to loop the body and one simply to increment and cycle through the first letters of every species
 * in our catalog. Next we use if statements and the compareTo string method and a temporary string variable. Each char is compared.
 * @author Alexander Burgess
 * @version 4/29/2018
 */

import java.util.Scanner;

import java.util.Arrays;

public class ASSIGNMENT04 {
	
	static Scanner input = new Scanner(System.in);	
	
	static boolean[][] exploredWorld;

	static String[] observedAnimals;
	
	//Main Method, generate world in main method with user-supplied dimensions and specifications
	
	public static void main(String[] args) {	
	
		 boolean loop = true;
	  
		System.out.println("Welcome to the jungle creator!\nIn this game, you will be inserting animals in certain places in the world\nthat you create! You will also be allowed to remove animals from certain locations before you start exploring!\nOnce you start exploring you will navigate around the world to observe the animals you have inserted.\nThe game will keep track of all the animals you have observed!");
	    
	  System.out.println("Enter the dimensions of your custom jungle.");
	
	  System.out.print("Enter desired length of your jungle:");
	 
	  int length = input.nextInt();
	 
	    System.out.print("Enter desired width of your jungle:");
	  
	    int width = input.nextInt();
	   
	    String[][] visibleWorld = new String[length][width];
	   
	    //Method call generates our explored world with user supplied dimensions
	    exploredWorld = new boolean [length][width];
	  
	    //Method call generates visual world using the user supplied dimensions 
	    makeExploredWorld(0,0);
	    
	    visibleWorld = makeWorld(visibleWorld, 0, 0);
	    
	    observedAnimals = new String[length*width];
	    
	    String[][] locations = new String[length][width];
	    
	    locations = populateAnimals(locations,length);
	   
	    int select;
	   
	    do
	    
	    {
	   
	    //Method call to display menu options and choices to the user 
	    printMainMenu();
	
	    select  = input.nextInt();
	   
	      switch (select) {
	   
	      case 1: 
	       
	    	  insertAnimalToWorld(locations);
	        
	    	  break;
	    
	      case 2: 
	       
	    	  removeAnimalFromWorld(locations);
	        
	    	  break;
	    
	      case 3: 
	       
	    	  explore(visibleWorld,observedAnimals, locations);
	       
	        loop=false;
	        
	        break;

	      default: 
	        
	    	  System.out.println("Invalid Input");
	      
	      }
	      
	  } while (loop);
	  
	}
	  
	    
//Main method that takes in visible world 2D array as well as the user's starting position 0,0
	//For loops and if statements use the user supplied world to generate the visual elements of our jungle
	public static String[][] makeWorld(String[][] world,int posX, int posY)
	  {
	    for (int x = 0; x < world.length; x++) {
 
	    	for (int y = 0; y < world[x].length; y++) {
	         
	   if ((x != posX) || (y != posY)) {
	    
	        	  if (!isExplored(x, y)) {
	              
	        		  world[x][y] = "*";
	            } 
	        	  else if (isExplored(x,y)) {
	             
	        		  world[x][y] = "O";
	            }
	            
	        }
	          else {
	           
	        	  world[x][y] = "x";
	        }
	        }
	        }
	      
	    return world;
	  
	  }
	
	//Explore world method takes in our starting position and cycles through our global boolean
	//array to initialize our starting position as explored and intialize all other spaces as either unexplored
	//or explored
	 public static void makeExploredWorld (int posX, int posY) {
		
		 for (int x = 0; x < exploredWorld.length; x++) {
		    
			 for (int y = 0; y < exploredWorld[x].length; y++) { 
		    
				 if ((x == posX) || (posY == y)) {
		         
					 exploredWorld[x][y] = false;} 
				 
				 else {
		             
					 exploredWorld[x][y] = true;
	}
	}
	}
	 }
	 
	//Takes in our visible world array and the length dimension of our array to generate random species
	 //in various areas in our jungle based on random integers multiplied to the 
	 public static String[][] populateAnimals (String[][] Locations, int length)
	  { 
		
		 String[] animals = { "Tiger", "Cheetah", "Panther", "Sloth", "Anaconda", "Unicorn", "Koala", "Feral Dog", "Cannabilistic Aboriginal", "Eagle", "Hawk", "Crocodile", "Marauding Bear", "Gazelle", "Army of mosquitoes","School of Piranhas","Honey Badger","Famished Poacher","Megalodon Shark", "Pikachu" };

	    for (int i = 0; i < 10; i++) {
	    
	      int x = (int)(Math.random() * length);
	    
	      int y = (int)(Math.random() * length);
	      
	  	  int species = (int)(Math.random() * length);
	    
	    
	      Locations[x][y] = animals[species];
	    }
	    
	    return Locations;
	  }
	 
	 //Main menu method when called displayed the menu choices and user prompts to the user
	 public static void printMainMenu()
	
	 {
	    System.out.println("1. Insert an animal into the world");
	   
	    System.out.println("2. Remove an animal from the world");
	 
	    System.out.println("3. Explore the world");
	    
	    System.out.print("Enter your choice: ");
	  }
	  
	 //Move menu when called displayed the options for movement to the user
	  public static void printMoveMenu()
	  {
	    System.out.println("W. Move Forward");
	    
	    System.out.println("A. Move Left");
	    
	    System.out.println("S. Move Backward");
	    
	    System.out.println("D. Move Right");
	    
	    System.out.println("I. Display observed animals");
	    
	    System.out.println("N. Sort the observed animals list by alphabetical order");
	    
	    System.out.println("E. Exit");
	    
	    System.out.print("Enter your choice: ");
	  }
	  
//Method for the user to supply the species and coordinates of an animal and subsequently place it in your jungle
	  public static void insertAnimalToWorld(String[][] Locations)
	  {
		  boolean loop = true;
		  
		  int x;
		   
		  int y;
		  
		String animal;
		  
		  do
			  
		    {
		      System.out.print("Enter the species of animal you would like to place: ");
		      
		      animal = input.next();
		     
		      System.out.print("Enter the x-coordinate of the animal you would like to place:");
		     
		      x = input.nextInt();
		     
		      System.out.print("Enter the y-coordinate of the animal you would like to place:");
		    
		      y = input.nextInt();
	  
		  if (x < 0 || y < 0 || (x >= Locations.length) || (y >= Locations[x].length)) {
		       
			  System.out.println("Outside the bounds of the jungle");
			 
			  loop = true;
		     
		  }
		     
		  else if (!isEmptyBlock(Locations, x, y)) {
		       
		    	  System.out.println("This location is currently occupied by another animal");
		        
		    	  loop=true;
		    	  
		      } 
		      
		      else {
		       
		    	  if (isEmptyBlock(Locations, x, y)) {
		          
		    		  
		        
		    	  }    
		      }
		    }
		    
		  while (( x < 0 || y < 0 || (x >= Locations.length) || (y >= Locations[x].length) || loop));
		    
		  Locations[x][y] = animal;
		
		  loop=false;
	  }
	  

		  
	//The remove animal take in user supplied coordinates for a particular creature in your jungle and removes it and resets the area
	  public static void removeAnimalFromWorld(String[][] Locations)
	  {
		  int x;
		  
		  int y;
		   
		  boolean loop = true;
		   
		  do
			  
		    {
		  
		    System.out.print("Enter the x-coordinate of the animal you would like to remove: ");
		    
		    x = input.nextInt();
		    
		    System.out.print("Enter the y-coordinate of the animal you would like to remove: ");
		    
		    y = input.nextInt();
		    
		    if ((x < 0 || y < 0 || (x >= Locations.length) || (y >= Locations[x].length))) {
		        
		    	System.out.println("Outside the bounds of the jungle");
		    	
		    	loop=true;
		    	
		        }
		       
		    else if (isEmptyBlock(Locations, x, y)) {
		    
		    	System.out.println("There is no animal currently occupying that location");
		        
		    	loop = true;
		        } 
		    
		    else {
		    
		    	if (!isEmptyBlock(Locations, x, y)) {
		        
		    		loop=false;
		    		
		    		
		        
		    	} 
		        }
		        } 
		  
		  while ((x < 0 || y < 0 || (x >= Locations.length) || (y >= Locations[x].length)) || (loop));
		      
		      Locations[x][y] = "";
		    }
		    
		
	  //Method checks our locations and for each space that is blank or null, the method will recognize it as empty and return true
	  //in any other case the block is considered filled and will return a false value 
	  public static boolean isEmptyBlock(String[][] world, int x, int y) {
	    
		  if (world[x][y].equals("") || world[x][y] == null)
			 
			  return true;
			  
		  else
				  return false;
	 
	  }
	  //Updates our string of observedAnimals after discovering one within your jungle
	  public static String[] updateObservedAnimals(String[] observedAnimals, String animal){
		 
		  for (int i = 0; i < observedAnimals.length; i++) {
		     
			  if (observedAnimals[i] == null) {
		        
		    	  observedAnimals[i] = animal;
		      }
		  }
		  
		  return observedAnimals;
	 
	  }
	  
	  //Method uses for loops to cycle through our visual world and prints in tabular format for navigation and ease of use
	  public static void printWorld(String[][] world){
		 
		  for (int i = 0; i < world.length; i++) {
		     
			  for (String area : world[i]) {
		       
		    	  System.out.print(area + " ");
		     
		      } 
		     
			  System.out.println();
		   
		  }
	    
	  }
	  //Method updates animals, locations, checks for empty spaces, sets spaces as explored and informs the user of any creature sightings
	  //This method essentially updates and gives feedback from our world based on user movement input
	  public static String[][] move(String[][] world, int x, int y, String[] observedAnimals, String[][] Locations){
	
		  world = makeWorld(world, x, y);
		  
		  exploredWorld[x][y] = false;
		   
		  if (isEmptyBlock(Locations, x, y)) {
		    	
		      System.out.println("There is no wildlife in this area :("); 
		      
		    } 
		    
		    else {
		      
		    	System.out.println("You have discovered a/an " + Locations[x][y] + "!");
		      
		      observedAnimals = updateObservedAnimals(observedAnimals, Locations[x][y]);
		    
		      System.out.println("The animals you've currently observed are: ");
		    
		      printObservedAnimals(observedAnimals);
		 
		    }
		    
		    return world;
		
	  }
		
		
	  
	  
	  //This method sets up our switch statement and cases for exploration and movement through the jungle.
	  //Use of for loops, if statements and string methods takes in user input and increments, decrements and checks and compares against explored areas or observed animals
	  public static void explore(String[][] world, String[] observedAnimals, String[][] Locations) {
 
		  boolean loop = true;
		  
		  char select;
		 
		  int posX=0;
		  
		  int posY=0;
		  
		  System.out.println("Welcome to your custom jungle! You may now explore the area freely");
		  
		  printWorld(world);
		
		  do
		    
		  {
		     
			  printMoveMenu();
		   
		      select = input.next().charAt(0);
		   
		      switch (select) {
		   
		      case 'w': 
		    
		    	  posX--;
		      
		        if ((posX < 0) || (posY < 0) || (posX >= world.length) || (posY >= world[posX].length)) {
		       
		        	posX = 0;
		    
		          posY = 0;
		        
		          System.out.println("You've left the bounds of your jungle. Position reset to (0,0)");
		    
		        }
		     
		        world = move(world, posX, posY, observedAnimals,Locations);
		      
		        printWorld(world);
		       
		        break;
		      
		      case 'a': 
		      
		    	  posY--;
		     
		    	  if ((posX < 0) || (posY < 0) || (posX >= world.length) || (posY >= world[posX].length)) {
		    
		    		  System.out.println("You've left the bounds of your jungle. Position reset to (0,0)");
		      
		    		posX = 0;
		    		
		    		posY = 0;
		          
		    	  }
		    	  
		        world = move(world, posX, posY, observedAnimals,Locations);
		      
		        printWorld(world);
		     
		        break;
		    
		      case 'd': 
		    
		    	  posY++;
		    
		        if ((posX < 0) || (posY < 0) || (posX >= world.length) || (posY >= world[posX].length)) {
		      
		        	posX = 0;
		      
		          posY = 0;
		          
		          System.out.println("You've left the bounds of your jungle. Position reset to (0,0)");
		     
		        }
		      
		        world = move(world, posX, posY, observedAnimals, Locations);
		     
		        printWorld(world);
		        
		        break;
		     
		      case 's': 
		        
		    	  posX++;
		        
		    	  if ((posX < 0) ||(posY < 0) || (posX >= world.length) ||  (posY >= world[posX].length)) {
		          
		        	posX = 0;
		          
		          posY = 0;
		       
		          System.out.println("You've left the bounds of your jungle. Position reset to (0,0)");
		        }
		     
		        world = move(world, posX, posY, observedAnimals,Locations);
		      
		        printWorld(world);
		        
		        break;
		    
		      case 'i': 
		      
		    	System.out.println("Printing observed animals...");
		      
		        printObservedAnimals(observedAnimals);
		     
		        break;
		    
		      case 'n': 
		       
		    	  System.out.println("Sorting observed animals...");
		       
		        sortAnimalList(observedAnimals);
		        
		        System.out.println("Printing observed animals...");
		        
		        printObservedAnimals(observedAnimals);
		        

		        break;
		     
		      case 'e': 
		      
		    	  System.out.println("Exiting Jungle...");
		        
		    	  loop=false;
		        
		    	  break;
		      
		      default: 
		       
		    	  System.out.println("Invalid Input");
		     
		      }
		      
		    } while (loop);
		  
	  }
	  //This method simply cycles through our observed animals array and prints them in a comprehensive manner to the user
	  public static void printObservedAnimals(String[] observedAnimals){
		 
		  for (int i = 0; i < observedAnimals.length; i++)
		    {
		        System.out.print(observedAnimals[i] + " ");
		    }
		    System.out.println();
	  }
	  
	  //Returns result from boolean array of the given coordinate set, true or false will be returned based on if it has been explored or not
	  public static boolean isExplored(int x, int y){
	    
		  return exploredWorld[x][y];
	
	  }
	  //This method sorts our observed animal array, using a bubble sort, into  alphabetical order using for statements, increments and temporary string variables
	  public static void sortAnimalList(String[] observedAnimals) {
		  
		  for (int i = 0; i <  observedAnimals.length - 1; i++) {
			   
			  for (int j = 0; j <  observedAnimals.length - i - 1; j++);
		    	
		  }
		  
	  }
		 
	  }
	  


