package android.hardware.vibrator;

public class CompositeEffect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.CompositeEffect> CREATOR = null;
    public int delayMs;
    public int primitive;
    public float scale;
    public CompositeEffect() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
