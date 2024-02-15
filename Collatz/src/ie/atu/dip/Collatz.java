package ie.atu.dip;

import java.util.*;

public class Collatz {
	
	private Scanner s;
	private int number;
	
	
	public Collatz() {
		s = new Scanner(System.in);
	}
	
	public void seriesCalculation() {
		System.out.println("###################################");
		System.out.println("######    Collatz Series     ######");
		System.out.println("###################################");
		System.out.println("This program caluclates the collatz");
		System.out.println("series for a given number which the");
		System.out.println("user inputs, which should be positive");
		
		System.out.println("Please enter a positive number");
		
		number = Integer.parseInt(s.next());
		
		if(number < 0) {
			System.out.println("That is not a positive number, please try again: ");
			number = Integer.parseInt(s.next());
			
		}
		
		System.out.println(number);
		
		while (number !=1) {
			if((number % 2) == 0) {
				number = (number/2);
				System.out.println(number);
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
