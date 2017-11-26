package edu.vtc.cis2271.miki;

import java.util.Scanner;

public class Lab_3_corn {

	public static void main(String[] args) {
		System.out.print("How many ears of corn do you want to buy: ");
		Scanner in = new Scanner(System.in);
		double price;
		double cost;
		
		if (in.hasNextInt()) {
			int num = in.nextInt();
			if (num < 12) {
				price = 0.50;

			}

			else if (num <= 23) {
				price = .45;
			} else if (num <= 35) {
				price = .40;
			} else {
				price = .35;
			}
			cost = price * num;
			

			System.out.printf("Your total cost  is %.2f", cost);
		}
		in.close();

	}
}

