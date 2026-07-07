package android.hardware.input;

public final class InputManagerGlobal {
    private static final java.lang.String TAG = "InputManagerGlobal";
    private static android.hardware.input.InputManagerGlobal sInstance;
    private android.util.SparseArray<android.hardware.input.InputManagerGlobal.RegisteredBatteryListeners> mBatteryListeners;
    private final java.lang.Object mBatteryListenersLock = null;
    private final android.hardware.input.IInputManager mIm = null;
    private android.hardware.input.IInputDeviceBatteryListener mInputDeviceBatteryListener;
    private final java.util.ArrayList<android.hardware.input.InputManagerGlobal.InputDeviceListenerDelegate> mInputDeviceListeners = null;
    private android.hardware.input.InputDeviceSensorManager mInputDeviceSensorManager;
    private android.util.SparseArray<android.view.InputDevice> mInputDevices;
    private android.hardware.input.InputManagerGlobal.InputDevicesChangedListener mInputDevicesChangedListener;
    private android.hardware.input.IKeyEventActivityListener mKeyEventActivityListener;
    private java.util.ArrayList<android.hardware.input.InputManager.KeyEventActivityListener> mKeyEventActivityListeners;
    private final java.lang.Object mKeyEventActivityLock = null;
    private android.hardware.input.IKeyGestureEventListener mKeyGestureEventListener;
    private final java.lang.Object mKeyGestureEventListenerLock = null;
    private java.util.ArrayList<android.hardware.input.InputManagerGlobal.KeyGestureEventListenerDelegate> mKeyGestureEventListeners;
    private android.hardware.input.IKeyGestureHandler mKeyGestureHandler;
    private final android.util.SparseArray<android.hardware.input.InputManager.KeyGestureEventHandler> mKeyGesturesToHandlerMap = null;
    private android.hardware.input.IKeyboardBacklightListener mKeyboardBacklightListener;
    private final java.lang.Object mKeyboardBacklightListenerLock = null;
    private java.util.ArrayList<android.hardware.input.InputManagerGlobal.KeyboardBacklightListenerDelegate> mKeyboardBacklightListeners;
    private final java.util.ArrayList<android.hardware.input.InputManagerGlobal.OnTabletModeChangedListenerDelegate> mOnTabletModeChangedListeners = null;
    private android.hardware.input.IStickyModifierStateListener mStickyModifierStateListener;
    private final java.lang.Object mStickyModifierStateListenerLock = null;
    private java.util.ArrayList<android.hardware.input.InputManagerGlobal.StickyModifierStateListenerDelegate> mStickyModifierStateListeners;
    private final java.lang.String mVelocityTrackerStrategy = null;
    public InputManagerGlobal(android.hardware.input.IInputManager p0) {}
    private static boolean containsDeviceId(int[] p0, int p1) { return false; }
    public static android.hardware.input.InputManagerGlobal.TestSession createTestSession(android.hardware.input.IInputManager p0) { return null; }
    private boolean debug() { return false; }
    private int findInputDeviceListenerLocked(android.hardware.input.InputManager.InputDeviceListener p0) { return 0; }
    private int findOnTabletModeChangedListenerLocked(android.hardware.input.InputManager.OnTabletModeChangedListener p0) { return 0; }
    public static android.hardware.input.InputManagerGlobal getInstance() { return null; }
    private void initializeTabletModeListenerLocked() {}
    private void onInputDevicesChanged(int[] p0) {}
    private void onTabletModeChanged(long p0, boolean p1) {}
    private void populateInputDevicesLocked() {}
    private void sendMessageToInputDeviceListenersLocked(int p0, int p1) {}
    public void addInputDeviceBatteryListener(int p0, java.util.concurrent.Executor p1, android.hardware.input.InputManager.InputDeviceBatteryListener p2) {}
    public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) {}
    public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) {}
    public void cancelCurrentTouch() {}
    void cancelVibrate(int p0, android.os.IBinder p1) {}
    void closeLightSession(int p0, android.os.IBinder p1) {}
    public android.hardware.input.VirtualGamepad createVirtualGamepad(android.hardware.input.VirtualGamepadConfig p0) { return null; }
    public android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0) { return null; }
    public android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.input.VirtualMouseConfig p0) { return null; }
    public boolean[] deviceHasKeys(int p0, int[] p1) { return null; }
    public boolean[] deviceHasKeys(int[] p0) { return null; }
    public void disableInputDevice(int p0) {}
    void disableSensor(int p0, int p1) {}
    public void enableInputDevice(int p0) {}
    boolean enableSensor(int p0, int p1, int p2, int p3) { return false; }
    boolean flushSensor(int p0, int p1) { return false; }
    android.hardware.input.HostUsiVersion getHostUsiVersion(android.view.Display p0) { return null; }
    public android.view.InputDevice getInputDevice(int p0) { return null; }
    public android.hardware.BatteryState getInputDeviceBatteryState(int p0, boolean p1) { return null; }
    public java.lang.String getInputDeviceBluetoothAddress(int p0) { return null; }
    android.view.InputDevice getInputDeviceByDescriptor(java.lang.String p0) { return null; }
    public int[] getInputDeviceIds() { return null; }
    public android.hardware.lights.LightsManager getInputDeviceLightsManager(int p0) { return null; }
    public android.hardware.SensorManager getInputDeviceSensorManager(int p0) { return null; }
    public android.os.Vibrator getInputDeviceVibrator(int p0, int p1) { return null; }
    public android.os.VibratorManager getInputDeviceVibratorManager(int p0) { return null; }
    public android.hardware.input.IInputManager getInputManagerService() { return null; }
    public android.view.KeyCharacterMap getKeyCharacterMap(android.hardware.input.KeyboardLayout p0) { return null; }
    public int getKeyCodeForKeyLocation(int p0, int p1) { return 0; }
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) { return null; }
    android.hardware.lights.LightState getLightState(int p0, android.hardware.lights.Light p1) { return null; }
    java.util.List<android.hardware.lights.Light> getLights(int p0) { return null; }
    android.hardware.input.InputSensorInfo[] getSensorList(int p0) { return null; }
    public int getSupportedButtons(int p0) { return 0; }
    public java.lang.String getVelocityTrackerStrategy() { return null; }
    int[] getVibratorIds(int p0) { return null; }
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) { return false; }
    public boolean injectInputEvent(android.view.InputEvent p0, int p1, int p2) { return false; }
    boolean isVibrating(int p0) { return false; }
    public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) { return null; }
    void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) {}
    public void pilferPointers(android.os.IBinder p0) {}
    public void registerInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener p0, android.os.Handler p1) {}
    boolean registerKeyEventActivityListener(android.hardware.input.InputManager.KeyEventActivityListener p0) { return false; }
    void registerKeyGestureEventHandler(java.util.List<java.lang.Integer> p0, android.hardware.input.InputManager.KeyGestureEventHandler p1) throws java.lang.IllegalArgumentException {}
    void registerKeyGestureEventListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.KeyGestureEventListener p1) throws java.lang.IllegalArgumentException {}
    void registerKeyboardBacklightListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.KeyboardBacklightListener p1) throws java.lang.IllegalArgumentException {}
    void registerOnTabletModeChangedListener(android.hardware.input.InputManager.OnTabletModeChangedListener p0, android.os.Handler p1) {}
    boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) { return false; }
    void registerStickyModifierStateListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.StickyModifierStateListener p1) throws java.lang.IllegalArgumentException {}
    boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) { return false; }
    void removeInputDeviceBatteryListener(int p0, android.hardware.input.InputManager.InputDeviceBatteryListener p1) {}
    public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) {}
    public void removeUniqueIdAssociationByPort(java.lang.String p0) {}
    void requestLights(int p0, android.hardware.lights.LightsRequest p1, android.os.IBinder p2) {}
    public void requestPointerCapture(android.os.IBinder p0, int p1) {}
    public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) { return false; }
    public void unregisterInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener p0) {}
    boolean unregisterKeyEventActivityListener(android.hardware.input.InputManager.KeyEventActivityListener p0) { return false; }
    void unregisterKeyGestureEventHandler(android.hardware.input.InputManager.KeyGestureEventHandler p0) {}
    void unregisterKeyGestureEventListener(android.hardware.input.InputManager.KeyGestureEventListener p0) {}
    void unregisterKeyboardBacklightListener(android.hardware.input.InputManager.KeyboardBacklightListener p0) {}
    void unregisterOnTabletModeChangedListener(android.hardware.input.InputManager.OnTabletModeChangedListener p0) {}
    void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) {}
    void unregisterStickyModifierStateListener(android.hardware.input.InputManager.StickyModifierStateListener p0) {}
    boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) { return false; }
    void vibrate(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) {}
    void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) {}

    private static final class InputDeviceBatteryListenerDelegate {
        final java.util.concurrent.Executor mExecutor = null;
        final android.hardware.input.InputManager.InputDeviceBatteryListener mListener = null;
        InputDeviceBatteryListenerDelegate(android.hardware.input.InputManager.InputDeviceBatteryListener p0, java.util.concurrent.Executor p1) {}
        void notifyBatteryStateChanged(android.hardware.input.IInputDeviceBatteryState p0) {}
    }

    private static final class InputDeviceListenerDelegate extends android.os.Handler {
        static final int MSG_DEVICE_ADDED = 1;
        static final int MSG_DEVICE_CHANGED = 3;
        static final int MSG_DEVICE_REMOVED = 2;
        public final android.hardware.input.InputManager.InputDeviceListener mListener = null;
        InputDeviceListenerDelegate(android.hardware.input.InputManager.InputDeviceListener p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class InputDevicesChangedListener extends android.hardware.input.IInputDevicesChangedListener.Stub {
        private InputDevicesChangedListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onInputDevicesChanged(int[] p0) throws android.os.RemoteException {}
    }

    private static final class KeyboardBacklightListenerDelegate {
        final java.util.concurrent.Executor mExecutor = null;
        final android.hardware.input.InputManager.KeyboardBacklightListener mListener = null;
        KeyboardBacklightListenerDelegate(android.hardware.input.InputManager.KeyboardBacklightListener p0, java.util.concurrent.Executor p1) {}
        void notifyKeyboardBacklightChange(int p0, android.hardware.input.IKeyboardBacklightState p1, boolean p2) {}
    }

    private static final class KeyGestureEventListenerDelegate {
        final java.util.concurrent.Executor mExecutor = null;
        final android.hardware.input.InputManager.KeyGestureEventListener mListener = null;
        KeyGestureEventListenerDelegate(android.hardware.input.InputManager.KeyGestureEventListener p0, java.util.concurrent.Executor p1) {}
        void onKeyGestureEvent(android.hardware.input.KeyGestureEvent p0) {}
    }

    private static final class LocalBatteryState extends android.hardware.BatteryState {
        private final float mCapacity = 0.0f;
        private final boolean mIsPresent = false;
        private final int mStatus = 0;
        LocalBatteryState() { super(); }
        LocalBatteryState(boolean p0, int p1, float p2) { super(); }
        public float getCapacity() { return 0.0f; }
        public int getStatus() { return 0; }
        public boolean isPresent() { return false; }
    }

    private class LocalInputDeviceBatteryListener extends android.hardware.input.IInputDeviceBatteryListener.Stub {
        private LocalInputDeviceBatteryListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onBatteryStateChanged(android.hardware.input.IInputDeviceBatteryState p0) {}
    }

    private class LocalKeyboardBacklightListener extends android.hardware.input.IKeyboardBacklightListener.Stub {
        private LocalKeyboardBacklightListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onBrightnessChanged(int p0, android.hardware.input.IKeyboardBacklightState p1, boolean p2) {}
    }

    private static final class LocalKeyboardBacklightState extends android.hardware.input.KeyboardBacklightState {
        private final int mBrightnessLevel = 0;
        private final int mMaxBrightnessLevel = 0;
        LocalKeyboardBacklightState(int p0, int p1) { super(); }
        public int getBrightnessLevel() { return 0; }
        public int getMaxBrightnessLevel() { return 0; }
    }

    private class LocalKeyEventActivityListener extends android.hardware.input.IKeyEventActivityListener.Stub {
        private LocalKeyEventActivityListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onKeyEventActivity() {}
    }

    private class LocalKeyGestureEventListener extends android.hardware.input.IKeyGestureEventListener.Stub {
        private LocalKeyGestureEventListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onKeyGestureEvent(android.hardware.input.AidlKeyGestureEvent p0) {}
    }

    private class LocalKeyGestureHandler extends android.hardware.input.IKeyGestureHandler.Stub {
        private LocalKeyGestureHandler(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void handleKeyGesture(android.hardware.input.AidlKeyGestureEvent p0, android.os.IBinder p1) {}
    }

    private static final class LocalStickyModifierState extends android.hardware.input.StickyModifierState {
        private final int mLockedModifierState = 0;
        private final int mModifierState = 0;
        LocalStickyModifierState(int p0, int p1) { super(); }
        public boolean isAltGrModifierLocked() { return false; }
        public boolean isAltGrModifierOn() { return false; }
        public boolean isAltModifierLocked() { return false; }
        public boolean isAltModifierOn() { return false; }
        public boolean isCtrlModifierLocked() { return false; }
        public boolean isCtrlModifierOn() { return false; }
        public boolean isMetaModifierLocked() { return false; }
        public boolean isMetaModifierOn() { return false; }
        public boolean isShiftModifierLocked() { return false; }
        public boolean isShiftModifierOn() { return false; }
    }

    private class LocalStickyModifierStateListener extends android.hardware.input.IStickyModifierStateListener.Stub {
        private LocalStickyModifierStateListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onStickyModifierStateChanged(int p0, int p1) {}
    }

    private static final class OnTabletModeChangedListenerDelegate extends android.os.Handler {
        private static final int MSG_TABLET_MODE_CHANGED = 0;
        public final android.hardware.input.InputManager.OnTabletModeChangedListener mListener = null;
        OnTabletModeChangedListenerDelegate(android.hardware.input.InputManager.OnTabletModeChangedListener p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void sendTabletModeChanged(long p0, boolean p1) {}
    }

    private static final class RegisteredBatteryListeners {
        final java.util.List<android.hardware.input.InputManagerGlobal.InputDeviceBatteryListenerDelegate> mDelegates = null;
        android.hardware.input.IInputDeviceBatteryState mInputDeviceBatteryState;
        private RegisteredBatteryListeners() {}
    }

    private static final class StickyModifierStateListenerDelegate {
        final java.util.concurrent.Executor mExecutor = null;
        final android.hardware.input.InputManager.StickyModifierStateListener mListener = null;
        StickyModifierStateListenerDelegate(android.hardware.input.InputManager.StickyModifierStateListener p0, java.util.concurrent.Executor p1) {}
        void notifyStickyModifierStateChange(int p0, int p1) {}
    }

    private final class TabletModeChangedListener extends android.hardware.input.ITabletModeChangedListener.Stub {
        private TabletModeChangedListener(android.hardware.input.InputManagerGlobal p0) { super(); }
        public void onTabletModeChanged(long p0, boolean p1) {}
    }

    public static interface TestSession extends java.lang.AutoCloseable {
        public void close();
    }
}
