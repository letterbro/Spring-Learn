package org.example.service.impl;

import org.example.dao.LdbDao;
import org.example.service.LdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service
 * @ClassName: LdbService
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/15 9:48
 * @Version: 1.0
 */
//@Service
public class ByTypeImpl implements LdbService {

    private LdbDao ldbDaoImpl;

//    public void setLdbDaoImpl(LdbDao ldbDaoImpl) {
//        this.ldbDaoImpl = ldbDaoImpl;
//    }


    /**
     * 注入的类型依 ldbDaoImpl 来定
     * @param ldbDaoImpl
     */
    public ByTypeImpl(LdbDao ldbDaoImpl1) {
        this.ldbDaoImpl = ldbDaoImpl1;
    }

    @Override
    public void print() {
        ldbDaoImpl.query();
    }
}
