package ie.atu.dip; // This is a package to store our java program.

import java.util.*; //We need to import java.util.* to allow us take receive inputs at the keyboard

//Our Collatz class which will be called to implement the Series
public class Collatz {
	//Our instance variables, required for smooth operation of the instance of the class
	private Scanner s;
	private int number;
	
	//Our constructor which is called to implement the instance of the class
	public Collatz() {
		s = new Scanner(System.in); //When called the instance of the class will implement a scanner object
	}

	//Our method to calculate the Collatz seriess
	public void seriesCalculation() {
		System.out.println("#####################################");
		System.out.println("######     Collatz Series      ######");
		System.out.println("#####################################");
		System.out.println("This program caluclates the collatz" );
		System.out.println("series for a given number which the" );
		System.out.println("user inputs, which should be positive");
		//Ask the user for the first number in the series
		System.out.println("Please enter a positive number");
		//parse this into an integer
		number = Integer.parseInt(s.next());
		//If you don't enter a positive number the series may not work, as there is three paths for negitive numbers
		//but only one path for positive numbers (The 8/4/2/1 path has being found to be true for all knonw positive numbers)
		if(number < 0) {
			System.out.println("That is not a positive number, please try again: "); //Ask for a positive number again
			//parse it as before
			number = Integer.parseInt(s.next()); 
			
		}
		//print it out as the first number of our series
		System.out.println(number);
		
		//While we have not reached 1, the last number in our series
		while (number !=1) {
			//If the number is even divide it by two
			if((number % 2) == 0) {
				number = (number/2);
				System.out.println(number);
			//If number is not even then it is odd, multiply it by 3 and add one
			}else {
				number = ((number * 3) +1);
				System.out.println(number);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Collatz col = new Collatz();
		col.seriesCalculation();
	}
	

}
