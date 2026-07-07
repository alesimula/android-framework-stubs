package android.hardware.contexthub;

@android.annotation.SystemApi
public class HubEndpointSession implements java.lang.AutoCloseable {
    private final android.util.CloseGuard mCloseGuard = null;
    private final android.hardware.contexthub.HubEndpointInfo mDestination = null;
    private final android.hardware.contexthub.HubEndpoint mHubEndpoint = null;
    private final int mId = 0;
    private final android.hardware.contexthub.HubEndpointInfo mInitiator = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final java.lang.String mServiceDescriptor = null;
    HubEndpointSession(int p0, android.hardware.contexthub.HubEndpoint p1, android.hardware.contexthub.HubEndpointInfo p2, android.hardware.contexthub.HubEndpointInfo p3, java.lang.String p4) {}
    public void close() {}
    public boolean equals(java.lang.Object p0) { return false; }
    protected void finalize() throws java.lang.Throwable {}
    public int getId() { return 0; }
    public java.lang.String getServiceDescriptor() { return null; }
    public int hashCode() { return 0; }
    public android.hardware.location.ContextHubTransaction<java.lang.Void> sendMessage(android.hardware.contexthub.HubMessage p0) { return null; }
    public void setClosed() {}
    public void setOpened() {}
    public java.lang.String toString() { return null; }
}
