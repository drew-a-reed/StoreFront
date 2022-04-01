package Store.chips;

import Store.StoreFront;
import Store.drinks.Soda;
import Store.drinks.SportsDrink;
import Store.drinks.Water;
import Store.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Chips extends StoreFront {
    private String name;
    private BigDecimal price;

    //constructor----------------------------------------------------------
    public Chips(String name, BigDecimal price){
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

    public static List<Sellable> createChipsList() {
        List<Sellable> chips = new ArrayList<>();
        chips.add(new CheatOhs());
        chips.add(new CheesyTriangles());
        chips.add(new Tortilla());

        return chips;
    }


    public String toString(){
        String template = "Chip: %s \t Price: $%s \n";
        template.replace("[", "");
        template.replace(",", "");
        return String.format(template, getName(), getPrice());
    }

}