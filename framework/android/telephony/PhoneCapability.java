package android.telephony;

@android.annotation.SystemApi
public final class PhoneCapability implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.PhoneCapability> CREATOR = null;
    public static final android.telephony.PhoneCapability DEFAULT_DSDS_CAPABILITY = null;
    public static final android.telephony.PhoneCapability DEFAULT_SSSS_CAPABILITY = null;
    @android.annotation.SystemApi
    public static final int DEVICE_NR_CAPABILITY_NSA = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_NR_CAPABILITY_SA = 2;
    private final int[] mDeviceNrCapabilities = null;
    private final java.util.List<android.telephony.ModemInfo> mLogicalModemList = null;
    private final int mMaxActiveDataSubscriptions = 0;
    private final int mMaxActiveVoiceSubscriptions = 0;
    private final boolean mNetworkValidationBeforeSwitchSupported = false;
    public PhoneCapability(int p0, int p1, java.util.List<android.telephony.ModemInfo> p2, boolean p3, int[] p4) {}
    private PhoneCapability(android.os.Parcel p0) {}
    private PhoneCapability(android.telephony.PhoneCapability.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public int[] getDeviceNrCapabilities() { return null; }
    public java.util.List<android.telephony.ModemInfo> getLogicalModemList() { return null; }
    @android.annotation.SystemApi
    public int getMaxActiveDataSubscriptions() { return 0; }
    @android.annotation.SystemApi
    public int getMaxActiveVoiceSubscriptions() { return 0; }
    public int hashCode() { return 0; }
    public boolean isNetworkValidationBeforeSwitchSupported() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private int[] mDeviceNrCapabilities;
        private java.util.List<android.telephony.ModemInfo> mLogicalModemList;
        private int mMaxActiveDataSubscriptions;
        private int mMaxActiveVoiceSubscriptions;
        private boolean mNetworkValidationBeforeSwitchSupported;
        public Builder() {}
        public Builder(android.telephony.PhoneCapability p0) {}
        public android.telephony.PhoneCapability build() { return null; }
        public android.telephony.PhoneCapability.Builder setDeviceNrCapabilities(int[] p0) { return null; }
        public android.telephony.PhoneCapability.Builder setLogicalModemList(java.util.List<android.telephony.ModemInfo> p0) { return null; }
        public android.telephony.PhoneCapability.Builder setMaxActiveDataSubscriptions(int p0) { return null; }
        public android.telephony.PhoneCapability.Builder setMaxActiveVoiceSubscriptions(int p0) { return null; }
        public android.telephony.PhoneCapability.Builder setNetworkValidationBeforeSwitchSupported(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceNrCapability {
    }
}
