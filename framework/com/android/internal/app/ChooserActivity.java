package com.android.internal.app;

public class ChooserActivity extends com.android.internal.app.ResolverActivity implements com.android.internal.app.ChooserListAdapter.ChooserListCommunicator, com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator {
    public static final java.lang.String APP_PREDICTION_INTENT_FILTER_KEY = "intent_filter";
    private static final int APP_PREDICTION_SHARE_TARGET_QUERY_PACKAGE_LIMIT = 20;
    private static final java.lang.String APP_PREDICTION_SHARE_UI_SURFACE = "share";
    private static final java.lang.String CHIP_ICON_METADATA_KEY = "android.service.chooser.chip_icon";
    private static final java.lang.String CHIP_LABEL_METADATA_KEY = "android.service.chooser.chip_label";
    public static final java.lang.String CHOOSER_TARGET = "chooser_target";
    protected static final int CONTENT_PREVIEW_FILE = 2;
    protected static final int CONTENT_PREVIEW_IMAGE = 1;
    protected static final int CONTENT_PREVIEW_TEXT = 3;
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_IS_NEARBY_SHARE_FIRST_TARGET_IN_RANKED_APP = false;
    private static final int DEFAULT_LIST_VIEW_UPDATE_DELAY_MS = 0;
    private static final int DEFAULT_SALT_EXPIRATION_DAYS = 7;
    private static final float DIRECT_SHARE_EXPANSION_RATE = 0.7799999713897705f;
    public static final java.lang.String EXTRA_PRIVATE_RETAIN_IN_ON_STOP = "com.android.internal.app.ChooserActivity.EXTRA_PRIVATE_RETAIN_IN_ON_STOP";
    public static final java.lang.String FIRST_IMAGE_PREVIEW_TRANSITION_NAME = "screenshot_preview_image";
    private static final java.lang.String IMAGE_EDITOR_SHARED_ELEMENT = "screenshot_preview_image";
    public static final java.lang.String LAUNCH_LOCATION_DIRECT_SHARE = "direct_share";
    private static final int MAX_EXTRA_CHOOSER_TARGETS = 2;
    private static final int MAX_EXTRA_INITIAL_INTENTS = 2;
    private static final int MAX_LOG_RANK_POSITION = 12;
    private static final int NO_DIRECT_SHARE_ANIM_IN_MILLIS = 200;
    private static final java.lang.String PINNED_SHARED_PREFS_NAME = "chooser_pin_settings";
    private static final java.lang.String PLURALS_COUNT = "count";
    private static final java.lang.String PLURALS_FILE_NAME = "file_name";
    private static final java.lang.String PREF_NUM_SHEET_EXPANSIONS = "pref_num_sheet_expansions";
    private static final int SCROLL_STATUS_IDLE = 0;
    private static final int SCROLL_STATUS_SCROLLING_HORIZONTAL = 2;
    private static final int SCROLL_STATUS_SCROLLING_VERTICAL = 1;
    public static final int SELECTION_TYPE_APP = 2;
    public static final int SELECTION_TYPE_COPY = 4;
    public static final int SELECTION_TYPE_EDIT = 6;
    public static final int SELECTION_TYPE_NEARBY = 5;
    public static final int SELECTION_TYPE_SERVICE = 1;
    public static final int SELECTION_TYPE_STANDARD = 3;
    private static final java.lang.String SHARED_TEXT_KEY = "shared_text";
    private static final java.lang.String SHORTCUT_TARGET = "shortcut_target";
    private static final java.lang.String TAG = "ChooserActivity";
    private static final java.lang.String TARGET_DETAILS_FRAGMENT_TAG = "targetDetailsFragment";
    public static final int TARGET_TYPE_CHOOSER_TARGET = 1;
    public static final int TARGET_TYPE_DEFAULT = 0;
    public static final int TARGET_TYPE_SHORTCUTS_FROM_PREDICTION_SERVICE = 3;
    public static final int TARGET_TYPE_SHORTCUTS_FROM_SHORTCUT_MANAGER = 2;
    private static final int URI_PERMISSION_INTENT_FLAGS = 195;
    private static final boolean USE_PREDICTION_MANAGER_FOR_SHARE_ACTIVITIES = true;
    private android.service.chooser.ChooserTarget[] mCallerChooserTargets;
    protected com.android.internal.app.ChooserActivityLogger mChooserActivityLogger;
    private final com.android.internal.app.ChooserActivity.ChooserHandler mChooserHandler = null;
    protected com.android.internal.app.ChooserMultiProfilePagerAdapter mChooserMultiProfilePagerAdapter;
    private long mChooserShownTime;
    private android.content.IntentSender mChosenComponentSender;
    private android.view.View mContentView;
    private int mCurrAvailableWidth;
    private java.util.Map<android.service.chooser.ChooserTarget, android.app.prediction.AppTarget> mDirectShareAppTargetCache;
    private java.util.Map<android.service.chooser.ChooserTarget, android.content.pm.ShortcutInfo> mDirectShareShortcutInfoCache;
    private final com.android.internal.app.ChooserActivity.EnterTransitionAnimationDelegate mEnterTransitionAnimationDelegate = null;
    private android.content.ComponentName[] mFilteredComponentNames;
    private boolean mIsAppPredictorComponentAvailable;
    private boolean mIsNearbyShareFirstTargetInRankedApp;
    protected boolean mIsSuccessfullySelected;
    private android.graphics.Insets mLastAppliedInsets;
    private int mLastNumberOfChildren;
    int mListViewUpdateDelayMs;
    private int mMaxHashSaltDays;
    private int mMaxTargetsPerRow;
    protected com.android.internal.logging.MetricsLogger mMetricsLogger;
    private android.app.prediction.AppPredictor mPersonalAppPredictor;
    private android.content.SharedPreferences mPinnedSharedPrefs;
    private com.android.internal.app.ChooserActivity.ContentPreviewCoordinator mPreviewCoord;
    private long mQueriedSharingShortcutsTimeMs;
    private android.content.Intent mReferrerFillInIntent;
    private android.content.IntentSender mRefinementIntentSender;
    private com.android.internal.app.ChooserActivity.RefinementResultReceiver mRefinementResultReceiver;
    private boolean mRemoveSharedElements;
    private android.os.Bundle mReplacementExtras;
    private int mScrollStatus;
    private boolean mShouldDisplayLandscape;
    private android.app.prediction.AppPredictor mWorkAppPredictor;
    public ChooserActivity() { super(); }
    private void addActionButton(android.view.ViewGroup p0, android.widget.Button p1) {}
    private void adjustPreviewWidth(int p0, android.view.View p1) {}
    private int calculateDrawerOffset(int p0, int p1, com.android.internal.widget.RecyclerView p2, com.android.internal.app.ChooserActivity.ChooserGridAdapter p3) { return 0; }
    private android.widget.Button createActionButton(android.graphics.drawable.Drawable p0, java.lang.CharSequence p1, android.view.View.OnClickListener p2) { return null; }
    private android.app.prediction.AppPredictor createAppPredictor(android.os.UserHandle p0) { return null; }
    private com.android.internal.app.ResolverAppPredictorCallback createAppPredictorCallback(com.android.internal.app.ChooserListAdapter p0) { return null; }
    private com.android.internal.app.ChooserMultiProfilePagerAdapter createChooserMultiProfilePagerAdapterForOneProfile(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private com.android.internal.app.ChooserMultiProfilePagerAdapter createChooserMultiProfilePagerAdapterForTwoProfiles(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private android.widget.Button createCopyButton() { return null; }
    private android.widget.Button createEditButton(android.content.Intent p0) { return null; }
    private android.widget.Button createNearbyButton(android.content.Intent p0) { return null; }
    private android.view.ViewGroup displayContentPreview(int p0, android.content.Intent p1, android.view.LayoutInflater p2, android.view.ViewGroup p3) { return null; }
    private android.view.ViewGroup displayFileContentPreview(android.content.Intent p0, android.view.LayoutInflater p1, android.view.ViewGroup p2) { return null; }
    private android.view.ViewGroup displayImageContentPreview(android.content.Intent p0, android.view.LayoutInflater p1, android.view.ViewGroup p2) { return null; }
    private android.view.ViewGroup displayTextContentPreview(android.content.Intent p0, android.view.LayoutInflater p1, android.view.ViewGroup p2) { return null; }
    private com.android.internal.app.ChooserActivity.FileInfo extractFileInfo(android.net.Uri p0, android.content.ContentResolver p1) { return null; }
    private java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> filterShortcutsByTargetComponentName(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, android.content.ComponentName p1) { return null; }
    private int findPreferredContentPreview(android.content.Intent p0, android.content.ContentResolver p1) { return 0; }
    private int findPreferredContentPreview(android.net.Uri p0, android.content.ContentResolver p1) { return 0; }
    private android.view.View findRootView() { return null; }
    private int findSelectedProfile() { return 0; }
    private android.view.ViewGroup getActiveEmptyStateView() { return null; }
    private android.app.prediction.AppPredictor getAppPredictorForDirectShareIfEnabled(android.os.UserHandle p0) { return null; }
    private android.app.prediction.AppPredictor getAppPredictorForShareActivitiesIfEnabled(android.os.UserHandle p0) { return null; }
    private android.view.View getFirstVisibleImgPreviewView() { return null; }
    private int getNumSheetExpansions() { return 0; }
    static android.content.SharedPreferences getPinnedSharedPrefs(android.content.Context p0) { return null; }
    private int getProfileForUser(android.os.UserHandle p0) { return 0; }
    private int getRankedPosition(com.android.internal.app.chooser.SelectableTargetInfo p0) { return 0; }
    private android.content.IntentFilter getTargetIntentFilter() { return null; }
    private android.app.IUriGrantsManager getUriGrantsManager() { return null; }
    private void handleLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    private void handlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    private void handleScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    private boolean hasValidIcon(android.service.chooser.ChooserTarget p0) { return false; }
    private void hideStickyContentPreview() {}
    private void incrementNumSheetExpansions() {}
    private boolean isAppPredictionServiceAvailable() { return false; }
    private boolean isPackageEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    private boolean isStickyContentPreviewShowing() { return false; }
    private void loadFileUriIntoView(android.net.Uri p0, android.view.View p1) {}
    private void logActionShareWithPreview() {}
    private void logContentPreviewWarning(android.net.Uri p0) {}
    private void logDirectShareTargetReceived(int p0) {}
    private boolean maybeCancelFinishAnimation() { return false; }
    private void maybeQueryAdditionalPostProcessingTargets(com.android.internal.app.ChooserListAdapter p0) {}
    private void modifyTargetIntent(android.content.Intent p0) {}
    private void onCopyButtonClicked(android.view.View p0) {}
    private void populateTextContent(android.os.Bundle p0) {}
    private static android.service.chooser.ChooserTarget removeIcon(android.service.chooser.ChooserTarget p0) { return null; }
    public static java.util.List<android.content.Intent> sanitizePayloadIntents(java.util.List<android.content.Intent> p0) { return null; }
    private void sendClickToAppPredictor(com.android.internal.app.chooser.TargetInfo p0) {}
    private void sendImpressionToAppPredictor(com.android.internal.app.chooser.TargetInfo p0, com.android.internal.app.ChooserListAdapter p1) {}
    private void sendShareShortcutInfoList(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, com.android.internal.app.ChooserListAdapter p1, java.util.List<android.app.prediction.AppTarget> p2, android.os.UserHandle p3) {}
    private void setHorizontalScrollingEnabled(boolean p0) {}
    private void setVerticalScrollEnabled(boolean p0) {}
    private android.app.prediction.AppPredictor setupAppPredictorForUser(android.os.UserHandle p0, android.app.prediction.AppPredictor.Callback p1) { return null; }
    private void setupScrollListener() {}
    private boolean shouldDisplayLandscape(int p0) { return false; }
    private boolean shouldNearbyShareBeFirstInRankedRow() { return false; }
    private boolean shouldNearbyShareBeIncludedAsActionButton() { return false; }
    private boolean shouldQueryShortcutManager(android.os.UserHandle p0) { return false; }
    private boolean shouldShowExtraRow(int p0) { return false; }
    private boolean shouldShowStickyContentPreview() { return false; }
    private boolean shouldShowStickyContentPreviewNoOrientationCheck() { return false; }
    private void showStickyContentPreview() {}
    private void startFinishAnimation() {}
    private void updateLayoutWidth(int p0, int p1, android.view.View p2) {}
    private void updateStickyContentPreview() {}
    private void updateTabPadding() {}
    private static boolean validForContentPreview(android.net.Uri p0) throws java.lang.SecurityException { return false; }
    public void addUseDifferentAppLabelIfNecessary(com.android.internal.app.ResolverListAdapter p0) {}
    protected int appliedThemeResId() { return 0; }
    protected void applyFooterView(int p0) {}
    boolean checkTargetSourceIntent(com.android.internal.app.chooser.TargetInfo p0, android.content.Intent p1) { return false; }
    public java.util.List<android.service.chooser.ChooserTarget> convertToChooserTarget(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p1, java.util.List<android.app.prediction.AppTarget> p2, int p3) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider createBlockerEmptyStateProvider() { return null; }
    public com.android.internal.app.ChooserActivity.ChooserGridAdapter createChooserGridAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    public com.android.internal.app.ChooserListAdapter createChooserListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    protected android.view.ViewGroup createContentPreviewView(android.view.ViewGroup p0) { return null; }
    protected com.android.internal.app.ResolverListController createListController(android.os.UserHandle p0) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter createMultiProfilePagerAdapter(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    protected com.android.internal.app.ChooserActivityLogger getChooserActivityLogger() { return null; }
    protected android.content.ComponentName getEditSharingComponent() { return null; }
    protected com.android.internal.app.chooser.TargetInfo getEditSharingTarget(android.content.Intent p0) { return null; }
    public int getLayoutResource() { return 0; }
    public int getMaxRankedTargets() { return 0; }
    protected java.lang.String getMetricsCategory() { return null; }
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    protected android.content.ComponentName getNearbySharingComponent() { return null; }
    protected com.android.internal.app.chooser.TargetInfo getNearbySharingTarget(android.content.Intent p0) { return null; }
    public android.content.Intent getReferrerFillInIntent() { return null; }
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    public void handlePackagesChanged() {}
    protected boolean isImageType(java.lang.String p0) { return false; }
    protected boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    public boolean isSendAction(android.content.Intent p0) { return false; }
    protected boolean isUserRunning(android.os.UserHandle p0) { return false; }
    protected boolean isUserUnlocked(android.os.UserHandle p0) { return false; }
    protected boolean isWorkProfile() { return false; }
    protected android.graphics.Bitmap loadThumbnail(android.net.Uri p0, android.util.Size p1) { return null; }
    public com.android.internal.app.ResolverListAdapter.ActivityInfoPresentationGetter makePresentationGetter(android.content.pm.ActivityInfo p0) { return null; }
    protected void maybeLogProfileChange() {}
    public void onActivityStarted(com.android.internal.app.chooser.TargetInfo p0) {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    public void onButtonClick(android.view.View p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    void onHorizontalSwipeStateChanged(int p0) {}
    public void onListRebuilt(com.android.internal.app.ResolverListAdapter p0, boolean p1) {}
    protected void onProfileTabSelected() {}
    void onRefinementCanceled() {}
    void onRefinementResult(com.android.internal.app.chooser.TargetInfo p0, android.content.Intent p1) {}
    protected void onResume() {}
    protected void onStop() {}
    protected boolean onTargetSelected(com.android.internal.app.chooser.TargetInfo p0, boolean p1) { return false; }
    protected boolean postRebuildList(boolean p0) { return false; }
    protected void queryDirectShareTargets(com.android.internal.app.ChooserListAdapter p0, boolean p1) {}
    public android.database.Cursor queryResolver(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
    protected void resetButtonBar() {}
    protected void sendShortcutManagerShareTargetResults(int p0, com.android.internal.app.ChooserActivity.ServiceResultInfo[] p1) {}
    protected boolean shouldAddFooterView() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.chooser.TargetInfo p0) { return false; }
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldShowContentPreview() { return false; }
    public boolean shouldShowServiceTargets() { return false; }
    protected boolean shouldShowStickyContentPreviewWhenEmpty() { return false; }
    public void startSelected(int p0, boolean p1, boolean p2) {}
    void updateModelAndChooserCounts(com.android.internal.app.chooser.TargetInfo p0) {}

    static class AzInfoComparator implements java.util.Comparator<com.android.internal.app.chooser.DisplayResolveInfo> {
        java.util.Comparator<com.android.internal.app.chooser.DisplayResolveInfo> mComparator;
        AzInfoComparator(android.content.Context p0) {}
        public int compare(com.android.internal.app.chooser.DisplayResolveInfo p0, com.android.internal.app.chooser.DisplayResolveInfo p1) { return 0; }
    }

    static class BaseChooserTargetComparator implements java.util.Comparator<android.service.chooser.ChooserTarget> {
        BaseChooserTargetComparator() {}
        public int compare(android.service.chooser.ChooserTarget p0, android.service.chooser.ChooserTarget p1) { return 0; }
    }

    public final class ChooserGridAdapter extends com.android.internal.widget.RecyclerView.Adapter<com.android.internal.widget.RecyclerView.ViewHolder> {
        private static final int NUM_EXPANSIONS_TO_HIDE_AZ_LABEL = 20;
        private static final int VIEW_TYPE_AZ_LABEL = 4;
        private static final int VIEW_TYPE_CALLER_AND_RANK = 5;
        private static final int VIEW_TYPE_CONTENT_PREVIEW = 2;
        private static final int VIEW_TYPE_DIRECT_SHARE = 0;
        private static final int VIEW_TYPE_FOOTER = 6;
        private static final int VIEW_TYPE_NORMAL = 1;
        private static final int VIEW_TYPE_PROFILE = 3;
        private final java.util.Set<com.android.internal.app.ChooserActivity.ViewHolderBase> mBoundViewHolders = null;
        private com.android.internal.app.ChooserListAdapter mChooserListAdapter;
        private int mChooserTargetWidth;
        private com.android.internal.app.ChooserActivity.DirectShareViewHolder mDirectShareViewHolder;
        private int mFooterHeight;
        private final android.view.LayoutInflater mLayoutInflater = null;
        private boolean mLayoutRequested;
        private boolean mShowAzLabelIfPoss;
        ChooserGridAdapter(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ChooserListAdapter p1) { super(); }
        private boolean canExpandDirectShare() { return false; }
        private android.view.View createAzLabelView(android.view.ViewGroup p0) { return null; }
        private android.view.View createProfileView(android.view.ViewGroup p0) { return null; }
        private com.android.internal.app.ChooserActivity.ItemGroupViewHolder loadViewsIntoGroup(com.android.internal.app.ChooserActivity.ItemGroupViewHolder p0) { return null; }
        private void onTargetIconLoaded(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
        private void setViewBounds(android.view.View p0, int p1, int p2) {}
        private boolean suggestedAppsGroupContainsTarget(com.android.internal.app.ChooserActivity.ItemGroupViewHolder p0, com.android.internal.app.chooser.DisplayResolveInfo p1) { return false; }
        void bindItemGroupViewHolder(int p0, com.android.internal.app.ChooserActivity.ItemGroupViewHolder p1) {}
        void bindItemViewHolder(int p0, com.android.internal.app.ChooserActivity.ItemViewHolder p1) {}
        public boolean calculateChooserTargetWidth(int p0) { return false; }
        public boolean consumeLayoutRequest() { return false; }
        com.android.internal.app.ChooserActivity.ItemGroupViewHolder createItemGroupViewHolder(int p0, android.view.ViewGroup p1) { return null; }
        public int getAzLabelRowCount() { return 0; }
        public int getCallerAndRankedTargetRowCount() { return 0; }
        public int getFooterRowCount() { return 0; }
        public int getItemCount() { return 0; }
        public int getItemViewType(int p0) { return 0; }
        public com.android.internal.app.ChooserListAdapter getListAdapter() { return null; }
        int getListPosition(int p0) { return 0; }
        public int getProfileRowCount() { return 0; }
        public int getRowCount() { return 0; }
        int getRowType(int p0) { return 0; }
        public int getServiceTargetRowCount() { return 0; }
        public int getSystemRowCount() { return 0; }
        public int getTargetType(int p0) { return 0; }
        public void handleScroll(android.view.View p0, int p1, int p2) {}
        public void hideContentPreview() {}
        public void onBindViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) {}
        public com.android.internal.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup p0, int p1) { return null; }
        public boolean onFailedToRecycleView(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
        public void onViewRecycled(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public void setFooterHeight(int p0) {}
        boolean shouldCellSpan(int p0) { return false; }
        void updateDirectShareExpansion() {}
    }

    private class ChooserHandler extends android.os.Handler {
        private static final int SHORTCUT_MANAGER_ALL_SHARE_TARGET_RESULTS = 7;
        private ChooserHandler(com.android.internal.app.ChooserActivity p0) { super(); }
        private void removeAllMessages() {}
        public void handleMessage(android.os.Message p0) {}
    }

    public class ChooserListController extends com.android.internal.app.ResolverListController {
        public ChooserListController(com.android.internal.app.ChooserActivity p0, android.content.Context p1, android.content.pm.PackageManager p2, android.content.Intent p3, java.lang.String p4, int p5, android.os.UserHandle p6, com.android.internal.app.AbstractResolverComparator p7, android.os.UserHandle p8) { super((android.content.Context)null, (android.content.pm.PackageManager)null, (android.content.Intent)null, (java.lang.String)null, 0, (android.os.UserHandle)null, (android.os.UserHandle)null); }
        boolean isComponentFiltered(android.content.ComponentName p0) { return false; }
        public boolean isComponentPinned(android.content.ComponentName p0) { return false; }
        public boolean isFixedAtTop(android.content.ComponentName p0) { return false; }
    }

    static class ChooserTargetRankingInfo {
        public final java.util.List<android.app.prediction.AppTarget> scores = null;
        public final android.os.UserHandle userHandle = null;
        ChooserTargetRankingInfo(java.util.List<android.app.prediction.AppTarget> p0, android.os.UserHandle p1) {}
    }

    private class ContentPreviewCoordinator {
        private static final int IMAGE_FADE_IN_MILLIS = 150;
        private static final int IMAGE_LOAD_INTO_VIEW = 2;
        private static final int IMAGE_LOAD_TIMEOUT = 1;
        private boolean mAtLeastOneLoaded;
        private final android.os.Handler mHandler = null;
        private boolean mHideParentOnFail;
        private final int mImageLoadTimeoutMillis = 0;
        private final android.view.View mParentView = null;
        ContentPreviewCoordinator(com.android.internal.app.ChooserActivity p0, android.view.View p1, boolean p2) {}
        private void cancelLoads() {}
        private void collapseParentView() {}
        private void loadUriIntoView(int p0, android.net.Uri p1, int p2) {}
        private void maybeHideContentPreview() {}
        private void setupPreDrawForSharedElementTransition(android.view.View p0) {}

        class LoadUriTask {
            public final android.graphics.Bitmap mBmp = null;
            public final int mExtraCount = 0;
            public final int mImageResourceId = 0;
            public final android.net.Uri mUri = null;
            LoadUriTask(com.android.internal.app.ChooserActivity.ContentPreviewCoordinator p0, int p1, android.net.Uri p2, int p3, android.graphics.Bitmap p4) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ContentPreviewType {
    }

    static class DirectShareViewHolder extends com.android.internal.app.ChooserActivity.ItemGroupViewHolder {
        private int mCellCountPerRow;
        private final boolean[] mCellVisibility = null;
        private int mDirectShareCurrHeight;
        private int mDirectShareMaxHeight;
        private int mDirectShareMinHeight;
        private boolean mHideDirectShareExpansion;
        private final java.util.function.Supplier<com.android.internal.app.ChooserListAdapter> mListAdapterSupplier = null;
        private final android.view.ViewGroup mParent = null;
        private final java.util.List<android.view.ViewGroup> mRows = null;
        DirectShareViewHolder(android.view.ViewGroup p0, java.util.List<android.view.ViewGroup> p1, int p2, int p3, java.util.function.Supplier<com.android.internal.app.ChooserListAdapter> p4) { super(0, null, 0); }
        private void updateDirectShareRowHeight(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        void collapse(com.android.internal.widget.RecyclerView p0) {}
        void expand(com.android.internal.widget.RecyclerView p0) {}
        public int getMeasuredRowHeight() { return 0; }
        public int getMinRowHeight() { return 0; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getViewGroup() { return null; }
        public void handleScroll(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3) {}
        public void measure() {}
        public void setViewVisibility(int p0, int p1) {}
    }

    protected static final class EmptyTargetInfo extends com.android.internal.app.chooser.NotSelectableTargetInfo {
        public EmptyTargetInfo() { super(); }
        public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    }

    private class EnterTransitionAnimationDelegate implements android.view.View.OnLayoutChangeListener {
        private boolean mOffsetCalculated;
        private boolean mPreviewReady;
        private EnterTransitionAnimationDelegate(com.android.internal.app.ChooserActivity p0) {}
        private void maybeStartListenForLayout() {}
        void markImagePreviewReady() {}
        void markOffsetCalculated() {}
        public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
        void postponeTransition() {}
    }

    private static class FileInfo {
        public final boolean hasThumbnail = false;
        public final java.lang.String name = null;
        FileInfo(java.lang.String p0, boolean p1) {}
    }

    private static class FinishAnimation extends android.view.animation.AlphaAnimation implements android.view.animation.Animation.AnimationListener {
        private android.app.Activity mActivity;
        private final float mFromAlpha = 0.0f;
        private android.view.View mRootView;
        FinishAnimation(android.app.Activity p0, android.view.View p1) { super(0.0f, 0.0f); }
        private void cleanup() {}
        public void cancel() {}
        public void onAnimationEnd(android.view.animation.Animation p0) {}
        public void onAnimationRepeat(android.view.animation.Animation p0) {}
        public void onAnimationStart(android.view.animation.Animation p0) {}
        public void setAnimationListener(android.view.animation.Animation.AnimationListener p0) {}
    }

    static final class FooterViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        FooterViewHolder(android.view.View p0, int p1) { super(null, 0); }
    }

    static abstract class ItemGroupViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        protected final android.view.View[] mCells = null;
        private final int mColumnCount = 0;
        private int[] mItemIndices;
        protected int mMeasuredRowHeight;
        ItemGroupViewHolder(int p0, android.view.View p1, int p2) { super(null, 0); }
        abstract android.view.ViewGroup addView(int p0, android.view.View p1);
        public int getColumnCount() { return 0; }
        public int getItemIndex(int p0) { return 0; }
        public int getMeasuredRowHeight() { return 0; }
        abstract android.view.ViewGroup getRow(int p0);
        abstract android.view.ViewGroup getRowByIndex(int p0);
        public android.view.View getView(int p0) { return null; }
        abstract android.view.ViewGroup getViewGroup();
        public void measure() {}
        public void setItemIndex(int p0, int p1) {}
        abstract void setViewVisibility(int p0, int p1);
    }

    final class ItemViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        int mListPosition;
        com.android.internal.app.ResolverListAdapter.ViewHolder mWrappedViewHolder;
        ItemViewHolder(com.android.internal.app.ChooserActivity p0, android.view.View p1, boolean p2, int p3) { super(null, 0); }
    }

    static final class PlaceHolderTargetInfo extends com.android.internal.app.chooser.NotSelectableTargetInfo {
        PlaceHolderTargetInfo() { super(); }
        public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    }

    static class RefinementResultReceiver extends android.os.ResultReceiver {
        private com.android.internal.app.ChooserActivity mChooserActivity;
        private com.android.internal.app.chooser.TargetInfo mSelectedTarget;
        public RefinementResultReceiver(com.android.internal.app.ChooserActivity p0, com.android.internal.app.chooser.TargetInfo p1, android.os.Handler p2) { super((android.os.Handler)null); }
        public void destroy() {}
        protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    }

    public static class RoundedRectImageView extends android.widget.ImageView {
        private java.lang.String mExtraImageCount;
        private android.graphics.Paint mOverlayPaint;
        private android.graphics.Path mPath;
        private int mRadius;
        private android.graphics.Paint mRoundRectPaint;
        private android.graphics.Paint mTextPaint;
        public RoundedRectImageView(android.content.Context p0) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        private void updatePath(int p0, int p1) {}
        protected void onDraw(android.graphics.Canvas p0) {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
        public void setExtraImageCount(int p0) {}
        public void setRadius(int p0) {}
    }

    public static class ServiceResultInfo {
        public final com.android.internal.app.chooser.DisplayResolveInfo originalTarget = null;
        public final java.util.List<android.service.chooser.ChooserTarget> resultTargets = null;
        public final android.os.UserHandle userHandle = null;
        public ServiceResultInfo(com.android.internal.app.chooser.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, android.os.UserHandle p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShareTargetType {
    }

    static class SingleRowViewHolder extends com.android.internal.app.ChooserActivity.ItemGroupViewHolder {
        private final android.view.ViewGroup mRow = null;
        SingleRowViewHolder(android.view.ViewGroup p0, int p1, int p2) { super(0, null, 0); }
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getViewGroup() { return null; }
        public void setViewVisibility(int p0, int p1) {}
    }

    static abstract class ViewHolderBase extends com.android.internal.widget.RecyclerView.ViewHolder {
        private int mViewType;
        ViewHolderBase(android.view.View p0, int p1) { super(null); }
        int getViewType() { return 0; }
    }
}
