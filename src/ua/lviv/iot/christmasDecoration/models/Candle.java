package ua.lviv.iot.christmasDecoration.models;

public class Candle extends ChristmasDecoration{
	
	private double diameter;
	private SmellOfCandles Smell;
	
	
	public Candle() {}
	
	public Candle(TypeOfDecoration type, String producing—ountry, int price, String manufacturer,
							double diameter, SmellOfCandles Smell) {
		super(producing—ountry, price, type, manufacturer);
		this.diameter = diameter;
		this.Smell = Smell;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public SmellOfCandles getSmell() {
		return Smell;
	}

	public void setSmell(SmellOfCandles smell) {
		Smell = smell;
	}
}
