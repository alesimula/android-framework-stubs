package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensorConfig implements android.os.Parcelable {
    static final int ADDITIONAL_INFO_MASK = 64;
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensorConfig> CREATOR = null;
    private static final int DIRECT_CHANNEL_SHIFT = 10;
    private static final int DIRECT_REPORT_MASK = 896;
    private static final int DIRECT_REPORT_SHIFT = 7;
    private static final int FLAG_WAKE_UP_SENSOR = 1;
    private static final int REPORTING_MODE_MASK = 14;
    private static final int REPORTING_MODE_SHIFT = 1;
    private static final java.lang.String TAG = "VirtualSensorConfig";
    private final int mFlags = 0;
    private final int mMaxDelay = 0;
    private final float mMaximumRange = 0.0f;
    private final int mMinDelay = 0;
    private final java.lang.String mName = null;
    private final float mPower = 0.0f;
    private final float mResolution = 0.0f;
    private final int mType = 0;
    private final java.lang.String mVendor = null;
    private VirtualSensorConfig(int p0, java.lang.String p1, java.lang.String p2, float p3, float p4, float p5, int p6, int p7, int p8) {}
    private VirtualSensorConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getDirectChannelTypesSupported() { return 0; }
    public int getFlags() { return 0; }
    public int getHighestDirectReportRateLevel() { return 0; }
    public int getMaxDelay() { return 0; }
    public float getMaximumRange() { return 0.0f; }
    public int getMinDelay() { return 0; }
    public java.lang.String getName() { return null; }
    public float getPower() { return 0.0f; }
    public int getReportingMode() { return 0; }
    public float getResolution() { return 0.0f; }
    public int getType() { return 0; }
    public java.lang.String getVendor() { return null; }
    public boolean isAdditionalInfoSupported() { return false; }
    public boolean isWakeUpSensor() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private static final int FLAG_MEMORY_FILE_DIRECT_CHANNEL_SUPPORTED = 1024;
        private int mFlags;
        int mHighestDirectReportRateLevel;
        private int mMaxDelay;
        private float mMaximumRange;
        private int mMinDelay;
        private final java.lang.String mName = null;
        private float mPower;
        private float mResolution;
        private final int mType = 0;
        private java.lang.String mVendor;
        public Builder(int p0, java.lang.String p1) {}
        public android.companion.virtual.sensor.VirtualSensorConfig build() { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setAdditionalInfoSupported(boolean p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setDirectChannelTypesSupported(int p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setHighestDirectReportRateLevel(int p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setMaxDelay(int p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setMaximumRange(float p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setMinDelay(int p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setPower(float p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setReportingMode(int p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setResolution(float p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setVendor(java.lang.String p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setWakeUpSensor(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReportingMode {
    }
}
