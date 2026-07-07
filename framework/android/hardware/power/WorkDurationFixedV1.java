package android.hardware.power;

public class WorkDurationFixedV1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.WorkDurationFixedV1> CREATOR = null;
    public long cpuDurationNanos;
    public long durationNanos;
    public long gpuDurationNanos;
    public long workPeriodStartTimestampNanos;
    public WorkDurationFixedV1() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
