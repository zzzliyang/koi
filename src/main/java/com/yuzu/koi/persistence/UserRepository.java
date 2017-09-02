package com.yuzu.koi.persistence;

import com.yuzu.koi.data.Customer;
import com.yuzu.koi.data.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Liyang, Zhang on 8/26/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUsername(String username);
}
