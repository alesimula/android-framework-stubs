package android.app.contextualsearch;

@android.annotation.SystemApi
public final class ContextualSearchManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LAUNCH_CONTEXTUAL_SEARCH = "android.app.contextualsearch.action.LAUNCH_CONTEXTUAL_SEARCH";
    private static final boolean DEBUG = false;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_KEYBOARD_SHORTCUT = 11;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_HOME = 2;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_META = 10;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_NAV_HANDLE = 1;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_OVERVIEW = 3;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_OVERVIEW_ACTION = 4;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_OVERVIEW_MENU = 5;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_SYSTEM_ACTION = 9;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ENTRYPOINT = "android.app.contextualsearch.extra.ENTRYPOINT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_FLAG_SECURE_FOUND = "android.app.contextualsearch.extra.FLAG_SECURE_FOUND";
    public static final java.lang.String EXTRA_INVOCATION_TIME_MS = "android.app.contextualsearch.extra.INVOCATION_TIME_MS";
    public static final java.lang.String EXTRA_IS_AUDIO_PLAYING = "android.app.contextualsearch.extra.IS_AUDIO_PLAYING";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_MANAGED_PROFILE_VISIBLE = "android.app.contextualsearch.extra.IS_MANAGED_PROFILE_VISIBLE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SCREENSHOT = "android.app.contextualsearch.extra.SCREENSHOT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_TOKEN = "android.app.contextualsearch.extra.TOKEN";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VISIBLE_PACKAGE_NAMES = "android.app.contextualsearch.extra.VISIBLE_PACKAGE_NAMES";
    public static final java.lang.String FEATURE_CONTEXTUAL_SEARCH = "com.google.android.feature.CONTEXTUAL_SEARCH";
    private static final java.lang.String TAG = null;
    private static final java.util.Set<java.lang.Integer> VALID_ENTRYPOINT_VALUES = null;
    private final android.app.contextualsearch.IContextualSearchManager mService = null;
    public ContextualSearchManager() {}
    private void startContextualSearchInternal(int p0, android.app.contextualsearch.ContextualSearchConfig p1) {}
    @android.annotation.SystemApi
    public boolean isContextualSearchAvailable() { return false; }
    @android.annotation.SystemApi
    public void startContextualSearch(int p0) {}
    @android.annotation.SystemApi
    public void startContextualSearch(int p0, android.app.contextualsearch.ContextualSearchConfig p1) {}
    @android.annotation.SystemApi
    public void startContextualSearch(android.app.Activity p0, android.app.contextualsearch.ContextualSearchConfig p1) {}
    @android.annotation.SystemApi
    public void startContextualSearch(android.app.contextualsearch.ContextualSearchConfig p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Entrypoint {
    }
}
