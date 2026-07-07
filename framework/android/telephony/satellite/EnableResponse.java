package android.telephony.satellite;

@android.annotation.SystemApi
public final class EnableResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.EnableResponse> CREATOR = null;
    private boolean mIsDemoMode;
    private boolean mIsEmergencyMode;
    private boolean mIsEnabled;
    private int[] mSatelliteEnablementRequestReasons;
    private EnableResponse(android.os.Parcel p0) {}
    public EnableResponse(boolean p0, boolean p1, boolean p2, int[] p3) {}
    public int describeContents() { return 0; }
    public int[] getSatelliteEnablementRequestReasons() { return null; }
    public boolean isDemoMode() { return false; }
    public boolean isEmergencyMode() { return false; }
    public boolean isEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
