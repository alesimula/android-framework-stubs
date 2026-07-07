package android.hardware.contexthub;

@android.annotation.SystemApi
public class HubEndpointSessionResult {
    private final boolean mAccepted = false;
    private final java.lang.String mReason = null;
    private HubEndpointSessionResult(boolean p0, java.lang.String p1) {}
    public static android.hardware.contexthub.HubEndpointSessionResult accept() { return null; }
    public static android.hardware.contexthub.HubEndpointSessionResult reject(java.lang.String p0) { return null; }
    public java.lang.String getReason() { return null; }
    public boolean isAccepted() { return false; }
}
