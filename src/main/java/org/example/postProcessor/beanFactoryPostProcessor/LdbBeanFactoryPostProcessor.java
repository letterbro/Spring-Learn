package org.example.postProcessor.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.postProcessor.beanFactoryPostProcessor
 * @ClassName: LdbBeanFactoryPostProcessor
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 21:52
 * @Version: 1.0
 */
@Component
public class LdbBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("处理bean 工厂");
    }
}
