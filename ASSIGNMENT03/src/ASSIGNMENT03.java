import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Scanner;
/**
 * @description: This program acts as a manager of user expense and deposit logs. User options include adding deposit or expense logs
 * or viewing all or a customizable selection of logs based on user input. The program begins by calling the readFile() method, which takes
 * the data from our logs.txt and initializes the indexes of our parallel arrays for each corresponding field of data. The end result is five global
 * parallel arrays with which we may now more easily manipulate our data. This is done using our BufferedFileReader, our StringTokenizer, parallel arrays
 * and loops to cycle through our logs and ensure our data is perfectly parallel. To add logs, we use our BufferedFileWriter, String Tokenizer, loops and user
 * input to write new data to our logs.txt file. The rest of our options essentially use the parallel arrays, loops and if statements above to print customized 
 * logs but we also must switch statements, parsed integer data, test variables and more complex if statements to filter out undesired log entries. Logs that satisfy
 * our conditions are brought through to the print statement where they are properly formatted and fed back to the user. Our static scanner is used to allow user input
 * that specifies between dates, expenses or deposits and various transaction types against which our array data is tested against. A do while loop is enacted on our menu
 * and option methods which allow our user to select and view the results of multiple options without having to close and reopen the program. When Option Q is selected,
 * our boolean loop condition variable is initialized as false and a farewell statement is displayed to the user. In its complete form, this program should be able to view all logs,
 * add expense or deposit logs, view expense logs, view deposit logs, view logs of a paricular month, day, event and/or type without ever having to reopen the program or open the logs.txt file
 * @author Alexander Burgess
 * @version 4/22/2018
 */

//Name class
public class ASSIGNMENT03 {
	
	//Name and declare static scanner object
	static Scanner input = new Scanner(System.in);
	
	//Declaration and initialization of our global static parallel arrays of both the integer and string variety
	static String [] date = new String [142];
	static String [] type = new String [142];
	static String [] event = new String [142];
	static int [] amount = new int [142];
	static int [] balance = new int [142];
	
//Definition of the method that manifests our menu and returns the user's input, specifies a char return type
	public static char menu() {
	//Print statements that display menu options and their corresponding letter choices to the user
		System.out.println("Select one of the following options\n");
		System.out.println("A. Make a log");
		System.out.println("B. View all logs for my previous expenses");
		System.out.println("C. View all logs for deposits");
		System.out.println("D. View all logs for a particular month");
		System.out.println("E. View Customized logs for a particular month");
		System.out.println("F. View all logs for a particular day");
		System.out.println("G. View Customized logs for a particular day");
		System.out.println("H. View all logs for a particular previous expenses");
		System.out.println("I. View all logs for a particular previous deposits");
		System.out.println("J. View all logs till date");
		System.out.println("Q. Quit");
	
		//specifies that the char return value is the users string input converted into char input using conventional string methods 
		return input.next().charAt(0);
	}
	
	//Method called at the beginning of our main method that reads our .txt file into our five global parallel arrays 
	public static void readFile() throws IOException{
	//Name and declare our BufferedReader object, specifies source files to read from as our logs.txt file
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));

		
		//Declare and initialize line string variable as the first line
				String line = br.readLine();
//While loop whose testing condition is whether or not our line variable has just been initialized as a null line, i.e. the end of our logs
				while ( line != null) {
//For loop necessary to initialize array indexes completely parallel as it cycles through each deposit or expense log
					for(int i=0; i< 140; i++) {
			//Name and declare our string tokenizer object and the source of each of the tokens is our line variable		
					StringTokenizer st = new StringTokenizer(line);
		
			//Declaration and initialization of string and integer variable representing our date,type,event,amount,and balance fields
					//the loops cycle through each delimetered field and initializes each and every token for its corresponding category and variable
					String date1 = st.nextToken();
					String type1 = st.nextToken();
					String event1 = st.nextToken();
					int amount1 = Integer.parseInt(st.nextToken());
					int balance1 = Integer.parseInt(st.nextToken());
			
		//delimetered fields and values of the above variables are initialized as fields in each parallel array as the for loops cycles
					// and increments through each array index 
					date [i] = date1;
					
					type [i] = type1;
					
					event [i] = event1;
					
					amount [i] = amount1;
					
					balance [i] = balance1;
					
					
	}
		}
	}
	//Method definition for Option A
	public static void optionA() throws IOException {
//print statements representing menu and user choice of adding expense or deposit
		System.out.println("You chose to make a log. Please select one of the following option");
		System.out.println("1. Log an expense");
		System.out.println("2. Log a Deposit");
		
		//Declares and initializes char choice variable as the users string input converted into char input using conventional string methods 

		 char choice = input.next().charAt(0);
		 //if statement if user wants to add expense   
		    if (choice == '1') {
		    	
		      System.out.println("You chose to log an expense");
		     
		      FileWriter fileWriter =
		        
		    		  new FileWriter("logs.txt");
		        
		      BufferedWriter bufferedWriter =
		             
		        		  new BufferedWriter(fileWriter);	
		    } 
		  //if statement if user wants to add deposit  
		    else if (choice == '2') {
		     
		    	System.out.println("You chose to log a deposit");
		    	  
		    	FileWriter fileWriter =
		    	       
		    			   new FileWriter("logs.txt");
		    	       
		    	   BufferedWriter bufferedWriter =
		    	           
		    	        		new BufferedWriter(fileWriter);	
		    } 
		    
		    else {
		     
		    	System.out.println("Invalid Choice");
		    	
		    }
		
		
		System.out.println("Log Succesfully Added\n");
	}
//Method definition for option B which is intended to display all expense logs 
	public static void optionB() throws IOException {
//Print message informs user of their selection
		System.out.println("You chose to view all logs for expenses");
	//For loop conditioned to stop at the end of the logs, increments through each parallel array index	
		for(int i=0; i< 141; i++) {
		//If statement tests if the type for each log the for loop cycles through is an expense, if is, it is printed	
			if (type[i].equals("Expense")){
				//Print statement formatting data called from our parallel arrays and displaying back to the user 
				System.out.println(date[i] + " \t" + type[i] + " \t" + event[i] + " \t" + amount[i] + " \t" + balance[i]);
	}
		}
	}
	//Method definition for option C which is intended to display all Deposit logs 
	public static void optionC() throws IOException {
		//Print message informs user of their selection
		System.out.println("You chose to view all logs for deposits");
		//For loop conditioned to stop at the end of the logs, increments through each parallel array index
		for(int i=0; i< 141; i++) {
			//Print statement formatting data called from our parallel arrays and displaying back to the user 

			//If statement tests if the type for each log the for loop cycles through is a deposit, if is, it is printed	
			if (type[i].equals("Deposit")){
				//Print statement formatting data called from our parallel arrays and displaying back to the user 
				System.out.println(date[i] + " \t" + type[i] + " \t" + event[i] + " \t" + amount[i] + " \t" + balance[i]);
	}
}
	}
	//Method definition for Option D which displays all logs for a particular month 
	public static void optionD() throws IOException {
		//Print message informs user of their selection
		System.out.println("You chose to view all logs for particular month. Enter the month you would like to see (1-12)");
	//Declaration of the month variable and initializes its value as the user's input 	
		int month = input.nextInt();
		//For loop conditioned to stop at the end of the logs, increments through each parallel array index
		 for(int i=0; i< 141; i++) {
				//If statement tests if the month for each log the for loop cycles through is consistent with the user input, if is, it is printed	
				if (month == Integer.parseInt(date[i].substring(0, date[i].indexOf('/')))) {
					//Print statement formatting data called from our parallel arrays and displaying back to the user 
					System.out.println(date[i] + " \t" + type[i] + " \t" + event[i] + " \t" + amount[i] + " \t" + balance[i]);
	}
	}
	}
	//Method definition for option E which offers customized logs for a particular month
	public static void optionE() throws IOException {
		
	//Print statement informing the user of their choice
		 System.out.println("You chose to view customized logs for a particular month. Enter the month(1-12): ");
			//Declaration of the month variable and initializes its value as the user's input 	  
		 int month = input.nextInt();
		 //Print statements representing menu choices between expenses, deposits or both
		    System.out.println("");
		    System.out.println("Please select one of the following option");
		    System.out.println("1. View Expense");
		    System.out.println("2. View Deposit");
		    System.out.println("3. Both");
		  //Declaration of type variable to test our array data against
		    String typE = "";
		    //Declaration of event variable to test our array data against
		    String evenT = "";
		  //Beginning of our switch statement, revolving around the value of our user input
		    switch (input.nextInt()) {
		  //Case for expenses
		    case 1: 
		      //Initializes test variable as expense
		    	typE = "Expense";
		    	//Print statements representing menu and user choices 
		      System.out.println("Please select which Expense you want to see for the particular month");
		      System.out.println("1. Food");
		      System.out.println("2. Entertainment");
		      System.out.println("3. Academic");
		      System.out.println("4. Other");
		      System.out.println("5. All");
		      
		      //Beginning of second switch statement, revolving around the value of our user input
		      switch (input.nextInt())
		      
		      {
		    //Case for food expenses
		      case 1: 
		    	  //initializes test variable as food
		        evenT = "Food";
		        break;
		    //Case for entertainment expenses 
		      case 2: 
		    	  //intializes test variable as entertainment
		        evenT = "Entertainment";
		        break;
		   //Case for academic expenses   
		      case 3: 
		     //initializes test variable as academic
		    	  evenT = "Academic";
		        break;
		    //Case for other expenses 
		      case 4: 
		      //Initializes test variable as other 
		    	  evenT = "Other";
		        break;
		   //Case for all expenses
		      case 5: 
		        //Initializes test variable as whitespace character so all logs are encompassed
		    	  evenT = "";
		      }
		      
		      break;
		
		      //Case for expenses
		    case 2: 
		  //Initializes test variable as Deposit     
		    typE = "Deposit";
		     //Print statements representing menu of choices and deposit types 
		      System.out.println("Please select which Expense you want to see for the particular month");
		      System.out.println("1. Salary");
		      System.out.println("2. Dad_Sent_Some");
		      System.out.println("3. Tutoring");
		      System.out.println("4. All");
		     //Beginning of switch statement focused on our user input 
		      switch (input.nextInt())
		     
		      {
		     //Case for salary deposits
		      case 1: 
		    	  //intializes test variable as salary
		        evenT = "Salary";
		        break;
		     //Case for Dad_Sent_Some deposits
		      case 2: 
		    	  //initializes test variable as Dad_Sent_Some
		        evenT = "Dad_Sent_Some";
		        break;
		     //Case for Tutoring deposits
		      case 3: 
		    	  //initializes the test variable as tutoring
		        evenT = "Tutoring";
		        break;
		     //Case for all deposits 
		      case 4: 
		      //initializes the test variable as a whitespace character so all events are encompassed  
		    	  evenT = "";
		      }
		      
		      break;
		   //Case for all logs
		    case 3: 
		    	//initializes test variables as whitespace characters so all types and events are encompassed 
		      typE = "";
		      evenT = "";
		    }
			//For loop conditioned to stop at the end of the logs, increments through each parallel array index
		    for(int i=0; i< 141; i++) {
		   //If statement that tests the type and event of each log against the type and events specfied by user input into our test variables, we also search the logs for dates consistent with our parsed user data
		    	//if conditions are satisfied, the log is printed 
		    	if ((type[i].contains(typE)) && (event[i].contains(evenT)) && (month == Integer.parseInt(date[i].substring(0, date[i].indexOf('/'))))) {   
					//Print statement formatting data called from our parallel arrays and displaying back to the user 
		    	System.out.println(date[i] + " \t" + type[i] + " \t" + event[i] + " \t" + amount[i] + " \t" + balance[i]);
	}
		    }
	}

	public static void optionF() throws IOException {
		//Print statement prompts user for the month of the desired logs
		System.out.println("You chose to view all logs for a particular month and day. Enter the month you would like to see (1-12)");
		//Declares integer month variable and initializes the value as the user's input data
		int month = input.nextInt();		
		//Print statement prompts user for the day of the desired logs 
		System.out.println("Enter the Day (1-31): ");		
		//Declares integer day variable and initializes the value as the user's input data
		int day = input.nextInt();
		//For loop conditioned to stop at the end of the logs, increments through each parallel array index
		 for(int i=0; i< 141; i++) {
				//If statement test our data against our test variables and the parsed integer data representing our dates
		    	if ((day == Integer.parseInt(date[i].substring(0, date[i].indexOf('/')))) && (month ==  Integer.parseInt(date[i].substring(date[i].indexOf('/') + 1, date[i].indexOf('/', date[i].indexOf(47) + 1))))) {
					//Print statement formatting data called from our parallel arrays and displaying back to the user 
		    		System.out.println(date[i] + " " + type[i] + " " + event[i] + " " + amount[i] + " " + balance[i]);

		}
	}
	}

	public static void optionG() throws IOException {
		//Print statement prompts user for the month of the desired logs
		System.out.println("You chose to view customized logs for a particular month and day. Enter the month: ");
		//Declares integer month variable and initializes the value as the user's input data
		int month = input.nextInt();
		//Print statement prompts user for the day of the desired logs 
		 System.out.println("Enter the Day (1-31): ");
			//Declares integer day variable and initializes the value as the user's input data
		 int day = input.nextInt();
	    
	    //Print statement representing menu and user deposit or expense choices 	
	    	 System.out.println("Please select one of the following option");
			    System.out.println("1. View Expense");
			    System.out.println("2. View Deposit");
			    //Declaration of type variable to test our array data against
			    String typE = "";
			    //Declaration of event variable to test our array data against
			    String evenT = "";
			  //Beginning of our switch statement, revolving around the value of our user input
			    switch (input.nextInt()) {
			  //Case for expenses
			    case 1: 
			      //Initializes test variable as expense
			    	typE = "Expense";
			    	//Print statements representing menu and user choices 
			      System.out.println("Please select which Expense you want to see for the particular month");
			      System.out.println("1. Food");
			      System.out.println("2. Entertainment");
			      System.out.println("3. Academic");
			      System.out.println("4. Other");
			      System.out.println("5. All");
			      
			      //Beginning of second switch statement, revolving around the value of our user input
			      switch (input.nextInt())
			      
			      {
			    //Case for food expenses
			      case 1: 
			    	  //initializes test variable as food
			        evenT = "Food";
			        break;
			    //Case for entertainment expenses 
			      case 2: 
			    	  //intializes test variable as entertainment
			        evenT = "Entertainment";
			        break;
			   //Case for academic expenses   
			      case 3: 
			     //initializes test variable as academic
			    	  evenT = "Academic";
			        break;
			    //Case for other expenses 
			      case 4: 
			      //Initializes test variable as other 
			    	  evenT = "Other";
			        break;
			   //Case for all expenses
			      case 5: 
			        //Initializes test variable as whitespace character so all logs are encompassed
			    	  evenT = "";
			      }
			      
			      break;
			
			      //Case for expenses
			    case 2: 
			  //Initializes test variable as Deposit     
			    typE = "Deposit";
			     //Print statements representing menu of choices and deposit types 
			      System.out.println("Please select which Expense you want to see for the particular month");
			      System.out.println("1. Salary");
			      System.out.println("2. Dad_Sent_Some");
			      System.out.println("3. Tutoring");
			      System.out.println("4. All");
			     //Beginning of switch statement focused on our user input 
			      switch (input.nextInt())
			     
			      {
			     //Case for salary deposits
			      case 1: 
			    	  //intializes test variable as salary
			        evenT = "Salary";
			        break;
			     //Case for Dad_Sent_Some deposits
			      case 2: 
			    	  //initializes test variable as Dad_Sent_Some
			        evenT = "Dad_Sent_Some";
			        break;
			     //Case for Tutoring deposits
			      case 3: 
			    	  //initializes the test variable as tutoring
			        evenT = "Tutoring";
			        break;
			     //Case for all deposits 
			      case 4: 
			      //initializes the test variable as a whitespace character so all events are encompassed  
			    	  evenT = "";
			      }
			      
			      break;
			   //Case for all logs
			    case 3: 
			    	//initializes test variables as whitespace characters so all types and events are encompassed 
			      typE = "";
			      evenT = "";
			    }
				//For loop conditioned to stop at the end of the logs, increments through each parallel array index
			    for(int i=0; i< 141; i++) {
					//If statement test our data against our test variables and the parsed integer data representing our dates
			    	if ((day == Integer.parseInt(date[i].substring(0, date[i].indexOf('/')))) && (type[i].contains(typE)) && (event[i].contains(evenT)) && (month ==  Integer.parseInt(date[i].substring(date[i].indexOf('/') + 1, date[i].indexOf('/', date[i].indexOf(47) + 1))))) {
						//Print statement formatting data called from our parallel arrays and displaying back to the user 
	    		System.out.println(date[i] + " " + type[i] + " " + event[i] + " " + amount[i] + " " + balance[i]);

	}
	    }
	}
//Method definition for option H which allows you to view all logs of a particular expense 
	public static void optionH() throws IOException {
	//Print statements representing the menu and user expense choices
		System.out.println("You chose to view all logs for a particular Expense. Please select one of the following option");
		System.out.println("1. Food");
		System.out.println("2. Entertainment");
		System.out.println("3. Academic");
		System.out.println("4. Other");
	//Declare and initialize test variable for our expense type	
		String evenT = "";
	//Beginning of switch statement revolving around the value of the user input 	    
		switch (input.nextInt())
		    {
		    //Case for food expenses
		    case 1: 
		     //initializes test variable as food
		    	evenT = "Food";
		      
		      break;
		   //Case for entertainment expenses
		    case 2: 
		   //initializes test variable as entertainment
		    	evenT = "Entertainment";
		      
		      break;
		  //Case for academic expenses 
		    case 3: 
	   	 //initializes test variable as	academic
		    	evenT = "Academic";
		      
		      break;
		  //Case for other expenses
		    case 4: 
		  //initializes test variable as other
		    	evenT = "Other";
		      
		    }
		//For loop conditioned to stop at the end of the logs, increments through each parallel array index
		    for(int i=0; i< 141; i++) {
		//If statement tests the event type of each of our logs against the event type specified by user input and our test variable
		    	//if conditions are met, the log is printed 
		    	if (event[i].equals(evenT) && type[i].equals("Deposit")) {
					//Print statement formatting data called from our parallel arrays and displaying back to the user 
		    		System.out.println(date[i] + " " + type[i] + " " + event[i] + " " + amount[i] + " " + balance[i]);
	}
		    }
	}
//Method definition for option I which allows the user to search for deposits of a particular event
	public static void optionI() throws IOException {
	//Print statements representing menu and user choices of deposits 
		System.out.println("You chose to view all logs for a particular Deposit. Please select one of the following option");
		System.out.println("1. Salary");
		System.out.println("2. Dad_Sent_Some");
		System.out.println("3. Tutoring");
	//Declare and initialize event test variable 	 
		String evenT = "";
		//beginning of switch statement revolving around the value of our user input    
		switch (input.nextInt())
		    {
		    //Case for salary deposits
		    case 1: 
		    //initializes test variable as salary
		      evenT = "Salary";
		      break;
		     //Case for dad sent some deposits 
		    case 2: 
			 //initializes test variable as dad sent some
		    	evenT = "Dad_Sent_Some";
		      break;
		  //Case for tutoring deposits    
		    case 3: 
		 //initializes test variable as tutoring
		    	evenT = "Tutoring";
		      
		    }
		//For loop conditioned to stop at the end of the logs, increments through each parallel array index
		    for(int i=0; i< 141; i++) {
		//If statement checks the logs event against our test variable and tests whether the type is a deposit
		    	//if conditions are satisfied, the log is printed
		    	if (event[i].equals(evenT) && type[i].equals("Deposit")) {
		//Print statement formatting data called from our parallel arrays and displaying back to the user 
		    	System.out.println(date[i] + " " + type[i] + " " + event[i] + " " + amount[i] + " " + balance[i]);
	}
		    }
	}

	
	public static void optionJ() throws IOException {

		//A BufferedReader object is used to read an existing file in the project.
		//Make sure that the log.txt file is in the Java Project Folder.
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));

		//br.readLine() reads the first line from the BufferedReader, assigns it to String line and then deletes it.
		//This way, we can reach the 2nd line or the nth line by writing br.readLine(); two times or n times.
		String line = br.readLine();

		//to write a code that reach end of file (n lines)
		//we say that while line has some string in it. Once at an end, br.readLine returns null if all lines are finished.
		while (line != null) {

			//String Tokenizer is something that is used to seperate words in a line based on a delimeter
			//Default delimeter is space and our log.txt file is space delimetered file for each line.
			StringTokenizer st = new StringTokenizer(line);

			//Since we know that each line has 5 elements to it, we can use that information and assign those 5 strings (Tokens)
			//And now we have individual Access to data, ie. we can now see the particular line and see the date, type, event, etc and use it for comparison.
			String date = st.nextToken();
			String type = st.nextToken();
			String event = st.nextToken();
			int amount = Integer.parseInt(st.nextToken());
			int balance = Integer.parseInt(st.nextToken());

			//This line will be simply printing out the give string. we use \t to make it in a better Format.
			System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);

			//In order to not repeat the process for the same line, we use br.readLine at the end of loop to make sure that it has a next line
			//and to assign that new line to the variable line and repeat the same process until its value reaches to null.
			line = br.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to your daily expense table OUO");

		//readFile method is called and our log data is cycled through and initialized into our parallel arrays 
		readFile();
	//the variable that allows our loop to start and stop is declared and initialized as true 	
		   boolean loop = true;
		//Do while loop body; the following should be executed given the condition is satisfied 
		    do {
		   //Char variable for user choice is initialized with the value returned by the menu method (user choice input)
		      char choice = menu();
		//Beginning of switch statement revolving around the value of the choice variable 
		switch (choice) {
//Case for Option A
		case 'A':
	//Calls method for option A
			optionA();
			break;  
//Case for Option B		
		case 'B':
			//Calls method for option B
			optionB();
			break;
//Case for Option C	
		case 'C':
			//Calls method for option C
			optionC();
			break;
//Case for Option D	
		case 'D':
			//Calls method for option D
			optionD();
			break;
//Case for Option E
		case 'E':
			//Calls method for option E
			optionE();
			break;
//Case for Option F	
		case 'F':
			//Calls method for option F
			optionF();
			break;
//Case for Option G
		case 'G':
			//Calls method for option G
			optionG();
			break;
//Case for Option H
		case 'H':
			//Calls method for option H
			optionH();
			break;
//Case for Option I
		case 'I':
			//Calls method for option I
			optionI();
			break;
//Case for Option J
		case 'J':
			//Calls method for option J
			optionJ();
			break;
//Case for Option Q
		case 'Q':
			//Prints goodbye statement to user
			System.out.println("GoodBye :)");
			//sets loop variable to false, essentially ending the menu loop and terminating the program
			 loop = false;
			break;
	//Default case, enacted when invalid input is provided		
		default:
			//Print statement informs user of invalid input
			System.out.println("Invalid Option :(");
			
		  }
	      //While loop, with condition set to our loop variable being equal to true
		    } while (loop);
		    
		  }
		}	
