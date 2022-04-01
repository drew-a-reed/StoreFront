package Store.chips;

import Store.interfaces.Sellable;

import java.math.BigDecimal;

public class Tortilla extends Chips implements Sellable {
    private BigDecimal price;
    private String name;

    public Tortilla() {
        super("Tortilla", new BigDecimal("3.00"));
        this.price = new BigDecimal("3.00");
        this.name = "Tortilla";
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
