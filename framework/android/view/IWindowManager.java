package android.view;

public interface IWindowManager extends android.os.IInterface {
    public static final int FIXED_TO_USER_ROTATION_DEFAULT = 0;
    public static final int FIXED_TO_USER_ROTATION_DISABLED = 1;
    public static final int FIXED_TO_USER_ROTATION_ENABLED = 2;
    public static final int FIXED_TO_USER_ROTATION_IF_NO_AUTO_ROTATION = 3;
    public void addKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException;
    public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException;
    public boolean addToSurfaceSyncGroup(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2, android.window.AddToSurfaceSyncGroupResult p3) throws android.os.RemoteException;
    public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public android.window.WindowContextInfo attachWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public android.window.WindowContextInfo attachWindowContextToDisplayContent(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public android.window.WindowContextInfo attachWindowContextToWindowToken(android.app.IApplicationThread p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void captureDisplay(int p0, android.window.ScreenCaptureInternal.CaptureArgs p1, android.window.ScreenCaptureInternal.ScreenCaptureListener p2) throws android.os.RemoteException;
    public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException;
    public void clearForcedDisplaySize(int p0) throws android.os.RemoteException;
    public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException;
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    public android.view.InputChannel createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean destroyInputConsumer(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void detachWindowContext(android.os.IBinder p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void dismissKeyguard(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void dispatchScrollToTop(int p0, int p1, int p2) throws android.os.RemoteException;
    public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult p0) throws android.os.RemoteException;
    public void freezeDisplayRotation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void freezeRotation(int p0, java.lang.String p1) throws android.os.RemoteException;
    public float getAnimationScale(int p0) throws android.os.RemoteException;
    public float[] getAnimationScales() throws android.os.RemoteException;
    public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) throws android.os.RemoteException;
    public int getBaseDisplayDensity(int p0) throws android.os.RemoteException;
    public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException;
    public float getCurrentAnimatorScale() throws android.os.RemoteException;
    public android.graphics.Region getCurrentImeTouchRegion() throws android.os.RemoteException;
    public int getDefaultDisplayRotation() throws android.os.RemoteException;
    public int getDisplayEngagementMode(int p0) throws android.os.RemoteException;
    public int getDisplayIdByUniqueId(java.lang.String p0) throws android.os.RemoteException;
    public int getDisplayImePolicy(int p0) throws android.os.RemoteException;
    public int getDisplayUserRotation(int p0) throws android.os.RemoteException;
    public int getDockedStackSide() throws android.os.RemoteException;
    public boolean getIgnoreOrientationRequest(int p0) throws android.os.RemoteException;
    public int getImeDisplayId() throws android.os.RemoteException;
    public int getInitialDisplayDensity(int p0) throws android.os.RemoteException;
    public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException;
    public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException;
    public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException;
    public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException;
    public int getRemoveContentMode(int p0) throws android.os.RemoteException;
    public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException;
    public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException;
    public void getWindowInsets(int p0, android.os.IBinder p1, android.view.InsetsState p2) throws android.os.RemoteException;
    public int getWindowingMode(int p0) throws android.os.RemoteException;
    public boolean hasNavigationBar(int p0) throws android.os.RemoteException;
    public void hideTransientBars(int p0) throws android.os.RemoteException;
    public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException;
    public boolean isEligibleForDesktopMode(int p0) throws android.os.RemoteException;
    public boolean isGlobalKey(int p0) throws android.os.RemoteException;
    public boolean isInTouchMode(int p0) throws android.os.RemoteException;
    public boolean isKeyguardLocked() throws android.os.RemoteException;
    public boolean isKeyguardSecure(int p0) throws android.os.RemoteException;
    public boolean isLayerTracing() throws android.os.RemoteException;
    public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException;
    public boolean isRotationFrozen() throws android.os.RemoteException;
    public boolean isSafeModeEnabled() throws android.os.RemoteException;
    public boolean isTaskSnapshotSupported() throws android.os.RemoteException;
    public boolean isTransitionTraceEnabled() throws android.os.RemoteException;
    public boolean isViewServerRunning() throws android.os.RemoteException;
    public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isWindowTraceEnabled() throws android.os.RemoteException;
    public void lockNow(android.os.Bundle p0) throws android.os.RemoteException;
    public void markSurfaceSyncGroupReady(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) throws android.os.RemoteException;
    public void onNotificationShadeExpanded(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void refreshScreenCaptureDisabled() throws android.os.RemoteException;
    public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException;
    public void registerDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException;
    public void registerDisplayEngagementModeCallback(android.window.IDisplayEngagementModeCallback p0) throws android.os.RemoteException;
    public void registerDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException;
    public int[] registerDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException;
    public void registerEngagementControlRequestConsumer(android.window.IEngagementControlRequestConsumer p0) throws android.os.RemoteException;
    public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException;
    public int registerProposedRotationListener(android.os.IBinder p0, android.view.IRotationWatcher p1) throws android.os.RemoteException;
    public boolean registerScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException;
    public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException;
    public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException;
    public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException;
    public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.ITrustedPresentationListener p1, android.window.TrustedPresentationThresholds p2, int p3) throws android.os.RemoteException;
    public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException;
    public void removeKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException;
    public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException;
    public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public boolean reparentWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public boolean replaceContentOnDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void requestEngagementControlState(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void requestImeKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException;
    public void saveWindowTraceToFile() throws android.os.RemoteException;
    public void screenCapture(android.window.ScreenCapture.ScreenCaptureParams p0, android.window.IScreenCaptureCallback p1) throws android.os.RemoteException;
    public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException;
    public void setActiveTransactionTracing(boolean p0) throws android.os.RemoteException;
    public void setAnimationScale(int p0, float p1) throws android.os.RemoteException;
    public void setAnimationScales(float[] p0) throws android.os.RemoteException;
    public void setConfigurationChangeSettingsForUser(java.util.List<android.window.ConfigurationChangeSetting> p0, int p1) throws android.os.RemoteException;
    public void setDeviceStateAutoRotateSetting(int p0, boolean p1) throws android.os.RemoteException;
    public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException;
    public void setDisplayEngagementMode(int p0, int p1) throws android.os.RemoteException;
    public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException;
    public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException;
    public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException;
    public void setEventDispatching(boolean p0) throws android.os.RemoteException;
    public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException;
    public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setForcedDisplayDensityRatio(int p0, float p1, int p2) throws android.os.RemoteException;
    public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException;
    public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setGlobalDragListener(android.window.IGlobalDragListener p0) throws android.os.RemoteException;
    public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException;
    public void setInTouchMode(boolean p0, int p1) throws android.os.RemoteException;
    public void setInTouchModeOnAllDisplays(boolean p0) throws android.os.RemoteException;
    public void setLayerTracing(boolean p0) throws android.os.RemoteException;
    public void setLayerTracingFlags(int p0) throws android.os.RemoteException;
    public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException;
    public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException;
    public void setRecentsVisibility(boolean p0) throws android.os.RemoteException;
    public void setRemoveContentMode(int p0, int p1) throws android.os.RemoteException;
    public void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException;
    public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) throws android.os.RemoteException;
    public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException;
    public void setSwitchingUser(boolean p0) throws android.os.RemoteException;
    public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException;
    public void setWindowingMode(int p0, int p1) throws android.os.RemoteException;
    public boolean shouldShowSystemDecors(int p0) throws android.os.RemoteException;
    public boolean shouldShowWithInsecureKeyguard(int p0) throws android.os.RemoteException;
    public void showGlobalActions() throws android.os.RemoteException;
    public void showStrictModeViolation(boolean p0) throws android.os.RemoteException;
    public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException;
    public void startTransitionTrace() throws android.os.RemoteException;
    public boolean startViewServer(int p0) throws android.os.RemoteException;
    public void startWindowTrace() throws android.os.RemoteException;
    public void stopTransitionTrace() throws android.os.RemoteException;
    public boolean stopViewServer() throws android.os.RemoteException;
    public void stopWindowTrace() throws android.os.RemoteException;
    public void syncInputTransactions(boolean p0) throws android.os.RemoteException;
    public void thawDisplayRotation(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void thawRotation(java.lang.String p0) throws android.os.RemoteException;
    public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) throws android.os.RemoteException;
    public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException;
    public void unregisterDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException;
    public void unregisterDisplayEngagementModeCallback(android.window.IDisplayEngagementModeCallback p0) throws android.os.RemoteException;
    public void unregisterDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException;
    public void unregisterDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException;
    public void unregisterEngagementControlRequestConsumer(android.window.IEngagementControlRequestConsumer p0) throws android.os.RemoteException;
    public void unregisterScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException;
    public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException;
    public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException;
    public void unregisterTrustedPresentationListener(android.window.ITrustedPresentationListener p0, int p1) throws android.os.RemoteException;
    public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException;
    public void updateDisplayWindowAnimatingTypes(int p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void updateDisplayWindowRequestedVisibleTypes(int p0, int p1, int p2, android.view.inputmethod.ImeTracker.Token p3) throws android.os.RemoteException;
    public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException;
    public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException;
    public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowManager {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowManager";
        static final int TRANSACTION_addKeyguardLockedStateListener = 30;
        static final int TRANSACTION_addShellRoot = 22;
        static final int TRANSACTION_addToSurfaceSyncGroup = 144;
        static final int TRANSACTION_addWindowToken = 19;
        static final int TRANSACTION_attachWindowContextToDisplayArea = 125;
        static final int TRANSACTION_attachWindowContextToDisplayContent = 127;
        static final int TRANSACTION_attachWindowContextToWindowToken = 126;
        static final int TRANSACTION_captureDisplay = 141;
        static final int TRANSACTION_clearForcedDisplayDensityForUser = 13;
        static final int TRANSACTION_clearForcedDisplaySize = 8;
        static final int TRANSACTION_clearWindowContentFrameStats = 74;
        static final int TRANSACTION_closeSystemDialogs = 33;
        static final int TRANSACTION_createInputConsumer = 82;
        static final int TRANSACTION_destroyInputConsumer = 83;
        static final int TRANSACTION_detachWindowContext = 128;
        static final int TRANSACTION_disableKeyguard = 24;
        static final int TRANSACTION_dismissKeyguard = 29;
        static final int TRANSACTION_dispatchScrollToTop = 120;
        static final int TRANSACTION_exitKeyguardSecurely = 26;
        static final int TRANSACTION_freezeDisplayRotation = 56;
        static final int TRANSACTION_freezeRotation = 52;
        static final int TRANSACTION_getAnimationScale = 34;
        static final int TRANSACTION_getAnimationScales = 35;
        static final int TRANSACTION_getApplicationLaunchKeyboardShortcuts = 163;
        static final int TRANSACTION_getBaseDisplayDensity = 10;
        static final int TRANSACTION_getBaseDisplaySize = 6;
        static final int TRANSACTION_getCurrentAnimatorScale = 38;
        static final int TRANSACTION_getCurrentImeTouchRegion = 84;
        static final int TRANSACTION_getDefaultDisplayRotation = 45;
        static final int TRANSACTION_getDisplayEngagementMode = 155;
        static final int TRANSACTION_getDisplayIdByUniqueId = 11;
        static final int TRANSACTION_getDisplayImePolicy = 104;
        static final int TRANSACTION_getDisplayUserRotation = 46;
        static final int TRANSACTION_getDockedStackSide = 76;
        static final int TRANSACTION_getIgnoreOrientationRequest = 164;
        static final int TRANSACTION_getImeDisplayId = 133;
        static final int TRANSACTION_getInitialDisplayDensity = 9;
        static final int TRANSACTION_getInitialDisplaySize = 5;
        static final int TRANSACTION_getLetterboxBackgroundColorInArgb = 139;
        static final int TRANSACTION_getPossibleDisplayInfo = 115;
        static final int TRANSACTION_getPreferredOptionsPanelGravity = 50;
        static final int TRANSACTION_getRemoveContentMode = 98;
        static final int TRANSACTION_getStableInsets = 80;
        static final int TRANSACTION_getSupportedDisplayHashAlgorithms = 122;
        static final int TRANSACTION_getWindowContentFrameStats = 75;
        static final int TRANSACTION_getWindowInsets = 114;
        static final int TRANSACTION_getWindowingMode = 96;
        static final int TRANSACTION_hasNavigationBar = 71;
        static final int TRANSACTION_hideTransientBars = 67;
        static final int TRANSACTION_holdLock = 121;
        static final int TRANSACTION_isDisplayRotationFrozen = 58;
        static final int TRANSACTION_isEligibleForDesktopMode = 103;
        static final int TRANSACTION_isGlobalKey = 143;
        static final int TRANSACTION_isInTouchMode = 41;
        static final int TRANSACTION_isKeyguardLocked = 27;
        static final int TRANSACTION_isKeyguardSecure = 28;
        static final int TRANSACTION_isLayerTracing = 108;
        static final int TRANSACTION_isLetterboxBackgroundMultiColored = 140;
        static final int TRANSACTION_isRotationFrozen = 54;
        static final int TRANSACTION_isSafeModeEnabled = 73;
        static final int TRANSACTION_isTaskSnapshotSupported = 132;
        static final int TRANSACTION_isTransitionTraceEnabled = 95;
        static final int TRANSACTION_isViewServerRunning = 3;
        static final int TRANSACTION_isWindowToken = 18;
        static final int TRANSACTION_isWindowTraceEnabled = 92;
        static final int TRANSACTION_lockNow = 72;
        static final int TRANSACTION_markSurfaceSyncGroupReady = 145;
        static final int TRANSACTION_mirrorDisplay = 110;
        static final int TRANSACTION_mirrorWallpaperSurface = 62;
        static final int TRANSACTION_notifyScreenshotListeners = 146;
        static final int TRANSACTION_onNotificationShadeExpanded = 106;
        static final int TRANSACTION_openSession = 4;
        static final int TRANSACTION_reenableKeyguard = 25;
        static final int TRANSACTION_refreshScreenCaptureDisabled = 44;
        static final int TRANSACTION_registerCrossWindowBlurEnabledListener = 130;
        static final int TRANSACTION_registerDecorViewGestureListener = 148;
        static final int TRANSACTION_registerDisplayEngagementModeCallback = 156;
        static final int TRANSACTION_registerDisplayFoldListener = 85;
        static final int TRANSACTION_registerDisplayWindowListener = 87;
        static final int TRANSACTION_registerEngagementControlRequestConsumer = 159;
        static final int TRANSACTION_registerPinnedTaskListener = 77;
        static final int TRANSACTION_registerProposedRotationListener = 49;
        static final int TRANSACTION_registerScreenRecordingCallback = 152;
        static final int TRANSACTION_registerShortcutKey = 81;
        static final int TRANSACTION_registerSystemGestureExclusionListener = 65;
        static final int TRANSACTION_registerTaskFpsCallback = 135;
        static final int TRANSACTION_registerTrustedPresentationListener = 150;
        static final int TRANSACTION_registerWallpaperVisibilityListener = 63;
        static final int TRANSACTION_removeKeyguardLockedStateListener = 31;
        static final int TRANSACTION_removeRotationWatcher = 48;
        static final int TRANSACTION_removeWindowToken = 20;
        static final int TRANSACTION_reparentWindowContextToDisplayArea = 129;
        static final int TRANSACTION_replaceContentOnDisplay = 147;
        static final int TRANSACTION_requestAppKeyboardShortcuts = 78;
        static final int TRANSACTION_requestEngagementControlState = 158;
        static final int TRANSACTION_requestImeKeyboardShortcuts = 79;
        static final int TRANSACTION_requestScrollCapture = 119;
        static final int TRANSACTION_saveWindowTraceToFile = 91;
        static final int TRANSACTION_screenCapture = 142;
        static final int TRANSACTION_screenshotWallpaper = 61;
        static final int TRANSACTION_setActiveTransactionTracing = 118;
        static final int TRANSACTION_setAnimationScale = 36;
        static final int TRANSACTION_setAnimationScales = 37;
        static final int TRANSACTION_setConfigurationChangeSettingsForUser = 15;
        static final int TRANSACTION_setDeviceStateAutoRotateSetting = 51;
        static final int TRANSACTION_setDisplayChangeWindowController = 21;
        static final int TRANSACTION_setDisplayEngagementMode = 154;
        static final int TRANSACTION_setDisplayHashThrottlingEnabled = 124;
        static final int TRANSACTION_setDisplayImePolicy = 105;
        static final int TRANSACTION_setDisplayWindowInsetsController = 111;
        static final int TRANSACTION_setEventDispatching = 17;
        static final int TRANSACTION_setFixedToUserRotation = 59;
        static final int TRANSACTION_setForcedDisplayDensityForUser = 12;
        static final int TRANSACTION_setForcedDisplayDensityRatio = 14;
        static final int TRANSACTION_setForcedDisplayScalingMode = 16;
        static final int TRANSACTION_setForcedDisplaySize = 7;
        static final int TRANSACTION_setGlobalDragListener = 161;
        static final int TRANSACTION_setIgnoreOrientationRequest = 60;
        static final int TRANSACTION_setInTouchMode = 39;
        static final int TRANSACTION_setInTouchModeOnAllDisplays = 40;
        static final int TRANSACTION_setLayerTracing = 109;
        static final int TRANSACTION_setLayerTracingFlags = 117;
        static final int TRANSACTION_setNavBarVirtualKeyHapticFeedbackEnabled = 70;
        static final int TRANSACTION_setRecentsAppBehindSystemBars = 138;
        static final int TRANSACTION_setRecentsVisibility = 68;
        static final int TRANSACTION_setRemoveContentMode = 99;
        static final int TRANSACTION_setRotationAtAngleIfAllowed = 55;
        static final int TRANSACTION_setShellRootAccessibilityWindow = 23;
        static final int TRANSACTION_setShouldShowWithInsecureKeyguard = 101;
        static final int TRANSACTION_setStrictModeVisualIndicatorPreference = 43;
        static final int TRANSACTION_setSwitchingUser = 32;
        static final int TRANSACTION_setTaskSnapshotEnabled = 134;
        static final int TRANSACTION_setWindowingMode = 97;
        static final int TRANSACTION_shouldShowSystemDecors = 102;
        static final int TRANSACTION_shouldShowWithInsecureKeyguard = 100;
        static final int TRANSACTION_showGlobalActions = 116;
        static final int TRANSACTION_showStrictModeViolation = 42;
        static final int TRANSACTION_snapshotTaskForRecents = 137;
        static final int TRANSACTION_startTransitionTrace = 93;
        static final int TRANSACTION_startViewServer = 1;
        static final int TRANSACTION_startWindowTrace = 89;
        static final int TRANSACTION_stopTransitionTrace = 94;
        static final int TRANSACTION_stopViewServer = 2;
        static final int TRANSACTION_stopWindowTrace = 90;
        static final int TRANSACTION_syncInputTransactions = 107;
        static final int TRANSACTION_thawDisplayRotation = 57;
        static final int TRANSACTION_thawRotation = 53;
        static final int TRANSACTION_transferTouchGesture = 162;
        static final int TRANSACTION_unregisterCrossWindowBlurEnabledListener = 131;
        static final int TRANSACTION_unregisterDecorViewGestureListener = 149;
        static final int TRANSACTION_unregisterDisplayEngagementModeCallback = 157;
        static final int TRANSACTION_unregisterDisplayFoldListener = 86;
        static final int TRANSACTION_unregisterDisplayWindowListener = 88;
        static final int TRANSACTION_unregisterEngagementControlRequestConsumer = 160;
        static final int TRANSACTION_unregisterScreenRecordingCallback = 153;
        static final int TRANSACTION_unregisterSystemGestureExclusionListener = 66;
        static final int TRANSACTION_unregisterTaskFpsCallback = 136;
        static final int TRANSACTION_unregisterTrustedPresentationListener = 151;
        static final int TRANSACTION_unregisterWallpaperVisibilityListener = 64;
        static final int TRANSACTION_updateDisplayWindowAnimatingTypes = 113;
        static final int TRANSACTION_updateDisplayWindowRequestedVisibleTypes = 112;
        static final int TRANSACTION_updateStaticPrivacyIndicatorBounds = 69;
        static final int TRANSACTION_verifyDisplayHash = 123;
        static final int TRANSACTION_watchRotation = 47;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.view.IWindowManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addShellRoot_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void clearForcedDisplayDensityForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void clearForcedDisplaySize_enforcePermission() throws java.lang.SecurityException {}
        protected void dispatchScrollToTop_enforcePermission() throws java.lang.SecurityException {}
        protected void exitKeyguardSecurely_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentImeTouchRegion_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void mirrorWallpaperSurface_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerEngagementControlRequestConsumer_enforcePermission() throws java.lang.SecurityException {}
        protected void registerScreenRecordingCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void setConfigurationChangeSettingsForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisplayEngagementMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisplayWindowInsetsController_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplayDensityForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplayDensityRatio_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplayScalingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplaySize_enforcePermission() throws java.lang.SecurityException {}
        protected void setNavBarVirtualKeyHapticFeedbackEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setShellRootAccessibilityWindow_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterEngagementControlRequestConsumer_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterScreenRecordingCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void updateDisplayWindowAnimatingTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void updateDisplayWindowRequestedVisibleTypes_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.view.IWindowManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
            public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException { return null; }
            public boolean addToSurfaceSyncGroup(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2, android.window.AddToSurfaceSyncGroupResult p3) throws android.os.RemoteException { return false; }
            public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public android.window.WindowContextInfo attachWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
            public android.window.WindowContextInfo attachWindowContextToDisplayContent(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return null; }
            public android.window.WindowContextInfo attachWindowContextToWindowToken(android.app.IApplicationThread p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
            public void captureDisplay(int p0, android.window.ScreenCaptureInternal.CaptureArgs p1, android.window.ScreenCaptureInternal.ScreenCaptureListener p2) throws android.os.RemoteException {}
            public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException {}
            public void clearForcedDisplaySize(int p0) throws android.os.RemoteException {}
            public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public android.view.InputChannel createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public boolean destroyInputConsumer(android.os.IBinder p0, int p1) throws android.os.RemoteException { return false; }
            public void detachWindowContext(android.os.IBinder p0) throws android.os.RemoteException {}
            @java.lang.Deprecated
            public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void dismissKeyguard(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void dispatchScrollToTop(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult p0) throws android.os.RemoteException {}
            public void freezeDisplayRotation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void freezeRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public float getAnimationScale(int p0) throws android.os.RemoteException { return 0.0f; }
            public float[] getAnimationScales() throws android.os.RemoteException { return null; }
            public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) throws android.os.RemoteException { return null; }
            public int getBaseDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
            public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
            public float getCurrentAnimatorScale() throws android.os.RemoteException { return 0.0f; }
            public android.graphics.Region getCurrentImeTouchRegion() throws android.os.RemoteException { return null; }
            public int getDefaultDisplayRotation() throws android.os.RemoteException { return 0; }
            public int getDisplayEngagementMode(int p0) throws android.os.RemoteException { return 0; }
            public int getDisplayIdByUniqueId(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getDisplayImePolicy(int p0) throws android.os.RemoteException { return 0; }
            public int getDisplayUserRotation(int p0) throws android.os.RemoteException { return 0; }
            public int getDockedStackSide() throws android.os.RemoteException { return 0; }
            public boolean getIgnoreOrientationRequest(int p0) throws android.os.RemoteException { return false; }
            public int getImeDisplayId() throws android.os.RemoteException { return 0; }
            public int getInitialDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
            public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException { return 0; }
            public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException { return null; }
            public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException { return 0; }
            public int getRemoveContentMode(int p0) throws android.os.RemoteException { return 0; }
            public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException { return null; }
            public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void getWindowInsets(int p0, android.os.IBinder p1, android.view.InsetsState p2) throws android.os.RemoteException {}
            public int getWindowingMode(int p0) throws android.os.RemoteException { return 0; }
            public boolean hasNavigationBar(int p0) throws android.os.RemoteException { return false; }
            public void hideTransientBars(int p0) throws android.os.RemoteException {}
            public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException { return false; }
            public boolean isEligibleForDesktopMode(int p0) throws android.os.RemoteException { return false; }
            public boolean isGlobalKey(int p0) throws android.os.RemoteException { return false; }
            public boolean isInTouchMode(int p0) throws android.os.RemoteException { return false; }
            public boolean isKeyguardLocked() throws android.os.RemoteException { return false; }
            public boolean isKeyguardSecure(int p0) throws android.os.RemoteException { return false; }
            public boolean isLayerTracing() throws android.os.RemoteException { return false; }
            public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException { return false; }
            public boolean isRotationFrozen() throws android.os.RemoteException { return false; }
            public boolean isSafeModeEnabled() throws android.os.RemoteException { return false; }
            public boolean isTaskSnapshotSupported() throws android.os.RemoteException { return false; }
            public boolean isTransitionTraceEnabled() throws android.os.RemoteException { return false; }
            public boolean isViewServerRunning() throws android.os.RemoteException { return false; }
            public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean isWindowTraceEnabled() throws android.os.RemoteException { return false; }
            public void lockNow(android.os.Bundle p0) throws android.os.RemoteException {}
            public void markSurfaceSyncGroupReady(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
            public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) throws android.os.RemoteException { return null; }
            public void onNotificationShadeExpanded(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException { return null; }
            @java.lang.Deprecated
            public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void refreshScreenCaptureDisabled() throws android.os.RemoteException {}
            public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException { return false; }
            public void registerDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
            public void registerDisplayEngagementModeCallback(android.window.IDisplayEngagementModeCallback p0) throws android.os.RemoteException {}
            public void registerDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
            public int[] registerDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException { return null; }
            public void registerEngagementControlRequestConsumer(android.window.IEngagementControlRequestConsumer p0) throws android.os.RemoteException {}
            public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException {}
            public int registerProposedRotationListener(android.os.IBinder p0, android.view.IRotationWatcher p1) throws android.os.RemoteException { return 0; }
            public boolean registerScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException { return false; }
            public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException {}
            public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
            public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException {}
            public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.ITrustedPresentationListener p1, android.window.TrustedPresentationThresholds p2, int p3) throws android.os.RemoteException {}
            public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException { return false; }
            public void removeKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
            public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException {}
            public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public boolean reparentWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
            public boolean replaceContentOnDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
            public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void requestEngagementControlState(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void requestImeKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException {}
            public void saveWindowTraceToFile() throws android.os.RemoteException {}
            public void screenCapture(android.window.ScreenCapture.ScreenCaptureParams p0, android.window.IScreenCaptureCallback p1) throws android.os.RemoteException {}
            public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException { return null; }
            public void setActiveTransactionTracing(boolean p0) throws android.os.RemoteException {}
            public void setAnimationScale(int p0, float p1) throws android.os.RemoteException {}
            public void setAnimationScales(float[] p0) throws android.os.RemoteException {}
            public void setConfigurationChangeSettingsForUser(java.util.List<android.window.ConfigurationChangeSetting> p0, int p1) throws android.os.RemoteException {}
            public void setDeviceStateAutoRotateSetting(int p0, boolean p1) throws android.os.RemoteException {}
            public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException {}
            public void setDisplayEngagementMode(int p0, int p1) throws android.os.RemoteException {}
            public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException {}
            public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException {}
            public void setEventDispatching(boolean p0) throws android.os.RemoteException {}
            public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException {}
            public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setForcedDisplayDensityRatio(int p0, float p1, int p2) throws android.os.RemoteException {}
            public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException {}
            public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setGlobalDragListener(android.window.IGlobalDragListener p0) throws android.os.RemoteException {}
            public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException {}
            public void setInTouchMode(boolean p0, int p1) throws android.os.RemoteException {}
            public void setInTouchModeOnAllDisplays(boolean p0) throws android.os.RemoteException {}
            public void setLayerTracing(boolean p0) throws android.os.RemoteException {}
            public void setLayerTracingFlags(int p0) throws android.os.RemoteException {}
            public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException {}
            public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException {}
            public void setRecentsVisibility(boolean p0) throws android.os.RemoteException {}
            public void setRemoveContentMode(int p0, int p1) throws android.os.RemoteException {}
            public void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException {}
            public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) throws android.os.RemoteException {}
            public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException {}
            public void setSwitchingUser(boolean p0) throws android.os.RemoteException {}
            public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException {}
            public void setWindowingMode(int p0, int p1) throws android.os.RemoteException {}
            public boolean shouldShowSystemDecors(int p0) throws android.os.RemoteException { return false; }
            public boolean shouldShowWithInsecureKeyguard(int p0) throws android.os.RemoteException { return false; }
            public void showGlobalActions() throws android.os.RemoteException {}
            public void showStrictModeViolation(boolean p0) throws android.os.RemoteException {}
            public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException { return null; }
            public void startTransitionTrace() throws android.os.RemoteException {}
            public boolean startViewServer(int p0) throws android.os.RemoteException { return false; }
            public void startWindowTrace() throws android.os.RemoteException {}
            public void stopTransitionTrace() throws android.os.RemoteException {}
            public boolean stopViewServer() throws android.os.RemoteException { return false; }
            public void stopWindowTrace() throws android.os.RemoteException {}
            public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
            public void thawDisplayRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void thawRotation(java.lang.String p0) throws android.os.RemoteException {}
            public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) throws android.os.RemoteException { return false; }
            public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException {}
            public void unregisterDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
            public void unregisterDisplayEngagementModeCallback(android.window.IDisplayEngagementModeCallback p0) throws android.os.RemoteException {}
            public void unregisterDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
            public void unregisterDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException {}
            public void unregisterEngagementControlRequestConsumer(android.window.IEngagementControlRequestConsumer p0) throws android.os.RemoteException {}
            public void unregisterScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException {}
            public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
            public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException {}
            public void unregisterTrustedPresentationListener(android.window.ITrustedPresentationListener p0, int p1) throws android.os.RemoteException {}
            public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException {}
            public void updateDisplayWindowAnimatingTypes(int p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void updateDisplayWindowRequestedVisibleTypes(int p0, int p1, int p2, android.view.inputmethod.ImeTracker.Token p3) throws android.os.RemoteException {}
            public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException {}
            public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException { return null; }
            public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.view.IWindowManager {
        public Default() {}
        public void addKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
        public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException { return null; }
        public boolean addToSurfaceSyncGroup(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2, android.window.AddToSurfaceSyncGroupResult p3) throws android.os.RemoteException { return false; }
        public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public android.window.WindowContextInfo attachWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
        public android.window.WindowContextInfo attachWindowContextToDisplayContent(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return null; }
        public android.window.WindowContextInfo attachWindowContextToWindowToken(android.app.IApplicationThread p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        public void captureDisplay(int p0, android.window.ScreenCaptureInternal.CaptureArgs p1, android.window.ScreenCaptureInternal.ScreenCaptureListener p2) throws android.os.RemoteException {}
        public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException {}
        public void clearForcedDisplaySize(int p0) throws android.os.RemoteException {}
        public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public android.view.InputChannel createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public boolean destroyInputConsumer(android.os.IBinder p0, int p1) throws android.os.RemoteException { return false; }
        public void detachWindowContext(android.os.IBinder p0) throws android.os.RemoteException {}
        @java.lang.Deprecated
        public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void dismissKeyguard(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void dispatchScrollToTop(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult p0) throws android.os.RemoteException {}
        public void freezeDisplayRotation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void freezeRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public float getAnimationScale(int p0) throws android.os.RemoteException { return 0.0f; }
        public float[] getAnimationScales() throws android.os.RemoteException { return null; }
        public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) throws android.os.RemoteException { return null; }
        public int getBaseDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
        public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
        public float getCurrentAnimatorScale() throws android.os.RemoteException { return 0.0f; }
        public android.graphics.Region getCurrentImeTouchRegion() throws android.os.RemoteException { return null; }
        public int getDefaultDisplayRotation() throws android.os.RemoteException { return 0; }
        public int getDisplayEngagementMode(int p0) throws android.os.RemoteException { return 0; }
        public int getDisplayIdByUniqueId(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getDisplayImePolicy(int p0) throws android.os.RemoteException { return 0; }
        public int getDisplayUserRotation(int p0) throws android.os.RemoteException { return 0; }
        public int getDockedStackSide() throws android.os.RemoteException { return 0; }
        public boolean getIgnoreOrientationRequest(int p0) throws android.os.RemoteException { return false; }
        public int getImeDisplayId() throws android.os.RemoteException { return 0; }
        public int getInitialDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
        public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
        public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException { return 0; }
        public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException { return null; }
        public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException { return 0; }
        public int getRemoveContentMode(int p0) throws android.os.RemoteException { return 0; }
        public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException { return null; }
        public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void getWindowInsets(int p0, android.os.IBinder p1, android.view.InsetsState p2) throws android.os.RemoteException {}
        public int getWindowingMode(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasNavigationBar(int p0) throws android.os.RemoteException { return false; }
        public void hideTransientBars(int p0) throws android.os.RemoteException {}
        public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException { return false; }
        public boolean isEligibleForDesktopMode(int p0) throws android.os.RemoteException { return false; }
        public boolean isGlobalKey(int p0) throws android.os.RemoteException { return false; }
        public boolean isInTouchMode(int p0) throws android.os.RemoteException { return false; }
        public boolean isKeyguardLocked() throws android.os.RemoteException { return false; }
        public boolean isKeyguardSecure(int p0) throws android.os.RemoteException { return false; }
        public boolean isLayerTracing() throws android.os.RemoteException { return false; }
        public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException { return false; }
        public boolean isRotationFrozen() throws android.os.RemoteException { return false; }
        public boolean isSafeModeEnabled() throws android.os.RemoteException { return false; }
        public boolean isTaskSnapshotSupported() throws android.os.RemoteException { return false; }
        public boolean isTransitionTraceEnabled() throws android.os.RemoteException { return false; }
        public boolean isViewServerRunning() throws android.os.RemoteException { return false; }
        public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean isWindowTraceEnabled() throws android.os.RemoteException { return false; }
        public void lockNow(android.os.Bundle p0) throws android.os.RemoteException {}
        public void markSurfaceSyncGroupReady(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) throws android.os.RemoteException { return null; }
        public void onNotificationShadeExpanded(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException { return null; }
        @java.lang.Deprecated
        public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void refreshScreenCaptureDisabled() throws android.os.RemoteException {}
        public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException { return false; }
        public void registerDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
        public void registerDisplayEngagementModeCallback(android.window.IDisplayEngagementModeCallback p0) throws android.os.RemoteException {}
        public void registerDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
        public int[] registerDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException { return null; }
        public void registerEngagementControlRequestConsumer(android.window.IEngagementControlRequestConsumer p0) throws android.os.RemoteException {}
        public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException {}
        public int registerProposedRotationListener(android.os.IBinder p0, android.view.IRotationWatcher p1) throws android.os.RemoteException { return 0; }
        public boolean registerScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException { return false; }
        public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException {}
        public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
        public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException {}
        public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.ITrustedPresentationListener p1, android.window.TrustedPresentationThresholds p2, int p3) throws android.os.RemoteException {}
        public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException { return false; }
        public void removeKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
        public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException {}
        public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public boolean reparentWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
        public boolean replaceContentOnDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void requestEngagementControlState(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void requestImeKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException {}
        public void saveWindowTraceToFile() throws android.os.RemoteException {}
        public void screenCapture(android.window.ScreenCapture.ScreenCaptureParams p0, android.window.IScreenCaptureCallback p1) throws android.os.RemoteException {}
        public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException { return null; }
        public void setActiveTransactionTracing(boolean p0) throws android.os.RemoteException {}
        public void setAnimationScale(int p0, float p1) throws android.os.RemoteException {}
        public void setAnimationScales(float[] p0) throws android.os.RemoteException {}
        public void setConfigurationChangeSettingsForUser(java.util.List<android.window.ConfigurationChangeSetting> p0, int p1) throws android.os.RemoteException {}
        public void setDeviceStateAutoRotateSetting(int p0, boolean p1) throws android.os.RemoteException {}
        public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException {}
        public void setDisplayEngagementMode(int p0, int p1) throws android.os.RemoteException {}
        public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException {}
        public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException {}
        public void setEventDispatching(boolean p0) throws android.os.RemoteException {}
        public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException {}
        public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setForcedDisplayDensityRatio(int p0, float p1, int p2) throws android.os.RemoteException {}
        public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException {}
        public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setGlobalDragListener(android.window.IGlobalDragListener p0) throws android.os.RemoteException {}
        public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException {}
        public void setInTouchMode(boolean p0, int p1) throws android.os.RemoteException {}
        public void setInTouchModeOnAllDisplays(boolean p0) throws android.os.RemoteException {}
        public void setLayerTracing(boolean p0) throws android.os.RemoteException {}
        public void setLayerTracingFlags(int p0) throws android.os.RemoteException {}
        public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException {}
        public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException {}
        public void setRecentsVisibility(boolean p0) throws android.os.RemoteException {}
        public void setRemoveContentMode(int p0, int p1) throws android.os.RemoteException {}
        public void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException {}
        public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) throws android.os.RemoteException {}
        public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException {}
        public void setSwitchingUser(boolean p0) throws android.os.RemoteException {}
        public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException {}
        public void setWindowingMode(int p0, int p1) throws android.os.RemoteException {}
        public boolean shouldShowSystemDecors(int p0) throws android.os.RemoteException { return false; }
        public boolean shouldShowWithInsecureKeyguard(int p0) throws android.os.RemoteException { return false; }
        public void showGlobalActions() throws android.os.RemoteException {}
        public void showStrictModeViolation(boolean p0) throws android.os.RemoteException {}
        public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException { return null; }
        public void startTransitionTrace() throws android.os.RemoteException {}
        public boolean startViewServer(int p0) throws android.os.RemoteException { return false; }
        public void startWindowTrace() throws android.os.RemoteException {}
        public void stopTransitionTrace() throws android.os.RemoteException {}
        public boolean stopViewServer() throws android.os.RemoteException { return false; }
        public void stopWindowTrace() throws android.os.RemoteException {}
        public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
        public void thawDisplayRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void thawRotation(java.lang.String p0) throws android.os.RemoteException {}
        public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) throws android.os.RemoteException { return false; }
        public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException {}
        public void unregisterDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
        public void unregisterDisplayEngagementModeCallback(android.window.IDisplayEngagementModeCallback p0) throws android.os.RemoteException {}
        public void unregisterDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
        public void unregisterDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException {}
        public void unregisterEngagementControlRequestConsumer(android.window.IEngagementControlRequestConsumer p0) throws android.os.RemoteException {}
        public void unregisterScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException {}
        public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
        public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException {}
        public void unregisterTrustedPresentationListener(android.window.ITrustedPresentationListener p0, int p1) throws android.os.RemoteException {}
        public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException {}
        public void updateDisplayWindowAnimatingTypes(int p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void updateDisplayWindowRequestedVisibleTypes(int p0, int p1, int p2, android.view.inputmethod.ImeTracker.Token p3) throws android.os.RemoteException {}
        public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException {}
        public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException { return null; }
        public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException { return 0; }
    }
}
