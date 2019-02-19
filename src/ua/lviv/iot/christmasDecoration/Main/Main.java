package ua.lviv.iot.christmasDecoration.Main;
import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.christmasDecoration.models.Candle;
import ua.lviv.iot.christmasDecoration.models.ChristmasDecoration;
import ua.lviv.iot.christmasDecoration.models.Garland;
import ua.lviv.iot.christmasDecoration.models.Snowman;
import ua.lviv.iot.christmasDecoration.models.Star;
import ua.lviv.iot.christmasDecoration.models.TypeOfDecoration;
import ua.lviv.iot.christmasDecoration.productManager.ProductManager;
import ua.lviv.iot.christmasDecoration.productManager.ProductManagerImpl;

public class Main {

	public static void main(String[] args) {
		 
		  ChristmasDecoration star = new Star();
		  ChristmasDecoration garland = new Garland();
	      ChristmasDecoration snowman = new Snowman();
	      ChristmasDecoration candle = new Candle();

	      	star.setProducing—ountry("Ukraine");
	        garland.setProducing—ountry("China");
	        snowman.setProducing—ountry("German");
	        candle.setProducing—ountry("Ukraine");

	      	star.setPrice(345);
	        garland.setPrice(150);
	        snowman.setPrice(10);
	        candle.setPrice(60);
	        
	        star.setType(TypeOfDecoration.TREE_DECORATION);
	        garland.setType(TypeOfDecoration.TREE_DECORATION);
	        snowman.setType(TypeOfDecoration.STREET_DECORATION);
	        candle.setType(TypeOfDecoration.HOUSE_DECORATION);
	        
	        star.setManufacturer("FOX");
	        garland.setManufacturer("LED");
	        snowman.setManufacturer("Solomiyka");
	        candle.setManufacturer("Hand");
	        
	        List<ChristmasDecoration> decoration = new ArrayList<>();
	        decoration.add(star);
	        decoration.add(snowman);
	        decoration.add(garland);
	        decoration.add(candle);
	        
	        ProductManager manager = new ProductManagerImpl(decoration);
	        
	        List<ChristmasDecoration> forTree = manager.findByType(TypeOfDecoration.TREE_DECORATION);
	        forTree.forEach((ChristmasDecoration decor) -> {
	            System.out.println(decor.getType().toString());
	        });
	        
	        System.out.println();
	        
	        List<ChristmasDecoration> sortedPyPrice = manager.sortByPrice(false);
	        sortedPyPrice.forEach((ChristmasDecoration decor) -> {
	            System.out.println(decor.getPrice());
	        });
	        
	        System.out.println();
	        
	        List<ChristmasDecoration> sortedByProducingCountry = manager.sortByProducingCountry(false);
	        sortedByProducingCountry.forEach((ChristmasDecoration decor) -> {
	            System.out.println(decor.getProducing—ountry());
	        });

	}
}
