package com.android.internal.annotations;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
public @interface GuardedBy {
    public java.lang.String[] anyOf() default {};
    public java.lang.String[] value() default {};
}
