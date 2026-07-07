package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface EnumResolutionMechanism {
    public boolean custom() default false;
    public int[] mostRestrictive() default {};
    public boolean notCoexistable() default false;
}
