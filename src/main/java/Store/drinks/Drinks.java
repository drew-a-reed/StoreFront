package Store.drinks;
import Store.StoreFront;
import Store.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Drinks extends StoreFront {

    private String name;
    private BigDecimal price;

    //constructor----------------------------------------------------------
    public Drinks(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    //getters--------------------------------------------------------------
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public  static List<Sellable> createDrinks() {
        List<Sellable> drinks = new ArrayList<>();
        drinks.add(new Soda());
        drinks.add(new SportsDrink());
        drinks.add(new Water());

        return drinks;
    }

    private static Map<Sellable, Sellable> createDrinkList(){
        Map<Sellable, Sellable> drinkList = new HashMap<>();
        drinkList.put();
    }

}
