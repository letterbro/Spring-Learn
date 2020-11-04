package org.example.config;

import org.example.bo.ImportBO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.config
 * @ClassName: ImportConfig
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 15:05
 * @Version: 1.0
 */
public class ImportConfig {

    @Bean(name = "importBO")
    public ImportBO getImportBO(){
        return new ImportBO();
    }
}
