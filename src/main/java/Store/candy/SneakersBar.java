package Store.candy;

import Store.interfaces.Sellable;
import java.math.BigDecimal;

public class SneakersBar extends Candy implements Sellable {
    private BigDecimal price;
    private String name;

    public SneakersBar() {
        super("Sneakers", new BigDecimal("4.00"));
        this.price = new BigDecimal("4.");
        this.name = "Sneakers";
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
