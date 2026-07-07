package com.android.internal.app;

class ResolverRankerServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    private static final int CONNECTION_COST_TIMEOUT_MILLIS = 200;
    private static final boolean DEBUG = false;
    private static final float RECENCY_MULTIPLIER = 2.0f;
    private static final long RECENCY_TIME_PERIOD = 43200000L;
    private static final java.lang.String TAG = "RRSResolverComparator";
    private static final long USAGE_STATS_PERIOD = 604800000L;
    private java.lang.String mAction;
    private final java.text.Collator mCollator = null;
    private com.android.internal.app.ResolverRankerServiceResolverComparator.ResolverRankerServiceComparatorModel mComparatorModel;
    private java.util.concurrent.CountDownLatch mConnectSignal;
    private com.android.internal.app.ResolverRankerServiceResolverComparator.ResolverRankerServiceConnection mConnection;
    private android.content.Context mContext;
    private final long mCurrentTime = 0L;
    private final java.lang.Object mLock = null;
    private android.service.resolver.IResolverRankerService mRanker;
    private android.content.ComponentName mRankerServiceName;
    private final java.lang.String mReferrerPackage = null;
    private android.content.ComponentName mResolvedRankerName;
    private final long mSinceTime = 0L;
    private final java.util.Map<android.os.UserHandle, java.util.Map<java.lang.String, android.app.usage.UsageStats>> mStatsPerUser = null;
    private java.util.ArrayList<android.service.resolver.ResolverTarget> mTargets;
    private final java.util.Map<android.os.UserHandle, java.util.LinkedHashMap<android.content.ComponentName, android.service.resolver.ResolverTarget>> mTargetsDictPerUser = null;
    public ResolverRankerServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, com.android.internal.app.AbstractResolverComparator.AfterCompute p3, com.android.internal.app.ChooserActivityLogger p4, android.os.UserHandle p5) { super((android.content.Context)null, (android.content.Intent)null, (android.os.UserHandle)null); }
    public ResolverRankerServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, com.android.internal.app.AbstractResolverComparator.AfterCompute p3, com.android.internal.app.ChooserActivityLogger p4, java.util.List<android.os.UserHandle> p5) { super((android.content.Context)null, (android.content.Intent)null, (android.os.UserHandle)null); }
    private void addDefaultSelectProbability(android.service.resolver.ResolverTarget p0) {}
    private com.android.internal.app.ResolverRankerServiceResolverComparator.ResolverRankerServiceComparatorModel buildUpdatedModel() { return null; }
    private void initRanker(android.content.Context p0) {}
    static boolean isPersistentProcess(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0) { return false; }
    private void predictSelectProbabilities(java.util.List<android.service.resolver.ResolverTarget> p0) {}
    private android.content.Intent resolveRankerService() { return null; }
    private void setFeatures(android.service.resolver.ResolverTarget p0, float p1, float p2, float p3, float p4) {}
    void beforeCompute() {}
    public int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    public void destroy() {}
    public void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    public float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
    public void handleResultMessage(android.os.Message p0) {}
    public void updateModel(com.android.internal.app.chooser.TargetInfo p0) {}

    private static class ResolverRankerResultCallback extends android.service.resolver.IResolverRankerResult.Stub {
        private final java.lang.ref.WeakReference<android.os.Handler> mHandlerRef = null;
        private final java.lang.Object mLock = null;
        private ResolverRankerResultCallback(java.lang.Object p0, android.os.Handler p1) { super(); }
        public void sendResult(java.util.List<android.service.resolver.ResolverTarget> p0) throws android.os.RemoteException {}
    }

    static class ResolverRankerServiceComparatorModel implements com.android.internal.app.ResolverComparatorModel {
        private final boolean mAnnotationsUsed = false;
        private final java.text.Collator mCollator = null;
        private final java.util.Map<android.os.UserHandle, android.content.pm.PackageManager> mPmMap = null;
        private final android.service.resolver.IResolverRankerService mRanker = null;
        private final android.content.ComponentName mRankerServiceName = null;
        private final java.util.Map<android.os.UserHandle, java.util.Map<java.lang.String, android.app.usage.UsageStats>> mStatsPerUser = null;
        private final java.util.List<android.service.resolver.ResolverTarget> mTargets = null;
        private final java.util.Map<android.os.UserHandle, java.util.LinkedHashMap<android.content.ComponentName, android.service.resolver.ResolverTarget>> mTargetsDictPerUser = null;
        ResolverRankerServiceComparatorModel(java.util.Map<android.os.UserHandle, java.util.Map<java.lang.String, android.app.usage.UsageStats>> p0, java.util.Map<android.os.UserHandle, java.util.LinkedHashMap<android.content.ComponentName, android.service.resolver.ResolverTarget>> p1, java.util.List<android.service.resolver.ResolverTarget> p2, java.text.Collator p3, android.service.resolver.IResolverRankerService p4, android.content.ComponentName p5, boolean p6, java.util.Map<android.os.UserHandle, android.content.pm.PackageManager> p7) {}
        private android.service.resolver.ResolverTarget getActivityResolverTargetForUser(android.content.pm.ActivityInfo p0, android.os.UserHandle p1) { return null; }
        private void logMetrics(int p0) {}
        public java.util.Comparator<android.content.pm.ResolveInfo> getComparator() { return null; }
        public float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
        public void notifyOnTargetSelected(com.android.internal.app.chooser.TargetInfo p0) {}
    }

    private class ResolverRankerServiceConnection implements android.content.ServiceConnection {
        private final java.util.concurrent.CountDownLatch mConnectSignal = null;
        public final android.service.resolver.IResolverRankerResult resolverRankerResult = null;
        public ResolverRankerServiceConnection(com.android.internal.app.ResolverRankerServiceResolverComparator p0, java.util.concurrent.CountDownLatch p1) {}
        public void destroy() {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
