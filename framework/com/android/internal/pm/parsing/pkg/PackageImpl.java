package com.android.internal.pm.parsing.pkg;

public class PackageImpl implements com.android.internal.pm.parsing.pkg.ParsedPackage, com.android.internal.pm.parsing.pkg.AndroidPackageInternal, com.android.internal.pm.parsing.pkg.AndroidPackageHidden, com.android.internal.pm.pkg.parsing.ParsingPackage, com.android.internal.pm.pkg.parsing.ParsingPackageHidden, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.parsing.pkg.PackageImpl> CREATOR = null;
    private static final android.util.SparseArray<int[]> EMPTY_INT_ARRAY_SPARSE_ARRAY = null;
    private static final java.util.Comparator<com.android.internal.pm.pkg.component.ParsedMainComponent> ORDER_COMPARATOR = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForBoolean sForBoolean = null;
    protected static final com.android.internal.pm.pkg.parsing.ParsingUtils.StringPairListParceler sForIntentInfoPairs = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedString sForInternedString = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringArray sForInternedStringArray = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringList sForInternedStringList = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringSet sForInternedStringSet = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForInternedStringValueMap sForInternedStringValueMap = null;
    public static final com.android.internal.util.Parcelling.BuiltIn.ForStringSet sForStringSet = null;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> activities;
    protected java.util.List<java.lang.String> adoptPermissions;
    private java.lang.Boolean anyDensity;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedApexSystemService> apexSystemServices;
    private java.lang.String appComponentFactory;
    private java.util.List<com.android.internal.pm.pkg.component.ParsedAttribution> attributions;
    private int autoRevokePermissions;
    private java.lang.String backupAgentName;
    private int banner;
    private int baseRevisionCode;
    private int category;
    private java.lang.String classLoaderName;
    private java.lang.String className;
    private int compatibleWidthLimitDp;
    private int compileSdkVersion;
    private java.lang.String compileSdkVersionCodeName;
    private java.util.List<android.content.pm.ConfigurationInfo> configPreferences;
    private int dataExtractionRules;
    private int descriptionRes;
    private java.util.List<android.content.pm.FeatureGroupInfo> featureGroups;
    private int fullBackupContent;
    private int gwpAsanMode;
    private int iconRes;
    private java.util.Set<java.lang.String> implicitPermissions;
    private int installLocation;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedInstrumentation> instrumentations;
    private java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> keySetMapping;
    private int labelRes;
    private int largestWidthLimitDp;
    private java.util.List<java.lang.String> libraryNames;
    private int logo;
    private boolean mAllowCrossUidActivitySwitchFromBelow;
    private int mBackupAgentProcess;
    protected java.lang.String mBaseApkPath;
    private java.lang.String mBaseAppDataCredentialProtectedDirForSystemUser;
    private java.lang.String mBaseAppDataDeviceProtectedDirForSystemUser;
    private int mBaseAppInfoFlags;
    private int mBaseAppInfoPrivateFlags;
    private int mBaseAppInfoPrivateFlagsExt;
    private long mBooleans;
    private long mBooleans2;
    com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback mCallback;
    private java.lang.String mEmergencyInstaller;
    private java.util.Map<java.lang.String, java.lang.Boolean> mFeatureFlagState;
    private int mIntentMatchingFlags;
    private java.util.Set<java.lang.String> mKnownActivityEmbeddingCerts;
    private int mLocaleConfigRes;
    private long mLongVersionCode;
    private int mPageSizeAppCompatFlags;
    private com.android.internal.pm.pkg.component.ParsedAllowComponentAccessPolicy mParsedAllowComponentAccessPolicy;
    protected java.lang.String mPath;
    private android.util.ArrayMap<java.lang.String, android.util.SparseArray<android.util.ArraySet<com.android.internal.pm.pkg.component.ParsedMainComponent>>> mProcessToComponentMapping;
    private java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> mProperties;
    private java.util.List<com.android.server.pm.pkg.AndroidPackageSplit> mSplits;
    protected java.util.UUID mStorageUuid;
    private java.lang.String[] mUsesLibrariesSorted;
    private java.lang.String[] mUsesOptionalLibrariesSorted;
    private java.lang.String[] mUsesSdkLibrariesSorted;
    private java.lang.String[] mUsesStaticLibrariesSorted;
    private java.lang.String mZygotePreloadNativeFunc;
    private java.lang.String mZygotePreloadNativeLib;
    private java.lang.String manageSpaceActivityName;
    private final java.lang.String manifestPackageName = null;
    private float maxAspectRatio;
    private int maxSdkVersion;
    private final java.util.List<android.content.pm.MemoryBudget> memoryBudgets = null;
    private int memtagMode;
    private android.os.Bundle metaData;
    private java.util.Set<java.lang.String> mimeGroups;
    private float minAspectRatio;
    private android.util.SparseIntArray minExtensionVersions;
    private int minSdkVersion;
    private int nativeHeapZeroInitialized;
    protected java.lang.String nativeLibraryDir;
    protected java.lang.String nativeLibraryRootDir;
    private boolean nativeLibraryRootRequiresIsa;
    private int networkSecurityConfigRes;
    private java.lang.CharSequence nonLocalizedLabel;
    protected java.util.List<java.lang.String> originalPackages;
    private java.lang.String overlayCategory;
    private int overlayPriority;
    private java.lang.String overlayTarget;
    private java.lang.String overlayTargetOverlayableName;
    private java.util.Map<java.lang.String, java.lang.String> overlayables;
    protected java.lang.String packageName;
    private java.lang.String permission;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedPermissionGroup> permissionGroups;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedPermission> permissions;
    private java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>> preferredActivityFilters;
    protected java.lang.String primaryCpuAbi;
    private java.lang.String processName;
    private java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> processes;
    protected java.util.List<java.lang.String> protectedBroadcasts;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedProvider> providers;
    private java.util.List<android.content.Intent> queriesIntents;
    private java.util.List<java.lang.String> queriesPackages;
    private java.util.Set<java.lang.String> queriesProviders;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> receivers;
    private java.util.List<android.content.pm.FeatureInfo> reqFeatures;
    private java.lang.Boolean requestRawExternalStorageAccess;
    private java.lang.String requiredAccountType;
    private int requiresSmallestWidthDp;
    private java.lang.Boolean resizeable;
    private java.lang.Boolean resizeableActivity;
    private byte[] restrictUpdateHash;
    private java.lang.String restrictedAccountType;
    private int roundIconRes;
    private int sdkLibVersionMajor;
    private java.lang.String sdkLibraryName;
    protected java.lang.String secondaryCpuAbi;
    protected java.lang.String secondaryNativeLibraryDir;
    protected java.util.List<com.android.internal.pm.pkg.component.ParsedService> services;
    private java.lang.String sharedUserId;
    private int sharedUserLabel;
    private android.content.pm.SigningDetails signingDetails;
    private java.lang.String[] splitClassLoaderNames;
    protected java.lang.String[] splitCodePaths;
    private android.util.SparseArray<int[]> splitDependencies;
    private int[] splitFlags;
    private java.lang.String[] splitNames;
    private int[] splitRevisionCodes;
    private long staticSharedLibVersion;
    private java.lang.String staticSharedLibraryName;
    private java.lang.Boolean supportsExtraLargeScreens;
    private java.lang.Boolean supportsLargeScreens;
    private java.lang.Boolean supportsNormalScreens;
    private java.lang.Boolean supportsSmallScreens;
    private int targetSandboxVersion;
    private int targetSdkVersion;
    private java.lang.String taskAffinity;
    private int theme;
    private int uiOptions;
    private int uid;
    private java.util.Set<java.lang.String> upgradeKeySets;
    protected java.util.List<java.lang.String> usesLibraries;
    protected java.util.List<java.lang.String> usesNativeLibraries;
    protected java.util.List<java.lang.String> usesOptionalLibraries;
    protected java.util.List<java.lang.String> usesOptionalNativeLibraries;
    private java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedUsesPermission> usesPermissionMapping;
    private java.util.List<java.lang.String> usesSdkLibraries;
    private java.lang.String[][] usesSdkLibrariesCertDigests;
    private boolean[] usesSdkLibrariesOptional;
    private long[] usesSdkLibrariesVersionsMajor;
    private java.util.List<java.lang.String> usesStaticLibraries;
    private java.lang.String[][] usesStaticLibrariesCertDigests;
    private long[] usesStaticLibrariesVersions;
    protected int versionCode;
    protected int versionCodeMajor;
    private java.lang.String versionName;
    protected java.lang.String volumeUuid;
    private java.lang.String zygotePreloadName;
    public PackageImpl(android.os.Parcel p0) {}
    public PackageImpl(android.os.Parcel p0, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p1) {}
    public PackageImpl(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p5) {}
    private void addComponentToProcessMapping(com.android.internal.pm.pkg.component.ParsedMainComponent p0, int p1) {}
    private void addMimeGroupsFromComponent(com.android.internal.pm.pkg.component.ParsedComponent p0) {}
    private void assignDerivedFields2() {}
    private android.util.ArrayMap<java.lang.String, java.lang.String> buildAppClassNamesByProcess() { return null; }
    public static com.android.server.pm.pkg.AndroidPackage buildFakeForDeletion(java.lang.String p0, java.lang.String p1) { return null; }
    public static com.android.internal.pm.parsing.pkg.PackageImpl forParsing(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p5) { return null; }
    public static com.android.internal.pm.pkg.parsing.ParsingPackage forTesting(java.lang.String p0) { return null; }
    public static com.android.internal.pm.pkg.parsing.ParsingPackage forTesting(java.lang.String p0, java.lang.String p1) { return null; }
    private boolean getBoolean(long p0) { return false; }
    private boolean getBoolean2(long p0) { return false; }
    private void makeImmutable() {}
    private void readFeatureFlagState(android.os.Parcel p0) {}
    private void readUsesPermissionMapping(android.os.Parcel p0) {}
    private com.android.internal.pm.parsing.pkg.PackageImpl setBoolean(long p0, boolean p1) { return null; }
    private com.android.internal.pm.parsing.pkg.PackageImpl setBoolean2(long p0, boolean p1) { return null; }
    private static java.lang.String[] sortLibraries(java.util.List<java.lang.String> p0) { return null; }
    private void writeFeatureFlagState(android.os.Parcel p0) {}
    private void writeUsesPermissionMapping(android.os.Parcel p0) {}
    public com.android.internal.pm.parsing.pkg.PackageImpl addActivity(com.android.internal.pm.pkg.component.ParsedActivity p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addAdoptPermission(java.lang.String p0) { return null; }
    public final com.android.internal.pm.parsing.pkg.PackageImpl addApexSystemService(com.android.internal.pm.pkg.component.ParsedApexSystemService p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addAttribution(com.android.internal.pm.pkg.component.ParsedAttribution p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addConfigPreference(android.content.pm.ConfigurationInfo p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addFeatureFlag(java.lang.String p0, java.lang.Boolean p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addFeatureGroup(android.content.pm.FeatureGroupInfo p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addImplicitPermission(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addInstrumentation(com.android.internal.pm.pkg.component.ParsedInstrumentation p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addKeySet(java.lang.String p0, java.security.PublicKey p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addLibraryName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addMemoryBudget(android.content.pm.MemoryBudget p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addOriginalPackage(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage addOverlayable(java.lang.String p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addPermission(com.android.internal.pm.pkg.component.ParsedPermission p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addPermissionGroup(com.android.internal.pm.pkg.component.ParsedPermissionGroup p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addPreferredActivityFilter(java.lang.String p0, com.android.internal.pm.pkg.component.ParsedIntentInfo p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addProperty(android.content.pm.PackageManager.Property p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addProtectedBroadcast(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addProvider(com.android.internal.pm.pkg.component.ParsedProvider p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addQueriesIntent(android.content.Intent p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addQueriesPackage(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addQueriesProvider(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addReceiver(com.android.internal.pm.pkg.component.ParsedActivity p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addReqFeature(android.content.pm.FeatureInfo p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addService(com.android.internal.pm.pkg.component.ParsedService p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesLibrary(int p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesLibrary(java.lang.String p0) { return null; }
    public final com.android.internal.pm.parsing.pkg.PackageImpl addUsesNativeLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesOptionalLibrary(int p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesOptionalLibrary(java.lang.String p0) { return null; }
    public final com.android.internal.pm.parsing.pkg.PackageImpl addUsesOptionalNativeLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesPermission(com.android.internal.pm.pkg.component.ParsedUsesPermission p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesSdkLibrary(java.lang.String p0, long p1, java.lang.String[] p2, boolean p3) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl addUsesStaticLibrary(java.lang.String p0, long p1, java.lang.String[] p2) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl asSplit(java.lang.String[] p0, java.lang.String[] p1, int[] p2, android.util.SparseArray<int[]> p3) { return null; }
    protected void assignDerivedFields() {}
    public com.android.internal.pm.parsing.pkg.PackageImpl capPermissionPriorities() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl clearAdoptPermissions() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl clearOriginalPackages() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl clearProtectedBroadcasts() { return null; }
    public int describeContents() { return 0; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getActivities() { return null; }
    public java.util.List<java.lang.String> getAdoptPermissions() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedApexSystemService> getApexSystemServices() { return null; }
    public java.lang.String getAppComponentFactory() { return null; }
    public java.lang.String getApplicationClassName() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedAttribution> getAttributions() { return null; }
    public int getAutoRevokePermissions() { return 0; }
    public java.lang.String getBackupAgentName() { return null; }
    public int getBackupAgentProcess() { return 0; }
    public int getBannerResourceId() { return 0; }
    public java.lang.String getBaseApkPath() { return null; }
    public java.lang.String getBaseAppDataCredentialProtectedDirForSystemUser() { return null; }
    public java.lang.String getBaseAppDataDeviceProtectedDirForSystemUser() { return null; }
    public int getBaseRevisionCode() { return 0; }
    public int getCategory() { return 0; }
    public java.lang.String getClassLoaderName() { return null; }
    public int getCompatibleWidthLimitDp() { return 0; }
    public int getCompileSdkVersion() { return 0; }
    public java.lang.String getCompileSdkVersionCodeName() { return null; }
    public java.util.List<android.content.pm.ConfigurationInfo> getConfigPreferences() { return null; }
    public int getDataExtractionRulesResourceId() { return 0; }
    public int getDescriptionResourceId() { return 0; }
    public java.lang.String getEmergencyInstaller() { return null; }
    public java.util.Map<java.lang.String, java.lang.Boolean> getFeatureFlagState() { return null; }
    public java.util.List<android.content.pm.FeatureGroupInfo> getFeatureGroups() { return null; }
    public int getFullBackupContentResourceId() { return 0; }
    public int getGwpAsanMode() { return 0; }
    public int getIconResourceId() { return 0; }
    public java.util.Set<java.lang.String> getImplicitPermissions() { return null; }
    public int getInstallLocation() { return 0; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedInstrumentation> getInstrumentations() { return null; }
    public int getIntentMatchingFlags() { return 0; }
    public java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> getKeySetMapping() { return null; }
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts() { return null; }
    public int getLabelResourceId() { return 0; }
    public int getLargestWidthLimitDp() { return 0; }
    public java.util.List<java.lang.String> getLibraryNames() { return null; }
    public int getLocaleConfigResourceId() { return 0; }
    public int getLogoResourceId() { return 0; }
    public long getLongVersionCode() { return 0L; }
    public java.lang.String getManageSpaceActivityName() { return null; }
    public java.lang.String getManifestPackageName() { return null; }
    public float getMaxAspectRatio() { return 0.0f; }
    public int getMaxSdkVersion() { return 0; }
    public java.util.List<android.content.pm.MemoryBudget> getMemoryBudgets() { return null; }
    public int getMemtagMode() { return 0; }
    public android.os.Bundle getMetaData() { return null; }
    public java.util.Set<java.lang.String> getMimeGroups() { return null; }
    public float getMinAspectRatio() { return 0.0f; }
    public android.util.SparseIntArray getMinExtensionVersions() { return null; }
    public int getMinSdkVersion() { return 0; }
    public int getNativeHeapZeroInitialized() { return 0; }
    public java.lang.String getNativeLibraryDir() { return null; }
    public java.lang.String getNativeLibraryRootDir() { return null; }
    public int getNetworkSecurityConfigResourceId() { return 0; }
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public java.util.List<java.lang.String> getOriginalPackages() { return null; }
    public java.lang.String getOverlayCategory() { return null; }
    public int getOverlayPriority() { return 0; }
    public java.lang.String getOverlayTarget() { return null; }
    public java.lang.String getOverlayTargetOverlayableName() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getOverlayables() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getPageSizeAppCompatFlags() { return 0; }
    public com.android.internal.pm.pkg.component.ParsedAllowComponentAccessPolicy getParsedAllowComponentAccessPolicy() { return null; }
    public java.lang.String getPath() { return null; }
    public java.lang.String getPermission() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermissionGroup> getPermissionGroups() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedPermission> getPermissions() { return null; }
    public java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>> getPreferredActivityFilters() { return null; }
    public java.lang.String getPrimaryCpuAbi() { return null; }
    public java.lang.String getProcessName() { return null; }
    public android.util.ArrayMap<java.lang.String, android.util.SparseArray<android.util.ArraySet<com.android.internal.pm.pkg.component.ParsedMainComponent>>> getProcessToComponentMapping() { return null; }
    public java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> getProcesses() { return null; }
    public java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> getProperties() { return null; }
    public java.util.List<java.lang.String> getProtectedBroadcasts() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedProvider> getProviders() { return null; }
    public java.util.List<android.content.Intent> getQueriesIntents() { return null; }
    public java.util.List<java.lang.String> getQueriesPackages() { return null; }
    public java.util.Set<java.lang.String> getQueriesProviders() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedActivity> getReceivers() { return null; }
    public java.util.List<android.content.pm.FeatureInfo> getRequestedFeatures() { return null; }
    public java.util.Set<java.lang.String> getRequestedPermissions() { return null; }
    public java.lang.String getRequiredAccountType() { return null; }
    public int getRequiresSmallestWidthDp() { return 0; }
    public java.lang.Boolean getResizeableActivity() { return null; }
    public byte[] getRestrictUpdateHash() { return null; }
    public java.lang.String getRestrictedAccountType() { return null; }
    public int getRoundIconResourceId() { return 0; }
    public int getSdkLibVersionMajor() { return 0; }
    public java.lang.String getSdkLibraryName() { return null; }
    public java.lang.String getSecondaryCpuAbi() { return null; }
    public java.lang.String getSecondaryNativeLibraryDir() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedService> getServices() { return null; }
    public java.lang.String getSharedUserId() { return null; }
    public int getSharedUserLabelResourceId() { return 0; }
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    public java.lang.String[] getSplitClassLoaderNames() { return null; }
    public java.lang.String[] getSplitCodePaths() { return null; }
    public android.util.SparseArray<int[]> getSplitDependencies() { return null; }
    public int[] getSplitFlags() { return null; }
    public java.lang.String[] getSplitNames() { return null; }
    public int[] getSplitRevisionCodes() { return null; }
    public java.util.List<com.android.server.pm.pkg.AndroidPackageSplit> getSplits() { return null; }
    public java.lang.String getStaticSharedLibraryName() { return null; }
    public long getStaticSharedLibraryVersion() { return 0L; }
    public java.util.UUID getStorageUuid() { return null; }
    public int getTargetSandboxVersion() { return 0; }
    public int getTargetSdkVersion() { return 0; }
    public java.lang.String getTaskAffinity() { return null; }
    public int getThemeResourceId() { return 0; }
    public int getUiOptions() { return 0; }
    public int getUid() { return 0; }
    public java.util.Set<java.lang.String> getUpgradeKeySets() { return null; }
    public java.util.List<java.lang.String> getUsesLibraries() { return null; }
    public java.lang.String[] getUsesLibrariesSorted() { return null; }
    public java.util.List<java.lang.String> getUsesNativeLibraries() { return null; }
    public java.util.List<java.lang.String> getUsesOptionalLibraries() { return null; }
    public java.lang.String[] getUsesOptionalLibrariesSorted() { return null; }
    public java.util.List<java.lang.String> getUsesOptionalNativeLibraries() { return null; }
    public java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedUsesPermission> getUsesPermissionMapping() { return null; }
    public java.util.List<java.lang.String> getUsesSdkLibraries() { return null; }
    public java.lang.String[][] getUsesSdkLibrariesCertDigests() { return null; }
    public boolean[] getUsesSdkLibrariesOptional() { return null; }
    public java.lang.String[] getUsesSdkLibrariesSorted() { return null; }
    public long[] getUsesSdkLibrariesVersionsMajor() { return null; }
    public java.util.List<java.lang.String> getUsesStaticLibraries() { return null; }
    public java.lang.String[][] getUsesStaticLibrariesCertDigests() { return null; }
    public java.lang.String[] getUsesStaticLibrariesSorted() { return null; }
    public long[] getUsesStaticLibrariesVersions() { return null; }
    public int getVersionCode() { return 0; }
    public int getVersionCodeMajor() { return 0; }
    public java.lang.String getVersionName() { return null; }
    public java.lang.String getVolumeUuid() { return null; }
    public java.lang.String getZygotePreloadName() { return null; }
    public java.lang.String getZygotePreloadNativeFunc() { return null; }
    public java.lang.String getZygotePreloadNativeLib() { return null; }
    public boolean hasPccComponents() { return false; }
    public boolean hasPreserveLegacyExternalStorage() { return false; }
    public boolean hasProcessMemoryBudget() { return false; }
    public boolean hasRequestForegroundServiceExemption() { return false; }
    public java.lang.Boolean hasRequestRawExternalStorageAccess() { return null; }
    public com.android.internal.pm.parsing.pkg.AndroidPackageInternal hideAsFinal() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl hideAsParsed() { return null; }
    public boolean is32BitAbiPreferred() { return false; }
    public boolean isAllowAudioPlaybackCapture() { return false; }
    public boolean isAllowCrossUidActivitySwitchFromBelow() { return false; }
    public boolean isAllowNativeHeapPointerTagging() { return false; }
    public boolean isAnyDensity() { return false; }
    public boolean isApex() { return false; }
    public boolean isAttributionsUserVisible() { return false; }
    public boolean isBackupAllowed() { return false; }
    public boolean isBackupInForeground() { return false; }
    public boolean isClearUserDataAllowed() { return false; }
    public boolean isClearUserDataOnFailedRestoreAllowed() { return false; }
    public boolean isCleartextTrafficAllowed() { return false; }
    public boolean isCoreApp() { return false; }
    public boolean isCrossProfile() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isDeclaredHavingCode() { return false; }
    public boolean isDefaultToDeviceProtectedStorage() { return false; }
    public boolean isDirectBootAware() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isExternalStorage() { return false; }
    public boolean isExtraLargeScreensSupported() { return false; }
    public boolean isExtractNativeLibrariesRequested() { return false; }
    public boolean isFactoryTest() { return false; }
    public boolean isForceQueryable() { return false; }
    public boolean isFullBackupOnly() { return false; }
    public boolean isGame() { return false; }
    public boolean isHardwareAccelerated() { return false; }
    public boolean isHasDomainUrls() { return false; }
    public boolean isIsolatedSplitLoading() { return false; }
    public boolean isKillAfterRestoreAllowed() { return false; }
    public boolean isLargeHeap() { return false; }
    public boolean isLargeScreensSupported() { return false; }
    public boolean isLeavingSharedUser() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isNativeLibraryRootRequiresIsa() { return false; }
    public boolean isNonSdkApiRequested() { return false; }
    public boolean isNormalScreensSupported() { return false; }
    public boolean isOdm() { return false; }
    public boolean isOem() { return false; }
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public boolean isOverlayIsStatic() { return false; }
    public boolean isPartiallyDirectBootAware() { return false; }
    public boolean isPersistent() { return false; }
    public boolean isPrivileged() { return false; }
    public boolean isProduct() { return false; }
    public boolean isProfileable() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isRequestLegacyExternalStorage() { return false; }
    public boolean isRequiredForAllUsers() { return false; }
    public boolean isResetEnabledSettingsOnAppDataCleared() { return false; }
    public boolean isResizeable() { return false; }
    public boolean isResizeableActivityViaSdkVersion() { return false; }
    public boolean isResourceOverlay() { return false; }
    public boolean isRestoreAnyVersion() { return false; }
    public boolean isRtlSupported() { return false; }
    public boolean isSaveStateDisallowed() { return false; }
    public boolean isSdkLibrary() { return false; }
    public boolean isSignedWithPlatformKey() { return false; }
    public boolean isSmallScreensSupported() { return false; }
    public boolean isStaticSharedLibrary() { return false; }
    public boolean isStub() { return false; }
    public boolean isSystem() { return false; }
    public boolean isSystemExt() { return false; }
    public boolean isTaskReparentingAllowed() { return false; }
    public boolean isTestOnly() { return false; }
    public boolean isUpdatableSystem() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
    public boolean isUserDataFragile() { return false; }
    public boolean isVendor() { return false; }
    public boolean isVisibleToInstantApps() { return false; }
    public boolean isVmSafeMode() { return false; }
    public com.android.internal.pm.parsing.pkg.PackageImpl markNotActivitiesAsNotExportedIfSingleUser() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removePermission(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removeUsesLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removeUsesOptionalLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl removeUsesOptionalNativeLibrary(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl set32BitAbiPreferred(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAllComponentsDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAllowAudioPlaybackCapture(boolean p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAllowCrossUidActivitySwitchFromBelow(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAllowNativeHeapPointerTagging(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAnyDensity(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setApex(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAppComponentFactory(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setApplicationClassName(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setAttributionsAreUserVisible(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setAutoRevokePermissions(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupAgentName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupAgentProcess(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBackupInForeground(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBannerResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBaseApkPath(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setBaseRevisionCode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCategory(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setClassLoaderName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setClearUserDataAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setClearUserDataOnFailedRestoreAllowed(boolean p0) { return null; }
    @java.lang.Deprecated
    public com.android.internal.pm.parsing.pkg.PackageImpl setCleartextTrafficAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCompatibleWidthLimitDp(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCompileSdkVersion(int p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setCompileSdkVersionCodeName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCoreApp(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setCrossProfile(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDataExtractionRulesResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDebuggable(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDeclaredHavingCode(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDefaultToDeviceProtectedStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDescriptionResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setEmergencyInstaller(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setEnabled(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setExternalStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setExtraLargeScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setExtractNativeLibrariesRequested(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setFactoryTest(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setForceQueryable(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setFullBackupContentResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setFullBackupOnly(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setGame(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setGwpAsanMode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setHardwareAccelerated(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setHasDomainUrls(boolean p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setHasPccComponents(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setIconResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setInstallLocation(int p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setIntentMatchingFlags(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setIsolatedSplitLoading(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setKillAfterRestoreAllowed(boolean p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setKnownActivityEmbeddingCerts(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLabelResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLargeHeap(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLargeScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLargestWidthLimitDp(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLeavingSharedUser(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLocaleConfigResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setLogoResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setManageSpaceActivityName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMaxAspectRatio(float p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMaxSdkVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMemtagMode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMetaData(android.os.Bundle p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMinAspectRatio(float p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMinExtensionVersions(android.util.SparseIntArray p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMinSdkVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setMultiArch(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeHeapZeroInitialized(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeLibraryDir(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeLibraryRootDir(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNativeLibraryRootRequiresIsa(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNetworkSecurityConfigResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNonLocalizedLabel(java.lang.CharSequence p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNonSdkApiRequested(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setNormalScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOdm(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOem(boolean p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setOnBackInvokedCallbackEnabled(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayCategory(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayIsStatic(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayPriority(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayTarget(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setOverlayTargetOverlayableName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPackageName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPageSizeAppCompatFlags(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setParsedAllowComponentAccessPolicy(com.android.internal.pm.pkg.component.ParsedAllowComponentAccessPolicy p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPartiallyDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPath(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPermission(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPersistent(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPreserveLegacyExternalStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPrimaryCpuAbi(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setPrivileged(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProcessName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProcesses(java.util.Map<java.lang.String, com.android.internal.pm.pkg.component.ParsedProcess> p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProduct(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProfileable(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setProfileableByShell(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequestForegroundServiceExemption(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequestLegacyExternalStorage(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequestRawExternalStorageAccess(java.lang.Boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequiredAccountType(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequiredForAllUsers(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRequiresSmallestWidthDp(int p0) { return null; }
    public com.android.internal.pm.pkg.parsing.ParsingPackage setResetEnabledSettingsOnAppDataCleared(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResizeable(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResizeableActivity(java.lang.Boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResizeableActivityViaSdkVersion(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setResourceOverlay(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRestoreAnyVersion(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRestrictUpdateHash(byte... p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRestrictedAccountType(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRoundIconResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setRtlSupported(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSaveStateDisallowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSdkLibVersionMajor(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSdkLibrary(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSdkLibraryName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSecondaryCpuAbi(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSecondaryNativeLibraryDir(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSharedUserId(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSharedUserLabelResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSignedWithPlatformKey(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSigningDetails(android.content.pm.SigningDetails p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSmallScreensSupported(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSplitClassLoaderName(int p0, java.lang.String p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSplitCodePaths(java.lang.String[] p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSplitHasCode(int p0, boolean p1) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStaticSharedLibrary(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStaticSharedLibraryName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStaticSharedLibraryVersion(long p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setStub(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSystem(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setSystemExt(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTargetSandboxVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTargetSdkVersion(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTaskAffinity(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTaskReparentingAllowed(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setTestOnly(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setThemeResourceId(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUiOptions(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUid(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUpdatableSystem(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUpgradeKeySets(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUseEmbeddedDex(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setUserDataFragile(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVendor(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVersionCode(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVersionCodeMajor(int p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVersionName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVisibleToInstantApps(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVmSafeMode(boolean p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setVolumeUuid(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setZygotePreloadName(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setZygotePreloadNativeFunc(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl setZygotePreloadNativeLib(java.lang.String p0) { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl sortActivities() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl sortReceivers() { return null; }
    public com.android.internal.pm.parsing.pkg.PackageImpl sortServices() { return null; }
    public android.content.pm.ApplicationInfo toAppInfoWithoutState() { return null; }
    public android.content.pm.ApplicationInfo toAppInfoWithoutStateWithoutFlags() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class Booleans {
        private static final long ALLOW_AUDIO_PLAYBACK_CAPTURE = 2147483648L;
        private static final long ALLOW_BACKUP = 4L;
        private static final long ALLOW_CLEAR_USER_DATA = 2048L;
        private static final long ALLOW_CLEAR_USER_DATA_ON_FAILED_RESTORE = 1073741824L;
        private static final long ALLOW_NATIVE_HEAP_POINTER_TAGGING = 68719476736L;
        private static final long ALLOW_TASK_REPARENTING = 1024L;
        private static final long ATTRIBUTIONS_ARE_USER_VISIBLE = 140737488355328L;
        private static final long BACKUP_IN_FOREGROUND = 16777216L;
        private static final long CANT_SAVE_STATE = 34359738368L;
        private static final long CORE_APP = 4503599627370496L;
        private static final long CROSS_PROFILE = 8796093022208L;
        private static final long DEBUGGABLE = 128L;
        private static final long DEFAULT_TO_DEVICE_PROTECTED_STORAGE = 67108864L;
        private static final long DIRECT_BOOT_AWARE = 134217728L;
        private static final long DISALLOW_PROFILING = 35184372088832L;
        private static final long ENABLED = 17592186044416L;
        private static final long ENABLE_ON_BACK_INVOKED_CALLBACK = 1125899906842624L;
        private static final long EXTERNAL_STORAGE = 1L;
        private static final long EXTRACT_NATIVE_LIBS = 131072L;
        private static final long FACTORY_TEST = 18014398509481984L;
        private static final long FORCE_QUERYABLE = 4398046511104L;
        private static final long FULL_BACKUP_ONLY = 32L;
        private static final long GAME = 262144L;
        private static final long HARDWARE_ACCELERATED = 2L;
        private static final long HAS_CODE = 512L;
        private static final long HAS_DOMAIN_URLS = 4194304L;
        private static final long HAS_FRAGILE_USER_DATA = 17179869184L;
        private static final long ISOLATED_SPLIT_LOADING = 2097152L;
        private static final long KILL_AFTER_RESTORE = 8L;
        private static final long LARGE_HEAP = 4096L;
        private static final long LEAVING_SHARED_UID = 2251799813685248L;
        private static final long MULTI_ARCH = 65536L;
        private static final long NATIVE_LIBRARY_ROOT_REQUIRES_ISA = -9223372036854775808L;
        private static final long ODM = 2305843009213693952L;
        private static final long OEM = 288230376151711744L;
        private static final long OVERLAY = 1048576L;
        private static final long OVERLAY_IS_STATIC = 549755813888L;
        private static final long PARTIALLY_DIRECT_BOOT_AWARE = 268435456L;
        private static final long PERSISTENT = 64L;
        private static final long PRESERVE_LEGACY_EXTERNAL_STORAGE = 137438953472L;
        private static final long PRIVILEGED = 144115188075855872L;
        private static final long PRODUCT = 1152921504606846976L;
        private static final long PROFILEABLE_BY_SHELL = 8388608L;
        private static final long REQUEST_FOREGROUND_SERVICE_EXEMPTION = 70368744177664L;
        private static final long REQUEST_LEGACY_EXTERNAL_STORAGE = 4294967296L;
        private static final long REQUIRED_FOR_ALL_USERS = 274877906944L;
        private static final long RESET_ENABLED_SETTINGS_ON_APP_DATA_CLEARED = 281474976710656L;
        private static final long RESIZEABLE_ACTIVITY_VIA_SDK_VERSION = 536870912L;
        private static final long RESTORE_ANY_VERSION = 16L;
        private static final long SDK_LIBRARY = 562949953421312L;
        private static final long SIGNED_WITH_PLATFORM_KEY = 4611686018427387904L;
        private static final long STATIC_SHARED_LIBRARY = 524288L;
        private static final long SUPPORTS_RTL = 16384L;
        private static final long SYSTEM = 9007199254740992L;
        private static final long SYSTEM_EXT = 72057594037927936L;
        private static final long TEST_ONLY = 32768L;
        private static final long USES_CLEARTEXT_TRAFFIC = 8192L;
        private static final long USES_NON_SDK_API = 8589934592L;
        private static final long USE_32_BIT_ABI = 1099511627776L;
        private static final long USE_EMBEDDED_DEX = 33554432L;
        private static final long VENDOR = 576460752303423488L;
        private static final long VISIBLE_TO_INSTANT_APPS = 2199023255552L;
        private static final long VM_SAFE_MODE = 256L;
        private Booleans() {}

        public static @interface Flags {
        }
    }

    private static class Booleans2 {
        private static final long APEX = 2L;
        private static final long HAS_PCC_COMPONENTS = 8L;
        private static final long STUB = 1L;
        private static final long UPDATABLE_SYSTEM = 4L;
        private Booleans2() {}

        public static @interface Flags {
        }
    }
}
