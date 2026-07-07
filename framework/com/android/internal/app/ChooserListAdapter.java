package com.android.internal.app;

public class ChooserListAdapter extends com.android.internal.app.ResolverListAdapter {
    public static final float CALLER_TARGET_SCORE_BOOST = 900.0f;
    private static final boolean DEBUG = false;
    private static final int MAX_CHOOSER_TARGETS_PER_APP = 2;
    private static final int MAX_SUGGESTED_APP_TARGETS = 4;
    public static final int NO_POSITION = -1;
    private static final float PINNED_SHORTCUT_TARGET_SCORE_BOOST = 1000.0f;
    public static final float SHORTCUT_TARGET_SCORE_BOOST = 90.0f;
    private static final java.lang.String TAG = "ChooserListAdapter";
    public static final int TARGET_BAD = -1;
    public static final int TARGET_CALLER = 0;
    public static final int TARGET_SERVICE = 1;
    public static final int TARGET_STANDARD = 2;
    public static final int TARGET_STANDARD_AZ = 3;
    private android.app.prediction.AppPredictor mAppPredictor;
    private android.app.prediction.AppPredictor.Callback mAppPredictorCallback;
    private com.android.internal.app.ResolverAppPredictorCallback mAppPredictorCallbackWrapper;
    private boolean mApplySharingAppLimits;
    private final com.android.internal.app.ChooserActivity.BaseChooserTargetComparator mBaseTargetComparator = null;
    private final java.util.List<com.android.internal.app.chooser.DisplayResolveInfo> mCallerTargets = null;
    private final com.android.internal.app.ChooserActivityLogger mChooserActivityLogger = null;
    private final com.android.internal.app.ChooserListAdapter.ChooserListCommunicator mChooserListCommunicator = null;
    private boolean mEnableStackedApps;
    private final java.util.Map<com.android.internal.app.chooser.SelectableTargetInfo, com.android.internal.app.ChooserListAdapter.LoadDirectShareIconTask> mIconLoaders = null;
    private final android.os.UserHandle mInitialIntentsUserSpace = null;
    private final int mMaxShortcutTargetsPerApp = 0;
    private int mNumShortcutResults;
    private java.util.function.Consumer<com.android.internal.app.chooser.DisplayResolveInfo> mOnIconLoadedListener;
    private final android.view.View.OnLayoutChangeListener mPinTextSpacingListener = null;
    private com.android.internal.app.chooser.ChooserTargetInfo mPlaceHolderTargetInfo;
    private final com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator mSelectableTargetInfoCommunicator = null;
    private final java.util.List<com.android.internal.app.chooser.ChooserTargetInfo> mServiceTargets = null;
    private java.util.List<com.android.internal.app.chooser.DisplayResolveInfo> mSortedList;
    public ChooserListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, com.android.internal.app.ResolverListController p5, com.android.internal.app.ChooserListAdapter.ChooserListCommunicator p6, com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator p7, android.content.pm.PackageManager p8, com.android.internal.app.ChooserActivityLogger p9, android.os.UserHandle p10) { super(null, null, null, null, false, null, null, false, null); }
    private void createPlaceHolders() {}
    private boolean insertServiceTarget(com.android.internal.app.chooser.ChooserTargetInfo p0) { return false; }
    private void loadDirectShareIcon(com.android.internal.app.chooser.SelectableTargetInfo p0) {}
    public void addServiceResults(com.android.internal.app.chooser.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, int p2, java.util.Map<android.service.chooser.ChooserTarget, android.content.pm.ShortcutInfo> p3) {}
    protected boolean alwaysShowSubLabel() { return false; }
    public void completeServiceTargetLoading() {}
    protected com.android.internal.app.ChooserListAdapter.LoadDirectShareIconTask createLoadDirectShareIconTask(com.android.internal.app.chooser.SelectableTargetInfo p0) { return null; }
    android.os.AsyncTask<java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo>, java.lang.Void, java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo>> createSortingTask(boolean p0) { return null; }
    public void destroyAppPredictor() {}
    int getAlphaTargetCount() { return 0; }
    android.app.prediction.AppPredictor getAppPredictor() { return null; }
    public float getBaseScore(com.android.internal.app.chooser.DisplayResolveInfo p0, int p1) { return 0.0f; }
    public int getCallerTargetCount() { return 0; }
    public android.service.chooser.ChooserTarget getChooserTargetForValue(int p0) { return null; }
    public int getCount() { return 0; }
    public com.android.internal.app.chooser.TargetInfo getItem(int p0) { return null; }
    int getNumServiceTargetsForExpand() { return 0; }
    public int getPositionTargetType(int p0) { return 0; }
    public int getRankedTargetCount() { return 0; }
    public int getSelectableServiceTargetCount() { return 0; }
    public int getServiceTargetCount() { return 0; }
    public java.util.List<com.android.internal.app.chooser.ChooserTargetInfo> getSurfacedTargetInfo() { return null; }
    public int getUnfilteredCount() { return 0; }
    public void handlePackagesChanged() {}
    protected void onBindView(android.view.View p0, com.android.internal.app.chooser.TargetInfo p1, int p2) {}
    android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
    protected void onIconLoaded(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
    public void setAppPredictor(android.app.prediction.AppPredictor p0) {}
    public void setAppPredictorCallback(android.app.prediction.AppPredictor.Callback p0, com.android.internal.app.ResolverAppPredictorCallback p1) {}
    public void setOnIconLoadedListener(java.util.function.Consumer<com.android.internal.app.chooser.DisplayResolveInfo> p0) {}
    protected boolean shouldAddResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0) { return false; }
    public com.android.internal.app.chooser.TargetInfo targetInfoForPosition(int p0, boolean p1) { return null; }
    void updateAlphabeticalList() {}

    public static interface ChooserListCommunicator extends com.android.internal.app.ResolverListAdapter.ResolverListCommunicator {
        public int getMaxRankedTargets();
        public boolean isSendAction(android.content.Intent p0);
        public boolean shouldShowContentPreview();
        public boolean shouldShowServiceTargets();
    }

    public class LoadDirectShareIconTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        private final com.android.internal.app.chooser.SelectableTargetInfo mTargetInfo = null;
        private LoadDirectShareIconTask(com.android.internal.app.ChooserListAdapter p0, com.android.internal.app.chooser.SelectableTargetInfo p1) { super(); }
        protected java.lang.Boolean doInBackground(java.lang.Void... p0) { return null; }
        public void loadIcon() {}
        protected void onPostExecute(java.lang.Boolean p0) {}
    }
}
