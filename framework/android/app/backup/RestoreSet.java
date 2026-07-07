package android.app.backup;

@android.annotation.SystemApi
public class RestoreSet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.backup.RestoreSet> CREATOR = null;
    public final int backupTransportFlags = 0;
    public java.lang.String device;
    public java.lang.String name;
    public long token;
    public RestoreSet() {}
    private RestoreSet(android.os.Parcel p0) {}
    public RestoreSet(java.lang.String p0, java.lang.String p1, long p2) {}
    public RestoreSet(java.lang.String p0, java.lang.String p1, long p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
