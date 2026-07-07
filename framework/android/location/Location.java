package android.location;

public class Location implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.Location> CREATOR = null;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NO_GPS_LOCATION = "noGPSLocation";
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    private static final int HAS_ALTITUDE_ACCURACY_MASK = 32;
    private static final int HAS_ALTITUDE_MASK = 1;
    private static final int HAS_BEARING_ACCURACY_MASK = 128;
    private static final int HAS_BEARING_MASK = 4;
    private static final int HAS_ELAPSED_REALTIME_UNCERTAINTY_MASK = 256;
    private static final int HAS_HORIZONTAL_ACCURACY_MASK = 8;
    private static final int HAS_MOCK_PROVIDER_MASK = 16;
    private static final int HAS_MSL_ALTITUDE_ACCURACY_MASK = 1024;
    private static final int HAS_MSL_ALTITUDE_MASK = 512;
    private static final int HAS_SPEED_ACCURACY_MASK = 64;
    private static final int HAS_SPEED_MASK = 2;
    private static final java.lang.ThreadLocal<android.location.Location.BearingDistanceCache> sBearingDistanceCache = null;
    private float mAltitudeAccuracyMeters;
    private double mAltitudeMeters;
    private float mBearingAccuracyDegrees;
    private float mBearingDegrees;
    private long mElapsedRealtimeNs;
    private double mElapsedRealtimeUncertaintyNs;
    private android.os.Bundle mExtras;
    private int mFieldsMask;
    private float mHorizontalAccuracyMeters;
    private double mLatitudeDegrees;
    private double mLongitudeDegrees;
    private float mMslAltitudeAccuracyMeters;
    private double mMslAltitudeMeters;
    private java.lang.String mProvider;
    private float mSpeedAccuracyMetersPerSecond;
    private float mSpeedMetersPerSecond;
    private long mTimeMs;
    public Location(android.location.Location p0) {}
    public Location(java.lang.String p0) {}
    private static boolean areExtrasEqual(android.os.Bundle p0, android.os.Bundle p1) { return false; }
    private static void computeDistanceAndBearing(double p0, double p1, double p2, double p3, android.location.Location.BearingDistanceCache p4) {}
    public static double convert(java.lang.String p0) { return 0.0; }
    public static java.lang.String convert(double p0, int p1) { return null; }
    public static void distanceBetween(double p0, double p1, double p2, double p3, float[] p4) {}
    public float bearingTo(android.location.Location p0) { return 0.0f; }
    public int describeContents() { return 0; }
    public float distanceTo(android.location.Location p0) { return 0.0f; }
    @java.lang.Deprecated
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public float getAccuracy() { return 0.0f; }
    public double getAltitude() { return 0.0; }
    public float getBearing() { return 0.0f; }
    public float getBearingAccuracyDegrees() { return 0.0f; }
    public long getElapsedRealtimeAgeMillis() { return 0L; }
    public long getElapsedRealtimeAgeMillis(long p0) { return 0L; }
    public long getElapsedRealtimeMillis() { return 0L; }
    public long getElapsedRealtimeNanos() { return 0L; }
    public double getElapsedRealtimeUncertaintyNanos() { return 0.0; }
    public android.os.Bundle getExtras() { return null; }
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public float getMslAltitudeAccuracyMeters() { return 0.0f; }
    public double getMslAltitudeMeters() { return 0.0; }
    public java.lang.String getProvider() { return null; }
    public float getSpeed() { return 0.0f; }
    public float getSpeedAccuracyMetersPerSecond() { return 0.0f; }
    public long getTime() { return 0L; }
    public float getVerticalAccuracyMeters() { return 0.0f; }
    public boolean hasAccuracy() { return false; }
    public boolean hasAltitude() { return false; }
    public boolean hasBearing() { return false; }
    public boolean hasBearingAccuracy() { return false; }
    public boolean hasElapsedRealtimeUncertaintyNanos() { return false; }
    public boolean hasMslAltitude() { return false; }
    public boolean hasMslAltitudeAccuracy() { return false; }
    public boolean hasSpeed() { return false; }
    public boolean hasSpeedAccuracy() { return false; }
    public boolean hasVerticalAccuracy() { return false; }
    public int hashCode() { return 0; }
    public boolean isComplete() { return false; }
    @java.lang.Deprecated
    public boolean isFromMockProvider() { return false; }
    public boolean isMock() { return false; }
    @android.annotation.SystemApi
    public void makeComplete() {}
    public void removeAccuracy() {}
    public void removeAltitude() {}
    public void removeBearing() {}
    public void removeBearingAccuracy() {}
    public void removeElapsedRealtimeUncertaintyNanos() {}
    public void removeMslAltitude() {}
    public void removeMslAltitudeAccuracy() {}
    public void removeSpeed() {}
    public void removeSpeedAccuracy() {}
    public void removeVerticalAccuracy() {}
    public void reset() {}
    public void set(android.location.Location p0) {}
    public void setAccuracy(float p0) {}
    public void setAltitude(double p0) {}
    public void setBearing(float p0) {}
    public void setBearingAccuracyDegrees(float p0) {}
    public void setElapsedRealtimeNanos(long p0) {}
    public void setElapsedRealtimeUncertaintyNanos(double p0) {}
    public void setExtras(android.os.Bundle p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setIsFromMockProvider(boolean p0) {}
    public void setLatitude(double p0) {}
    public void setLongitude(double p0) {}
    public void setMock(boolean p0) {}
    public void setMslAltitudeAccuracyMeters(float p0) {}
    public void setMslAltitudeMeters(double p0) {}
    public void setProvider(java.lang.String p0) {}
    public void setSpeed(float p0) {}
    public void setSpeedAccuracyMetersPerSecond(float p0) {}
    public void setTime(long p0) {}
    public void setVerticalAccuracyMeters(float p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class BearingDistanceCache {
        float mDistance;
        float mFinalBearing;
        float mInitialBearing;
        double mLat1;
        double mLat2;
        double mLon1;
        double mLon2;
        private BearingDistanceCache() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }
}
