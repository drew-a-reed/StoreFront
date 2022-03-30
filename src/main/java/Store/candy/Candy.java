package Store.candy;

import Store.StoreFront;

import java.math.BigDecimal;

public abstract class Candy extends StoreFront {

    private String name;
    private BigDecimal price;

    //constructor----------------------------------------------------------
    public Candy(String name, BigDecimal price){
        super(name, price);
        this.name = name;
        this.price = price;
    }

    //getters--------------------------------------------------------------
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
}
