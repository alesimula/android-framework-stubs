package android.view;

public abstract class InputEventSender {
    private static final java.lang.String TAG = "InputEventSender";
    private android.os.Handler mHandler;
    private long mSenderPtr;
    public InputEventSender(android.view.InputChannel p0, android.os.Looper p1) {}
    private void dispatchInputEventFinished(int p0, boolean p1) {}
    private void dispatchTimelineReported(int p0, long p1, long p2) {}
    private void dispose(boolean p0) {}
    private static native void nativeDispose(long p0);
    private static native android.os.IBinder nativeGetToken(long p0);
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.InputEventSender> p0, android.view.InputChannel p1, android.os.MessageQueue p2);
    private static native boolean nativeSendKeyEvent(long p0, int p1, android.view.KeyEvent p2);
    private static native boolean nativeSendMotionEvent(long p0, int p1, android.view.MotionEvent p2);
    private boolean sendInputEventInternal(int p0, android.view.InputEvent p1) { return false; }
    public void dispose() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.os.IBinder getToken() { return null; }
    public void onInputEventFinished(int p0, boolean p1) {}
    public void onTimelineReported(int p0, long p1, long p2) {}
    public final boolean sendInputEvent(int p0, android.view.InputEvent p1) { return false; }
}
