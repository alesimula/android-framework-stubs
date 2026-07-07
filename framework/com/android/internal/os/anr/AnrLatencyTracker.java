package com.android.internal.os.anr;

public class AnrLatencyTracker implements java.lang.AutoCloseable {
    private static final java.util.concurrent.atomic.AtomicInteger sNextAnrRecordPlacedOnQueueCookieGenerator = null;
    private long mAMSLockLastTryAcquireStart;
    private long mAMSLockTotalContention;
    private long mAnrProcessingStartedUptime;
    private int mAnrQueueSize;
    private long mAnrRecordLastTryAcquireStart;
    private long mAnrRecordLockTotalContention;
    private final int mAnrRecordPlacedOnQueueCookie = 0;
    private long mAnrRecordPlacedOnQueueUptime;
    private long mAnrTriggerUptime;
    private int mAnrType;
    private long mAppNotRespondingStartUptime;
    private long mCopyingFirstPidDuration;
    private long mCopyingFirstPidStartUptime;
    private boolean mCopyingFirstPidSucceeded;
    private long mCriticalEventLogTotalLatency;
    private long mCriticalEventLoglastCallUptime;
    private long mCurrentPsiStateLastCallUptime;
    private long mCurrentPsiStateTotalLatency;
    private long mDumpStackTracesStartUptime;
    private final java.util.concurrent.atomic.AtomicInteger mDumpedProcessesCount = null;
    private long mEarlyDumpExecutorPidCount;
    private long mEarlyDumpRequestSubmissionUptime;
    private volatile int mEarlyDumpStatus;
    private long mEndUptime;
    private long mExtraPidsDumpingDuration;
    private long mExtraPidsDumpingStartUptime;
    private long mFirstPidsDumpingDuration;
    private long mFirstPidsDumpingStartUptime;
    private long mGlobalLockLastTryAcquireStart;
    private long mGlobalLockTotalContention;
    private boolean mIsPushed;
    private boolean mIsSkipped;
    private long mNativePidsDumpingDuration;
    private long mNativePidsDumpingStartUptime;
    private long mNotifyAppUnresponsiveDuration;
    private long mNotifyAppUnresponsiveStartUptime;
    private long mNotifyWindowUnresponsiveDuration;
    private long mNotifyWindowUnresponsiveStartUptime;
    private long mPidLockLastTryAcquireStart;
    private long mPidLockTotalContention;
    private long mPreDumpIfLockTooSlowDuration;
    private long mPreDumpIfLockTooSlowStartUptime;
    private long mProcLockLastTryAcquireStart;
    private long mProcLockTotalContention;
    private long mProcessCpuTrackerMethodsLastCallUptime;
    private long mProcessCpuTrackerMethodsTotalLatency;
    private volatile long mTempFileDumpingDuration;
    private volatile long mTempFileDumpingStartUptime;
    private long mUpdateCpuStatsNowLastCallUptime;
    private long mUpdateCpuStatsNowTotalLatency;
    public AnrLatencyTracker(int p0, long p1) {}
    private void anrSkipped(java.lang.String p0) {}
    private static int timeoutKindToAnrType(int p0) { return 0; }
    public void anrProcessingEnded() {}
    public void anrProcessingStarted() {}
    public void anrRecordPlacingOnQueueWithSize(int p0) {}
    public void anrRecordsQueueSizeWhenPopped(int p0) {}
    public void anrSkippedDumpStackTraces() {}
    public void anrSkippedProcessErrorStateRecordAppNotResponding() {}
    public void appNotRespondingEnded() {}
    public void appNotRespondingStarted() {}
    public void close() {}
    public void copyingFirstPidEnded(boolean p0) {}
    public void copyingFirstPidStarted() {}
    public void criticalEventLogEnded() {}
    public void criticalEventLogStarted() {}
    public void currentPsiStateCalled() {}
    public void currentPsiStateReturned() {}
    public java.lang.String dumpAsCommaSeparatedArrayWithHeader() { return null; }
    public void dumpStackTracesEnded() {}
    public void dumpStackTracesStarted() {}
    public void dumpStackTracesTempFileCreationFailed() {}
    public void dumpStackTracesTempFileEnded() {}
    public void dumpStackTracesTempFileStarted() {}
    public void dumpStackTracesTempFileTimedOut() {}
    public void dumpingExtraPidsEnded() {}
    public void dumpingExtraPidsStarted() {}
    public void dumpingFirstPidsEnded() {}
    public void dumpingFirstPidsStarted() {}
    public void dumpingNativePidsEnded() {}
    public void dumpingNativePidsStarted() {}
    public void dumpingPidEnded() {}
    public void dumpingPidStarted(int p0) {}
    public void earlyDumpRequestSubmittedWithSize(int p0) {}
    public long getUptimeMillis() { return 0L; }
    public void nativePidCollectionEnded() {}
    public void nativePidCollectionStarted() {}
    public void notifyAppUnresponsiveEnded() {}
    public void notifyAppUnresponsiveStarted() {}
    public void notifyWindowUnresponsiveEnded() {}
    public void notifyWindowUnresponsiveStarted() {}
    public void preDumpIfLockTooSlowEnded() {}
    public void preDumpIfLockTooSlowStarted() {}
    public void processCpuTrackerMethodsCalled() {}
    public void processCpuTrackerMethodsReturned() {}
    public void pushAtom() {}
    public void updateCpuStatsNowCalled() {}
    public void updateCpuStatsNowReturned() {}
    public void waitingOnAMSLockEnded() {}
    public void waitingOnAMSLockStarted() {}
    public void waitingOnAnrRecordLockEnded() {}
    public void waitingOnAnrRecordLockStarted() {}
    public void waitingOnGlobalLockEnded() {}
    public void waitingOnGlobalLockStarted() {}
    public void waitingOnPidLockEnded() {}
    public void waitingOnPidLockStarted() {}
    public void waitingOnProcLockEnded() {}
    public void waitingOnProcLockStarted() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface EarlyDumpStatus {
        public static final int FAILED_TO_CREATE_FILE = 3;
        public static final int SUCCEEDED = 2;
        public static final int TIMED_OUT = 4;
        public static final int UNKNOWN = 1;
    }
}
