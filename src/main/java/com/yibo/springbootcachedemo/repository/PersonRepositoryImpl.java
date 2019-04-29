package com.yibo.springbootcachedemo.repository;

import com.yibo.springbootcachedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/10 17:08
 * @Description:
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private final Map<String,Person> repository = new HashMap<>();

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public Person findPerson(String id) {
//        return repository.get(id);
        return (Person)redisTemplate.opsForValue().get(id);
    }

    @Override
    public boolean save(Person person) {
        redisTemplate.opsForValue().set(person.getId(),person);
        return true;
//        return repository.put(person.getId(),person) == null;
    }
}
