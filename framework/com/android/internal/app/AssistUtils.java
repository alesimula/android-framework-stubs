package com.android.internal.app;

public class AssistUtils {
    public static final int INVOCATION_TYPE_ASSIST_BUTTON = 7;
    public static final int INVOCATION_TYPE_GESTURE = 1;
    public static final int INVOCATION_TYPE_HOME_BUTTON_LONG_PRESS = 5;
    public static final java.lang.String INVOCATION_TYPE_KEY = "invocation_type";
    public static final int INVOCATION_TYPE_LAUNCHER_SYSTEM_SHORTCUT = 9;
    public static final int INVOCATION_TYPE_NAV_HANDLE_LONG_PRESS = 8;
    public static final int INVOCATION_TYPE_PHYSICAL_GESTURE = 2;
    public static final int INVOCATION_TYPE_POWER_BUTTON_LONG_PRESS = 6;
    public static final int INVOCATION_TYPE_QUICK_SEARCH_BAR = 4;
    public static final int INVOCATION_TYPE_STATUS_BAR_ICON = 10;
    public static final int INVOCATION_TYPE_UNKNOWN = 0;
    public static final int INVOCATION_TYPE_VOICE = 3;
    private static final java.lang.String TAG = "AssistUtils";
    private final android.content.Context mContext = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mVoiceInteractionManagerService = null;
    public AssistUtils(android.content.Context p0) {}
    public static boolean allowDisablingAssistDisclosure(android.content.Context p0) { return false; }
    public static boolean isDisclosureEnabled(android.content.Context p0) { return false; }
    public static boolean isPreinstalledAssistant(android.content.Context p0, android.content.ComponentName p1) { return false; }
    public static boolean shouldDisclose(android.content.Context p0, android.content.ComponentName p1) { return false; }
    private boolean showSessionForActiveServiceInternal(android.os.Bundle p0, int p1, java.lang.String p2, com.android.internal.app.IVoiceInteractionSessionShowCallback p3, android.os.IBinder p4) { return false; }
    public boolean activeServiceSupportsAssistGesture() { return false; }
    public boolean activeServiceSupportsLaunchFromKeyguard() { return false; }
    public void disableVisualQueryDetection() {}
    public void enableVisualQueryDetection(com.android.internal.app.IVisualQueryDetectionAttentionListener p0) {}
    public android.content.ComponentName getActiveServiceComponentName() { return null; }
    public void getActiveServiceSupportedActions(java.util.Set<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) {}
    public android.content.ComponentName getAssistComponentForUser(int p0) { return null; }
    public void hideCurrentSession() {}
    public boolean isSessionRunning() { return false; }
    public void launchVoiceAssistFromKeyguard() {}
    public void onLockscreenShown() {}
    public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) {}
    @java.lang.Deprecated
    public boolean showSessionForActiveService(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2, android.os.IBinder p3) { return false; }
    public boolean showSessionForActiveService(android.os.Bundle p0, int p1, java.lang.String p2, com.android.internal.app.IVoiceInteractionSessionShowCallback p3, android.os.IBinder p4) { return false; }
    public void subscribeVisualQueryRecognitionStatus(com.android.internal.app.IVisualQueryRecognitionStatusListener p0) {}
}
