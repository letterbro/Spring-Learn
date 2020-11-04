package org.example.test;

import org.example.config.AppConfig;
import org.example.service.AspectService;
import org.example.service.impl.ByTypeImpl;
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
public class AopTest {

    public static void main(String[] args) {
        print();
    }

    public static void print(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AspectService aspectService = ac.getBean("aspectServiceImpl", AspectService.class);
        aspectService.log();
        aspectService.logThrow();
        aspectService.logArgs("1111");
    }
}
