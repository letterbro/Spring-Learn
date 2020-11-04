package org.example.service.impl;

import org.example.dao.LdbDao;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service.impl
 * @ClassName: LookupServiceImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 14:15
 * @Version: 1.0
 */
@Service
public abstract class LookupServiceImpl {

    @Lookup("ldbDaoImpl1")
    public abstract LdbDao setLdbDao();

    public void printf(){
        setLdbDao().query();
    }
}
