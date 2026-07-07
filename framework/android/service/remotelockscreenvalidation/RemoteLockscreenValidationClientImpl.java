package android.service.remotelockscreenvalidation;

public class RemoteLockscreenValidationClientImpl implements android.service.remotelockscreenvalidation.RemoteLockscreenValidationClient, android.content.ServiceConnection {
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private boolean mIsConnected;
    private final boolean mIsServiceAvailable = false;
    private final java.util.concurrent.Executor mLifecycleExecutor = null;
    private final java.util.Queue<android.service.remotelockscreenvalidation.RemoteLockscreenValidationClientImpl.Call> mRequestQueue = null;
    private android.service.remotelockscreenvalidation.IRemoteLockscreenValidationService mService;
    private android.content.pm.ServiceInfo mServiceInfo;
    RemoteLockscreenValidationClientImpl(android.content.Context p0, java.util.concurrent.Executor p1, android.content.ComponentName p2) {}
    private void connect() {}
    private void connectInternal() {}
    private void disconnectInternal() {}
    private void executeApiCall(android.service.remotelockscreenvalidation.RemoteLockscreenValidationClientImpl.Call p0) {}
    private void executeInternal(android.service.remotelockscreenvalidation.RemoteLockscreenValidationClientImpl.Call p0) {}
    private android.content.pm.ServiceInfo getServiceInfo(android.content.Context p0, android.content.ComponentName p1) { return null; }
    private boolean isServiceAvailable(android.content.Context p0, android.content.ComponentName p1) { return false; }
    private void onConnectedInternal(android.service.remotelockscreenvalidation.IRemoteLockscreenValidationService p0) {}
    private void performApiCallInternal(android.service.remotelockscreenvalidation.RemoteLockscreenValidationClientImpl.Call p0, android.service.remotelockscreenvalidation.IRemoteLockscreenValidationService p1) {}
    public void disconnect() {}
    public boolean isServiceAvailable() { return false; }
    public void onBindingDied(android.content.ComponentName p0) {}
    public void onNullBinding(android.content.ComponentName p0) {}
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    public void validateLockscreenGuess(byte[] p0, android.service.remotelockscreenvalidation.IRemoteLockscreenValidationCallback p1) {}

    private static abstract class Call {
        private Call() {}
        abstract void exec(android.service.remotelockscreenvalidation.IRemoteLockscreenValidationService p0) throws android.os.RemoteException;
        abstract void onError(java.lang.String p0);
    }
}
