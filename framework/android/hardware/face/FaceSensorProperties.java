package android.hardware.face;

public class FaceSensorProperties extends android.hardware.biometrics.SensorProperties {
    public static final int TYPE_IR = 2;
    public static final int TYPE_RGB = 1;
    public static final int TYPE_UNKNOWN = 0;
    final int mSensorType = 0;
    public FaceSensorProperties(int p0, int p1, java.util.List<android.hardware.biometrics.SensorProperties.ComponentInfo> p2, int p3) { super(0, 0, null); }
    public static android.hardware.face.FaceSensorProperties from(android.hardware.face.FaceSensorPropertiesInternal p0) { return null; }
    public int getSensorType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SensorType {
    }
}
