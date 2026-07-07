package android.view.contentcapture;

public final class ContentCaptureManager {
    public static final int DATA_SHARE_ERROR_CONCURRENT_REQUEST = 2;
    public static final int DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED = 3;
    public static final int DATA_SHARE_ERROR_UNKNOWN = 1;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_CONTENT_CAPTURE_VERSION = 1;
    public static final long DEFAULT_CONTENT_PROTECTION_ALLOWLIST_DELAY_MS = 30000L;
    public static final long DEFAULT_CONTENT_PROTECTION_ALLOWLIST_TIMEOUT_MS = 250L;
    public static final long DEFAULT_CONTENT_PROTECTION_AUTO_DISCONNECT_TIMEOUT_MS = 3000L;
    public static final int DEFAULT_CONTENT_PROTECTION_BUFFER_SIZE = 150;
    public static final java.util.List<java.util.List<java.lang.String>> DEFAULT_CONTENT_PROTECTION_OPTIONAL_GROUPS = null;
    public static final java.lang.String DEFAULT_CONTENT_PROTECTION_OPTIONAL_GROUPS_CONFIG = "";
    public static final int DEFAULT_CONTENT_PROTECTION_OPTIONAL_GROUPS_THRESHOLD = 0;
    public static final java.util.List<java.util.List<java.lang.String>> DEFAULT_CONTENT_PROTECTION_REQUIRED_GROUPS = null;
    public static final java.lang.String DEFAULT_CONTENT_PROTECTION_REQUIRED_GROUPS_CONFIG = "";
    public static final boolean DEFAULT_ENABLE_CONTENT_CAPTURE_RECEIVER = true;
    public static final boolean DEFAULT_ENABLE_CONTENT_PROTECTION_RECEIVER = false;
    public static final int DEFAULT_IDLE_FLUSHING_FREQUENCY_MS = 5000;
    public static final int DEFAULT_LOG_HISTORY_SIZE = 10;
    public static final int DEFAULT_MAX_BUFFER_SIZE = 500;
    public static final int DEFAULT_TEXT_CHANGE_FLUSHING_FREQUENCY_MS = 500;
    private static final long DEPRECATE_SET_CONTENT_CAPTURE_ENABLED = 454307959L;
    public static final java.lang.String DEVICE_CONFIG_ENABLE_ACTIVITY_START_ASSIST_CONTENT = "enable_activity_start_assist_content";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_ALLOWLIST_DELAY_MS = "content_protection_allowlist_delay_ms";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_ALLOWLIST_TIMEOUT_MS = "content_protection_allowlist_timeout_ms";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_AUTO_DISCONNECT_TIMEOUT = "content_protection_auto_disconnect_timeout_ms";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_BUFFER_SIZE = "content_protection_buffer_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_OPTIONAL_GROUPS_CONFIG = "content_protection_optional_groups_config";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_OPTIONAL_GROUPS_THRESHOLD = "content_protection_optional_groups_threshold";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_CONTENT_PROTECTION_REQUIRED_GROUPS_CONFIG = "content_protection_required_groups_config";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_ENABLE_CONTENT_PROTECTION_RECEIVER = "enable_content_protection_receiver";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_IDLE_FLUSH_FREQUENCY = "idle_flush_frequency";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_IDLE_UNBIND_TIMEOUT = "idle_unbind_timeout";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_LOGGING_LEVEL = "logging_level";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_LOG_HISTORY_SIZE = "log_history_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_MAX_BUFFER_SIZE = "max_buffer_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_REPORT_LIST_VIEW_CHILDREN = "report_list_view_children";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_SERVICE_EXPLICITLY_ENABLED = "service_explicitly_enabled";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_TEXT_CHANGE_FLUSH_FREQUENCY = "text_change_flush_frequency";
    public static final java.lang.String DUMPABLE_NAME = "ContentCaptureManager";
    public static final int LOGGING_LEVEL_DEBUG = 1;
    public static final int LOGGING_LEVEL_OFF = 0;
    public static final int LOGGING_LEVEL_VERBOSE = 2;
    @android.annotation.SystemApi
    public static final int NO_SESSION_ID = 0;
    public static final int RESULT_CODE_FALSE = 2;
    public static final int RESULT_CODE_OK = 0;
    public static final int RESULT_CODE_SECURITY_EXCEPTION = -1;
    public static final int RESULT_CODE_TRUE = 1;
    private static final int SYNC_CALLS_TIMEOUT_MS = 5000;
    private static final java.lang.String TAG = null;
    private java.util.Set<android.view.contentcapture.ContentCaptureCondition> mContentCaptureConditionBuffer;
    private android.os.Handler mContentCaptureHandler;
    private final com.android.internal.util.RingBuffer<android.view.contentcapture.ContentCaptureEvent> mContentProtectionEventBuffer = null;
    private final android.view.contentcapture.ContentCaptureManager.StrippedContext mContext = null;
    private final android.view.contentcapture.ContentCaptureManager.LocalDataShareAdapterResourceManager mDataShareAdapterResourceManager = null;
    private android.view.contentcapture.ContentCaptureManager.Dumper mDumpable;
    private int mFlags;
    private final java.lang.Object mLock = null;
    private volatile android.view.contentcapture.ContentCaptureSession mMainSession;
    final android.content.ContentCaptureOptions mOptions = null;
    private final android.view.contentcapture.IContentCaptureManager mService = null;
    private android.os.Handler mUiHandler;
    public ContentCaptureManager(android.content.Context p0, android.view.contentcapture.IContentCaptureManager p1, android.content.ContentCaptureOptions p2) {}
    private static android.view.contentcapture.IContentCaptureManager getService() { return null; }
    public static android.content.ComponentName getServiceSettingsComponentName() { return null; }
    private android.os.Handler prepareContentCaptureHandler() { return null; }
    private android.os.Handler prepareUiHandler() { return null; }
    public static void resetTemporaryService(int p0) {}
    public static void setDefaultServiceEnabled(int p0, boolean p1) {}
    public static void setTemporaryService(int p0, java.lang.String p1, int p2) {}
    private com.android.internal.util.SyncResultReceiver syncRun(android.view.contentcapture.ContentCaptureManager.MyRunnable p0) { return null; }
    public void addDumpable(android.app.Activity p0) {}
    public void flush(int p0) {}
    public java.util.Set<android.view.contentcapture.ContentCaptureCondition> getContentCaptureConditions() { return null; }
    public com.android.internal.util.RingBuffer<android.view.contentcapture.ContentCaptureEvent> getContentProtectionEventBuffer() { return null; }
    public android.view.contentcapture.ContentCaptureSession getMainContentCaptureSession() { return null; }
    public android.content.ComponentName getServiceComponentName() { return null; }
    boolean isContentCaptureConditionEnabled(android.view.contentcapture.ContentCaptureCondition p0) { return false; }
    public boolean isContentCaptureEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isContentCaptureFeatureEnabled() { return false; }
    public void onActivityCreated(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2) {}
    public void onActivityDestroyed() {}
    public void onActivityPaused() {}
    public void onActivityResumed() {}
    public void removeData(android.view.contentcapture.DataRemovalRequest p0) {}
    @java.lang.Deprecated
    public void setContentCaptureEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setContentProtectionAllowlist(java.util.Set<java.lang.String> p0) {}
    public void shareData(android.view.contentcapture.DataShareRequest p0, java.util.concurrent.Executor p1, android.view.contentcapture.DataShareWriteAdapter p2) {}
    public void updateWindowAttributes(android.view.WindowManager.LayoutParams p0) {}

    public static interface ContentCaptureClient {
        public android.content.ComponentName contentCaptureClientGetComponentName();
    }

    private static class DataShareAdapterDelegate extends android.view.contentcapture.IDataShareWriteAdapter.Stub {
        private final java.lang.ref.WeakReference<android.view.contentcapture.ContentCaptureManager.LocalDataShareAdapterResourceManager> mResourceManagerReference = null;
        private DataShareAdapterDelegate(java.util.concurrent.Executor p0, android.view.contentcapture.DataShareWriteAdapter p1, android.view.contentcapture.ContentCaptureManager.LocalDataShareAdapterResourceManager p2) { super(); }
        private void clearHardReferences() {}
        private void executeAdapterMethodLocked(java.util.function.Consumer<android.view.contentcapture.DataShareWriteAdapter> p0, java.lang.String p1) {}
        public void error(int p0) throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
        public void rejected() throws android.os.RemoteException {}
        public void write(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataShareError {
    }

    private final class Dumper implements android.util.Dumpable {
        private Dumper(android.view.contentcapture.ContentCaptureManager p0) {}
        public void dump(java.io.PrintWriter p0, java.lang.String[] p1) {}
        public java.lang.String getDumpableName() { return null; }
    }

    private static class LocalDataShareAdapterResourceManager {
        private java.util.Map<android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate, java.util.concurrent.Executor> mExecutorHardReferences;
        private java.util.Map<android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate, android.view.contentcapture.DataShareWriteAdapter> mWriteAdapterHardReferences;
        private LocalDataShareAdapterResourceManager() {}
        void clearHardReferences(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0) {}
        android.view.contentcapture.DataShareWriteAdapter getAdapter(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0) { return null; }
        java.util.concurrent.Executor getExecutor(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0) { return null; }
        void initializeForDelegate(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0, android.view.contentcapture.DataShareWriteAdapter p1, java.util.concurrent.Executor p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LoggingLevel {
    }

    private static interface MyRunnable {
        public void run(com.android.internal.util.SyncResultReceiver p0) throws android.os.RemoteException;
    }

    public static class StrippedContext {
        final java.lang.String mContext = null;
        final java.lang.String mPackageName = null;
        final int mUserId = 0;
        public StrippedContext(android.content.Context p0) {}
        public java.lang.String getPackageName() { return null; }
        public int getUserId() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
