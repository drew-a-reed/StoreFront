package Store.candy;

import Store.interfaces.Sellable;
import java.math.BigDecimal;

public class ChocolateBar extends Candy implements Sellable {
    private BigDecimal price;
    private String name;

    public ChocolateBar() {
        super("LotOChoco", new BigDecimal("2.50"));
        this.price = new BigDecimal("2.50");
        this.name = "LotOChoco";
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
