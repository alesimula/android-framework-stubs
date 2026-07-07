package android.telephony;

@android.annotation.SystemApi
public abstract class VopsSupportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.VopsSupportInfo> CREATOR = null;
    public VopsSupportInfo() {}
    public int describeContents() { return 0; }
    public abstract boolean equals(java.lang.Object p0);
    public abstract int hashCode();
    public abstract boolean isEmergencyServiceFallbackSupported();
    public abstract boolean isEmergencyServiceSupported();
    public abstract boolean isVopsSupported();
    public abstract void writeToParcel(android.os.Parcel p0, int p1);
    protected void writeToParcel(android.os.Parcel p0, int p1, int p2) {}
}
