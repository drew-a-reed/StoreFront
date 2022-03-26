package Store.chips;

import Store.StoreFront;

import java.math.BigDecimal;

public abstract class Chips extends StoreFront {
    private BigDecimal price;
    private String name;

    public Chips() {
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
