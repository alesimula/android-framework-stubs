package android.os;

public class UpdateEngineStable {
    private static final java.lang.String TAG = "UpdateEngineStable";
    private static final java.lang.String UPDATE_ENGINE_STABLE_SERVICE = "android.os.UpdateEngineStableService";
    private final android.os.IUpdateEngineStable mUpdateEngineStable = null;
    private android.os.IUpdateEngineStableCallback mUpdateEngineStableCallback;
    private final java.lang.Object mUpdateEngineStableCallbackLock = null;
    public UpdateEngineStable() {}
    public void applyPayloadFd(android.os.ParcelFileDescriptor p0, long p1, long p2, java.lang.String[] p3) {}
    public boolean bind(android.os.UpdateEngineStableCallback p0) { return false; }
    public boolean bind(android.os.UpdateEngineStableCallback p0, android.os.Handler p1) { return false; }
    public boolean unbind() { return false; }

    public static @interface ErrorCode {
    }
}
