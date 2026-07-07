package android.annotation;

@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface ChecksSdkIntAtLeast {
    public int api() default -1;
    public java.lang.String codename() default "";
    public int lambda() default -1;
    public int parameter() default -1;
}
