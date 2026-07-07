package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface StringResolutionMechanism {
    public boolean custom() default false;
    public boolean notCoexistable() default false;
}
