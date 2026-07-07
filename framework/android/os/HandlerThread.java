package android.os;

public class HandlerThread extends java.lang.Thread {
    private volatile java.util.concurrent.Executor mExecutor;
    private volatile android.os.Handler mHandler;
    android.os.Looper mLooper;
    int mPriority;
    int mTid;
    public HandlerThread(java.lang.String p0) { super(); }
    public HandlerThread(java.lang.String p0, int p1) { super(); }
    public android.os.Looper getLooper() { return null; }
    public final java.util.concurrent.Executor getThreadExecutor() { return null; }
    public final android.os.Handler getThreadHandler() { return null; }
    public int getThreadId() { return 0; }
    protected void onCreated() {}
    protected void onCreated$ravenwood() {}
    protected void onLooperPrepared() {}
    public boolean quit() { return false; }
    public boolean quitSafely() { return false; }
    public void run() {}
}
