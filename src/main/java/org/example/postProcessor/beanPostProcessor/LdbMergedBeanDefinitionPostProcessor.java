package org.example.postProcessor.beanPostProcessor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.postProcessor
 * @ClassName: LdbMergedBeanDefinitionPostProcessor
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 21:51
 * @Version: 1.0
 */
//@Component
public class LdbMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition rootBeanDefinition, Class<?> aClass, String s) {
        System.out.println("正在实例化");
    }

    @Override
    public void resetBeanDefinition(String beanName) {

    }
}
