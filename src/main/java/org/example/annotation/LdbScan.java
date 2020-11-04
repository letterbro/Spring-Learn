package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.annotation
 * @ClassName: LdbScan
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 15:39
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LdbScan {
}
