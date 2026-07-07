package android.compat.annotation;

@java.lang.annotation.Repeatable(android.compat.annotation.UnsupportedAppUsage.Container.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
public @interface UnsupportedAppUsage {
    public java.lang.String expectedSignature() default "";
    public java.lang.String implicitMember() default "";
    public int maxTargetSdk() default 2147483647;
    public java.lang.String overrideSourcePosition() default "";
    public java.lang.String publicAlternatives() default "";
    public long trackingBug() default 0L;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Container {
        public android.compat.annotation.UnsupportedAppUsage[] value();
    }
}
