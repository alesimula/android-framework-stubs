package com.android.internal.telephony.util;

public final class WorkerThread extends android.os.HandlerThread {
    private static volatile android.os.Handler sHandler;
    private static volatile android.os.HandlerExecutor sHandlerExecutor;
    private static volatile com.android.internal.telephony.util.WorkerThread sInstance;
    private static final java.lang.Object sLock = null;
    private java.util.concurrent.CountDownLatch mInitLock;
    private WorkerThread() { super((java.lang.String)null); }
    private static void ensureThread() {}
    public static android.os.HandlerThread get() { return null; }
    public static java.util.concurrent.Executor getExecutor() { return null; }
    public static android.os.Handler getHandler() { return null; }
    public static void reset() {}
    protected void onLooperPrepared() {}
}
