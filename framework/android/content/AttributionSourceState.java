package android.content;

public class AttributionSourceState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.AttributionSourceState> CREATOR = null;
    public java.lang.String attributionTag;
    public int deviceId;
    public android.content.AttributionSourceState[] next;
    public java.lang.String packageName;
    public int pid;
    public java.lang.String[] renouncedPermissions;
    public android.os.IBinder token;
    public int uid;
    public AttributionSourceState() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
