package com.android.internal.compat;

public class ChangeReporter {
    private static final java.util.function.Function<java.lang.Integer, java.util.Set<com.android.internal.compat.ChangeReporter.ChangeReport>> NEW_CHANGE_REPORT_SET = null;
    public static final int SOURCE_APP_PROCESS = 1;
    public static final int SOURCE_SYSTEM_SERVER = 2;
    public static final int SOURCE_UNKNOWN_SOURCE = 0;
    public static final int STATE_DISABLED = 2;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_LOGGED = 3;
    public static final int STATE_UNKNOWN_STATE = 0;
    private static final java.lang.String TAG = "CompatChangeReporter";
    private boolean mDebugLogAll;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.android.internal.compat.ChangeReporter.ChangeReport>> mReportedChanges = null;
    private int mSource;
    public ChangeReporter(int p0) {}
    private boolean checkAndSetIsAlreadyReported(int p0, com.android.internal.compat.ChangeReporter.ChangeReport p1) { return false; }
    private void debugLog(int p0, long p1, int p2) {}
    private boolean isAlreadyReported(int p0, com.android.internal.compat.ChangeReporter.ChangeReport p1) { return false; }
    private static java.lang.String stateToString(int p0) { return null; }
    public boolean isAlreadyReported(int p0, long p1, int p2) { return false; }
    public void reportChange(int p0, long p1, int p2, boolean p3) {}
    public void reportChange(int p0, long p1, int p2, boolean p3, boolean p4) {}
    public void resetReportedChanges(int p0) {}
    public boolean shouldWriteToDebug(int p0, long p1, int p2) { return false; }
    public boolean shouldWriteToStatsLog(boolean p0, boolean p1) { return false; }
    public void startDebugLogAll() {}
    public void stopDebugLogAll() {}

    private static final class ChangeReport {
        long mChangeId;
        int mState;
        ChangeReport(long p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
