package android.content.pm;

public class PackageInfoLite implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.PackageInfoLite> CREATOR = null;
    public int baseRevisionCode;
    public boolean debuggable;
    public int installLocation;
    public boolean isSdkLibrary;
    public boolean multiArch;
    public java.lang.String packageName;
    public int recommendedInstallLocation;
    public java.lang.String[] splitNames;
    public int[] splitRevisionCodes;
    public android.content.pm.VerifierInfo[] verifiers;
    @java.lang.Deprecated
    public int versionCode;
    public int versionCodeMajor;
    public PackageInfoLite() {}
    private PackageInfoLite(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getLongVersionCode() { return 0L; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
