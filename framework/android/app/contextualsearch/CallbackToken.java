package android.app.contextualsearch;

@android.annotation.SystemApi
public final class CallbackToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contextualsearch.CallbackToken> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private final java.lang.Object mLock = null;
    private final android.os.IBinder mToken = null;
    private boolean mTokenUsed;
    public CallbackToken() {}
    private CallbackToken(android.os.Parcel p0) {}
    private boolean markUsedLocked() { return false; }
    public int describeContents() { return 0; }
    public void getContextualSearchState(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.contextualsearch.ContextualSearchState, java.lang.Throwable> p1) {}
    public android.os.IBinder getToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class CallbackWrapper extends android.app.contextualsearch.IContextualSearchCallback.Stub {
        private final android.os.OutcomeReceiver<android.app.contextualsearch.ContextualSearchState, java.lang.Throwable> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CallbackWrapper(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.contextualsearch.ContextualSearchState, java.lang.Throwable> p1) { super(); }
        public void onError(android.os.ParcelableException p0) {}
        public void onResult(android.app.contextualsearch.ContextualSearchState p0) {}
    }
}
