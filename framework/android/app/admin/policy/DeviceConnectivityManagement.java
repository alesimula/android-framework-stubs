package android.app.admin.policy;

public class DeviceConnectivityManagement {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> NETWORK_RESET = null;
    public static final int NETWORK_RESET_ALLOWED = 1;
    public static final int NETWORK_RESET_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> PHYSICAL_SIM = null;
    public static final int PHYSICAL_SIM_ALLOWED = 1;
    public static final int PHYSICAL_SIM_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USB_DATA_SIGNALING = null;
    public static final int USB_DATA_SIGNALING_ALLOWED = 1;
    public static final int USB_DATA_SIGNALING_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USB_FILE_TRANSFER = null;
    public static final int USB_FILE_TRANSFER_ALLOWED = 1;
    public static final int USB_FILE_TRANSFER_DISALLOWED = 2;
    private DeviceConnectivityManagement() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkResetValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PhysicalSimValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbDataSignalingValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbFileTransferValue {
    }
}
