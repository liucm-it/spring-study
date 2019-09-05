package cn.lcm.springtoy.ioc;

import java.io.FileNotFoundException;

/**
 * @author Kermit Liu
 * @date 2019/8/5 22:13
 */
public interface BeanDefinitionReader {

    /**
     * load beanDefinitions
     * @param location
     * @throws FileNotFoundException
     * @throws Exception
     */
    void loadBeanDefinitions(String location) throws FileNotFoundException, Exception;
}
