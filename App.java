package com.dagnachew.assignment1;

import java.math.*;

public class App {

	public static void main(String[] args) {

		BigDecimal avocadoPrice = new BigDecimal("2.99");

		BigDecimal bananaPrice = new BigDecimal("0.69");

		BigDecimal walletMoneyCash = new BigDecimal("150.00");

		BigDecimal walletMoneyCheck = new BigDecimal("1000.00");

		int numberOfTomsFriends = 60; // initial number of friends was 7 but to make sense for the calculation later
										// updated to 60

		int numberOfSarasFriends = 10;

		int tomsAgeInYears = 30;

		int sarasAgeInYears = 25;

		String buyersFirstName = "Thomas";

		String sellersFirstName = "Richard";

		String buyersLastName = "Brown";

		String sellersLastName = "Eyoel";

		char buyersMiddleInitial = 'N';

		char sellersMiddleInitial = 'S';

		BigDecimal walletMoneyAfterShopping4Avocado = walletMoneyCash
				.subtract(avocadoPrice.multiply(new BigDecimal(4)));

		int averageNumberOfFriendsTomMadePerYear = numberOfTomsFriends / tomsAgeInYears;

		String buyersFullName = buyersFirstName + ' ' + buyersMiddleInitial + '.' + ' ' + buyersLastName;

		System.out.println("The price of each avocado is: " + "$" + avocadoPrice);

		System.out.println("The price of banana per pound is: " + "$" + bananaPrice);

		System.out.println("Wallet cash balance is: " + "$" + walletMoneyCash);

		System.out.println("Wallet check balance is: " + "$" + walletMoneyCheck);

		System.out.println("Tom has got " + numberOfTomsFriends + " friends.");

		System.out.println("Sara has got " + numberOfSarasFriends + " friends.");

		System.out.println("Tom is " + tomsAgeInYears + " years old.");

		System.out.println("Sara is " + sarasAgeInYears + " years old.");

		System.out.println("Buyer's First Name is: " + buyersFirstName);

		System.out.println("Seller's First Name is: " + sellersFirstName);

		System.out.println("Buyer's Last Name is: " + buyersLastName);

		System.out.println("Seller's Last Name is: " + sellersLastName);

		System.out.println("Seller's Middle Initial is: " + sellersMiddleInitial);

		System.out.println("Buyer's Middle Initial is: " + buyersMiddleInitial);

		System.out.println(
				"My wallet cash balance after shopping for 4 avocado is " + "$" + walletMoneyAfterShopping4Avocado);

		System.out.println("In average Tom has made " + averageNumberOfFriendsTomMadePerYear + " friends per year.");

		System.out.println("Buyer's Full Name is: " + buyersFullName);

	}

}
