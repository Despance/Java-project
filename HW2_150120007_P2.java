import java.util.*;
public class HW2_150120007_P2 {
	public static void main(String[] args) {
		// Author: Mustafa Emir Uyar / Student ID: 150120007
		
		//This program converts the given date to day of the week with Zeller’s congruence formula
		
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Get the year, month and day from user
		System.out.print("Enter year (e.g 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month (e.g 1-12): ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month (e.g 1-31): ");
		int day = input.nextInt();
		
		//Convert January and February 
		if(month==1 || month == 2) {
			month+=12;
			year--;
		}
		
		//Calculate the day of the week with given formula
		int century = year/100;
		int yearOfCentury= year%100;
		int dayOfWeek = (day+((26*(month+1))/10)+yearOfCentury+yearOfCentury/4+century/4+5*century)%7;
		
		//Display the day
		String result;
		
		switch(dayOfWeek) {
		case 0:
			result = "Saturday";
			break;
		case 1:
			result = "Sunday";
			break;
		case 2:
			result = "Monday";
			break;
		case 3:
			result = "Tuesday";
			break;
		case 4:
			result = "Wednesday";
			break;
		case 5:
			result = "Thursday";
			break;
		case 6:
			result = "Friday";
			break;
		default:
			result = "Error";
		}
		System.out.println("Day of the week is "+result);
		
		
		
	}

}
