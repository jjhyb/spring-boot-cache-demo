package com.yibo.springbootcachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/10 16:43
 * @Description:
 */

@RestController
public class CacheController {

    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/save/cache")
    public Map<String,Object> save(@RequestParam String key,@RequestParam String value){
        Cache cache = cacheManager.getCache("cache-1");
        cache.put(key,value);
        Map<String,Object> result = new HashMap<>();
        result.put(key,value);
        return result;
    }
}
