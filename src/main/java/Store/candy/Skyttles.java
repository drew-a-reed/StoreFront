package Store.candy;

import Store.interfaces.Sellable;
import java.math.BigDecimal;

public class Skyttles extends Candy implements Sellable {
    private BigDecimal price;
    private String name;

    public Skyttles() {
        super("Skyttles", new BigDecimal("3.00"));
        this.price = new BigDecimal("3.00");
        this.name = "Skyttles";
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
