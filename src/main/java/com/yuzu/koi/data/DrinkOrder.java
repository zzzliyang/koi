package com.yuzu.koi.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class DrinkOrder extends BaseEntity {

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "drinkOrder")
    private List<Drink> drinks = new ArrayList<>();

    public DrinkOrder() {
    }

    public DrinkOrder(Date createTime, Date updateTime) {
        super(createTime, updateTime);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.addDrinkOrder(this);
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public void addDrink(Drink drink) {
        if (drinks.contains(drink)) return;
        drinks.add(drink);
    }
}
