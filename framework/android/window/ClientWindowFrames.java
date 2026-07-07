package android.window;

public class ClientWindowFrames implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.ClientWindowFrames> CREATOR = null;
    public android.graphics.Rect attachedFrame;
    public float compatScale;
    public final android.graphics.Rect displayFrame = null;
    public final android.graphics.Rect frame = null;
    public boolean isParentFrameClippedByDisplayCutout;
    public final android.graphics.Rect parentFrame = null;
    public int seq;
    public ClientWindowFrames() {}
    private ClientWindowFrames(android.os.Parcel p0) {}
    public ClientWindowFrames(android.window.ClientWindowFrames p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setTo(android.window.ClientWindowFrames p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
