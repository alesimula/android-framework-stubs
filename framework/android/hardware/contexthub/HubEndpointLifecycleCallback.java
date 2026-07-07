package android.hardware.contexthub;

@android.annotation.SystemApi
public interface HubEndpointLifecycleCallback {
    public void onSessionClosed(android.hardware.contexthub.HubEndpointSession p0, int p1);
    public android.hardware.contexthub.HubEndpointSessionResult onSessionOpenRequest(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1);
    public void onSessionOpened(android.hardware.contexthub.HubEndpointSession p0);
}
