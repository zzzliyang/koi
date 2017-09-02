package com.yuzu.koi.data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
@Entity
public class Drink extends BaseEntity {

    @Column
    private Double price;

    @Column
    private DrinkType drinkType;

    @Column
    private CupSize cupSize;

    @Column
    private SugerLevel sugerLevel;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
    private DrinkOrder drinkOrder;

    public Drink() {
    }

    public Drink(Date createTime, Date updateTime, Double price, DrinkType drinkType, CupSize cupSize, SugerLevel sugerLevel) {
        super(createTime, updateTime);
        this.price = price;
        this.drinkType = drinkType;
        this.cupSize = cupSize;
        this.sugerLevel = sugerLevel;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public CupSize getCupSize() {
        return cupSize;
    }

    public void setCupSize(CupSize cupSize) {
        this.cupSize = cupSize;
    }

    public SugerLevel getSugerLevel() {
        return sugerLevel;
    }

    public void setSugerLevel(SugerLevel sugerLevel) {
        this.sugerLevel = sugerLevel;
    }

    public DrinkOrder getDrinkOrder() {
        return drinkOrder;
    }

    public void setDrinkOrder(DrinkOrder drinkOrder) {
        this.drinkOrder = drinkOrder;
        drinkOrder.addDrink(this);
    }
}
