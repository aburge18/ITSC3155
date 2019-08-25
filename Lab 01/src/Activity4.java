/*
 * @author Alexander Burgess
 * @version 1/25/17
 * Description: This program is intended to convert the runners 14 kilometer time of 45 minutes and 30 seconds to an
 * average speed in miles per hour. 
 * Pseudocode: [Steps of the program]
 * Class is named
 * Kilometer, and Minutes variables are declared
 * Kilometer and Minutes variables are used to declare and initialize the miles and hours variables
 * Miles and hours variables are used to declare and initialize the mph variable
 * Message is displayed and requires the mph variable to be invoked and printed
 */
public class Activity4 {
	public static void main(String[] args){
		int km = 14;
		double minutes = 45.5;
		double miles = km/1.6;
		double hours = minutes/60;
		double mph = miles/hours;
	System.out.println("The runner's average speed in miles per hour is" +mph);
	}
	}