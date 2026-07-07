package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface ListResolutionMechanism {
    public boolean custom() default false;
    public boolean union() default false;
}
