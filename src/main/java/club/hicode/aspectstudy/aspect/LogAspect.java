package club.hicode.aspectstudy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 权限
 * Authority
 *
 * @author LiuChunfu
 * @date 2018/9/2
 */
@Aspect
@Component
@Order(10)
public class LogAspect {

    @Pointcut("@annotation(club.hicode.aspectstudy.aspect.Log)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LogAspect-Start");
        Object obj = joinPoint.proceed();
        System.out.println("LogAspect-End");
        return obj;
    }
}
