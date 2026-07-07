package android.telephony.ims;

@android.annotation.SystemApi
public abstract class SipDialogStateCallback {
    private android.telephony.ims.SipDialogStateCallback.CallbackBinder mCallback;
    public SipDialogStateCallback() {}
    public void attachExecutor(java.util.concurrent.Executor p0) {}
    public final void binderDied() {}
    public android.telephony.ims.SipDialogStateCallback.CallbackBinder getCallbackBinder() { return null; }
    public abstract void onActiveSipDialogsChanged(java.util.List<android.telephony.ims.SipDialogState> p0);
    public abstract void onError();

    private static class CallbackBinder extends com.android.internal.telephony.ISipDialogStateCallback.Stub {
        private java.util.concurrent.Executor mExecutor;
        private java.lang.ref.WeakReference<android.telephony.ims.SipDialogStateCallback> mSipDialogStateCallbackWeakRef;
        private CallbackBinder(android.telephony.ims.SipDialogStateCallback p0, java.util.concurrent.Executor p1) { super(); }
        java.util.concurrent.Executor getExecutor() { return null; }
        public void onActiveSipDialogsChanged(java.util.List<android.telephony.ims.SipDialogState> p0) {}
    }
}
