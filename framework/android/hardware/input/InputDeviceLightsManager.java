package android.hardware.input;

class InputDeviceLightsManager extends android.hardware.lights.LightsManager {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "InputDeviceLightsManager";
    private final int mDeviceId = 0;
    private final android.hardware.input.InputManagerGlobal mGlobal = null;
    private final java.lang.String mPackageName = null;
    InputDeviceLightsManager(int p0) { super(); }
    public android.hardware.lights.ColorSequence getLightSequence(android.hardware.lights.Light p0) { return null; }
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession(int p0) { return null; }

    public final class InputDeviceLightsSession extends android.hardware.lights.LightsManager.LightsSession implements java.lang.AutoCloseable {
        private final android.util.CloseGuard mCloseGuard = null;
        private boolean mClosed;
        private InputDeviceLightsSession(android.hardware.input.InputDeviceLightsManager p0) { super(); }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
    }
}
