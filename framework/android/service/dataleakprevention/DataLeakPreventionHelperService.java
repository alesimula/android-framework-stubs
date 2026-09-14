package android.service.dataleakprevention;

public abstract class DataLeakPreventionHelperService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.dataleakprevention.DataLeakPreventionHelperService";
    private static final java.lang.String TAG = "DLP_HelperService";
    private final android.service.dataleakprevention.IDataLeakPreventionHelperService.Stub mBinder = null;
    private final android.os.Handler mHandler = null;
    public DataLeakPreventionHelperService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onComputeContentUriContextForLogging(android.net.Uri p0, android.service.dataleakprevention.FileContextForLoggingCallback p1);
}
