package com.android.internal.app;

public class ResolverListController {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ResolverListController";
    private boolean isComputed;
    private final android.content.Context mContext = null;
    private final int mLaunchedFromUid = 0;
    private final android.os.UserHandle mQueryIntentsAsUser = null;
    private final java.lang.String mReferrerPackage = null;
    private com.android.internal.app.AbstractResolverComparator mResolverComparator;
    private final android.content.Intent mTargetIntent = null;
    private final android.os.UserHandle mUserHandle = null;
    private final android.content.pm.PackageManager mpm = null;
    public ResolverListController(android.content.Context p0, android.content.pm.PackageManager p1, android.content.Intent p2, java.lang.String p3, int p4, android.os.UserHandle p5, android.os.UserHandle p6) {}
    public ResolverListController(android.content.Context p0, android.content.pm.PackageManager p1, android.content.Intent p2, java.lang.String p3, int p4, android.os.UserHandle p5, com.android.internal.app.AbstractResolverComparator p6, android.os.UserHandle p7) {}
    private void compute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) throws java.lang.InterruptedException {}
    private java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForIntentAsUserInternal(java.util.List<android.content.Intent> p0, android.os.UserHandle p1, int p2) { return null; }
    private static boolean isSameResolvedComponent(android.content.pm.ResolveInfo p0, com.android.internal.app.ResolverActivity.ResolvedComponentInfo p1) { return false; }
    public void addResolveListDedupe(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, android.content.Intent p1, java.util.List<android.content.pm.ResolveInfo> p2, android.content.pm.ResolveInfo p3) {}
    public void destroy() {}
    public java.util.ArrayList<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> filterIneligibleActivities(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, boolean p1) { return null; }
    public java.util.ArrayList<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> filterLowPriority(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, boolean p1) { return null; }
    public android.content.pm.ResolveInfo getLastChosen() throws android.os.RemoteException { return null; }
    public java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForIntent(boolean p0, boolean p1, boolean p2, java.util.List<android.content.Intent> p3) { return null; }
    public java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForIntentAsUser(boolean p0, boolean p1, boolean p2, java.util.List<android.content.Intent> p3, android.os.UserHandle p4) { return null; }
    public float getScore(com.android.internal.app.chooser.DisplayResolveInfo p0) { return 0.0f; }
    public float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
    public android.os.UserHandle getUserHandle() { return null; }
    boolean isComponentFiltered(android.content.ComponentName p0) { return false; }
    public boolean isComponentPinned(android.content.ComponentName p0) { return false; }
    public boolean isFixedAtTop(android.content.ComponentName p0) { return false; }
    public void setLastChosen(android.content.Intent p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException {}
    public void sort(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    public void topK(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, int p1) {}
    public void updateChooserCounts(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) {}
    public void updateModel(com.android.internal.app.chooser.TargetInfo p0) {}

    private class ComputeCallback implements com.android.internal.app.AbstractResolverComparator.AfterCompute {
        private java.util.concurrent.CountDownLatch mFinishComputeSignal;
        public ComputeCallback(com.android.internal.app.ResolverListController p0, java.util.concurrent.CountDownLatch p1) {}
        public void afterCompute() {}
    }
}
