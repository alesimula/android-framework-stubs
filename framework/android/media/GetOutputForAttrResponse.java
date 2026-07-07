package android.media;

public class GetOutputForAttrResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.GetOutputForAttrResponse> CREATOR = null;
    public android.media.audio.common.AudioAttributes attr;
    public android.media.audio.common.AudioConfigBase configBase;
    public boolean isBitPerfect;
    public boolean isSpatialized;
    public int output;
    public int portId;
    public int[] secondaryOutputs;
    public int[] selectedDeviceIds;
    public int stream;
    public GetOutputForAttrResponse() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
