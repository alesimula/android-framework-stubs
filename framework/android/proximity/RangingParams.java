package android.proximity;

public final class RangingParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.proximity.RangingParams> CREATOR = null;
    private static final double DEFAULT_THRESHOLD_METERS = 1.5;
    private static final int DEFAULT_TIMEOUT_MILLIS = 5000;
    private final double mThresholdMeters = 0.0;
    private final int mTimeoutMillis = 0;
    private RangingParams(double p0, int p1) {}
    public int describeContents() { return 0; }
    public double getDefaultThresholdMeters() { return 0.0; }
    public int getDefaultTimeoutMillis() { return 0; }
    public double getThresholdMeters() { return 0.0; }
    public int getTimeoutMillis() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private double mThresholdMeters;
        private int mTimeoutMillis;
        public Builder() {}
        public Builder(android.proximity.RangingParams p0) {}
        public android.proximity.RangingParams build() { return null; }
        public android.proximity.RangingParams.Builder setThresholdMeters(double p0) { return null; }
        public android.proximity.RangingParams.Builder setTimeoutMillis(int p0) { return null; }
    }
}
