package compound;

import java.util.Scanner;

public class Interest_Main extends CompoudInterest {

public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the Principal Amount, Rate Of Interest, Time Duration ");

		int principal = scan.nextInt();          

		int rate_of_interest = scan.nextInt();   

		int time = scan.nextInt();               

		System.out.println(" Simple Interest Value for the given details be ");

		SimpleInterest(principal, rate_of_interest, time);

		System.out.println(" Compound Interest Value for the given details be ");

	    CompoudInterest(principal, rate_of_interest, time);

       	}

}
