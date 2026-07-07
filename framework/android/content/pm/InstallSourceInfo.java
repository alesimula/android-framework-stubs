package android.content.pm;

public final class InstallSourceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.InstallSourceInfo> CREATOR = null;
    private final java.lang.String mInitiatingPackageName = null;
    private final android.content.pm.SigningInfo mInitiatingPackageSigningInfo = null;
    private final java.lang.String mInstallingPackageName = null;
    private final java.lang.String mOriginatingPackageName = null;
    private final int mPackageSource = 0;
    private final java.lang.String mUpdateOwnerPackageName = null;
    private InstallSourceInfo(android.os.Parcel p0) {}
    public InstallSourceInfo(java.lang.String p0, android.content.pm.SigningInfo p1, java.lang.String p2, java.lang.String p3) {}
    public InstallSourceInfo(java.lang.String p0, android.content.pm.SigningInfo p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) {}
    public int describeContents() { return 0; }
    public java.lang.String getInitiatingPackageName() { return null; }
    public android.content.pm.SigningInfo getInitiatingPackageSigningInfo() { return null; }
    public java.lang.String getInstallingPackageName() { return null; }
    public java.lang.String getOriginatingPackageName() { return null; }
    public int getPackageSource() { return 0; }
    public java.lang.String getUpdateOwnerPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
