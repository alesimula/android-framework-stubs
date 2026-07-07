package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensorAdditionalInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensorAdditionalInfo> CREATOR = null;
    private final int mType = 0;
    private final java.util.List<float[]> mValues = null;
    private VirtualSensorAdditionalInfo(int p0, java.util.List<float[]> p1) {}
    private VirtualSensorAdditionalInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getType() { return 0; }
    public java.util.List<float[]> getValues() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private static final int TYPE_INTERNAL_TEMPERATURE_PLAYLOAD_SIZE = 1;
        private static final int TYPE_SAMPLING_PLAYLOAD_SIZE = 2;
        private static final int TYPE_SENSOR_PLACEMENT_PAYLOAD_SIZE = 12;
        private static final int TYPE_UNTRACKED_DELAY_PAYLOAD_SIZE = 2;
        private static final int TYPE_VEC3_CALIBRATION_PAYLOAD_SIZE = 12;
        private final int mType = 0;
        private final java.util.ArrayList<float[]> mValues = null;
        public Builder(int p0) {}
        private void assertValuesLength(float[] p0, int p1) {}
        public android.companion.virtual.sensor.VirtualSensorAdditionalInfo.Builder addValues(float[] p0) { return null; }
        public android.companion.virtual.sensor.VirtualSensorAdditionalInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
