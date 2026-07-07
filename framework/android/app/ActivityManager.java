package android.app;

public class ActivityManager {
    public static final java.lang.String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
    public static final int APP_START_MODE_DELAYED = 1;
    public static final int APP_START_MODE_DELAYED_RIGID = 2;
    public static final int APP_START_MODE_DISABLED = 3;
    public static final int APP_START_MODE_NORMAL = 0;
    public static final int ASSIST_CONTEXT_AUTOFILL = 2;
    public static final int ASSIST_CONTEXT_BASIC = 0;
    public static final int ASSIST_CONTEXT_CONTENT = 3;
    public static final int ASSIST_CONTEXT_FULL = 1;
    public static final int ASSIST_CONTEXT_SKIP_SCREEN_CONTENT = 4;
    public static final int BROADCAST_FAILED_USER_STOPPED = -2;
    public static final int BROADCAST_STICKY_CANT_HAVE_PERMISSION = -1;
    public static final int BROADCAST_SUCCESS = 0;
    public static final int COMPAT_MODE_ALWAYS = -1;
    public static final int COMPAT_MODE_DISABLED = 0;
    public static final int COMPAT_MODE_ENABLED = 1;
    public static final int COMPAT_MODE_NEVER = -2;
    public static final int COMPAT_MODE_TOGGLE = 2;
    public static final int COMPAT_MODE_UNKNOWN = -3;
    private static final boolean DEVELOPMENT_FORCE_LOW_RAM = Boolean.valueOf(false);
    public static final long DROP_CLOSE_SYSTEM_DIALOGS = 174664120L;
    private static final int FIRST_START_FATAL_ERROR_CODE = -100;
    private static final int FIRST_START_NON_FATAL_ERROR_CODE = 100;
    private static final int FIRST_START_SUCCESS_CODE = 0;
    public static final int FLAG_AND_LOCKED = 2;
    public static final int FLAG_AND_UNLOCKED = 4;
    public static final int FLAG_AND_UNLOCKING_OR_UNLOCKED = 8;
    public static final int FLAG_OR_STOPPED = 1;
    public static final int FOREGROUND_SERVICE_API_EVENT_BEGIN = 1;
    public static final int FOREGROUND_SERVICE_API_EVENT_END = 2;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_AUDIO = 5;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_BLUETOOTH = 2;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_CAMERA = 1;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_CDM = 9;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_LOCATION = 3;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_MEDIA_PLAYBACK = 4;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_MICROPHONE = 6;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_PHONE_CALL = 7;
    @android.annotation.SystemApi
    public static final int FOREGROUND_SERVICE_API_TYPE_USB = 8;
    private static final android.util.Singleton<android.app.IActivityManager> IActivityManagerSingleton = null;
    public static final int INSTR_FLAG_ALWAYS_CHECK_SIGNATURE = 16;
    public static final int INSTR_FLAG_DISABLE_HIDDEN_API_CHECKS = 1;
    public static final int INSTR_FLAG_DISABLE_ISOLATED_STORAGE = 2;
    public static final int INSTR_FLAG_DISABLE_TEST_API_CHECKS = 4;
    public static final int INSTR_FLAG_INSTRUMENT_SDK_IN_SANDBOX = 64;
    public static final int INSTR_FLAG_INSTRUMENT_SDK_SANDBOX = 32;
    public static final int INSTR_FLAG_NO_RESTART = 8;
    public static final int INSTR_FLAG_RUN_IN_PCC = 128;
    public static final int INTENT_SENDER_ACTIVITY = 2;
    public static final int INTENT_SENDER_ACTIVITY_RESULT = 3;
    public static final int INTENT_SENDER_BROADCAST = 1;
    public static final int INTENT_SENDER_FOREGROUND_SERVICE = 5;
    public static final int INTENT_SENDER_SERVICE = 4;
    public static final int INTENT_SENDER_UNKNOWN = 0;
    private static final int LAST_START_FATAL_ERROR_CODE = -1;
    private static final int LAST_START_NON_FATAL_ERROR_CODE = 199;
    private static final int LAST_START_SUCCESS_CODE = 99;
    public static final long LOCK_DOWN_CLOSE_SYSTEM_DIALOGS = 174664365L;
    public static final int LOCK_TASK_MODE_LOCKED = 1;
    public static final int LOCK_TASK_MODE_NONE = 0;
    public static final int LOCK_TASK_MODE_PINNED = 2;
    public static final int MAX_PROCESS_STATE = 20;
    public static final java.lang.String META_HOME_ALTERNATE = "android.app.home.alternate";
    public static final int MIN_PROCESS_STATE = 0;
    public static final int MOVE_TASK_NO_USER_ACTION = 2;
    public static final int MOVE_TASK_WITH_HOME = 1;
    public static final int PROCESS_CAPABILITY_ALL = 511;
    public static final int PROCESS_CAPABILITY_BFSL = 16;
    public static final int PROCESS_CAPABILITY_CPU_TIME = 128;
    public static final int PROCESS_CAPABILITY_FOREGROUND_AUDIO_CONTROL = 64;
    @android.annotation.SystemApi
    public static final int PROCESS_CAPABILITY_FOREGROUND_CAMERA = 2;
    @android.annotation.SystemApi
    public static final int PROCESS_CAPABILITY_FOREGROUND_LOCATION = 1;
    @android.annotation.SystemApi
    public static final int PROCESS_CAPABILITY_FOREGROUND_MICROPHONE = 4;
    public static final int PROCESS_CAPABILITY_IMPLICIT_CPU_TIME = 256;
    public static final int PROCESS_CAPABILITY_INSTRUMENTATION_DEFAULTS = 70;
    @android.annotation.SystemApi
    public static final int PROCESS_CAPABILITY_NONE = 0;
    public static final int PROCESS_CAPABILITY_POWER_RESTRICTED_NETWORK = 8;
    public static final int PROCESS_CAPABILITY_USER_RESTRICTED_NETWORK = 32;
    public static final int PROCESS_STATE_BACKUP = 9;
    public static final int PROCESS_STATE_BOUND_FOREGROUND_SERVICE = 5;
    public static final int PROCESS_STATE_BOUND_TOP = 3;
    public static final int PROCESS_STATE_CACHED_ACTIVITY = 16;
    public static final int PROCESS_STATE_CACHED_ACTIVITY_CLIENT = 17;
    public static final int PROCESS_STATE_CACHED_EMPTY = 19;
    public static final int PROCESS_STATE_CACHED_RECENT = 18;
    public static final int PROCESS_STATE_FOREGROUND_SERVICE = 4;
    public static final int PROCESS_STATE_HEAVY_WEIGHT = 13;
    public static final int PROCESS_STATE_HOME = 14;
    public static final int PROCESS_STATE_IMPORTANT_BACKGROUND = 7;
    public static final int PROCESS_STATE_IMPORTANT_FOREGROUND = 6;
    public static final int PROCESS_STATE_LAST_ACTIVITY = 15;
    public static final int PROCESS_STATE_NONEXISTENT = 20;
    public static final int PROCESS_STATE_PERSISTENT = 0;
    public static final int PROCESS_STATE_PERSISTENT_UI = 1;
    public static final int PROCESS_STATE_RECEIVER = 11;
    public static final int PROCESS_STATE_SERVICE = 10;
    public static final int PROCESS_STATE_TOP = 2;
    public static final int PROCESS_STATE_TOP_SLEEPING = 12;
    public static final int PROCESS_STATE_TRANSIENT_BACKGROUND = 8;
    public static final int PROCESS_STATE_UNKNOWN = -1;
    public static final int RECENT_IGNORE_UNAVAILABLE = 2;
    public static final int RECENT_WITH_EXCLUDED = 1;
    public static final int RESTRICTION_LEVEL_ADAPTIVE_BUCKET = 30;
    public static final int RESTRICTION_LEVEL_BACKGROUND_RESTRICTED = 50;
    public static final int RESTRICTION_LEVEL_CUSTOM = 90;
    public static final int RESTRICTION_LEVEL_EXEMPTED = 20;
    public static final int RESTRICTION_LEVEL_FORCE_STOPPED = 60;
    public static final int RESTRICTION_LEVEL_MAX = 100;
    public static final int RESTRICTION_LEVEL_RESTRICTED_BUCKET = 40;
    public static final int RESTRICTION_LEVEL_UNKNOWN = 0;
    public static final int RESTRICTION_LEVEL_UNRESTRICTED = 10;
    public static final int RESTRICTION_LEVEL_USER_LAUNCH_ONLY = 70;
    public static final int RESTRICTION_REASON_DEFAULT = 1;
    public static final int RESTRICTION_REASON_DORMANT = 2;
    public static final int RESTRICTION_REASON_OTHER = 7;
    public static final int RESTRICTION_REASON_POLICY = 6;
    public static final int RESTRICTION_REASON_SYSTEM_HEALTH = 5;
    public static final int RESTRICTION_REASON_USAGE = 3;
    public static final int RESTRICTION_REASON_USER = 4;
    public static final int RESTRICTION_SOURCE_COMMAND_LINE = 4;
    public static final int RESTRICTION_SOURCE_REMOTE_TRIGGER = 5;
    public static final int RESTRICTION_SOURCE_SYSTEM = 3;
    public static final int RESTRICTION_SOURCE_USER = 1;
    public static final int RESTRICTION_SOURCE_USER_NUDGED = 2;
    public static final int RESTRICTION_SUBREASON_MAX_LENGTH = 16;
    public static final int START_ABORTED = 102;
    public static final int START_ASSISTANT_HIDDEN_SESSION = -90;
    public static final int START_ASSISTANT_NOT_ACTIVE_SESSION = -89;
    public static final int START_CANCELED = -96;
    public static final int START_CANNOT_GUARANTEE_TASK_MOVABILITY = -87;
    public static final int START_CLASS_NOT_FOUND = -92;
    public static final int START_DELIVERED_TO_TOP = 3;
    public static final int START_FLAG_DEBUG = 2;
    public static final int START_FLAG_DEBUG_SUSPEND = 16;
    public static final int START_FLAG_NATIVE_DEBUGGING = 8;
    public static final int START_FLAG_ONLY_IF_NEEDED = 1;
    public static final int START_FLAG_TRACK_ALLOCATION = 4;
    public static final int START_FORWARD_AND_REQUEST_CONFLICT = -93;
    public static final int START_INTENT_NOT_RESOLVED = -91;
    public static final int START_NOT_ACTIVITY = -95;
    public static final int START_NOT_ALLOWED_FOR_USER = -88;
    public static final int START_NOT_CURRENT_USER_ACTIVITY = -98;
    public static final int START_NOT_VOICE_COMPATIBLE = -97;
    public static final int START_PERMISSION_DENIED = -94;
    public static final int START_RETURN_INTENT_TO_CALLER = 1;
    public static final int START_RETURN_LOCK_TASK_MODE_VIOLATION = 101;
    public static final int START_SUCCESS = 0;
    public static final int START_SWITCHES_CANCELED = 100;
    public static final int START_TASK_TO_FRONT = 2;
    public static final int START_VOICE_HIDDEN_SESSION = -100;
    public static final int START_VOICE_NOT_ACTIVE_SESSION = -99;
    public static final int STOP_USER_ON_SWITCH_DEFAULT = -1;
    public static final int STOP_USER_ON_SWITCH_FALSE = 0;
    public static final int STOP_USER_ON_SWITCH_TRUE = 1;
    private static java.lang.String TAG;
    public static final int UID_OBSERVER_ACTIVE = 8;
    public static final int UID_OBSERVER_CACHED = 16;
    public static final int UID_OBSERVER_CAPABILITY = 32;
    public static final int UID_OBSERVER_GONE = 2;
    public static final int UID_OBSERVER_IDLE = 4;
    public static final int UID_OBSERVER_PROCSTATE = 1;
    public static final int UID_OBSERVER_PROC_OOM_ADJ = 64;
    public static final int USER_OP_ERROR_IS_SYSTEM = -3;
    public static final int USER_OP_ERROR_RELATED_USERS_CANNOT_STOP = -4;
    public static final int USER_OP_IS_CURRENT = -2;
    public static final int USER_OP_SUCCESS = 0;
    public static final int USER_OP_UNKNOWN_USER = -1;
    private static final com.android.internal.util.RateLimitingCache<java.util.List<android.app.ActivityManager.ProcessErrorStateInfo>> mErrorProcessesCache = null;
    private static final android.os.IpcDataCache<java.lang.Void, java.lang.Integer> mGetCurrentUserIdCache = null;
    private static final android.os.IpcDataCache.QueryHandler<java.lang.Void, java.lang.Integer> mGetCurrentUserIdQuery = null;
    private static final com.android.internal.util.RateLimitingCache<android.app.ActivityManager.MemoryInfo> mMemoryInfoCache = null;
    private static final com.android.internal.util.RateLimitingCache<android.app.ActivityManager.RunningAppProcessInfo> mMyMemoryStateCache = null;
    private static final android.app.ActivityManager.MemoryInfo mRateLimitedMemInfo = null;
    private static final android.app.ActivityManager.RunningAppProcessInfo mRateLimitedMemState = null;
    private static final com.android.internal.util.RateLimitingCache<java.util.List<android.app.ActivityManager.RunningAppProcessInfo>> mRunningProcessesCache = null;
    private static volatile boolean sSystemReady;
    private final java.util.Map<java.util.function.Consumer<android.app.AnrWarningResult>, java.util.concurrent.Executor> mAnrWarningAppListeners = null;
    private android.app.IAnrWarningCallback mAnrWarningCallback;
    private final java.util.ArrayList<android.app.ActivityManager.AppStartInfoCallbackWrapper> mAppStartInfoCallbacks = null;
    private android.app.IApplicationStartInfoCompleteListener mAppStartInfoCompleteListener;
    android.graphics.Point mAppTaskThumbnailSize;
    private final android.content.Context mContext = null;
    private final android.app.IUidFrozenStateChangedCallback mFrozenStateChangedCallback = null;
    private final android.util.ArrayMap<android.app.ActivityManager.UidFrozenStateChangedCallback, java.util.concurrent.Executor> mFrozenStateChangedCallbacks = null;
    final android.util.ArrayMap<android.app.ActivityManager.OnUidImportanceListener, android.app.ActivityManager.MyUidObserver> mImportanceListeners = null;
    ActivityManager(android.content.Context p0, android.os.Handler p1) {}
    private void addOnUidImportanceListenerInternal(android.app.ActivityManager.OnUidImportanceListener p0, int p1, int[] p2) {}
    public static void broadcastStickyIntent(android.content.Intent p0, int p1) {}
    public static void broadcastStickyIntent(android.content.Intent p0, int p1, int p2) {}
    public static void broadcastStickyIntent(android.content.Intent p0, int p1, android.os.Bundle p2, int p3) {}
    public static void broadcastStickyIntent(android.content.Intent p0, java.lang.String[] p1, int p2, android.os.Bundle p3, int p4) {}
    public static boolean canAccessUnexportedComponents(int p0) { return false; }
    public static int checkComponentPermission(java.lang.String p0, int p1, int p2, int p3, boolean p4) { return 0; }
    public static int checkComponentPermission(java.lang.String p0, int p1, int p2, boolean p3) { return 0; }
    public static int checkUidPermission(java.lang.String p0, int p1) { return 0; }
    private boolean clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1, boolean p2) { return false; }
    private void dispatchAnrWarning(android.app.AnrWarningResult p0) {}
    public static void dumpPackageStateStatic(java.io.FileDescriptor p0, java.lang.String p1) {}
    private static void dumpService(java.io.PrintWriter p0, java.io.FileDescriptor p1, java.lang.String p2, java.lang.String[] p3) {}
    private void ensureAppTaskThumbnailSizeLocked() {}
    public static java.lang.String getCapabilitiesSummary(int p0) { return null; }
    @android.annotation.SystemApi
    public static int getCurrentUser() { return 0; }
    static int getLauncherLargeIconSizeInner(android.content.Context p0) { return 0; }
    @java.lang.Deprecated
    public static int getMaxRecentTasksStatic() { return 0; }
    private void getMemoryInfoInternal(android.app.ActivityManager.MemoryInfo p0) {}
    public static void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) {}
    private static void getMyMemoryStateInternal(android.app.ActivityManager.RunningAppProcessInfo p0) {}
    public static android.app.IActivityManager getService() { return null; }
    private static android.app.IActivityTaskManager getTaskService() { return null; }
    public static int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) { return 0; }
    public static void invalidateGetCurrentUserIdCache() {}
    public static boolean isForegroundService(int p0) { return false; }
    public static boolean isHighEndGfx() { return false; }
    public static boolean isLowMemoryKillReportSupported() { return false; }
    public static boolean isLowRamDeviceStatic() { return false; }
    public static final boolean isProcStateBackground(int p0) { return false; }
    public static final boolean isProcStateCached(int p0) { return false; }
    public static boolean isProcStateConsideredInteraction(int p0) { return false; }
    public static final boolean isProcStateJankPerceptible(int p0) { return false; }
    @java.lang.Deprecated
    public static boolean isRunningInTestHarness() { return false; }
    public static boolean isRunningInUserTestHarness() { return false; }
    public static boolean isSmallBatteryDevice() { return false; }
    public static final boolean isStartResultFatalError(int p0) { return false; }
    public static final boolean isStartResultSuccessful(int p0) { return false; }
    public static boolean isSystemReady() { return false; }
    public static boolean isUserAMonkey() { return false; }
    public static void noteAlarmFinish(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3) {}
    public static void noteAlarmStart(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3) {}
    public static void noteWakeupAlarm(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) {}
    public static void printCapabilitiesFull(java.io.PrintWriter p0, int p1) {}
    public static void printCapabilitiesSummary(java.io.PrintWriter p0, int p1) {}
    public static void printCapabilitiesSummary(java.lang.StringBuilder p0, int p1) {}
    public static java.lang.String procStateToString(int p0) { return null; }
    public static final int processCapabilityAmToProto(int p0) { return 0; }
    public static final int processStateAmToProto(int p0) { return 0; }
    public static java.lang.String restrictionLevelToName(int p0) { return null; }
    public static void resumeAppSwitches() throws android.os.RemoteException {}
    @android.annotation.SystemApi
    public static void setPersistentVrThread(int p0) {}
    public static void setVrThread(int p0) {}
    public static int staticGetLargeMemoryClass() { return 0; }
    public static int staticGetMemoryClass() { return 0; }
    public int addAppTask(android.app.Activity p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) { return 0; }
    public void addApplicationStartInfoCompletionListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.ApplicationStartInfo> p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void addHomeVisibilityListener(java.util.concurrent.Executor p0, android.app.HomeVisibilityListener p1) {}
    @android.annotation.SystemApi
    public void addOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0, int p1) {}
    @android.annotation.SystemApi
    public void addOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0, int p1, int[] p2) {}
    public void addStartInfoTimestamp(int p0, long p1) {}
    public void alwaysShowUnsupportedCompileSdkWarning(android.content.ComponentName p0) {}
    public void appNotResponding(java.lang.String p0) {}
    public boolean clearApplicationUserData() { return false; }
    public boolean clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1) { return false; }
    @java.lang.Deprecated
    public void clearGrantedUriPermissions(java.lang.String p0) {}
    public void clearWatchHeapLimit() {}
    public void dumpPackageState(java.io.FileDescriptor p0, java.lang.String p1) {}
    public void forceDelayBroadcastDelivery(java.lang.String p0, long p1) {}
    @android.annotation.SystemApi
    public void forceStopPackage(java.lang.String p0) {}
    public void forceStopPackageAsUser(java.lang.String p0, int p1) {}
    public void forceStopPackageAsUserEvenWhenStopping(java.lang.String p0, int p1) {}
    public android.util.Size getAppTaskThumbnailSize() { return null; }
    public java.util.List<android.app.ActivityManager.AppTask> getAppTasks() { return null; }
    public int getBackgroundRestrictionExemptionReason(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getBindingUidImportance(int p0) { return 0; }
    public java.util.List<java.lang.String> getBugreportWhitelistedPackages() { return null; }
    public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() { return null; }
    public int[] getDisplayIdsForStartingVisibleBackgroundUsers() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.app.ApplicationStartInfo> getExternalHistoricalProcessStartReasons(java.lang.String p0, int p1) { return null; }
    public int getFrontActivityScreenCompatMode() { return 0; }
    @java.lang.Deprecated
    public android.content.pm.ParceledListSlice<android.app.GrantedUriPermission> getGrantedUriPermissions(java.lang.String p0) { return null; }
    public java.util.List<android.app.ApplicationExitInfo> getHistoricalProcessExitReasons(java.lang.String p0, int p1, int p2) { return null; }
    public java.util.List<android.app.ApplicationStartInfo> getHistoricalProcessStartReasons(int p0) { return null; }
    public int getLargeMemoryClass() { return 0; }
    public int getLauncherLargeIconDensity() { return 0; }
    public int getLauncherLargeIconSize() { return 0; }
    public int getLockTaskModeState() { return 0; }
    public int getMemoryClass() { return 0; }
    public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) {}
    public boolean getPackageAskScreenCompat(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public int getPackageImportance(java.lang.String p0) { return 0; }
    public int getPackageScreenCompatMode(java.lang.String p0) { return 0; }
    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) { return null; }
    public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() { return null; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1) throws java.lang.SecurityException { return null; }
    public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() { return null; }
    public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() { return null; }
    public java.util.List<android.app.ActivityManager.ConnectionInfo> getRunningServiceConnections(android.content.ComponentName p0) { return null; }
    public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws java.lang.SecurityException { return null; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RunningServiceInfo> getRunningServices(int p0) throws java.lang.SecurityException { return null; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRunningTasks(int p0) throws java.lang.SecurityException { return null; }
    @android.annotation.SystemApi
    public java.util.Collection<java.util.Locale> getSupportedLocales() { return null; }
    public java.lang.String getSwitchingFromUserMessage(int p0) { return null; }
    public java.lang.String getSwitchingToUserMessage(int p0) { return null; }
    public long getTotalRam() { return 0L; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public int[] getUidFrozenState(int[] p0) { return null; }
    @android.annotation.SystemApi
    public int getUidImportance(int p0) { return 0; }
    public int getUidProcessCapabilities(int p0) { return 0; }
    public int getUidProcessState(int p0) { return 0; }
    public void holdLock(android.os.IBinder p0, int p1) {}
    public boolean isActivityStartAllowedOnDisplay(android.content.Context p0, int p1, android.content.Intent p2) { return false; }
    public boolean isBackgroundRestricted() { return false; }
    @java.lang.Deprecated
    public boolean isInLockTaskMode() { return false; }
    public boolean isLowRamDevice() { return false; }
    public boolean isProcessFrozen(int p0) { return false; }
    public boolean isProfileForeground(android.os.UserHandle p0) { return false; }
    public boolean isUserRunning(int p0) { return false; }
    public boolean isVrModePackageEnabled(android.content.ComponentName p0) { return false; }
    public void killBackgroundProcesses(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void killProcessesWhenImperceptible(int[] p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public void killUid(int p0, java.lang.String p1) {}
    public boolean logoutUser(int p0) { return false; }
    public void moveTaskToFront(int p0, int p1) {}
    public void moveTaskToFront(int p0, int p1, android.os.Bundle p2) {}
    public void noteAppRestrictionEnabled(java.lang.String p0, int p1, int p2, boolean p3, int p4, java.lang.String p5, int p6, long p7) {}
    @android.annotation.SystemApi
    public void noteForegroundResourceUseBegin(int p0, int p1, int p2) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    public void noteForegroundResourceUseEnd(int p0, int p1, int p2) throws java.lang.SecurityException {}
    public void notifySystemPropertiesChanged() {}
    public void registerAnrWarningListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.AnrWarningResult> p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void registerUidFrozenStateChangedCallback(java.util.concurrent.Executor p0, android.app.ActivityManager.UidFrozenStateChangedCallback p1) {}
    public void removeApplicationStartInfoCompletionListener(java.util.function.Consumer<android.app.ApplicationStartInfo> p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void removeHomeVisibilityListener(android.app.HomeVisibilityListener p0) {}
    @android.annotation.SystemApi
    public void removeOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0) {}
    public void resetAppErrors() {}
    @java.lang.Deprecated
    public void restartPackage(java.lang.String p0) {}
    public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) {}
    @android.annotation.SystemApi
    public void setDeviceLocales(android.os.LocaleList p0) {}
    public void setFrontActivityScreenCompatMode(int p0) {}
    public void setPackageAskScreenCompat(java.lang.String p0, boolean p1) {}
    public void setPackageScreenCompatMode(java.lang.String p0, int p1) {}
    public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) { return false; }
    public void setProcessStateSummary(byte[] p0) {}
    public void setStopUserOnSwitch(int p0) {}
    public void setThemeOverlayReady(int p0) {}
    public void setWatchHeapLimit(long p0) {}
    @android.annotation.SystemApi
    public boolean startProfile(android.os.UserHandle p0) { return false; }
    public boolean startUserInBackgroundVisibleOnDisplay(int p0, int p1) { return false; }
    public void stopPackageForUser(java.lang.String p0) {}
    @android.annotation.SystemApi
    public boolean stopProfile(android.os.UserHandle p0) { return false; }
    public boolean stopUser(int p0) { return false; }
    public boolean switchUser(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean switchUser(android.os.UserHandle p0) { return false; }
    public void unregisterAnrWarningListener(java.util.function.Consumer<android.app.AnrWarningResult> p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void unregisterUidFrozenStateChangedCallback(android.app.ActivityManager.UidFrozenStateChangedCallback p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public boolean updateMccMncConfiguration(java.lang.String p0, java.lang.String p1) { return false; }
    public void waitForBroadcastIdle() {}

    private static final class AppStartInfoCallbackWrapper {
        final java.util.concurrent.Executor mExecutor = null;
        final java.util.function.Consumer<android.app.ApplicationStartInfo> mListener = null;
        AppStartInfoCallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.ApplicationStartInfo> p1) {}
    }

    public static class AppTask {
        public static final int WINDOWING_LAYER_NORMAL_APP = 1;
        public static final int WINDOWING_LAYER_PINNED = 2;
        public static final int WINDOWING_LAYER_REQUEST_GRANTED = 0;
        public static final int WINDOWING_LAYER_REQUEST_REJECTED = 1;
        public static final int WINDOWING_LAYER_UNDEFINED = 0;
        private android.app.IAppTask mAppTaskImpl;
        public AppTask(android.app.IAppTask p0) {}
        public void finishAndRemoveTask() {}
        public android.app.ActivityManager.RecentTaskInfo getTaskInfo() { return null; }
        public void moveTaskTo(android.app.TaskLocation p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.TaskLocation, java.lang.Exception> p2) {}
        public void moveToFront() {}
        public void requestWindowingLayer(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> p2) {}
        public void setExcludeFromRecents(boolean p0) {}
        public void startActivity(android.content.Context p0, android.content.Intent p1, android.os.Bundle p2) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WindowingLayer {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WindowingLayerResult {
        }
    }

    public static final class ConnectionInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.ConnectionInfo> CREATOR = null;
        private final long mFlags = 0L;
        private final java.lang.String mPackageName = null;
        private final java.lang.String mProcessName = null;
        public ConnectionInfo(long p0, java.lang.String p1, java.lang.String p2) {}
        private ConnectionInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public long getFlags() { return 0L; }
        public java.lang.String getPackageName() { return null; }
        public java.lang.String getProcessName() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForegroundServiceApiEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForegroundServiceApiType {
    }

    public static class MemoryInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.MemoryInfo> CREATOR = null;
        public long advertisedMem;
        public long availMem;
        public long foregroundAppThreshold;
        public long freeMem;
        public long hiddenAppThreshold;
        public boolean lowMemory;
        public long secondaryServerThreshold;
        public long threshold;
        public long totalMem;
        public long visibleAppThreshold;
        public MemoryInfo() {}
        private MemoryInfo(android.os.Parcel p0) {}
        public void copyTo(android.app.ActivityManager.MemoryInfo p0) {}
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MoveTaskFlags {
    }

    static final class MyUidObserver extends android.app.UidObserver {
        final android.content.Context mContext = null;
        final android.app.ActivityManager.OnUidImportanceListener mListener = null;
        MyUidObserver(android.app.ActivityManager.OnUidImportanceListener p0, android.content.Context p1) { super(); }
        public void onUidGone(int p0, boolean p1) {}
        public void onUidStateChanged(int p0, int p1, long p2, int p3) {}
    }

    @android.annotation.SystemApi
    public static interface OnUidImportanceListener {
        public void onUidImportance(int p0, int p1);
    }

    public static final class PendingIntentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.PendingIntentInfo> CREATOR = null;
        private final java.lang.String mCreatorPackage = null;
        private final int mCreatorUid = 0;
        private final boolean mImmutable = false;
        private final int mIntentSenderType = 0;
        public PendingIntentInfo(java.lang.String p0, int p1, boolean p2, int p3) {}
        public int describeContents() { return 0; }
        public java.lang.String getCreatorPackage() { return null; }
        public int getCreatorUid() { return 0; }
        public int getIntentSenderType() { return 0; }
        public boolean isImmutable() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessCapability {
    }

    public static class ProcessErrorStateInfo implements android.os.Parcelable {
        public static final int CRASHED = 1;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.ProcessErrorStateInfo> CREATOR = null;
        public static final int NOT_RESPONDING = 2;
        public static final int NO_ERROR = 0;
        public int condition;
        public byte[] crashData;
        public java.lang.String longMsg;
        public int pid;
        public java.lang.String processName;
        public java.lang.String shortMsg;
        public java.lang.String stackTrace;
        public java.lang.String tag;
        public int uid;
        public ProcessErrorStateInfo() {}
        private ProcessErrorStateInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessState {
    }

    public static class RecentTaskInfo extends android.app.TaskInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RecentTaskInfo> CREATOR = null;
        @java.lang.Deprecated
        public int affiliatedTaskId;
        @java.lang.Deprecated
        public java.lang.CharSequence description;
        @java.lang.Deprecated
        public int id;
        @java.lang.Deprecated
        public int persistentId;
        public RecentTaskInfo() { super((android.os.Parcel)null); }
        public RecentTaskInfo(android.app.ActivityManager.RecentTaskInfo p0) { super((android.os.Parcel)null); }
        private RecentTaskInfo(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public int describeContents() { return 0; }
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RestrictionLevel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RestrictionReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RestrictionSource {
    }

    public static class RunningAppProcessInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningAppProcessInfo> CREATOR = null;
        public static final int IMPORTANCE_BACKGROUND = 400;
        public static final int IMPORTANCE_CACHED = 400;
        public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
        public static final int IMPORTANCE_CANT_SAVE_STATE_PRE_26 = 170;
        @java.lang.Deprecated
        public static final int IMPORTANCE_EMPTY = 500;
        public static final int IMPORTANCE_FOREGROUND = 100;
        public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
        public static final int IMPORTANCE_GONE = 1000;
        public static final int IMPORTANCE_PERCEPTIBLE = 230;
        public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
        public static final int IMPORTANCE_SERVICE = 300;
        public static final int IMPORTANCE_TOP_SLEEPING = 325;
        @java.lang.Deprecated
        public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = 150;
        public static final int IMPORTANCE_VISIBLE = 200;
        public static final int REASON_PROVIDER_IN_USE = 1;
        public static final int REASON_SERVICE_IN_USE = 2;
        public static final int REASON_UNKNOWN = 0;
        public int flags;
        public int importance;
        public int importanceReasonCode;
        public android.content.ComponentName importanceReasonComponent;
        public int importanceReasonImportance;
        public int importanceReasonPid;
        public boolean isFocused;
        public long lastActivityTime;
        public int lastTrimLevel;
        public int lru;
        public int pid;
        public java.lang.String[] pkgDeps;
        public java.lang.String[] pkgList;
        public java.lang.String processName;
        public int processState;
        public int uid;
        public RunningAppProcessInfo() {}
        private RunningAppProcessInfo(android.os.Parcel p0) {}
        public RunningAppProcessInfo(java.lang.String p0, int p1, java.lang.String[] p2) {}
        public static int importanceToProcState(int p0) { return 0; }
        public static int procStateToImportance(int p0) { return 0; }
        public static int procStateToImportanceForClient(int p0, android.content.Context p1) { return 0; }
        public static int procStateToImportanceForTargetSdk(int p0, int p1) { return 0; }
        public void copyTo(android.app.ActivityManager.RunningAppProcessInfo p0) {}
        public void copyTo(android.app.RunningAppProcessInfo p0) {}
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Importance {
        }
    }

    public static class RunningServiceInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningServiceInfo> CREATOR = null;
        public static final int FLAG_FOREGROUND = 2;
        public static final int FLAG_PERSISTENT_PROCESS = 8;
        public static final int FLAG_STARTED = 1;
        public static final int FLAG_SYSTEM_PROCESS = 4;
        public long activeSince;
        public int clientCount;
        public int clientLabel;
        public java.lang.String clientPackage;
        public int crashCount;
        public int flags;
        public boolean foreground;
        public long lastActivityTime;
        public int pid;
        public java.lang.String process;
        public long restarting;
        public android.content.ComponentName service;
        public boolean started;
        public int uid;
        public RunningServiceInfo() {}
        private RunningServiceInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class RunningTaskInfo extends android.app.TaskInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningTaskInfo> CREATOR = null;
        @java.lang.Deprecated
        public java.lang.CharSequence description;
        @java.lang.Deprecated
        public int id;
        @java.lang.Deprecated
        public int numRunning;
        @java.lang.Deprecated
        public android.graphics.Bitmap thumbnail;
        public RunningTaskInfo() { super((android.os.Parcel)null); }
        public RunningTaskInfo(android.app.ActivityManager.RunningTaskInfo p0) { super((android.os.Parcel)null); }
        private RunningTaskInfo(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StopUserOnSwitch {
    }

    public static class TaskDescription implements android.os.Parcelable {
        private static final java.lang.String ATTR_TASKDESCRIPTIONCOLOR_BACKGROUND = "task_description_color_background";
        private static final java.lang.String ATTR_TASKDESCRIPTIONCOLOR_BACKGROUND_FLOATING = "task_description_color_background_floating";
        private static final java.lang.String ATTR_TASKDESCRIPTIONCOLOR_PRIMARY = "task_description_color";
        private static final java.lang.String ATTR_TASKDESCRIPTIONICON_FILENAME = "task_description_icon_filename";
        private static final java.lang.String ATTR_TASKDESCRIPTIONICON_RESOURCE = "task_description_icon_resource";
        private static final java.lang.String ATTR_TASKDESCRIPTIONICON_RESOURCE_PACKAGE = "task_description_icon_package";
        private static final java.lang.String ATTR_TASKDESCRIPTIONLABEL = "task_description_label";
        public static final java.lang.String ATTR_TASKDESCRIPTION_PREFIX = "task_description_";
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.TaskDescription> CREATOR = null;
        private android.graphics.drawable.Icon mBadge;
        private int mColorBackground;
        private int mColorBackgroundFloating;
        private int mColorPrimary;
        private boolean mEnsureNavigationBarContrastWhenTransparent;
        private boolean mEnsureStatusBarContrastWhenTransparent;
        private android.graphics.drawable.Icon mIcon;
        private java.lang.String mIconFilename;
        private java.lang.String mLabel;
        private int mMinHeight;
        private int mMinWidth;
        private int mNavigationBarColor;
        private int mResizeMode;
        private int mStatusBarColor;
        private int mSystemBarsAppearance;
        private int mTopOpaqueColorBackground;
        private int mTopOpaqueSystemBarsAppearance;
        @java.lang.Deprecated
        public TaskDescription() {}
        public TaskDescription(android.app.ActivityManager.TaskDescription p0) {}
        private TaskDescription(android.os.Parcel p0) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, int p1) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, int p1, int p2) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1, int p2) {}
        public TaskDescription(java.lang.String p0, android.graphics.drawable.Icon p1, android.graphics.drawable.Icon p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, boolean p10, boolean p11, int p12, int p13, int p14, int p15) {}
        public static boolean equals(android.app.ActivityManager.TaskDescription p0, android.app.ActivityManager.TaskDescription p1) { return false; }
        public static android.graphics.Bitmap loadTaskDescriptionIcon(java.lang.String p0, int p1) { return null; }
        public void copyFrom(android.app.ActivityManager.TaskDescription p0) {}
        public void copyFromPreserveHiddenFields(android.app.ActivityManager.TaskDescription p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getBackgroundColor() { return 0; }
        public int getBackgroundColorFloating() { return 0; }
        public android.graphics.drawable.Icon getBadge() { return null; }
        public boolean getEnsureNavigationBarContrastWhenTransparent() { return false; }
        public boolean getEnsureStatusBarContrastWhenTransparent() { return false; }
        @java.lang.Deprecated
        public android.graphics.Bitmap getIcon() { return null; }
        public java.lang.String getIconFilename() { return null; }
        public int getIconResource() { return 0; }
        public java.lang.String getIconResourcePackage() { return null; }
        public android.graphics.Bitmap getInMemoryIcon() { return null; }
        public java.lang.String getLabel() { return null; }
        public int getMinHeight() { return 0; }
        public int getMinWidth() { return 0; }
        public int getNavigationBarColor() { return 0; }
        public int getPrimaryColor() { return 0; }
        public android.graphics.drawable.Icon getRawIcon() { return null; }
        public int getResizeMode() { return 0; }
        public int getStatusBarColor() { return 0; }
        public int getSystemBarsAppearance() { return 0; }
        public int getTopOpaqueBackgroundColor() { return 0; }
        public int getTopOpaqueSystemBarsAppearance() { return 0; }
        public int hashCode() { return 0; }
        public android.graphics.drawable.Icon loadIcon() { return null; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void restoreFromXml(com.android.modules.utils.TypedXmlPullParser p0) {}
        public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
        public void setBackgroundColor(int p0) {}
        public void setBackgroundColorFloating(int p0) {}
        public void setBadge(android.graphics.drawable.Icon p0) {}
        public void setEnsureNavigationBarContrastWhenTransparent(boolean p0) {}
        public void setEnsureStatusBarContrastWhenTransparent(boolean p0) {}
        public void setIcon(android.graphics.drawable.Icon p0) {}
        public void setIconFilename(java.lang.String p0) {}
        public void setLabel(java.lang.String p0) {}
        public void setMinHeight(int p0) {}
        public void setMinWidth(int p0) {}
        public void setNavigationBarColor(int p0) {}
        public void setPrimaryColor(int p0) {}
        public void setResizeMode(int p0) {}
        public void setStatusBarColor(int p0) {}
        public void setSystemBarsAppearance(int p0) {}
        public void setTopOpaqueBackgroundColor(int p0) {}
        public void setTopOpaqueSystemBarsAppearance(int p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private int mBackgroundColor;
            private android.graphics.drawable.Icon mBadge;
            private android.graphics.drawable.Icon mIcon;
            private java.lang.String mLabel;
            private int mNavigationBarColor;
            private int mPrimaryColor;
            private int mStatusBarColor;
            public Builder() {}
            public android.app.ActivityManager.TaskDescription build() { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setBackgroundColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setBadge(android.graphics.drawable.Icon p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setIcon(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setLabel(java.lang.String p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setNavigationBarColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setPrimaryColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setStatusBarColor(int p0) { return null; }
        }
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static interface UidFrozenStateChangedCallback {
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public static final int UID_FROZEN_STATE_FROZEN = 1;
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public static final int UID_FROZEN_STATE_UNFROZEN = 2;
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public void onUidFrozenStateChanged(int[] p0, int[] p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UidFrozenState {
        }
    }
}
