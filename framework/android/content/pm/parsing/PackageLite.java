package android.content.pm.parsing;

public class PackageLite {
    private final android.content.pm.ArchivedPackageParcel mArchivedPackage = null;
    private final java.lang.String mBaseApkPath = null;
    private final java.util.Set<java.lang.String> mBaseRequiredSplitTypes = null;
    private final int mBaseRevisionCode = 0;
    private final java.lang.String[] mConfigForSplit = null;
    private final boolean mCoreApp = false;
    private final boolean mDebuggable = false;
    private final java.util.List<android.content.pm.SharedLibraryInfo> mDeclaredLibraries = null;
    private final boolean mExtractNativeLibs = false;
    private final int mInstallLocation = 0;
    private final boolean[] mIsFeatureSplits = null;
    private final boolean mIsSdkLibrary = false;
    private final boolean mIsStaticLibrary = false;
    private final boolean mIsolatedSplits = false;
    private final boolean mMultiArch = false;
    private final java.lang.String mPackageName = null;
    private final int mPageSizeCompat = 0;
    private final java.lang.String mPath = null;
    private final boolean mProfileableByShell = false;
    private final java.util.Set<java.lang.String>[] mRequiredSplitTypes = null;
    private final android.content.pm.SigningDetails mSigningDetails = null;
    private final java.lang.String[] mSplitApkPaths = null;
    private final java.lang.String[] mSplitNames = null;
    private final boolean mSplitRequired = false;
    private final int[] mSplitRevisionCodes = null;
    private final java.util.Set<java.lang.String>[] mSplitTypes = null;
    private final int mTargetSdk = 0;
    private final boolean mUse32bitAbi = false;
    private final boolean mUseEmbeddedDex = false;
    private final java.util.List<java.lang.String> mUsesSdkLibraries = null;
    private final java.lang.String[][] mUsesSdkLibrariesCertDigests = null;
    private final long[] mUsesSdkLibrariesVersionsMajor = null;
    private final java.lang.String[] mUsesSplitNames = null;
    private final java.util.List<java.lang.String> mUsesStaticLibraries = null;
    private final java.lang.String[][] mUsesStaticLibrariesCertDigests = null;
    private final long[] mUsesStaticLibrariesVersions = null;
    private final android.content.pm.VerifierInfo[] mVerifiers = null;
    private final int mVersionCode = 0;
    private final int mVersionCodeMajor = 0;
    public PackageLite(java.lang.String p0, java.lang.String p1, android.content.pm.parsing.ApkLite p2, java.lang.String[] p3, boolean[] p4, java.lang.String[] p5, java.lang.String[] p6, java.lang.String[] p7, int[] p8, int p9, java.util.Set<java.lang.String>[] p10, java.util.Set<java.lang.String>[] p11) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private boolean hasAnyRequiredSplitTypes() { return false; }
    public java.util.List<java.lang.String> getAllApkPaths() { return null; }
    public android.content.pm.ArchivedPackageParcel getArchivedPackage() { return null; }
    public java.lang.String getBaseApkPath() { return null; }
    public java.util.Set<java.lang.String> getBaseRequiredSplitTypes() { return null; }
    public int getBaseRevisionCode() { return 0; }
    public java.lang.String[] getConfigForSplit() { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getDeclaredLibraries() { return null; }
    public int getInstallLocation() { return 0; }
    public boolean[] getIsFeatureSplits() { return null; }
    public long getLongVersionCode() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public int getPageSizeCompat() { return 0; }
    public java.lang.String getPath() { return null; }
    public java.util.Set<java.lang.String>[] getRequiredSplitTypes() { return null; }
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    public java.lang.String[] getSplitApkPaths() { return null; }
    public java.lang.String[] getSplitNames() { return null; }
    public int[] getSplitRevisionCodes() { return null; }
    public java.util.Set<java.lang.String>[] getSplitTypes() { return null; }
    public int getTargetSdk() { return 0; }
    public java.util.List<java.lang.String> getUsesSdkLibraries() { return null; }
    public java.lang.String[][] getUsesSdkLibrariesCertDigests() { return null; }
    public long[] getUsesSdkLibrariesVersionsMajor() { return null; }
    public java.lang.String[] getUsesSplitNames() { return null; }
    public java.util.List<java.lang.String> getUsesStaticLibraries() { return null; }
    public java.lang.String[][] getUsesStaticLibrariesCertDigests() { return null; }
    public long[] getUsesStaticLibrariesVersions() { return null; }
    public android.content.pm.VerifierInfo[] getVerifiers() { return null; }
    public int getVersionCode() { return 0; }
    public int getVersionCodeMajor() { return 0; }
    public boolean isCoreApp() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isExtractNativeLibs() { return false; }
    public boolean isIsSdkLibrary() { return false; }
    public boolean isIsStaticLibrary() { return false; }
    public boolean isIsolatedSplits() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isSplitRequired() { return false; }
    public boolean isUse32bitAbi() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
}
