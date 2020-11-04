package org.example.scanner;

import org.example.annotation.LdbScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.scanner
 * @ClassName: LdbClassPathBeanDefinitionScanner
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 15:29
 * @Version: 1.0
 */
public class LdbClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public LdbClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        super(registry);
        addIncludeFilter(new AnnotationTypeFilter(LdbScan.class));

    }
}
