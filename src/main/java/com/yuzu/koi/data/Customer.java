package com.yuzu.koi.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Customer extends BaseEntity {

    @Column
    private String name;

    @Column
    private Double balance;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<DrinkOrder> drinkOrders = new ArrayList<>();

    public Customer() {
    }

    public Customer(Date createTime, Date updateTime, String name, Double balance) {
        super(createTime, updateTime);
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<DrinkOrder> getDrinkOrders() {
        return drinkOrders;
    }

    public void setDrinkOrders(List<DrinkOrder> drinkOrders) {
        this.drinkOrders = drinkOrders;
    }

    public void addDrinkOrder(DrinkOrder drinkOrder) {
        if (drinkOrders.contains(drinkOrder)) return;
        drinkOrders.add(drinkOrder);
    }
}
