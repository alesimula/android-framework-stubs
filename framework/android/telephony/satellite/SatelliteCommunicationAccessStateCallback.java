package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteCommunicationAccessStateCallback {
    public void onAccessAllowedStateChanged(boolean p0);
    default public void onAccessConfigurationChanged(android.telephony.satellite.SatelliteAccessConfiguration p0) {}
}
