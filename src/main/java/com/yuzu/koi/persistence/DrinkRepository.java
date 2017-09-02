package com.yuzu.koi.persistence;

import com.yuzu.koi.data.Drink;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
public interface DrinkRepository extends CrudRepository<Drink, Long> {
}
