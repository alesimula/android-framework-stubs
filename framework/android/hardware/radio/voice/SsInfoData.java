package android.hardware.radio.voice;

public class SsInfoData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.SsInfoData> CREATOR = null;
    public static final int SS_INFO_MAX = 4;
    public int[] ssInfo;
    public SsInfoData() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
