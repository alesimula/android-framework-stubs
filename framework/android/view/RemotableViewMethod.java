package android.view;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
public @interface RemotableViewMethod {
    public java.lang.String asyncImpl() default "";
}
