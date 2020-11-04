package org.example.service.impl;

import org.example.dao.LdbDao;
import org.example.service.BeanPostProcessorService;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.service.impl
 * @ClassName: BeanPostProcessorServiceImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 20:43
 * @Version: 1.0
 */
@Component
public class BeanPostProcessorServiceImpl implements BeanPostProcessorService {

    private LdbDao ldbDao;

    public void setLdbDao(LdbDao ldbDao) {
        this.ldbDao = ldbDao;
    }

    private LdbDao ldbDao1;

    public void setLdbDao1(LdbDao ldbDao1) {
        this.ldbDao1 = ldbDao1;
    }

    @Override
    public void printf(){
        ldbDao.query();
    }

    @Override
    public void printf1(){
        ldbDao1.query();
    }

}
