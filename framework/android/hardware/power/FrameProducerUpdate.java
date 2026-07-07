package android.hardware.power;

public class FrameProducerUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.FrameProducerUpdate> CREATOR = null;
    public boolean isDead;
    public long producerId;
    public int[] sessions;
    public FrameProducerUpdate() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
