package AlannaBotscharowChapter3Program5;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 10/18
 * Average acceleration
 */
public class Chapter3Program5 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		//Prompt the user to enter starting velocity
			//v0 (meters per second)		
				//input
		
		System.out.println("Please enter the starting velocity: ");
			double v0 = input.nextDouble(); 
		
		//Prompt the user to enter ending velocity
			//v1 (meters per second)
				//input
			
		System.out.println("Please enter the ending velocity: ");
		double v1 = input.nextDouble(); 
		
		//Prompt the user to enter time span 
			//t (seconds)
				//input
		
		System.out.println("Please enter the time span: ");
		double t = input.nextDouble(); 
		
		//Calculate the average acceleration
			//a = (v1 - v0) / t 
		
		double a = (v1 - v0) / t; 
		
		//Display the average acceleration
		
		System.out.println("The average acceleration is: "+a);
		

	}

}
