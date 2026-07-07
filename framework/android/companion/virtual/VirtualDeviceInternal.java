package android.companion.virtual;

public class VirtualDeviceInternal {
    private final android.companion.virtual.IVirtualDeviceActivityListener mActivityListenerBinder = null;
    private final android.util.ArrayMap<android.companion.virtual.VirtualDeviceManager.ActivityListener, android.companion.virtual.VirtualDeviceInternal.ActivityListenerDelegate> mActivityListeners = null;
    private final java.lang.Object mActivityListenersLock = null;
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback, android.companion.virtual.VirtualDeviceInternal.IntentInterceptorDelegate> mIntentInterceptorListeners = null;
    private final java.lang.Object mIntentInterceptorListenersLock = null;
    private final android.companion.virtual.IVirtualDeviceSoundEffectListener mSoundEffectListener = null;
    private final android.util.ArrayMap<android.companion.virtual.VirtualDeviceManager.SoundEffectListener, android.companion.virtual.VirtualDeviceInternal.SoundEffectListenerDelegate> mSoundEffectListeners = null;
    private final java.lang.Object mSoundEffectListenersLock = null;
    private android.companion.virtual.audio.VirtualAudioDevice mVirtualAudioDevice;
    private final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    VirtualDeviceInternal(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1, int p2, android.companion.virtual.VirtualDeviceParams p3) throws android.os.RemoteException {}
    VirtualDeviceInternal(android.content.Context p0, android.companion.virtual.IVirtualDevice p1) {}
    void addActivityListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.ActivityListener p1) {}
    void addActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) {}
    void addSoundEffectListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.SoundEffectListener p1) {}
    void close() {}
    android.content.Context createContext() { return null; }
    android.companion.virtual.audio.VirtualAudioDevice createVirtualAudioDevice(android.hardware.display.VirtualDisplay p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { return null; }
    android.companion.virtual.camera.VirtualCamera createVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) { return null; }
    android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, java.util.concurrent.Executor p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
    android.hardware.input.VirtualDpad createVirtualDpad(android.hardware.input.VirtualDpadConfig p0) { return null; }
    android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0) { return null; }
    android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.input.VirtualMouseConfig p0) { return null; }
    android.hardware.input.VirtualNavigationTouchpad createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0) { return null; }
    android.hardware.input.VirtualRotaryEncoder createVirtualRotaryEncoder(android.hardware.input.VirtualRotaryEncoderConfig p0) { return null; }
    android.hardware.input.VirtualStylus createVirtualStylus(android.hardware.input.VirtualStylusConfig p0) { return null; }
    android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0) { return null; }
    int getDeviceId() { return 0; }
    java.lang.String getPersistentDeviceId() { return null; }
    java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() { return null; }
    void goToSleep() {}
    void launchPendingIntent(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.IntConsumer p3) {}
    void registerIntentInterceptor(android.content.IntentFilter p0, java.util.concurrent.Executor p1, android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p2) {}
    void removeActivityListener(android.companion.virtual.VirtualDeviceManager.ActivityListener p0) {}
    void removeActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) {}
    void removeSoundEffectListener(android.companion.virtual.VirtualDeviceManager.SoundEffectListener p0) {}
    void setCurrentThermalStatus(int p0) {}
    void setDevicePolicy(int p0, int p1) {}
    void setDevicePolicyForDisplay(int p0, int p1, int p2) {}
    void setDisplayImePolicy(int p0, int p1) {}
    void setDisplayInTouchMode(int p0, boolean p1) {}
    void setDisplayUiMode(int p0, int p1) {}
    void setShowPointerIcon(boolean p0) {}
    void unregisterIntentInterceptor(android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p0) {}
    void wakeUp() {}

    private static class ActivityListenerDelegate implements android.companion.virtual.VirtualDeviceManager.ActivityListener {
        private final android.companion.virtual.VirtualDeviceManager.ActivityListener mActivityListener = null;
        private final java.util.concurrent.Executor mExecutor = null;
        ActivityListenerDelegate(android.companion.virtual.VirtualDeviceManager.ActivityListener p0, java.util.concurrent.Executor p1) {}
        public void onActivityLaunchBlocked(int p0, android.content.ComponentName p1, android.os.UserHandle p2, android.content.IntentSender p3) {}
        public void onActivityLaunchRequested(int p0, android.content.ComponentName p1, android.os.UserHandle p2) {}
        public void onAuthenticationPrompt(int p0, java.lang.String p1) {}
        public void onDisplayEmpty(int p0) {}
        public void onSecureWindowHidden(int p0) {}
        public void onSecureWindowShown(int p0, android.content.ComponentName p1, android.os.UserHandle p2) {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1) {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) {}
    }

    private static class IntentInterceptorDelegate extends android.companion.virtual.IVirtualDeviceIntentInterceptor.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback mIntentInterceptorCallback = null;
        private IntentInterceptorDelegate(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p1) { super(); }
        public void onIntentIntercepted(android.content.Intent p0) {}
    }

    private static class SoundEffectListenerDelegate {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.virtual.VirtualDeviceManager.SoundEffectListener mSoundEffectListener = null;
        private SoundEffectListenerDelegate(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.SoundEffectListener p1) {}
        public void onPlaySoundEffect(int p0) {}
    }
}
