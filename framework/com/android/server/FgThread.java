package com.android.server;

public final class FgThread extends com.android.server.ServiceThread {
    private static final long SLOW_DELIVERY_THRESHOLD_MS = 200L;
    private static final long SLOW_DISPATCH_THRESHOLD_MS = 100L;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerExecutor mHandlerExecutor = null;
    private FgThread() { super(null, 0, false); }
    public static com.android.server.FgThread get() { return null; }
    public static java.util.concurrent.Executor getExecutor() { return null; }
    public static android.os.Handler getHandler() { return null; }

    private static final class NoPreloadHolder {
        private static final com.android.server.FgThread sInstance = null;
        private NoPreloadHolder() {}
    }
}
