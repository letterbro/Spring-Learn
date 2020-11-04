package org.example.dao.impl;

import org.example.dao.LdbDao;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.dao
 * @ClassName: LdbDaoImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/15 9:50
 * @Version: 1.0
 */
@Repository("ldbDaoImpl")
public class LdbDaoImpl implements LdbDao {

    public void query() {
        System.out.println("spring 学习讨论会");
    }
}
