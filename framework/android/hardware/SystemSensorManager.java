package android.hardware;

public class SystemSensorManager extends android.hardware.SensorManager {
    private static final int CAPPED_SAMPLING_PERIOD_US = 5000;
    private static final int CAPPED_SAMPLING_RATE_LEVEL = 1;
    static final long CHANGE_ID_SAMPLING_RATE_SENSORS_PERMISSION = 136069189L;
    private static final boolean DEBUG_DYNAMIC_SENSOR = true;
    private static final java.lang.String HIGH_SAMPLING_RATE_SENSORS_PERMISSION = "android.permission.HIGH_SAMPLING_RATE_SENSORS";
    private static final int MAX_LISTENER_COUNT = 128;
    private static final int MIN_DIRECT_CHANNEL_BUFFER_SIZE = 104;
    private static android.hardware.SystemSensorManager.InjectEventQueue sInjectEventQueue;
    private static final java.lang.Object sLock = null;
    private static boolean sNativeClassInited;
    private static android.hardware.sensor.ISensorClientListener sSensorClientListener;
    private final android.content.Context mContext = null;
    private android.content.BroadcastReceiver mDynamicSensorBroadcastReceiver;
    private java.util.HashMap<android.hardware.SensorManager.DynamicSensorCallback, android.os.Handler> mDynamicSensorCallbacks;
    private boolean mDynamicSensorListDirty;
    private java.util.List<android.hardware.Sensor> mFullDynamicSensorsList;
    private final android.util.SparseArray<java.util.List<android.hardware.Sensor>> mFullRuntimeSensorListByDevice = null;
    private final java.util.ArrayList<android.hardware.Sensor> mFullSensorsList = null;
    private final java.util.HashMap<java.lang.Integer, android.hardware.Sensor> mHandleToSensor = null;
    private java.util.Optional<java.lang.Boolean> mHasHighSamplingRateSensorsPermission;
    private final boolean mIsPackageDebuggable = false;
    private final android.os.Looper mMainLooper = null;
    private final long mNativeInstance = 0L;
    private android.content.BroadcastReceiver mRuntimeSensorBroadcastReceiver;
    private final android.util.SparseArray<android.util.SparseArray<java.util.List<android.hardware.Sensor>>> mRuntimeSensorListByDeviceByType = null;
    private final java.util.HashMap<android.hardware.SensorEventListener, android.hardware.SystemSensorManager.SensorEventQueue> mSensorListeners = null;
    private final int mTargetSdkLevel = 0;
    private final java.util.HashMap<android.hardware.TriggerEventListener, android.hardware.SystemSensorManager.TriggerEventQueue> mTriggerListeners = null;
    private android.companion.virtual.VirtualDeviceManager mVdm;
    private android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener mVirtualDeviceListener;
    public SystemSensorManager(android.content.Context p0, android.os.Looper p1) { super(); }
    private void cleanupSensorConnection(android.hardware.Sensor p0) {}
    private java.util.List<android.hardware.Sensor> createRuntimeSensorListLocked(int p0) { return null; }
    private static boolean diffSortedSensorList(java.util.List<android.hardware.Sensor> p0, java.util.List<android.hardware.Sensor> p1, java.util.List<android.hardware.Sensor> p2, java.util.List<android.hardware.Sensor> p3, java.util.List<android.hardware.Sensor> p4) { return false; }
    private int getSensorPolicy(int p0) { return 0; }
    private boolean hasHighSamplingRateSensorsPermission() { return false; }
    private boolean isSensorInCappedSet(int p0) { return false; }
    private static native void nativeClassInit();
    private static native int nativeConfigDirectChannel(long p0, int p1, int p2, int p3);
    private static native long nativeCreate(java.lang.String p0);
    private static native int nativeCreateDirectChannel(long p0, int p1, long p2, int p3, int p4, android.hardware.HardwareBuffer p5);
    private static native void nativeDestroyDirectChannel(long p0, int p1);
    private static native boolean nativeGetDefaultDeviceSensorAtIndex(long p0, android.hardware.Sensor p1, int p2);
    private static native void nativeGetDynamicSensors(long p0, java.util.List<android.hardware.Sensor> p1);
    private static native void nativeGetRuntimeSensors(long p0, int p1, java.util.List<android.hardware.Sensor> p2);
    private static native boolean nativeGetSensorAtIndex(long p0, android.hardware.Sensor p1, int p2);
    private static native boolean nativeIsDataInjectionEnabled(long p0);
    private static native boolean nativeIsHalBypassReplayDataInjectionEnabled(long p0);
    private static native boolean nativeIsReplayDataInjectionEnabled(long p0);
    private static native void nativeRegisterClientListener(long p0, android.os.IBinder p1);
    private static native int nativeSetOperationParameter(long p0, int p1, int p2, float[] p3, int[] p4);
    private void setupDynamicSensorBroadcastReceiver() {}
    private void setupVirtualDeviceListener() {}
    private void updateDynamicSensorList() {}
    protected boolean cancelTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1, boolean p2) { return false; }
    protected int configureDirectChannelImpl(android.hardware.SensorDirectChannel p0, android.hardware.Sensor p1, int p2) { return 0; }
    protected android.hardware.SensorDirectChannel createDirectChannelImpl(android.os.MemoryFile p0, android.hardware.HardwareBuffer p1) { return null; }
    protected void destroyDirectChannelImpl(android.hardware.SensorDirectChannel p0) {}
    protected boolean flushImpl(android.hardware.SensorEventListener p0) { return false; }
    protected java.util.List<android.hardware.Sensor> getFullDynamicSensorList() { return null; }
    protected java.util.List<android.hardware.Sensor> getFullSensorList() { return null; }
    public android.hardware.Sensor getSensorByHandle(int p0) { return null; }
    public java.util.List<android.hardware.Sensor> getSensorList(int p0) { return null; }
    protected boolean initDataInjectionImpl(boolean p0, int p1) { return false; }
    protected boolean injectSensorDataImpl(android.hardware.Sensor p0, float[] p1, int p2, long p3) { return false; }
    protected void registerDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0, android.os.Handler p1) {}
    protected boolean registerListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1, int p2, android.os.Handler p3, int p4, int p5) { return false; }
    protected boolean requestTriggerSensorImpl(android.hardware.TriggerEventListener p0, android.hardware.Sensor p1) { return false; }
    protected boolean setOperationParameterImpl(android.hardware.SensorAdditionalInfo p0) { return false; }
    protected void unregisterDynamicSensorCallbackImpl(android.hardware.SensorManager.DynamicSensorCallback p0) {}
    protected void unregisterListenerImpl(android.hardware.SensorEventListener p0, android.hardware.Sensor p1) {}

    private static abstract class BaseEventQueue {
        protected static final int OPERATING_MODE_DATA_INJECTION = 1;
        protected static final int OPERATING_MODE_HAL_BYPASS_REPLAY_DATA_INJECTION = 4;
        protected static final int OPERATING_MODE_NORMAL = 0;
        protected static final int OPERATING_MODE_REPLAY_DATA_INJECTION = 3;
        private final android.util.SparseBooleanArray mActiveSensors = null;
        protected final android.hardware.SystemSensorManager mManager = null;
        private long mNativeSensorEventQueue;
        protected final android.util.SparseIntArray mSensorAccuracies = null;
        protected final android.util.SparseIntArray mSensorDiscontinuityCounts = null;
        BaseEventQueue(android.os.Looper p0, android.hardware.SystemSensorManager p1, int p2, java.lang.String p3) {}
        private int disableSensor(android.hardware.Sensor p0) { return 0; }
        private void dispose(boolean p0) {}
        private int enableSensor(android.hardware.Sensor p0, int p1, int p2) { return 0; }
        private static native void nativeDestroySensorEventQueue(long p0);
        private static native int nativeDisableSensor(long p0, int p1);
        private static native int nativeEnableSensor(long p0, int p1, int p2, int p3);
        private static native int nativeFlushSensor(long p0);
        private static native long nativeInitBaseEventQueue(long p0, java.lang.ref.WeakReference<android.hardware.SystemSensorManager.BaseEventQueue> p1, android.os.MessageQueue p2, java.lang.String p3, int p4, java.lang.String p5, java.lang.String p6);
        private static native int nativeInjectSensorData(long p0, int p1, float[] p2, int p3, long p4);
        public boolean addSensor(android.hardware.Sensor p0, int p1, int p2) { return false; }
        protected abstract void addSensorEvent(android.hardware.Sensor p0);
        protected void dispatchAdditionalInfoEvent(int p0, int p1, int p2, float[] p3, int[] p4) {}
        protected abstract void dispatchFlushCompleteEvent(int p0);
        protected abstract void dispatchSensorEvent(int p0, float[] p1, int p2, long p3);
        public void dispose() {}
        protected void finalize() throws java.lang.Throwable {}
        public int flush() { return 0; }
        public boolean hasSensors() { return false; }
        protected int injectSensorDataBase(int p0, float[] p1, int p2, long p3) { return 0; }
        public boolean removeAllSensors() { return false; }
        public boolean removeSensor(android.hardware.Sensor p0, boolean p1) { return false; }
        protected abstract void removeSensorEvent(android.hardware.Sensor p0);
    }

    final class InjectEventQueue extends android.hardware.SystemSensorManager.BaseEventQueue {
        private int mMode;
        public InjectEventQueue(android.hardware.SystemSensorManager p0, android.os.Looper p1, android.hardware.SystemSensorManager p2, int p3, java.lang.String p4) { super(null, null, 0, null); }
        protected void addSensorEvent(android.hardware.Sensor p0) {}
        protected void dispatchFlushCompleteEvent(int p0) {}
        protected void dispatchSensorEvent(int p0, float[] p1, int p2, long p3) {}
        int getDataInjectionMode() { return 0; }
        int injectSensorData(int p0, float[] p1, int p2, long p3) { return 0; }
        protected void removeSensorEvent(android.hardware.Sensor p0) {}
    }

    static final class SensorEventQueue extends android.hardware.SystemSensorManager.BaseEventQueue {
        private final android.hardware.SensorEventListener mListener = null;
        private final android.util.SparseArray<android.hardware.SensorEvent> mSensorsEvents = null;
        public SensorEventQueue(android.hardware.SensorEventListener p0, android.os.Looper p1, android.hardware.SystemSensorManager p2, java.lang.String p3) { super(null, null, 0, null); }
        public void addSensorEvent(android.hardware.Sensor p0) {}
        protected void dispatchAdditionalInfoEvent(int p0, int p1, int p2, float[] p3, int[] p4) {}
        protected void dispatchFlushCompleteEvent(int p0) {}
        protected void dispatchSensorEvent(int p0, float[] p1, int p2, long p3) {}
        public void removeSensorEvent(android.hardware.Sensor p0) {}
    }

    static final class TriggerEventQueue extends android.hardware.SystemSensorManager.BaseEventQueue {
        private final android.hardware.TriggerEventListener mListener = null;
        private final android.util.SparseArray<android.hardware.TriggerEvent> mTriggerEvents = null;
        public TriggerEventQueue(android.hardware.TriggerEventListener p0, android.os.Looper p1, android.hardware.SystemSensorManager p2, java.lang.String p3) { super(null, null, 0, null); }
        public void addSensorEvent(android.hardware.Sensor p0) {}
        protected void dispatchFlushCompleteEvent(int p0) {}
        protected void dispatchSensorEvent(int p0, float[] p1, int p2, long p3) {}
        public void removeSensorEvent(android.hardware.Sensor p0) {}
    }
}
