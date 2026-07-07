package com.android.internal.accessibility;

public class AccessibilityShortcutController {
    public static final android.content.ComponentName ACCESSIBILITY_BUTTON_COMPONENT_NAME = null;
    public static final android.content.ComponentName ACCESSIBILITY_HEARING_AIDS_COMPONENT_NAME = null;
    public static final android.content.ComponentName ACCESSIBILITY_HEARING_AIDS_TILE_COMPONENT_NAME = null;
    static final java.lang.String ACTION_LAUNCH_REMOVE_EXTRA_DIM_DIALOG = "com.android.systemui.action.LAUNCH_REMOVE_EXTRA_DIM_DIALOG";
    public static final android.content.ComponentName AUTOCLICK_COMPONENT_NAME = null;
    public static final android.content.ComponentName BOUNCE_KEYS_COMPONENT_NAME = null;
    public static final android.content.ComponentName COLOR_INVERSION_COMPONENT_NAME = null;
    public static final android.content.ComponentName COLOR_INVERSION_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName DALTONIZER_COMPONENT_NAME = null;
    public static final android.content.ComponentName DALTONIZER_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName FONT_SIZE_COMPONENT_NAME = null;
    public static final android.content.ComponentName FONT_SIZE_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName MAGNIFICATION_COMPONENT_NAME = null;
    public static final java.lang.String MAGNIFICATION_CONTROLLER_NAME = "com.android.server.accessibility.MagnificationController";
    public static final android.content.ComponentName MOUSE_KEYS_COMPONENT_NAME = null;
    public static final android.content.ComponentName ONE_HANDED_COMPONENT_NAME = null;
    public static final android.content.ComponentName ONE_HANDED_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName REDUCE_BRIGHT_COLORS_COMPONENT_NAME = null;
    public static final android.content.ComponentName REDUCE_BRIGHT_COLORS_TILE_SERVICE_COMPONENT_NAME = null;
    public static final android.content.ComponentName SLOW_KEYS_COMPONENT_NAME = null;
    public static final android.content.ComponentName STICKY_KEYS_COMPONENT_NAME = null;
    private static final java.lang.String TAG = "AccessibilityShortcutController";
    private static final android.media.AudioAttributes VIBRATION_ATTRIBUTES = null;
    private static java.util.Map<android.content.ComponentName, com.android.internal.accessibility.AccessibilityShortcutController.FrameworkFeatureInfo> sFrameworkShortcutFeaturesMap;
    private static java.lang.Boolean sSupportOneHandedModeForTesting;
    private android.app.AlertDialog mAlertDialog;
    private final android.content.Context mContext = null;
    public android.media.Ringtone mCurrentRingtone;
    private boolean mEnabledOnLockScreen;
    public com.android.internal.accessibility.util.FrameworkObjectProvider mFrameworkObjectProvider;
    private final android.os.Handler mHandler = null;
    private boolean mIsShortcutEnabled;
    private int mUserId;
    public final com.android.internal.accessibility.AccessibilityShortcutController.UserSetupCompleteObserver mUserSetupCompleteObserver = null;
    public AccessibilityShortcutController(android.content.Context p0, android.os.Handler p1, int p2) {}
    private android.app.AlertDialog createShortcutWarningDialog(int p0) { return null; }
    private void enableDefaultHardwareShortcut(int p0) {}
    public static java.util.Map<android.content.ComponentName, com.android.internal.accessibility.AccessibilityShortcutController.FrameworkFeatureInfo> getFrameworkShortcutFeaturesMap() { return null; }
    private android.accessibilityservice.AccessibilityServiceInfo getInfoForTargetService() { return null; }
    private java.lang.String getShortcutFeatureDescription(boolean p0) { return null; }
    private android.content.ComponentName getShortcutTargetComponentName() { return null; }
    private java.lang.String getShortcutWarningMessage(java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> p0) { return null; }
    private java.lang.String getShortcutWarningTitle(java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> p0) { return null; }
    private boolean hasFeatureLeanback() { return false; }
    private boolean hasShortcutTarget() { return false; }
    private static boolean isOneHandedModeSupported() { return false; }
    private boolean isServiceEnabled(android.accessibilityservice.AccessibilityServiceInfo p0) { return false; }
    private boolean performTtsPrompt(android.app.AlertDialog p0) { return false; }
    public static void setSupportOneHandedModeForTesting(java.lang.Boolean p0) {}
    private boolean shouldShowDialog() { return false; }
    private void showToast() {}
    public boolean isAccessibilityShortcutAvailable(boolean p0) { return false; }
    public void onSettingsChanged() {}
    public void performAccessibilityShortcut() {}
    public void playNotificationTone(int p0) {}
    public void setCurrentUser(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DialogStatus {
        public static final int NOT_SHOWN = 0;
        public static final int SHOWN = 1;
    }

    public static class ExtraDimFrameworkFeatureInfo extends com.android.internal.accessibility.AccessibilityShortcutController.FrameworkFeatureInfo {
        ExtraDimFrameworkFeatureInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { super(null, null, null, 0); }
        private void launchExtraDimDialog(android.content.Context p0) {}
        public boolean activateShortcut(android.content.Context p0, int p1) { return false; }
    }

    public static abstract class FrameworkFeatureInfo {
        private final int mLabelStringResourceId = 0;
        private final java.lang.String mSettingKey = null;
        private final java.lang.String mSettingOffValue = null;
        private final java.lang.String mSettingOnValue = null;
        FrameworkFeatureInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public java.lang.String getLabel(android.content.Context p0) { return null; }
        public java.lang.String getSettingKey() { return null; }
        public java.lang.String getSettingOffValue() { return null; }
        public java.lang.String getSettingOnValue() { return null; }
    }

    public static class LaunchableFrameworkFeatureInfo extends com.android.internal.accessibility.AccessibilityShortcutController.FrameworkFeatureInfo {
        LaunchableFrameworkFeatureInfo(int p0) { super(null, null, null, 0); }
    }

    public static class ToggleableFrameworkFeatureInfo extends com.android.internal.accessibility.AccessibilityShortcutController.FrameworkFeatureInfo {
        ToggleableFrameworkFeatureInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { super(null, null, null, 0); }
    }

    public class UserSetupCompleteObserver extends android.database.ContentObserver {
        private boolean mIsRegistered;
        private int mUserId;
        UserSetupCompleteObserver(com.android.internal.accessibility.AccessibilityShortcutController p0, android.os.Handler p1, int p2) { super((android.os.Handler)null); }
        private boolean isUserSetupComplete() { return false; }
        private void registerObserver() {}
        private void setEmptyShortcutTargetIfNeeded() {}
        private void unregisterObserver() {}
        public void onChange(boolean p0) {}
        void onUserSwitched(int p0) {}
    }
}
