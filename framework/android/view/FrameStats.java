package android.view;

public abstract class FrameStats {
    public static final long UNDEFINED_TIME_NANO = -1L;
    protected long[] mFramesPresentedTimeNano;
    protected long mRefreshPeriodNano;
    public FrameStats() {}
    public final long getEndTimeNano() { return 0L; }
    public final int getFrameCount() { return 0; }
    public final long getFramePresentedTimeNano(int p0) { return 0L; }
    public final long getRefreshPeriodNano() { return 0L; }
    public final long getStartTimeNano() { return 0L; }
}
