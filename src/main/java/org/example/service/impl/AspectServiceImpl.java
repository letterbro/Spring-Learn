package org.example.service.impl;

import org.example.annotation.Ldb;
import org.example.service.AspectService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service.impl
 * @ClassName: AspectImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 9:59
 * @Version: 1.0
 */
@Service
public class AspectServiceImpl implements AspectService {

    @Ldb
    @Override
    public String log(){
        return "log 返回值";
    }
    @Ldb
    @Override
    public void logThrow() throws RuntimeException{
        throw new RuntimeException("logThrow 抛异常");
    }
    @Ldb
    @Override
    public void logArgs(String aaa){

    }

}
