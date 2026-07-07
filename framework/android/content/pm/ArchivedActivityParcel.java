package android.content.pm;

public class ArchivedActivityParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ArchivedActivityParcel> CREATOR = null;
    public byte[] iconBitmap;
    public byte[] monochromeIconBitmap;
    public android.content.ComponentName originalComponentName;
    public java.lang.String title;
    public ArchivedActivityParcel() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
