package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteTransmissionUpdateCallback {
    public void onReceiveDatagramStateChanged(int p0, int p1, int p2);
    public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0);
    default public void onSendDatagramRequested(int p0) {}
    public void onSendDatagramStateChanged(int p0, int p1, int p2);
    default public void onSendDatagramStateChanged(int p0, int p1, int p2, int p3) {}
}
