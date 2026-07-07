package android.hardware.hdmi;

@android.annotation.SystemApi
public class HdmiDeviceInfo implements android.os.Parcelable {
    public static final int ADDR_INTERNAL = 0;
    public static final int ADDR_INVALID = -1;
    public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiDeviceInfo> CREATOR = null;
    public static final int DEVICE_AUDIO_SYSTEM = 5;
    public static final int DEVICE_INACTIVE = -1;
    public static final int DEVICE_PLAYBACK = 4;
    public static final int DEVICE_PURE_CEC_SWITCH = 6;
    public static final int DEVICE_RECORDER = 1;
    public static final int DEVICE_RESERVED = 2;
    public static final int DEVICE_TUNER = 3;
    public static final int DEVICE_TV = 0;
    public static final int DEVICE_VIDEO_PROCESSOR = 7;
    private static final int HDMI_DEVICE_TYPE_CEC = 0;
    private static final int HDMI_DEVICE_TYPE_HARDWARE = 2;
    private static final int HDMI_DEVICE_TYPE_INACTIVE = 100;
    private static final int HDMI_DEVICE_TYPE_MHL = 1;
    public static final int ID_INVALID = 65535;
    private static final int ID_OFFSET_CEC = 0;
    private static final int ID_OFFSET_HARDWARE = 192;
    private static final int ID_OFFSET_MHL = 128;
    public static final android.hardware.hdmi.HdmiDeviceInfo INACTIVE_DEVICE = null;
    public static final int PATH_INTERNAL = 0;
    public static final int PATH_INVALID = 65535;
    public static final int PORT_INVALID = -1;
    public static final int VENDOR_ID_UNKNOWN = 16777215;
    private final int mAdopterId = 0;
    private final int mCecVersion = 0;
    private final android.hardware.hdmi.DeviceFeatures mDeviceFeatures = null;
    private final int mDeviceId = 0;
    private final int mDevicePowerStatus = 0;
    private final int mDeviceType = 0;
    private final java.lang.String mDisplayName = null;
    private final int mHdmiDeviceType = 0;
    private final int mId = 0;
    private final int mLogicalAddress = 0;
    private final int mPhysicalAddress = 0;
    private final int mPortId = 0;
    private final int mVendorId = 0;
    @java.lang.Deprecated
    public HdmiDeviceInfo() {}
    private HdmiDeviceInfo(android.hardware.hdmi.HdmiDeviceInfo.Builder p0) {}
    public static android.hardware.hdmi.HdmiDeviceInfo.Builder cecDeviceBuilder() { return null; }
    public static android.hardware.hdmi.HdmiDeviceInfo hardwarePort(int p0, int p1) { return null; }
    public static int idForCecDevice(int p0) { return 0; }
    public static int idForHardware(int p0) { return 0; }
    public static int idForMhlDevice(int p0) { return 0; }
    public static android.hardware.hdmi.HdmiDeviceInfo mhlDevice(int p0, int p1, int p2, int p3) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAdopterId() { return 0; }
    public int getCecVersion() { return 0; }
    public android.hardware.hdmi.DeviceFeatures getDeviceFeatures() { return null; }
    public int getDeviceId() { return 0; }
    public int getDevicePowerStatus() { return 0; }
    public int getDeviceType() { return 0; }
    public java.lang.String getDisplayName() { return null; }
    public int getId() { return 0; }
    public int getLogicalAddress() { return 0; }
    public int getPhysicalAddress() { return 0; }
    public int getPortId() { return 0; }
    public int getVendorId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isCecDevice() { return false; }
    public boolean isInactivated() { return false; }
    public boolean isMhlDevice() { return false; }
    public boolean isSourceType() { return false; }
    public android.hardware.hdmi.HdmiDeviceInfo.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAdopterId;
        private int mCecVersion;
        private android.hardware.hdmi.DeviceFeatures mDeviceFeatures;
        private int mDeviceId;
        private int mDevicePowerStatus;
        private int mDeviceType;
        private java.lang.String mDisplayName;
        private final int mHdmiDeviceType = 0;
        private int mLogicalAddress;
        private int mPhysicalAddress;
        private int mPortId;
        private int mVendorId;
        private Builder(int p0) {}
        private Builder(android.hardware.hdmi.HdmiDeviceInfo p0) {}
        public android.hardware.hdmi.HdmiDeviceInfo build() { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setAdopterId(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setCecVersion(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDeviceFeatures(android.hardware.hdmi.DeviceFeatures p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDeviceId(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDevicePowerStatus(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDeviceType(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDisplayName(java.lang.String p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setLogicalAddress(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setPhysicalAddress(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setPortId(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setVendorId(int p0) { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo.Builder updateDeviceFeatures(android.hardware.hdmi.DeviceFeatures p0) { return null; }
    }
}
