package android.service.voice;

public class VoiceInteractionService extends android.app.Service {
    static final long MULTIPLE_ACTIVE_HOTWORD_DETECTORS = 193232191L;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.VoiceInteractionService";
    public static final java.lang.String SERVICE_META_DATA = "android.voice_interaction";
    private static final boolean SYSPROP_VISUAL_QUERY_SERVICE_ENABLED = Boolean.valueOf(false);
    static final java.lang.String TAG = null;
    private final java.util.Set<android.service.voice.HotwordDetector> mActiveDetectors = null;
    private android.service.voice.VisualQueryDetector mActiveVisualQueryDetector;
    private android.os.IBinder.DeathRecipient mDeathRecipient;
    android.service.voice.IVoiceInteractionService mInterface;
    private android.hardware.soundtrigger.KeyphraseEnrollmentInfo mKeyphraseEnrollmentInfo;
    private final java.lang.Object mLock = null;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    private boolean mTestModuleForAlwaysOnHotwordDetectorEnabled;
    public VoiceInteractionService() { super(); }
    private android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetectorInternal(java.lang.String p0, java.util.Locale p1, boolean p2, android.os.PersistableBundle p3, android.os.SharedMemory p4, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p5, java.util.concurrent.Executor p6, android.service.voice.AlwaysOnHotwordDetector.Callback p7) { return null; }
    private android.service.voice.HotwordDetector createHotwordDetectorInternal(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, android.service.voice.HotwordDetector.Callback p3) { return null; }
    private final android.hardware.soundtrigger.SoundTrigger.ModuleProperties getTestModuleProperties() { return null; }
    public static boolean isActiveService(android.content.Context p0, android.content.ComponentName p1) { return false; }
    private void onDetectorRemoteException(android.os.IBinder p0, int p1) {}
    private void onHandleVoiceActionCheck(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) {}
    private void onHotwordDetectorDestroyed(android.service.voice.HotwordDetector p0) {}
    private void onShutdownInternal() {}
    private void onSoundModelsChangedInternal() {}
    private void safelyShutdownAllHotwordDetectors(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.os.PersistableBundle p2, android.os.SharedMemory p3, android.service.voice.AlwaysOnHotwordDetector.Callback p4) { return null; }
    @android.annotation.SystemApi
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.os.PersistableBundle p2, android.os.SharedMemory p3, java.util.concurrent.Executor p4, android.service.voice.AlwaysOnHotwordDetector.Callback p5) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.service.voice.AlwaysOnHotwordDetector.Callback p2) { return null; }
    @android.annotation.SystemApi
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, java.util.concurrent.Executor p2, android.service.voice.AlwaysOnHotwordDetector.Callback p3) { return null; }
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetectorForTest(java.lang.String p0, java.util.Locale p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2, java.util.concurrent.Executor p3, android.service.voice.AlwaysOnHotwordDetector.Callback p4) { return null; }
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetectorForTest(java.lang.String p0, java.util.Locale p1, android.os.PersistableBundle p2, android.os.SharedMemory p3, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p4, java.util.concurrent.Executor p5, android.service.voice.AlwaysOnHotwordDetector.Callback p6) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public final android.service.voice.HotwordDetector createHotwordDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.service.voice.HotwordDetector.Callback p2) { return null; }
    @android.annotation.SystemApi
    public final android.service.voice.HotwordDetector createHotwordDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, android.service.voice.HotwordDetector.Callback p3) { return null; }
    @android.annotation.SystemApi
    public final android.media.voice.KeyphraseModelManager createKeyphraseModelManager() { return null; }
    @android.annotation.SystemApi
    public final android.service.voice.VisualQueryDetector createVisualQueryDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, android.service.voice.VisualQueryDetector.Callback p3) { return null; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public int getDisabledShowContext() { return 0; }
    protected final android.hardware.soundtrigger.KeyphraseEnrollmentInfo getKeyphraseEnrollmentInfo() { return null; }
    public final boolean isKeyphraseAndLocaleSupportedForHotword(java.lang.String p0, java.util.Locale p1) { return false; }
    public final java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public java.util.Set<java.lang.String> onGetSupportedVoiceActions(java.util.Set<java.lang.String> p0) { return null; }
    public void onLaunchVoiceAssistFromKeyguard() {}
    public void onPrepareToShowSession(android.os.Bundle p0, int p1) {}
    public void onReady() {}
    public void onShowSessionFailed(android.os.Bundle p0) {}
    public void onShutdown() {}
    public void setDisabledShowContext(int p0) {}
    public final void setInvocationEffectEnabled(boolean p0) {}
    public final void setTestModuleForAlwaysOnHotwordDetectorEnabled(boolean p0) {}
    public final void setUiHints(android.os.Bundle p0) {}
    public void showSession(android.os.Bundle p0, int p1) {}
}
