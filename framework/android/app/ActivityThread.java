package android.app;

public final class ActivityThread extends android.app.ClientTransactionHandler implements android.app.ActivityThreadInternal {
    private static final int ACTIVITY_THREAD_CHECKIN_VERSION = 4;
    private static final long BINDER_CALLBACK_THROTTLE = 10100L;
    private static final long CONTENT_PROVIDER_RETAIN_TIME = 1000L;
    private static final boolean DEBUG_APP_INFO = false;
    private static final boolean DEBUG_BACKUP = false;
    public static final boolean DEBUG_BROADCAST = false;
    public static final boolean DEBUG_CONFIGURATION = false;
    public static final boolean DEBUG_MEMORY_TRIM = false;
    static final boolean DEBUG_MESSAGES = false;
    public static final boolean DEBUG_ORDER = false;
    private static final boolean DEBUG_PROVIDER = false;
    private static final boolean DEBUG_RESULTS = false;
    private static final boolean DEBUG_SERVICE = false;
    private static final boolean DEBUG_STORE_ENABLED = Boolean.valueOf(false);
    private static final java.lang.String DEFAULT_FULL_BACKUP_AGENT = "android.app.backup.FullBackupAgent";
    private static final java.lang.String HEAP_COLUMN = "%13s %8s %8s %8s %8s %8s %8s %8s %8s";
    private static final java.lang.String HEAP_FULL_COLUMN = "%13s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s";
    public static final long INVALID_PROC_STATE_SEQ = -1L;
    private static final long LONG_MESSAGE_THRESHOLD_MS = Long.valueOf(0L);
    private static final long MIN_TIME_BETWEEN_GCS = 5000L;
    private static final java.lang.String ONE_ALT_COUNT_COLUMN = "%21s %8s %21s %8d";
    private static final java.lang.String ONE_COUNT_COLUMN = "%21s %8d";
    private static final java.util.Set<java.lang.String> PERFETTO_TRACING_ALLOWLIST = null;
    public static final java.lang.String PROC_START_SEQ_IDENT = "seq=";
    private static final int REQUEST_DIRECT_ACTIONS_RETRY_MAX_COUNT = 7;
    private static final long REQUEST_DIRECT_ACTIONS_RETRY_TIME_MS = 200L;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_REBIND = 3;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int SERVICE_DONE_EXECUTING_UNBIND = 4;
    private static final int SQLITE_MEM_RELEASED_EVENT_LOG_TAG = 75003;
    public static final java.lang.String TAG = "ActivityThread";
    private static final java.lang.String THREE_COUNT_COLUMNS = "%21s %8d %21s %8d %21s %8d";
    private static final java.lang.String TWO_COUNT_COLUMNS = "%21s %8d %21s %8d";
    private static final java.lang.String TWO_COUNT_COLUMN_HEADER = "%21s %8s %21s %8s";
    private static final int VM_PROCESS_STATE_JANK_IMPERCEPTIBLE = 1;
    private static final int VM_PROCESS_STATE_JANK_PERCEPTIBLE = 0;
    static final boolean localLOGV = false;
    private static volatile android.app.ActivityThread sCurrentActivityThread;
    private static final java.lang.ThreadLocal<android.content.Intent> sCurrentBroadcastIntent = null;
    static volatile android.os.Handler sMainThreadHandler;
    static volatile android.content.pm.IPackageManager sPackageManager;
    private static volatile android.permission.IPermissionManager sPermissionManager;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ActivityClientRecord> mActivities = null;
    final java.util.Map<android.os.IBinder, android.app.servertransaction.DestroyActivityItem> mActivitiesToBeDestroyed = null;
    final java.util.ArrayList<android.app.Application> mAllApplications = null;
    final android.app.ActivityThread.ApplicationThread mAppThread = null;
    private final android.util.SparseArray<android.util.ArrayMap<java.lang.String, android.app.backup.BackupAgent>> mBackupAgentsByUser = null;
    private long mBinderCallbackLast;
    android.app.ActivityThread.AppBindData mBoundApplication;
    private android.content.res.CompatibilityInfo mCompatibilityInfo;
    android.content.res.Configuration mConfiguration;
    private final android.app.ConfigurationChangedListenerController mConfigurationChangedListenerController = null;
    private android.app.ConfigurationController mConfigurationController;
    private android.view.contentcapture.IContentCaptureOptionsCallback.Stub mContentCaptureOptionsCallback;
    private android.os.Bundle mCoreSettings;
    private final java.lang.Object mCoreSettingsLock = null;
    int mCurDefaultDisplayDpi;
    private final android.os.DdmSyncStageUpdater mDdmSyncStageUpdater = null;
    boolean mDensityCompatMode;
    private java.util.ArrayList<java.lang.ref.WeakReference<android.content.Context>> mDisplaySystemUiContexts;
    final java.util.concurrent.Executor mExecutor = null;
    final android.app.ActivityThread.GcIdler mGcIdler = null;
    boolean mGcIdlerScheduled;
    final android.util.ArrayMap<android.app.ActivityThread.ProviderKey, android.app.ActivityThread.ProviderKey> mGetProviderKeys = null;
    final android.app.ActivityThread.H mH = null;
    android.app.Application mInitialApplication;
    android.app.Instrumentation mInstrumentation;
    java.lang.String mInstrumentationAppDir;
    java.lang.String mInstrumentationLibDir;
    java.lang.String mInstrumentationPackageName;
    java.lang.String[] mInstrumentationSplitAppDirs;
    java.lang.String mInstrumentedAppDir;
    java.lang.String mInstrumentedLibDir;
    java.lang.String[] mInstrumentedSplitAppDirs;
    boolean mInstrumentingWithoutRestart;
    final java.util.ArrayList<java.lang.ref.WeakReference<android.app.assist.AssistStructure>> mLastAssistStructures = null;
    private int mLastProcessState;
    int mLastReportedDeviceId;
    private int mLastSessionId;
    public final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ProviderClientRecord> mLocalProviders = null;
    final android.util.ArrayMap<android.content.ComponentName, android.app.ActivityThread.ProviderClientRecord> mLocalProvidersByName = null;
    final android.os.Looper mLooper = null;
    private long mNetworkBlockSeq;
    private final java.lang.Object mNetworkPolicyLock = null;
    final java.util.ArrayList<android.app.ActivityThread.ActivityClientRecord> mNewActivities = null;
    private final java.util.concurrent.atomic.AtomicInteger mNumLaunchingActivities = null;
    int mNumVisibleActivities;
    final android.util.ArrayMap<android.app.Activity, java.util.ArrayList<android.app.OnActivityPausedListener>> mOnPauseListeners = null;
    final android.util.ArrayMap<java.lang.String, java.lang.ref.WeakReference<android.app.LoadedApk>> mPackages = null;
    private final android.util.ArrayMap<java.lang.String, android.content.pm.ApplicationInfo> mPendingAppInfoUpdates = null;
    private final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ConfigChange> mPendingConfigChanges = null;
    android.content.res.Configuration mPendingConfiguration;
    private final android.util.ArrayMap<android.os.IBinder, android.content.res.Configuration> mPendingOverrideConfigs = null;
    android.app.ActivityThread.Profiler mProfiler;
    final android.util.ArrayMap<android.app.ActivityThread.ProviderKey, android.app.ActivityThread.ProviderClientRecord> mProviderMap = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ProviderRefCount> mProviderRefCountMap = null;
    final android.app.ActivityThread.PurgeIdler mPurgeIdler = null;
    boolean mPurgeIdlerScheduled;
    final java.util.ArrayList<android.app.ActivityThread.ActivityClientRecord> mRelaunchingActivities = null;
    private java.util.Map<android.app.ActivityThread.SafeCancellationTransport, android.os.CancellationSignal> mRemoteCancellations;
    final android.util.ArrayMap<java.lang.String, java.lang.ref.WeakReference<android.app.LoadedApk>> mResourcePackages = null;
    private final android.app.ResourcesManager mResourcesManager = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.Service> mServices = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.CreateServiceData> mServicesData = null;
    boolean mSomeActivitiesChanged;
    private android.window.SplashScreen.SplashScreenManagerGlobal mSplashScreenGlobal;
    private long mStartSeq;
    private android.app.ContextImpl mSystemContext;
    boolean mSystemThread;
    private final android.app.servertransaction.TransactionExecutor mTransactionExecutor = null;
    private boolean mUpdateHttpProxyOnBind;
    ActivityThread() { super(); }
    private void applyPendingApplicationInfoChanges(java.lang.String p0) {}
    private void attach(boolean p0, long p1) {}
    private static boolean attemptAttachAgent(java.lang.String p0, java.lang.ClassLoader p1) { return false; }
    private void callActivityOnSaveInstanceState(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void callActivityOnStop(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) {}
    private void checkAndBlockForNetworkAccess() {}
    static void cleanUpPendingRemoveWindows(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    private android.app.ContextImpl createBaseContextForActivity(android.app.ActivityThread.ActivityClientRecord p0) { return null; }
    private android.app.ContextImpl createBaseContextForSandboxActivity(android.app.ActivityThread.ActivityClientRecord p0) { return null; }
    private android.app.ActivityThread.SafeCancellationTransport createSafeCancellationTransport(android.os.CancellationSignal p0) { return null; }
    private void createSplashScreen(android.app.ActivityThread.ActivityClientRecord p0, com.android.internal.policy.DecorView p1, android.window.SplashScreenView.SplashScreenViewParcelable p2, android.view.SurfaceControl p3) {}
    public static android.app.ActivityThread createSystemActivityThreadForTesting() { return null; }
    public static android.app.ActivityThread currentActivityThread() { return null; }
    public static android.app.Application currentApplication() { return null; }
    public static android.content.AttributionSource currentAttributionSource() { return null; }
    public static java.lang.String currentOpPackageName() { return null; }
    public static java.lang.String currentPackageName() { return null; }
    public static java.lang.String currentProcessName() { return null; }
    public static android.content.Context currentSystemContext() { return null; }
    private void deliverNewIntents(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<com.android.internal.content.ReferrerIntent> p1) {}
    private void deliverResults(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2) {}
    public static void dumpBitmapsProto(android.util.proto.ProtoOutputStream p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public static void dumpMemInfoTable(android.util.proto.ProtoOutputStream p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, long p4, long p5, long p6, long p7, long p8, long p9) {}
    public static void dumpMemInfoTable(java.io.PrintWriter p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, int p6, java.lang.String p7, long p8, long p9, long p10, long p11, long p12, long p13) {}
    private static void dumpMemoryInfo(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, int p8, boolean p9, int p10, int p11, int p12) {}
    private static void forceGc() {}
    private android.app.RemoteServiceException.ForegroundServiceDidNotStartInTimeException generateForegroundServiceDidNotStartInTimeException(java.lang.String p0, android.os.Bundle p1) { return null; }
    private android.app.RemoteServiceException.ForegroundServiceDidNotStopInTimeException generateForegroundServiceDidNotStopInTimeException(java.lang.String p0, android.os.Bundle p1) { return null; }
    private java.lang.String getBackupAgentName(android.app.ActivityThread.CreateBackupAgentData p0) { return null; }
    private android.util.ArrayMap<java.lang.String, android.app.backup.BackupAgent> getBackupAgentsForUser(int p0) { return null; }
    private android.os.Bundle getCoreSettingsForDefaultDeviceLocked() { return null; }
    private android.os.Bundle getCoreSettingsForDeviceLocked(int p0) { return null; }
    private android.app.ActivityThread.ProviderKey getGetProviderKey(java.lang.String p0, int p1) { return null; }
    private java.lang.String getInstrumentationLibrary(android.content.pm.ApplicationInfo p0, android.content.pm.InstrumentationInfo p1) { return null; }
    public static android.content.Intent getIntentBeingBroadcast() { return null; }
    private static int getOperationTypeFromBackupMode(int p0) { return 0; }
    private android.app.LoadedApk getPackageInfo(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, java.lang.ClassLoader p2, boolean p3, boolean p4, boolean p5) { return null; }
    private android.app.LoadedApk getPackageInfo(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, java.lang.ClassLoader p2, boolean p3, boolean p4, boolean p5, boolean p6) { return null; }
    public static android.content.pm.IPackageManager getPackageManager() { return null; }
    public static android.permission.IPermissionManager getPermissionManager() { return null; }
    private android.content.Context getSystemUiContextNoCreateLocked(int p0) { return null; }
    private void handleActivityConfigurationChangedInner(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, android.window.ActivityWindowInfo p3, boolean p4) {}
    private void handleActivityWindowInfoChanged(android.app.ActivityThread.ActivityClientRecord p0) {}
    static void handleAttachAgent(java.lang.String p0, android.app.LoadedApk p1) {}
    static void handleAttachStartupAgents(java.lang.String p0) {}
    private void handleBindApplication(android.app.ActivityThread.AppBindData p0) {}
    private void handleBindService(android.app.ActivityThread.BindServiceData p0) {}
    private void handleCreateBackupAgent(android.app.ActivityThread.CreateBackupAgentData p0) {}
    private void handleCreateService(android.app.ActivityThread.CreateServiceData p0) {}
    private void handleDestroyBackupAgent(android.app.ActivityThread.CreateBackupAgentData p0) {}
    private void handleDumpActivity(android.app.ActivityThread.DumpComponentInfo p0) {}
    private void handleDumpGfxInfo(android.app.ActivityThread.DumpComponentInfo p0) {}
    static void handleDumpHeap(android.app.ActivityThread.DumpHeapData p0) {}
    private void handleDumpProvider(android.app.ActivityThread.DumpComponentInfo p0) {}
    private void handleDumpResources(android.app.ActivityThread.DumpResourcesData p0) {}
    private void handleDumpService(android.app.ActivityThread.DumpComponentInfo p0) {}
    private void handleEnterAnimationComplete(android.os.IBinder p0) {}
    private void handleFinishInstrumentationWithoutRestart() {}
    private void handleHandoffActivityDataRequest(android.app.ActivityThread.RequestHandoffActivityData p0) {}
    private void handleInstrumentWithoutRestart(android.app.ActivityThread.AppBindData p0) {}
    private void handleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) {}
    private void handlePerformDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3, android.os.RemoteCallback p4) {}
    private void handleReceiver(android.app.ActivityThread.ReceiverData p0) {}
    private void handleRelaunchActivityInner(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, android.app.servertransaction.PendingTransactionActions p3, boolean p4, android.content.res.Configuration p5, android.window.ActivityWindowInfo p6, int p7, java.lang.String p8) {}
    private void handleRequestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.CancellationSignal p2, android.os.RemoteCallback p3, int p4) {}
    private void handleRunIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) {}
    private void handleServiceArgs(android.app.ActivityThread.ServiceArgsData p0) {}
    private void handleSetContentCaptureOptionsCallback(java.lang.String p0) {}
    private void handleSetCoreSettings(android.os.Bundle p0) {}
    private void handleStartBinderTracking() {}
    private void handleStopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) {}
    private void handleStopService(android.os.IBinder p0) {}
    private void handleTimeoutService(android.os.IBinder p0, int p1) {}
    private void handleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) {}
    private void handleTrimMemory(int p0) {}
    private void handleUnbindService(android.app.ActivityThread.BindServiceData p0) {}
    private void handleUpdatePackageCompatibilityInfo(android.app.ActivityThread.UpdateCompatibilityData p0) {}
    private void handleWindowingModeChangeIfNeeded(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1) {}
    private void incProviderRefLocked(android.app.ActivityThread.ProviderRefCount p0, boolean p1) {}
    private void initInstrumentation(android.content.pm.InstrumentationInfo p0, android.app.ActivityThread.AppBindData p1, android.app.ContextImpl p2) {}
    private void initZipPathValidatorCallback() {}
    public static void initializeMainlineModules() {}
    private static void initializeSystemThread(android.app.ActivityThread p0) {}
    private void installContentProviders(android.content.Context p0, java.util.List<android.content.pm.ProviderInfo> p1) {}
    private android.app.ContentProviderHolder installProvider(android.content.Context p0, android.app.ContentProviderHolder p1, android.content.pm.ProviderInfo p2, boolean p3, boolean p4, boolean p5) { return null; }
    private android.app.ActivityThread.ProviderClientRecord installProviderAuthoritiesLocked(android.content.IContentProvider p0, android.content.ContentProvider p1, android.app.ContentProviderHolder p2) { return null; }
    private static boolean isInDeskUiMode(android.content.res.Configuration p0) { return false; }
    private static boolean isLoadedApkResourceDirsUpToDate(android.app.LoadedApk p0, android.content.pm.ApplicationInfo p1) { return false; }
    public static boolean isProtectedBroadcast(android.content.Intent p0) { return false; }
    public static boolean isProtectedComponent(android.content.pm.ActivityInfo p0) { return false; }
    private static boolean isProtectedComponent(android.content.pm.ComponentInfo p0, java.lang.String p1) { return false; }
    public static boolean isProtectedComponent(android.content.pm.ServiceInfo p0) { return false; }
    public static boolean isSystem() { return false; }
    private static boolean isVirtualGamepadOverrideAllowed(android.app.Application p0) { return false; }
    public static void main(java.lang.String[] p0) {}
    private native void nInitZygoteChildHeapProfiling();
    private native void nPurgePendingResources();
    private static android.os.DdmSyncStageUpdater newDdmSyncStageUpdater() { return null; }
    private static android.app.servertransaction.TransactionExecutor newTransactionExecutor(android.app.ActivityThread p0) { return null; }
    private void onCoreSettingsChange() {}
    private boolean onlyDeskInUiModeChanged(android.content.res.Configuration p0, android.content.res.Configuration p1) { return false; }
    private android.content.res.Configuration performActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, android.content.res.Configuration p2, int p3, boolean p4) { return null; }
    private android.content.res.Configuration performConfigurationChangedForActivity(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, boolean p3) { return null; }
    private android.app.Activity performLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.content.Intent p1) { return null; }
    private android.os.Bundle performPauseActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2, android.app.servertransaction.PendingTransactionActions p3) { return null; }
    private void performPauseActivityIfNeeded(android.app.ActivityThread.ActivityClientRecord p0, java.lang.String p1) {}
    private void performStopActivityInner(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions.StopInfo p1, boolean p2, boolean p3, java.lang.String p4) {}
    private android.content.pm.InstrumentationInfo prepareInstrumentation(android.app.ActivityThread.AppBindData p0) { return null; }
    static void printRow(java.io.PrintWriter p0, java.lang.String p1, java.lang.Object... p2) {}
    private void purgePendingResources() {}
    private void relaunchAllActivities(boolean p0, java.lang.String p1) {}
    private android.os.CancellationSignal removeSafeCancellationTransport(android.app.ActivityThread.SafeCancellationTransport p0) { return null; }
    private void reportSizeConfigurations(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void reportSplashscreenViewShown(android.os.IBinder p0, android.window.SplashScreenView p1) {}
    private void reportTopResumedActivityChanged(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) {}
    private static java.lang.String safeToComponentShortString(android.content.Intent p0) { return null; }
    private void schedulePauseWithUserLeaveHintAndReturnToCurrentState(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void schedulePauseWithUserLeavingHint(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void scheduleRelaunchActivityIfPossible(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    private void scheduleResume(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2, int p3) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2, int p3, boolean p4) {}
    private void setupGraphicsSupport(android.content.Context p0) {}
    public static boolean shouldReportChange(android.content.res.Configuration p0, android.content.res.Configuration p1, android.window.SizeConfigurationBuckets p2, int p3, boolean p4) { return false; }
    private boolean shouldSkipActivityRelaunchWhenDocking(android.app.Activity p0) { return false; }
    static void staticInitForRavenwood(android.app.ActivityThread p0) {}
    static void staticInitForRavenwood$ravenwood(android.app.ActivityThread p0) {}
    private void suspendAllAndSendVmStart(android.app.ActivityThread.AppBindData p0) {}
    private void syncTransferSplashscreenViewTransaction(android.window.SplashScreenView p0, android.os.IBinder p1, android.view.View p2, android.view.SurfaceControl p3) {}
    public static android.app.ActivityThread systemMain() { return null; }
    public static void throwIfNotInstrumenting() {}
    public static void throwIfNotInstrumenting$ravenwood() {}
    private void throwRemoteServiceException(java.lang.String p0, int p1, android.os.Bundle p2) {}
    private static int toVmProcessState(int p0) { return 0; }
    private boolean updateDebugViewAttributeState() { return false; }
    public static void updateHttpProxy(android.content.Context p0) {}
    private void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) {}
    private void updateVisibility(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    private void updateVmProcessState(int p0, int p1) {}
    private void waitForDebugger(android.app.ActivityThread.AppBindData p0) {}
    public android.content.IContentProvider acquireExistingProvider(android.content.Context p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public android.content.IContentProvider acquireProvider(android.content.Context p0, java.lang.String p1, int p2, boolean p3) { return null; }
    void addApplication(android.app.Application p0) {}
    public void addConfigurationChangedListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.IBinder> p1) {}
    final void appNotRespondingViaProvider(android.os.IBinder p0) {}
    public final void applyConfigurationToResources(android.content.res.Configuration p0) {}
    public java.util.ArrayList<android.content.ComponentCallbacks2> collectComponentCallbacks(boolean p0) { return null; }
    void completeRemoveProvider(android.app.ActivityThread.ProviderRefCount p0) {}
    public void countLaunchingActivities(int p0) {}
    public android.content.Context createDisplayContextIfNeeded(android.content.Context p0, android.app.ActivityThread.ReceiverData p1) { return null; }
    public android.content.Context createSystemUiContextForTesting(int p0) { return null; }
    void doGcIfNeeded() {}
    void doGcIfNeeded(java.lang.String p0) {}
    void finishInstrumentation(int p0, android.os.Bundle p1) {}
    public java.util.Map<android.os.IBinder, android.app.servertransaction.DestroyActivityItem> getActivitiesToBeDestroyed() { return null; }
    public final android.app.Activity getActivity(android.os.IBinder p0) { return null; }
    public android.app.ActivityThread.ActivityClientRecord getActivityClient(android.os.IBinder p0) { return null; }
    public android.app.Application getApplication() { return null; }
    public android.app.ActivityThread.ApplicationThread getApplicationThread() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    android.os.Bundle getDefaultDeviceCoreSettings() { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    float getFloatCoreSetting(java.lang.String p0, float p1) { return 0.0f; }
    public android.os.Handler getHandler() { return null; }
    public android.app.Instrumentation getInstrumentation() { return null; }
    int getIntCoreSetting(java.lang.String p0, int p1) { return 0; }
    int getIntCoreSetting(java.lang.String p0, int p1, int p2) { return 0; }
    public android.app.Activity getLastCreatedActivity() { return null; }
    public android.os.Looper getLooper() { return null; }
    public android.app.LoadedApk getPackageInfo(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) { return null; }
    public android.app.LoadedApk getPackageInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1, int p2) { return null; }
    public android.app.LoadedApk getPackageInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1, int p2, int p3) { return null; }
    public android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0) { return null; }
    public android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1) { return null; }
    public java.lang.String getProcessName() { return null; }
    public int getProcessState() { return 0; }
    public java.lang.String getProfileFilePath() { return null; }
    java.lang.String getStringCoreSetting(java.lang.String p0, java.lang.String p1) { return null; }
    public android.app.ContextImpl getSystemContext() { return null; }
    public android.content.Context getSystemUiContext() { return null; }
    public android.content.Context getSystemUiContext(int p0) { return null; }
    public android.content.Context getSystemUiContextNoCreate() { return null; }
    android.content.res.Resources getTopLevelResources(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, android.app.LoadedApk p5, android.content.res.Configuration p6) { return null; }
    android.app.servertransaction.TransactionExecutor getTransactionExecutor() { return null; }
    public void handleActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0) {}
    public void handleActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, android.window.ActivityWindowInfo p3) {}
    void handleActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, android.window.ActivityWindowInfo p3, boolean p4) {}
    public void handleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
    public void handleAttachSplashScreenView(android.app.ActivityThread.ActivityClientRecord p0, android.window.SplashScreenView.SplashScreenViewParcelable p1, android.view.SurfaceControl p2) {}
    public void handleConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void handleDestroyActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, java.lang.String p3) {}
    void handleDispatchPackageBroadcast(int p0, java.lang.String[] p1) {}
    public void handleInstallProvider(android.content.pm.ProviderInfo p0) {}
    public android.app.Activity handleLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, int p2, android.content.Intent p3) { return null; }
    void handleLowMemory() {}
    public void handleNewIntent(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<com.android.internal.content.ReferrerIntent> p1) {}
    public void handlePauseActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, boolean p3, android.app.servertransaction.PendingTransactionActions p4, java.lang.String p5) {}
    public void handlePictureInPictureRequested(android.app.ActivityThread.ActivityClientRecord p0) {}
    public void handlePictureInPictureStateChanged(android.app.ActivityThread.ActivityClientRecord p0, android.app.PictureInPictureUiState p1) {}
    void handleProfilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) {}
    public void handleRelaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public void handleRelaunchActivityLocally(android.os.IBinder p0) {}
    public void handleRequestAssistContextExtras(android.app.ActivityThread.RequestAssistContextExtras p0) {}
    public void handleResumeActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, boolean p3, java.lang.String p4) {}
    public void handleSendResult(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2) {}
    public void handleStartActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, android.app.ActivityOptions.SceneTransitionInfo p2) {}
    public void handleStopActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, boolean p2, java.lang.String p3) {}
    public void handleSystemApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
    public void handleTopResumedActivityChanged(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) {}
    public void handleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) {}
    void handleUnstableProviderDied(android.os.IBinder p0, boolean p1) {}
    void handleUnstableProviderDiedLocked(android.os.IBinder p0, boolean p1) {}
    public void handleWindowContextInfoChanged(android.os.IBinder p0, android.window.WindowContextInfo p1) {}
    public void handleWindowContextWindowRemoval(android.os.IBinder p0) {}
    public void installSystemApplicationInfo(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) {}
    public void installSystemProviders(java.util.List<android.content.pm.ProviderInfo> p0) {}
    public boolean isHandleSplashScreenExit(android.os.IBinder p0) { return false; }
    public boolean isInDensityCompatMode() { return false; }
    public boolean isProfiling() { return false; }
    public void onNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) {}
    void onSystemUiContextCleanup(android.app.ContextImpl p0) {}
    public android.app.LoadedApk peekPackageInfo(java.lang.String p0, boolean p1) { return null; }
    void performDestroyActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, java.lang.String p3) {}
    final android.os.Bundle performPauseActivity(android.os.IBinder p0, boolean p1, java.lang.String p2, android.app.servertransaction.PendingTransactionActions p3) { return null; }
    public void performRestartActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    public boolean performResumeActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) { return false; }
    final void performStopActivity(android.os.IBinder p0, boolean p1, java.lang.String p2) {}
    final void performUserLeavingActivity(android.app.ActivityThread.ActivityClientRecord p0) {}
    public android.app.ActivityThread.ActivityClientRecord prepareRelaunchActivity(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5, android.window.ActivityWindowInfo p6, int p7) { return null; }
    public void registerOnActivityPausedListener(android.app.Activity p0, android.app.OnActivityPausedListener p1) {}
    public void registerSplashScreenManager(android.window.SplashScreen.SplashScreenManagerGlobal p0) {}
    public boolean releaseProvider(android.content.IContentProvider p0, boolean p1) { return false; }
    public void removeConfigurationChangedListener(java.util.function.Consumer<android.os.IBinder> p0) {}
    public void reportRefresh(android.app.ActivityThread.ActivityClientRecord p0) {}
    public void reportRelaunch(android.app.ActivityThread.ActivityClientRecord p0) {}
    public void reportStop(android.app.servertransaction.PendingTransactionActions p0) {}
    public android.content.pm.ActivityInfo resolveActivityInfo(android.content.Intent p0) { return null; }
    final void scheduleContextCleanup(android.app.ContextImpl p0, java.lang.String p1, java.lang.String p2) {}
    void scheduleGcIdler() {}
    void schedulePurgeIdler() {}
    void scheduleRelaunchActivity(android.os.IBinder p0) {}
    public void sendActivityResult(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.content.Intent p4) {}
    void sendMessage(int p0, java.lang.Object p1) {}
    public final android.app.Activity startActivityNow(android.app.Activity p0, java.lang.String p1, android.content.Intent p2, android.content.pm.ActivityInfo p3, android.os.IBinder p4, android.os.Bundle p5, android.app.Activity.NonConfigurationInstances p6, android.os.IBinder p7, android.os.IBinder p8) { return null; }
    public void stopProfiling() {}
    public void unregisterOnActivityPausedListener(android.app.Activity p0, android.app.OnActivityPausedListener p1) {}
    void unscheduleGcIdler() {}
    void unschedulePurgeIdler() {}
    public void updateDeviceIdForNonUIContexts(int p0) {}
    public void updatePendingActivityConfiguration(android.os.IBinder p0, android.content.res.Configuration p1) {}
    public void updatePendingActivityConfiguration(android.os.IBinder p0, android.content.res.Configuration p1, android.window.ActivityWindowInfo p2, int p3) {}
    public void updatePendingConfiguration(android.content.res.Configuration p0) {}
    public void updateProcessState(int p0, boolean p1) {}

    public static final class ActivityClientRecord {
        android.app.Activity activity;
        android.view.ViewRootImpl.ActivityConfigCallback activityConfigCallback;
        android.content.pm.ActivityInfo activityInfo;
        public android.os.IBinder assistToken;
        android.content.res.CompatibilityInfo compatInfo;
        android.content.res.Configuration createdConfig;
        java.lang.String embeddedID;
        android.app.HandoffActivityData handoffActivityData;
        boolean hideForNow;
        int ident;
        public android.os.IBinder initialCallerInfoAccessToken;
        android.content.Intent intent;
        public final boolean isForward = false;
        boolean isTopResumedActivity;
        android.app.Activity.NonConfigurationInstances lastNonConfigurationInstances;
        boolean lastReportedTopResumedState;
        private final android.window.ActivityWindowInfo mActivityWindowInfo = null;
        int mDisplayId;
        private final android.window.ActivityWindowInfo mLastReportedActivityWindowInfo = null;
        int mLastReportedWindowingMode;
        boolean mLaunchedFromBubble;
        private int mLifecycleState;
        android.view.Window mPendingRemoveWindow;
        android.view.WindowManager mPendingRemoveWindowManager;
        boolean mPreserveWindow;
        android.app.ActivityOptions.SceneTransitionInfo mSceneTransitionInfo;
        private android.window.SizeConfigurationBuckets mSizeConfigurations;
        public android.os.IBinder mTaskFragmentToken;
        android.content.res.Configuration overrideConfig;
        public android.app.LoadedApk packageInfo;
        android.app.Activity parent;
        boolean paused;
        int pendingConfigChanges;
        java.util.List<com.android.internal.content.ReferrerIntent> pendingIntents;
        java.util.List<android.app.ResultInfo> pendingResults;
        android.os.PersistableBundle persistentState;
        android.app.ProfilerInfo profilerInfo;
        java.lang.String referrer;
        public android.os.IBinder shareableActivityToken;
        boolean startsNotResumed;
        android.os.Bundle state;
        boolean stopped;
        private final android.content.res.Configuration tmpConfig = null;
        public android.os.IBinder token;
        com.android.internal.app.IVoiceInteractor voiceInteractor;
        android.view.Window window;
        public ActivityClientRecord() {}
        public ActivityClientRecord(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, java.lang.String p5, com.android.internal.app.IVoiceInteractor p6, android.os.Bundle p7, android.os.PersistableBundle p8, java.util.List<android.app.ResultInfo> p9, java.util.List<com.android.internal.content.ReferrerIntent> p10, android.app.ActivityOptions.SceneTransitionInfo p11, boolean p12, android.app.ProfilerInfo p13, android.app.ClientTransactionHandler p14, android.os.IBinder p15, android.os.IBinder p16, boolean p17, android.os.IBinder p18, android.os.IBinder p19, android.window.ActivityWindowInfo p20, int p21) {}
        private void init() {}
        private boolean isPreHoneycomb() { return false; }
        private boolean isPreP() { return false; }
        public android.window.ActivityWindowInfo getActivityWindowInfo() { return null; }
        public int getLifecycleState() { return 0; }
        public java.lang.String getStateString() { return null; }
        public boolean isPersistable() { return false; }
        public boolean isVisibleFromServer() { return false; }
        public void setState(int p0) {}
        public java.lang.String toString() { return null; }
    }

    static final class AppBindData {
        android.content.pm.ApplicationInfo appInfo;
        android.content.AutofillOptions autofillOptions;
        java.lang.String buildSerial;
        android.content.res.CompatibilityInfo compatInfo;
        android.content.res.Configuration config;
        android.content.ContentCaptureOptions contentCaptureOptions;
        int debugMode;
        long[] disabledCompatChanges;
        boolean enableBinderTracking;
        long[] enabledCompatChanges;
        android.app.LoadedApk info;
        android.app.ProfilerInfo initProfilerInfo;
        android.os.Bundle instrumentationArgs;
        android.content.ComponentName instrumentationName;
        android.app.IUiAutomationConnection instrumentationUiAutomationConnection;
        android.app.IInstrumentationWatcher instrumentationWatcher;
        boolean isSdkInSandbox;
        boolean mLogChangeChecksToStatsD;
        long[] mLoggableCompatChanges;
        android.os.SharedMemory mSerializedSystemFontMap;
        boolean persistent;
        java.lang.String processName;
        java.util.List<android.content.pm.ProviderInfo> providers;
        boolean restrictedBackupMode;
        java.lang.String sdkSandboxClientAppPackage;
        java.lang.String sdkSandboxClientAppVolumeUuid;
        long startRequestedElapsedTime;
        long startRequestedUptime;
        boolean trackAllocation;
        AppBindData() {}
        public java.lang.String toString() { return null; }
    }

    private class ApplicationThread extends android.app.IApplicationThread.Stub {
        private static final java.lang.String DB_CONNECTION_INFO_FORMAT = "  %8s %8s %14s %5d %5d %5d  %s";
        private static final java.lang.String DB_CONNECTION_INFO_HEADER = "  %8s %8s %14s %5s %5s %5s  %s";
        private static final java.lang.String DB_POOL_INFO_FORMAT = "  %13d %13d %13d  %s";
        private static final java.lang.String DB_POOL_INFO_HEADER = "  %13s %13s %13s  %s";
        ApplicationThread(android.app.ActivityThread p0) { super(); }
        private void dumpDatabaseInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1, boolean p2) {}
        private void dumpMemInfo(android.util.proto.ProtoOutputStream p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
        private void dumpMemInfo(java.io.PrintWriter p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7) {}
        private void dumpMemInfoNativeAllocations(java.io.PrintWriter p0) {}
        private void dumpMemInfoSharedBitmaps(java.io.PrintWriter p0, android.os.Debug.MemoryInfo p1) {}
        private java.io.File getDatabasesDir(android.content.Context p0) { return null; }
        private void updateCameraCompatInfo(android.content.res.CompatibilityInfo p0) {}
        private void updateCompatOverrideScale(android.content.res.CompatibilityInfo p0) {}
        public void attachAgent(java.lang.String p0) {}
        public void attachStartupAgents(java.lang.String p0) {}
        public final void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.lang.String p2, java.lang.String p3, boolean p4, android.content.pm.ProviderInfoList p5, android.content.ComponentName p6, android.app.ProfilerInfo p7, android.os.Bundle p8, android.app.IInstrumentationWatcher p9, android.app.IUiAutomationConnection p10, int p11, boolean p12, boolean p13, boolean p14, boolean p15, android.content.res.Configuration p16, android.content.res.CompatibilityInfo p17, java.util.Map p18, android.os.Bundle p19, java.lang.String p20, android.content.AutofillOptions p21, android.content.ContentCaptureOptions p22, long[] p23, long[] p24, long[] p25, boolean p26, android.os.SharedMemory p27, java.io.FileDescriptor p28, long p29, long p30) {}
        public void clearDnsCache() {}
        public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) {}
        public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) {}
        public void dumpBitmapsProto(android.os.ParcelFileDescriptor p0, java.lang.String p1) {}
        public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.os.ParcelFileDescriptor p5, android.os.RemoteCallback p6) {}
        public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, java.lang.String[] p8) {}
        public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) {}
        public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) {}
        public void dumpResources(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) {}
        public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) {}
        public void getExecutableMethodFileOffsets(android.os.instrumentation.MethodDescriptor p0, android.os.instrumentation.IOffsetCallback p1) {}
        int getProcessState() { return 0; }
        public void handleTrustStorageUpdate() {}
        public void instrumentWithoutRestart(android.content.ComponentName p0, android.os.Bundle p1, android.app.IInstrumentationWatcher p2, android.app.IUiAutomationConnection p3, android.content.pm.ApplicationInfo p4) {}
        public void notifyCleartextNetwork(byte[] p0) {}
        public void notifyContentProviderPublishStatus(android.app.ContentProviderHolder p0, java.lang.String p1, int p2, boolean p3) {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) {}
        public void processInBackground() {}
        public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) {}
        public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) {}
        public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) {}
        public void requestHandoffActivityData(android.os.IBinder p0, java.util.List<android.os.IBinder> p1) {}
        public final void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) {}
        public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
        public final void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, boolean p3, int p4, long p5) {}
        public void scheduleCrash(java.lang.String p0, int p1, android.os.Bundle p2) {}
        public final void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) {}
        public final void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) {}
        public final void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, int p1) {}
        public void scheduleEnterAnimationComplete(android.os.IBinder p0) {}
        public final void scheduleExit() {}
        public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) {}
        public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
        public void scheduleLowMemory() {}
        public void scheduleOnNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) {}
        public final void schedulePing(android.os.RemoteCallback p0) {}
        public final void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) {}
        public final void scheduleReceiverList(java.util.List<android.app.ReceiverInfo> p0) throws android.os.RemoteException {}
        public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public final void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) {}
        public final void scheduleStopService(android.os.IBinder p0) {}
        public final void scheduleSuicide() {}
        public void scheduleTaskFragmentTransaction(android.window.ITaskFragmentOrganizer p0, android.window.TaskFragmentTransaction p1) throws android.os.RemoteException {}
        public final void scheduleTimeoutService(android.os.IBinder p0, int p1) {}
        public final void scheduleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) {}
        public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
        public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) {}
        public void scheduleTrimMemory(int p0) {}
        public final void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2) {}
        public void setCoreSettings(android.os.Bundle p0) {}
        public void setNetworkBlockSeq(long p0) {}
        public void setProcessState(int p0) {}
        public void setSchedulingGroup(int p0) {}
        public void startBinderTracking() {}
        public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) {}
        public void unstableProviderDied(android.os.IBinder p0) {}
        public void updateHttpProxy() {}
        public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) {}
        public final void updateTimePrefs(int p0) {}
        public void updateTimeZone() {}
        public void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) {}
    }

    static final class BindServiceData {
        long bindSeq;
        android.os.IBinder bindToken;
        android.content.Intent intent;
        boolean rebind;
        android.os.IBinder token;
        BindServiceData() {}
        public java.lang.String toString() { return null; }
    }

    private static class ConfigChange {
        private final android.window.ActivityWindowInfo mActivityWindowInfo = null;
        private final android.content.res.Configuration mConfiguration = null;
        private final int mDisplayId = 0;
        private ConfigChange(android.content.res.Configuration p0, android.window.ActivityWindowInfo p1, int p2) {}
    }

    static final class ContextCleanupInfo {
        android.app.ContextImpl context;
        java.lang.String what;
        java.lang.String who;
        ContextCleanupInfo() {}
    }

    static final class CreateBackupAgentData {
        android.content.pm.ApplicationInfo appInfo;
        int backupDestination;
        int backupMode;
        int userId;
        CreateBackupAgentData() {}
        public java.lang.String toString() { return null; }
    }

    static final class CreateServiceData {
        android.content.res.CompatibilityInfo compatInfo;
        android.content.pm.ServiceInfo info;
        android.content.Intent intent;
        android.os.IBinder token;
        CreateServiceData() {}
        public java.lang.String toString() { return null; }
    }

    static final class DumpComponentInfo {
        java.lang.String[] args;
        android.os.ParcelFileDescriptor fd;
        java.lang.String prefix;
        android.os.IBinder token;
        DumpComponentInfo() {}
    }

    static final class DumpHeapData {
        public java.lang.String dumpBitmaps;
        android.os.ParcelFileDescriptor fd;
        android.os.RemoteCallback finishCallback;
        public boolean mallocInfo;
        public boolean managed;
        java.lang.String path;
        public boolean runGc;
        DumpHeapData() {}
    }

    static final class DumpResourcesData {
        public android.os.ParcelFileDescriptor fd;
        public android.os.RemoteCallback finishCallback;
        DumpResourcesData() {}
    }

    final class GcIdler implements android.os.MessageQueue.IdleHandler {
        GcIdler(android.app.ActivityThread p0) {}
        public final boolean queueIdle() { return false; }
    }

    class H extends android.os.Handler {
        public static final int APPLICATION_INFO_CHANGED = 156;
        public static final int ATTACH_AGENT = 155;
        public static final int ATTACH_STARTUP_AGENTS = 162;
        public static final int BIND_APPLICATION = 110;
        public static final int BIND_SERVICE = 121;
        public static final int CLEAN_UP_CONTEXT = 119;
        public static final int CONFIGURATION_CHANGED = 118;
        public static final int CREATE_BACKUP_AGENT = 128;
        public static final int CREATE_SERVICE = 114;
        public static final int DESTROY_BACKUP_AGENT = 129;
        public static final int DISPATCH_PACKAGE_BROADCAST = 133;
        public static final int DUMP_ACTIVITY = 136;
        public static final int DUMP_GFXINFO = 165;
        public static final int DUMP_HEAP = 135;
        public static final int DUMP_PROVIDER = 141;
        public static final int DUMP_RESOURCES = 166;
        public static final int DUMP_SERVICE = 123;
        public static final int ENTER_ANIMATION_COMPLETE = 149;
        public static final int EXECUTE_TRANSACTION = 159;
        public static final int EXIT_APPLICATION = 111;
        public static final int FINISH_INSTRUMENTATION_WITHOUT_RESTART = 171;
        public static final int GC_WHEN_IDLE = 120;
        public static final int INSTALL_PROVIDER = 145;
        public static final int INSTRUMENT_WITHOUT_RESTART = 170;
        public static final int LOCAL_VOICE_INTERACTION_STARTED = 154;
        public static final int LOW_MEMORY = 124;
        public static final int ON_NEW_SCENE_TRANSITION_INFO = 146;
        public static final int PING = 168;
        public static final int PROFILER_CONTROL = 127;
        public static final int PURGE_RESOURCES = 161;
        public static final int RECEIVER = 113;
        public static final int RELAUNCH_ACTIVITY = 160;
        public static final int REMOVE_PROVIDER = 131;
        public static final int REQUEST_ASSIST_CONTEXT_EXTRAS = 143;
        public static final int REQUEST_HANDOFF_ACTIVITY_DATA = 173;
        public static final int RUN_ISOLATED_ENTRY_POINT = 158;
        public static final int SCHEDULE_CRASH = 134;
        public static final int SERVICE_ARGS = 115;
        public static final int SET_CONTENT_CAPTURE_OPTIONS_CALLBACK = 164;
        public static final int SET_CORE_SETTINGS = 138;
        public static final int SLEEPING = 137;
        public static final int START_BINDER_TRACKING = 150;
        public static final int STOP_BINDER_TRACKING_AND_DUMP = 151;
        public static final int STOP_SERVICE = 116;
        public static final int SUICIDE = 130;
        public static final int TIMEOUT_SERVICE = 167;
        public static final int TIMEOUT_SERVICE_FOR_TYPE = 172;
        public static final int TRANSLUCENT_CONVERSION_COMPLETE = 144;
        public static final int UNBIND_SERVICE = 122;
        public static final int UNSTABLE_PROVIDER_DIED = 142;
        public static final int UPDATE_PACKAGE_COMPATIBILITY_INFO = 139;
        public static final int UPDATE_UI_TRANSLATION_STATE = 163;
        H(android.app.ActivityThread p0) { super(); }
        java.lang.String codeToString(int p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
    }

    private class Idler implements android.os.MessageQueue.IdleHandler {
        private Idler(android.app.ActivityThread p0) {}
        public final boolean queueIdle() { return false; }
    }

    static final class Profiler {
        boolean autoStopProfiler;
        boolean handlingProfiling;
        int mProfilerFlags;
        android.os.ParcelFileDescriptor profileFd;
        java.lang.String profileFile;
        boolean profiling;
        int samplingInterval;
        boolean streamingOutput;
        Profiler() {}
        public void setProfiler(android.app.ProfilerInfo p0) {}
        public void startProfiling() {}
        public void stopProfiling() {}
    }

    public static final class ProviderClientRecord {
        final android.app.ContentProviderHolder mHolder = null;
        final android.content.ContentProvider mLocalProvider = null;
        final java.lang.String[] mNames = null;
        final android.content.IContentProvider mProvider = null;
        public ProviderClientRecord(java.lang.String[] p0, android.content.IContentProvider p1, android.content.ContentProvider p2, android.app.ContentProviderHolder p3) {}
    }

    private static final class ProviderKey {
        final java.lang.String authority = null;
        android.app.ContentProviderHolder mHolder;
        final java.lang.Object mLock = null;
        final int userId = 0;
        public ProviderKey(java.lang.String p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class ProviderRefCount {
        public final android.app.ActivityThread.ProviderClientRecord client = null;
        public final android.app.ContentProviderHolder holder = null;
        public boolean removePending;
        public int stableCount;
        public int unstableCount;
        ProviderRefCount(android.app.ContentProviderHolder p0, android.app.ActivityThread.ProviderClientRecord p1, int p2, int p3) {}
    }

    final class PurgeIdler implements android.os.MessageQueue.IdleHandler {
        PurgeIdler(android.app.ActivityThread p0) {}
        public boolean queueIdle() { return false; }
    }

    public static final class ReceiverData extends android.content.BroadcastReceiver.PendingResult {
        android.content.res.CompatibilityInfo compatInfo;
        android.content.pm.ActivityInfo info;
        final android.content.Intent intent = null;
        final android.app.ActivityOptions mOptions = null;
        public ReceiverData(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, boolean p6, android.os.IBinder p7, int p8, int p9, java.lang.String p10) { super(0, (java.lang.String)null, (android.os.Bundle)null, 0, false, false, (android.os.IBinder)null, 0, 0); }
        public java.lang.String toString() { return null; }
    }

    static final class ReceiverList {
        int index;
        java.util.List<android.app.ReceiverInfo> receivers;
        ReceiverList() {}
    }

    static final class RequestAssistContextExtras {
        android.os.IBinder activityToken;
        int flags;
        android.os.IBinder requestToken;
        int requestType;
        int sessionId;
        RequestAssistContextExtras() {}
    }

    static final class RequestHandoffActivityData {
        java.util.List<android.os.IBinder> activityTokens;
        android.os.IBinder requestToken;
        RequestHandoffActivityData() {}
    }

    private static final class SafeCancellationTransport extends android.os.ICancellationSignal.Stub {
        private final java.lang.ref.WeakReference<android.app.ActivityThread> mWeakActivityThread = null;
        SafeCancellationTransport(android.app.ActivityThread p0, android.os.CancellationSignal p1) { super(); }
        public void cancel() {}
    }

    static final class ServiceArgsData {
        android.content.Intent args;
        int flags;
        int startId;
        boolean taskRemoved;
        android.os.IBinder token;
        ServiceArgsData() {}
        public java.lang.String toString() { return null; }
    }

    static final class UpdateCompatibilityData {
        android.content.res.CompatibilityInfo info;
        java.lang.String pkg;
        UpdateCompatibilityData() {}
    }
}
