package test01;

public class Movie {
	private Price price;
	
	public Movie(Price price) {
		this.price = price;
	}
	
	public double getCharge() {
		return price.getCharge();
	}
}
