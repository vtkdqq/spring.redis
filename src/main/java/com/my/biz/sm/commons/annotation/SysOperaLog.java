package com.my.biz.sm.commons.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 系统操作日志
 * 
 * @author stone
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SysOperaLog
{
    /**
     * 操作类型
     */
    public enum Type
    {
        /**
         * 查询
         */
        QUERY,
        /**
         * 新增
         */
        ADD,
        /**
         * 修改
         */
        EDIT,
        /**
         * 删除
         */
        DEL,
        /**
         * 审批
         */
        AUDIT,
        /**
         * 终审
         */
        FINAL_AUDIT
    };

    Type operaType();

    /**
     * 操作描述
     * 
     * @return
     */
    String operaDes() default "";
}
