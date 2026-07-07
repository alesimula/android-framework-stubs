package android.telephony;

public class NetworkScan {
    public static final int ERROR_INTERRUPTED = 10002;
    public static final int ERROR_INVALID_SCAN = 2;
    public static final int ERROR_INVALID_SCANID = 10001;
    public static final int ERROR_MODEM_ERROR = 1;
    public static final int ERROR_MODEM_UNAVAILABLE = 3;
    public static final int ERROR_RADIO_INTERFACE_ERROR = 10000;
    public static final int ERROR_UNSUPPORTED = 4;
    public static final int SUCCESS = 0;
    private static final java.lang.String TAG = "NetworkScan";
    private final int mScanId = 0;
    private final int mSubId = 0;
    public NetworkScan(int p0, int p1) {}
    private com.android.internal.telephony.ITelephony getITelephony() { return null; }
    @java.lang.Deprecated
    public void stop() throws android.os.RemoteException {}
    public void stopScan() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanErrorCode {
    }
}
