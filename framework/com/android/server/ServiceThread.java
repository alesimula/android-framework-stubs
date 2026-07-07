package com.android.server;

public class ServiceThread extends android.os.HandlerThread {
    private static final java.lang.String TAG = "ServiceThread";
    private final boolean mAllowIo = false;
    public ServiceThread(java.lang.String p0, int p1, boolean p2) { super((java.lang.String)null); }
    protected static android.os.Handler makeSharedHandler(android.os.Looper p0) { return null; }
    public void run() {}
}
