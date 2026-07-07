package android.hardware.devicestate;

@android.annotation.SystemApi
public final class DeviceStateManager {
    public static final java.lang.String ACTION_SHOW_REAR_DISPLAY_OVERLAY = "com.android.intent.action.SHOW_REAR_DISPLAY_OVERLAY";
    public static final java.lang.String EXTRA_ORIGINAL_DEVICE_BASE_STATE = "original_device_base_state";
    public static final android.hardware.devicestate.DeviceState INVALID_DEVICE_STATE = null;
    public static final int INVALID_DEVICE_STATE_IDENTIFIER = -1;
    public static final int MAXIMUM_DEVICE_STATE_IDENTIFIER = 10000;
    public static final int MINIMUM_DEVICE_STATE_IDENTIFIER = 0;
    private final android.hardware.devicestate.DeviceStateManagerGlobal mGlobal = null;
    public DeviceStateManager() {}
    public void cancelBaseStateOverride() {}
    public void cancelStateRequest() {}
    public java.util.List<android.hardware.devicestate.DeviceState> getSupportedDeviceStates() { return null; }
    public void registerCallback(java.util.concurrent.Executor p0, android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p1) {}
    public void requestBaseStateOverride(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    public void requestState(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    public void unregisterCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) {}

    public static interface DeviceStateCallback {
        public void onDeviceStateChanged(android.hardware.devicestate.DeviceState p0);
        default public void onSupportedStatesChanged(java.util.List<android.hardware.devicestate.DeviceState> p0) {}
    }

    public static class FoldStateListener implements android.hardware.devicestate.DeviceStateManager.DeviceStateCallback {
        private java.lang.Boolean lastResult;
        private final java.util.function.Consumer<java.lang.Boolean> mDelegate = null;
        private final int[] mFoldedDeviceStates = null;
        public FoldStateListener(android.content.Context p0) {}
        public FoldStateListener(android.content.Context p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
        public java.lang.Boolean getFolded() { return null; }
        public final void onDeviceStateChanged(android.hardware.devicestate.DeviceState p0) {}
    }
}
