package android.telephony;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class CallAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CallAttributes> CREATOR = null;
    private android.telephony.CallQuality mCallQuality;
    private int mNetworkType;
    private android.telephony.PreciseCallState mPreciseCallState;
    private CallAttributes(android.os.Parcel p0) {}
    public CallAttributes(android.telephony.PreciseCallState p0, int p1, android.telephony.CallQuality p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.CallQuality getCallQuality() { return null; }
    public int getNetworkType() { return 0; }
    public android.telephony.PreciseCallState getPreciseCallState() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
