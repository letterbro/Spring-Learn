package org.zjm;

import org.example.annotation.ZjmScan;
import org.springframework.stereotype.Component;

/**
 * @Author zjm
 * @Date 2020/10/22
 * @Description
 */

//@Component
@ZjmScan
public class ZjmScannerTest {
    public ZjmScannerTest() {
        System.out.println("ZjmScannerTest被初始化了");
    }
}
