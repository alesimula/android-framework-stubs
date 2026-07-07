package android.hardware.power;

public class CompositionData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.CompositionData> CREATOR = null;
    public long latchTimestampNanos;
    public long[] outputIds;
    public android.hardware.power.FrameProducer[] producers;
    public long[] scheduledPresentTimestampsNanos;
    public long timestampNanos;
    public android.hardware.power.CompositionUpdate updateData;
    public CompositionData() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
