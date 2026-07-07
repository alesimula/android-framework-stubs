package android.view;

public abstract class OrientationEventListener {
    private static final boolean DEBUG = false;
    public static final int ORIENTATION_UNKNOWN = -1;
    private static final java.lang.String TAG = "OrientationEventListener";
    private static final boolean localLOGV = false;
    private boolean mEnabled;
    private android.view.OrientationListener mOldListener;
    private int mOrientation;
    private int mRate;
    private android.hardware.Sensor mSensor;
    private android.hardware.SensorEventListener mSensorEventListener;
    private android.hardware.SensorManager mSensorManager;
    public OrientationEventListener(android.content.Context p0) {}
    public OrientationEventListener(android.content.Context p0, int p1) {}
    public boolean canDetectOrientation() { return false; }
    public void disable() {}
    public void enable() {}
    public abstract void onOrientationChanged(int p0);
    void registerListener(android.view.OrientationListener p0) {}

    class CompatSensorEventListenerImpl implements android.hardware.SensorEventListener {
        final android.view.OrientationEventListener.SensorEventListenerImpl mSensorEventListener = null;
        CompatSensorEventListenerImpl(android.view.OrientationEventListener p0, android.view.OrientationEventListener.SensorEventListenerImpl p1) {}
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
    }

    class SensorEventListenerImpl implements android.hardware.SensorEventListener {
        private static final int _DATA_X = 0;
        private static final int _DATA_Y = 1;
        private static final int _DATA_Z = 2;
        SensorEventListenerImpl(android.view.OrientationEventListener p0) {}
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
    }
}
