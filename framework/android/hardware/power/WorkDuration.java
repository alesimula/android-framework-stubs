package android.hardware.power;

public class WorkDuration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.WorkDuration> CREATOR = null;
    public long cpuDurationNanos;
    public long durationNanos;
    public long gpuDurationNanos;
    public long intendedPresentTimestampNanos;
    public long timeStampNanos;
    public long workPeriodStartTimestampNanos;
    public WorkDuration() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
