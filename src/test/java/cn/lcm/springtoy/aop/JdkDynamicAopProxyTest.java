package cn.lcm.springtoy.aop;

import cn.lcm.springtoy.bean.HelloService;
import cn.lcm.springtoy.bean.HelloServiceImpl;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class JdkDynamicAopProxyTest {

    @Test
    public void testGetProxy() {
        System.out.println("-------------no proxy------------------");
        HelloService helloService = new HelloServiceImpl();
        helloService.sayHelloWorld();
        System.out.println("--------------------proxy--------------------");
        AdvisedSupport support = new AdvisedSupport();
        support.setMethodInterceptor(invocation -> {
            System.out.println(invocation.getMethod().getName() +  "method start");
            Object proceed = invocation.proceed();
            System.out.println(invocation.getMethod().getName() +  "method end");
            return proceed;
        });
        TargetSource targetSource = new TargetSource(
                HelloServiceImpl.class, HelloServiceImpl.class.getInterfaces(), helloService
        );
        support.setTargetSource(targetSource);
        support.setMethodMatcher((method, beanClass) -> true);

        helloService = (HelloService) new JdkDynamicAopProxy(support).getProxy();
        helloService.sayHelloWorld();
    }

    @Test
    public void invoke() {
    }
}
