package cn.lcm.springtoy.bean;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
