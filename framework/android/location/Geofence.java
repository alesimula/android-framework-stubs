package android.location;

public final class Geofence implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.Geofence> CREATOR = null;
    private long mExpirationRealtimeMs;
    private final double mLatitude = 0.0;
    private final double mLongitude = 0.0;
    private final float mRadius = 0.0f;
    Geofence(double p0, double p1, float p2, long p3) {}
    public static android.location.Geofence createCircle(double p0, double p1, float p2, long p3) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public float getRadius() { return 0.0f; }
    public int hashCode() { return 0; }
    public boolean isExpired() { return false; }
    public boolean isExpired(long p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
