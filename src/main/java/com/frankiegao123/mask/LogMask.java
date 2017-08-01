package com.frankiegao123.mask;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标注于 Controller 方法的参数中， 被标注的参数在进行日志输出会进行掩码处理
 *
 * @author gaobaowen
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER })
@Inherited
public @interface LogMask {

    MaskType value() default MaskType.DEFAULT;
}
