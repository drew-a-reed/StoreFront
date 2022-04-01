package Store.drinks;
import Store.StoreFront;
import Store.candy.Candy;
import Store.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.*;

public abstract class Drinks extends StoreFront {

    private String name;
    private BigDecimal price;

    //constructor----------------------------------------------------------
    public Drinks(String name, BigDecimal price){
        super(name, price);
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

    public static List<Sellable> createDrinksList() {
        List<Sellable> drinks = new ArrayList<>();
        drinks.add(new Soda());
        drinks.add(new SportsDrink());
        drinks.add(new Water());

        return drinks;
    }


    public String toString(){

        String template = "Drink: %-15s \t Price: $%-15s \n";
        //return ("Drink: " + getName() + " $" + getPrice()).replace(",","");
        return String.format(template, getName(), getPrice());
    }

}
