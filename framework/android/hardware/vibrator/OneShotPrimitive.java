package android.hardware.vibrator;

public class OneShotPrimitive implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.OneShotPrimitive> CREATOR = null;
    public float amplitude;
    public int timeMillis;
    public OneShotPrimitive() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
