package org.example.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Component;

/**
 * @Author zjm
 * @Date 2020/10/22
 * @Description
 */

@Component
public class ZjmFactoryBean implements FactoryBean {

    @Override
    public Object getObject() {
        return new RedisProperties.Jedis();
    }

    @Override
    public Class<?> getObjectType() {
        return RedisProperties.Jedis.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
