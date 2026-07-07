package android.ravenwood.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface RavenwoodKeep {
    public long bug() default 0L;
    public java.lang.String comment() default "";
    public boolean conditional() default false;
}
