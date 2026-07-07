package com.android.server.servicewatcher;

class ServiceWatcherImpl<TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> implements com.android.server.servicewatcher.ServiceWatcher, com.android.server.servicewatcher.ServiceWatcher.ServiceChangedListener {
    static final boolean D = Boolean.valueOf(false);
    private static final int DISCONNECTED_COUNT_BEFORE_MARKED_AS_UNSTABLE = 10;
    static final long RETRY_DELAY_MS = 15000L;
    static final java.lang.String TAG = "ServiceWatcher";
    private static final long UNSTABLE_TIME_PERIOD_MS = 60000L;
    final android.content.Context mContext = null;
    private int mDisconnectedCount;
    private java.lang.String mDisconnectedService;
    private long mDisconnectedStartTime;
    final android.os.Handler mHandler = null;
    private final com.android.internal.content.PackageMonitor mPackageMonitor = null;
    private boolean mRegistered;
    private com.android.server.servicewatcher.ServiceWatcherImpl<TBoundServiceInfo>.MyServiceConnection mServiceConnection;
    final com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> mServiceListener = null;
    final com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> mServiceSupplier = null;
    final java.lang.String mTag = null;
    private boolean mUnstableFallbackEnabled;
    ServiceWatcherImpl(android.content.Context p0, android.os.Handler p1, java.lang.String p2, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p3, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p4) {}
    ServiceWatcherImpl(android.content.Context p0, android.os.Handler p1, java.lang.String p2, boolean p3, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p4, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p5) {}
    public boolean checkServiceResolves() { return false; }
    public void dump(java.io.PrintWriter p0) {}
    public void onServiceChanged() {}
    void onServiceChanged(boolean p0) {}
    public void register() {}
    public void runOnBinder(com.android.server.servicewatcher.ServiceWatcher.BinderOperation p0) {}
    public java.lang.String toString() { return null; }
    public void unregister() {}

    private class MyServiceConnection implements android.content.ServiceConnection {
        private volatile android.os.IBinder mBinder;
        private boolean mForcingRebind;
        private java.lang.Runnable mRebinder;
        MyServiceConnection(TBoundServiceInfo p0) {}
        void bind() {}
        TBoundServiceInfo getBoundServiceInfo() { return null; }
        boolean isConnected() { return false; }
        public final void onBindingDied(android.content.ComponentName p0) {}
        public final void onNullBinding(android.content.ComponentName p0) {}
        public final void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public final void onServiceDisconnected(android.content.ComponentName p0) {}
        void runOnBinder(com.android.server.servicewatcher.ServiceWatcher.BinderOperation p0) {}
        void unbind() {}
    }
}
