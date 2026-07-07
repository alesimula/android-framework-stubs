package android.os.connectivity;

public final class GpsBatteryStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.connectivity.GpsBatteryStats> CREATOR = null;
    private long mEnergyConsumedMaMs;
    private long mLoggingDurationMs;
    private long[] mTimeInGpsSignalQualityLevel;
    public GpsBatteryStats() {}
    private GpsBatteryStats(android.os.Parcel p0) {}
    private void initialize() {}
    public int describeContents() { return 0; }
    public long getEnergyConsumedMaMs() { return 0L; }
    public long getLoggingDurationMs() { return 0L; }
    public long[] getTimeInGpsSignalQualityLevel() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setEnergyConsumedMaMs(long p0) {}
    public void setLoggingDurationMs(long p0) {}
    public void setTimeInGpsSignalQualityLevel(long[] p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
