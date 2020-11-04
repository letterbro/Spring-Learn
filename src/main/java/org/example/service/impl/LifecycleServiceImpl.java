package org.example.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service.impl
 * @ClassName: LifecycleServiceImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 15:47
 * @Version: 1.0
 */
public class LifecycleServiceImpl implements InitializingBean, DisposableBean {

    public void init(){
        System.out.println("init ");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct ");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy ");
    }

    public void destoryMethod() {
        System.out.println("destoryMethod");
    }
}
