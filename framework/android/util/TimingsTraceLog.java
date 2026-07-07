package android.util;

public class TimingsTraceLog {
    private static final boolean DEBUG_BOOT_TIME = Boolean.valueOf(false);
    private static final int MAX_NESTED_CALLS = 10;
    private int mCurrentLevel;
    private final int mMaxNestedCalls = 0;
    private final java.lang.String[] mStartNames = null;
    private final long[] mStartTimes = null;
    private final java.lang.String mTag = null;
    private final long mThreadId = 0L;
    private final long mTraceTag = 0L;
    protected TimingsTraceLog(android.util.TimingsTraceLog p0) {}
    public TimingsTraceLog(java.lang.String p0, long p1) {}
    public TimingsTraceLog(java.lang.String p0, long p1, int p2) {}
    private void assertSameThread() {}
    private java.lang.String[] createAndGetStartNamesArray() { return null; }
    private long[] createAndGetStartTimesArray() { return null; }
    public final java.util.List<java.lang.String> getUnfinishedTracesForDebug() { return null; }
    public void logDuration(java.lang.String p0, long p1) {}
    public void traceBegin(java.lang.String p0) {}
    public void traceEnd() {}
}
