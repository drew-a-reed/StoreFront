package Store.drinks;

import Store.StoreFront;
import Store.interfaces.Sellable;

import java.math.BigDecimal;

public class Soda extends Drinks implements Sellable {
    private BigDecimal price;
    private String name;

    public Soda() {
        super("Core's Lite", new BigDecimal("3.99"));
        this.price = new BigDecimal("3.99");
        this.name = name;
    }


    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return name;
    }
}
