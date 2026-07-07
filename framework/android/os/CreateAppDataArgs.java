package android.os;

public class CreateAppDataArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.CreateAppDataArgs> CREATOR = null;
    public int appId;
    public int flags;
    public java.lang.String packageName;
    public int pccId;
    public int previousAppId;
    public int previousPccId;
    public java.lang.String seInfo;
    public int targetSdkVersion;
    public int userId;
    public java.lang.String uuid;
    public CreateAppDataArgs() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
