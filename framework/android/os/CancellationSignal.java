package android.os;

public final class CancellationSignal {
    private boolean mCancelInProgress;
    private boolean mIsCanceled;
    private android.os.CancellationSignal.OnCancelListener mOnCancelListener;
    private android.os.ICancellationSignal mRemote;
    public CancellationSignal() {}
    public static android.os.ICancellationSignal createTransport() { return null; }
    public static android.os.CancellationSignal fromTransport(android.os.ICancellationSignal p0) { return null; }
    private void waitForCancelFinishedLocked() {}
    public void cancel() {}
    public boolean isCanceled() { return false; }
    public void setOnCancelListener(android.os.CancellationSignal.OnCancelListener p0) {}
    public void setRemote(android.os.ICancellationSignal p0) {}
    public void throwIfCanceled() {}

    public static interface OnCancelListener {
        public void onCancel();
    }

    private static final class Transport extends android.os.ICancellationSignal.Stub {
        final android.os.CancellationSignal mCancellationSignal = null;
        private Transport() { super(); }
        public void cancel() throws android.os.RemoteException {}
    }
}
