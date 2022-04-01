package Store.chips;

import Store.interfaces.Sellable;

import java.math.BigDecimal;

public class CheesyTriangles extends Chips implements Sellable {
    private BigDecimal price;
    private String name;

    public CheesyTriangles() {
        super("CheesyTriangles", new BigDecimal("2.50"));
        this.price = new BigDecimal("2.50");
        this.name = "CheesyTriangles";
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
