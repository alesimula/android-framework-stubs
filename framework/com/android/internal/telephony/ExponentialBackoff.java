package com.android.internal.telephony;

public class ExponentialBackoff {
    private long mCurrentDelayMs;
    private final android.os.Handler mHandler = null;
    private com.android.internal.telephony.ExponentialBackoff.HandlerAdapter mHandlerAdapter;
    private long mMaximumDelayMs;
    private int mMultiplier;
    private int mRetryCounter;
    private final java.lang.Runnable mRunnable = null;
    private long mStartDelayMs;
    public ExponentialBackoff(long p0, long p1, int p2, android.os.Handler p3, java.lang.Runnable p4) {}
    public ExponentialBackoff(long p0, long p1, int p2, android.os.Looper p3, java.lang.Runnable p4) {}
    public long getCurrentDelay() { return 0L; }
    public void notifyFailed() {}
    public void setHandlerAdapter(com.android.internal.telephony.ExponentialBackoff.HandlerAdapter p0) {}
    public void start() {}
    public void stop() {}

    public static interface HandlerAdapter {
        public boolean postDelayed(java.lang.Runnable p0, long p1);
        public void removeCallbacks(java.lang.Runnable p0);
    }
}
