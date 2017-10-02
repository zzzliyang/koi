package com.yuzu.koi.service;

import com.yuzu.koi.data.*;
import com.yuzu.koi.persistence.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class DrinkServiceTest {

    @Autowired
    private DrinkService drinkService;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    @Transactional
    public void testCreateNewOrder() {
        Customer customer = customerRepository.findByName("yuzu").get(0);
        DrinkOrder drinkOrder = new DrinkOrder(new Date(), new Date());
        drinkOrder.setCustomer(customer);
        Drink milkTea = new Drink(new Date(), new Date(), 3.4, DrinkType.MILK_TEA, CupSize.MEDIUM, SugerLevel.QUATER);
        Drink tea = new Drink(new Date(), new Date(), 4.2, DrinkType.TEA, CupSize.LARGE, SugerLevel.QUATER);
        milkTea.setDrinkOrder(drinkOrder);
        tea.setDrinkOrder(drinkOrder);
        Double balance = customer.getBalance();
        balance -= milkTea.getPrice();
        balance -= tea.getPrice();
        customer.setBalance(balance);
        customerRepository.save(customer);
    }

    @Test(expected = RuntimeException.class)
    public void DrinkServiceTest() {
        List<DrinkOrder> drinkOrders = drinkService.fetchDrinkOrdersFor(39l);
        assertThat(drinkOrders.size()).isGreaterThan(0);
        drinkService.fetchDrinkOrdersFor(1l);
    }

}