package org.example.postProcessor.beanPostProcessor;

import org.example.dao.LdbDao;
import org.example.dao.impl.LdbDaoImpl;
import org.example.dao.impl.LdbDaoImpl1;
import org.example.service.impl.BeanPostProcessorServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.postProcessor
 * @ClassName: LdbBeanPostProcessor
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 20:40
 * @Version: 1.0
 */
//@Component
public class LdbBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (beanName.equals("beanPostProcessorServiceImpl")){
            System.out.println("初始化前");
            LdbDao ldbDao = applicationContext.getBean("ldbDaoImpl", LdbDaoImpl.class);
            ((BeanPostProcessorServiceImpl)bean).setLdbDao(ldbDao);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (beanName.equals("beanPostProcessorServiceImpl")){
            System.out.println("初始化后");
            LdbDao ldbDao = applicationContext.getBean("ldbDaoImpl", LdbDaoImpl.class);
            ((BeanPostProcessorServiceImpl)bean).setLdbDao1(ldbDao);
        }
        return bean;
    }
}
