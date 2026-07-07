package com.android.internal.protolog;

public enum WmProtoLogGroups implements com.android.internal.protolog.common.IProtoLogGroup {
    TEST_GROUP((java.lang.String)null),
    WM_DEBUG_ADD_REMOVE((java.lang.String)null),
    WM_DEBUG_ANIM((java.lang.String)null),
    WM_DEBUG_APP_COMPAT((java.lang.String)null),
    WM_DEBUG_APP_LOCK((java.lang.String)null),
    WM_DEBUG_APP_TRANSITIONS((java.lang.String)null),
    WM_DEBUG_APP_TRANSITIONS_ANIM((java.lang.String)null),
    WM_DEBUG_BACK_PREVIEW((java.lang.String)null),
    WM_DEBUG_BOOT((java.lang.String)null),
    WM_DEBUG_CAMERA_COMPAT((java.lang.String)null),
    WM_DEBUG_CONFIGURATION((java.lang.String)null),
    WM_DEBUG_CONTAINERS((java.lang.String)null),
    WM_DEBUG_CONTENT_RECORDING((java.lang.String)null),
    WM_DEBUG_DIMMER((java.lang.String)null),
    WM_DEBUG_DRAW((java.lang.String)null),
    WM_DEBUG_DREAM((java.lang.String)null),
    WM_DEBUG_EMBEDDED_WINDOWS((java.lang.String)null),
    WM_DEBUG_FOCUS((java.lang.String)null),
    WM_DEBUG_FOCUS_LIGHT((java.lang.String)null),
    WM_DEBUG_IME((java.lang.String)null),
    WM_DEBUG_IMMERSIVE((java.lang.String)null),
    WM_DEBUG_KEEP_SCREEN_ON((java.lang.String)null),
    WM_DEBUG_LOCKTASK((java.lang.String)null),
    WM_DEBUG_ORIENTATION((java.lang.String)null),
    WM_DEBUG_ORIENTATION_CHANGE((java.lang.String)null),
    WM_DEBUG_PACKAGE_UPDATE((java.lang.String)null),
    WM_DEBUG_PRESENTATION((java.lang.String)null),
    WM_DEBUG_RECENTS_ANIMATIONS((java.lang.String)null),
    WM_DEBUG_REMOTE_ANIMATIONS((java.lang.String)null),
    WM_DEBUG_RESIZE((java.lang.String)null),
    WM_DEBUG_SCREEN_ON((java.lang.String)null),
    WM_DEBUG_SHARED_SURFACE((java.lang.String)null),
    WM_DEBUG_SLEEP_TOKEN((java.lang.String)null),
    WM_DEBUG_STARTING_WINDOW((java.lang.String)null),
    WM_DEBUG_STATES((java.lang.String)null),
    WM_DEBUG_SWITCH((java.lang.String)null),
    WM_DEBUG_SYNC_ENGINE((java.lang.String)null),
    WM_DEBUG_TASKS((java.lang.String)null),
    WM_DEBUG_TASKS_LAUNCH_PARAMS((java.lang.String)null),
    WM_DEBUG_TPL((java.lang.String)null),
    WM_DEBUG_WALLPAPER((java.lang.String)null),
    WM_DEBUG_WINDOW_INSETS((java.lang.String)null),
    WM_DEBUG_WINDOW_MOVEMENT((java.lang.String)null),
    WM_DEBUG_WINDOW_ORGANIZER((java.lang.String)null),
    WM_DEBUG_WINDOW_TRANSITIONS((java.lang.String)null),
    WM_DEBUG_WINDOW_TRANSITIONS_MIN((java.lang.String)null),
    WM_ERROR((java.lang.String)null),
    WM_SHOW_SURFACE_ALLOC((java.lang.String)null),
    WM_SHOW_TRANSACTIONS((java.lang.String)null);
    private static final com.android.internal.protolog.WmProtoLogGroups[] $VALUES = null;
    private final boolean mEnabled = false;
    private volatile boolean mLogToLogcat;
    private final java.lang.String mTag = null;
    private WmProtoLogGroups(java.lang.String p0) {}
    public int getId() { return 0; }
    public java.lang.String getTag() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isLogToLogcat() { return false; }
    public void setLogToLogcat(boolean p0) {}

    private static class Consts {
        private static final boolean ENABLE_DEBUG = true;
        private static final int START_ID = Integer.valueOf(0);
        private static final java.lang.String TAG_WM = "WindowManager";
        private Consts() {}
    }
}
