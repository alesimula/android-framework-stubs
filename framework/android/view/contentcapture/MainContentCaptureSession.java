package android.view.contentcapture;

public final class MainContentCaptureSession extends android.view.contentcapture.ContentCaptureSession {
    private static final java.lang.String CONTENT_CAPTURE_WRONG_THREAD_METRIC_ID = "content_capture.value_content_capture_wrong_thread_count";
    private static final boolean FORCE_FLUSH = true;
    private static final int MSG_FLUSH = 1;
    private static final java.lang.String TAG = null;
    private android.os.IBinder mApplicationToken;
    public android.content.ComponentName mComponentName;
    private final android.os.Handler mContentCaptureHandler = null;
    public android.view.contentprotection.ContentProtectionEventProcessor mContentProtectionEventProcessor;
    private final android.view.contentcapture.ContentCaptureManager.StrippedContext mContext = null;
    public android.view.contentcapture.IContentCaptureDirectManager mDirectServiceInterface;
    private android.os.IBinder.DeathRecipient mDirectServiceVulture;
    private final java.util.concurrent.atomic.AtomicBoolean mDisabled = null;
    public final java.util.concurrent.ConcurrentLinkedQueue<android.view.contentcapture.ContentCaptureEvent> mEventProcessQueue = null;
    public java.util.ArrayList<android.view.contentcapture.ContentCaptureEvent> mEvents;
    private final android.util.LocalLog mFlushHistory = null;
    private final android.view.contentcapture.ContentCaptureManager mManager = null;
    private long mNextFlush;
    private boolean mNextFlushForTextChanged;
    private final android.view.contentcapture.MainContentCaptureSession.SessionStateReceiver mSessionStateReceiver = null;
    private android.os.IBinder mShareableActivityToken;
    private int mState;
    private final android.view.contentcapture.IContentCaptureManager mSystemServerInterface = null;
    private final android.os.Handler mUiHandler = null;
    private final java.util.concurrent.atomic.AtomicInteger mWrongThreadCount = null;
    public MainContentCaptureSession(android.view.contentcapture.ContentCaptureManager.StrippedContext p0, android.view.contentcapture.ContentCaptureManager p1, android.os.Handler p2, android.os.Handler p3, android.view.contentcapture.IContentCaptureManager p4) { super(); }
    private void checkOnContentCaptureThread() {}
    private void clearAndRunOnContentCaptureThread(java.lang.Runnable p0, int p1) {}
    private java.util.List<android.view.contentcapture.ContentCaptureEvent> clearBufferEvents() { return null; }
    private android.content.pm.ParceledListSlice<android.view.contentcapture.ContentCaptureEvent> clearEvents() { return null; }
    private void enqueueEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    private void enqueueEvent(android.view.contentcapture.ContentCaptureEvent p0, boolean p1) {}
    private void flushIfNeeded(int p0) {}
    private void flushImpl(int p0) {}
    private java.lang.String getActivityName() { return null; }
    private java.lang.String getDebugState() { return null; }
    private java.lang.String getDebugState(int p0) { return null; }
    private boolean hasStarted() { return false; }
    private boolean isContentCaptureReceiverEnabled() { return false; }
    private boolean isContentProtectionEnabled() { return false; }
    private boolean isContentProtectionReceiverEnabled() { return false; }
    private void notifyContentCaptureEventsImpl(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    private void notifyVirtualChildrenAppeared(android.view.contentcapture.ContentCaptureSession p0, android.view.autofill.AutofillId p1, android.view.accessibility.AccessibilityNodeProvider p2) {}
    private void notifyVirtualChildrenAppearedHelper(android.view.autofill.AutofillId p0, android.view.autofill.AutofillId p1, android.view.accessibility.AccessibilityNodeProvider p2, android.view.contentcapture.ContentCaptureSession p3, int p4) {}
    private void prepareViewStructures(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    private void reportWrongThreadMetric() {}
    private void runOnContentCaptureThread(java.lang.Runnable p0) {}
    private void runOnUiThread(java.lang.Runnable p0) {}
    private void scheduleFlush(int p0, boolean p1) {}
    private void sendContentCaptureEvent(android.view.contentcapture.ContentCaptureEvent p0, boolean p1) {}
    private void sendContentProtectionEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    private void sendEvent(android.view.contentcapture.ContentCaptureEvent p0, boolean p1) {}
    private void setContentDescriptionFromA11yIfNeeded(android.view.View p0, android.view.ViewStructure p1) {}
    private void startImpl(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) {}
    public void destroySession() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void flush(int p0) {}
    public int getContentCaptureVersion() { return 0; }
    protected android.view.contentcapture.ContentCaptureSession getMainCaptureSession() { return null; }
    protected void internalNotifyChildSessionFinished(int p0, int p1) {}
    protected void internalNotifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2) {}
    protected void internalNotifyContentInteractionEvent(int p0, android.view.autofill.AutofillId p1) {}
    protected void internalNotifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1) {}
    protected void internalNotifySessionFlushEvent(int p0) {}
    protected void internalNotifySessionPaused() {}
    protected void internalNotifySessionResumed() {}
    protected void internalNotifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1) {}
    protected void internalNotifyViewDisappeared(int p0, android.view.autofill.AutofillId p1) {}
    protected void internalNotifyViewInsetsChanged(int p0, android.graphics.Insets p1) {}
    protected void internalNotifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2) {}
    protected void internalNotifyViewTreeEvent(int p0, boolean p1) {}
    protected boolean isContentCaptureEnabled() { return false; }
    protected boolean isDisabled() { return false; }
    protected android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    public void notifyContentCaptureEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    public void notifyContentCaptureInteractionEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    public void notifyWindowBoundsChanged(int p0, android.graphics.Rect p1) {}
    protected void onDestroy() {}
    public void onSessionStarted(int p0, android.os.IBinder p1) {}
    public void resetSession(int p0) {}
    public void sendEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    protected boolean setDisabled(boolean p0) { return false; }
    protected void start(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) {}
    protected void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}

    private static class SessionStateReceiver extends com.android.internal.os.IResultReceiver.Stub {
        private final java.lang.ref.WeakReference<android.view.contentcapture.MainContentCaptureSession> mMainSession = null;
        SessionStateReceiver(android.view.contentcapture.MainContentCaptureSession p0) { super(); }
        public void send(int p0, android.os.Bundle p1) {}
    }

    private static final class ViewStructureSession {
        private android.view.contentcapture.ContentCaptureSession mSession;
        private android.view.ViewStructure mStructure;
        ViewStructureSession() {}
        void notifyViewAppeared() {}
        void setSession(android.view.contentcapture.ContentCaptureSession p0) {}
        void setStructure(android.view.ViewStructure p0) {}
    }
}
