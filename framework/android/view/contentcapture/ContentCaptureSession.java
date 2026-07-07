package android.view.contentcapture;

public abstract class ContentCaptureSession implements java.lang.AutoCloseable {
    public static final java.lang.String EXTRA_BINDER = "binder";
    public static final java.lang.String EXTRA_ENABLED_STATE = "enabled";
    public static final int FLUSH_REASON_FORCE_FLUSH = 8;
    public static final int FLUSH_REASON_FULL = 1;
    public static final int FLUSH_REASON_IDLE_TIMEOUT = 5;
    public static final int FLUSH_REASON_SESSION_CONNECTED = 7;
    public static final int FLUSH_REASON_SESSION_FINISHED = 4;
    public static final int FLUSH_REASON_SESSION_STARTED = 3;
    public static final int FLUSH_REASON_TEXT_CHANGE_TIMEOUT = 6;
    public static final int FLUSH_REASON_VIEW_ROOT_ENTERED = 2;
    public static final int FLUSH_REASON_VIEW_TREE_APPEARED = 10;
    public static final int FLUSH_REASON_VIEW_TREE_APPEARING = 9;
    private static final java.security.SecureRandom ID_GENERATOR = null;
    private static final int INITIAL_CHILDREN_CAPACITY = 5;
    static final long NOTIFY_NODES_DISAPPEAR_NOW_SENDS_TREE_EVENTS = 258825825L;
    public static final int STATE_ACTIVE = 2;
    public static final int STATE_BY_APP = 64;
    public static final int STATE_DISABLED = 4;
    public static final int STATE_DUPLICATED_ID = 8;
    public static final int STATE_FLAG_SECURE = 32;
    public static final int STATE_INTERNAL_ERROR = 256;
    public static final int STATE_NOT_WHITELISTED = 512;
    public static final int STATE_NO_RESPONSE = 128;
    public static final int STATE_NO_SERVICE = 16;
    public static final int STATE_SERVICE_DIED = 1024;
    public static final int STATE_SERVICE_RESURRECTED = 4096;
    public static final int STATE_SERVICE_UPDATING = 2048;
    public static final int STATE_WAITING_FOR_SERVER = 1;
    private static final java.lang.String TAG = null;
    public static final int UNKNOWN_STATE = 0;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;
    private java.util.ArrayList<android.view.contentcapture.ContentCaptureSession> mChildren;
    private android.view.contentcapture.ContentCaptureContext mClientContext;
    private android.view.contentcapture.ContentCaptureSessionId mContentCaptureSessionId;
    private volatile boolean mDestroyed;
    protected final int mId = 0;
    private final java.lang.Object mLock = null;
    private int mState;
    protected ContentCaptureSession() {}
    public ContentCaptureSession(int p0) {}
    ContentCaptureSession(android.view.contentcapture.ContentCaptureContext p0) {}
    public static java.lang.String getFlushReasonAsString(int p0) { return null; }
    private static int getRandomSessionId() { return 0; }
    protected static java.lang.String getStateAsString(int p0) { return null; }
    public void close() {}
    public final android.view.contentcapture.ContentCaptureSession createContentCaptureSession(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    public final void destroy() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void flush() {}
    abstract void flush(int p0);
    public final android.view.contentcapture.ContentCaptureContext getContentCaptureContext() { return null; }
    public final android.view.contentcapture.ContentCaptureSessionId getContentCaptureSessionId() { return null; }
    public abstract int getContentCaptureVersion();
    public int getId() { return 0; }
    protected abstract android.view.contentcapture.ContentCaptureSession getMainCaptureSession();
    abstract void internalNotifyChildSessionFinished(int p0, int p1);
    abstract void internalNotifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2);
    protected abstract void internalNotifyContentInteractionEvent(int p0, android.view.autofill.AutofillId p1);
    abstract void internalNotifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1);
    protected abstract void internalNotifySessionFlushEvent(int p0);
    abstract void internalNotifySessionPaused();
    abstract void internalNotifySessionResumed();
    protected abstract void internalNotifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1);
    protected abstract void internalNotifyViewDisappeared(int p0, android.view.autofill.AutofillId p1);
    protected abstract void internalNotifyViewInsetsChanged(int p0, android.graphics.Insets p1);
    protected abstract void internalNotifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2);
    protected abstract void internalNotifyViewTreeEvent(int p0, boolean p1);
    boolean isContentCaptureEnabled() { return false; }
    public boolean isContentCaptureVersion1() { return false; }
    abstract boolean isDisabled();
    public android.view.autofill.AutofillId newAutofillId(android.view.autofill.AutofillId p0, long p1) { return null; }
    protected abstract android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0);
    public final android.view.ViewStructure newViewStructure(android.view.View p0) { return null; }
    public final android.view.ViewStructure newVirtualViewStructure(android.view.autofill.AutofillId p0, long p1) { return null; }
    public abstract void notifyContentCaptureEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0);
    public abstract void notifyContentCaptureInteractionEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0);
    public void notifyContentInteractionEvent(android.view.autofill.AutofillId p0) {}
    public final void notifySessionPaused() {}
    public final void notifySessionResumed() {}
    public final void notifyViewAppeared(android.view.ViewStructure p0) {}
    public final void notifyViewDisappeared(android.view.autofill.AutofillId p0) {}
    public final void notifyViewInsetsChanged(android.graphics.Insets p0) {}
    public final void notifyViewTextChanged(android.view.autofill.AutofillId p0, java.lang.CharSequence p1) {}
    public void notifyViewTreeEvent(boolean p0) {}
    public final void notifyViewsAppeared(java.util.List<android.view.ViewStructure> p0) {}
    public final void notifyViewsDisappeared(android.view.autofill.AutofillId p0, long[] p1) {}
    public abstract void notifyWindowBoundsChanged(int p0, android.graphics.Rect p1);
    abstract void onDestroy();
    public final void setContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    abstract boolean setDisabled(boolean p0);
    abstract void start(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3);
    public java.lang.String toString() { return null; }
    abstract void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentCaptureVersion {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlushReason {
    }
}
