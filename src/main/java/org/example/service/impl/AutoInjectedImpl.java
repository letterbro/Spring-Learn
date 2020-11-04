package org.example.service.impl;

import org.example.dao.LdbDao;
import org.example.dao.impl.LdbDaoImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service.impl
 * @ClassName: AutoInjectedImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/15 14:53
 * @Version: 1.0
 */
@DependsOn("ldbDaoImpl")
@Service
public class AutoInjectedImpl {

    @Autowired
    private LdbDao ldbDaoImpl1;

//    public void setLdbDao(LdbDao ldbDao) {
//        this.ldbDao = ldbDao;
//    }
//
//    public AutoInjectedImpl(LdbDao ldbDaoImpl) {
//        this.ldbDao = ldbDaoImpl;
//    }

    public void printf(){
        ldbDaoImpl1.query();
    }


}
