package cn.lcm.springtoy.aop;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:29
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy{

    @Override
    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        return new JdkDynamicAopProxy(this);
    }
}
