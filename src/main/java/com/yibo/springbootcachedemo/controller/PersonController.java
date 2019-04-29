package com.yibo.springbootcachedemo.controller;

import com.yibo.springbootcachedemo.entity.Person;
import com.yibo.springbootcachedemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/10 17:17
 * @Description:
 */

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/save/person")
    public boolean savePerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @GetMapping("/find/{id}")
    public Person findPerson(@PathVariable String id){

        return personRepository.findPerson(id);
    }

}
