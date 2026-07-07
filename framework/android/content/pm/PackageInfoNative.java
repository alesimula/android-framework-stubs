package android.content.pm;

public class PackageInfoNative implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.PackageInfoNative> CREATOR = null;
    public java.lang.String packageName;
    public android.content.pm.SigningInfoNative signingInfo;
    public java.lang.String sourceDir;
    public java.lang.String[] splitSourceDirs;
    public PackageInfoNative() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
