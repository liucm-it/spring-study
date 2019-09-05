package cn.lcm.springtoy.ioc.xml;


import cn.lcm.springtoy.bean.Car;
import cn.lcm.springtoy.bean.Wheel;
import org.junit.Test;

public class XmlBeanFactoryTest {

    @Test
    public void getBean() throws Exception {
        System.out.println("-------------IOC test------------------");
        String file = getClass().getClassLoader().getResource("spring.xml").getFile();
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(file);
        Wheel wheel = (Wheel) xmlBeanFactory.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) xmlBeanFactory.getBean("car");
        System.out.println(car);

        System.out.println("\n--------- AOP test ----------");
    }
}
