package android.hardware.vibrator;

public class ActivePwle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.ActivePwle> CREATOR = null;
    public int duration;
    public float endAmplitude;
    public float endFrequency;
    public float startAmplitude;
    public float startFrequency;
    public ActivePwle() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
