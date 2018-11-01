package test01;

public class App {
	public static void main(String[] args) {
		Customer customer = new Customer();
		Rental rental1 = new Rental(1, new Movie(new Price1()));
		Rental rental2 = new Rental(2, new Movie(new Price2()));
		customer.addRental(rental1);
		customer.addRental(rental2);
		System.out.println(customer.getTotalCharge());
	}
}
