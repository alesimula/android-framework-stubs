package android.content.pm;

public final class ModuleInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ModuleInfo> CREATOR = null;
    private java.lang.String mApexModuleName;
    private java.util.List<java.lang.String> mApkInApexPackageNames;
    private boolean mHidden;
    private java.lang.CharSequence mName;
    private java.lang.String mPackageName;
    public ModuleInfo() {}
    public ModuleInfo(android.content.pm.ModuleInfo p0) {}
    private ModuleInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getApexModuleName() { return null; }
    public java.util.Collection<java.lang.String> getApkInApexPackageNames() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int hashCode() { return 0; }
    public boolean isHidden() { return false; }
    public android.content.pm.ModuleInfo setApexModuleName(java.lang.String p0) { return null; }
    public android.content.pm.ModuleInfo setApkInApexPackageNames(java.util.Collection<java.lang.String> p0) { return null; }
    public android.content.pm.ModuleInfo setHidden(boolean p0) { return null; }
    public android.content.pm.ModuleInfo setName(java.lang.CharSequence p0) { return null; }
    public android.content.pm.ModuleInfo setPackageName(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
