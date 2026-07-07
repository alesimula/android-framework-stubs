package android.view;

public class WindowInputChannelParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.WindowInputChannelParams> CREATOR = null;
    public android.window.WindowContainerToken attachedToToken;
    public android.os.IBinder channelToken;
    public android.os.IBinder clientToken;
    public int displayId;
    public int flags;
    public android.window.InputTransferToken hostInputTransferToken;
    public int inputFeatures;
    public java.lang.String inputHandleName;
    public android.window.InputTransferToken inputTransferToken;
    public int privateFlags;
    public android.graphics.Region region;
    public android.view.SurfaceControl surface;
    public int type;
    public android.os.IBinder windowToken;
    public WindowInputChannelParams() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
