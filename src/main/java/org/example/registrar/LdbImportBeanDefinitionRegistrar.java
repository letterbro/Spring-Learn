package org.example.registrar;

import org.example.scanner.LdbClassPathBeanDefinitionScanner;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.registrar
 * @ClassName: LdbImportBeanDefinitionRegistrar
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 15:15
 * @Version: 1.0
 */
@Component
public class LdbImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
                                        BeanNameGenerator importBeanNameGenerator) {
        System.out.println("registerBeanDefinitions  0");
        LdbClassPathBeanDefinitionScanner scanner = new LdbClassPathBeanDefinitionScanner(registry);
        scanner.scan("org.ldb");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

    }
}
