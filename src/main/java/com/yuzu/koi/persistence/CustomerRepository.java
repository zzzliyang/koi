package com.yuzu.koi.persistence;

import com.yuzu.koi.data.Customer;
import com.yuzu.koi.data.Drink;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByName(String name);
}
