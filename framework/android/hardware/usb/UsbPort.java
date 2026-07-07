package android.hardware.usb;

@android.annotation.SystemApi
public final class UsbPort {
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_INTERNAL = 1;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_NOT_SUPPORTED = 2;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_OTHER = 4;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_PORT_MISMATCH = 3;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_SUCCESS = 0;
    public static final int ENABLE_USB_DATA_ERROR_INTERNAL = 1;
    public static final int ENABLE_USB_DATA_ERROR_NOT_SUPPORTED = 2;
    public static final int ENABLE_USB_DATA_ERROR_OTHER = 4;
    public static final int ENABLE_USB_DATA_ERROR_PORT_MISMATCH = 3;
    public static final int ENABLE_USB_DATA_SUCCESS = 0;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_DATA_ENABLED = 4;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_INTERNAL = 1;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_NOT_SUPPORTED = 2;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_OTHER = 5;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_PORT_MISMATCH = 3;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_SUCCESS = 0;
    public static final int FLAG_ALT_MODE_TYPE_DISPLAYPORT = 1;
    private static final int NUM_DATA_ROLES = 3;
    private static final int POWER_ROLE_OFFSET = 0;
    public static final int RESET_USB_PORT_ERROR_INTERNAL = 1;
    public static final int RESET_USB_PORT_ERROR_NOT_SUPPORTED = 2;
    public static final int RESET_USB_PORT_ERROR_OTHER = 4;
    public static final int RESET_USB_PORT_ERROR_PORT_MISMATCH = 3;
    public static final int RESET_USB_PORT_SUCCESS = 0;
    private static final java.lang.String TAG = "UsbPort";
    private static final java.util.concurrent.atomic.AtomicInteger sUsbOperationCount = null;
    private final java.lang.String mId = null;
    private final int mSupportedAltModes = 0;
    private final int mSupportedContaminantProtectionModes = 0;
    private final int mSupportedModes = 0;
    private final boolean mSupportsComplianceWarnings = false;
    private final boolean mSupportsEnableContaminantPresenceDetection = false;
    private final boolean mSupportsEnableContaminantPresenceProtection = false;
    private final boolean mSupportsPartnerBc12Type = false;
    private final boolean mSupportsPowerProfiles = false;
    private final android.hardware.usb.UsbManager mUsbManager = null;
    public UsbPort(android.hardware.usb.UsbManager p0, java.lang.String p1, int p2, int p3, boolean p4, boolean p5) {}
    public UsbPort(android.hardware.usb.UsbManager p0, java.lang.String p1, int p2, int p3, boolean p4, boolean p5, boolean p6, int p7) {}
    public UsbPort(android.hardware.usb.UsbPort.Builder p0) {}
    public static java.lang.String bc12TypeToString(int p0) { return null; }
    public static void checkDataRole(int p0) {}
    public static void checkMode(int p0) {}
    public static void checkPowerRole(int p0) {}
    public static void checkRoles(int p0, int p1) {}
    public static int combineRolesAsBit(int p0, int p1) { return 0; }
    public static java.lang.String complianceWarningsToString(int[] p0) { return null; }
    public static java.lang.String contaminantPresenceStatusToString(int p0) { return null; }
    public static java.lang.String dataRoleToString(int p0) { return null; }
    public static java.lang.String dpAltModeStatusToString(int p0) { return null; }
    public static java.lang.String modeToString(int p0) { return null; }
    public static java.lang.String powerBrickConnectionStatusToString(int p0) { return null; }
    public static java.lang.String powerRoleToString(int p0) { return null; }
    public static java.lang.String roleCombinationsToString(int p0) { return null; }
    public static java.lang.String usbDataStatusToString(int p0) { return null; }
    public void enableContaminantDetection(boolean p0) {}
    public int enableLimitPowerTransfer(boolean p0) { return 0; }
    public int enableUsbData(boolean p0) { return 0; }
    public int enableUsbDataWhileDocked() { return 0; }
    public java.lang.String getId() { return null; }
    public android.hardware.usb.UsbPortStatus getStatus() { return null; }
    public int getSupportedAltModesMask() { return 0; }
    public int getSupportedContaminantProtectionModes() { return 0; }
    public int getSupportedModes() { return 0; }
    public boolean isAltModeSupported(int p0) { return false; }
    public boolean isModeChangeSupported() { return false; }
    public boolean isModeSupported(int p0) { return false; }
    public void resetUsbPort(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void setRoles(int p0, int p1) {}
    public boolean supportsComplianceWarnings() { return false; }
    public boolean supportsEnableContaminantPresenceDetection() { return false; }
    public boolean supportsEnableContaminantPresenceProtection() { return false; }
    public boolean supportsPartnerBc12Type() { return false; }
    public boolean supportsPowerProfiles() { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AltModeType {
    }

    public static final class Builder {
        private java.lang.String mId;
        private int mSupportedAltModes;
        private int mSupportedContaminantProtectionModes;
        private int mSupportedModes;
        private boolean mSupportsComplianceWarnings;
        private boolean mSupportsEnableContaminantPresenceDetection;
        private boolean mSupportsEnableContaminantPresenceProtection;
        private boolean mSupportsPartnerBc12Type;
        private boolean mSupportsPowerProfiles;
        private android.hardware.usb.UsbManager mUsbManager;
        public Builder() {}
        public android.hardware.usb.UsbPort build() { return null; }
        public android.hardware.usb.UsbPort.Builder setId(java.lang.String p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportedAltModes(int p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportedContaminantProtectionModes(int p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportedModes(int p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportsComplianceWarnings(boolean p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportsEnableContaminantPresenceDetection(boolean p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportsEnableContaminantPresenceProtection(boolean p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportsPartnerBc12Type(boolean p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setSupportsPowerProfiles(boolean p0) { return null; }
        public android.hardware.usb.UsbPort.Builder setUsbManager(android.hardware.usb.UsbManager p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EnableLimitPowerTransferStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EnableUsbDataStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EnableUsbDataWhileDockedStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ResetUsbPortStatus {
    }
}
