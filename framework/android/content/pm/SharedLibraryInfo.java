package android.content.pm;

public final class SharedLibraryInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.SharedLibraryInfo> CREATOR = null;
    public static final int TYPE_BUILTIN = 0;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_SDK_PACKAGE = 3;
    public static final int TYPE_STATIC = 2;
    public static final int VERSION_UNDEFINED = -1;
    private final java.util.List<java.lang.String> mCertDigests = null;
    private java.util.List<java.lang.String> mCodePaths;
    private final android.content.pm.VersionedPackage mDeclaringPackage = null;
    private java.util.List<android.content.pm.SharedLibraryInfo> mDependencies;
    private final java.util.List<android.content.pm.VersionedPackage> mDependentPackages = null;
    private final boolean mIsNative = false;
    private final java.lang.String mName = null;
    private final java.util.List<android.content.pm.VersionedPackage> mOptionalDependentPackages = null;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mPath = null;
    private final int mType = 0;
    private final long mVersion = 0L;
    private SharedLibraryInfo(android.os.Parcel p0) {}
    public SharedLibraryInfo(java.lang.String p0, long p1, int p2) {}
    public SharedLibraryInfo(java.lang.String p0, long p1, int p2, java.util.List<java.lang.String> p3) {}
    public SharedLibraryInfo(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.lang.String p3, long p4, int p5, android.content.pm.VersionedPackage p6, java.util.List<android.content.pm.VersionedPackage> p7, java.util.List<android.content.pm.SharedLibraryInfo> p8, boolean p9) {}
    public SharedLibraryInfo(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.lang.String p3, long p4, int p5, android.content.pm.VersionedPackage p6, java.util.List<android.content.pm.SharedLibraryInfo> p7, boolean p8, android.util.Pair<java.util.List<android.content.pm.VersionedPackage>, java.util.List<java.lang.Boolean>> p9) {}
    private static java.lang.String typeToString(int p0) { return null; }
    public void addDependency(android.content.pm.SharedLibraryInfo p0) {}
    public void clearDependencies() {}
    public int describeContents() { return 0; }
    public java.util.List<java.lang.String> getAllCodePaths() { return null; }
    public java.util.List<java.lang.String> getCertDigests() { return null; }
    public android.content.pm.VersionedPackage getDeclaringPackage() { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getDependencies() { return null; }
    public java.util.List<android.content.pm.VersionedPackage> getDependentPackages() { return null; }
    public long getLongVersion() { return 0L; }
    public java.lang.String getName() { return null; }
    public java.util.List<android.content.pm.VersionedPackage> getOptionalDependentPackages() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getPath() { return null; }
    public int getType() { return 0; }
    @java.lang.Deprecated
    public int getVersion() { return 0; }
    public boolean isBuiltin() { return false; }
    public boolean isDynamic() { return false; }
    public boolean isNative() { return false; }
    public boolean isSdk() { return false; }
    public boolean isStatic() { return false; }
    public void setAllCodePaths(java.util.List<java.lang.String> p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
