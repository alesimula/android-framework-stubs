package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface AllowedDpcTypes {
    public static final int ALLOWED = 1;
    public static final int ALLOWED_WHEN_AFFILIATED = 3;
    public static final int DISALLOWED = 2;
    public int deviceOwner();
    public int financedDeviceOwner() default 2;
    public int fullUserProfileOwner();
    public int managedProfileOwnerOfOrganizationOwnedDevice();
    public int managedProfileOwnerOfPersonalOwnedDevice();
    public int profileOwnerOnUser0() default 2;
}
