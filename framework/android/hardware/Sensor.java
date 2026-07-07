package android.hardware;

public final class Sensor {
    private static final int ADDITIONAL_INFO_MASK = 64;
    private static final int ADDITIONAL_INFO_SHIFT = 6;
    private static final int DATA_INJECTION_MASK = 16;
    private static final int DATA_INJECTION_SHIFT = 4;
    private static final int DIRECT_CHANNEL_MASK = 3072;
    private static final int DIRECT_CHANNEL_SHIFT = 10;
    private static final int DIRECT_REPORT_MASK = 896;
    private static final int DIRECT_REPORT_SHIFT = 7;
    private static final int DYNAMIC_SENSOR_MASK = 32;
    private static final int DYNAMIC_SENSOR_SHIFT = 5;
    public static final int REPORTING_MODE_CONTINUOUS = 0;
    private static final int REPORTING_MODE_MASK = 14;
    public static final int REPORTING_MODE_ONE_SHOT = 2;
    public static final int REPORTING_MODE_ON_CHANGE = 1;
    private static final int REPORTING_MODE_SHIFT = 1;
    public static final int REPORTING_MODE_SPECIAL_TRIGGER = 3;
    private static final int SENSOR_FLAG_WAKE_UP_SENSOR = 1;
    public static final java.lang.String SENSOR_STRING_TYPE_TILT_DETECTOR = "android.sensor.tilt_detector";
    public static final java.lang.String STRING_TYPE_ACCELEROMETER = "android.sensor.accelerometer";
    public static final java.lang.String STRING_TYPE_ACCELEROMETER_LIMITED_AXES = "android.sensor.accelerometer_limited_axes";
    public static final java.lang.String STRING_TYPE_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED = "android.sensor.accelerometer_limited_axes_uncalibrated";
    public static final java.lang.String STRING_TYPE_ACCELEROMETER_UNCALIBRATED = "android.sensor.accelerometer_uncalibrated";
    public static final java.lang.String STRING_TYPE_AMBIENT_TEMPERATURE = "android.sensor.ambient_temperature";
    public static final java.lang.String STRING_TYPE_DEVICE_ORIENTATION = "android.sensor.device_orientation";
    @android.annotation.SystemApi
    public static final java.lang.String STRING_TYPE_DYNAMIC_SENSOR_META = "android.sensor.dynamic_sensor_meta";
    public static final java.lang.String STRING_TYPE_GAME_ROTATION_VECTOR = "android.sensor.game_rotation_vector";
    public static final java.lang.String STRING_TYPE_GEOMAGNETIC_ROTATION_VECTOR = "android.sensor.geomagnetic_rotation_vector";
    public static final java.lang.String STRING_TYPE_GLANCE_GESTURE = "android.sensor.glance_gesture";
    public static final java.lang.String STRING_TYPE_GRAVITY = "android.sensor.gravity";
    public static final java.lang.String STRING_TYPE_GYROSCOPE = "android.sensor.gyroscope";
    public static final java.lang.String STRING_TYPE_GYROSCOPE_LIMITED_AXES = "android.sensor.gyroscope_limited_axes";
    public static final java.lang.String STRING_TYPE_GYROSCOPE_LIMITED_AXES_UNCALIBRATED = "android.sensor.gyroscope_limited_axes_uncalibrated";
    public static final java.lang.String STRING_TYPE_GYROSCOPE_UNCALIBRATED = "android.sensor.gyroscope_uncalibrated";
    public static final java.lang.String STRING_TYPE_HEADING = "android.sensor.heading";
    public static final java.lang.String STRING_TYPE_HEAD_TRACKER = "android.sensor.head_tracker";
    public static final java.lang.String STRING_TYPE_HEART_BEAT = "android.sensor.heart_beat";
    public static final java.lang.String STRING_TYPE_HEART_RATE = "android.sensor.heart_rate";
    public static final java.lang.String STRING_TYPE_HINGE_ANGLE = "android.sensor.hinge_angle";
    public static final java.lang.String STRING_TYPE_LIGHT = "android.sensor.light";
    public static final java.lang.String STRING_TYPE_LINEAR_ACCELERATION = "android.sensor.linear_acceleration";
    public static final java.lang.String STRING_TYPE_LOW_LATENCY_OFFBODY_DETECT = "android.sensor.low_latency_offbody_detect";
    public static final java.lang.String STRING_TYPE_MAGNETIC_FIELD = "android.sensor.magnetic_field";
    public static final java.lang.String STRING_TYPE_MAGNETIC_FIELD_UNCALIBRATED = "android.sensor.magnetic_field_uncalibrated";
    public static final java.lang.String STRING_TYPE_MOISTURE_INTRUSION = "android.sensor.moisture_intrusion";
    public static final java.lang.String STRING_TYPE_MOTION_DETECT = "android.sensor.motion_detect";
    @java.lang.Deprecated
    public static final java.lang.String STRING_TYPE_ORIENTATION = "android.sensor.orientation";
    public static final java.lang.String STRING_TYPE_PICK_UP_GESTURE = "android.sensor.pick_up_gesture";
    public static final java.lang.String STRING_TYPE_POSE_6DOF = "android.sensor.pose_6dof";
    public static final java.lang.String STRING_TYPE_PRESSURE = "android.sensor.pressure";
    public static final java.lang.String STRING_TYPE_PROXIMITY = "android.sensor.proximity";
    public static final java.lang.String STRING_TYPE_RELATIVE_HUMIDITY = "android.sensor.relative_humidity";
    public static final java.lang.String STRING_TYPE_ROTATION_VECTOR = "android.sensor.rotation_vector";
    public static final java.lang.String STRING_TYPE_SIGNIFICANT_MOTION = "android.sensor.significant_motion";
    public static final java.lang.String STRING_TYPE_STATIONARY_DETECT = "android.sensor.stationary_detect";
    public static final java.lang.String STRING_TYPE_STEP_COUNTER = "android.sensor.step_counter";
    public static final java.lang.String STRING_TYPE_STEP_DETECTOR = "android.sensor.step_detector";
    @java.lang.Deprecated
    public static final java.lang.String STRING_TYPE_TEMPERATURE = "android.sensor.temperature";
    public static final java.lang.String STRING_TYPE_WAKE_GESTURE = "android.sensor.wake_gesture";
    @android.annotation.SystemApi
    public static final java.lang.String STRING_TYPE_WRIST_TILT_GESTURE = "android.sensor.wrist_tilt_gesture";
    public static final int TYPE_ACCELEROMETER = 1;
    public static final int TYPE_ACCELEROMETER_LIMITED_AXES = 38;
    public static final int TYPE_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED = 40;
    public static final int TYPE_ACCELEROMETER_UNCALIBRATED = 35;
    public static final int TYPE_ALL = -1;
    public static final int TYPE_AMBIENT_TEMPERATURE = 13;
    public static final int TYPE_DEVICE_ORIENTATION = 27;
    public static final int TYPE_DEVICE_PRIVATE_BASE = 65536;
    @android.annotation.SystemApi
    public static final int TYPE_DYNAMIC_SENSOR_META = 32;
    public static final int TYPE_GAME_ROTATION_VECTOR = 15;
    public static final int TYPE_GEOMAGNETIC_ROTATION_VECTOR = 20;
    public static final int TYPE_GLANCE_GESTURE = 24;
    public static final int TYPE_GRAVITY = 9;
    public static final int TYPE_GYROSCOPE = 4;
    public static final int TYPE_GYROSCOPE_LIMITED_AXES = 39;
    public static final int TYPE_GYROSCOPE_LIMITED_AXES_UNCALIBRATED = 41;
    public static final int TYPE_GYROSCOPE_UNCALIBRATED = 16;
    public static final int TYPE_HEADING = 42;
    public static final int TYPE_HEAD_TRACKER = 37;
    public static final int TYPE_HEART_BEAT = 31;
    public static final int TYPE_HEART_RATE = 21;
    public static final int TYPE_HINGE_ANGLE = 36;
    public static final int TYPE_LIGHT = 5;
    public static final int TYPE_LINEAR_ACCELERATION = 10;
    public static final int TYPE_LOW_LATENCY_OFFBODY_DETECT = 34;
    public static final int TYPE_MAGNETIC_FIELD = 2;
    public static final int TYPE_MAGNETIC_FIELD_UNCALIBRATED = 14;
    public static final int TYPE_MOISTURE_INTRUSION = 43;
    public static final int TYPE_MOTION_DETECT = 30;
    @java.lang.Deprecated
    public static final int TYPE_ORIENTATION = 3;
    public static final int TYPE_PICK_UP_GESTURE = 25;
    public static final int TYPE_POSE_6DOF = 28;
    public static final int TYPE_PRESSURE = 6;
    public static final int TYPE_PROXIMITY = 8;
    public static final int TYPE_RELATIVE_HUMIDITY = 12;
    public static final int TYPE_ROTATION_VECTOR = 11;
    public static final int TYPE_SIGNIFICANT_MOTION = 17;
    public static final int TYPE_STATIONARY_DETECT = 29;
    public static final int TYPE_STEP_COUNTER = 19;
    public static final int TYPE_STEP_DETECTOR = 18;
    @java.lang.Deprecated
    public static final int TYPE_TEMPERATURE = 7;
    public static final int TYPE_TILT_DETECTOR = 22;
    public static final int TYPE_WAKE_GESTURE = 23;
    @android.annotation.SystemApi
    public static final int TYPE_WRIST_TILT_GESTURE = 26;
    private static final int[] sSensorReportingModes = null;
    private int mFifoMaxEventCount;
    private int mFifoReservedEventCount;
    private int mFlags;
    private int mHandle;
    private int mId;
    private int mMaxDelay;
    private float mMaxRange;
    private int mMinDelay;
    private java.lang.String mName;
    private float mPower;
    private java.lang.String mRequiredPermission;
    private float mResolution;
    private java.lang.String mStringType;
    private int mType;
    private java.util.UUID mUuid;
    private java.lang.String mVendor;
    private int mVersion;
    Sensor() {}
    public Sensor(android.hardware.input.InputSensorInfo p0) {}
    public static int getMaxLengthValuesArray(android.hardware.Sensor p0, int p1) { return 0; }
    private void setId(int p0) {}
    private boolean setType(int p0) { return false; }
    private void setUuid(long p0, long p1) {}
    public int getFifoMaxEventCount() { return 0; }
    public int getFifoReservedEventCount() { return 0; }
    public int getHandle() { return 0; }
    public int getHighestDirectReportRateLevel() { return 0; }
    public int getId() { return 0; }
    public int getMaxDelay() { return 0; }
    public float getMaximumRange() { return 0.0f; }
    public int getMinDelay() { return 0; }
    public java.lang.String getName() { return null; }
    public float getPower() { return 0.0f; }
    public int getReportingMode() { return 0; }
    public java.lang.String getRequiredPermission() { return null; }
    public float getResolution() { return 0.0f; }
    public java.lang.String getStringType() { return null; }
    public int getType() { return 0; }
    @android.annotation.SystemApi
    public java.util.UUID getUuid() { return null; }
    public java.lang.String getVendor() { return null; }
    public int getVersion() { return 0; }
    public boolean isAdditionalInfoSupported() { return false; }
    @android.annotation.SystemApi
    public boolean isDataInjectionSupported() { return false; }
    public boolean isDirectChannelTypeSupported(int p0) { return false; }
    public boolean isDynamicSensor() { return false; }
    public boolean isWakeUpSensor() { return false; }
    void setRange(float p0, float p1) {}
    public java.lang.String toString() { return null; }
}
