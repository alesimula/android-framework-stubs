package android.content.pm;

public class PackageInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.PackageInfo> CREATOR = null;
    public static final int INSTALL_LOCATION_AUTO = 0;
    public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
    public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
    public static final int INSTALL_LOCATION_UNSPECIFIED = -1;
    public static final int REQUESTED_PERMISSION_GRANTED = 2;
    public static final int REQUESTED_PERMISSION_IMPLICIT = 4;
    public static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
    public static final int REQUESTED_PERMISSION_ONLY_FOR_LOCATION_BUTTON = 131072;
    public static final int REQUESTED_PERMISSION_REQUIRED = 1;
    private static final java.lang.String TAG = null;
    public android.content.pm.ActivityInfo[] activities;
    public android.content.pm.ApplicationInfo applicationInfo;
    public android.content.pm.Attribution[] attributions;
    public int baseRevisionCode;
    public int compileSdkVersion;
    public java.lang.String compileSdkVersionCodename;
    public android.content.pm.ConfigurationInfo[] configPreferences;
    public boolean coreApp;
    public android.content.pm.FeatureGroupInfo[] featureGroups;
    public long firstInstallTime;
    public int[] gids;
    public int installLocation;
    public android.content.pm.InstrumentationInfo[] instrumentation;
    public boolean isActiveApex;
    public boolean isApex;
    public boolean isStub;
    public long lastUpdateTime;
    private java.lang.String mApexPackageName;
    private long mArchiveTimeMillis;
    private boolean mIsAppMetadataVerified;
    public boolean mOverlayIsStatic;
    public java.lang.String overlayCategory;
    public int overlayPriority;
    public java.lang.String overlayTarget;
    public java.lang.String packageName;
    public android.content.pm.PermissionInfo[] permissions;
    public android.content.pm.ProviderInfo[] providers;
    public android.content.pm.ActivityInfo[] receivers;
    public android.content.pm.FeatureInfo[] reqFeatures;
    public java.lang.String[] requestedPermissions;
    public int[] requestedPermissionsFlags;
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, android.content.pm.UsesPermissionPurposeInfo> requestedPermissionsPurposes;
    public java.lang.String requiredAccountType;
    public boolean requiredForAllUsers;
    public java.lang.String restrictedAccountType;
    public android.content.pm.ServiceInfo[] services;
    public java.lang.String sharedUserId;
    public int sharedUserLabel;
    @java.lang.Deprecated
    public android.content.pm.Signature[] signatures;
    public android.content.pm.SigningInfo signingInfo;
    public java.lang.String[] splitNames;
    public int[] splitRevisionCodes;
    public java.lang.String targetOverlayableName;
    @java.lang.Deprecated
    public int versionCode;
    public int versionCodeMajor;
    public java.lang.String versionName;
    public PackageInfo() {}
    private PackageInfo(android.os.Parcel p0) {}
    public static long composeLongVersionCode(int p0, int p1) { return 0L; }
    private void readRequestedPermissionsPurposes(android.os.Parcel p0) {}
    private <T extends android.os.Parcelable> int writeAndCount(android.os.Parcel p0, T[] p1, int p2) { return 0; }
    private int writeAndCount(android.os.Parcel p0, java.lang.String[] p1) { return 0; }
    private void writeRequestedPermissionsPurposes(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getApexPackageName() { return null; }
    public long getArchiveTimeMillis() { return 0L; }
    public long getLongVersionCode() { return 0L; }
    public boolean isAppMetadataVerified() { return false; }
    public boolean isOverlayPackage() { return false; }
    public boolean isStaticOverlayPackage() { return false; }
    public void setApexPackageName(java.lang.String p0) {}
    public void setArchiveTimeMillis(long p0) {}
    public void setIsAppMetadataVerified(boolean p0) {}
    public void setLongVersionCode(long p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
