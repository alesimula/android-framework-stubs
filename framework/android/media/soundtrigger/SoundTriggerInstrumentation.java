package android.media.soundtrigger;

public final class SoundTriggerInstrumentation {
    private final android.media.soundtrigger.SoundTriggerInstrumentation.GlobalCallback mClientCallback = null;
    private android.os.IBinder mClientToken;
    private final java.util.concurrent.Executor mGlobalCallbackExecutor = null;
    private android.media.soundtrigger_middleware.IInjectGlobalEvent mInjectGlobalEvent;
    private final java.lang.Object mLock = null;
    private java.util.Map<android.os.IBinder, android.media.soundtrigger.SoundTriggerInstrumentation.ModelSession> mModelSessionMap;
    private java.util.Map<android.os.IBinder, android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionSession> mRecognitionSessionMap;
    private final com.android.internal.app.ISoundTriggerService mService = null;
    public SoundTriggerInstrumentation(com.android.internal.app.ISoundTriggerService p0, java.util.concurrent.Executor p1, android.media.soundtrigger.SoundTriggerInstrumentation.GlobalCallback p2) {}
    public void setInPhoneCallState(boolean p0) {}
    public void setResourceContention(boolean p0) {}
    public void triggerOnResourcesAvailable() {}
    public void triggerRestart() {}

    public static interface GlobalCallback {
        default public void onClientAttached() {}
        default public void onClientDetached() {}
        default public void onFrameworkDetached() {}
        public void onModelLoaded(android.media.soundtrigger.SoundTriggerInstrumentation.ModelSession p0);
        default public void onPreempted() {}
        default public void onRestarted() {}
    }

    private class Injection extends android.media.soundtrigger_middleware.ISoundTriggerInjection.Stub {
        private Injection(android.media.soundtrigger.SoundTriggerInstrumentation p0) { super(); }
        public void onClientAttached(android.os.IBinder p0, android.media.soundtrigger_middleware.IInjectGlobalEvent p1) {}
        public void onClientDetached(android.os.IBinder p0) {}
        public void onFrameworkDetached(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) {}
        public void onParamSet(int p0, int p1, android.media.soundtrigger_middleware.IInjectModelEvent p2) {}
        public void onPreempted() {}
        public void onRecognitionStarted(int p0, android.media.soundtrigger.RecognitionConfig p1, android.media.soundtrigger_middleware.IInjectRecognitionEvent p2, android.media.soundtrigger_middleware.IInjectModelEvent p3) {}
        public void onRecognitionStopped(android.media.soundtrigger_middleware.IInjectRecognitionEvent p0) {}
        public void onRestarted(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) {}
        public void onSoundModelLoaded(android.media.soundtrigger.SoundModel p0, android.media.soundtrigger.Phrase[] p1, android.media.soundtrigger_middleware.IInjectModelEvent p2, android.media.soundtrigger_middleware.IInjectGlobalEvent p3) {}
        public void onSoundModelUnloaded(android.media.soundtrigger_middleware.IInjectModelEvent p0) {}
        public void registerGlobalEventInjection(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) {}
    }

    public static interface ModelCallback {
        default public void onModelUnloaded() {}
        default public void onParamSet(int p0, int p1) {}
        public void onRecognitionStarted(android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionSession p0);
    }

    public class ModelSession {
        private final java.util.List<java.util.function.Consumer<android.media.soundtrigger.SoundTriggerInstrumentation.ModelCallback>> mDroppedConsumerList = null;
        private final android.media.soundtrigger_middleware.IInjectModelEvent mInjectModelEvent = null;
        private final android.media.soundtrigger.SoundTriggerManager.Model mModel = null;
        private android.media.soundtrigger.SoundTriggerInstrumentation.ModelCallback mModelCallback;
        private java.util.concurrent.Executor mModelExecutor;
        private final android.hardware.soundtrigger.SoundTrigger.Keyphrase[] mPhrases = null;
        private ModelSession(android.media.soundtrigger.SoundTriggerInstrumentation p0, android.media.soundtrigger.SoundModel p1, android.media.soundtrigger.Phrase[] p2, android.media.soundtrigger_middleware.IInjectModelEvent p3) {}
        private void wrap(java.util.function.Consumer<android.media.soundtrigger.SoundTriggerInstrumentation.ModelCallback> p0) {}
        public void clearModelCallback() {}
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.Keyphrase> getPhrases() { return null; }
        public android.media.soundtrigger.SoundTriggerManager.Model getSoundModel() { return null; }
        public boolean isKeyphrase() { return false; }
        public void setModelCallback(java.util.concurrent.Executor p0, android.media.soundtrigger.SoundTriggerInstrumentation.ModelCallback p1) {}
        public void triggerUnloadModel() {}
    }

    public static interface RecognitionCallback {
        public void onRecognitionStopped();
    }

    public class RecognitionSession {
        private final int mAudioSession = 0;
        private final java.util.List<java.util.function.Consumer<android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionCallback>> mDroppedConsumerList = null;
        private final android.media.soundtrigger_middleware.IInjectRecognitionEvent mInjectRecognitionEvent = null;
        private android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionCallback mRecognitionCallback;
        private final android.hardware.soundtrigger.SoundTrigger.RecognitionConfig mRecognitionConfig = null;
        private java.util.concurrent.Executor mRecognitionExecutor;
        private RecognitionSession(android.media.soundtrigger.SoundTriggerInstrumentation p0, int p1, android.media.soundtrigger.RecognitionConfig p2, android.media.soundtrigger_middleware.IInjectRecognitionEvent p3) {}
        private void wrap(java.util.function.Consumer<android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionCallback> p0) {}
        public void clearRecognitionCallback() {}
        public int getAudioSession() { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig getRecognitionConfig() { return null; }
        public void setRecognitionCallback(java.util.concurrent.Executor p0, android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionCallback p1) {}
        public void triggerAbortRecognition() {}
        public void triggerRecognitionEvent(byte[] p0, java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p1) {}
    }
}
