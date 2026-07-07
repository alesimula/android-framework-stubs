package android.os;

public class ReconcileSdkDataArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ReconcileSdkDataArgs> CREATOR = null;
    public int appId;
    public int flags;
    public java.lang.String packageName;
    public int previousAppId;
    public java.lang.String seInfo;
    public java.util.List<java.lang.String> subDirNames;
    public int userId;
    public java.lang.String uuid;
    public ReconcileSdkDataArgs() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
