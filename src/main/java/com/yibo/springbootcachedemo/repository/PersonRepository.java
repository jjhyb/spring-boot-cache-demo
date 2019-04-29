package com.yibo.springbootcachedemo.repository;

import com.yibo.springbootcachedemo.entity.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/10 17:04
 * @Description:
 */

@NoRepositoryBean//有这个注解，spring不会去实例化该接口为repository
public interface PersonRepository {

    @Cacheable(cacheNames = "persons")
    //@Cacheable注解，Spring会在其被调用后将其返回值缓存起来,
        // 以保证下次利用同样的参数来执行该方法时可以直接从缓存中获取结果
    Person findPerson(String id);

    boolean save(Person perosn);
}
