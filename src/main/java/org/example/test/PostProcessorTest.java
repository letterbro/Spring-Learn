package org.example.test;

import org.example.config.AppConfig;
import org.example.dao.LdbDao;
import org.example.dao.impl.LdbDaoImpl1;
import org.example.service.impl.BeanPostProcessorServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.test
 * @ClassName: PostProcessorTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 20:49
 * @Version: 1.0
 */
public class PostProcessorTest {

    public static void main(String[] args) {
//        beanPostProcessor();
        instantiationAwareBeanPostProcessor();
    }

    public static void beanPostProcessor(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanPostProcessorServiceImpl beanPostProcessorService = ac.getBean("beanPostProcessorServiceImpl", BeanPostProcessorServiceImpl.class);
        LdbDao ldbDao = ac.getBean("ldbDaoImpl1", LdbDaoImpl1.class);
        ldbDao.query();
        beanPostProcessorService.printf();
        beanPostProcessorService.printf1();
    }

    public static void instantiationAwareBeanPostProcessor(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanPostProcessorServiceImpl beanPostProcessorService = ac.getBean("beanPostProcessorServiceImpl", BeanPostProcessorServiceImpl.class);
        LdbDao ldbDao = ac.getBean("ldbDaoImpl1", LdbDaoImpl1.class);
        ldbDao.query();
//        beanPostProcessorService.printf();
//        beanPostProcessorService.printf1();
    }
}
