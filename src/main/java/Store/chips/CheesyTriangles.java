package Store.chips;

import Store.interfaces.Sellable;

import java.math.BigDecimal;

public class CheesyTriangles extends Chips implements Sellable {
    private BigDecimal price;
    private String name;

    public CheesyTriangles() {
        //super("Core's Lite", new BigDecimal("3.99"));
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
