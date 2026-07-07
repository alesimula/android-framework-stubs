package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteModemStateCallback {
    default public void onEmergencyModeChanged(boolean p0) {}
    default public void onRegistrationFailure(int p0) {}
    public void onSatelliteModemStateChanged(int p0);
    default public void onTerrestrialNetworkAvailableChanged(boolean p0) {}
}
