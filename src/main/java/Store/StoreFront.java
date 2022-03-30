package Store;

import Store.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public abstract class StoreFront {

    private String name;
    private BigDecimal price;

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //constructor
    public StoreFront(String name, BigDecimal price) {

    }

}
