package android.hardware.soundtrigger;

public class SoundTriggerModule {
    private static final int EVENT_MODEL_UNLOADED = 4;
    private static final int EVENT_RECOGNITION = 1;
    private static final int EVENT_RESOURCES_AVAILABLE = 3;
    private static final int EVENT_SERVICE_DIED = 2;
    private static final java.lang.String TAG = "SoundTriggerModule";
    private android.hardware.soundtrigger.SoundTriggerModule.EventHandlerDelegate mEventHandlerDelegate;
    private int mId;
    private android.media.soundtrigger_middleware.ISoundTriggerModule mService;
    public SoundTriggerModule(android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService p0, int p1, android.hardware.soundtrigger.SoundTrigger.StatusListener p2, android.os.Looper p3, android.media.permission.Identity p4) {}
    public SoundTriggerModule(android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService p0, int p1, android.hardware.soundtrigger.SoundTrigger.StatusListener p2, android.os.Looper p3, android.media.permission.Identity p4, android.media.permission.Identity p5, boolean p6) {}
    @java.lang.Deprecated
    public void detach() {}
    protected void finalize() {}
    public int getModelState(int p0) { return 0; }
    public int getParameter(int p0, int p1) { return 0; }
    @java.lang.Deprecated
    public int loadSoundModel(android.hardware.soundtrigger.SoundTrigger.SoundModel p0, int[] p1) { return 0; }
    public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) { return null; }
    public int setParameter(int p0, int p1, int p2) { return 0; }
    @java.lang.Deprecated
    public int startRecognition(int p0, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p1) { return 0; }
    public android.os.IBinder startRecognitionWithToken(int p0, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p1) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public int stopRecognition(int p0) { return 0; }
    @java.lang.Deprecated
    public int unloadSoundModel(int p0) { return 0; }

    private class EventHandlerDelegate extends android.media.soundtrigger_middleware.ISoundTriggerCallback.Stub implements android.os.IBinder.DeathRecipient {
        private final android.os.Handler mHandler = null;
        EventHandlerDelegate(android.hardware.soundtrigger.SoundTriggerModule p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Looper p2) { super(); }
        public void binderDied() {}
        public void onModelUnloaded(int p0) throws android.os.RemoteException {}
        public void onModuleDied() {}
        public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEventSys p1, int p2) throws android.os.RemoteException {}
        public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEventSys p1, int p2) throws android.os.RemoteException {}
        public void onResourcesAvailable() throws android.os.RemoteException {}
    }
}
