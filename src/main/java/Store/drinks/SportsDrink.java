package Store.drinks;

import Store.interfaces.Sellable;
import java.math.BigDecimal;

public class SportsDrink extends Drinks implements Sellable {
    private BigDecimal price;
    private String name;


    public SportsDrink() {
        super("SportsDrink", new BigDecimal("5.09"));
        this.price = new BigDecimal("5.09");
        this.name = "SportsDrink";

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
