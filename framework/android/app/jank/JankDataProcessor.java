package android.app.jank;

public class JankDataProcessor {
    private static final boolean DEBUG_LOGGING = false;
    private static final int LOG_BATCH_FREQUENCY = 50;
    private static final int MAX_IN_MEMORY_STATS = 25;
    private static final java.lang.String TAG = "JankDataProcessor";
    private int mCurrentBatchCount;
    private java.util.HashMap<java.lang.String, android.app.jank.JankDataProcessor.PendingJankStat> mPendingJankStats;
    private android.util.Pools.SimplePool<android.app.jank.JankDataProcessor.PendingJankStat> mPendingJankStatsPool;
    private java.util.ArrayList<android.app.jank.StateTracker.StateData> mPendingStates;
    private android.app.jank.StateTracker mStateTracker;
    public JankDataProcessor(android.app.jank.StateTracker p0) {}
    private void incrementBatchCountAndMaybeLogStats() {}
    private void jankDataProcessingComplete() {}
    private void mergeExistingStat(java.lang.String p0, android.app.jank.AppJankStats p1) {}
    private void mergeNewStat(java.lang.String p0, java.lang.String p1, android.app.jank.AppJankStats p2) {}
    private void recordFrameCount(android.view.SurfaceControl.JankData p0, android.app.jank.StateTracker.StateData p1, java.lang.String p2, int p3) {}
    private int widgetCategoryToInt(java.lang.String p0) { return 0; }
    private int widgetStateToInt(java.lang.String p0) { return 0; }
    public java.util.HashMap<java.lang.String, android.app.jank.JankDataProcessor.PendingJankStat> getPendingJankStats() { return null; }
    public void logMetricCounts() {}
    public void mergeJankStats(android.app.jank.AppJankStats p0, java.lang.String p1) {}
    public void processJankData(java.util.List<android.view.SurfaceControl.JankData> p0, java.lang.String p1, int p2) {}

    public static final class PendingJankStat {
        private static final int HISTOGRAM_BUCKET_COUNT = Integer.valueOf(0);
        private static final int NANOS_PER_MS = 1000000;
        private java.lang.String mActivityName;
        private final int[] mFrameOverrunBuckets = null;
        private long mJankyFrames;
        private int mRefreshRate;
        private long mTotalFrames;
        private int mUid;
        private java.lang.String mWidgetCategory;
        private java.lang.String mWidgetId;
        private java.lang.String mWidgetState;
        public long processedVsyncId;
        public PendingJankStat() {}
        private void clearHistogram() {}
        public void clearStats() {}
        public java.lang.String getActivityName() { return null; }
        public int[] getFrameOverrunBuckets() { return null; }
        public long getJankyFrames() { return 0L; }
        public long getProcessedVsyncId() { return 0L; }
        public int getRefreshRate() { return 0; }
        public long getTotalFrames() { return 0L; }
        public int getUid() { return 0; }
        public java.lang.String getWidgetCategory() { return null; }
        public java.lang.String getWidgetId() { return null; }
        public java.lang.String getWidgetState() { return null; }
        public void mergeOverrunHistogram(int[] p0) {}
        public void recordFrameOverrun(long p0) {}
        public void setActivityName(java.lang.String p0) {}
        public void setJankyFrames(long p0) {}
        public void setProcessedVsyncId(long p0) {}
        public void setRefreshRate(int p0) {}
        public void setTotalFrames(long p0) {}
        public void setUid(int p0) {}
        public void setWidgetCategory(java.lang.String p0) {}
        public void setWidgetId(java.lang.String p0) {}
        public void setWidgetState(java.lang.String p0) {}
    }
}
