package android.hardware;

public final class SensorPrivacyManager {
    public static final java.lang.String EXTRA_ALL_SENSORS = null;
    public static final java.lang.String EXTRA_NOTIFICATION_ID = null;
    public static final java.lang.String EXTRA_SENSOR = null;
    public static final java.lang.String EXTRA_TOGGLE_TYPE = null;
    private static final java.lang.String LOG_TAG = null;
    public static final int TOGGLE_TYPE_HARDWARE = 2;
    public static final int TOGGLE_TYPE_SOFTWARE = 1;
    private static android.hardware.SensorPrivacyManager sInstance;
    private static final java.lang.Object sInstanceLock = null;
    private final android.content.Context mContext = null;
    private final android.hardware.ISensorPrivacyListener mIToggleListener = null;
    private final android.util.ArrayMap<android.util.Pair<java.lang.Integer, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener>, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener> mLegacyToggleListeners = null;
    private final android.util.ArrayMap<android.hardware.SensorPrivacyManager.OnAllSensorPrivacyChangedListener, android.hardware.ISensorPrivacyListener> mListeners = null;
    private final java.lang.Object mLock = null;
    private java.lang.Boolean mRequiresAuthentication;
    private final android.hardware.ISensorPrivacyManager mService = null;
    private boolean mToggleListenerRegistered;
    private final android.util.ArrayMap<android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener, java.util.concurrent.Executor> mToggleListeners = null;
    private final android.util.ArrayMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.Boolean> mToggleSupportCache = null;
    private android.os.IBinder token;
    private SensorPrivacyManager(android.content.Context p0, android.hardware.ISensorPrivacyManager p1) {}
    private void addSensorPrivacyListenerLocked(java.util.concurrent.Executor p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    public static android.hardware.SensorPrivacyManager getInstance(android.content.Context p0) { return null; }
    public static android.hardware.SensorPrivacyManager getInstance(android.content.Context p0, android.hardware.ISensorPrivacyManager p1) { return null; }
    private void removeSensorPrivacyListenerLocked(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    private int resolveSourceFromCurrentContext() { return 0; }
    public void addAllSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnAllSensorPrivacyChangedListener p0) {}
    public void addSensorPrivacyListener(int p0, int p1, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p2) {}
    @android.annotation.SystemApi
    public void addSensorPrivacyListener(int p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.SystemApi
    public void addSensorPrivacyListener(int p0, java.util.concurrent.Executor p1, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p2) {}
    @android.annotation.SystemApi
    public void addSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    @android.annotation.SystemApi
    public void addSensorPrivacyListener(java.util.concurrent.Executor p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.SystemApi
    public boolean areAnySensorPrivacyTogglesEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getCameraPrivacyAllowlist() { return null; }
    @android.annotation.SystemApi
    public int getSensorPrivacyState(int p0, int p1) { return 0; }
    public boolean isAllSensorPrivacyEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isCameraPrivacyEnabled(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isSensorPrivacyEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean isSensorPrivacyEnabled(int p0, int p1) { return false; }
    public void removeAllSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnAllSensorPrivacyChangedListener p0) {}
    @android.annotation.SystemApi
    public void removeSensorPrivacyListener(int p0, android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p1) {}
    @android.annotation.SystemApi
    public void removeSensorPrivacyListener(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener p0) {}
    public boolean requiresAuthentication() { return false; }
    public void setAllSensorPrivacy(boolean p0) {}
    public void setCameraPrivacyAllowlist(java.util.List<java.lang.String> p0) {}
    public void setSensorPrivacy(int p0, int p1, boolean p2) {}
    public void setSensorPrivacy(int p0, int p1, boolean p2, int p3) {}
    @android.annotation.SystemApi
    public void setSensorPrivacy(int p0, boolean p1) {}
    public void setSensorPrivacyForProfileGroup(int p0, int p1, boolean p2) {}
    public void setSensorPrivacyForProfileGroup(int p0, int p1, boolean p2, int p3) {}
    @android.annotation.SystemApi
    public void setSensorPrivacyState(int p0, int p1) {}
    public void setSensorPrivacyState(int p0, int p1, int p2) {}
    public void setSensorPrivacyStateForProfileGroup(int p0, int p1, int p2) {}
    public void showSensorUseDialog(int p0) {}
    public boolean supportsSensorToggle(int p0) { return false; }
    public boolean supportsSensorToggle(int p0, int p1) { return false; }
    public void suppressSensorPrivacyReminders(int p0, boolean p1) {}
    public void suppressSensorPrivacyReminders(int p0, boolean p1, int p2) {}

    public static interface OnAllSensorPrivacyChangedListener {
        public void onAllSensorPrivacyChanged(boolean p0);
    }

    @android.annotation.SystemApi
    public static interface OnSensorPrivacyChangedListener {
        @java.lang.Deprecated
        public void onSensorPrivacyChanged(int p0, boolean p1);
        default public void onSensorPrivacyChanged(android.hardware.SensorPrivacyManager.OnSensorPrivacyChangedListener.SensorPrivacyChangedParams p0) {}

        public static class SensorPrivacyChangedParams {
            private boolean mEnabled;
            private int mSensor;
            private int mState;
            private int mToggleType;
            private SensorPrivacyChangedParams(int p0, int p1, int p2) {}
            private SensorPrivacyChangedParams(int p0, int p1, boolean p2) {}
            public int getSensor() { return 0; }
            public int getState() { return 0; }
            public int getToggleType() { return 0; }
            public boolean isEnabled() { return false; }
        }
    }

    public static class Sensors {
        public static final int CAMERA = 2;
        public static final int MICROPHONE = 1;
        private Sensors() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Sensor {
        }
    }

    public static class Sources {
        public static final int DIALOG = 3;
        public static final int OTHER = 5;
        public static final int QS_TILE = 1;
        public static final int SAFETY_CENTER = 6;
        public static final int SETTINGS = 2;
        public static final int SHELL = 4;
        private Sources() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Source {
        }
    }

    @android.annotation.SystemApi
    public static class StateTypes {
        public static final int DISABLED = 2;
        public static final int ENABLED = 1;
        public static final int ENABLED_EXCEPT_ALLOWLISTED_APPS = 3;
        private StateTypes() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StateType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToggleType {
    }
}
