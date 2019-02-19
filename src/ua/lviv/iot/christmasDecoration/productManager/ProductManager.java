package ua.lviv.iot.christmasDecoration.productManager;
import java.util.List;

import ua.lviv.iot.christmasDecoration.models.ChristmasDecoration;
import ua.lviv.iot.christmasDecoration.models.TypeOfDecoration;

public interface ProductManager {

	    public List<ChristmasDecoration> findByType(TypeOfDecoration type);

	    public List<ChristmasDecoration> sortByPrice(boolean reverse);

		public List<ChristmasDecoration> sortByProducingCountry(boolean reverse);
	
}
