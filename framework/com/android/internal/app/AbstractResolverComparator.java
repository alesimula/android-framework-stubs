package com.android.internal.app;

public abstract class AbstractResolverComparator implements java.util.Comparator<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> {
    private static final boolean DEBUG = false;
    private static final int NUM_OF_TOP_ANNOTATIONS_TO_USE = 3;
    static final int RANKER_RESULT_TIMEOUT = 1;
    static final int RANKER_SERVICE_RESULT = 0;
    private static final java.lang.String TAG = "AbstractResolverComp";
    private static final int WATCHDOG_TIMEOUT_MILLIS = 500;
    protected com.android.internal.app.AbstractResolverComparator.AfterCompute mAfterCompute;
    protected java.lang.String[] mAnnotations;
    private final java.util.Comparator<android.content.pm.ResolveInfo> mAzComparator = null;
    private com.android.internal.app.ChooserActivityLogger mChooserActivityLogger;
    protected java.lang.String mContentType;
    protected final android.os.Handler mHandler = null;
    private final boolean mHttp = false;
    protected final java.util.Map<android.os.UserHandle, android.content.pm.PackageManager> mPmMap = null;
    protected final java.util.Map<android.os.UserHandle, android.app.usage.UsageStatsManager> mUsmMap = null;
    public AbstractResolverComparator(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public AbstractResolverComparator(android.content.Context p0, android.content.Intent p1, java.util.List<android.os.UserHandle> p2) {}
    private void getContentAnnotations(android.content.Intent p0) {}
    protected final void afterCompute() {}
    void beforeCompute() {}
    abstract int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1);
    public final int compare(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0, com.android.internal.app.ResolverActivity.ResolvedComponentInfo p1) { return 0; }
    final void compute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    void destroy() {}
    abstract void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0);
    com.android.internal.app.ChooserActivityLogger getChooserActivityLogger() { return null; }
    abstract float getScore(com.android.internal.app.chooser.TargetInfo p0);
    abstract void handleResultMessage(android.os.Message p0);
    void setCallBack(com.android.internal.app.AbstractResolverComparator.AfterCompute p0) {}
    void setChooserActivityLogger(com.android.internal.app.ChooserActivityLogger p0) {}
    final void updateChooserCounts(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) {}
    void updateModel(com.android.internal.app.chooser.TargetInfo p0) {}

    static interface AfterCompute {
        public void afterCompute();
    }

    class AzInfoComparator implements java.util.Comparator<android.content.pm.ResolveInfo> {
        java.text.Collator mCollator;
        AzInfoComparator(com.android.internal.app.AbstractResolverComparator p0, android.content.Context p1) {}
        public int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    }
}
