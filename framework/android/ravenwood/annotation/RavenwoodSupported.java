package android.ravenwood.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
public @interface RavenwoodSupported {
    public long bug() default 0L;
    public java.lang.String comment() default "";
    public boolean conditional() default false;
    public java.lang.String subclass() default "";
    public android.ravenwood.annotation.RavenwoodSupported.SupportType type();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface RavenwoodProvidingImplementation {
        public java.lang.String comment() default "";
        public java.lang.Class<?> target();
    }

    public static enum SupportType {
        OTHER,
        SUBCLASS;
        private static final android.ravenwood.annotation.RavenwoodSupported.SupportType[] $VALUES = null;
        private SupportType() {}
    }
}
