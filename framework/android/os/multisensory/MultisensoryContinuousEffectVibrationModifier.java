package android.os.multisensory;

public class MultisensoryContinuousEffectVibrationModifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.multisensory.MultisensoryContinuousEffectVibrationModifier> CREATOR = null;
    public float amplitude;
    public float frequencyHz;
    public int rampDurationMillis;
    public MultisensoryContinuousEffectVibrationModifier() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
