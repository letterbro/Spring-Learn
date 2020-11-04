package org.example.service;

import org.example.annotation.Ldb;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service
 * @ClassName: AspectService
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 10:00
 * @Version: 1.0
 */
public interface AspectService {
    String log();

    void logThrow() throws RuntimeException;

    @Ldb
    void logArgs(String aaa) throws RuntimeException;
}
