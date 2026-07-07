package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface AllowedRoles {
    public static final int ALLOWED = 1;
    public static final int DISALLOWED = 2;
    public int deviceController() default 2;
}
