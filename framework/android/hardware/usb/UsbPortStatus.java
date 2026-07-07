package android.hardware.usb;

@android.annotation.SystemApi
public final class UsbPortStatus implements android.os.Parcelable {
    public static final int BC12_TYPE_CDP = 2;
    public static final int BC12_TYPE_DCP = 3;
    public static final int BC12_TYPE_SDP = 1;
    public static final int BC12_TYPE_UNKNOWN = 0;
    public static final int COMPLIANCE_WARNING_BC_1_2 = 3;
    public static final int COMPLIANCE_WARNING_DEBUG_ACCESSORY = 2;
    public static final int COMPLIANCE_WARNING_ENUMERATION_FAIL = 7;
    public static final int COMPLIANCE_WARNING_FLAKY_CONNECTION = 8;
    public static final int COMPLIANCE_WARNING_INPUT_POWER_LIMITED = 5;
    public static final int COMPLIANCE_WARNING_MISSING_DATA_LINES = 6;
    public static final int COMPLIANCE_WARNING_MISSING_RP = 4;
    public static final int COMPLIANCE_WARNING_OTHER = 1;
    public static final int COMPLIANCE_WARNING_UNRELIABLE_IO = 9;
    public static final int CONTAMINANT_DETECTION_DETECTED = 3;
    public static final int CONTAMINANT_DETECTION_DISABLED = 1;
    public static final int CONTAMINANT_DETECTION_NOT_DETECTED = 2;
    public static final int CONTAMINANT_DETECTION_NOT_SUPPORTED = 0;
    public static final int CONTAMINANT_PROTECTION_DISABLED = 8;
    public static final int CONTAMINANT_PROTECTION_FORCE_DISABLE = 4;
    public static final int CONTAMINANT_PROTECTION_NONE = 0;
    public static final int CONTAMINANT_PROTECTION_SINK = 1;
    public static final int CONTAMINANT_PROTECTION_SOURCE = 2;
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbPortStatus> CREATOR = null;
    public static final int DATA_ROLE_DEVICE = 2;
    public static final int DATA_ROLE_HOST = 1;
    public static final int DATA_ROLE_NONE = 0;
    public static final int DATA_STATUS_DISABLED_CONTAMINANT = 4;
    public static final int DATA_STATUS_DISABLED_DEBUG = 32;
    public static final int DATA_STATUS_DISABLED_DOCK = 8;
    public static final int DATA_STATUS_DISABLED_DOCK_DEVICE_MODE = 128;
    public static final int DATA_STATUS_DISABLED_DOCK_HOST_MODE = 64;
    public static final int DATA_STATUS_DISABLED_FORCE = 16;
    public static final int DATA_STATUS_DISABLED_OVERHEAT = 2;
    public static final int DATA_STATUS_ENABLED = 1;
    public static final int DATA_STATUS_UNKNOWN = 0;
    public static final int MODE_AUDIO_ACCESSORY = 4;
    public static final int MODE_DEBUG_ACCESSORY = 8;
    public static final int MODE_DFP = 2;
    public static final int MODE_DUAL = 3;
    public static final int MODE_NONE = 0;
    public static final int MODE_UFP = 1;
    public static final int PLUG_STATE_PLUGGED_ORIENTATION_FLIPPED = 4;
    public static final int PLUG_STATE_PLUGGED_ORIENTATION_NORMAL = 3;
    public static final int PLUG_STATE_PLUGGED_ORIENTATION_UNKNOWN = 2;
    public static final int PLUG_STATE_UNKNOWN = 0;
    public static final int PLUG_STATE_UNPLUGGED = 1;
    public static final int POWER_BRICK_STATUS_CONNECTED = 1;
    public static final int POWER_BRICK_STATUS_DISCONNECTED = 2;
    public static final int POWER_BRICK_STATUS_UNKNOWN = 0;
    public static final int POWER_ROLE_NONE = 0;
    public static final int POWER_ROLE_SINK = 2;
    public static final int POWER_ROLE_SOURCE = 1;
    private static final java.lang.String TAG = "UsbPortStatus";
    private final int[] mComplianceWarnings = null;
    private final int mContaminantDetectionStatus = 0;
    private final int mContaminantProtectionStatus = 0;
    private final int mCurrentDataRole = 0;
    private final int mCurrentMode = 0;
    private final int mCurrentPowerRole = 0;
    private final android.hardware.usb.DisplayPortAltModeInfo mDisplayPortAltModeInfo = null;
    private final int mPartnerBc12Type = 0;
    private final java.util.List<android.hardware.usb.PowerProfileInfo> mPartnerSinkPowerProfiles = null;
    private final java.util.List<android.hardware.usb.PowerProfileInfo> mPartnerSourcePowerProfiles = null;
    private final int mPlugState = 0;
    private final java.util.List<android.hardware.usb.PowerProfileMatchInfo> mPortSinkPowerProfileMatches = null;
    private final java.util.List<android.hardware.usb.PowerProfileInfo> mPortSinkPowerProfiles = null;
    private final java.util.List<android.hardware.usb.PowerProfileMatchInfo> mPortSourcePowerProfileMatches = null;
    private final java.util.List<android.hardware.usb.PowerProfileInfo> mPortSourcePowerProfiles = null;
    private final int mPowerBrickConnectionStatus = 0;
    private final boolean mPowerTransferLimited = false;
    private final int mSupportedRoleCombinations = 0;
    private final int mUsbDataStatus = 0;
    public UsbPortStatus(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public UsbPortStatus(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, int p8) {}
    public UsbPortStatus(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, int p8, int[] p9, int p10, android.hardware.usb.DisplayPortAltModeInfo p11) {}
    public UsbPortStatus(android.hardware.usb.UsbPortStatus.Builder p0) {}
    public int describeContents() { return 0; }
    public int[] getComplianceWarnings() { return null; }
    public int getContaminantDetectionStatus() { return 0; }
    public int getContaminantProtectionStatus() { return 0; }
    public int getCurrentDataRole() { return 0; }
    public int getCurrentMode() { return 0; }
    public int getCurrentPowerRole() { return 0; }
    public android.hardware.usb.DisplayPortAltModeInfo getDisplayPortAltModeInfo() { return null; }
    public int getPartnerBc12Type() { return 0; }
    public java.util.List<android.hardware.usb.PowerProfileInfo> getPartnerSinkPowerProfiles() { return null; }
    public java.util.List<android.hardware.usb.PowerProfileInfo> getPartnerSourcePowerProfiles() { return null; }
    public int getPlugState() { return 0; }
    public java.util.List<android.hardware.usb.PowerProfileInfo> getPortSinkPowerProfiles() { return null; }
    public java.util.List<android.hardware.usb.PowerProfileInfo> getPortSourcePowerProfiles() { return null; }
    public int getPowerBrickConnectionStatus() { return 0; }
    public java.lang.String getPowerProfileInfoString() { return null; }
    public int getSupportedRoleCombinations() { return 0; }
    public int getUsbDataStatus() { return 0; }
    public boolean isConnected() { return false; }
    public boolean isPdCompliant() { return false; }
    public boolean isPowerTransferLimited() { return false; }
    public boolean isRoleCombinationSupported(int p0, int p1) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Bc12Type {
    }

    public static final class Builder {
        private int[] mComplianceWarnings;
        private int mContaminantDetectionStatus;
        private int mContaminantProtectionStatus;
        private int mCurrentDataRole;
        private int mCurrentMode;
        private int mCurrentPowerRole;
        private android.hardware.usb.DisplayPortAltModeInfo mDisplayPortAltModeInfo;
        private int mPartnerBc12Type;
        private java.util.List<android.hardware.usb.PowerProfileInfo> mPartnerSinkPowerProfiles;
        private java.util.List<android.hardware.usb.PowerProfileInfo> mPartnerSourcePowerProfiles;
        private int mPlugState;
        private java.util.List<android.hardware.usb.PowerProfileMatchInfo> mPortSinkPowerProfileMatches;
        private java.util.List<android.hardware.usb.PowerProfileInfo> mPortSinkPowerProfiles;
        private java.util.List<android.hardware.usb.PowerProfileMatchInfo> mPortSourcePowerProfileMatches;
        private java.util.List<android.hardware.usb.PowerProfileInfo> mPortSourcePowerProfiles;
        private int mPowerBrickConnectionStatus;
        private boolean mPowerTransferLimited;
        private int mSupportedRoleCombinations;
        private int mUsbDataStatus;
        public Builder() {}
        public android.hardware.usb.UsbPortStatus build() { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setComplianceWarnings(int[] p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setContaminantStatus(int p0, int p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setCurrentMode(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setCurrentRoles(int p0, int p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setDisplayPortAltModeInfo(android.hardware.usb.DisplayPortAltModeInfo p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPartnerBc12Type(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPartnerPowerProfiles(java.util.List<android.hardware.usb.PowerProfileInfo> p0, java.util.List<android.hardware.usb.PowerProfileInfo> p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPlugState(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPortPowerProfiles(java.util.List<android.hardware.usb.PowerProfileInfo> p0, java.util.List<android.hardware.usb.PowerProfileInfo> p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPowerBrickConnectionStatus(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPowerProfileMatchInfo(java.util.List<android.hardware.usb.PowerProfileMatchInfo> p0, java.util.List<android.hardware.usb.PowerProfileMatchInfo> p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPowerTransferLimited(boolean p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setSupportedRoleCombinations(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setUsbDataStatus(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ComplianceWarning {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContaminantDetectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContaminantProtectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PlugState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PowerBrickConnectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbDataRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbDataStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbPortMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbPowerRole {
    }
}
