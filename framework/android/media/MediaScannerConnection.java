package android.media;

public class MediaScannerConnection implements android.content.ServiceConnection {
    private static final java.lang.String TAG = "MediaScannerConnection";
    private final android.media.MediaScannerConnection.MediaScannerConnectionClient mClient = null;
    @java.lang.Deprecated
    private boolean mConnected;
    private final android.content.Context mContext = null;
    @java.lang.Deprecated
    private final android.media.IMediaScannerListener.Stub mListener = null;
    private android.content.ContentProviderClient mProvider;
    @java.lang.Deprecated
    private android.media.IMediaScannerService mService;
    public MediaScannerConnection(android.content.Context p0, android.media.MediaScannerConnection.MediaScannerConnectionClient p1) {}
    private static void runCallBack(android.content.Context p0, android.media.MediaScannerConnection.OnScanCompletedListener p1, java.lang.String p2, android.net.Uri p3) {}
    public static void scanFile(android.content.Context p0, java.lang.String[] p1, java.lang.String[] p2, android.media.MediaScannerConnection.OnScanCompletedListener p3) {}
    private static android.net.Uri scanFileQuietly(android.content.ContentProviderClient p0, java.io.File p1) { return null; }
    public void connect() {}
    public void disconnect() {}
    public boolean isConnected() { return false; }
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    public void scanFile(java.lang.String p0, java.lang.String p1) {}

    @java.lang.Deprecated
    static class ClientProxy implements android.media.MediaScannerConnection.MediaScannerConnectionClient {
        final android.media.MediaScannerConnection.OnScanCompletedListener mClient = null;
        android.media.MediaScannerConnection mConnection;
        final java.lang.String[] mMimeTypes = null;
        int mNextPath;
        final java.lang.String[] mPaths = null;
        ClientProxy(java.lang.String[] p0, java.lang.String[] p1, android.media.MediaScannerConnection.OnScanCompletedListener p2) {}
        public void onMediaScannerConnected() {}
        public void onScanCompleted(java.lang.String p0, android.net.Uri p1) {}
        void scanNextPath() {}
    }

    public static interface MediaScannerConnectionClient extends android.media.MediaScannerConnection.OnScanCompletedListener {
        public void onMediaScannerConnected();
    }

    public static interface OnScanCompletedListener {
        public void onScanCompleted(java.lang.String p0, android.net.Uri p1);
    }
}
