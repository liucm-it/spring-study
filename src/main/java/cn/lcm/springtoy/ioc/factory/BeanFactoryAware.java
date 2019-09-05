package cn.lcm.springtoy.ioc.factory;

/**
 * @author Kermit Liu
 * @date 2019/8/5 23:12
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
