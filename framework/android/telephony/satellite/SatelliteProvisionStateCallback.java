package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteProvisionStateCallback {
    public void onSatelliteProvisionStateChanged(boolean p0);
    default public void onSatelliteSubscriptionProvisionStateChanged(java.util.List<android.telephony.satellite.SatelliteSubscriberProvisionStatus> p0) {}
}
