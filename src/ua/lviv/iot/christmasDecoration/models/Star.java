package ua.lviv.iot.christmasDecoration.models;

public class Star extends ChristmasDecoration{
	
	private String color;
	private StarKind starKind;
	
	public Star() {}
	
	public Star(TypeOfDecoration type, String producing—ountry, int price, String manufacturer,
			int diametrsOfChristmassToys, String color, StarKind starKind) {
		super(producing—ountry, price, type, manufacturer);
		this.starKind = starKind;
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public StarKind getStarKind() {
		return starKind;
	}
	public void setStarKind(StarKind starKind) {
		this.starKind = starKind;
	}
	
	

}
