package android.app.admin;

public class PackageDetailsTransport implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.PackageDetailsTransport> CREATOR = null;
    public java.lang.String displayName;
    public int installationSource;
    public java.lang.String installerPackageName;
    public java.lang.String packageName;
    public java.util.List<java.lang.String> signingKeyCerts;
    public int userFacingType;
    public long versionCode;
    public java.lang.String versionName;
    public PackageDetailsTransport() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
