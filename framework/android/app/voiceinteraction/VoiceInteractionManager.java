package android.app.voiceinteraction;

public final class VoiceInteractionManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_READ_SCREEN_CONTEXT = "android.app.voiceinteraction.action.REQUEST_READ_SCREEN_CONTEXT";
    public static final int READ_SCREEN_CONTEXT_REQUEST_STATE_GRANTED = 0;
    public static final int READ_SCREEN_CONTEXT_REQUEST_STATE_REQUESTABLE = 1;
    public static final int READ_SCREEN_CONTEXT_REQUEST_STATE_UNREQUESTABLE = 2;
    private final android.content.Context mContext = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mService = null;
    public VoiceInteractionManager(com.android.internal.app.IVoiceInteractionManagerService p0, android.content.Context p1) {}
    public boolean canReadScreenContext() { return false; }
    @android.annotation.SystemApi
    public void clearReadScreenContextRequestDeniedCount() {}
    public android.content.Intent createRequestReadScreenContextIntent() { return null; }
    public int getReadScreenContextRequestState() { return 0; }
    @android.annotation.SystemApi
    public int getReadScreenContextRequestState(int p0) { return 0; }
    @android.annotation.SystemApi
    public void incrementReadScreenContextRequestDeniedCount() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReadScreenContextRequestState {
    }
}
