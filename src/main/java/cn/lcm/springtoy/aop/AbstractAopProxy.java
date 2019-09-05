package cn.lcm.springtoy.aop;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:15
 */
public abstract class AbstractAopProxy implements AopProxy {

    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
