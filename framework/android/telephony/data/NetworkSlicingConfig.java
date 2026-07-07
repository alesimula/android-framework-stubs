package android.telephony.data;

public final class NetworkSlicingConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.data.NetworkSlicingConfig> CREATOR = null;
    private final java.util.List<android.telephony.data.NetworkSliceInfo> mSliceInfo = null;
    private final java.util.List<android.telephony.data.UrspRule> mUrspRules = null;
    public NetworkSlicingConfig() {}
    public NetworkSlicingConfig(android.os.Parcel p0) {}
    public NetworkSlicingConfig(java.util.List<android.telephony.data.UrspRule> p0, java.util.List<android.telephony.data.NetworkSliceInfo> p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.telephony.data.NetworkSliceInfo> getSliceInfo() { return null; }
    public java.util.List<android.telephony.data.UrspRule> getUrspRules() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
