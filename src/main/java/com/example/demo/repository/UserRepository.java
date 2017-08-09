package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yulo0717 on 8/9/2017.
 */
public interface UserRepository extends MongoRepository<User,String> {
}
