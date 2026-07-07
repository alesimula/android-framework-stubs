package android.media.audio.common;

public class HeadTracking implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.HeadTracking> CREATOR = null;
    public HeadTracking() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface ConnectionMode {
        public static final byte DIRECT_TO_SENSOR_SW = 1;
        public static final byte DIRECT_TO_SENSOR_TUNNEL = 2;
        public static final byte FRAMEWORK_PROCESSED = 0;
    }

    public static @interface Mode {
        public static final byte DISABLED = 1;
        public static final byte OTHER = 0;
        public static final byte RELATIVE_SCREEN = 3;
        public static final byte RELATIVE_WORLD = 2;
    }

    public static final class SensorData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.HeadTracking.SensorData> CREATOR = null;
        public static final int headToStage = 0;
        private int _tag;
        private java.lang.Object _value;
        public SensorData() {}
        private SensorData(int p0, java.lang.Object p1) {}
        private SensorData(android.os.Parcel p0) {}
        private void _assertTag(int p0) {}
        private void _set(int p0, java.lang.Object p1) {}
        private java.lang.String _tagString(int p0) { return null; }
        public static android.media.audio.common.HeadTracking.SensorData headToStage(float[] p0) { return null; }
        public int describeContents() { return 0; }
        public float[] getHeadToStage() { return null; }
        public final int getStability() { return 0; }
        public int getTag() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void setHeadToStage(float[] p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static @interface Tag {
            public static final int headToStage = 0;
        }
    }
}
