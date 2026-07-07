package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsMultiEndpointImplBase {
    private static final java.lang.String TAG = "MultiEndpointImplBase";
    private java.util.concurrent.Executor mExecutor;
    private final com.android.ims.internal.IImsMultiEndpoint mImsMultiEndpoint = null;
    private com.android.ims.internal.IImsExternalCallStateListener mListener;
    private final java.lang.Object mLock = null;
    public ImsMultiEndpointImplBase() {}
    public com.android.ims.internal.IImsMultiEndpoint getIImsMultiEndpoint() { return null; }
    public final void onImsExternalCallStateUpdate(java.util.List<android.telephony.ims.ImsExternalCallState> p0) {}
    public void requestImsExternalCallStateInfo() {}
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}
}
