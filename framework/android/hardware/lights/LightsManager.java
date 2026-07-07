package android.hardware.lights;

public abstract class LightsManager {
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    private static final java.lang.String TAG = "LightsManager";
    public LightsManager() {}
    public abstract android.hardware.lights.ColorSequence getLightSequence(android.hardware.lights.Light p0);
    public abstract android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0);
    public abstract java.util.List<android.hardware.lights.Light> getLights();
    public abstract android.hardware.lights.LightsManager.LightsSession openSession();
    public abstract android.hardware.lights.LightsManager.LightsSession openSession(int p0);

    public static abstract class LightsSession implements java.lang.AutoCloseable {
        private final android.os.IBinder mToken = null;
        public LightsSession() {}
        public abstract void close();
        public android.os.IBinder getToken() { return null; }
        public abstract void requestLights(android.hardware.lights.LightsRequest p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightType {
    }
}
