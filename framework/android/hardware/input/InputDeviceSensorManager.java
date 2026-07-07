package android.hardware.input;

public class InputDeviceSensorManager {
    private static final boolean DEBUG = false;
    private static final int MSG_SENSOR_ACCURACY_CHANGED = 1;
    private static final int MSG_SENSOR_CHANGED = 2;
    private static final java.lang.String TAG = "InputDeviceSensorManager";
    private final android.hardware.input.InputManagerGlobal mGlobal = null;
    private final java.util.ArrayList<android.hardware.input.InputDeviceSensorManager.InputSensorEventListenerDelegate> mInputSensorEventListeners = null;
    private final java.lang.Object mInputSensorLock = null;
    private android.hardware.input.InputDeviceSensorManager.InputSensorEventListener mInputServiceSensorListener;
    private android.os.HandlerThread mSensorThread;
    private final java.util.Map<java.lang.Integer, java.util.List<android.hardware.Sensor>> mSensors = null;
    public InputDeviceSensorManager(android.hardware.input.InputManagerGlobal p0) {}
    private int findSensorEventListenerLocked(android.hardware.SensorEventListener p0) { return 0; }
    private boolean flushInternal(android.hardware.SensorEventListener p0) { return false; }
    private java.util.List<android.hardware.Sensor> getFullSensorListForDevice(int p0) { return null; }
    private android.hardware.Sensor getInputDeviceSensorLocked(int p0, int p1) { return null; }
    private android.os.Looper getLooperForListenerLocked(android.os.Handler p0) { return null; }
    private android.hardware.Sensor getSensorForInputDevice(int p0, int p1) { return null; }
    private void initializeSensors() {}
    private void onInputSensorAccuracyChanged(int p0, int p1, int p2) {}
    private void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) {}
    private void populateSensorsForInputDeviceLocked(int p0, android.hardware.input.InputSensorInfo[] p1) {}
    private boolean registerListenerInternal(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, int p3, android.os.Handler p4) { return false; }
    private static boolean sensorEquals(android.hardware.Sensor p0, android.hardware.Sensor p1) { return false; }
    private void unregisterListenerInternal(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}
    private void updateInputDeviceSensorInfoLocked(int p0) {}
    android.hardware.SensorManager getSensorManager(int p0) { return null; }
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    public void onInputDeviceRemoved(int p0) {}

    private final class InputSensorEventListener extends android.hardware.input.IInputSensorEventListener.Stub {
        private InputSensorEventListener(android.hardware.input.InputDeviceSensorManager p0) { super(); }
        public void onInputSensorAccuracyChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) throws android.os.RemoteException {}
    }

    private static final class InputSensorEventListenerDelegate extends android.os.Handler {
        private final android.hardware.SensorEventListener mListener = null;
        private final android.util.SparseArray<android.hardware.SensorEvent> mSensorEvents = null;
        private final java.util.List<android.hardware.Sensor> mSensors = null;
        InputSensorEventListenerDelegate(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, android.os.Looper p2) { super(); }
        private android.hardware.SensorEvent getSensorEvent(android.hardware.Sensor p0) { return null; }
        public void addSensor(android.hardware.Sensor p0) {}
        public android.hardware.SensorEventListener getListener() { return null; }
        public java.util.List<android.hardware.Sensor> getSensors() { return null; }
        public void handleMessage(android.os.Message p0) {}
        public boolean hasSensorRegistered(int p0, int p1) { return false; }
        public boolean isEmpty() { return false; }
        public void removeSensor(android.hardware.Sensor p0) {}
        public void sendSensorAccuracyChanged(int p0, int p1, int p2) {}
        public void sendSensorChanged(android.hardware.SensorEvent p0) {}
    }

    public class InputSensorManager extends android.hardware.SensorManager {
        final int mId = 0;
        InputSensorManager(android.hardware.input.InputDeviceSensorManager p0, int p1) { super(); }
        protected boolean cancelTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1, boolean p2) { return false; }
        protected int configureDirectChannelImpl(android.hardware.SensorDirectChannel p0, android.hardware.Sensor p1, int p2) { return 0; }
        protected android.hardware.SensorDirectChannel createDirectChannelImpl(android.os.MemoryFile p0, android.hardware.HardwareBuffer p1) { return null; }
        protected void destroyDirectChannelImpl(android.hardware.SensorDirectChannel p0) {}
        protected boolean flushImpl(android.hardware.SensorEventListener p0) { return false; }
        public android.hardware.Sensor getDefaultSensor(int p0) { return null; }
        protected java.util.List<android.hardware.Sensor> getFullDynamicSensorList() { return null; }
        protected java.util.List<android.hardware.Sensor> getFullSensorList() { return null; }
        protected boolean initDataInjectionImpl(boolean p0, int p1) { return false; }
        protected boolean injectSensorDataImpl(android.hardware.Sensor p0, float[] p1, int p2, long p3) { return false; }
        protected void registerDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0, android.os.Handler p1) {}
        protected boolean registerListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, android.os.Handler p3, int p4, int p5) { return false; }
        protected boolean requestTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1) { return false; }
        protected boolean setOperationParameterImpl(android.hardware.SensorAdditionalInfo p0) { return false; }
        protected void unregisterDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0) {}
        protected void unregisterListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}
    }
}
