package android.service.attention;

@android.annotation.SystemApi
public abstract class AttentionService extends android.app.Service {
    public static final int ATTENTION_FAILURE_CAMERA_PERMISSION_ABSENT = 6;
    public static final int ATTENTION_FAILURE_CANCELLED = 3;
    public static final int ATTENTION_FAILURE_PREEMPTED = 4;
    public static final int ATTENTION_FAILURE_TIMED_OUT = 5;
    public static final int ATTENTION_FAILURE_UNKNOWN = 2;
    public static final int ATTENTION_SUCCESS_ABSENT = 0;
    public static final int ATTENTION_SUCCESS_PRESENT = 1;
    private static final java.lang.String LOG_TAG = "AttentionService";
    public static final double PROXIMITY_UNKNOWN = -1.0;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.attention.AttentionService";
    private final android.service.attention.IAttentionService.Stub mBinder = null;
    public AttentionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCancelAttentionCheck(android.service.attention.AttentionService.AttentionCallback p0);
    public abstract void onCheckAttention(android.service.attention.AttentionService.AttentionCallback p0);
    public void onStartProximityUpdates(android.service.attention.AttentionService.ProximityUpdateCallback p0) {}
    public void onStopProximityUpdates() {}

    public static final class AttentionCallback {
        private final android.service.attention.IAttentionCallback mCallback = null;
        private AttentionCallback(android.service.attention.IAttentionCallback p0) {}
        public void onFailure(int p0) {}
        public void onSuccess(int p0, long p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttentionFailureCodes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttentionSuccessCodes {
    }

    public static final class ProximityUpdateCallback {
        private final java.lang.ref.WeakReference<android.service.attention.IProximityUpdateCallback> mCallback = null;
        private ProximityUpdateCallback(android.service.attention.IProximityUpdateCallback p0) {}
        public void onProximityUpdate(double p0) {}
    }
}
