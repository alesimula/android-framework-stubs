package com.android.internal.os;

public final class BackgroundThread extends android.os.HandlerThread {
    private static final long SLOW_DELIVERY_THRESHOLD_MS = 30000L;
    private static final long SLOW_DISPATCH_THRESHOLD_MS = 10000L;
    private static volatile android.os.Handler sHandler;
    private static volatile android.os.HandlerExecutor sHandlerExecutor;
    private static volatile com.android.internal.os.BackgroundThread sInstance;
    private BackgroundThread() { super((java.lang.String)null); }
    private static void ensureThreadReady() {}
    private static void ensureThreadStartedLocked() {}
    public static com.android.internal.os.BackgroundThread get() { return null; }
    public static java.util.concurrent.Executor getExecutor() { return null; }
    public static android.os.Handler getHandler() { return null; }
    public static void startIfNeeded() {}
}
