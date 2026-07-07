package android.se.omapi;

public final class SEService {
    public static final java.lang.String ACTION_SECURE_ELEMENT_STATE_CHANGED = "android.se.omapi.action.SECURE_ELEMENT_STATE_CHANGED";
    public static final java.lang.String EXTRA_READER_NAME = "android.se.omapi.extra.READER_NAME";
    public static final java.lang.String EXTRA_READER_STATE = "android.se.omapi.extra.READER_STATE";
    public static final int IO_ERROR = 1;
    public static final int NO_SUCH_ELEMENT_ERROR = 2;
    private static final java.lang.String SERVICE_NAME = "android.se.omapi.ISecureElementService/default";
    private static final java.lang.String TAG = "OMAPI.SEService";
    private static final java.lang.String UICC_TERMINAL = "SIM";
    private android.content.ServiceConnection mConnection;
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    private final java.util.HashMap<java.lang.String, android.se.omapi.Reader> mReaders = null;
    private android.se.omapi.SEService.SEListener mSEListener;
    private volatile android.se.omapi.ISecureElementService mSecureElementService;
    public SEService(android.content.Context p0, java.util.concurrent.Executor p1, android.se.omapi.SEService.OnConnectedListener p2) {}
    private android.se.omapi.ISecureElementReader getReader(java.lang.String p0) { return null; }
    private void loadReaders() {}
    android.se.omapi.ISecureElementListener getListener() { return null; }
    public android.se.omapi.Reader[] getReaders() { return null; }
    public android.se.omapi.Reader getUiccReader(int p0) { return null; }
    public java.lang.String getVersion() { return null; }
    public boolean isConnected() { return false; }
    public void shutdown() {}

    public static interface OnConnectedListener {
        public void onConnected();
    }

    private class SEListener extends android.se.omapi.ISecureElementListener.Stub {
        public java.util.concurrent.Executor mExecutor;
        public android.se.omapi.SEService.OnConnectedListener mListener;
        private SEListener(android.se.omapi.SEService p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void onConnected() {}
    }
}
