package android.media;

public class MediaHTTPService extends android.media.IMediaHTTPService.Stub {
    private static final java.lang.String TAG = "MediaHTTPService";
    private boolean mCookieStoreInitialized;
    private final java.lang.Object mCookieStoreInitializedLock = null;
    private java.util.List<java.net.HttpCookie> mCookies;
    public MediaHTTPService(java.util.List<java.net.HttpCookie> p0) { super(); }
    static android.os.IBinder createHttpServiceBinderIfNecessary(java.lang.String p0) { return null; }
    static android.os.IBinder createHttpServiceBinderIfNecessary(java.lang.String p0, java.util.List<java.net.HttpCookie> p1) { return null; }
    public android.media.IMediaHTTPConnection makeHTTPConnection() { return null; }
}
