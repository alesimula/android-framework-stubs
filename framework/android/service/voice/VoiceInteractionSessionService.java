package android.service.voice;

public abstract class VoiceInteractionSessionService extends android.app.Service {
    static final int MSG_NEW_SESSION = 1;
    private static final java.lang.String TAG = "VoiceInteractionSession";
    com.android.internal.os.HandlerCaller mHandlerCaller;
    final com.android.internal.os.HandlerCaller.Callback mHandlerCallerCallback = null;
    android.service.voice.IVoiceInteractionSessionService mInterface;
    android.service.voice.VoiceInteractionSession mSession;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    public VoiceInteractionSessionService() { super(); }
    private boolean deliverSession(android.os.IBinder p0) { return false; }
    void doNewSession(android.os.IBinder p0, android.os.Bundle p1, int p2) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onCreate() {}
    public void onLowMemory() {}
    public abstract android.service.voice.VoiceInteractionSession onNewSession(android.os.Bundle p0);
    public void onTrimMemory(int p0) {}
}
