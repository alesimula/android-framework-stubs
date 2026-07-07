package android.view;

public abstract class InputEventReceiver {
    private static final java.lang.String TAG = "InputEventReceiver";
    private android.os.Looper mLooper;
    private long mReceiverPtr;
    private final android.util.SparseIntArray mSeqMap = null;
    public InputEventReceiver(android.view.InputChannel p0, android.os.Looper p1) {}
    private static boolean dispatchBatchedInputEventPending(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, int p1) { return false; }
    private static boolean dispatchDragEvent(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, int p1, boolean p2, float p3, float p4, int p5, int p6, int p7) { return false; }
    private static boolean dispatchFocusEvent(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, int p1, boolean p2) { return false; }
    private static boolean dispatchInputEvent(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, int p1, android.view.InputEvent p2) { return false; }
    private static boolean dispatchPointerCaptureEvent(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, int p1, boolean p2) { return false; }
    private static boolean dispatchTouchModeChanged(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, int p1, boolean p2) { return false; }
    private void dispose(boolean p0) {}
    private static native boolean nativeConsumeBatchedInputEvents(long p0, long p1);
    private static native void nativeDispose(long p0, boolean p1);
    private static native java.lang.String nativeDump(long p0, java.lang.String p1);
    private static native void nativeFinishInputEvent(long p0, int p1, boolean p2);
    private static native long nativeGetFrameMetricsObserver(long p0);
    private static native android.os.IBinder nativeGetToken(long p0);
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.InputEventReceiver> p0, android.view.InputChannel p1, android.os.MessageQueue p2);
    private static native boolean nativeProbablyHasInput(long p0);
    public final boolean consumeBatchedInputEvents(long p0) { return false; }
    public void dispose() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public final void finishInputEvent(android.view.InputEvent p0, boolean p1) {}
    protected final long getNativeFrameMetricsObserver() { return 0L; }
    public android.os.IBinder getToken() { return null; }
    public void onBatchedInputEventPending(int p0) {}
    public void onDragEvent(boolean p0, float p1, float p2, int p3, int p4, int p5) {}
    public void onFocusEvent(boolean p0) {}
    public void onInputEvent(android.view.InputEvent p0) {}
    public void onPointerCaptureEvent(boolean p0) {}
    public void onTouchModeChanged(boolean p0) {}
    public boolean probablyHasInput() { return false; }
}
