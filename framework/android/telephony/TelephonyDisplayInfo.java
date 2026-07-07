package android.telephony;

public final class TelephonyDisplayInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.TelephonyDisplayInfo> CREATOR = null;
    public static final int OVERRIDE_NETWORK_TYPE_LTE_ADVANCED_PRO = 2;
    public static final int OVERRIDE_NETWORK_TYPE_LTE_CA = 1;
    public static final int OVERRIDE_NETWORK_TYPE_NONE = 0;
    public static final int OVERRIDE_NETWORK_TYPE_NR_ADVANCED = 5;
    public static final int OVERRIDE_NETWORK_TYPE_NR_NSA = 3;
    @java.lang.Deprecated
    public static final int OVERRIDE_NETWORK_TYPE_NR_NSA_MMWAVE = 4;
    private final boolean mIsNtn = false;
    private final boolean mIsRoaming = false;
    private final boolean mIsSatelliteConstrainedData = false;
    private final int mNetworkType = 0;
    private final int mOverrideNetworkType = 0;
    @java.lang.Deprecated
    public TelephonyDisplayInfo(int p0, int p1) {}
    @java.lang.Deprecated
    public TelephonyDisplayInfo(int p0, int p1, boolean p2) {}
    public TelephonyDisplayInfo(int p0, int p1, boolean p2, boolean p3, boolean p4) {}
    public TelephonyDisplayInfo(android.os.Parcel p0) {}
    public static java.lang.String overrideNetworkTypeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getNetworkType() { return 0; }
    public int getOverrideNetworkType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isNtn() { return false; }
    public boolean isRoaming() { return false; }
    public boolean isSatelliteConstrainedData() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
