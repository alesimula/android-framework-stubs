package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface BroadcastBehavior {
    public boolean explicitOnly() default false;
    public boolean includeBackground() default false;
    public boolean protectedBroadcast() default false;
    public boolean registeredOnly() default false;
}
