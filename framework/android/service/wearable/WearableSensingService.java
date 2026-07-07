package android.service.wearable;

@android.annotation.SystemApi
public abstract class WearableSensingService extends android.app.Service {
    public static final java.lang.String HOTWORD_AUDIO_STREAM_BUNDLE_KEY = "android.app.wearable.HotwordAudioStreamBundleKey";
    private static final java.time.Duration OPEN_FILE_TIMEOUT = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.wearable.WearableSensingService";
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.wearable.WearableSensingStatusBundleKey";
    private static final java.lang.String TAG = null;
    private final android.util.SparseArray<android.service.wearable.WearableSensingDataRequester> mDataRequestObserverIdToRequesterMap = null;
    private android.app.wearable.IWearableSensingCallback mWearableSensingCallback;
    public WearableSensingService() { super(); }
    private static android.service.wearable.WearableSensingDataRequester createDataRequester(android.os.RemoteCallback p0) { return null; }
    private static java.util.function.Consumer<java.lang.Integer> createWearableStatusConsumer(android.os.RemoteCallback p0) { return null; }
    private static java.lang.Integer[] intArrayToIntegerArray(int[] p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDataProvided(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.function.Consumer<java.lang.Integer> p2);
    public void onDataRequestObserverRegistered(int p0, java.lang.String p1, android.service.wearable.WearableSensingDataRequester p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public void onDataRequestObserverUnregistered(int p0, java.lang.String p1, android.service.wearable.WearableSensingDataRequester p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public abstract void onDataStreamProvided(android.os.ParcelFileDescriptor p0, java.util.function.Consumer<java.lang.Integer> p1);
    public abstract void onQueryServiceStatus(java.util.Set<java.lang.Integer> p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2);
    public void onReadOnlyParcelFileDescriptorProvided(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public void onSecureConnectionProvided(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @java.lang.Deprecated
    public void onSecureConnectionProvided(android.os.ParcelFileDescriptor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public abstract void onStartDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionResult> p3);
    public void onStartHotwordRecognition(java.util.function.Consumer<android.service.voice.HotwordAudioStream> p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public abstract void onStopDetection(java.lang.String p0);
    public void onStopHotwordAudioStream() {}
    public void onStopHotwordRecognition(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void onValidatedByHotwordDetectionService() {}
    public java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
}
