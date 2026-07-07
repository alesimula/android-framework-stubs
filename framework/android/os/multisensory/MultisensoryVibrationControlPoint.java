package android.os.multisensory;

public class MultisensoryVibrationControlPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.multisensory.MultisensoryVibrationControlPoint> CREATOR = null;
    public float amplitude;
    public float frequencyHz;
    public int timeMillis;
    public MultisensoryVibrationControlPoint() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
