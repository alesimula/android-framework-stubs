package android.media;

public class SoundDoseRecord implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.SoundDoseRecord> CREATOR = null;
    public float averageMel;
    public int duration;
    public long timestamp;
    public float value;
    public SoundDoseRecord() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
