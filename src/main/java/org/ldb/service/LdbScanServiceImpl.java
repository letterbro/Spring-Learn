package org.ldb.service;

import org.example.dao.LdbDao;
import org.ldb.service.impl.LdbScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-learn
 * @Package: org.ldb.service
 * @ClassName: LdbScanServiceImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/20 15:22
 * @Version: 1.0
 */
@Service
public class LdbScanServiceImpl implements LdbScanService {

    @Autowired
    private LdbDao ldbDaoImpl;

    @Override
    public void printf(){
        ldbDaoImpl.query();
    }
}
