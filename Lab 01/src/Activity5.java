/*
 * @author Alexander Burgess
 * @version 1/25/17
 * Description: This program is intended to convert the runners 14 kilometer time of 45 minutes and 30 seconds to an
 * average speed in miles per hour. 
 * Pseudocode: [Steps of the program]
 * Class is named.
 * population, and year variables are declared.
 * year variable and given birth, death and immigration data are used to declare and initialize the deaths, births and immigrants
 * and hours variables.
 * year, death, births, and immigrants variables are used to declare and initialize PopChange
 * Message is displayed and requires the population and PopChange variables to be invoked and used to calculate five individual
 * outputs, one for each population estimate after each of the five years
 */
public class Activity5{
		public static void main(String[] args){
	double population = 312032468;
	double year = 31536000;
	double births = year/7;
	double deaths = year/13;
	double immigrants = year/45;
	double PopChange = births-deaths+immigrants;
	System.out.println("The population after 1 year is"+ (population+PopChange) );
	System.out.println("The population after 2 years is"+ (population+(2*PopChange)) );
	System.out.println("The population after 3 years is"+ (population+(3*PopChange)) );
	System.out.println("The population after 4 years is"+ (population+(4*PopChange)) );
	System.out.println("The population after 5 years is"+ (population+(5*PopChange)) );
}
}