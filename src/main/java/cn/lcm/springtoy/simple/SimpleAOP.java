package cn.lcm.springtoy.simple;

import java.lang.reflect.Proxy;

/**
 * @author Kermit Liu
 * @date 2019/8/5 21:56
 */
public class SimpleAOP {

    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}