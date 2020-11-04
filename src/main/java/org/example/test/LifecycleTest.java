package org.example.test;

import org.example.config.AppConfig;
import org.example.lifecycle.SmartLifecycleTest;
import org.example.service.impl.LifecycleServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.test
 * @ClassName: slcTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 15:21
 * @Version: 1.0
 */
public class LifecycleTest {

    public static void main(String[] args) {
//        smartLifecycleTest();
        lifecycleTest();
    }

    public static void smartLifecycleTest(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        SmartLifecycleTest smartLifecycleTest = ac.getBean("smartLifecycleTest", SmartLifecycleTest.class);
        System.out.println(smartLifecycleTest);
    }

    public static void lifecycleTest(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        LifecycleServiceImpl lifecycleService = ac.getBean("lifecycleServiceImpl", LifecycleServiceImpl.class);
        ac.destroy();
    }
}
