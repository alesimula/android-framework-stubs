package android.hardware.power;

public class FrameProducer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.FrameProducer> CREATOR = null;
    public boolean cpuDeadlineMissed;
    public android.hardware.power.LatchedFrameData currentlyLatchedFrame;
    public double fps;
    public boolean gpuDeadlineMissed;
    public long producerId;
    public int uid;
    public FrameProducer() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
