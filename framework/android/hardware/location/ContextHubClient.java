package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubClient implements java.io.Closeable {
    private static final java.lang.String TAG = "ContextHubClient";
    private final android.hardware.location.ContextHubInfo mAttachedHub = null;
    private android.hardware.location.IContextHubClient mClientProxy;
    private java.lang.Integer mId;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final boolean mPersistent = false;
    ContextHubClient(android.hardware.location.ContextHubInfo p0, boolean p1) {}
    private int doSendMessageToNanoApp(android.hardware.location.NanoAppMessage p0, android.hardware.location.IContextHubTransactionCallback p1) { return 0; }
    private void waitForClientProxy() {}
    public void callbackFinished() {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.hardware.location.ContextHubInfo getAttachedHub() { return null; }
    public int getId() { return 0; }
    public void reliableMessageCallbackFinished(int p0, byte p1) {}
    public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) { return 0; }
    public android.hardware.location.ContextHubTransaction<java.lang.Void> sendReliableMessageToNanoApp(android.hardware.location.NanoAppMessage p0) { return null; }
    void setClientProxy(android.hardware.location.IContextHubClient p0) {}
}
