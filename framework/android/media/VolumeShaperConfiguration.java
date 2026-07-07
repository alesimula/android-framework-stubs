package android.media;

public class VolumeShaperConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.VolumeShaperConfiguration> CREATOR = null;
    public double durationMs;
    public int id;
    public android.media.InterpolatorConfig interpolatorConfig;
    public int optionFlags;
    public int type;
    public VolumeShaperConfiguration() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
