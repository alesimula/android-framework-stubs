package android.app.time;

public final class TimeZoneDetectorStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeZoneDetectorStatus> CREATOR = null;
    private final int mDetectorStatus = 0;
    private final android.app.time.LocationTimeZoneAlgorithmStatus mLocationTimeZoneAlgorithmStatus = null;
    private final android.app.time.TelephonyTimeZoneAlgorithmStatus mTelephonyTimeZoneAlgorithmStatus = null;
    public TimeZoneDetectorStatus(int p0, android.app.time.TelephonyTimeZoneAlgorithmStatus p1, android.app.time.LocationTimeZoneAlgorithmStatus p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDetectorStatus() { return 0; }
    public android.app.time.LocationTimeZoneAlgorithmStatus getLocationTimeZoneAlgorithmStatus() { return null; }
    public android.app.time.TelephonyTimeZoneAlgorithmStatus getTelephonyTimeZoneAlgorithmStatus() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
