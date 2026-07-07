package android.telephony.mbms;

public class InternalGroupCallSessionCallback extends android.telephony.mbms.IMbmsGroupCallSessionCallback.Stub {
    private final android.telephony.mbms.MbmsGroupCallSessionCallback mAppCallback = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private volatile boolean mIsStopped;
    public InternalGroupCallSessionCallback(android.telephony.mbms.MbmsGroupCallSessionCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void onAvailableSaisUpdated(java.util.List p0, java.util.List p1) {}
    public void onError(int p0, java.lang.String p1) {}
    public void onMiddlewareReady() {}
    public void onServiceInterfaceAvailable(java.lang.String p0, int p1) {}
    public void stop() {}
}
