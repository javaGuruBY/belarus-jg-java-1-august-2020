package com.javaguru.student_vladimir_petranovski.lesson_15.level_6.videostore;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private final String name;
	private final List<Rental> rentals = new ArrayList<>();

	public Customer (String name) {
		this.name = name;
	}

	public String getName () {
		return name;
	}

     public void addRental (Rental rental) {
		rentals.add(rental);
	}

	public String statement () {
		double 				totalAmount 			= 0;
		int					frequentRenterPoints 	= 0;
		String 				result 					= "Rental Record for " + getName () + "\n";

		for (Rental rental: rentals) {
		result += "\t" + rental.getMovie().getTitle() + "\t"
					+ String.valueOf (dependencyOwedOnDaysRented(rental)) + "\n";
			totalAmount += dependencyOwedOnDaysRented(rental);
			frequentRenterPoints = findAmountFrequentRenterPoints(frequentRenterPoints, rental);
		}

		result += "You owed " + String.valueOf (totalAmount) + "\n";
		return result += "You earned " + String.valueOf (frequentRenterPoints) + " frequent renter points\n";
	}

	private double dependencyOwedOnDaysRented(Rental rental) {
		double thisAmount = 0;

		if (rental.getMovie().getPriceCode().equals(Movie.REGULAR)) {
			thisAmount += rental.getDaysRented() > 2 ? (rental.getDaysRented() - 2) * 1.5 + 2 : 2;
		}
		if (rental.getMovie().getPriceCode().equals(Movie.NEW_RELEASE)) {
			thisAmount += rental.getDaysRented() * 3;
		}
		if (rental.getMovie().getPriceCode().equals(Movie.CHILDRENS)) {
			thisAmount += rental.getDaysRented() > 3 ? (rental.getDaysRented() - 3) * 1.5 + 1.5 : 1.5;
		}
		return thisAmount;
	}

	private int findAmountFrequentRenterPoints(int frequentRenterPoints, Rental rental) {
		frequentRenterPoints++;

		if (rental.getMovie ().getPriceCode () == Movie.NEW_RELEASE
				&& rental.getDaysRented () > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

}