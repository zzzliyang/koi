package com.yuzu.koi.service;

import com.yuzu.koi.data.Customer;
import com.yuzu.koi.data.Drink;
import com.yuzu.koi.data.DrinkOrder;
import com.yuzu.koi.persistence.CustomerRepository;
import com.yuzu.koi.persistence.DrinkRepository;
import com.yuzu.koi.persistence.DrinkOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
@Service
public class DrinkService {

    @Autowired
    private DrinkRepository drinkRepository;

    @Autowired
    private DrinkOrderRepository drinkOrderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public void createNewOrder(DrinkOrder drinkOrder) {
        drinkOrderRepository.save(drinkOrder);
    }

    @Transactional
    public List<DrinkOrder> fetchDrinkOrdersFor(Long customerId) {
        Customer customer = customerRepository.findOne(customerId);
        if (customer == null) throw new RuntimeException("Customer does not exist!");
        return customer.getDrinkOrders();
    }

    private Boolean checkAvailability(Drink drink) {
        return true;
    }

}
