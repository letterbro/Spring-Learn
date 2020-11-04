package org.example.scanner;

import org.example.annotation.ZjmScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * @Author zjm
 * @Date 2020/10/22
 * @Description
 */
public class ZjmClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {
    public ZjmClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        super(registry);
        addIncludeFilter(new AnnotationTypeFilter(ZjmScan.class));
    }
}
