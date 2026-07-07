package android.hardware.hid;

public @interface HidPermissionResult {
    public static final int DENIED = 0;
    public static final int GRANTED_ALWAYS = 2;
    public static final int GRANTED_ONCE = 1;
}
