package cn.lcm.springtoy.aop;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:20
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * get pointcut
     * @return
     */
    Pointcut getPointcut();
}
