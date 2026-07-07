package android.media;

public class AudioVibratorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioVibratorInfo> CREATOR = null;
    public int id;
    public float maxAmplitude;
    public float qFactor;
    public float resonantFrequency;
    public AudioVibratorInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
