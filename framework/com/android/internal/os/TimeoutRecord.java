package com.android.internal.os;

public class TimeoutRecord {
    public static final int NO_ORIGINATION_ID = 0;
    private static final java.lang.String TAG = "TimeoutRecord";
    private static final int TRACE_COUNTER_PLACEHOLDER_VALUE = 1;
    private static final java.lang.String TRACE_COUNTER_PREFIX = "ErrorId:";
    private int mAnrId;
    android.app.ApplicationExitInfo.AnrInfo mAnrInfo;
    private long mAnrWarningMs;
    public final long mEndUptimeMillis = 0L;
    private java.util.UUID mErrorId;
    private long mExpectedTimeoutMs;
    private java.lang.Object mExpiredTimer;
    public final int mKind = 0;
    public final com.android.internal.os.anr.AnrLatencyTracker mLatencyTracker = null;
    private int mOriginationId;
    private int mPid;
    private java.lang.String mProcessName;
    private long mRealTimeoutMs;
    public java.lang.String mReason;
    private boolean mUserPerceptible;
    private TimeoutRecord(int p0, java.lang.String p1, long p2) {}
    public static com.android.internal.os.TimeoutRecord endingAt(int p0, java.lang.String p1, long p2) { return null; }
    public static com.android.internal.os.TimeoutRecord forAnrType(java.lang.String p0, int p1, long p2) { return null; }
    public static int timeoutKindFor(int p0) { return 0; }
    public void dump(java.io.PrintWriter p0) {}
    public void generateAndAddAnrInfo() {}
    public int getAnrId() { return 0; }
    public android.app.ApplicationExitInfo.AnrInfo getAnrInfo() { return null; }
    public int getAnrType() { return 0; }
    public int getAppExitInfoAnrSubreason() { return 0; }
    public long getEndUptimeMillis() { return 0L; }
    public java.util.UUID getErrorId() { return null; }
    public long getExpectedTimeoutMs() { return 0L; }
    public java.lang.Object getExpiredTimer() { return null; }
    public boolean getIsUserPerceptible() { return false; }
    public int getOriginationId() { return 0; }
    public int getPid() { return 0; }
    public java.lang.String getProcessName() { return null; }
    public long getRealTimeoutMs() { return 0L; }
    public java.lang.String getReason() { return null; }
    public long getWarningMs() { return 0L; }
    public void setAnrProcess(java.lang.String p0, int p1) {}
    public void setExpectedTimeoutMs(long p0) {}
    public com.android.internal.os.TimeoutRecord setExpiredTimer(java.lang.Object p0) { return null; }
    public void setIsUserPerceptible(boolean p0) {}
    public void setOriginationId(int p0) {}
    public void setRealTimeoutMs(long p0) {}
    public void setReason(java.lang.String p0) {}
    public void setWarningMs(long p0) {}
    public void traceAnr() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeoutKind {
        public static final int APP_REGISTERED = 7;
        public static final int APP_START = 10;
        public static final int BROADCAST_RECEIVER = 3;
        public static final int CONTENT_PROVIDER = 6;
        public static final int INPUT_DISPATCH_NO_FOCUSED_WINDOW = 1;
        public static final int INPUT_DISPATCH_WINDOW_UNRESPONSIVE = 2;
        public static final int JOB_SERVICE = 9;
        public static final int SERVICE_EXEC = 5;
        public static final int SERVICE_START = 4;
        public static final int SHORT_FGS_TIMEOUT = 8;
        public static final int UNSPECIFIED = 2147483647;
    }
}
