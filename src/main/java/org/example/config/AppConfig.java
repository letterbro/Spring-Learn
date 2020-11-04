package org.example.config;

import org.example.bo.AutoBO;
import org.example.bo.ImportBO;
import org.example.dao.impl.LdbDaoImpl1;
import org.example.registrar.LdbImportBeanDefinitionRegistrar;
import org.example.registrar.ZjmImportBeanDefinationRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.config
 * @ClassName: AppConfig
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 10:38
 * @Version: 1.0
 */
@EnableAspectJAutoProxy
@Configuration
//@Import(ImportConfig.class)
@Import({ZjmImportBeanDefinationRegistrar.class})
@ComponentScan("org.example")
public class AppConfig {


    @Bean
    public AutoBO autoBO() {
        return new AutoBO();
    }
}
