package Store.drinks;

import Store.StoreFront;
import Store.interfaces.Sellable;

import java.math.BigDecimal;

public class Soda extends Drinks implements Sellable {
    private BigDecimal price;
    private String name;

    public Soda() {
        super("Soda", new BigDecimal("3.50"));
        this.price = new BigDecimal("3.50");
        this.name = "Soda";
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
