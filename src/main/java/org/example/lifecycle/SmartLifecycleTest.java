package org.example.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-learn
 * @Package: org.example.lifecycle
 * @ClassName: SmartLifecycle
 * @Author: LJP
 * @Description:
 * @Date: 2020/10/19 15:18
 * @Version: 1.0
 */
@Component
public class SmartLifecycleTest implements SmartLifecycle {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void start() {
        // 每次refresh 都会调用一次
        System.out.println("SmartLifecycleTest");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public boolean isAutoStartup() {
        //当这个返回true 的时候自动调用start方法
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        // 如果手动调用 run 方法的话在容器停止的时候就会直接停止
        // 如果没调用的话会延迟30秒关闭
        callback.run();
    }

    @Override
    public int getPhase() {
        // 优先级，返回数值越低，优先级越高
        return 0;
    }
}
