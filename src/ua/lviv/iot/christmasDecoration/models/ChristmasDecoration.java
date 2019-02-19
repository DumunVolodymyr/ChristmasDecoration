package ua.lviv.iot.christmasDecoration.models;

public class ChristmasDecoration {
	private String producing—ountry;
	private int price;
	private TypeOfDecoration type;
	private String manufacturer;
	
	public ChristmasDecoration() {}
	
	public ChristmasDecoration(String producing—ountry, int price, TypeOfDecoration type, String manufacturer) {
		super();
		this.producing—ountry = producing—ountry;
		this.price = price;
		this.type = type;
		this.manufacturer = manufacturer;
	}
	
/*	public String toString() {
		return "Decoration name - " + name + ". Price - " + price + ". Decoration color - " +
					color + ". Manufacturer - " + manufacturer;
	}*/

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TypeOfDecoration getType() {
		return type;
	}

	public void setType(TypeOfDecoration type) {
		this.type = type;
	}

	public String getProducing—ountry() {
		return producing—ountry;
	}
	public void setProducing—ountry(String producing—ountry) {
		this.producing—ountry = producing—ountry;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
