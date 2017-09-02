package com.yuzu.koi.persistence;

import com.yuzu.koi.data.DrinkOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
public interface DrinkOrderRepository extends CrudRepository<DrinkOrder, Long> {
}
