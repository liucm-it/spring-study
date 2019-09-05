package cn.lcm.springtoy.aop;

import org.aopalliance.aop.Advice;

/**
 * @author Kermit Liu
 * @date 2019/8/6 22:08
 */
public interface Advisor {

    /**
     * get advice
     * @return
     */
    Advice getAdvice();
}
