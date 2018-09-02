package club.hicode.aspectstudy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/9/2
 */
@Aspect
@Component
@Order(20)
public class AuthorityAspect {

    @Pointcut("@annotation(club.hicode.aspectstudy.aspect.Authority)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Authority-Start");
        Object obj = joinPoint.proceed();
        System.out.println("Authority-End");
        return obj;
    }
}
