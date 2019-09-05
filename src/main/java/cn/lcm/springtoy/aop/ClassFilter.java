package cn.lcm.springtoy.aop;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:17
 */
public interface ClassFilter {

    /**
     * weather mather beanClass
     * @param beanClass
     * @return
     */
    Boolean matchers(Class beanClass);
}
