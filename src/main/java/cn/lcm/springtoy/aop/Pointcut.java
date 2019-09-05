package cn.lcm.springtoy.aop;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:19
 */
public interface Pointcut {

    /**
     * get classFilter
     * @return
     */
    ClassFilter getClassFilter();

    /**
     * get methodMatcher
     * @return
     */
    MethodMatcher getMethodMatcher();
}
