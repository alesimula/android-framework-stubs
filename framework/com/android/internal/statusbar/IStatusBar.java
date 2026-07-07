package com.android.internal.statusbar;

public interface IStatusBar extends android.os.IInterface {
    public void abortTransient(int p0, int p1) throws android.os.RemoteException;
    public void addQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void addQsTileToFrontOrEnd(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void animateCollapsePanels() throws android.os.RemoteException;
    public void animateExpandNotificationsPanel() throws android.os.RemoteException;
    public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException;
    public void appTransitionCancelled(int p0) throws android.os.RemoteException;
    public void appTransitionFinished(int p0) throws android.os.RemoteException;
    public void appTransitionPending(int p0) throws android.os.RemoteException;
    public void appTransitionStarting(int p0, long p1, long p2) throws android.os.RemoteException;
    public void cancelPreloadRecentApps() throws android.os.RemoteException;
    public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException;
    public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void confirmImmersivePrompt() throws android.os.RemoteException;
    public void disable(int p0, int p1, int p2) throws android.os.RemoteException;
    public void disableForAllDisplays(com.android.internal.statusbar.DisableStates p0) throws android.os.RemoteException;
    public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException;
    public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException;
    public void dumpProto(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void endMotionCuesSession() throws android.os.RemoteException;
    public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException;
    public void hideAuthenticationDialog(long p0) throws android.os.RemoteException;
    public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException;
    public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void immersiveModeChanged(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void moveFocusedTaskToDesktop(int p0) throws android.os.RemoteException;
    public void moveFocusedTaskToFullscreen(int p0) throws android.os.RemoteException;
    public void moveFocusedTaskToStageSplit(int p0, boolean p1) throws android.os.RemoteException;
    public void onBiometricAuthenticated(int p0) throws android.os.RemoteException;
    public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onCameraLaunchGestureDetected(int p0) throws android.os.RemoteException;
    public void onConfigurationChanged() throws android.os.RemoteException;
    public void onDisplayAddSystemDecorations(int p0) throws android.os.RemoteException;
    public void onDisplayInfoChanged() throws android.os.RemoteException;
    public void onDisplayRemoveSystemDecorations(int p0) throws android.os.RemoteException;
    public void onEmergencyActionLaunchGestureDetected() throws android.os.RemoteException;
    public void onProposedRotationChanged(int p0, boolean p1) throws android.os.RemoteException;
    public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, int p5, java.lang.String p6, com.android.internal.statusbar.LetterboxDetails[] p7) throws android.os.RemoteException;
    public void onWalletLaunchGestureDetected() throws android.os.RemoteException;
    public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void preloadRecentApps() throws android.os.RemoteException;
    public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException;
    public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void removeIcon(java.lang.String p0) throws android.os.RemoteException;
    public void requestAddTile(int p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.drawable.Icon p4, com.android.internal.statusbar.IAddTileResultCallback p5) throws android.os.RemoteException;
    public void requestMagnificationConnection(boolean p0) throws android.os.RemoteException;
    public void requestTileServiceListeningState(android.content.ComponentName p0) throws android.os.RemoteException;
    public void runGcForTest() throws android.os.RemoteException;
    public void setAgentTask(android.agenticon.AgentTaskUpdate p0, com.android.internal.statusbar.IAgentTaskCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException;
    public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException;
    public void setImeWindowStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setQsTiles(java.lang.String[] p0) throws android.os.RemoteException;
    public void setSplitscreenFocus(boolean p0) throws android.os.RemoteException;
    public void setTopAppHidesStatusBar(boolean p0) throws android.os.RemoteException;
    public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException;
    public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException;
    public void showAssistDisclosure() throws android.os.RemoteException;
    public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException;
    public void showGlobalActionsMenu() throws android.os.RemoteException;
    public void showInattentiveSleepWarning() throws android.os.RemoteException;
    public void showMediaOutputSwitcher(java.lang.String p0, android.os.UserHandle p1, android.media.session.MediaSession.Token p2) throws android.os.RemoteException;
    public void showOrHideGlobalActionsMenu() throws android.os.RemoteException;
    public void showPictureInPictureMenu() throws android.os.RemoteException;
    public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException;
    public void showPinningEscapeToast() throws android.os.RemoteException;
    public void showRearDisplayDialog(int p0) throws android.os.RemoteException;
    public void showRecentApps(boolean p0) throws android.os.RemoteException;
    public void showScreenPinningRequest(int p0) throws android.os.RemoteException;
    public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6, int p7) throws android.os.RemoteException;
    public void showTransient(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException;
    public void startAssist(android.os.Bundle p0) throws android.os.RemoteException;
    public void startMotionCuesSession(android.content.ComponentName p0, int p1, android.app.motioncues.MotionCuesSettings p2) throws android.os.RemoteException;
    public void startTracing() throws android.os.RemoteException;
    public void stopTracing() throws android.os.RemoteException;
    public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException;
    public void toggleKeyboardShortcutsMenu(int p0) throws android.os.RemoteException;
    public void toggleNotificationsPanel() throws android.os.RemoteException;
    public void toggleRecentApps() throws android.os.RemoteException;
    public void toggleSplitScreen() throws android.os.RemoteException;
    public void toggleTaskbar() throws android.os.RemoteException;
    public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException;
    public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException;
    public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.statusbar.IStatusBar {
        public Default() {}
        public void abortTransient(int p0, int p1) throws android.os.RemoteException {}
        public void addQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void addQsTileToFrontOrEnd(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void animateCollapsePanels() throws android.os.RemoteException {}
        public void animateExpandNotificationsPanel() throws android.os.RemoteException {}
        public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
        public void appTransitionCancelled(int p0) throws android.os.RemoteException {}
        public void appTransitionFinished(int p0) throws android.os.RemoteException {}
        public void appTransitionPending(int p0) throws android.os.RemoteException {}
        public void appTransitionStarting(int p0, long p1, long p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelPreloadRecentApps() throws android.os.RemoteException {}
        public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException {}
        public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void confirmImmersivePrompt() throws android.os.RemoteException {}
        public void disable(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void disableForAllDisplays(com.android.internal.statusbar.DisableStates p0) throws android.os.RemoteException {}
        public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
        public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException {}
        public void dumpProto(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void endMotionCuesSession() throws android.os.RemoteException {}
        public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException {}
        public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
        public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void immersiveModeChanged(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void moveFocusedTaskToDesktop(int p0) throws android.os.RemoteException {}
        public void moveFocusedTaskToFullscreen(int p0) throws android.os.RemoteException {}
        public void moveFocusedTaskToStageSplit(int p0, boolean p1) throws android.os.RemoteException {}
        public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
        public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onCameraLaunchGestureDetected(int p0) throws android.os.RemoteException {}
        public void onConfigurationChanged() throws android.os.RemoteException {}
        public void onDisplayAddSystemDecorations(int p0) throws android.os.RemoteException {}
        public void onDisplayInfoChanged() throws android.os.RemoteException {}
        public void onDisplayRemoveSystemDecorations(int p0) throws android.os.RemoteException {}
        public void onEmergencyActionLaunchGestureDetected() throws android.os.RemoteException {}
        public void onProposedRotationChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, int p5, java.lang.String p6, com.android.internal.statusbar.LetterboxDetails[] p7) throws android.os.RemoteException {}
        public void onWalletLaunchGestureDetected() throws android.os.RemoteException {}
        public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void preloadRecentApps() throws android.os.RemoteException {}
        public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
        public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
        public void requestAddTile(int p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.drawable.Icon p4, com.android.internal.statusbar.IAddTileResultCallback p5) throws android.os.RemoteException {}
        public void requestMagnificationConnection(boolean p0) throws android.os.RemoteException {}
        public void requestTileServiceListeningState(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void runGcForTest() throws android.os.RemoteException {}
        public void setAgentTask(android.agenticon.AgentTaskUpdate p0, com.android.internal.statusbar.IAgentTaskCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException {}
        public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException {}
        public void setImeWindowStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void setQsTiles(java.lang.String[] p0) throws android.os.RemoteException {}
        public void setSplitscreenFocus(boolean p0) throws android.os.RemoteException {}
        public void setTopAppHidesStatusBar(boolean p0) throws android.os.RemoteException {}
        public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException {}
        public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void showAssistDisclosure() throws android.os.RemoteException {}
        public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
        public void showGlobalActionsMenu() throws android.os.RemoteException {}
        public void showInattentiveSleepWarning() throws android.os.RemoteException {}
        public void showMediaOutputSwitcher(java.lang.String p0, android.os.UserHandle p1, android.media.session.MediaSession.Token p2) throws android.os.RemoteException {}
        public void showOrHideGlobalActionsMenu() throws android.os.RemoteException {}
        public void showPictureInPictureMenu() throws android.os.RemoteException {}
        public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
        public void showPinningEscapeToast() throws android.os.RemoteException {}
        public void showRearDisplayDialog(int p0) throws android.os.RemoteException {}
        public void showRecentApps(boolean p0) throws android.os.RemoteException {}
        public void showScreenPinningRequest(int p0) throws android.os.RemoteException {}
        public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6, int p7) throws android.os.RemoteException {}
        public void showTransient(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException {}
        public void startAssist(android.os.Bundle p0) throws android.os.RemoteException {}
        public void startMotionCuesSession(android.content.ComponentName p0, int p1, android.app.motioncues.MotionCuesSettings p2) throws android.os.RemoteException {}
        public void startTracing() throws android.os.RemoteException {}
        public void stopTracing() throws android.os.RemoteException {}
        public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
        public void toggleKeyboardShortcutsMenu(int p0) throws android.os.RemoteException {}
        public void toggleNotificationsPanel() throws android.os.RemoteException {}
        public void toggleRecentApps() throws android.os.RemoteException {}
        public void toggleSplitScreen() throws android.os.RemoteException {}
        public void toggleTaskbar() throws android.os.RemoteException {}
        public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
        public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
        public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBar {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBar";
        static final int TRANSACTION_abortTransient = 58;
        static final int TRANSACTION_addQsTile = 38;
        static final int TRANSACTION_addQsTileToFrontOrEnd = 39;
        static final int TRANSACTION_animateCollapsePanels = 7;
        static final int TRANSACTION_animateExpandNotificationsPanel = 5;
        static final int TRANSACTION_animateExpandSettingsPanel = 6;
        static final int TRANSACTION_appTransitionCancelled = 25;
        static final int TRANSACTION_appTransitionFinished = 27;
        static final int TRANSACTION_appTransitionPending = 24;
        static final int TRANSACTION_appTransitionStarting = 26;
        static final int TRANSACTION_cancelPreloadRecentApps = 18;
        static final int TRANSACTION_cancelRequestAddTile = 72;
        static final int TRANSACTION_clickQsTile = 42;
        static final int TRANSACTION_confirmImmersivePrompt = 20;
        static final int TRANSACTION_disable = 3;
        static final int TRANSACTION_disableForAllDisplays = 4;
        static final int TRANSACTION_dismissInattentiveSleepWarning = 60;
        static final int TRANSACTION_dismissKeyboardShortcutsMenu = 22;
        static final int TRANSACTION_dumpProto = 77;
        static final int TRANSACTION_endMotionCuesSession = 85;
        static final int TRANSACTION_handleSystemKey = 43;
        static final int TRANSACTION_hideAuthenticationDialog = 51;
        static final int TRANSACTION_hideRecentApps = 13;
        static final int TRANSACTION_hideToast = 62;
        static final int TRANSACTION_immersiveModeChanged = 21;
        static final int TRANSACTION_moveFocusedTaskToDesktop = 83;
        static final int TRANSACTION_moveFocusedTaskToFullscreen = 79;
        static final int TRANSACTION_moveFocusedTaskToStageSplit = 80;
        static final int TRANSACTION_onBiometricAuthenticated = 48;
        static final int TRANSACTION_onBiometricError = 50;
        static final int TRANSACTION_onBiometricHelp = 49;
        static final int TRANSACTION_onCameraLaunchGestureDetected = 30;
        static final int TRANSACTION_onConfigurationChanged = 87;
        static final int TRANSACTION_onDisplayAddSystemDecorations = 54;
        static final int TRANSACTION_onDisplayInfoChanged = 86;
        static final int TRANSACTION_onDisplayRemoveSystemDecorations = 55;
        static final int TRANSACTION_onEmergencyActionLaunchGestureDetected = 32;
        static final int TRANSACTION_onProposedRotationChanged = 36;
        static final int TRANSACTION_onSystemBarAttributesChanged = 56;
        static final int TRANSACTION_onWalletLaunchGestureDetected = 31;
        static final int TRANSACTION_passThroughShellCommand = 67;
        static final int TRANSACTION_preloadRecentApps = 17;
        static final int TRANSACTION_registerNearbyMediaDevicesProvider = 75;
        static final int TRANSACTION_remQsTile = 40;
        static final int TRANSACTION_removeIcon = 2;
        static final int TRANSACTION_requestAddTile = 71;
        static final int TRANSACTION_requestMagnificationConnection = 66;
        static final int TRANSACTION_requestTileServiceListeningState = 70;
        static final int TRANSACTION_runGcForTest = 69;
        static final int TRANSACTION_setAgentTask = 88;
        static final int TRANSACTION_setBiometicContextListener = 52;
        static final int TRANSACTION_setIcon = 1;
        static final int TRANSACTION_setImeWindowStatus = 10;
        static final int TRANSACTION_setNavigationBarLumaSamplingEnabled = 68;
        static final int TRANSACTION_setQsTiles = 41;
        static final int TRANSACTION_setSplitscreenFocus = 81;
        static final int TRANSACTION_setTopAppHidesStatusBar = 37;
        static final int TRANSACTION_setUdfpsRefreshRateCallback = 53;
        static final int TRANSACTION_setWindowState = 11;
        static final int TRANSACTION_showAssistDisclosure = 28;
        static final int TRANSACTION_showAuthenticationDialog = 47;
        static final int TRANSACTION_showGlobalActionsMenu = 34;
        static final int TRANSACTION_showInattentiveSleepWarning = 59;
        static final int TRANSACTION_showMediaOutputSwitcher = 82;
        static final int TRANSACTION_showOrHideGlobalActionsMenu = 35;
        static final int TRANSACTION_showPictureInPictureMenu = 33;
        static final int TRANSACTION_showPinningEnterExitToast = 44;
        static final int TRANSACTION_showPinningEscapeToast = 45;
        static final int TRANSACTION_showRearDisplayDialog = 78;
        static final int TRANSACTION_showRecentApps = 12;
        static final int TRANSACTION_showScreenPinningRequest = 19;
        static final int TRANSACTION_showShutdownUi = 46;
        static final int TRANSACTION_showToast = 61;
        static final int TRANSACTION_showTransient = 57;
        static final int TRANSACTION_showWirelessChargingAnimation = 9;
        static final int TRANSACTION_startAssist = 29;
        static final int TRANSACTION_startMotionCuesSession = 84;
        static final int TRANSACTION_startTracing = 63;
        static final int TRANSACTION_stopTracing = 64;
        static final int TRANSACTION_suppressAmbientDisplay = 65;
        static final int TRANSACTION_toggleKeyboardShortcutsMenu = 23;
        static final int TRANSACTION_toggleNotificationsPanel = 8;
        static final int TRANSACTION_toggleRecentApps = 14;
        static final int TRANSACTION_toggleSplitScreen = 16;
        static final int TRANSACTION_toggleTaskbar = 15;
        static final int TRANSACTION_unregisterNearbyMediaDevicesProvider = 76;
        static final int TRANSACTION_updateMediaTapToTransferReceiverDisplay = 74;
        static final int TRANSACTION_updateMediaTapToTransferSenderDisplay = 73;
        public Stub() { super(); }
        public static com.android.internal.statusbar.IStatusBar asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.statusbar.IStatusBar {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void abortTransient(int p0, int p1) throws android.os.RemoteException {}
            public void addQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void addQsTileToFrontOrEnd(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void animateCollapsePanels() throws android.os.RemoteException {}
            public void animateExpandNotificationsPanel() throws android.os.RemoteException {}
            public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
            public void appTransitionCancelled(int p0) throws android.os.RemoteException {}
            public void appTransitionFinished(int p0) throws android.os.RemoteException {}
            public void appTransitionPending(int p0) throws android.os.RemoteException {}
            public void appTransitionStarting(int p0, long p1, long p2) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelPreloadRecentApps() throws android.os.RemoteException {}
            public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException {}
            public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void confirmImmersivePrompt() throws android.os.RemoteException {}
            public void disable(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void disableForAllDisplays(com.android.internal.statusbar.DisableStates p0) throws android.os.RemoteException {}
            public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
            public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException {}
            public void dumpProto(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void endMotionCuesSession() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException {}
            public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
            public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void immersiveModeChanged(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void moveFocusedTaskToDesktop(int p0) throws android.os.RemoteException {}
            public void moveFocusedTaskToFullscreen(int p0) throws android.os.RemoteException {}
            public void moveFocusedTaskToStageSplit(int p0, boolean p1) throws android.os.RemoteException {}
            public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
            public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onCameraLaunchGestureDetected(int p0) throws android.os.RemoteException {}
            public void onConfigurationChanged() throws android.os.RemoteException {}
            public void onDisplayAddSystemDecorations(int p0) throws android.os.RemoteException {}
            public void onDisplayInfoChanged() throws android.os.RemoteException {}
            public void onDisplayRemoveSystemDecorations(int p0) throws android.os.RemoteException {}
            public void onEmergencyActionLaunchGestureDetected() throws android.os.RemoteException {}
            public void onProposedRotationChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, int p5, java.lang.String p6, com.android.internal.statusbar.LetterboxDetails[] p7) throws android.os.RemoteException {}
            public void onWalletLaunchGestureDetected() throws android.os.RemoteException {}
            public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void preloadRecentApps() throws android.os.RemoteException {}
            public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
            public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
            public void requestAddTile(int p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.drawable.Icon p4, com.android.internal.statusbar.IAddTileResultCallback p5) throws android.os.RemoteException {}
            public void requestMagnificationConnection(boolean p0) throws android.os.RemoteException {}
            public void requestTileServiceListeningState(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void runGcForTest() throws android.os.RemoteException {}
            public void setAgentTask(android.agenticon.AgentTaskUpdate p0, com.android.internal.statusbar.IAgentTaskCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException {}
            public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException {}
            public void setImeWindowStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void setQsTiles(java.lang.String[] p0) throws android.os.RemoteException {}
            public void setSplitscreenFocus(boolean p0) throws android.os.RemoteException {}
            public void setTopAppHidesStatusBar(boolean p0) throws android.os.RemoteException {}
            public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException {}
            public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void showAssistDisclosure() throws android.os.RemoteException {}
            public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
            public void showGlobalActionsMenu() throws android.os.RemoteException {}
            public void showInattentiveSleepWarning() throws android.os.RemoteException {}
            public void showMediaOutputSwitcher(java.lang.String p0, android.os.UserHandle p1, android.media.session.MediaSession.Token p2) throws android.os.RemoteException {}
            public void showOrHideGlobalActionsMenu() throws android.os.RemoteException {}
            public void showPictureInPictureMenu() throws android.os.RemoteException {}
            public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
            public void showPinningEscapeToast() throws android.os.RemoteException {}
            public void showRearDisplayDialog(int p0) throws android.os.RemoteException {}
            public void showRecentApps(boolean p0) throws android.os.RemoteException {}
            public void showScreenPinningRequest(int p0) throws android.os.RemoteException {}
            public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6, int p7) throws android.os.RemoteException {}
            public void showTransient(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException {}
            public void startAssist(android.os.Bundle p0) throws android.os.RemoteException {}
            public void startMotionCuesSession(android.content.ComponentName p0, int p1, android.app.motioncues.MotionCuesSettings p2) throws android.os.RemoteException {}
            public void startTracing() throws android.os.RemoteException {}
            public void stopTracing() throws android.os.RemoteException {}
            public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
            public void toggleKeyboardShortcutsMenu(int p0) throws android.os.RemoteException {}
            public void toggleNotificationsPanel() throws android.os.RemoteException {}
            public void toggleRecentApps() throws android.os.RemoteException {}
            public void toggleSplitScreen() throws android.os.RemoteException {}
            public void toggleTaskbar() throws android.os.RemoteException {}
            public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
            public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
            public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException {}
        }
    }
}
