package android.os;

public abstract class CountDownTimer {
    private static final int MSG = 1;
    private boolean mCancelled;
    private final long mCountdownInterval = 0L;
    private android.os.Handler mHandler;
    private final long mMillisInFuture = 0L;
    private long mStopTimeInFuture;
    public CountDownTimer(long p0, long p1) {}
    public final void cancel() {}
    public abstract void onFinish();
    public abstract void onTick(long p0);
    public final android.os.CountDownTimer start() { return null; }
}
