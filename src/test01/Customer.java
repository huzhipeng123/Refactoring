package test01;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private List<Rental> rentals = new ArrayList<>();

	public void addRental(Rental raRental) {
		rentals.add(raRental);
	}
	
	public double getTotalCharge() {
		double totalCharge = 0.0;
		for(Rental rental : rentals) {
			totalCharge += rental.getCharge();
		}
		return totalCharge;
	}
}
