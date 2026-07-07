package android.app;

public final class AppInteractionManager {
    public static final java.lang.String ACTION_MANAGE_AGENT_APP_INTERACTION_ACCESS = "android.app.action.MANAGE_AGENT_APP_INTERACTION_ACCESS";
    public static final java.lang.String ACTION_MANAGE_APP_INTERACTION_ACCESS = "android.app.action.MANAGE_APP_INTERACTION_ACCESS";
    public static final java.lang.String ACTION_MANAGE_TARGET_APP_INTERACTION_ACCESS = "android.app.action.MANAGE_TARGET_APP_INTERACTION_ACCESS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_APP_INTERACTION_ACCESS = "android.app.action.REQUEST_APP_INTERACTION_ACCESS";
    private static final java.lang.String TAG = "AppInteractionManager";
    private final android.app.IAppInteractionManager mService = null;
    public AppInteractionManager(android.app.IAppInteractionManager p0) {}
    public android.content.Intent createRequestAccessIntent(java.lang.String p0) { return null; }
}
