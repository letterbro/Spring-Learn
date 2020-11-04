package org.example.aspect;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.aspect
 * @ClassName: LdbAspect
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 9:45
 * @Version: 1.0
 */
@Aspect
@Component
public class LdbAspect {

//    https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop-pointcuts
    @Pointcut("execution(* org.example.service.impl.AspectServiceImpl.*(..))")
    public void executionAop(){

    }

    @Pointcut("@annotation(org.example.annotation.Ldb)")
    public void annotationAop(){

    }

    @Pointcut("within(org.example.service.impl.AspectServiceImpl)")
    public void inWebLayerAop() {}

    @Pointcut("target(org.example.service.impl.AspectServiceImpl)")
    public void targetAop() {}

    @Pointcut("this(org.example.service.impl.AspectServiceImpl)")
    public void thisAop() {}

    @Before("executionAop()")
    public void before(JoinPoint joinPoint){
        System.out.println("ldb log before");
    }

    @AfterReturning(value = "executionAop()",returning = "res")
    public void afterReturning(String res){
        System.out.println(res);
    }

    @AfterThrowing(value = "executionAop()",throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println(e.getMessage());
    }

    @After(value = "executionAop()")
    public void after(JoinPoint joinPoint){
        System.out.println("ldb log after");
    }


    @Around(value = "executionAop()")
    public Object around(ProceedingJoinPoint joinPoint){
        // Before
        System.out.println("ldb log around");
        Object[] args = joinPoint.getArgs();
        args[0] = 1;
        Object proceed = null;
        try {
            proceed = joinPoint.proceed(args);
        //AfterReturning
        } catch (Throwable throwable) {
            //AfterThrowing
            throwable.printStackTrace();
        }
        // after
        return proceed;
    }
}
