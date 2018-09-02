package club.hicode.aspectstudy.aspect;

import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/9/2
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Order(10)
public @interface Log {
}
