package Store.candy;

import Store.interfaces.Sellable;
import java.math.BigDecimal;

public class Skyttles extends Candy implements Sellable {
    private BigDecimal price;
    private String name;

    public Skyttles() {
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
