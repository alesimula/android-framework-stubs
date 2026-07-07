package android.companion.virtual;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public final class VirtualDeviceManager {
    public static final int COMPUTER_CONTROL_VERSION = Integer.valueOf(0);
    @android.annotation.SystemApi
    public static final int LAUNCH_FAILURE_NO_ACTIVITY = 2;
    @android.annotation.SystemApi
    public static final int LAUNCH_FAILURE_PENDING_INTENT_CANCELED = 1;
    @android.annotation.SystemApi
    public static final int LAUNCH_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final java.lang.String PERSISTENT_DEVICE_ID_DEFAULT = "default:0";
    private static final java.lang.String TAG = "VirtualDeviceManager";
    private final java.util.List<android.companion.virtual.VirtualDeviceManager.AutomatedPackageListenerDelegate> mAutomatedPackageListeners = null;
    private final android.content.Context mContext = null;
    private final android.companion.virtual.IVirtualDeviceManager mService = null;
    private final java.util.List<android.companion.virtual.VirtualDeviceManager.VirtualDeviceListenerDelegate> mVirtualDeviceListeners = null;
    public VirtualDeviceManager(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1) {}
    public static boolean isVirtualCameraSupported() { return false; }
    @android.annotation.SystemApi
    public android.companion.virtual.VirtualDeviceManager.VirtualDevice createVirtualDevice(int p0, android.companion.virtual.VirtualDeviceParams p1) { return null; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getAllPersistentDeviceIds() { return null; }
    public android.os.IBinder getAudioFocusEnvironment(int p0) { return null; }
    public int getAudioPlaybackSessionId(int p0) { return 0; }
    public int getAudioRecordingSessionId(int p0) { return 0; }
    public android.companion.virtual.computercontrol.ComputerControlConsentManager getComputerControlConsentManager() { return null; }
    public int getDeviceIdForDisplayId(int p0) { return 0; }
    public int getDevicePolicy(int p0, int p1) { return 0; }
    public int getDevicePolicyForDisplayId(int p0, int p1) { return 0; }
    @android.annotation.SystemApi
    public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) { return null; }
    public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) { return null; }
    public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() { return null; }
    public boolean isComputerControlAvailable() { return false; }
    public boolean isPackageApprovedToRunComputerControlAutomation(java.lang.String p0, int p1) { return false; }
    public boolean isPackageTargetableForComputerControlAutomation(java.lang.String p0, int p1) { return false; }
    public boolean isValidVirtualDeviceId(int p0) { return false; }
    public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) { return false; }
    public void playSoundEffect(int p0, int p1) {}
    public void registerAutomatedPackageListener(java.util.concurrent.Executor p0, android.companion.virtual.computercontrol.AutomatedPackageListener p1) {}
    public void registerVirtualDeviceListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener p1) {}
    public void requestComputerControlSession(android.companion.virtual.computercontrol.ComputerControlSessionParams p0, java.util.concurrent.Executor p1, android.companion.virtual.computercontrol.ComputerControlSession.Callback p2) {}
    public void unregisterAutomatedPackageListener(android.companion.virtual.computercontrol.AutomatedPackageListener p0) {}
    public void unregisterVirtualDeviceListener(android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener p0) {}

    @android.annotation.SystemApi
    public static interface ActivityListener {
        default public void onActivityLaunchBlocked(int p0, android.content.ComponentName p1, android.os.UserHandle p2, android.content.IntentSender p3) {}
        default public void onActivityLaunchRequested(int p0, android.content.ComponentName p1, android.os.UserHandle p2) {}
        default public void onAuthenticationPrompt(int p0, java.lang.String p1) {}
        public void onDisplayEmpty(int p0);
        default public void onSecureWindowHidden(int p0) {}
        default public void onSecureWindowShown(int p0, android.content.ComponentName p1, android.os.UserHandle p2) {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1);
        default public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) {}
    }

    private static class AutomatedPackageListenerDelegate extends android.companion.virtual.computercontrol.IAutomatedPackageListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.virtual.computercontrol.AutomatedPackageListener mListener = null;
        private AutomatedPackageListenerDelegate(java.util.concurrent.Executor p0, android.companion.virtual.computercontrol.AutomatedPackageListener p1) { super(); }
        public void onAutomatedPackagesChanged(java.lang.String p0, java.util.List<java.lang.String> p1, android.os.UserHandle p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DisplayUiMode {
    }

    @android.annotation.SystemApi
    public static interface IntentInterceptorCallback {
        public void onIntentIntercepted(android.content.Intent p0);
    }

    private static class LocalComputerControlConsentManager implements android.companion.virtual.computercontrol.ComputerControlConsentManager {
        private final android.companion.virtual.computercontrol.IComputerControlConsentManager mConsentManager = null;
        private LocalComputerControlConsentManager(android.companion.virtual.computercontrol.IComputerControlConsentManager p0) {}
        public void clearAllUserConsents(int p0, java.lang.String p1) {}
        public int getUserConsent(int p0, java.lang.String p1, java.lang.String p2) { return 0; }
        public java.util.Map<java.lang.String, java.lang.Integer> getUserConsents(int p0, java.lang.String p1) { return null; }
        public void setUserConsent(int p0, java.lang.String p1, java.lang.String p2, int p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface PendingIntentLaunchStatus {
    }

    @android.annotation.SystemApi
    public static interface SoundEffectListener {
        public void onPlaySoundEffect(int p0);
    }

    @android.annotation.SystemApi
    public static class VirtualDevice implements java.lang.AutoCloseable {
        private final android.companion.virtual.VirtualDeviceInternal mVirtualDeviceInternal = null;
        private VirtualDevice(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1, int p2, android.companion.virtual.VirtualDeviceParams p3) throws android.os.RemoteException {}
        public VirtualDevice(android.content.Context p0, android.companion.virtual.IVirtualDevice p1) {}
        public void addActivityListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.ActivityListener p1) {}
        public void addActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) {}
        public void addActivityPolicyExemption(android.content.ComponentName p0) {}
        public void addSoundEffectListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.SoundEffectListener p1) {}
        public void close() {}
        public android.content.Context createContext() { return null; }
        public android.companion.virtual.audio.VirtualAudioDevice createVirtualAudioDevice(android.hardware.display.VirtualDisplay p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { return null; }
        public android.companion.virtual.camera.VirtualCamera createVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) { return null; }
        @java.lang.Deprecated
        public android.hardware.display.VirtualDisplay createVirtualDisplay(int p0, int p1, int p2, android.view.Surface p3, int p4, java.util.concurrent.Executor p5, android.hardware.display.VirtualDisplay.Callback p6) { return null; }
        public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, java.util.concurrent.Executor p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
        public android.hardware.input.VirtualDpad createVirtualDpad(android.hardware.input.VirtualDpadConfig p0) { return null; }
        @java.lang.Deprecated
        public android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        public android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0) { return null; }
        @java.lang.Deprecated
        public android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        public android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.input.VirtualMouseConfig p0) { return null; }
        public android.hardware.input.VirtualNavigationTouchpad createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0) { return null; }
        public android.hardware.input.VirtualRotaryEncoder createVirtualRotaryEncoder(android.hardware.input.VirtualRotaryEncoderConfig p0) { return null; }
        public android.hardware.input.VirtualStylus createVirtualStylus(android.hardware.input.VirtualStylusConfig p0) { return null; }
        @java.lang.Deprecated
        public android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        public android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0) { return null; }
        public int getDeviceId() { return 0; }
        public java.lang.String getPersistentDeviceId() { return null; }
        public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() { return null; }
        public void goToSleep() {}
        public void launchPendingIntent(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.IntConsumer p3) {}
        public void registerIntentInterceptor(android.content.IntentFilter p0, java.util.concurrent.Executor p1, android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p2) {}
        public void removeActivityListener(android.companion.virtual.VirtualDeviceManager.ActivityListener p0) {}
        public void removeActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) {}
        public void removeActivityPolicyExemption(android.content.ComponentName p0) {}
        public void removeSoundEffectListener(android.companion.virtual.VirtualDeviceManager.SoundEffectListener p0) {}
        public void setCurrentThermalStatus(int p0) {}
        public void setDevicePolicy(int p0, int p1) {}
        public void setDevicePolicy(int p0, int p1, int p2) {}
        public void setDisplayImePolicy(int p0, int p1) {}
        public void setDisplayInTouchMode(int p0, boolean p1) {}
        public void setDisplayUiMode(int p0, int p1) {}
        public void setShowPointerIcon(boolean p0) {}
        public void unregisterIntentInterceptor(android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p0) {}
        public void wakeUp() {}
    }

    public static interface VirtualDeviceListener {
        default public void onVirtualDeviceClosed(int p0) {}
        default public void onVirtualDeviceCreated(int p0) {}
    }

    private static class VirtualDeviceListenerDelegate extends android.companion.virtual.IVirtualDeviceListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener mListener = null;
        private VirtualDeviceListenerDelegate(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener p1) { super(); }
        public void onVirtualDeviceClosed(int p0) {}
        public void onVirtualDeviceCreated(int p0) {}
    }
}
