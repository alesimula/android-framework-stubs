package android.hardware.power;

public class CompositionUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.CompositionUpdate> CREATOR = null;
    public long[] deadOutputIds;
    public android.hardware.power.FrameProducerUpdate[] producerUpdates;
    public long timestampNanos;
    public CompositionUpdate() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
