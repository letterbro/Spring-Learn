package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.annotation
 * @ClassName: Ldb
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 9:45
 * @Version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ldb {
}
