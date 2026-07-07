package com.android.internal.util;

public abstract class AsyncService extends android.app.Service {
    public static final int CMD_ASYNC_SERVICE_DESTROY = 16777216;
    public static final int CMD_ASYNC_SERVICE_ON_START_INTENT = 16777215;
    protected static final boolean DBG = true;
    private static final java.lang.String TAG = "AsyncService";
    com.android.internal.util.AsyncService.AsyncServiceInfo mAsyncServiceInfo;
    android.os.Handler mHandler;
    protected android.os.Messenger mMessenger;
    public AsyncService() { super(); }
    public abstract com.android.internal.util.AsyncService.AsyncServiceInfo createHandler();
    public android.os.Handler getHandler() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    public void onDestroy() {}
    public int onStartCommand(android.content.Intent p0, int p1, int p2) { return 0; }

    public static final class AsyncServiceInfo {
        public android.os.Handler mHandler;
        public int mRestartFlags;
        public AsyncServiceInfo() {}
    }
}
