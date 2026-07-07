package android.ravenwood.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface RavenwoodKeepStaticInitializer {
    public long bug() default 0L;
    public java.lang.String comment() default "";
}
