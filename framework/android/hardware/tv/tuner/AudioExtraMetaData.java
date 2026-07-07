package android.hardware.tv.tuner;

public class AudioExtraMetaData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.AudioExtraMetaData> CREATOR = null;
    public byte adFade;
    public byte adGainCenter;
    public byte adGainFront;
    public byte adGainSurround;
    public byte adPan;
    public char versionTextTag;
    public AudioExtraMetaData() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
