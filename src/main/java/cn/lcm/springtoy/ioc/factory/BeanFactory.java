package cn.lcm.springtoy.ioc.factory;

/**
 * @author Kermit Liu
 * @date 2019/8/5 23:13
 */
public interface BeanFactory {

    Object getBean(String beanId) throws Exception;
}
