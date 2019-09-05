package cn.lcm.springtoy.simple;

import java.lang.reflect.Method;

/**
 * @author Kermit Liu
 * @date 2019/8/5 21:56
 */
public class BeforeAdvice implements Advice {

    private Object bean;

    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}
