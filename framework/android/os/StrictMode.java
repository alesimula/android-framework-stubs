package android.os;

public final class StrictMode {
    public static final int BINDER_HINT_ALL_MASK = 7864320;
    public static final int BINDER_HINT_BLOCKING_MAIN_THREAD = 4194304;
    public static final int BINDER_HINT_PROC_STATE_BACKGROUND = 1572864;
    public static final int BINDER_HINT_PROC_STATE_CACHED = 2097152;
    public static final int BINDER_HINT_PROC_STATE_FOREGROUND = 1048576;
    public static final int BINDER_HINT_PROC_STATE_MASK = 3670016;
    public static final int BINDER_HINT_PROC_STATE_PERSISTENT = 524288;
    public static final int BINDER_HINT_PROC_STATE_UNKNOWN = 0;
    private static final java.lang.String CLEARTEXT_PROPERTY = "persist.sys.strictmode.clear";
    static final long DETECT_EXPLICIT_GC = 3400644L;
    private static final long DETECT_IMPLICIT_URI_PERMISSION_GRANT = 460838111L;
    static final long DETECT_INSTANCE_COUNT_VIOLATIONS_WHEN_LISTENER_SET = 333566037L;
    private static final int DETECT_THREAD_ALL = 65535;
    private static final int DETECT_THREAD_CUSTOM = 8;
    private static final int DETECT_THREAD_DISK_READ = 2;
    private static final int DETECT_THREAD_DISK_WRITE = 1;
    private static final int DETECT_THREAD_EXPLICIT_GC = 64;
    private static final int DETECT_THREAD_NETWORK = 4;
    private static final int DETECT_THREAD_RESOURCE_MISMATCH = 16;
    private static final int DETECT_THREAD_UNBUFFERED_IO = 32;
    private static final int DETECT_VM_ACTIVITY_LEAKS = 4;
    private static final int DETECT_VM_ALL = 65535;
    private static final int DETECT_VM_BACKGROUND_ACTIVITY_LAUNCH_ABORTED = 16384;
    private static final int DETECT_VM_CLEARTEXT_NETWORK = 64;
    private static final int DETECT_VM_CLOSABLE_LEAKS = 2;
    private static final int DETECT_VM_CONTENT_URI_WITHOUT_PERMISSION = 128;
    private static final int DETECT_VM_CREDENTIAL_PROTECTED_WHILE_LOCKED = 2048;
    private static final int DETECT_VM_CURSOR_LEAKS = 1;
    private static final int DETECT_VM_FILE_URI_EXPOSURE = 32;
    private static final int DETECT_VM_IMPLICIT_DIRECT_BOOT = 1024;
    private static final int DETECT_VM_IMPLICIT_URI_PERMISSION_GRANT = 32768;
    private static final int DETECT_VM_INCORRECT_CONTEXT_USE = 4096;
    private static final int DETECT_VM_INSTANCE_LEAKS = 8;
    private static final int DETECT_VM_NON_SDK_API_USAGE = 512;
    private static final int DETECT_VM_REGISTRATION_LEAKS = 16;
    private static final int DETECT_VM_UNSAFE_INTENT_LAUNCH = 8192;
    private static final int DETECT_VM_UNTAGGED_SOCKET = 256;
    private static final boolean DISABLE = false;
    public static final java.lang.String DISABLE_PROPERTY = "persist.sys.strictmode.disable";
    private static final java.util.HashMap<java.lang.Class, java.lang.Integer> EMPTY_CLASS_LIMIT_MAP = null;
    private static final android.os.StrictMode.ViolationLogger LOGCAT_LOGGER = null;
    private static final boolean LOG_V = Boolean.valueOf(false);
    private static final int MAX_OFFENSES_PER_LOOP = 10;
    private static final int MAX_SPAN_TAGS = 20;
    private static final long MIN_DIALOG_INTERVAL_MS = 30000L;
    private static final long MIN_DROPBOX_INTERVAL_MS = 3000L;
    private static final long MIN_LOG_INTERVAL_MS = 1000L;
    private static final long MIN_VM_INTERVAL_MS = 1000L;
    public static final int NETWORK_POLICY_ACCEPT = 0;
    public static final int NETWORK_POLICY_LOG = 1;
    public static final int NETWORK_POLICY_REJECT = 2;
    private static final android.os.StrictMode.Span NO_OP_SPAN = null;
    public static final int PENALTY_ALL = -7929856;
    public static final int PENALTY_DEATH = 268435456;
    public static final int PENALTY_DEATH_ON_CLEARTEXT_NETWORK = 16777216;
    public static final int PENALTY_DEATH_ON_FILE_URI_EXPOSURE = 8388608;
    public static final int PENALTY_DEATH_ON_NETWORK = 33554432;
    public static final int PENALTY_DIALOG = 536870912;
    public static final int PENALTY_DROPBOX = 67108864;
    public static final int PENALTY_FLASH = 134217728;
    public static final int PENALTY_GATHER = -2147483648;
    public static final int PENALTY_LOG = 1073741824;
    private static final int PROC_STATE_SHIFT = 19;
    private static final java.lang.String TAG = "StrictMode";
    private static final java.lang.ThreadLocal<android.os.StrictMode.AndroidBlockGuardPolicy> THREAD_ANDROID_POLICY = null;
    private static final java.lang.ThreadLocal<android.os.Handler> THREAD_HANDLER = null;
    public static final java.lang.String VISUAL_PROPERTY = "persist.sys.strictmode.visual";
    private static final java.lang.ThreadLocal<java.util.ArrayList<android.os.StrictMode.ViolationInfo>> gatheredViolations = null;
    private static volatile android.os.StrictMode.BackgroundActivityLaunchCallback sBackgroundActivityLaunchCallback;
    private static volatile boolean sCeStorageUnlocked;
    private static final java.util.concurrent.atomic.AtomicInteger sDropboxCallsInFlight = null;
    private static final java.util.HashMap<java.lang.Class, java.lang.Integer> sExpectedActivityInstanceCount = null;
    private static boolean sIsIdlerRegistered;
    private static long sLastInstanceCountCheckMillis;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Long> sLastVmViolationTime = null;
    private static volatile android.os.StrictMode.ViolationLogger sLogger;
    private static final java.util.function.Consumer<java.lang.String> sNonSdkApiUsageConsumer = null;
    private static final android.os.MessageQueue.IdleHandler sProcessIdleHandler = null;
    private static final android.util.SparseLongArray sRealLastVmViolationTime = null;
    private static volatile android.os.storage.IStorageManager sStorageManager;
    private static final java.lang.ThreadLocal<android.os.StrictMode.ThreadSpanState> sThisThreadSpanState = null;
    private static final java.lang.ThreadLocal<java.util.concurrent.Executor> sThreadViolationExecutor = null;
    private static final java.lang.ThreadLocal<android.os.StrictMode.OnThreadViolationListener> sThreadViolationListener = null;
    private static volatile android.os.StrictMode.UnsafeIntentStrictModeCallback sUnsafeIntentCallback;
    private static volatile android.os.StrictMode.VmPolicy sVmPolicy;
    private static android.util.Singleton<android.view.IWindowManager> sWindowManager;
    private static final java.lang.ThreadLocal<java.util.ArrayList<android.os.StrictMode.ViolationInfo>> violationsBeingTimed = null;
    private StrictMode() {}
    public static android.os.StrictMode.ThreadPolicy allowThreadDiskReads() { return null; }
    public static int allowThreadDiskReadsMask() { return 0; }
    public static android.os.StrictMode.ThreadPolicy allowThreadDiskWrites() { return null; }
    public static int allowThreadDiskWritesMask() { return 0; }
    public static android.os.StrictMode.ThreadPolicy allowThreadViolations() { return null; }
    public static android.os.StrictMode.VmPolicy allowVmViolations() { return null; }
    public static void assertConfigurationContext(android.content.Context p0, java.lang.String p1) {}
    public static void assertUiContext(android.content.Context p0, java.lang.String p1) {}
    private static void clampViolationTimeMap(android.util.SparseLongArray p0, long p1) {}
    static void clearGatheredViolations() {}
    public static void conditionallyCheckInstanceCounts() {}
    public static void decrementExpectedActivityCount(java.lang.Class p0) {}
    public static void disableDeathOnFileUriExposure() {}
    private static void dropboxViolationAsync(int p0, android.os.StrictMode.ViolationInfo p1) {}
    public static void enableCredentialProtectedWhileLocked() {}
    public static void enableDeathOnFileUriExposure() {}
    public static void enableDefaults() {}
    public static android.os.StrictMode.Span enterCriticalSpan(java.lang.String p0) { return null; }
    public static boolean getAndDisableCredentialProtectedWhileLocked() { return false; }
    public static android.os.StrictMode.ThreadPolicy getThreadPolicy() { return null; }
    public static int getThreadPolicyMask() { return 0; }
    public static android.os.StrictMode.VmPolicy getVmPolicy() { return null; }
    private static void handleApplicationStrictModeViolation(int p0, android.os.StrictMode.ViolationInfo p1) {}
    static boolean hasGatheredViolations() { return false; }
    public static void incrementExpectedActivityCount(java.lang.Class p0) {}
    public static void initThreadDefaults(android.content.pm.ApplicationInfo p0) {}
    public static void initVmDefaults(android.content.pm.ApplicationInfo p0) {}
    public static boolean isBundledSystemApp(android.content.pm.ApplicationInfo p0) { return false; }
    private static boolean isCeStorageUnlocked(int p0) { return false; }
    public static void noteDiskRead() {}
    public static void noteDiskWrite() {}
    public static void noteResourceMismatch(java.lang.Object p0) {}
    public static void noteSlowCall(java.lang.String p0) {}
    public static void noteUnbufferedIO() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void noteUntaggedSocket() {}
    public static void onBackgroundActivityLaunchAborted(java.lang.String p0) {}
    private static void onBinderStrictModePolicyChange(int p0) {}
    public static void onCleartextNetworkDetected(byte[] p0) {}
    public static void onContentUriWithoutPermission(android.net.Uri p0, java.lang.String p1) {}
    private static void onCredentialProtectedPathAccess(java.lang.String p0, int p1) {}
    public static void onFileUriExposed(android.net.Uri p0, java.lang.String p1) {}
    public static void onImplicitDirectBoot() {}
    public static void onImplicitUriPermissionGrant(java.lang.String p0) {}
    public static void onIncorrectContextUsed(java.lang.String p0, java.lang.Throwable p1) {}
    public static void onIntentReceiverLeaked(java.lang.Throwable p0) {}
    public static void onServiceConnectionLeaked(java.lang.Throwable p0) {}
    public static void onSqliteObjectLeaked(java.lang.String p0, java.lang.Throwable p1) {}
    private static void onUnsafeIntentLaunch(int p0, android.content.Intent p1) {}
    public static void onUnsafeIntentLaunch(android.content.Intent p0) {}
    public static void onUntaggedSocket() {}
    public static void onVmPolicyViolation(android.os.strictmode.Violation p0) {}
    public static void onVmPolicyViolation(android.os.strictmode.Violation p0, boolean p1) {}
    public static void onWebViewMethodCalledOnWrongThread(java.lang.Throwable p0) {}
    static void readAndHandleBinderCallViolations(android.os.Parcel p0) {}
    private static void registerBackgroundActivityLaunchCallback() {}
    private static void registerIntentMatchingRestrictionCallback() {}
    private static void setBlockGuardPolicy(int p0) {}
    private static void setBlockGuardVmPolicy(int p0) {}
    private static void setCloseGuardEnabled(boolean p0) {}
    public static void setThreadPolicy(android.os.StrictMode.ThreadPolicy p0) {}
    public static void setThreadPolicyMask(int p0) {}
    public static void setThreadPolicyMask$ravenwood(int p0) {}
    public static void setViolationLogger(android.os.StrictMode.ViolationLogger p0) {}
    public static void setVmPolicy(android.os.StrictMode.VmPolicy p0) {}
    private static boolean shouldCheckInstanceCountViolations(android.os.StrictMode.VmPolicy p0) { return false; }
    private static boolean tooManyViolationsThisLoop() { return false; }
    public static java.lang.Object trackActivity(java.lang.Object p0) { return null; }
    public static boolean vmBackgroundActivityLaunchEnabled() { return false; }
    public static boolean vmCleartextNetworkEnabled() { return false; }
    public static boolean vmClosableObjectLeaksEnabled() { return false; }
    public static boolean vmContentUriWithoutPermissionEnabled() { return false; }
    public static boolean vmCredentialProtectedWhileLockedEnabled() { return false; }
    public static boolean vmFileUriExposureEnabled() { return false; }
    public static boolean vmImplicitDirectBootEnabled() { return false; }
    public static boolean vmImplicitUriPermissionGrantEnabled() { return false; }
    public static boolean vmIncorrectContextUseEnabled() { return false; }
    public static boolean vmRegistrationLeaksEnabled() { return false; }
    public static boolean vmSqliteObjectLeaksEnabled() { return false; }
    public static boolean vmUnsafeIntentLaunchEnabled() { return false; }
    public static boolean vmUntaggedSocketEnabled() { return false; }
    static void writeGatheredViolationsToParcel(android.os.Parcel p0) {}

    private static class AndroidBlockGuardPolicy {
        private android.util.ArrayMap<java.lang.Integer, java.lang.Long> mLastViolationTime;
        private android.util.SparseLongArray mRealLastViolationTime;
        private int mThreadPolicyMask;
        public AndroidBlockGuardPolicy(int p0) {}
        public int getPolicyMask() { return 0; }
        public int getThreadPolicyMask() { return 0; }
        void handleViolationWithTimingAttempt(android.os.StrictMode.ViolationInfo p0) {}
        void onCustomSlowCall(java.lang.String p0) {}
        public void onExplicitGc() {}
        public void onNetwork() {}
        public void onReadFromDisk() {}
        void onResourceMismatch(java.lang.Object p0) {}
        void onThreadPolicyViolation(android.os.StrictMode.ViolationInfo p0) {}
        public void onUnbufferedIO() {}
        public void onWriteToDisk() {}
        public void setThreadPolicyMask(int p0) {}
        void startHandlingViolationException(android.os.strictmode.Violation p0) {}
        public java.lang.String toString() { return null; }
    }

    private static class AndroidCloseGuardReporter {
        private AndroidCloseGuardReporter() {}
        public void report(java.lang.String p0) {}
        public void report(java.lang.String p0, java.lang.Throwable p1) {}
    }

    private static final class BackgroundActivityLaunchCallback extends android.app.IBackgroundActivityLaunchCallback.Stub {
        private BackgroundActivityLaunchCallback() { super(); }
        public void onBackgroundActivityLaunchAborted(java.lang.String p0) {}
    }

    private static final class InstanceTracker {
        private static final java.util.HashMap<java.lang.Class<?>, java.lang.Integer> sInstanceCounts = null;
        private final java.lang.Class<?> mKlass = null;
        public InstanceTracker(java.lang.Object p0) {}
        public static int getInstanceCount(java.lang.Class<?> p0) { return 0; }
        protected void finalize() throws java.lang.Throwable {}
    }

    public static interface OnThreadViolationListener {
        public void onThreadViolation(android.os.strictmode.Violation p0);
    }

    public static interface OnVmViolationListener {
        public void onVmViolation(android.os.strictmode.Violation p0);
    }

    public static class Span {
        private final android.os.StrictMode.ThreadSpanState mContainerState = null;
        private long mCreateMillis;
        private java.lang.String mName;
        private android.os.StrictMode.Span mNext;
        private android.os.StrictMode.Span mPrev;
        protected Span() {}
        Span(android.os.StrictMode.ThreadSpanState p0) {}
        public void finish() {}
    }

    public static final class ThreadPolicy {
        public static final android.os.StrictMode.ThreadPolicy LAX = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        final android.os.StrictMode.OnThreadViolationListener mListener = null;
        final int mask = 0;
        private ThreadPolicy(int p0, android.os.StrictMode.OnThreadViolationListener p1, java.util.concurrent.Executor p2) {}
        public java.lang.String toString() { return null; }

        public static final class Builder {
            private java.util.concurrent.Executor mExecutor;
            private android.os.StrictMode.OnThreadViolationListener mListener;
            private int mMask;
            public Builder() {}
            public Builder(android.os.StrictMode.ThreadPolicy p0) {}
            private android.os.StrictMode.ThreadPolicy.Builder disable(int p0) { return null; }
            private android.os.StrictMode.ThreadPolicy.Builder enable(int p0) { return null; }
            public android.os.StrictMode.ThreadPolicy build() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectAll() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectCustomSlowCalls() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectDiskReads() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectDiskWrites() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectExplicitGc() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectNetwork() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectResourceMismatches() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectUnbufferedIo() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDeath() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDeathOnNetwork() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDialog() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDropBox() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyFlashScreen() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyListener(android.os.StrictMode.OnThreadViolationListener p0, java.util.concurrent.Executor p1) { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyListener(java.util.concurrent.Executor p0, android.os.StrictMode.OnThreadViolationListener p1) { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyLog() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitAll() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitCustomSlowCalls() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitDiskReads() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitDiskWrites() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitExplicitGc() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitNetwork() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitResourceMismatches() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitUnbufferedIo() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThreadPolicyMask {
    }

    private static class ThreadSpanState {
        public android.os.StrictMode.Span mActiveHead;
        public int mActiveSize;
        public android.os.StrictMode.Span mFreeListHead;
        public int mFreeListSize;
        private ThreadSpanState() {}
    }

    private static final class UnsafeIntentStrictModeCallback extends android.app.IUnsafeIntentStrictModeCallback.Stub {
        private UnsafeIntentStrictModeCallback() { super(); }
        public void onUnsafeIntent(int p0, android.content.Intent p1) {}
    }

    public static final class ViolationInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.StrictMode.ViolationInfo> CREATOR = null;
        public java.lang.String broadcastIntentAction;
        public int durationMillis;
        private final java.util.Deque<java.lang.StackTraceElement[]> mBinderStack = null;
        private final int mPenaltyMask = 0;
        private java.lang.String mStackTrace;
        private final android.os.strictmode.Violation mViolation = null;
        public int numAnimationsRunning;
        public long numInstances;
        public java.lang.String[] tags;
        public int violationNumThisLoop;
        public long violationUptimeMillis;
        public ViolationInfo(android.os.Parcel p0) {}
        public ViolationInfo(android.os.Parcel p0, boolean p1) {}
        ViolationInfo(android.os.strictmode.Violation p0, int p1) {}
        void addLocalStack(java.lang.Throwable p0) {}
        public int describeContents() { return 0; }
        public void dump(android.util.Printer p0, java.lang.String p1) {}
        public java.lang.String getStackTrace() { return null; }
        public java.lang.Class<? extends android.os.strictmode.Violation> getViolationClass() { return null; }
        public java.lang.String getViolationDetails() { return null; }
        public int hashCode() { return 0; }
        boolean penaltyEnabled(int p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface ViolationLogger {
        public void log(android.os.StrictMode.ViolationInfo p0);
    }

    public static final class VmPolicy {
        public static final android.os.StrictMode.VmPolicy LAX = null;
        final java.util.HashMap<java.lang.Class, java.lang.Integer> classInstanceLimit = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        final android.os.StrictMode.OnVmViolationListener mListener = null;
        final int mask = 0;
        private VmPolicy(int p0, java.util.HashMap<java.lang.Class, java.lang.Integer> p1, android.os.StrictMode.OnVmViolationListener p2, java.util.concurrent.Executor p3) {}
        public java.lang.String toString() { return null; }

        public static final class Builder {
            private java.util.HashMap<java.lang.Class, java.lang.Integer> mClassInstanceLimit;
            private boolean mClassInstanceLimitNeedCow;
            private java.util.concurrent.Executor mExecutor;
            private android.os.StrictMode.OnVmViolationListener mListener;
            private int mMask;
            public Builder() {}
            public Builder(android.os.StrictMode.VmPolicy p0) {}
            private android.os.StrictMode.VmPolicy.Builder enable(int p0) { return null; }
            public android.os.StrictMode.VmPolicy build() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectActivityLeaks() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectAll() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectBlockedBackgroundActivityLaunch() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectCleartextNetwork() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectContentUriWithoutPermission() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectCredentialProtectedWhileLocked() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectFileUriExposure() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectImplicitDirectBoot() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectImplicitUriPermissionGrant() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectIncorrectContextUse() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectLeakedClosableObjects() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectLeakedRegistrationObjects() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectNonSdkApiUsage() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectUnsafeIntentLaunch() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectUntaggedSockets() { return null; }
            android.os.StrictMode.VmPolicy.Builder disable(int p0) { return null; }
            public android.os.StrictMode.VmPolicy.Builder ignoreBlockedBackgroundActivityLaunch() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDeath() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDeathOnCleartextNetwork() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDeathOnFileUriExposure() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDropBox() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyListener(android.os.StrictMode.OnVmViolationListener p0, java.util.concurrent.Executor p1) { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyListener(java.util.concurrent.Executor p0, android.os.StrictMode.OnVmViolationListener p1) { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyLog() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitActivityLeaks() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitCredentialProtectedWhileLocked() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitImplicitDirectBoot() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitImplicitUriPermissionGrant() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitIncorrectContextUse() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitNonSdkApiUsage() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitUntaggedSockets() { return null; }
            public android.os.StrictMode.VmPolicy.Builder setClassInstanceLimit(java.lang.Class p0, int p1) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VmPolicyMask {
    }
}
