package org.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.controller
 * @ClassName: A
 * @Author: LJP
 * @Description:
 * @Date: 2020/5/16 22:05
 * @Version: 1.0
 */
@Controller
public class A {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello world";
    }
}
