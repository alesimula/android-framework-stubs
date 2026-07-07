package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.ANNOTATION_TYPE)
public @interface LongDef {
    public boolean flag() default false;
    public java.lang.String[] prefix() default "";
    public long[] value() default {};
}
