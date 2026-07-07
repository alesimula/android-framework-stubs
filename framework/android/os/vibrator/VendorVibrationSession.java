package android.os.vibrator;

@android.annotation.SystemApi
public final class VendorVibrationSession implements java.lang.AutoCloseable {
    public static final int STATUS_CANCELED = 4;
    public static final int STATUS_IGNORED = 2;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_UNKNOWN_ERROR = 5;
    public static final int STATUS_UNSUPPORTED = 3;
    private static final java.lang.String TAG = "VendorVibrationSession";
    private final android.os.vibrator.IVibrationSession mSession = null;
    public VendorVibrationSession(android.os.vibrator.IVibrationSession p0) {}
    public static java.lang.String sessionStatusToString(int p0) { return null; }
    public void cancel() {}
    public void close() {}
    public void vibrate(android.os.VibrationEffect p0, java.lang.String p1) {}

    public static interface Callback {
        public void onFinished(int p0);
        public void onFinishing();
        public void onStarted(android.os.vibrator.VendorVibrationSession p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
