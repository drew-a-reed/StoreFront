package Store.drinks;

import Store.interfaces.Sellable;
import java.math.BigDecimal;

public class Water extends Drinks implements Sellable {
    private BigDecimal price;
    private String name;


    public Water() {
        super("Water", new BigDecimal("1.29"));
        this.price = new BigDecimal("1.29");
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
