package android.hardware.usb;

public @interface UsbAuthorizationStatus {
    public static final int AUTHORIZED = 1;
    public static final int DENIED = 0;
    public static final int DENIED_AND_DEFERRED = 2;
}
