package android.ravenwood.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface RavenwoodRedirectionClass {
    public java.lang.String comment() default "";
    public java.lang.String value();
}
