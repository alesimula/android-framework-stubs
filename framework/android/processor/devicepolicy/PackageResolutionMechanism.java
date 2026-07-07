package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface PackageResolutionMechanism {
    public boolean custom() default false;
    public boolean notCoexistable() default false;
}
