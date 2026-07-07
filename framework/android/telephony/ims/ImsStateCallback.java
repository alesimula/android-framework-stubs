package android.telephony.ims;

public abstract class ImsStateCallback {
    public static final int REASON_IMS_SERVICE_DISCONNECTED = 3;
    public static final int REASON_IMS_SERVICE_NOT_READY = 6;
    public static final int REASON_NO_IMS_SERVICE_CONFIGURED = 4;
    public static final int REASON_SUBSCRIPTION_INACTIVE = 5;
    public static final int REASON_UNKNOWN_PERMANENT_ERROR = 2;
    public static final int REASON_UNKNOWN_TEMPORARY_ERROR = 1;
    private android.telephony.ims.ImsStateCallback.IImsStateCallbackStub mCallback;
    public ImsStateCallback() {}
    public final void binderDied() {}
    public android.telephony.ims.ImsStateCallback.IImsStateCallbackStub getCallbackBinder() { return null; }
    public void init(java.util.concurrent.Executor p0) {}
    public abstract void onAvailable();
    public abstract void onError();
    public abstract void onUnavailable(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisconnectedReason {
    }

    private static class IImsStateCallbackStub extends com.android.internal.telephony.IImsStateCallback.Stub {
        private java.util.concurrent.Executor mExecutor;
        private java.lang.ref.WeakReference<android.telephony.ims.ImsStateCallback> mImsStateCallbackWeakRef;
        IImsStateCallbackStub(android.telephony.ims.ImsStateCallback p0, java.util.concurrent.Executor p1) { super(); }
        java.util.concurrent.Executor getExecutor() { return null; }
        public void onAvailable() {}
        public void onUnavailable(int p0) {}
    }
}
