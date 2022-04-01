package Store.candy;

import Store.StoreFront;
import Store.drinks.Soda;
import Store.drinks.SportsDrink;
import Store.drinks.Water;
import Store.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Candy extends StoreFront {
    private String name;
    private BigDecimal price;

    //constructor----------------------------------------------------------
    public Candy(String name, BigDecimal price){
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

    public static List<Sellable> createCandyList() {
        List<Sellable> candy = new ArrayList<>();
        candy.add(new ChocolateBar());
        candy.add(new Skyttles());
        candy.add(new SneakersBar());

        return candy;
    }


    public String toString(){
        String template = "Candy: %s \t Price: $%s \n";
        template.replace("[", "");
        template.replace(",", "");
        return String.format(template, getName(), getPrice());
    }

}