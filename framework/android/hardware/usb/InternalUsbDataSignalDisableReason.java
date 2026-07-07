package android.hardware.usb;

public @interface InternalUsbDataSignalDisableReason {
    public static final int USB_DISABLE_REASON_APM = 1;
    public static final int USB_DISABLE_REASON_ENTERPRISE = 2;
    public static final int USB_DISABLE_REASON_LOCKDOWN_MODE = 0;
}
