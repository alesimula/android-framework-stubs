package android.hardware.lights;

public final class SystemLightsManager extends android.hardware.lights.LightsManager {
    private static final java.lang.String TAG = "LightsManager";
    private final android.hardware.lights.ILightsManager mService = null;
    public SystemLightsManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    public SystemLightsManager(android.content.Context p0, android.hardware.lights.ILightsManager p1) { super(); }
    public android.hardware.lights.ColorSequence getLightSequence(android.hardware.lights.Light p0) { return null; }
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession(int p0) { return null; }

    public final class SystemLightsSession extends android.hardware.lights.LightsManager.LightsSession implements java.lang.AutoCloseable {
        private final android.util.CloseGuard mCloseGuard = null;
        private boolean mClosed;
        private SystemLightsSession(android.hardware.lights.SystemLightsManager p0) { super(); }
        private void sendEffect(android.hardware.lights.LightsRequest p0) {}
        private void sendStaticStates(android.hardware.lights.LightsRequest p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
    }
}
