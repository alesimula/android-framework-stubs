package com.android.internal.util;

public final class SyncResultReceiver extends com.android.internal.os.IResultReceiver.Stub {
    private static final java.lang.String EXTRA = "EXTRA";
    private android.os.Bundle mBundle;
    private final java.util.concurrent.CountDownLatch mLatch = null;
    private int mResult;
    private final int mTimeoutMs = 0;
    public SyncResultReceiver(int p0) { super(); }
    public static android.os.Bundle bundleFor(int p0) { return null; }
    public static android.os.Bundle bundleFor(android.os.Parcelable p0) { return null; }
    public static android.os.Bundle bundleFor(java.lang.String p0) { return null; }
    public static android.os.Bundle bundleFor(java.util.ArrayList<? extends android.os.Parcelable> p0) { return null; }
    public static android.os.Bundle bundleFor(java.lang.String[] p0) { return null; }
    private void waitResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException {}
    public int getIntResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return 0; }
    public int getOptionalExtraIntResult(int p0) throws com.android.internal.util.SyncResultReceiver.TimeoutException { return 0; }
    public <P extends android.os.Parcelable> java.util.ArrayList<P> getParcelableListResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    public <P extends android.os.Parcelable> P getParcelableResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    public java.lang.String[] getStringArrayResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    public java.lang.String getStringResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    public void send(int p0, android.os.Bundle p1) {}

    public static final class TimeoutException extends java.lang.Exception {
        private TimeoutException(java.lang.String p0) { super(); }
    }
}
