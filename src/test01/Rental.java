package test01;

public class Rental {
	private int daysRented;
	
	private Movie movie;
	
	public Rental(int daysRented, Movie movie){
		this.daysRented = daysRented;
		this.movie = movie;
	}
	
	

	public double getCharge() {
		return daysRented * movie.getCharge();
	}
}
