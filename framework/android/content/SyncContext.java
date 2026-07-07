package android.content;

public class SyncContext {
    private static final long HEARTBEAT_SEND_INTERVAL_IN_MS = 1000L;
    private long mLastHeartbeatSendTime;
    private android.content.ISyncContext mSyncContext;
    public SyncContext(android.content.ISyncContext p0) {}
    private void updateHeartbeat() {}
    public android.os.IBinder getSyncContextBinder() { return null; }
    public void onFinished(android.content.SyncResult p0) {}
    public void setStatusText(java.lang.String p0) {}
}
