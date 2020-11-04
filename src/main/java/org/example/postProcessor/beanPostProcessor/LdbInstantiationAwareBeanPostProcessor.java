package org.example.postProcessor.beanPostProcessor;

import org.example.dao.LdbDao;
import org.example.dao.impl.LdbDaoImpl;
import org.example.service.impl.BeanPostProcessorServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.postProcessor
 * @ClassName: LdbInstantiationAwareBeanPostProcessor
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 21:24
 * @Version: 1.0
 */
//@Component
public class LdbInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if (beanName.equals("beanPostProcessorServiceImpl")){
            System.out.println("实例化前");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        if (beanName.equals("beanPostProcessorServiceImpl")){
            System.out.println("实例化后");
        }
        return false;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("设值");
        if (beanName.equals("beanPostProcessorServiceImpl")){
            LdbDao ldbDao = applicationContext.getBean("ldbDaoImpl", LdbDaoImpl.class);
            ((BeanPostProcessorServiceImpl)bean).setLdbDao1(ldbDao);
        }
        return null;
    }
}
