package android.hardware.camera2.params;

public final class DeviceStateSensorOrientationMap {
    public static final long FOLDED = 4L;
    public static final long NORMAL = 0L;
    private final java.util.HashMap<java.lang.Long, java.lang.Integer> mDeviceStateOrientationMap = null;
    private final long[] mElements = null;
    private DeviceStateSensorOrientationMap(java.util.ArrayList<java.lang.Long> p0, java.util.HashMap<java.lang.Long, java.lang.Integer> p1) {}
    public DeviceStateSensorOrientationMap(long[] p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getSensorOrientation(long p0) { return 0; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private final java.util.HashMap<java.lang.Long, java.lang.Integer> mDeviceStateOrientationMap = null;
        private final java.util.ArrayList<java.lang.Long> mElements = null;
        public Builder() {}
        public android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder addOrientationForState(long p0, long p1) { return null; }
        public android.hardware.camera2.params.DeviceStateSensorOrientationMap build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceState {
    }
}
