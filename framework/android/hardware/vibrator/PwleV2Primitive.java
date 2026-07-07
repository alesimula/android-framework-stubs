package android.hardware.vibrator;

public class PwleV2Primitive implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.PwleV2Primitive> CREATOR = null;
    public float amplitude;
    public float frequencyHz;
    public int timeMillis;
    public PwleV2Primitive() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
