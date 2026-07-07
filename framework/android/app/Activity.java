package android.app;

public class Activity extends android.view.ContextThemeWrapper implements android.view.LayoutInflater.Factory2, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener, android.content.ComponentCallbacks2, android.view.Window.OnWindowDismissedCallback, android.view.contentcapture.ContentCaptureManager.ContentCaptureClient {
    private static final int CONTENT_CAPTURE_PAUSE = 3;
    private static final int CONTENT_CAPTURE_RESUME = 2;
    private static final int CONTENT_CAPTURE_START = 1;
    private static final int CONTENT_CAPTURE_STOP = 4;
    private static final boolean DEBUG_LIFECYCLE = false;
    public static final int DEFAULT_KEYS_DIALER = 1;
    public static final int DEFAULT_KEYS_DISABLE = 0;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
    public static final int DEFAULT_KEYS_SHORTCUT = 2;
    public static final int DONT_FINISH_TASK_WITH_ACTIVITY = 0;
    public static final java.lang.String DUMP_ARG_AUTOFILL = "--autofill";
    public static final java.lang.String DUMP_ARG_CONTENT_CAPTURE = "--contentcapture";
    public static final java.lang.String DUMP_ARG_DUMP_DUMPABLE = "--dump-dumpable";
    public static final java.lang.String DUMP_ARG_LIST_DUMPABLES = "--list-dumpables";
    public static final java.lang.String DUMP_ARG_TRANSLATION = "--translation";
    private static final long DUMP_IGNORES_SPECIAL_ARGS = 149254050L;
    public static final int FINISH_TASK_WITH_ACTIVITY = 2;
    public static final int FINISH_TASK_WITH_ROOT_ACTIVITY = 1;
    protected static final int[] FOCUSED_STATE_SET = null;
    static final java.lang.String FRAGMENTS_TAG = "android:fragments";
    public static final int FULLSCREEN_MODE_REQUEST_ENTER = 1;
    public static final int FULLSCREEN_MODE_REQUEST_EXIT = 0;
    private static final java.lang.String HAS_CURRENT_PERMISSIONS_REQUEST_KEY = "android:hasCurrentPermissionsRequest";
    private static final java.lang.String KEYBOARD_SHORTCUTS_RECEIVER_PKG_NAME = "com.android.systemui";
    private static final int LOG_AM_ON_ACTIVITY_RESULT_CALLED = 30062;
    private static final int LOG_AM_ON_CREATE_CALLED = 30057;
    private static final int LOG_AM_ON_DESTROY_CALLED = 30060;
    private static final int LOG_AM_ON_PAUSE_CALLED = 30021;
    private static final int LOG_AM_ON_RESTART_CALLED = 30058;
    private static final int LOG_AM_ON_RESUME_CALLED = 30022;
    private static final int LOG_AM_ON_START_CALLED = 30059;
    private static final int LOG_AM_ON_STOP_CALLED = 30049;
    private static final int LOG_AM_ON_TOP_RESUMED_GAINED_CALLED = 30064;
    private static final int LOG_AM_ON_TOP_RESUMED_LOST_CALLED = 30065;
    public static final int OVERRIDE_TRANSITION_CLOSE = 1;
    public static final int OVERRIDE_TRANSITION_OPEN = 0;
    private static final java.lang.String REQUEST_PERMISSIONS_WHO_PREFIX = "@android:requestPermissions:";
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_FIRST_USER = 1;
    public static final int RESULT_OK = -1;
    private static final java.lang.String SAVED_DIALOGS_TAG = "android:savedDialogs";
    private static final java.lang.String SAVED_DIALOG_ARGS_KEY_PREFIX = "android:dialog_args_";
    private static final java.lang.String SAVED_DIALOG_IDS_KEY = "android:savedDialogIds";
    private static final java.lang.String SAVED_DIALOG_KEY_PREFIX = "android:dialog_";
    private static final long SLOW_OP_DURATION_MS = 500L;
    private static final java.lang.String TAG = "Activity";
    private static final java.lang.String WINDOW_HIERARCHY_TAG = "android:viewHierarchyState";
    android.app.ActionBar mActionBar;
    private int mActionModeTypeStarting;
    android.content.pm.ActivityInfo mActivityInfo;
    private final java.util.ArrayList<android.app.Application.ActivityLifecycleCallbacks> mActivityLifecycleCallbacks = null;
    final android.app.ActivityTransitionState mActivityTransitionState = null;
    private android.app.Application mApplication;
    private android.os.IBinder mAssistToken;
    private android.view.autofill.AutofillClientController mAutofillClientController;
    private android.content.ComponentCallbacksController mCallbacksController;
    boolean mCalled;
    private android.app.ComponentCaller mCaller;
    private boolean mCanEnterPictureInPicture;
    private boolean mChangeCanvasToTranslucent;
    boolean mChangingConfigurations;
    private android.content.ComponentName mComponent;
    int mConfigChangeFlags;
    private android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
    private android.app.ComponentCaller mCurrentCaller;
    android.content.res.Configuration mCurrentConfig;
    android.view.View mDecor;
    private android.window.OnBackInvokedCallback mDefaultBackCallback;
    private int mDefaultKeyMode;
    private android.text.SpannableStringBuilder mDefaultKeySsb;
    private boolean mDestroyed;
    private boolean mDoReportFullyDrawn;
    private com.android.internal.util.dump.DumpableContainerImpl mDumpableContainer;
    java.lang.String mEmbeddedID;
    private boolean mEnableDefaultActionBarUp;
    android.app.SharedElementCallback mEnterTransitionListener;
    android.app.SharedElementCallback mExitTransitionListener;
    boolean mFinished;
    final android.app.FragmentController mFragments = null;
    final android.os.Handler mHandler = null;
    private boolean mHasCurrentPermissionsRequest;
    private int mIdent;
    private android.app.ComponentCaller mInitialCaller;
    private final java.lang.Object mInstanceTracker = null;
    private android.app.Instrumentation mInstrumentation;
    android.content.Intent mIntent;
    private boolean mIsHandoffEnabled;
    private boolean mIsInMultiWindowMode;
    boolean mIsInPictureInPictureMode;
    private android.app.jank.JankTracker mJankTracker;
    android.app.Activity.NonConfigurationInstances mLastNonConfigurationInstances;
    private int mLastRequestedOrientation;
    private int mLastTaskDescriptionHashCode;
    boolean mLaunchedFromBubble;
    android.app.ActivityThread mMainThread;
    private final java.util.ArrayList<android.app.Activity.ManagedCursor> mManagedCursors = null;
    private android.util.SparseArray<android.app.Activity.ManagedDialog> mManagedDialogs;
    private android.view.MenuInflater mMenuInflater;
    private android.window.ObserverOnBackAnimationCallback mObserverBackCallback;
    android.app.Activity mParent;
    java.lang.String mReferrer;
    private boolean mRestoredFromBundle;
    int mResultCode;
    android.content.Intent mResultData;
    boolean mResumed;
    android.app.ActivityOptions.SceneTransitionInfo mSceneTransitionInfo;
    private android.app.ScreenCaptureCallbackHandler mScreenCaptureCallbackHandler;
    private android.view.SearchEvent mSearchEvent;
    private android.app.SearchManager mSearchManager;
    private android.os.IBinder mShareableActivityToken;
    private boolean mShouldDockBigOverlays;
    private android.window.SplashScreen mSplashScreen;
    boolean mStartedActivity;
    boolean mStopped;
    private final android.app.ActivityManager.TaskDescription mTaskDescription = null;
    private java.lang.CharSequence mTitle;
    private int mTitleColor;
    private boolean mTitleReady;
    private android.os.IBinder mToken;
    private android.app.Activity.TranslucentConversionListener mTranslucentCallback;
    private java.lang.Thread mUiThread;
    private android.view.translation.UiTranslationController mUiTranslationController;
    boolean mVisibleFromClient;
    boolean mVisibleFromServer;
    private com.android.internal.app.IVoiceInteractionManagerService mVoiceInteractionManagerService;
    android.app.VoiceInteractor mVoiceInteractor;
    private android.view.Window mWindow;
    boolean mWindowAdded;
    private final android.view.Window.WindowControllerCallback mWindowControllerCallback = null;
    private android.view.WindowManager mWindowManager;
    public Activity() { super(); }
    private void cancelInputsAndStartExitTransition(android.os.Bundle p0) {}
    private java.lang.Object[] collectActivityLifecycleCallbacks() { return null; }
    private boolean convertFromTranslucentInternal() { return false; }
    private android.app.Dialog createDialog(java.lang.Integer p0, android.os.Bundle p1, android.os.Bundle p2) { return null; }
    private boolean deviceSupportsPictureInPictureMode() { return false; }
    private void dispatchActivityConfigurationChanged() {}
    private void dispatchActivityCreated(android.os.Bundle p0) {}
    private void dispatchActivityDestroyed() {}
    private void dispatchActivityPaused() {}
    private void dispatchActivityPostCreated(android.os.Bundle p0) {}
    private void dispatchActivityPostDestroyed() {}
    private void dispatchActivityPostPaused() {}
    private void dispatchActivityPostResumed() {}
    private void dispatchActivityPostSaveInstanceState(android.os.Bundle p0) {}
    private void dispatchActivityPostStarted() {}
    private void dispatchActivityPostStopped() {}
    private void dispatchActivityPreCreated(android.os.Bundle p0) {}
    private void dispatchActivityPreDestroyed() {}
    private void dispatchActivityPrePaused() {}
    private void dispatchActivityPreResumed() {}
    private void dispatchActivityPreSaveInstanceState(android.os.Bundle p0) {}
    private void dispatchActivityPreStarted() {}
    private void dispatchActivityPreStopped() {}
    private void dispatchActivityRestarted() {}
    private void dispatchActivityResumed() {}
    private void dispatchActivitySaveInstanceState(android.os.Bundle p0) {}
    private void dispatchActivityStarted() {}
    private void dispatchActivityStopped() {}
    private void dispatchRequestPermissionsResult(int p0, android.content.Intent p1) {}
    private void dispatchRequestPermissionsResultToFragment(int p0, android.content.Intent p1, android.app.Fragment p2) {}
    private void dumpLegacyDumpable(java.lang.String p0, java.io.PrintWriter p1, java.lang.String p2, java.lang.String p3) {}
    private void ensureSearchManager() {}
    private void finish(int p0) {}
    public static java.lang.String fullscreenModeRequestToString(int p0) { return null; }
    private android.view.autofill.AutofillClientController getAutofillClientController() { return null; }
    private android.view.contentcapture.ContentCaptureManager getContentCaptureManager() { return null; }
    private java.lang.String getContentCaptureTypeAsString(int p0) { return null; }
    private static native java.lang.String getDlWarning();
    private android.window.SplashScreen getOrCreateSplashScreen() { return null; }
    private int[] getPermissionRequestStates(android.content.Context p0, java.lang.String[] p1) { return null; }
    private void initWindowDecorActionBar() {}
    private void internalDispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3, android.app.ComponentCaller p4, java.lang.String p5) {}
    private void internalSetIntent(android.content.Intent p0, android.app.ComponentCaller p1) {}
    private boolean isTvImplicitEnterPipProhibited() { return false; }
    private java.lang.IllegalArgumentException missingDialog(int p0) { return null; }
    private void notifyContentCaptureManagerIfNeeded(int p0) {}
    private void notifyVoiceInteractionManagerServiceActivityEvent(int p0) {}
    private void onBackInvoked() {}
    private void restoreHasCurrentPermissionRequest(android.os.Bundle p0) {}
    private void restoreManagedDialogs(android.os.Bundle p0) {}
    private void saveManagedDialogs(android.os.Bundle p0) {}
    private static java.lang.String savedDialogArgsKeyFor(int p0) { return null; }
    private static java.lang.String savedDialogKeyFor(int p0) { return null; }
    private void setLocusContextToContentCapture(android.content.LocusId p0, android.os.Bundle p1) {}
    private boolean shouldStartAppJankTracking() { return false; }
    private void startActivityAsUserFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3, android.os.UserHandle p4) {}
    private void startAppJankTracking() {}
    private void startIntentSenderFromFragment(android.app.Fragment p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    private void stopAppJankTracking() {}
    private void storeHasCurrentPermissionRequest(android.os.Bundle p0) {}
    private android.os.Bundle transferSpringboardActivityOptions(android.os.Bundle p0) { return null; }
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public final boolean addDumpable(android.util.Dumpable p0) { return false; }
    final void attach(android.content.Context p0, android.app.ActivityThread p1, android.app.Instrumentation p2, android.os.IBinder p3, int p4, android.app.Application p5, android.content.Intent p6, android.content.pm.ActivityInfo p7, java.lang.CharSequence p8, android.app.Activity p9, java.lang.String p10, android.app.Activity.NonConfigurationInstances p11, android.content.res.Configuration p12, java.lang.String p13, com.android.internal.app.IVoiceInteractor p14, android.view.Window p15, android.view.ViewRootImpl.ActivityConfigCallback p16, android.os.IBinder p17, android.os.IBinder p18) {}
    final void attach(android.content.Context p0, android.app.ActivityThread p1, android.app.Instrumentation p2, android.os.IBinder p3, int p4, android.app.Application p5, android.content.Intent p6, android.content.pm.ActivityInfo p7, java.lang.CharSequence p8, android.app.Activity p9, java.lang.String p10, android.app.Activity.NonConfigurationInstances p11, android.content.res.Configuration p12, java.lang.String p13, com.android.internal.app.IVoiceInteractor p14, android.view.Window p15, android.view.ViewRootImpl.ActivityConfigCallback p16, android.os.IBinder p17, android.os.IBinder p18, android.os.IBinder p19) {}
    protected void attachBaseContext(android.content.Context p0) {}
    final void autofillViewIfAvailable(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1) {}
    public boolean canStartActivityForResult() { return false; }
    public void clearOverrideActivityTransition(int p0) {}
    public void closeContextMenu() {}
    public void closeOptionsMenu() {}
    public final android.content.ComponentName contentCaptureClientGetComponentName() { return null; }
    @android.annotation.SystemApi
    public void convertFromTranslucent() {}
    @android.annotation.SystemApi
    public boolean convertToTranslucent(android.app.Activity.TranslucentConversionListener p0, android.app.ActivityOptions p1) { return false; }
    public android.app.PendingIntent createPendingResult(int p0, android.content.Intent p1, int p2) { return null; }
    @java.lang.Deprecated
    public final void dismissDialog(int p0) {}
    public final void dismissKeyboardShortcutsHelper() {}
    void dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3, android.app.ComponentCaller p4, java.lang.String p5) {}
    void dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4) {}
    public final void dispatchEnterAnimationComplete() {}
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    void dispatchMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    final void dispatchMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    final void dispatchPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    void dumpInner(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public void dumpInternal(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public final void enableTaskLocaleOverride() {}
    @java.lang.Deprecated
    public void enterPictureInPictureMode() {}
    public boolean enterPictureInPictureMode(android.app.PictureInPictureParams p0) { return false; }
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    public void finish() {}
    public void finishActivity(int p0) {}
    @java.lang.Deprecated
    public void finishActivityFromChild(android.app.Activity p0, int p1) {}
    public void finishAffinity() {}
    public void finishAfterTransition() {}
    public void finishAndRemoveTask() {}
    @java.lang.Deprecated
    public void finishFromChild(android.app.Activity p0) {}
    public android.app.ActionBar getActionBar() { return null; }
    public final android.content.pm.ActivityInfo getActivityInfo() { return null; }
    public final android.app.ActivityThread getActivityThread() { return null; }
    public final android.os.IBinder getActivityToken() { return null; }
    public final android.app.Application getApplication() { return null; }
    public final android.os.IBinder getAssistToken() { return null; }
    public final android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }
    public android.app.ComponentCaller getCaller() { return null; }
    public android.content.ComponentName getCallingActivity() { return null; }
    public java.lang.String getCallingPackage() { return null; }
    public int getChangingConfigurations() { return 0; }
    public android.content.ComponentName getComponentName() { return null; }
    public final android.view.contentcapture.ContentCaptureManager.ContentCaptureClient getContentCaptureClient() { return null; }
    public android.transition.Scene getContentScene() { return null; }
    public android.transition.TransitionManager getContentTransitionManager() { return null; }
    public android.app.ComponentCaller getCurrentCaller() { return null; }
    public android.view.View getCurrentFocus() { return null; }
    @java.lang.Deprecated
    public android.app.FragmentManager getFragmentManager() { return null; }
    public android.app.ComponentCaller getInitialCaller() { return null; }
    public android.content.Intent getIntent() { return null; }
    java.util.HashMap<java.lang.String, java.lang.Object> getLastNonConfigurationChildInstances() { return null; }
    public java.lang.Object getLastNonConfigurationInstance() { return null; }
    public java.lang.String getLaunchedFromPackage() { return null; }
    public int getLaunchedFromUid() { return 0; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    @java.lang.Deprecated
    public android.app.LoaderManager getLoaderManager() { return null; }
    public java.lang.String getLocalClassName() { return null; }
    public int getMaxNumPictureInPictureActions() { return 0; }
    public final android.media.session.MediaController getMediaController() { return null; }
    public android.view.MenuInflater getMenuInflater() { return null; }
    public final int getNextAutofillId() { return 0; }
    public android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }
    @java.lang.Deprecated
    public final android.app.Activity getParent() { return null; }
    public android.content.Intent getParentActivityIntent() { return null; }
    public android.content.SharedPreferences getPreferences(int p0) { return null; }
    public android.net.Uri getReferrer() { return null; }
    public int getRequestedOrientation() { return 0; }
    android.app.ActivityOptions.SceneTransitionInfo getSceneTransitionInfo() { return null; }
    public final android.view.SearchEvent getSearchEvent() { return null; }
    public final android.os.IBinder getShareableActivityToken() { return null; }
    public final android.window.SplashScreen getSplashScreen() { return null; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public int getTaskId() { return 0; }
    public final java.lang.CharSequence getTitle() { return null; }
    public final int getTitleColor() { return 0; }
    public android.app.VoiceInteractor getVoiceInteractor() { return null; }
    public final int getVolumeControlStream() { return 0; }
    public android.view.Window getWindow() { return null; }
    public android.view.WindowManager getWindowManager() { return null; }
    public boolean hasWindowFocus() { return false; }
    public void invalidateOptionsMenu() {}
    public boolean isActivityTransitionRunning() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isBackgroundVisibleBehind() { return false; }
    public boolean isChangingConfigurations() { return false; }
    @java.lang.Deprecated
    public final boolean isChild() { return false; }
    public boolean isDestroyed() { return false; }
    public boolean isFinishing() { return false; }
    public final boolean isHandoffEnabled() { return false; }
    public boolean isImmersive() { return false; }
    public boolean isInMultiWindowMode() { return false; }
    public boolean isInPictureInPictureMode() { return false; }
    public boolean isLaunchedFromBubble() { return false; }
    public boolean isLocalVoiceInteractionSupported() { return false; }
    public final boolean isOverlayWithDecorCaptionEnabled() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public final boolean isResumed() { return false; }
    public boolean isTaskRoot() { return false; }
    final boolean isTopOfTask() { return false; }
    public final boolean isVisibleForAutofill() { return false; }
    public boolean isVoiceInteraction() { return false; }
    public boolean isVoiceInteractionRoot() { return false; }
    void makeVisible() {}
    @java.lang.Deprecated
    public final android.database.Cursor managedQuery(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String p3) { return null; }
    @java.lang.Deprecated
    public final android.database.Cursor managedQuery(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public boolean moveTaskToBack(boolean p0) { return false; }
    public boolean navigateUpTo(android.content.Intent p0) { return false; }
    @java.lang.Deprecated
    public boolean navigateUpToFromChild(android.app.Activity p0, android.content.Intent p1) { return false; }
    public void onActionModeFinished(android.view.ActionMode p0) {}
    public void onActionModeStarted(android.view.ActionMode p0) {}
    public void onActivityReenter(int p0, android.content.Intent p1) {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onActivityResult(int p0, int p1, android.content.Intent p2, android.app.ComponentCaller p3) {}
    protected void onApplyThemeResource(android.content.res.Resources.Theme p0, int p1, boolean p2) {}
    @java.lang.Deprecated
    public void onAttachFragment(android.app.Fragment p0) {}
    public void onAttachedToWindow() {}
    @java.lang.Deprecated
    public void onBackPressed() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onBackgroundVisibleBehindChanged(boolean p0) {}
    protected void onChildTitleChanged(android.app.Activity p0, java.lang.CharSequence p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onContentChanged() {}
    public boolean onContextItemSelected(android.view.MenuItem p0) { return false; }
    public void onContextMenuClosed(android.view.Menu p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    public void onCreate(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2) {}
    public java.lang.CharSequence onCreateDescription() { return null; }
    @java.lang.Deprecated
    protected android.app.Dialog onCreateDialog(int p0) { return null; }
    @java.lang.Deprecated
    protected android.app.Dialog onCreateDialog(int p0, android.os.Bundle p1) { return null; }
    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder p0) {}
    public boolean onCreateOptionsMenu(android.view.Menu p0) { return false; }
    public boolean onCreatePanelMenu(int p0, android.view.Menu p1) { return false; }
    public android.view.View onCreatePanelView(int p0) { return null; }
    @java.lang.Deprecated
    public boolean onCreateThumbnail(android.graphics.Bitmap p0, android.graphics.Canvas p1) { return false; }
    public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
    protected void onDestroy() {}
    public void onDetachedFromWindow() {}
    public void onEnterAnimationComplete() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onGetDirectActions(android.os.CancellationSignal p0, java.util.function.Consumer<java.util.List<android.app.DirectAction>> p1) {}
    public android.app.HandoffActivityData onHandoffActivityDataRequested(android.app.HandoffActivityDataRequestInfo p0) { return null; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onLocalVoiceInteractionStarted() {}
    public void onLocalVoiceInteractionStopped() {}
    public void onLowMemory() {}
    public boolean onMenuItemSelected(int p0, android.view.MenuItem p1) { return false; }
    public boolean onMenuOpened(int p0, android.view.Menu p1) { return false; }
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    @java.lang.Deprecated
    public void onMultiWindowModeChanged(boolean p0) {}
    public void onMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean onNavigateUp() { return false; }
    @java.lang.Deprecated
    public boolean onNavigateUpFromChild(android.app.Activity p0) { return false; }
    protected void onNewIntent(android.content.Intent p0) {}
    public void onNewIntent(android.content.Intent p0, android.app.ComponentCaller p1) {}
    public void onNewSceneTransitionInfo(android.app.ActivityOptions.SceneTransitionInfo p0) {}
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void onOptionsMenuClosed(android.view.Menu p0) {}
    public void onPanelClosed(int p0, android.view.Menu p1) {}
    protected void onPause() {}
    public void onPerformDirectAction(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.os.Bundle> p3) {}
    @java.lang.Deprecated
    public void onPictureInPictureModeChanged(boolean p0) {}
    public void onPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean onPictureInPictureRequested() { return false; }
    public void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState p0) {}
    protected void onPostCreate(android.os.Bundle p0) {}
    public void onPostCreate(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onPostResume() {}
    @java.lang.Deprecated
    protected void onPrepareDialog(int p0, android.app.Dialog p1) {}
    @java.lang.Deprecated
    protected void onPrepareDialog(int p0, android.app.Dialog p1, android.os.Bundle p2) {}
    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder p0) {}
    public boolean onPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
    public void onProvideAssistContent(android.app.assist.AssistContent p0) {}
    public void onProvideAssistData(android.os.Bundle p0) {}
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, android.view.Menu p1, int p2) {}
    public android.net.Uri onProvideReferrer() { return null; }
    public void onRequestPermissionsResult(int p0, java.lang.String[] p1, int[] p2) {}
    public void onRequestPermissionsResult(int p0, java.lang.String[] p1, int[] p2, int p3) {}
    protected void onRestart() {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    public void onRestoreInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onResume() {}
    java.util.HashMap<java.lang.String, java.lang.Object> onRetainNonConfigurationChildInstances() { return null; }
    public java.lang.Object onRetainNonConfigurationInstance() { return null; }
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    public void onSaveInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    public boolean onSearchRequested() { return false; }
    public boolean onSearchRequested(android.view.SearchEvent p0) { return false; }
    protected void onStart() {}
    @java.lang.Deprecated
    public void onStateNotSaved() {}
    protected void onStop() {}
    protected void onTitleChanged(java.lang.CharSequence p0, int p1) {}
    public void onTopResumedActivityChanged(boolean p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    void onTranslucentConversionComplete(boolean p0) {}
    public void onTrimMemory(int p0) {}
    public void onUserInteraction() {}
    protected void onUserLeaveHint() {}
    @java.lang.Deprecated
    public void onVisibleBehindCanceled() {}
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void onWindowDismissed(boolean p0, boolean p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void openContextMenu(android.view.View p0) {}
    public void openOptionsMenu() {}
    public void overrideActivityTransition(int p0, int p1, int p2) {}
    public void overrideActivityTransition(int p0, int p1, int p2, int p3) {}
    @java.lang.Deprecated
    public void overridePendingTransition(int p0, int p1) {}
    @java.lang.Deprecated
    public void overridePendingTransition(int p0, int p1, int p2) {}
    final void performCreate(android.os.Bundle p0) {}
    final void performCreate(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    final void performDestroy() {}
    final void performNewIntent(android.content.Intent p0) {}
    final void performNewIntent(android.content.Intent p0, android.app.ComponentCaller p1) {}
    final void performPause() {}
    final void performRestart(boolean p0) {}
    final void performRestoreInstanceState(android.os.Bundle p0) {}
    final void performRestoreInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    final void performResume(boolean p0, java.lang.String p1) {}
    final void performSaveInstanceState(android.os.Bundle p0) {}
    final void performSaveInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    final void performStart(java.lang.String p0) {}
    final void performStop(boolean p0, java.lang.String p1) {}
    final void performTopResumedActivityChanged(boolean p0, java.lang.String p1) {}
    final void performUserLeaving() {}
    public void postponeEnterTransition() {}
    public void recreate() {}
    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks p0) {}
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void registerForContextMenu(android.view.View p0) {}
    public void registerRemoteAnimations(android.view.RemoteAnimationDefinition p0) {}
    public void registerScreenCaptureCallback(java.util.concurrent.Executor p0, android.app.Activity.ScreenCaptureCallback p1) {}
    public boolean releaseInstance() { return false; }
    @java.lang.Deprecated
    public final void removeDialog(int p0) {}
    public void reportFullyDrawn() {}
    public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent p0) { return null; }
    public void requestFullscreenMode(int p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p1) {}
    public final void requestOpenInBrowserEducation() {}
    public final void requestPermissions(java.lang.String[] p0, int p1) {}
    public final void requestPermissions(java.lang.String[] p0, int p1, int p2) {}
    public final void requestShowKeyboardShortcuts() {}
    @java.lang.Deprecated
    public boolean requestVisibleBehind(boolean p0) { return false; }
    public final boolean requestWindowFeature(int p0) { return false; }
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    android.app.Activity.NonConfigurationInstances retainNonConfigurationInstances() { return null; }
    public final void runOnUiThread(java.lang.Runnable p0) {}
    public void setActionBar(android.widget.Toolbar p0) {}
    public final void setActivityRecordInputSinkEnabled(boolean p0) {}
    public void setAllowCrossUidActivitySwitchFromBelow(boolean p0) {}
    public void setContentTransitionManager(android.transition.TransitionManager p0) {}
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public final void setDefaultKeyMode(int p0) {}
    public void setDisablePreviewScreenshots(boolean p0) {}
    public void setEnterSharedElementCallback(android.app.SharedElementCallback p0) {}
    public void setExitSharedElementCallback(android.app.SharedElementCallback p0) {}
    public final void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setFeatureDrawableAlpha(int p0, int p1) {}
    public final void setFeatureDrawableResource(int p0, int p1) {}
    public final void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public void setFinishOnTouchOutside(boolean p0) {}
    public final void setForceSendResultForMediaProjection() {}
    public final void setHandoffEnabled(boolean p0, android.app.HandoffActivityParams p1) {}
    public void setImmersive(boolean p0) {}
    public void setInheritShowWhenLocked(boolean p0) {}
    public void setIntent(android.content.Intent p0) {}
    public void setIntent(android.content.Intent p0, android.app.ComponentCaller p1) {}
    public void setLocusContext(android.content.LocusId p0, android.os.Bundle p1) {}
    public final void setMediaController(android.media.session.MediaController p0) {}
    public final void setOverlayWithDecorCaptionEnabled(boolean p0) {}
    final void setParent(android.app.Activity p0) {}
    @java.lang.Deprecated
    public final void setPersistent(boolean p0) {}
    public void setPictureInPictureParams(android.app.PictureInPictureParams p0) {}
    @java.lang.Deprecated
    public final void setProgress(int p0) {}
    @java.lang.Deprecated
    public final void setProgressBarIndeterminate(boolean p0) {}
    @java.lang.Deprecated
    public final void setProgressBarIndeterminateVisibility(boolean p0) {}
    @java.lang.Deprecated
    public final void setProgressBarVisibility(boolean p0) {}
    public void setRecentsScreenshotEnabled(boolean p0) {}
    public void setRequestedOrientation(int p0) {}
    public final void setResult(int p0) {}
    public final void setResult(int p0, android.content.Intent p1) {}
    @java.lang.Deprecated
    public final void setSecondaryProgress(int p0) {}
    public void setShouldDockBigOverlays(boolean p0) {}
    public void setShowWhenLocked(boolean p0) {}
    public void setTaskDescription(android.app.ActivityManager.TaskDescription p0) {}
    public void setTheme(int p0) {}
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    @java.lang.Deprecated
    public void setTitleColor(int p0) {}
    public boolean setTranslucent(boolean p0) { return false; }
    public void setTurnScreenOn(boolean p0) {}
    public void setVisible(boolean p0) {}
    void setVoiceInteractor(com.android.internal.app.IVoiceInteractor p0) {}
    public final void setVolumeControlStream(int p0) {}
    public void setVrModeEnabled(boolean p0, android.content.ComponentName p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    public boolean shouldDockBigOverlays() { return false; }
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0, int p1) { return false; }
    public boolean shouldUpRecreateTask(android.content.Intent p0) { return false; }
    public boolean showAssist(android.os.Bundle p0) { return false; }
    @java.lang.Deprecated
    public final void showDialog(int p0) {}
    @java.lang.Deprecated
    public final boolean showDialog(int p0, android.os.Bundle p1) { return false; }
    public void showLockTaskEscapeMessage() {}
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void startActivities(android.content.Intent[] p0) {}
    public void startActivities(android.content.Intent[] p0, android.os.Bundle p1) {}
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.Bundle p1) {}
    public void startActivityAsCaller(android.content.Intent p0, android.os.Bundle p1, boolean p2, int p3) {}
    public void startActivityAsCaller(android.content.Intent p0, android.os.Bundle p1, boolean p2, int p3, int p4) {}
    public void startActivityAsUser(android.content.Intent p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    public void startActivityAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    public void startActivityForResult(android.content.Intent p0, int p1) {}
    public void startActivityForResult(android.content.Intent p0, int p1, android.os.Bundle p2) {}
    public void startActivityForResult(java.lang.String p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    @android.annotation.SystemApi
    public void startActivityForResultAsUser(android.content.Intent p0, int p1, android.os.Bundle p2, android.os.UserHandle p3) {}
    @android.annotation.SystemApi
    public void startActivityForResultAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    public void startActivityForResultAsUser(android.content.Intent p0, java.lang.String p1, int p2, android.os.Bundle p3, android.os.UserHandle p4) {}
    @java.lang.Deprecated
    public void startActivityFromChild(android.app.Activity p0, android.content.Intent p1, int p2) {}
    @java.lang.Deprecated
    public void startActivityFromChild(android.app.Activity p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    @java.lang.Deprecated
    public void startActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2) {}
    @java.lang.Deprecated
    public void startActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    public boolean startActivityIfNeeded(android.content.Intent p0, int p1) { return false; }
    public boolean startActivityIfNeeded(android.content.Intent p0, int p1, android.os.Bundle p2) { return false; }
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResult(android.content.IntentSender p0, int p1, android.content.Intent p2, int p3, int p4, int p5) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResult(android.content.IntentSender p0, int p1, android.content.Intent p2, int p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResult(android.content.IntentSender p0, java.lang.String p1, int p2, android.content.Intent p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResultInner(android.content.IntentSender p0, java.lang.String p1, int p2, android.content.Intent p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    @java.lang.Deprecated
    public void startIntentSenderFromChild(android.app.Activity p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6) throws android.content.IntentSender.SendIntentException {}
    @java.lang.Deprecated
    public void startIntentSenderFromChild(android.app.Activity p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6, android.os.Bundle p7) throws android.content.IntentSender.SendIntentException {}
    public void startLocalVoiceInteraction(android.os.Bundle p0) {}
    public void startLockTask() {}
    @java.lang.Deprecated
    public void startManagingCursor(android.database.Cursor p0) {}
    public boolean startNextMatchingActivity(android.content.Intent p0) { return false; }
    public boolean startNextMatchingActivity(android.content.Intent p0, android.os.Bundle p1) { return false; }
    public void startPostponedEnterTransition() {}
    public void startSearch(java.lang.String p0, boolean p1, android.os.Bundle p2, boolean p3) {}
    public void stopLocalVoiceInteraction() {}
    public void stopLockTask() {}
    @java.lang.Deprecated
    public void stopManagingCursor(android.database.Cursor p0) {}
    public void takeKeyEvents(boolean p0) {}
    public void triggerSearch(java.lang.String p0, android.os.Bundle p1) {}
    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterForContextMenu(android.view.View p0) {}
    public void unregisterRemoteAnimations() {}
    public void unregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback p0) {}
    public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.view.translation.UiTranslationSpec p4) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContentCaptureNotificationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DefaultKeyMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FullscreenModeRequest {
    }

    class HostCallbacks extends android.app.FragmentHostCallback<android.app.Activity> {
        public HostCallbacks(android.app.Activity p0) { super((android.content.Context)null, (android.os.Handler)null, 0); }
        public void onAttachFragment(android.app.Fragment p0) {}
        public void onDump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        public <T extends android.view.View> T onFindViewById(int p0) { return null; }
        public android.app.Activity onGetHost() { return null; }
        public android.view.LayoutInflater onGetLayoutInflater() { return null; }
        public int onGetWindowAnimations() { return 0; }
        public boolean onHasView() { return false; }
        public boolean onHasWindowAnimations() { return false; }
        public void onInvalidateOptionsMenu() {}
        public void onRequestPermissionsFromFragment(android.app.Fragment p0, java.lang.String[] p1, int p2) {}
        public boolean onShouldSaveFragmentState(android.app.Fragment p0) { return false; }
        public void onStartActivityAsUserFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3, android.os.UserHandle p4) {}
        public void onStartActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
        public void onStartIntentSenderFromFragment(android.app.Fragment p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6, android.os.Bundle p7) throws android.content.IntentSender.SendIntentException {}
        public boolean onUseFragmentManagerInflaterFactory() { return false; }
    }

    private static final class ManagedCursor {
        private final android.database.Cursor mCursor = null;
        private boolean mReleased;
        private boolean mUpdated;
        ManagedCursor(android.database.Cursor p0) {}
    }

    private static class ManagedDialog {
        android.os.Bundle mArgs;
        android.app.Dialog mDialog;
        private ManagedDialog() {}
    }

    static final class NonConfigurationInstances {
        java.lang.Object activity;
        java.util.HashMap<java.lang.String, java.lang.Object> children;
        android.app.FragmentManagerNonConfig fragments;
        android.util.ArrayMap<java.lang.String, android.app.LoaderManager> loaders;
        android.app.VoiceInteractor voiceInteractor;
        NonConfigurationInstances() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OverrideTransition {
    }

    private static final class RequestFinishCallback extends android.app.IRequestFinishCallback.Stub {
        private final java.lang.ref.WeakReference<android.app.Activity> mActivityRef = null;
        RequestFinishCallback(java.lang.ref.WeakReference<android.app.Activity> p0) { super(); }
        public void requestFinish() {}
    }

    public static interface ScreenCaptureCallback {
        public void onScreenCaptured();
    }

    @android.annotation.SystemApi
    public static interface TranslucentConversionListener {
        public void onTranslucentConversionComplete(boolean p0);
    }
}
