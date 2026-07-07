package com.android.internal.app;

class AppPredictionServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    private static final java.lang.String TAG = "APSResolverComparator";
    private final android.app.prediction.AppPredictor mAppPredictor = null;
    private com.android.internal.app.ResolverComparatorModel mComparatorModel;
    private final android.content.Context mContext = null;
    private final android.content.Intent mIntent = null;
    private final com.android.internal.app.AppPredictionServiceResolverComparator.ModelBuilder mModelBuilder = null;
    private final java.lang.String mReferrerPackage = null;
    private com.android.internal.app.ResolverRankerServiceResolverComparator mResolverRankerService;
    private com.android.internal.app.ResolverAppPredictorCallback mSortingCallback;
    private final android.os.UserHandle mUser = null;
    AppPredictionServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, android.app.prediction.AppPredictor p3, android.os.UserHandle p4, com.android.internal.app.ChooserActivityLogger p5) { super((android.content.Context)null, (android.content.Intent)null, (android.os.UserHandle)null); }
    private void handleResult(java.util.List<android.app.prediction.AppTarget> p0) {}
    private void setupFallbackModel(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    void destroy() {}
    void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
    void handleResultMessage(android.os.Message p0) {}
    void updateModel(com.android.internal.app.chooser.TargetInfo p0) {}

    static class AppPredictionServiceComparatorModel implements com.android.internal.app.ResolverComparatorModel {
        private final android.app.prediction.AppPredictor mAppPredictor = null;
        private final java.util.Map<android.content.ComponentName, java.lang.Integer> mTargetRanks = null;
        private final android.os.UserHandle mUser = null;
        AppPredictionServiceComparatorModel(android.app.prediction.AppPredictor p0, android.os.UserHandle p1, java.util.Map<android.content.ComponentName, java.lang.Integer> p2) {}
        public java.util.Comparator<android.content.pm.ResolveInfo> getComparator() { return null; }
        public float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
        public void notifyOnTargetSelected(com.android.internal.app.chooser.TargetInfo p0) {}
    }

    static class ModelBuilder {
        private final android.app.prediction.AppPredictor mAppPredictor = null;
        private final android.os.UserHandle mUser = null;
        ModelBuilder(android.app.prediction.AppPredictor p0, android.os.UserHandle p1) {}
        private com.android.internal.app.ResolverComparatorModel adaptLegacyResolverComparatorToComparatorModel(com.android.internal.app.AbstractResolverComparator p0) { return null; }
        private java.util.Map<android.content.ComponentName, java.lang.Integer> buildTargetRanksMapFromSortedTargets(java.util.List<android.app.prediction.AppTarget> p0) { return null; }
        com.android.internal.app.ResolverComparatorModel buildFallbackModel(com.android.internal.app.ResolverRankerServiceResolverComparator p0) { return null; }
        com.android.internal.app.ResolverComparatorModel buildFromRankedList(java.util.List<android.app.prediction.AppTarget> p0) { return null; }
    }
}
