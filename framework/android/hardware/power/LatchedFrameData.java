package android.hardware.power;

public class LatchedFrameData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.LatchedFrameData> CREATOR = null;
    public long bufferSubmissionTimestampNanos;
    public long frameStartTimestampNanos;
    public android.os.ParcelFileDescriptor gpuAcquireFence;
    public long gpuSignalTimestampNanos;
    public long intendedPresentTimestampNanos;
    public boolean usedGpu;
    public LatchedFrameData() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
