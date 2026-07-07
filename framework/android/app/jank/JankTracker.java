package android.app.jank;

public class JankTracker {
    private static final boolean DEBUG = false;
    private static final java.lang.String DEBUG_KEY = "JANKTRACKER";
    public static final java.lang.String KEY_JANK_METRIC_COLLECTION_ENABLED = "jank_metric_collection_enabled";
    public static final java.lang.String NAMESPACE_SYSTEM_PERFORMANCE = "system_performance";
    private static final int REGISTRATION_DELAY_MS = 1000;
    public static java.lang.Boolean VALUE_JANK_METRIC_COLLECTION_ENABLED;
    private java.lang.String mActivityName;
    private int mAppUid;
    private boolean mComponentsReady;
    private android.view.View mDecorView;
    private android.os.Handler mHandler;
    private android.os.HandlerThread mHandlerThread;
    private final android.view.SurfaceControl.OnJankDataListener mJankDataListener = null;
    private android.view.SurfaceControl.OnJankDataListenerRegistration mJankDataListenerRegistration;
    private android.app.jank.JankDataProcessor mJankDataProcessor;
    private boolean mListenersRegistered;
    private final android.view.ViewTreeObserver.OnWindowAttachListener mOnWindowAttachListener = null;
    private android.app.jank.StateTracker mStateTracker;
    private android.view.AttachedSurfaceControl mSurfaceControl;
    private boolean mTrackingEnabled;
    public JankTracker(android.view.Choreographer p0, android.view.View p1) {}
    public JankTracker(android.view.View p0) {}
    private void addActivityToStateTracking() {}
    private android.os.Handler getHandler() { return null; }
    private int getLayerId() { return 0; }
    private void initializeJankTrackingComponents() {}
    public static boolean isJankTrackingSupported() { return false; }
    private void registerForJankData() {}
    private void registerJankDataListener() {}
    private void registerWindowListeners() {}
    private void removeActivityFromStateTracking() {}
    private void unregisterForJankData() {}
    public void addUiState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void disableAppJankTracking() {}
    public void enableAppJankTracking() {}
    public void forceListenerRegistration() {}
    public void getAllUiStates(java.util.ArrayList<android.app.jank.StateTracker.StateData> p0) {}
    public java.util.HashMap<java.lang.String, android.app.jank.JankDataProcessor.PendingJankStat> getPendingJankStats() { return null; }
    public void mergeAppJankStats(android.app.jank.AppJankStats p0) {}
    public void removeUiState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void setActivityName(java.lang.String p0) {}
    public void setAppUid(int p0) {}
    public boolean shouldTrack() { return false; }
    public void updateUiState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
}
