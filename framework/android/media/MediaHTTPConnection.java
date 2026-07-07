package android.media;

public class MediaHTTPConnection extends android.media.IMediaHTTPConnection.Stub {
    private static final int CONNECT_TIMEOUT_MS = 30000;
    private static final int HTTP_TEMP_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final int READ_TIMEOUT_MS = 6000;
    private static final java.lang.String TAG = "MediaHTTPConnection";
    private static final boolean VERBOSE = false;
    private boolean mAllowCrossDomainRedirect;
    private boolean mAllowCrossProtocolRedirect;
    private volatile java.net.HttpURLConnection mConnection;
    private long mCurrentOffset;
    private java.util.Map<java.lang.String, java.lang.String> mHeaders;
    private java.io.InputStream mInputStream;
    private long mNativeContext;
    private final java.util.concurrent.atomic.AtomicInteger mNumDisconnectingThreads = null;
    private long mTotalSize;
    private java.net.URL mURL;
    public MediaHTTPConnection() { super(); }
    private java.util.Map<java.lang.String, java.lang.String> convertHeaderStringToMap(java.lang.String p0) { return null; }
    private boolean filterOutInternalHeaders(java.lang.String p0, java.lang.String p1) { return false; }
    private static final boolean isLocalHost(java.net.URL p0) { return false; }
    private final native void native_finalize();
    private final native android.os.IBinder native_getIMemory();
    private static final native void native_init();
    private final native int native_readAt(long p0, int p1);
    private final native void native_setup();
    private static boolean parseBoolean(java.lang.String p0) { return false; }
    private int readAt(long p0, byte[] p1, int p2) { return 0; }
    private void seekTo(long p0) throws java.io.IOException {}
    private void teardownConnection() {}
    public android.os.IBinder connect(java.lang.String p0, java.lang.String p1) { return null; }
    public void disconnect() {}
    protected void finalize() {}
    public java.lang.String getMIMEType() { return null; }
    public long getSize() { return 0L; }
    public java.lang.String getUri() { return null; }
    public int readAt(long p0, int p1) { return 0; }
}
