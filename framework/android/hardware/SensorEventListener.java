package android.hardware;

public interface SensorEventListener {
    public void onAccuracyChanged(android.hardware.Sensor p0, int p1);
    public void onSensorChanged(android.hardware.SensorEvent p0);
}
