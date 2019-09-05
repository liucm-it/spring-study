package cn.lcm.springtoy.aop;

import cn.lcm.springtoy.bean.HelloService;
import cn.lcm.springtoy.bean.HelloServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AspectJExpressionPointcutTest {

    @Test
    public void mathers() {
    }

    @Test
    public void matchers() {
    }

    @Test
    public void testClassFilter() {
        String expression = "execution(* cn.lcm.springtoy.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        Boolean matchers = aspectJExpressionPointcut.matchers(HelloService.class);
        assertTrue(matchers);
    }

    @Test
    public void testMethodMatcher() throws NoSuchMethodException {
        String expression = "execution(* cn.lcm.springtoy.bean.*.sayHelloWorld(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        Boolean m = aspectJExpressionPointcut.matchers(
                HelloServiceImpl.class.getDeclaredMethod("sayHelloWorld"), HelloServiceImpl.class
        );
        assertTrue(m);
    }
}
