/**
 * @author Alexander Burgess
 * @version 1/31/18
 *  ID:ID001
 *  Description: Use the value invoked by the System.currentTimeMillis() to calculate the current
 *  time in Greenwich Mean Time (GMT)
 *  Case study 2.12 Displays the current time using the System.currentTimeMillis()
 */

public class CaseStudy12 {
	public static void main(String[] args){
		long milliseconds = System.currentTimeMillis();
		long seconds = milliseconds/1000;
		long minutes = seconds/60;
		long hours = minutes/60;
		long currentSec = seconds%60;
		long currentMin = minutes%60;
		long currentHour = hours%24;
			System.out.println("The current time is" + currentHour + ":" +currentMin + ":" + currentSec + "GMT");
}
}