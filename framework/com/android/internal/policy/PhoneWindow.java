package com.android.internal.policy;

public class PhoneWindow extends android.view.Window implements com.android.internal.view.menu.MenuBuilder.Callback {
    private static final java.lang.String ACTION_BAR_TAG = "android:ActionBar";
    private static final int CUSTOM_TITLE_COMPATIBLE_FEATURES = 13505;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_BACKGROUND_FADE_DURATION_MS = 300;
    private static final long DISABLE_OPT_OUT_EDGE_TO_EDGE = 377864165L;
    private static final long ENFORCE_EDGE_TO_EDGE = 309578419L;
    private static final int ENFORCE_EDGE_TO_EDGE_SDK_VERSION = Integer.valueOf(0);
    static final int FLAG_RESOURCE_SET_ICON = 1;
    static final int FLAG_RESOURCE_SET_ICON_FALLBACK = 4;
    static final int FLAG_RESOURCE_SET_LOGO = 2;
    private static final java.lang.String FOCUSED_ID_TAG = "android:focusedViewId";
    private static final long OVERRIDE_LAYOUT_IN_DISPLAY_CUTOUT_MODE = 332679525L;
    private static final java.lang.String PANELS_TAG = "android:Panels";
    private static final java.lang.String TAG = "PhoneWindow";
    private static final android.transition.Transition USE_DEFAULT_TRANSITION = null;
    private static final java.lang.String VIEWS_TAG = "android:views";
    private static final android.view.Window.OnContentApplyWindowInsetsListener sDefaultContentInsetsApplier = null;
    static final com.android.internal.policy.PhoneWindow.RotationWatcher sRotationWatcher = null;
    private com.android.internal.policy.PhoneWindow.ActionMenuPresenterCallback mActionMenuPresenterCallback;
    private android.view.ViewRootImpl.ActivityConfigCallback mActivityConfigCallback;
    private java.lang.Boolean mAllowEnterTransitionOverlap;
    private java.lang.Boolean mAllowFloatingWindowsFillScreen;
    private java.lang.Boolean mAllowReturnTransitionOverlap;
    private boolean mAlwaysReadCloseOnTouchAttr;
    private android.media.AudioManager mAudioManager;
    private int mAudioMode;
    private int mBackgroundBlurRadius;
    android.graphics.drawable.Drawable mBackgroundDrawable;
    private long mBackgroundFadeDurationMillis;
    android.graphics.drawable.Drawable mBackgroundFallbackDrawable;
    private android.widget.ProgressBar mCircularProgressBar;
    private boolean mClipToOutline;
    private boolean mClosingActionMenu;
    android.view.ViewGroup mContentParent;
    private boolean mContentParentExplicitlySet;
    private android.transition.Scene mContentScene;
    com.android.internal.view.menu.ContextMenuBuilder mContextMenu;
    final com.android.internal.policy.PhoneWindow.PhoneWindowMenuCallback mContextMenuCallback = null;
    com.android.internal.view.menu.MenuHelper mContextMenuHelper;
    private com.android.internal.policy.DecorView mDecor;
    com.android.internal.widget.DecorContentParent mDecorContentParent;
    boolean mDecorFitsSystemWindows;
    private com.android.internal.policy.PhoneWindow.DrawableFeatureState[] mDrawables;
    boolean mEdgeToEdgeEnforced;
    private float mElevation;
    boolean mEnsureNavigationBarContrastWhenTransparent;
    boolean mEnsureStatusBarContrastWhenTransparent;
    private android.transition.Transition mEnterTransition;
    private android.transition.Transition mExitTransition;
    android.util.TypedValue mFixedHeightMajor;
    android.util.TypedValue mFixedHeightMinor;
    android.util.TypedValue mFixedWidthMajor;
    android.util.TypedValue mFixedWidthMinor;
    private boolean mForceDecorInstall;
    private boolean mForcedNavigationBarColor;
    private boolean mForcedStatusBarColor;
    private int mFrameResource;
    private android.widget.ProgressBar mHorizontalProgressBar;
    int mIconRes;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final java.lang.Runnable mInvalidatePanelMenuRunnable = null;
    boolean mIsFloating;
    private boolean mIsStartingWindow;
    private boolean mIsTranslucent;
    private android.app.KeyguardManager mKeyguardManager;
    private android.view.LayoutInflater mLayoutInflater;
    private android.widget.ImageView mLeftIconView;
    private boolean mLoadElevation;
    int mLogoRes;
    private android.media.session.MediaController mMediaController;
    private android.media.session.MediaSessionManager mMediaSessionManager;
    final android.util.TypedValue mMinWidthMajor = null;
    final android.util.TypedValue mMinWidthMinor = null;
    int mNavigationBarColor;
    boolean mNavigationBarColorSpecified;
    int mNavigationBarDividerColor;
    private android.media.AudioManager.OnModeChangedListener mOnModeChangedListener;
    int mPanelChordingKey;
    private com.android.internal.policy.PhoneWindow.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private com.android.internal.policy.PhoneWindow.PanelFeatureState[] mPanels;
    com.android.internal.policy.PhoneWindow.PanelFeatureState mPreparedPanel;
    private final android.window.ProxyOnBackInvokedDispatcher mProxyOnBackInvokedDispatcher = null;
    private android.transition.Transition mReenterTransition;
    int mResourcesSetFlags;
    private android.transition.Transition mReturnTransition;
    private android.widget.ImageView mRightIconView;
    private android.transition.Transition mSharedElementEnterTransition;
    private android.transition.Transition mSharedElementExitTransition;
    private android.transition.Transition mSharedElementReenterTransition;
    private android.transition.Transition mSharedElementReturnTransition;
    private java.lang.Boolean mSharedElementsUseOverlay;
    int mStatusBarColor;
    private boolean mSupportsPictureInPicture;
    android.view.InputQueue.Callback mTakeInputQueueCallback;
    android.view.SurfaceHolder.Callback2 mTakeSurfaceCallback;
    private int mTextColor;
    private int mTheme;
    private java.lang.CharSequence mTitle;
    private int mTitleColor;
    private android.widget.TextView mTitleView;
    private android.transition.TransitionManager mTransitionManager;
    private int mUiOptions;
    private boolean mUseDecorContext;
    private int mVolumeControlStreamType;
    public PhoneWindow(android.content.Context p0) { super(null); }
    public PhoneWindow(android.content.Context p0, android.view.Window p1, android.view.ViewRootImpl.ActivityConfigCallback p2) { super(null); }
    private void applyDecorFitsSystemWindows() {}
    private void callOnPanelClosed(int p0, com.android.internal.policy.PhoneWindow.PanelFeatureState p1, android.view.Menu p2) {}
    private static void clearMenuViews(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) {}
    private void closeContextMenu() {}
    private void dismissContextMenu() {}
    private android.widget.ProgressBar getCircularProgressBar(boolean p0) { return null; }
    private com.android.internal.policy.PhoneWindow.DrawableFeatureState getDrawableState(int p0, boolean p1) { return null; }
    private android.widget.ProgressBar getHorizontalProgressBar(boolean p0) { return null; }
    private android.app.KeyguardManager getKeyguardManager() { return null; }
    private android.widget.ImageView getLeftIconView() { return null; }
    private android.media.session.MediaSessionManager getMediaSessionManager() { return null; }
    private int getOptionsPanelGravity() { return 0; }
    private com.android.internal.policy.PhoneWindow.PanelFeatureState getPanelState(int p0, boolean p1, com.android.internal.policy.PhoneWindow.PanelFeatureState p2) { return null; }
    private android.widget.ImageView getRightIconView() { return null; }
    private android.transition.Transition getTransition(android.transition.Transition p0, android.transition.Transition p1, int p2) { return null; }
    private android.view.ViewRootImpl getViewRootImpl() { return null; }
    private android.view.ViewRootImpl getViewRootImplOrNull() { return null; }
    private void hideProgressBars(android.widget.ProgressBar p0, android.widget.ProgressBar p1) {}
    private void installDecor() {}
    private boolean isActivePhoneCallOngoing() { return false; }
    public static boolean isEdgeToEdgeEnforced(android.content.pm.ApplicationInfo p0, boolean p1, android.content.res.TypedArray p2) { return false; }
    private boolean isNotInstantAppAndKeyguardRestricted() { return false; }
    public static boolean isOptOutEdgeToEdgeEnabled(android.content.pm.ApplicationInfo p0, boolean p1) { return false; }
    public static boolean isOptingOutEdgeToEdgeEnforcement(android.content.pm.ApplicationInfo p0, boolean p1, android.content.res.TypedArray p2) { return false; }
    private boolean isTvUserSetupComplete() { return false; }
    private boolean launchDefaultSearch(android.view.KeyEvent p0) { return false; }
    private android.graphics.drawable.Drawable loadImageURI(android.net.Uri p0) { return null; }
    private void openPanel(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, android.view.KeyEvent p1) {}
    private void reopenMenu(boolean p0) {}
    private void restorePanelState(android.util.SparseArray<android.os.Parcelable> p0) {}
    private void savePanelState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public static void sendCloseSystemWindows(android.content.Context p0, java.lang.String p1) {}
    private void showProgressBars(android.widget.ProgressBar p0, android.widget.ProgressBar p1) {}
    private void transitionTo(android.transition.Scene p0) {}
    private void updateDrawable(int p0, com.android.internal.policy.PhoneWindow.DrawableFeatureState p1, boolean p2) {}
    private void updateInt(int p0, int p1, boolean p2) {}
    private void updateProgressBars(int p0) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void alwaysReadCloseOnTouchAttr() {}
    void checkCloseActionMenu(android.view.Menu p0) {}
    public void clearContentView() {}
    public final void closeAllPanels() {}
    public final void closePanel(int p0) {}
    public final void closePanel(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, boolean p1) {}
    public boolean decorFitsSystemWindows() { return false; }
    protected void dispatchWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    void doInvalidatePanelMenu(int p0) {}
    void doPendingInvalidatePanelMenu() {}
    public com.android.internal.policy.PhoneWindow.PanelFeatureState findMenuPanel(android.view.Menu p0) { return null; }
    protected com.android.internal.policy.DecorView generateDecor(int p0) { return null; }
    protected android.view.ViewGroup generateLayout(com.android.internal.policy.DecorView p0) { return null; }
    public boolean getAllowEnterTransitionOverlap() { return false; }
    public boolean getAllowReturnTransitionOverlap() { return false; }
    android.media.AudioManager getAudioManager() { return null; }
    public android.transition.Scene getContentScene() { return null; }
    public android.view.View getCurrentFocus() { return null; }
    public final android.view.View getDecorView() { return null; }
    public float getElevation() { return 0.0f; }
    public android.transition.Transition getEnterTransition() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    public android.view.WindowInsetsController getInsetsController() { return null; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    int getLocalFeaturesPrivate() { return 0; }
    public android.media.session.MediaController getMediaController() { return null; }
    public android.view.View getNavigationBarBackgroundView() { return null; }
    public int getNavigationBarColor() { return 0; }
    public int getNavigationBarDividerColor() { return 0; }
    public android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }
    com.android.internal.policy.PhoneWindow.PanelFeatureState getPanelState(int p0, boolean p1) { return null; }
    public android.transition.Transition getReenterTransition() { return null; }
    public android.transition.Transition getReturnTransition() { return null; }
    public android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
    public android.transition.Transition getSharedElementEnterTransition() { return null; }
    public android.transition.Transition getSharedElementExitTransition() { return null; }
    public android.transition.Transition getSharedElementReenterTransition() { return null; }
    public android.transition.Transition getSharedElementReturnTransition() { return null; }
    public boolean getSharedElementsUseOverlay() { return false; }
    public android.view.View getStatusBarBackgroundView() { return null; }
    public int getStatusBarColor() { return 0; }
    public java.util.List<android.graphics.Rect> getSystemGestureExclusionRects() { return null; }
    public long getTransitionBackgroundFadeDuration() { return 0L; }
    public android.transition.TransitionManager getTransitionManager() { return null; }
    public int getVolumeControlStream() { return 0; }
    protected boolean initializePanelContent(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    protected boolean initializePanelDecor(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    protected boolean initializePanelMenu(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    public void injectInputEvent(android.view.InputEvent p0) {}
    public void invalidatePanelMenu(int p0) {}
    public boolean isFloating() { return false; }
    public boolean isNavigationBarContrastEnforced() { return false; }
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1) { return false; }
    boolean isShowingWallpaper() { return false; }
    public boolean isStatusBarContrastEnforced() { return false; }
    public boolean isTranslucent() { return false; }
    protected void onActive() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onDestroy() {}
    protected void onDrawableChanged(int p0, android.graphics.drawable.Drawable p1, int p2) {}
    protected void onIntChanged(int p0, int p1) {}
    protected boolean onKeyDown(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public final boolean onKeyDownPanel(int p0, android.view.KeyEvent p1) { return false; }
    protected boolean onKeyUp(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public final void onKeyUpPanel(int p0, android.view.KeyEvent p1) {}
    public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    public void onMultiWindowModeChanged() {}
    void onOptionsPanelRotationChanged() {}
    public void onPictureInPictureModeChanged(boolean p0) {}
    void onViewRootImplSet(android.view.ViewRootImpl p0) {}
    public final void openPanel(int p0, android.view.KeyEvent p1) {}
    void openPanelsAfterRestore() {}
    public final android.view.View peekDecorView() { return null; }
    public boolean performContextMenuIdentifierAction(int p0, int p1) { return false; }
    public boolean performPanelIdentifierAction(int p0, int p1, int p2) { return false; }
    public boolean performPanelShortcut(int p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    boolean performPanelShortcut(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    public final boolean preparePanel(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, android.view.KeyEvent p1) { return false; }
    public void registerScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public boolean requestFeature(int p0) { return false; }
    public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) {}
    public void restoreHierarchyState(android.os.Bundle p0) {}
    public android.os.Bundle saveHierarchyState() { return null; }
    void sendCloseSystemWindows() {}
    void sendCloseSystemWindows(java.lang.String p0) {}
    public void setAllowEnterTransitionOverlap(boolean p0) {}
    public void setAllowReturnTransitionOverlap(boolean p0) {}
    public void setAttributes(android.view.WindowManager.LayoutParams p0) {}
    public final void setBackgroundBlurRadius(int p0) {}
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public final void setChildDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setChildInt(int p0, int p1) {}
    public final void setClipToOutline(boolean p0) {}
    public final void setContainer(android.view.Window p0) {}
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void setDecorCaptionShade(int p0) {}
    public void setDecorFitsSystemWindows(boolean p0) {}
    public void setDefaultIcon(int p0) {}
    public void setDefaultLogo(int p0) {}
    protected void setDefaultWindowFormat(int p0) {}
    public final void setElevation(float p0) {}
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    protected final void setFeatureDefaultDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public void setFeatureDrawableAlpha(int p0, int p1) {}
    public final void setFeatureDrawableResource(int p0, int p1) {}
    public final void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public final void setFeatureInt(int p0, int p1) {}
    public void setIcon(int p0) {}
    public void setIsStartingWindow(boolean p0) {}
    public void setLocalFocus(boolean p0, boolean p1) {}
    public void setLogo(int p0) {}
    public void setMediaController(android.media.session.MediaController p0) {}
    public void setNavigationBarColor(int p0) {}
    public void setNavigationBarContrastEnforced(boolean p0) {}
    public void setNavigationBarDividerColor(int p0) {}
    public void setReenterTransition(android.transition.Transition p0) {}
    public void setResizingCaptionDrawable(android.graphics.drawable.Drawable p0) {}
    public void setReturnTransition(android.transition.Transition p0) {}
    public void setSharedElementEnterTransition(android.transition.Transition p0) {}
    public void setSharedElementExitTransition(android.transition.Transition p0) {}
    public void setSharedElementReenterTransition(android.transition.Transition p0) {}
    public void setSharedElementReturnTransition(android.transition.Transition p0) {}
    public void setSharedElementsUseOverlay(boolean p0) {}
    public void setStatusBarColor(int p0) {}
    public void setStatusBarContrastEnforced(boolean p0) {}
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public void setTheme(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(java.lang.CharSequence p0, boolean p1) {}
    @java.lang.Deprecated
    public void setTitleColor(int p0) {}
    public void setTransitionBackgroundFadeDuration(long p0) {}
    public void setTransitionManager(android.transition.TransitionManager p0) {}
    public void setUiOptions(int p0) {}
    public void setUiOptions(int p0, int p1) {}
    public void setVolumeControlStream(int p0) {}
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void takeInputQueue(android.view.InputQueue.Callback p0) {}
    public void takeKeyEvents(boolean p0) {}
    public void takeSurface(android.view.SurfaceHolder.Callback2 p0) {}
    public final void togglePanel(int p0, android.view.KeyEvent p1) {}
    public void unregisterScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    protected final void updateDrawable(int p0, boolean p1) {}

    private final class ActionMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private ActionMenuPresenterCallback(com.android.internal.policy.PhoneWindow p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }

    private static final class DrawableFeatureState {
        int alpha;
        android.graphics.drawable.Drawable child;
        android.graphics.drawable.Drawable cur;
        int curAlpha;
        android.graphics.drawable.Drawable def;
        final int featureId = 0;
        android.graphics.drawable.Drawable local;
        int resid;
        android.net.Uri uri;
        DrawableFeatureState(int p0) {}
    }

    static final class PanelFeatureState {
        int background;
        android.view.View createdPanelView;
        com.android.internal.policy.DecorView decorView;
        int featureId;
        android.os.Bundle frozenActionViewState;
        android.os.Bundle frozenMenuState;
        int fullBackground;
        int gravity;
        com.android.internal.view.menu.IconMenuPresenter iconMenuPresenter;
        boolean isCompact;
        boolean isHandled;
        boolean isInExpandedMode;
        boolean isOpen;
        boolean isPrepared;
        com.android.internal.view.menu.ListMenuPresenter listMenuPresenter;
        int listPresenterTheme;
        com.android.internal.view.menu.MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        android.view.View shownPanelView;
        boolean wasLastExpanded;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;
        PanelFeatureState(int p0) {}
        void applyFrozenState() {}
        public void clearMenuPresenters() {}
        com.android.internal.view.menu.MenuView getIconMenuView(android.content.Context p0, com.android.internal.view.menu.MenuPresenter.Callback p1) { return null; }
        com.android.internal.view.menu.MenuView getListMenuView(android.content.Context p0, com.android.internal.view.menu.MenuPresenter.Callback p1) { return null; }
        public boolean hasPanelItems() { return false; }
        public boolean isInListMode() { return false; }
        void onRestoreInstanceState(android.os.Parcelable p0) {}
        android.os.Parcelable onSaveInstanceState() { return null; }
        void setMenu(com.android.internal.view.menu.MenuBuilder p0) {}
        void setStyle(android.content.Context p0) {}

        private static class SavedState implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<com.android.internal.policy.PhoneWindow.PanelFeatureState.SavedState> CREATOR = null;
            int featureId;
            boolean isInExpandedMode;
            boolean isOpen;
            android.os.Bundle menuState;
            private SavedState() {}
            private static com.android.internal.policy.PhoneWindow.PanelFeatureState.SavedState readFromParcel(android.os.Parcel p0) { return null; }
            public int describeContents() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    private class PanelMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private PanelMenuPresenterCallback(com.android.internal.policy.PhoneWindow p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }

    public static final class PhoneWindowMenuCallback implements com.android.internal.view.menu.MenuBuilder.Callback, com.android.internal.view.menu.MenuPresenter.Callback {
        private static final int FEATURE_ID = 6;
        private boolean mShowDialogForSubmenu;
        private com.android.internal.view.menu.MenuDialogHelper mSubMenuHelper;
        private final com.android.internal.policy.PhoneWindow mWindow = null;
        public PhoneWindowMenuCallback(com.android.internal.policy.PhoneWindow p0) {}
        private void onCloseSubMenu(com.android.internal.view.menu.MenuBuilder p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
        public void setShowDialogForSubmenu(boolean p0) {}
    }

    static class RotationWatcher extends android.view.IRotationWatcher.Stub {
        private android.os.Handler mHandler;
        private boolean mIsWatching;
        private final java.lang.Runnable mRotationChanged = null;
        private final java.util.ArrayList<java.lang.ref.WeakReference<com.android.internal.policy.PhoneWindow>> mWindows = null;
        RotationWatcher() { super(); }
        public void addWindow(com.android.internal.policy.PhoneWindow p0) {}
        void dispatchRotationChanged() {}
        public void onRotationChanged(int p0) throws android.os.RemoteException {}
        public void removeWindow(com.android.internal.policy.PhoneWindow p0) {}
    }

    static class WindowManagerHolder {
        static final android.view.IWindowManager sWindowManager = null;
        WindowManagerHolder() {}
    }
}
