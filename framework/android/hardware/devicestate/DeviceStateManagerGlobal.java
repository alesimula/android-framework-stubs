package android.hardware.devicestate;

public final class DeviceStateManagerGlobal {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "DeviceStateManagerGlobal";
    private static android.hardware.devicestate.DeviceStateManagerGlobal sInstance;
    private android.hardware.devicestate.DeviceStateManagerGlobal.DeviceStateManagerCallback mCallback;
    private final java.util.ArrayList<android.hardware.devicestate.DeviceStateManagerGlobal.DeviceStateCallbackWrapper> mCallbacks = null;
    private final android.hardware.devicestate.IDeviceStateManager mDeviceStateManager = null;
    private android.hardware.devicestate.DeviceStateInfo mLastReceivedInfo;
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<android.os.IBinder, android.hardware.devicestate.DeviceStateManagerGlobal.DeviceStateRequestWrapper> mRequests = null;
    public DeviceStateManagerGlobal(android.hardware.devicestate.IDeviceStateManager p0) {}
    private int findCallbackLocked(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) { return 0; }
    private android.os.IBinder findRequestTokenLocked(android.hardware.devicestate.DeviceStateRequest p0) { return null; }
    public static android.hardware.devicestate.DeviceStateManagerGlobal getInstance() { return null; }
    private void handleDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) {}
    private void handleRequestActive(android.os.IBinder p0) {}
    private void handleRequestCanceled(android.os.IBinder p0) {}
    private void registerCallbackLocked() {}
    public void cancelBaseStateOverride() {}
    public void cancelStateRequest() {}
    public java.util.List<android.hardware.devicestate.DeviceState> getSupportedDeviceStates() { return null; }
    public void onStateRequestOverlayDismissed(boolean p0) {}
    public void registerDeviceStateCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0, java.util.concurrent.Executor p1) {}
    public void requestBaseStateOverride(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    public void requestState(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    public void unregisterDeviceStateCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) {}

    private static final class DeviceStateCallbackWrapper {
        private final android.hardware.devicestate.DeviceStateManager.DeviceStateCallback mDeviceStateCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        DeviceStateCallbackWrapper(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0, java.util.concurrent.Executor p1) {}
        private void execute(java.lang.String p0, java.lang.Runnable p1) {}
        void notifyDeviceStateChanged(android.hardware.devicestate.DeviceState p0) {}
        void notifySupportedDeviceStatesChanged(java.util.List<android.hardware.devicestate.DeviceState> p0) {}
    }

    private final class DeviceStateManagerCallback extends android.hardware.devicestate.IDeviceStateManagerCallback.Stub {
        private DeviceStateManagerCallback(android.hardware.devicestate.DeviceStateManagerGlobal p0) { super(); }
        public void onDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) {}
        public void onRequestActive(android.os.IBinder p0) {}
        public void onRequestCanceled(android.os.IBinder p0) {}
    }

    private static final class DeviceStateRequestWrapper {
        private final android.hardware.devicestate.DeviceStateRequest.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.hardware.devicestate.DeviceStateRequest mRequest = null;
        DeviceStateRequestWrapper(android.hardware.devicestate.DeviceStateRequest p0, android.hardware.devicestate.DeviceStateRequest.Callback p1, java.util.concurrent.Executor p2) {}
        private void validateRequestWrapperParameters(android.hardware.devicestate.DeviceStateRequest.Callback p0, java.util.concurrent.Executor p1) {}
        void notifyRequestActive() {}
        void notifyRequestCanceled() {}
    }
}
