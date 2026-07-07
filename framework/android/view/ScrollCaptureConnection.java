package android.view;

public class ScrollCaptureConnection extends android.view.IScrollCaptureConnection.Stub implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String END_CAPTURE = "endCapture";
    private static final java.lang.String REQUEST_IMAGE = "requestImage";
    private static final java.lang.String SESSION = "Session";
    private static final java.lang.String START_CAPTURE = "startCapture";
    private static final java.lang.String TAG = "ScrollCaptureConnection";
    private static final java.lang.String TRACE_TRACK = "Scroll Capture";
    private volatile boolean mActive;
    private android.os.CancellationSignal mCancellation;
    private final android.util.CloseGuard mCloseGuard = null;
    private volatile boolean mConnected;
    private android.view.ScrollCaptureCallback mLocal;
    private final java.lang.Object mLock = null;
    private final android.graphics.Point mPositionInWindow = null;
    private android.view.IScrollCaptureCallbacks mRemote;
    private final android.graphics.Rect mScrollBounds = null;
    private android.view.ScrollCaptureSession mSession;
    private int mTraceId;
    private final java.util.concurrent.Executor mUiThread = null;
    public ScrollCaptureConnection(java.util.concurrent.Executor p0, android.view.ScrollCaptureTarget p1) { super(); }
    private void cancelPendingAction() {}
    private void checkActive() throws android.os.RemoteException {}
    private void onEndCaptureCompleted() {}
    private void onStartCaptureCompleted() {}
    public void binderDied() {}
    public void close() {}
    public android.os.ICancellationSignal endCapture() throws android.os.RemoteException { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public boolean isActive() { return false; }
    public boolean isConnected() { return false; }
    void onImageRequestCompleted(android.graphics.Rect p0) {}
    public android.os.ICancellationSignal requestImage(android.graphics.Rect p0) throws android.os.RemoteException { return null; }
    public android.os.ICancellationSignal startCapture(android.view.Surface p0, android.view.IScrollCaptureCallbacks p1) throws android.os.RemoteException { return null; }
    public java.lang.String toString() { return null; }

    private static final class ConsumerCallback<T extends java.lang.Object> extends android.view.ScrollCaptureConnection.SafeCallback<java.util.function.Consumer<T>> implements java.util.function.Consumer<T> {
        ConsumerCallback(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.util.function.Consumer<T> p2) { super(null, null, null); }
        public void accept(T p0) {}
    }

    private static final class RunnableCallback extends android.view.ScrollCaptureConnection.SafeCallback<java.lang.Runnable> implements java.lang.Runnable {
        RunnableCallback(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) { super(null, null, null); }
        public void run() {}
    }

    private static class SafeCallback<T extends java.lang.Object> {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.CancellationSignal mSignal = null;
        private final java.util.concurrent.atomic.AtomicReference<T> mValue = null;
        protected SafeCallback(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, T p2) {}
        static java.lang.Runnable create(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) { return null; }
        static <T extends java.lang.Object> java.util.function.Consumer<T> create(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, java.util.function.Consumer<T> p2) { return null; }
        protected final void maybeAccept(java.util.function.Consumer<T> p0) {}
    }
}
