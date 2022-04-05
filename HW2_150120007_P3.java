import java.util.Scanner;
public class HW2_150120007_P3 {

	public static void main(String[] args) {
		// Author: Mustafa Emir Uyar / Student ID: 150120007

		//This program calculates the tax value of year you wanted such as 2020, 2019, 2018, 2017 and displays your income, tax amount, income after tax and real tax rate 
		
		
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Get year and income from user
		int year = Integer.parseInt(input.next());
		double income = Double.parseDouble(input.next());

		//Throw a error if input is invalid 
		if(year < 2017 || year>2020)
			System.out.println("Undefined year value");
		else if(income<=0)
			System.out.println("Income must be > 0");
		else {
			
		//Get the tax values from table
			int previousTax = 0;
			int previousIncome = 0;
			int taxRate = 0;
			
			switch(year) {
			case 2017:
				if(income<13000) {
					previousTax=0;
					previousIncome=0;
					taxRate=15;
				}
				else if(income<30000) {
					previousTax=1950;
					previousIncome=13000;
					taxRate=20;
				}
				else if(income<110000) {
					previousTax=5350;
					previousIncome=30000;
					taxRate=27;
				}
				else {
					previousTax=26950;
					previousIncome=110000;
					taxRate=35;
				}break;
			case 2018:
				if(income<14000) {
					previousTax=0;
					previousIncome=0;
					taxRate=15;
				}
				else if(income<34000) {
					previousTax=2220;
					previousIncome=14000;
					taxRate=20;
				}
				else if(income<120000) {
					previousTax=6060;
					previousIncome=34000;
					taxRate=27;
				}
				else {
					previousTax=29280;
					previousIncome=120000;
					taxRate=35;
				}break;
			case 2019:
				if(income<18000) {
					previousTax=0;
					previousIncome=0;
					taxRate=15;
				}
				else if(income<40000) {
					previousTax=2700;
					previousIncome=18000;
					taxRate=20;
				}
				else if(income<148000) {
					previousTax=7100;
					previousIncome=40000;
					taxRate=27;
				}else if(income<500000) {
					previousTax=36260;
					previousIncome=148000;
					taxRate=35;
				}
				else {
					previousTax=159460;
					previousIncome=500000;
					taxRate=40;
				}break;
			case 2020:
				if(income<22000) {
					previousTax=0;
					previousIncome=0;
					taxRate=15;
				}
				else if(income<49000) {
					previousTax=3300;
					previousIncome=22000;
					taxRate=20;
				}
				else if(income<180000) {
					previousTax=8700;
					previousIncome=49000;
					taxRate=27;
				}else if(income<600000) {
					previousTax=44070;
					previousIncome=180000;
					taxRate=35;
				}
				else {
					previousTax=191070;
					previousIncome=600000;
					taxRate=40;
				}break;
			
			
			}
			
			//Calculate the tax, income after tax and real tax rate
			double tax = previousTax+(income-previousIncome)*(taxRate/100.0);
			double incomeAfterTax = (int)((income-tax)*100)/100.0;
			double realTaxRate = (int)(tax*10000/income)/100.0;
			tax = (int)(tax*100)/100.0;
			
			//Display the results
			System.out.println("Income: "+income);
			System.out.println("Tax amount: "+tax);
			System.out.println("Income after tax: "+incomeAfterTax);
			System.out.println("Real tax rate: "+realTaxRate+"%");
			
			
			
		}
	}
}
