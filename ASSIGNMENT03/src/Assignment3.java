import java.io.*;
import java.text.*;
import java.util.*;

/**
 * Write a really good Description on how you understand this algorithm. The Description should briefly describe
 * on how the program is running to what it should do.
 *
 * @author Very smart TA
 * @version 4/2/2018
 */
public class Assignment3 {

	//You can use a static scanner if you want or you can declare scanner in individual methods.
	//Static Scanner is beneficial as it will save you time in declaring the Scanner again and again
	//You can also use your static String arrays or ArrayLists here. 
	//Using them here will make them "global" variables which means you can use these arrays anywhere in your code!

	public static char menu() {
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

		//Write code that will return the user choice instead of Q
		return 'Q';
	}
	
	/**
	 * @description: This method reads in the file logs.txt and loops through every line in the file.
	 * It stores each date in the date String array/ArrayList, as well as each transaction type,
	 * category, amount and updated balance into a new separate array/ArrayList. You will be using these arrays/ArrayLists as parallel arrays.
	 * Hint: use option J for reference!
	 */
	public static void readFile() throws IOException{
				
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));

				String line = br.readLine();

				while (line != null) {

					StringTokenizer st = new StringTokenizer(line);

					
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
	}

	public static void optionA() throws IOException {

		System.out.println("You chose to make a log. Please select one of the following option");
		System.out.println("1. Log an expense");
		System.out.println("2. Log a Deposit");
	
		
        FileWriter fileWriter =
            new FileWriter("logs.txt");
        BufferedWriter bufferedWriter =
            new BufferedWriter(fileWriter);	
		
		System.out.println("Log Succesfully Added\n");
	}

	public static void optionB() throws IOException {

		System.out.println("You chose to view all logs for expenses");
		//Write code for Option B here
	}

	public static void optionC() throws IOException {

		System.out.println("You chose to view all logs for deposits");
		//Write code for Option C here
	}

	public static void optionD() throws IOException {

		System.out.println("You chose to view all logs for particular month. Enter the month you would like to see (1-12)");
		//Write code for Option D here
	}

	public static void optionE() throws IOException {
		System.out.println("You chose to view customized logs for a particular month. Enter the month: ");
		//Write code for Option E here

	}

	public static void optionF() throws IOException {
		System.out.println("You chose to view all logs for particular month. Enter the month you would like to see (1-12)");
		//Take the user input for month
		System.out.println("You chose to view all logs for particular month. Enter the month you would like to see (1-31)");
		//Take the user input for day

		//Write code for Option F here
	}

	public static void optionG() throws IOException {
		System.out.println("You chose to view customized logs for a particular month. Enter the month: ");
		//Take the user input for month
		System.out.println("Enter the Day (1-31): ");
		//Take the user input for day

		//Write code for Option F here

	}

	public static void optionH() throws IOException {
		System.out.println("You chose to view all logs for a particular Expense. Please select one of the following option");
		System.out.println("1. Food");
		System.out.println("2. Entertainment");
		System.out.println("3. Academic");
		System.out.println("4. Other");
		//Take the user choice

		//Write the code for Option H
	}

	public static void optionI() throws IOException {
		System.out.println("You chose to view all logs for a particular Deposit. Please select one of the following option");
		System.out.println("1. Salary");
		System.out.println("2. Dad_Sent_Some");
		System.out.println("3. Tutoring");
		//Take the user choice

		//Write the code for Option I

	}

	/**
	 * This Is the only method given to you. Use this method to understand.
	 * You can copy paste code from this method to any other methods.
	 * However, if you do copy, make sure that you have necessary tweaks / addition / changes to the code
	 * based on what the option wants.
	 *
	 * Hint : All the methods in some way is going to use this code given in OptionJ method. By using
	 * proper conditional statements and user input and proper calculations, correct results for display can be obtained.
	 *
	 * @throws IOException
	 */
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

		//Add a suitable looping for this menu. It can be While / Do-while / for loops.
		//The menu should loop every time after the option execution is over until the user selects Q
		// Don't forget to re-read the file every time a new loop comes around :)
		char choice = menu();
		 while (choice != Q) {
		switch (choice) {

		case 'A':
			optionA();
			break;
		case 'B':
			optionB();
			break;
		case 'C':
			optionC();
			break;
		case 'D':
			optionD();
			break;
		case 'E':
			optionE();
			break;
		case 'F':
			optionF();
			break;
		case 'G':
			optionG();
			break;
		case 'H':
			optionH();
			break;
		case 'I':
			optionI();
			break;
		case 'J':
			optionJ();
			break;
		case 'Q':
			System.out.println("GoodBye :)");

			break;
		default:
			System.out.println("Invalid Option :(");
		}
  }


	}
}
