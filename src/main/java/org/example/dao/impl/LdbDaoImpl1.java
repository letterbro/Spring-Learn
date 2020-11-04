package org.example.dao.impl;

import org.example.dao.LdbDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.dao.impl
 * @ClassName: LdbDaoImpl1
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/15 13:54
 * @Version: 1.0
 */
@Repository
public class LdbDaoImpl1 implements LdbDao {
    public void query() {
        System.out.println("spring 学习讨论会 1");
    }
}
