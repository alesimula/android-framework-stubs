package android.view;

public final class InputQueue {
    private final android.util.LongSparseArray<android.view.InputQueue.ActiveInputEvent> mActiveEventArray = null;
    private final android.util.Pools.Pool<android.view.InputQueue.ActiveInputEvent> mActiveInputEventPool = null;
    private long mPtr;
    public InputQueue() {}
    private void finishInputEvent(long p0, boolean p1) {}
    private static native void nativeDispose(long p0);
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.InputQueue> p0, android.os.MessageQueue p1);
    private static native long nativeSendKeyEvent(long p0, android.view.KeyEvent p1, boolean p2);
    private static native long nativeSendMotionEvent(long p0, android.view.MotionEvent p1);
    private android.view.InputQueue.ActiveInputEvent obtainActiveInputEvent(java.lang.Object p0, android.view.InputQueue.FinishedInputEventCallback p1) { return null; }
    private void recycleActiveInputEvent(android.view.InputQueue.ActiveInputEvent p0) {}
    public void dispose() {}
    public void dispose(boolean p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public long getNativePtr() { return 0L; }
    public void sendInputEvent(android.view.InputEvent p0, java.lang.Object p1, boolean p2, android.view.InputQueue.FinishedInputEventCallback p3) {}

    private final class ActiveInputEvent {
        public android.view.InputQueue.FinishedInputEventCallback mCallback;
        public java.lang.Object mToken;
        private ActiveInputEvent(android.view.InputQueue p0) {}
        public void recycle() {}
    }

    public static interface Callback {
        public void onInputQueueCreated(android.view.InputQueue p0);
        public void onInputQueueDestroyed(android.view.InputQueue p0);
    }

    public static interface FinishedInputEventCallback {
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
    }
}
