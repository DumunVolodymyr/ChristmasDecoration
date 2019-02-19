package ua.lviv.iot.christmasDecoration.productManager;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.christmasDecoration.models.*;

public class ProductManagerImpl  implements ProductManager, Serializable{
	
	private List <ChristmasDecoration> decoration;
	
	public ProductManagerImpl() {}
	
	public ProductManagerImpl(List <ChristmasDecoration> decoration) {
		this.decoration = decoration;
	}
	
	public List<ChristmasDecoration> findByType(TypeOfDecoration type) {
        List<ChristmasDecoration> foundList;
        foundList = this.decoration.stream().filter(gt -> type.equals(gt.getType()))
                .collect(Collectors.toList());
        return foundList;
    }
	
    public List<ChristmasDecoration> sortByPrice(boolean reverse) {
    	Collections.sort(decoration, (o1, o2) -> o1.getPrice() - o2.getPrice());
        return decoration;
    }

	@Override
	public List<ChristmasDecoration> sortByProducingCountry(boolean reverse) {
		decoration.sort((ChristmasDecoration o1, ChristmasDecoration o2)->
		o1.getProducing—ountry().compareTo(o2.getProducing—ountry()));	
		return decoration;
	}
		
}