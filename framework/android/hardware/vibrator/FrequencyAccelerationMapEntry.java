package android.hardware.vibrator;

public class FrequencyAccelerationMapEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.FrequencyAccelerationMapEntry> CREATOR = null;
    public float frequencyHz;
    public float maxOutputAccelerationGs;
    public FrequencyAccelerationMapEntry() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
