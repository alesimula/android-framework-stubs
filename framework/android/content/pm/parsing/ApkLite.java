package android.content.pm.parsing;

public class ApkLite {
    private final android.content.pm.ArchivedPackageParcel mArchivedPackage = null;
    private final java.lang.String mConfigForSplit = null;
    private final boolean mCoreApp = false;
    private final boolean mDebuggable = false;
    private final java.util.List<android.content.pm.SharedLibraryInfo> mDeclaredLibraries = null;
    private final java.lang.String mEmergencyInstaller = null;
    private final boolean mExtractNativeLibs = false;
    private final boolean mFeatureSplit = false;
    private final boolean mHasDeviceAdminReceiver = false;
    private final int mInstallLocation = 0;
    private final boolean mIsSdkLibrary = false;
    private final boolean mIsStaticLibrary = false;
    private final boolean mIsolatedSplits = false;
    private final int mMinSdkVersion = 0;
    private final boolean mMultiArch = false;
    private final boolean mOverlayIsStatic = false;
    private final int mOverlayPriority = 0;
    private final java.lang.String mPackageName = null;
    private final int mPageSizeCompat = 0;
    private final java.lang.String mPath = null;
    private final boolean mProfileableByShell = false;
    private final java.util.Set<java.lang.String> mRequiredSplitTypes = null;
    private final java.lang.String mRequiredSystemPropertyName = null;
    private final java.lang.String mRequiredSystemPropertyValue = null;
    private final int mRevisionCode = 0;
    private final int mRollbackDataPolicy = 0;
    private final android.content.pm.SigningDetails mSigningDetails = null;
    private final java.lang.String mSplitName = null;
    private final boolean mSplitRequired = false;
    private final java.util.Set<java.lang.String> mSplitTypes = null;
    private final java.lang.String mTargetPackageName = null;
    private final int mTargetSdkVersion = 0;
    private final boolean mUpdatableSystem = false;
    private final boolean mUse32bitAbi = false;
    private final boolean mUseEmbeddedDex = false;
    private final java.util.List<java.lang.String> mUsesSdkLibraries = null;
    private final java.lang.String[][] mUsesSdkLibrariesCertDigests = null;
    private final long[] mUsesSdkLibrariesVersionsMajor = null;
    private final java.lang.String mUsesSplitName = null;
    private final java.util.List<java.lang.String> mUsesStaticLibraries = null;
    private final java.lang.String[][] mUsesStaticLibrariesCertDigests = null;
    private final long[] mUsesStaticLibrariesVersions = null;
    private final android.content.pm.VerifierInfo[] mVerifiers = null;
    private final int mVersionCode = 0;
    private final int mVersionCodeMajor = 0;
    public ApkLite(java.lang.String p0, android.content.pm.ArchivedPackageParcel p1) {}
    public ApkLite(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, boolean p6, int p7, int p8, int p9, int p10, java.util.List<android.content.pm.VerifierInfo> p11, android.content.pm.SigningDetails p12, boolean p13, boolean p14, boolean p15, boolean p16, boolean p17, boolean p18, boolean p19, boolean p20, java.lang.String p21, boolean p22, int p23, java.lang.String p24, java.lang.String p25, int p26, int p27, int p28, java.util.Set<java.lang.String> p29, java.util.Set<java.lang.String> p30, boolean p31, boolean p32, java.util.List<java.lang.String> p33, long[] p34, java.lang.String[][] p35, boolean p36, java.util.List<java.lang.String> p37, long[] p38, java.lang.String[][] p39, boolean p40, java.lang.String p41, java.util.List<android.content.pm.SharedLibraryInfo> p42, int p43) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private boolean hasAnyRequiredSplitTypes() { return false; }
    public android.content.pm.ArchivedPackageParcel getArchivedPackage() { return null; }
    public java.lang.String getConfigForSplit() { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getDeclaredLibraries() { return null; }
    public java.lang.String getEmergencyInstaller() { return null; }
    public int getInstallLocation() { return 0; }
    public long getLongVersionCode() { return 0L; }
    public int getMinSdkVersion() { return 0; }
    public int getOverlayPriority() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getPageSizeCompat() { return 0; }
    public java.lang.String getPath() { return null; }
    public java.util.Set<java.lang.String> getRequiredSplitTypes() { return null; }
    public java.lang.String getRequiredSystemPropertyName() { return null; }
    public java.lang.String getRequiredSystemPropertyValue() { return null; }
    public int getRevisionCode() { return 0; }
    public int getRollbackDataPolicy() { return 0; }
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    public java.lang.String getSplitName() { return null; }
    public java.util.Set<java.lang.String> getSplitTypes() { return null; }
    public java.lang.String getTargetPackageName() { return null; }
    public int getTargetSdkVersion() { return 0; }
    public java.util.List<java.lang.String> getUsesSdkLibraries() { return null; }
    public java.lang.String[][] getUsesSdkLibrariesCertDigests() { return null; }
    public long[] getUsesSdkLibrariesVersionsMajor() { return null; }
    public java.lang.String getUsesSplitName() { return null; }
    public java.util.List<java.lang.String> getUsesStaticLibraries() { return null; }
    public java.lang.String[][] getUsesStaticLibrariesCertDigests() { return null; }
    public long[] getUsesStaticLibrariesVersions() { return null; }
    public android.content.pm.VerifierInfo[] getVerifiers() { return null; }
    public int getVersionCode() { return 0; }
    public int getVersionCodeMajor() { return 0; }
    public boolean isCoreApp() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isExtractNativeLibs() { return false; }
    public boolean isFeatureSplit() { return false; }
    public boolean isHasDeviceAdminReceiver() { return false; }
    public boolean isIsSdkLibrary() { return false; }
    public boolean isIsStaticLibrary() { return false; }
    public boolean isIsolatedSplits() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isOverlayIsStatic() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isSplitRequired() { return false; }
    public boolean isUpdatableSystem() { return false; }
    public boolean isUse32bitAbi() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
}
