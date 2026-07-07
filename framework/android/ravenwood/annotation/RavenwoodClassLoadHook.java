package android.ravenwood.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface RavenwoodClassLoadHook {
    public static final java.lang.String GLOBAL_INITIALIZATION_HOOK = "android.platform.test.ravenwood.RavenwoodClassLoadHooks.globalInitOnce";
    public long bug() default 0L;
    public java.lang.String comment() default "";
    public java.lang.String value();
}
