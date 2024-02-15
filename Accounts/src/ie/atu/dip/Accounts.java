/* Question: Write a program called accounts.java that reads in a 10 character number and outputs
 * the account number with only the last 4 digits showing (and the  first 6 digits replaced with "x").
 */

/*
 * Author: Michael Curley.
 */

package ie.atu.dip;

import java.util.*;

public class Accounts {

	private Scanner s;
	private String accountNumber;
	private String slicedAccountNumber;
	private String result = "";
	private String hideFront = "";
	private int lengthOfAccount;
	
	
	public Accounts() {
		s = new Scanner(System.in);
	}
	
	
	public void hideNumber() {
		//Prompt user to enter their account number
		System.out.println("Please enter your account number: ");
		//Assign this to the string accountNumber
		accountNumber = s.next();
		
		//Find the length of this string
		lengthOfAccount = accountNumber.length();
		
		//Account number should be a minimum of 10 characters long
		while (lengthOfAccount < 10) {
			//If its not 10 characters long tell the user 
			System.out.println("That account number is less than 10 numbers");
			//And ask for account number to be re-entered
			System.out.println("Please re-enter your account number: ");
			accountNumber = s.next();
			lengthOfAccount = accountNumber.length();

		}
		//Take the last 4 digits of your accountNumber 
		slicedAccountNumber = accountNumber.substring(lengthOfAccount-4, lengthOfAccount);
		
		//Generate the hidden string
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<lengthOfAccount-4; i++) {
			sb.append("x");
			hideFront = sb.toString(); // Add this to our hideFront 
		}
		
		result = hideFront + slicedAccountNumber; // result is a string concat of both hideFront and slicedAccountNumber
		System.out.println(result); //Print this.
		
	}
	
	public static void main(String[] args) {
		Accounts acc = new Accounts();
		acc.hideNumber();
	}

}
