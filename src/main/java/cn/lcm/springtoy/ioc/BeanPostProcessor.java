package cn.lcm.springtoy.ioc;

/**
 * @author Kermit Liu
 * @date 2019/8/5 22:07
 */
public interface BeanPostProcessor {

    /**
     * postProcessBefore initial
     * @param bean
     * @param beanName
     * @return
     */
    Object postProcessBeforeInitialization(Object bean, String beanName);

    /**
     * postProcessAfter Initial
     * @param bean
     * @param beanName
     * @return
     */
    Object postProcessAfterInitialization(Object bean, String beanName);
}
