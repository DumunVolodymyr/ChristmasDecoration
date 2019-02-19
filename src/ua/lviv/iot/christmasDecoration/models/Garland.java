package ua.lviv.iot.christmasDecoration.models;

public class Garland extends ChristmasDecoration{
	
	private int brightnessInProzent;
	private int numberOfFlashlights;
	
	public Garland() {}

	public Garland(TypeOfDecoration type, String producing—ountry, int price, String manufacturer,
			int brightnessInProzent, int numberOfFlashlights) {
		super(producing—ountry, price, type, manufacturer);
		this.brightnessInProzent = brightnessInProzent;
		this.numberOfFlashlights = numberOfFlashlights;
		}
	
	public int getBrightnessInProzent() {
		return brightnessInProzent;
	}
	public void setBrightnessInProzent(int brightnessInProzent) {
		this.brightnessInProzent = brightnessInProzent;
	}
	public int getNumberOfFlashlights() {
		return numberOfFlashlights;
	}
	public void setNumberOfFlashlights(int numberOfFlashlights) {
		this.numberOfFlashlights = numberOfFlashlights;
	}
}
