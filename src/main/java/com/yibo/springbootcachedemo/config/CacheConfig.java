package com.yibo.springbootcachedemo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/10 16:49
 * @Description: 缓存配置
 */

@Configuration
@EnableCaching//激活缓存
public class CacheConfig {

    @Bean
    public CacheManager cacheManager(){
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        ConcurrentMapCache cache = new ConcurrentMapCache("cache-1");
        ConcurrentMapCache personCache = new ConcurrentMapCache("persons");
        cacheManager.setCaches(Arrays.asList(cache,personCache));
        return cacheManager;
    }
}
