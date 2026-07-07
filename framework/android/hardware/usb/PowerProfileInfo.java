package android.hardware.usb;

@android.annotation.SystemApi
public final class PowerProfileInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.PowerProfileInfo> CREATOR = null;
    public static final int POWER_PROFILE_ERROR_FIELD_NOT_SUPPORTED = -2;
    public static final int POWER_PROFILE_ERROR_NO_MATCH = -3;
    public static final int POWER_PROFILE_ERROR_OTHER = -1;
    public static final int POWER_PROFILE_TYPE_BATTERY = 7;
    public static final int POWER_PROFILE_TYPE_FIXED = 6;
    public static final int POWER_PROFILE_TYPE_NONE = 0;
    public static final int POWER_PROFILE_TYPE_OTHER = 1;
    public static final int POWER_PROFILE_TYPE_RP_1_5A = 4;
    public static final int POWER_PROFILE_TYPE_RP_3_0A = 5;
    public static final int POWER_PROFILE_TYPE_RP_DEFAULT = 3;
    public static final int POWER_PROFILE_TYPE_SPR_AVS = 10;
    public static final int POWER_PROFILE_TYPE_SPR_PPS = 9;
    public static final int POWER_PROFILE_TYPE_VARIABLE = 8;
    public static final int POWER_PROFILE_TYPE_VENDOR = 2;
    private java.util.List<android.hardware.usb.PowerProfileMatchInfo> mMatchResults;
    private java.util.List<android.hardware.usb.PowerProfileInfo> mMatchingProfiles;
    private final int mMaxCurrentMa = 0;
    private final int mMaxPowerMw = 0;
    private final int mMaxVoltageMv = 0;
    private final int mMinCurrentMa = 0;
    private final int mMinVoltageMv = 0;
    private final java.lang.String mName = null;
    private final int mPowerProfileType = 0;
    public PowerProfileInfo(android.hardware.usb.PowerProfileInfo.Builder p0) {}
    private android.hardware.usb.PowerProfileMatchInfo getPowerProfileMatchInfo(android.hardware.usb.PowerProfileInfo p0) { return null; }
    private java.lang.String powerProfileTypeToString(int p0) { return null; }
    public void addMatchingPowerProfile(android.hardware.usb.PowerProfileInfo p0, android.hardware.usb.PowerProfileMatchInfo p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getMatchingMaxCurrentMa(android.hardware.usb.PowerProfileInfo p0) { return 0; }
    public int getMatchingMaxPowerMw(android.hardware.usb.PowerProfileInfo p0) { return 0; }
    public int getMatchingMaxVoltageMv(android.hardware.usb.PowerProfileInfo p0) { return 0; }
    public int getMatchingMinCurrentMa(android.hardware.usb.PowerProfileInfo p0) { return 0; }
    public int getMatchingMinVoltageMv(android.hardware.usb.PowerProfileInfo p0) { return 0; }
    public java.util.List<android.hardware.usb.PowerProfileInfo> getMatchingPartnerProfiles() { return null; }
    public int getMaxCurrentMa() { return 0; }
    public int getMaxPowerMw() { return 0; }
    public int getMaxVoltageMv() { return 0; }
    public int getMinCurrentMa() { return 0; }
    public int getMinVoltageMv() { return 0; }
    public java.lang.String getName() { return null; }
    public int getPowerProfileType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mMaxCurrentMa;
        private int mMaxPowerMw;
        private int mMaxVoltageMv;
        private int mMinCurrentMa;
        private int mMinVoltageMv;
        private java.lang.String mName;
        private int mPowerProfileType;
        public Builder() {}
        public android.hardware.usb.PowerProfileInfo build() { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setMaxCurrentMa(int p0) { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setMaxPowerMw(int p0) { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setMaxVoltageMv(int p0) { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setMinCurrentMa(int p0) { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setMinVoltageMv(int p0) { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setName(java.lang.String p0) { return null; }
        public android.hardware.usb.PowerProfileInfo.Builder setPowerProfileType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PowerProfileError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PowerProfileType {
    }
}
