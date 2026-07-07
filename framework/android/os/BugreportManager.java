package android.os;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public final class BugreportManager {
    private static final java.lang.String TAG = "BugreportManager";
    private final android.os.IDumpstate mBinder = null;
    private final android.content.Context mContext = null;
    public BugreportManager(android.content.Context p0, android.os.IDumpstate p1) {}
    public void cancelBugreport() {}
    @android.annotation.SystemApi
    public void preDumpUiData() {}
    @android.annotation.SystemApi
    public void requestBugreport(android.os.BugreportParams p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}
    @android.annotation.SystemApi
    public void retrieveBugreport(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.util.concurrent.Executor p2, android.os.BugreportManager.BugreportCallback p3) {}
    @android.annotation.SystemApi
    public void startBugreport(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.BugreportParams p2, java.util.concurrent.Executor p3, android.os.BugreportManager.BugreportCallback p4) {}
    public void startConnectivityBugreport(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, android.os.BugreportManager.BugreportCallback p2) {}

    public static abstract class BugreportCallback {
        public static final int BUGREPORT_ERROR_ANOTHER_REPORT_IN_PROGRESS = 5;
        public static final int BUGREPORT_ERROR_INVALID_INPUT = 1;
        public static final int BUGREPORT_ERROR_NO_BUGREPORT_TO_RETRIEVE = 6;
        public static final int BUGREPORT_ERROR_RUNTIME = 2;
        public static final int BUGREPORT_ERROR_USER_CONSENT_TIMED_OUT = 4;
        public static final int BUGREPORT_ERROR_USER_DENIED_CONSENT = 3;
        public BugreportCallback() {}
        public void onEarlyReportFinished() {}
        public void onError(int p0) {}
        public void onFinished() {}
        @android.annotation.SystemApi
        public void onFinished(java.lang.String p0) {}
        public void onProgress(float p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BugreportErrorCode {
        }
    }

    private final class DumpstateListener extends android.os.IDumpstateListener.Stub {
        private final android.os.BugreportManager.BugreportCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final boolean mIsConsentDeferred = false;
        private final boolean mIsScreenshotRequested = false;
        DumpstateListener(android.os.BugreportManager p0, java.util.concurrent.Executor p1, android.os.BugreportManager.BugreportCallback p2, boolean p3, boolean p4) { super(); }
        public void onError(int p0) throws android.os.RemoteException {}
        public void onFinished(java.lang.String p0) throws android.os.RemoteException {}
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onScreenshotTaken(boolean p0) throws android.os.RemoteException {}
        public void onUiIntensiveBugreportDumpsFinished() throws android.os.RemoteException {}
    }
}
