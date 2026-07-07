package android.content.pm;

public class ArchivedPackageParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ArchivedPackageParcel> CREATOR = null;
    public android.content.pm.ArchivedActivityParcel[] archivedActivities;
    public java.lang.String defaultToDeviceProtectedStorage;
    public java.lang.String packageName;
    public java.lang.String requestLegacyExternalStorage;
    public android.content.pm.SigningDetails signingDetails;
    public int targetSdkVersion;
    public java.lang.String userDataFragile;
    public int versionCode;
    public int versionCodeMajor;
    public ArchivedPackageParcel() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
