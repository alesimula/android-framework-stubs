package android.media;

public class GetInputForAttrResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.GetInputForAttrResponse> CREATOR = null;
    public android.media.audio.common.AudioConfigBase config;
    public int input;
    public int portId;
    public int selectedDeviceId;
    public int source;
    public int virtualDeviceId;
    public GetInputForAttrResponse() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
