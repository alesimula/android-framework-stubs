package com.android.internal.os;

class StatsdHiddenApiUsageLogger {
    private static final com.android.internal.os.StatsdHiddenApiUsageLogger sInstance = null;
    private int mHiddenApiAccessLogSampleRate;
    private int mHiddenApiAccessStatslogSampleRate;
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    StatsdHiddenApiUsageLogger() {}
    static com.android.internal.os.StatsdHiddenApiUsageLogger getInstance() { return null; }
    private void logUsage(java.lang.String p0, java.lang.String p1, int p2, boolean p3) {}
    private void newLogUsage(java.lang.String p0, int p1, boolean p2) {}
    static void setHiddenApiAccessLogSampleRates(int p0, int p1) {}
    public void hiddenApiUsed(int p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) {}
}
