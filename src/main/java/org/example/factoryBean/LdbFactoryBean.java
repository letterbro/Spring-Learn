package org.example.factoryBean;

import org.example.bo.LdbBO;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.factoryBean
 * @ClassName: LdbFactoryBean
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 14:23
 * @Version: 1.0
 */
@Component
public class LdbFactoryBean implements FactoryBean {

    @Override
    public Object getObject() {
        LdbBO ldbBO = new LdbBO();
        return ldbBO;
    }

    @Override
    public Class<?> getObjectType() {
        return LdbBO.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
