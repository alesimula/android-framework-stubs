package android.hardware;

public class SensorEvent {
    public int accuracy;
    public boolean firstEventAfterDiscontinuity;
    public android.hardware.Sensor sensor;
    public long timestamp;
    public final float[] values = null;
    SensorEvent(int p0) {}
    public SensorEvent(android.hardware.Sensor p0, int p1, long p2, float[] p3) {}
}
