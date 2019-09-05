package cn.lcm.springtoy.aop;

import java.lang.reflect.Method;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:13
 */
public interface MethodMatcher {

    /**
     * matcher method and beanClass
     * @param method
     * @param beanClass
     * @return
     */
    Boolean matchers(Method method, Class beanClass);
}
