package android.hardware.display;

@android.annotation.SystemApi
public final class AmbientBrightnessDayStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.AmbientBrightnessDayStats> CREATOR = null;
    private final float[] mBucketBoundaries = null;
    private final java.time.LocalDate mLocalDate = null;
    private final float[] mStats = null;
    private AmbientBrightnessDayStats(android.os.Parcel p0) {}
    public AmbientBrightnessDayStats(java.time.LocalDate p0, float[] p1) {}
    public AmbientBrightnessDayStats(java.time.LocalDate p0, float[] p1, float[] p2) {}
    private static void checkSorted(float[] p0) {}
    private int getBucketIndex(float p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public float[] getBucketBoundaries() { return null; }
    public java.time.LocalDate getLocalDate() { return null; }
    public float[] getStats() { return null; }
    public int hashCode() { return 0; }
    public void log(float p0, float p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
