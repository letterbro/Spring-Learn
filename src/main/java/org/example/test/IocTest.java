package org.example.test;

import org.example.bo.ImportBO;
import org.example.bo.LdbBO;
import org.example.config.AppConfig;
import org.example.dao.impl.LdbDaoImpl;
import org.example.factoryBean.LdbFactoryBean;
import org.example.service.impl.AutoInjectedImpl;
import org.example.service.impl.ByTypeImpl;
import org.example.service.impl.LookupServiceImpl;
import org.ldb.service.LdbScanServiceImpl;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.test
 * @ClassName: IocTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/15 9:57
 * @Version: 1.0
 */
public class IocTest {

    public static void main(String[] args) {
//        byType();
//        lookup();
//        factoryBean();
//        importBO();
        ldbClassPathBeanDefinitionScanner();
//        autowired();
    }

    public static void byType() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        ByTypeImpl byTypeImpl = (ByTypeImpl) ac.getBean("byTypeImpl");
        byTypeImpl.print();
    }

    public static void lookup() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        LookupServiceImpl lookupService = ac.getBean("lookupServiceImpl", LookupServiceImpl.class);
        lookupService.printf();
    }

    public static void factoryBean() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 错误的写法
//        LdbFactoryBean ldbFactoryBean = ac.getBean("ldbFactoryBean",LdbFactoryBean.class);
        System.out.println(ac.getBean("ldbFactoryBean", LdbBO.class));
        System.out.println(ac.getBean("zjmFactoryBean", RedisProperties.Jedis.class));
//        LdbBO ldbBO1 = ac.getBean("ldbFactoryBean", LdbBO.class);
//        System.out.println(ldbBO);
//        System.out.println(ldbBO1);
//        System.out.println(ldbBO==ldbBO1);
    }

    public static void importBO() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        ImportBO importBO = ac.getBean("importBO", ImportBO.class);
        System.out.println(importBO);
    }

    public static void ldbClassPathBeanDefinitionScanner(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ac.getBean("zjmFactoryBean", RedisProperties.Jedis.class));
//        LdbScanServiceImpl ldbScanServiceImpl = ac.getBean("ldbScanServiceImpl", LdbScanServiceImpl.class);
//        System.out.println(ldbScanServiceImpl);
    }

    public static void autowired(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AutoInjectedImpl autoInjected = ac.getBean("autoInjectedImpl", AutoInjectedImpl.class);
        autoInjected.printf();
    }
}
