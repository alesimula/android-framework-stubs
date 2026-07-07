package com.android.internal.app;

public class ResolverActivity extends android.app.Activity implements com.android.internal.app.ResolverListAdapter.ResolverListCommunicator {
    private static final boolean DEBUG = false;
    public static boolean ENABLE_TABBED_VIEW;
    static final java.lang.String EXTRA_CALLING_USER = "com.android.internal.app.ResolverActivity.EXTRA_CALLING_USER";
    private static final java.lang.String EXTRA_FRAGMENT_ARG_KEY = ":settings:fragment_args_key";
    public static final java.lang.String EXTRA_IS_AUDIO_CAPTURE_DEVICE = "is_audio_capture_device";
    protected static final java.lang.String EXTRA_RESTRICT_TO_SINGLE_USER = "com.android.internal.app.ResolverActivity.EXTRA_RESTRICT_TO_SINGLE_USER";
    protected static final java.lang.String EXTRA_SELECTED_PROFILE = "com.android.internal.app.ResolverActivity.EXTRA_SELECTED_PROFILE";
    private static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGS = ":settings:show_fragment_args";
    private static final java.lang.String LAST_SHOWN_TAB_KEY = "last_shown_tab_key";
    protected static final java.lang.String METRICS_CATEGORY_CHOOSER = "intent_chooser";
    protected static final java.lang.String METRICS_CATEGORY_RESOLVER = "intent_resolver";
    private static final java.lang.String OPEN_LINKS_COMPONENT_KEY = "app_link_state";
    protected static final int PROFILE_PERSONAL = 0;
    protected static final int PROFILE_WORK = 1;
    private static final java.lang.String TAB_TAG_PERSONAL = "personal";
    private static final java.lang.String TAB_TAG_WORK = "work";
    private static final java.lang.String TAG = "ResolverActivity";
    private android.widget.Button mAlwaysButton;
    private android.os.UserHandle mCloneProfileUserHandle;
    private android.view.View mContainer;
    private int mDefaultTitleResId;
    private android.widget.Space mFooterSpacer;
    private boolean mHasSubclassSpecifiedResolutions;
    private android.os.UserHandle mHeaderCreatorUser;
    protected final java.util.ArrayList<android.content.Intent> mIntents = null;
    private final boolean mIsIntentPicker = false;
    private int mLastSelected;
    private android.view.View mLastSelectedItemView;
    protected final com.android.internal.util.LatencyTracker mLatencyTracker = null;
    protected int mLaunchedFromUid;
    private android.os.UserHandle mLaunchedFromUserHandle;
    private int mLayoutId;
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter mMultiProfilePagerAdapter;
    private com.android.internal.app.AbstractMultiProfilePagerAdapter.OnSwitchOnWorkSelectedListener mOnSwitchOnWorkSelectedListener;
    private android.widget.Button mOnceButton;
    private com.android.internal.content.PackageMonitor mPersonalPackageMonitor;
    private android.os.UserHandle mPersonalProfileUserHandle;
    private com.android.internal.app.ResolverActivity.PickTargetOptionRequest mPickOptionRequest;
    protected android.content.pm.PackageManager mPm;
    private android.os.UserHandle mPrivateProfileUserHandle;
    private java.lang.String mProfileSwitchMessage;
    protected android.view.View mProfileView;
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager mQuietModeManager;
    private java.lang.String mReferrerPackage;
    private boolean mRegistered;
    protected com.android.internal.widget.ResolverDrawerLayout mResolverDrawerLayout;
    private boolean mResolvingHome;
    private boolean mRetainInOnStop;
    private boolean mSafeForwardingMode;
    protected boolean mSupportsAlwaysUseOption;
    protected android.graphics.Insets mSystemWindowInsets;
    private android.os.UserHandle mTabOwnerUserHandleForLaunch;
    private java.lang.CharSequence mTitle;
    private com.android.internal.content.PackageMonitor mWorkPackageMonitor;
    private boolean mWorkProfileHasBeenEnabled;
    private android.content.BroadcastReceiver mWorkProfileStateReceiver;
    private android.os.UserHandle mWorkProfileUserHandle;
    public ResolverActivity() { super(); }
    protected ResolverActivity(boolean p0) { super(); }
    private boolean canAppInteractCrossProfiles(java.lang.String p0) { return false; }
    private boolean configureContentView() { return false; }
    private void configureMiniResolverContent() {}
    private com.android.internal.app.ResolverMultiProfilePagerAdapter createResolverMultiProfilePagerAdapterForOneProfile(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private com.android.internal.app.ResolverMultiProfilePagerAdapter createResolverMultiProfilePagerAdapterForTwoProfiles(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private android.content.BroadcastReceiver createWorkProfileStateReceiver() { return null; }
    private android.os.UserHandle fetchTabOwnerUserHandleForLaunch() { return null; }
    private static int getAttrColor(android.content.Context p0, int p1) { return 0; }
    private java.lang.String getForwardToPersonalMsg() { return null; }
    private java.lang.String getForwardToWorkMsg() { return null; }
    private android.os.UserHandle getIntentUser() { return null; }
    public static int getLabelRes(java.lang.String p0) { return 0; }
    private com.android.internal.util.LatencyTracker getLatencyTracker() { return null; }
    private java.lang.String getPersonalTabAccessibilityLabel() { return null; }
    private java.lang.String getPersonalTabLabel() { return null; }
    private java.lang.String getWorkProfileNotSupportedMsg(java.lang.String p0) { return null; }
    private java.lang.String getWorkTabAccessibilityLabel() { return null; }
    private java.lang.String getWorkTabLabel() { return null; }
    private boolean hasCloneProfile() { return false; }
    private boolean hasManagedProfile() { return false; }
    private boolean hasWorkProfile() { return false; }
    private boolean inactiveListAdapterHasItems() { return false; }
    private boolean isAutolaunching() { return false; }
    private int isPermissionGranted(java.lang.String p0, int p1) { return 0; }
    static final boolean isSpecificUriMatch(int p0) { return false; }
    private boolean isWorkProfileEnabled() { return false; }
    private android.content.Intent makeMyIntent() { return null; }
    private com.android.internal.app.AbstractResolverComparator makeResolverComparator(android.os.UserHandle p0) { return null; }
    private boolean maybeAutolaunchActivity() { return false; }
    private boolean maybeAutolaunchIfCrossProfileSupported() { return false; }
    private boolean maybeAutolaunchIfNoAppsOnInactiveTab() { return false; }
    private boolean maybeAutolaunchIfSingleTarget() { return false; }
    private void maybeCreateHeader(com.android.internal.app.ResolverListAdapter p0) {}
    private void maybeHideDivider() {}
    private void maybeLogCrossProfileTargetLaunch(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1) {}
    private void registerWorkProfileStateReceiver() {}
    private void resetAlwaysOrOnceButtonBar() {}
    private void resetCheckedItem() {}
    private void setAlwaysButtonEnabled(boolean p0, int p1, boolean p2) {}
    private void setButtonBarIgnoreOffset(boolean p0) {}
    private void setProfileSwitchMessage(int p0) {}
    private void setupAdapterListView(android.widget.ListView p0, com.android.internal.app.ResolverActivity.ItemClickListener p1) {}
    private void setupProfileTabs() {}
    private void setupViewVisibilities() {}
    private boolean shouldUseMiniResolver() { return false; }
    private boolean supportsManagedProfiles(android.content.pm.ResolveInfo p0) { return false; }
    private void updateActiveTabStyle(android.widget.TabHost p0) {}
    private void updateIntentPickerPaddings() {}
    public void addUseDifferentAppLabelIfNecessary(com.android.internal.app.ResolverListAdapter p0) {}
    protected int appliedThemeResId() { return 0; }
    protected void applyFooterView(int p0) {}
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider createBlockerEmptyStateProvider() { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.CrossProfileIntentsChecker createCrossProfileIntentsChecker() { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider createEmptyStateProvider(android.os.UserHandle p0) { return null; }
    protected com.android.internal.app.ResolverListController createListController(android.os.UserHandle p0) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter createMultiProfilePagerAdapter(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.MyUserIdProvider createMyUserIdProvider() { return null; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager createQuietModeManager() { return null; }
    protected com.android.internal.app.ResolverListAdapter createResolverListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    void dismiss() {}
    protected android.os.UserHandle fetchCloneProfileUserHandle() { return null; }
    protected android.os.UserHandle fetchPersonalProfileUserHandle() { return null; }
    protected android.os.UserHandle fetchPrivateProfileUserHandle() { return null; }
    protected android.os.UserHandle fetchWorkProfileUserProfile() { return null; }
    protected boolean filterLastUsedConfig() { return false; }
    protected android.os.UserHandle getCloneProfileUserHandle() { return null; }
    protected int getCurrentProfile() { return 0; }
    public int getLayoutResource() { return 0; }
    protected java.lang.String getMetricsCategory() { return null; }
    protected android.os.UserHandle getPersonalProfileUserHandle() { return null; }
    protected android.os.UserHandle getPrivateProfileUserHandle() { return null; }
    protected final android.os.UserHandle getQueryIntentsUser(android.os.UserHandle p0) { return null; }
    protected java.lang.String getReferrerPackageName() { return null; }
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    public final java.util.List<android.os.UserHandle> getResolverRankerServiceUserHandleList(android.os.UserHandle p0) { return null; }
    protected java.util.List<android.os.UserHandle> getResolverRankerServiceUserHandleListInternal(android.os.UserHandle p0) { return null; }
    int getSelectedProfileExtra() { return 0; }
    protected android.os.UserHandle getTabOwnerUserHandleForLaunch() { return null; }
    public android.content.Intent getTargetIntent() { return null; }
    protected java.lang.CharSequence getTitleForAction(android.content.Intent p0, int p1) { return null; }
    protected android.os.UserHandle getWorkProfileUserHandle() { return null; }
    protected final boolean isLaunchedAsCloneProfile() { return false; }
    protected final boolean isLaunchedAsPrivateProfile() { return false; }
    protected final boolean isLaunchedInSingleUserMode() { return false; }
    protected void maybeLogProfileChange() {}
    protected void maybePreselectTarget(com.android.internal.app.ResolverListAdapter p0) {}
    public void onActivityStarted(com.android.internal.app.chooser.TargetInfo p0) {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    public void onButtonClick(android.view.View p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, int p3, android.content.Intent[] p4, java.util.List<android.content.pm.ResolveInfo> p5, boolean p6) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, android.content.Intent[] p3, java.util.List<android.content.pm.ResolveInfo> p4, boolean p5) {}
    protected void onDestroy() {}
    public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    void onHorizontalSwipeStateChanged(int p0) {}
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onListRebuilt(com.android.internal.app.ResolverListAdapter p0, boolean p1) {}
    public final void onPostListReady(com.android.internal.app.ResolverListAdapter p0, boolean p1, boolean p2) {}
    protected void onProfileClick(android.view.View p0) {}
    protected void onProfileTabSelected() {}
    protected void onRestart() {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onStart() {}
    protected void onStop() {}
    protected boolean onTargetSelected(com.android.internal.app.chooser.TargetInfo p0, boolean p1) { return false; }
    android.app.VoiceInteractor.PickOptionRequest.Option optionForChooserTarget(com.android.internal.app.chooser.TargetInfo p0, int p1) { return null; }
    protected boolean postRebuildList(boolean p0) { return false; }
    final boolean postRebuildListInternal(boolean p0) { return false; }
    protected void resetButtonBar() {}
    public boolean resolveInfoMatch(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return false; }
    public final void safelyStartActivity(com.android.internal.app.chooser.TargetInfo p0) {}
    public final void safelyStartActivityAsUser(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1) {}
    protected final void safelyStartActivityAsUser(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1, android.os.Bundle p2) {}
    protected void safelyStartActivityInternal(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1, android.os.Bundle p2) {}
    public void sendVoiceChoicesIfNeeded() {}
    protected final void setAdditionalTargets(android.content.Intent[] p0) {}
    protected void setRetainInOnStop(boolean p0) {}
    public void setSafeForwardingMode(boolean p0) {}
    protected boolean shouldAddFooterView() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.chooser.TargetInfo p0) { return false; }
    public boolean shouldGetActivityMetadata() { return false; }
    protected boolean shouldShowTabs() { return false; }
    void showTargetDetails(android.content.pm.ResolveInfo p0) {}
    public void startSelected(int p0, boolean p1, boolean p2) {}
    protected void super_onCreate(android.os.Bundle p0) {}
    public void updateProfileViewButton() {}
    public boolean useLayoutWithDefault() { return false; }

    private static enum ActionTitle {
        CAPTURE_IMAGE(0, 0),
        DEFAULT(0, 0),
        EDIT(0, 0),
        HOME(0, 0),
        SEND(0, 0),
        SENDTO(0, 0),
        SEND_MULTIPLE(0, 0),
        VIEW(0, 0);
        private static final com.android.internal.app.ResolverActivity.ActionTitle[] $VALUES = null;
        public static final int BROWSABLE_APP_TITLE_RES = 17042335;
        public static final int BROWSABLE_HOST_APP_TITLE_RES = 17042333;
        public static final int BROWSABLE_HOST_TITLE_RES = 17042332;
        public static final int BROWSABLE_TITLE_RES = 17042334;
        public final java.lang.String action = null;
        public final int labelRes = 0;
        public final int namedTitleRes = 0;
        public final int titleRes = 0;
        private ActionTitle(int p0, int p1) {}
        public static com.android.internal.app.ResolverActivity.ActionTitle forAction(java.lang.String p0) { return null; }
    }

    public static class AppListAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
        private final android.view.View mBottomBar = null;
        private final com.android.internal.widget.ResolverDrawerLayout mDrawer = null;
        private final android.graphics.Rect mRect = null;
        public AppListAccessibilityDelegate(com.android.internal.widget.ResolverDrawerLayout p0) { super(); }
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2) { return false; }
    }

    class ItemClickListener implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener {
        ItemClickListener(com.android.internal.app.ResolverActivity p0) {}
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
        public boolean onItemLongClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) { return false; }
    }

    static class PickTargetOptionRequest extends android.app.VoiceInteractor.PickOptionRequest {
        public PickTargetOptionRequest(android.app.VoiceInteractor.Prompt p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super((android.app.VoiceInteractor.Prompt)null, (android.app.VoiceInteractor.PickOptionRequest.Option[])null, (android.os.Bundle)null); }
        public void onCancel() {}
        public void onPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
    }

    public static final class ResolvedComponentInfo {
        private boolean mFixedAtTop;
        private final java.util.List<android.content.Intent> mIntents = null;
        private boolean mPinned;
        private boolean mPreferredActivity;
        private final java.util.List<android.content.pm.ResolveInfo> mResolveInfos = null;
        public final android.content.ComponentName name = null;
        public ResolvedComponentInfo(android.content.ComponentName p0, android.content.Intent p1, android.content.pm.ResolveInfo p2) {}
        public void add(android.content.Intent p0, android.content.pm.ResolveInfo p1) {}
        public int findIntent(android.content.Intent p0) { return 0; }
        public int findResolveInfo(android.content.pm.ResolveInfo p0) { return 0; }
        public int getCount() { return 0; }
        public android.content.Intent getIntentAt(int p0) { return null; }
        public android.content.pm.ResolveInfo getResolveInfoAt(int p0) { return null; }
        public boolean isFixedAtTop() { return false; }
        public boolean isPinned() { return false; }
        public boolean isPreferredActivity() { return false; }
        public void setFixedAtTop(boolean p0) {}
        public void setPinned(boolean p0) {}
        public void setPreferredActivity(boolean p0) {}
    }
}
