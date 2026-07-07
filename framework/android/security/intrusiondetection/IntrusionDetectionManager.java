package android.security.intrusiondetection;

@android.annotation.SystemApi
public class IntrusionDetectionManager {
    public static final int ERROR_DATA_SOURCE_UNAVAILABLE = 4;
    public static final int ERROR_PERMISSION_DENIED = 1;
    public static final int ERROR_TRANSPORT_UNAVAILABLE = 3;
    public static final int ERROR_UNKNOWN = 0;
    public static final int STATE_DISABLED = 1;
    public static final int STATE_ENABLED = 2;
    public static final int STATE_UNKNOWN = 0;
    private static final java.lang.String TAG = "IntrusionDetectionManager";
    private final android.security.intrusiondetection.IIntrusionDetectionService mService = null;
    private final java.util.concurrent.ConcurrentHashMap<java.util.function.Consumer<java.lang.Integer>, android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback> mStateCallbacks = null;
    public IntrusionDetectionManager(android.security.intrusiondetection.IIntrusionDetectionService p0) {}
    public void addStateCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void disable(java.util.concurrent.Executor p0, android.security.intrusiondetection.IntrusionDetectionManager.CommandCallback p1) {}
    public void enable(java.util.concurrent.Executor p0, android.security.intrusiondetection.IntrusionDetectionManager.CommandCallback p1) {}
    public void removeStateCallback(java.util.function.Consumer<java.lang.Integer> p0) {}

    public static interface CommandCallback {
        public void onFailure(int p0);
        public void onSuccess();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntrusionDetectionError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface IntrusionDetectionState {
    }
}
