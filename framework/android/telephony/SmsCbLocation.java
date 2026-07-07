package android.telephony;

@android.annotation.SystemApi
public final class SmsCbLocation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.SmsCbLocation> CREATOR = null;
    private static final java.lang.String TAG = "SmsCbLocation";
    private final int mCid = 0;
    private final int mLac = 0;
    private final java.lang.String mPlmn = null;
    public SmsCbLocation() {}
    public SmsCbLocation(android.os.Parcel p0) {}
    public SmsCbLocation(java.lang.String p0) {}
    public SmsCbLocation(java.lang.String p0, int p1, int p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCid() { return 0; }
    public int getLac() { return 0; }
    public java.lang.String getPlmn() { return null; }
    public int hashCode() { return 0; }
    public boolean isInLocationArea(android.telephony.SmsCbLocation p0) { return false; }
    public boolean isInLocationArea(java.lang.String p0, int p1, int p2) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
