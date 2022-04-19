import java.util.Scanner;
public class HW2_150120007_P1 {
	public static void main(String[] args) {
		// Author: Mustafa Emir Uyar / Student ID: 150120007
		
		//This program takes first 9 digit of a ISBN 10 number and finds the given ISBN-10 number's last digit

		//Create a Scanner
		Scanner input = new Scanner (System.in);
		System.out.println("hello");
		//Get input from the user
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int userInput = input.nextInt();
		
		//Declare variables for while loop and result
		int checkSum = 0;
		int digitState = 1;
		String result ="";
		
		//Get digits, add them to the result (this is my solution for leading zeros) and calculate checkSum with given formula
		while(digitState<=9) {
			int divisior = (int) Math.pow(10, 9-digitState);
			int currentDigit = userInput/divisior;
			result+=currentDigit;
			checkSum+=currentDigit*(digitState);
			userInput%=divisior;
			digitState++;
		}
		checkSum%=11;
		System.out.println();
		
		//Convert 10 to X and add the last digit to the result
		if(checkSum == 10)
			result+="X";
		else
			result+=checkSum;
		
		//Show the result
		System.out.println("The ISBN-10 number is "+ result);
	}

}
