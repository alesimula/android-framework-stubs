package android.app.wearable;

@android.annotation.SystemApi
public class WearableSensingManager {
    static final long ALLOW_WEARABLE_SENSING_SERVICE_FILE_READ = 330701114L;
    public static final int CONNECTION_ID_INVALID = -1;
    private static final int CONNECTION_ID_PLACEHOLDER = -2;
    public static final java.lang.String EXTRA_WEARABLE_SENSING_DATA_REQUEST = "android.app.wearable.extra.WEARABLE_SENSING_DATA_REQUEST";
    public static final int STATUS_ACCESS_DENIED = 5;
    public static final int STATUS_CHANNEL_ERROR = 7;
    public static final int STATUS_MAX_CONCURRENT_CONNECTIONS_EXCEEDED = 9;
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.wearable.WearableSensingStatusBundleKey";
    public static final int STATUS_SERVICE_UNAVAILABLE = 3;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int STATUS_UNSUPPORTED = 2;
    public static final int STATUS_UNSUPPORTED_DATA_TYPE = 8;
    public static final int STATUS_UNSUPPORTED_OPERATION = 6;
    public static final int STATUS_WEARABLE_UNAVAILABLE = 4;
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext = null;
    private final android.app.wearable.IWearableSensingManager mService = null;
    private final java.util.Map<android.app.wearable.WearableConnection, java.lang.Integer> mWearableConnectionIdMap = null;
    public WearableSensingManager(android.content.Context p0, android.app.wearable.IWearableSensingManager p1) {}
    private static android.os.RemoteCallback createStatusCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { return null; }
    private android.app.wearable.IWearableSensingCallback createWearableSensingCallback(java.util.concurrent.Executor p0) { return null; }
    public static android.app.wearable.WearableSensingDataRequest getDataRequestFromIntent(android.content.Intent p0) { return null; }
    public int getAvailableConnectionCount() { return 0; }
    public void provideConnection(android.app.wearable.WearableConnection p0, java.util.concurrent.Executor p1) {}
    @java.lang.Deprecated
    public void provideConnection(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @java.lang.Deprecated
    public void provideDataStream(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public void provideReadOnlyParcelFileDescriptor(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public void registerDataRequestObserver(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public void removeAllConnections() {}
    public void removeConnection(android.app.wearable.WearableConnection p0) {}
    public void startHotwordRecognition(android.content.ComponentName p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public void stopHotwordRecognition(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void unregisterDataRequestObserver(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusCode {
    }
}
