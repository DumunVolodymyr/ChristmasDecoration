package ua.lviv.iot.christmasDecoration.models;

public class Snowman extends ChristmasDecoration{
	private int numberOfBullets;
	private String color;
	
	public Snowman() {}
	
	public Snowman(TypeOfDecoration type, String producing—ountry, int price, String manufacturer,
			int numberOfBullets, String color) {
		super(producing—ountry, price, type, manufacturer);
		this.numberOfBullets = numberOfBullets;
		this.color = color;
	}

	public int getNumberOfBullets() {
		return numberOfBullets;
	}

	public void setNumberOfBullets(int numberOfBullets) {
		this.numberOfBullets = numberOfBullets;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
