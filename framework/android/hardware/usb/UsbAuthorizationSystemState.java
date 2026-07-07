package android.hardware.usb;

public @interface UsbAuthorizationSystemState {
    public static final int BOOTED = 0;
    public static final int LOGGED_IN = 1;
    public static final int SCREEN_LOCKED = 2;
    public static final int SET_UP = 3;
}
