package android.hardware;

final class LegacySensorManager {
    private static boolean sInitialized;
    private static int sRotation;
    private static android.view.IWindowManager sWindowManager;
    private final java.util.HashMap<android.hardware.SensorListener, android.hardware.LegacySensorManager.LegacyListener> mLegacyListenersMap = null;
    private final android.hardware.SensorManager mSensorManager = null;
    public LegacySensorManager(android.hardware.SensorManager p0) {}
    static int getRotation() { return 0; }
    static void onRotationChanged(int p0) {}
    private boolean registerLegacyListener(int p0, int p1, android.hardware.SensorListener p2, int p3, int p4) { return false; }
    private void unregisterLegacyListener(int p0, int p1, android.hardware.SensorListener p2, int p3) {}
    public int getSensors() { return 0; }
    public boolean registerListener(android.hardware.SensorListener p0, int p1, int p2) { return false; }
    public void unregisterListener(android.hardware.SensorListener p0, int p1) {}

    private static final class LegacyListener implements android.hardware.SensorEventListener {
        private int mSensors;
        private android.hardware.SensorListener mTarget;
        private float[] mValues;
        private final android.hardware.LegacySensorManager.LmsFilter mYawfilter = null;
        LegacyListener(android.hardware.SensorListener p0) {}
        private static int getLegacySensorType(int p0) { return 0; }
        private static boolean hasOrientationSensor(int p0) { return false; }
        private void mapSensorDataToWindow(int p0, float[] p1, int p2) {}
        boolean hasSensors() { return false; }
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
        boolean registerSensor(int p0) { return false; }
        boolean unregisterSensor(int p0) { return false; }
    }

    private static final class LmsFilter {
        private static final int COUNT = 12;
        private static final float PREDICTION_RATIO = 0.3333333432674408f;
        private static final float PREDICTION_TIME = 0.07999999821186066f;
        private static final int SENSORS_RATE_MS = 20;
        private int mIndex;
        private long[] mT;
        private float[] mV;
        public LmsFilter() {}
        public float filter(long p0, float p1) { return 0.0f; }
    }
}
