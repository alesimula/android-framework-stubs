package android.service.tracing;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public class TraceReportService extends android.app.Service {
    public static final int MSG_REPORT_TRACE = 1;
    private static final java.lang.String TAG = "TraceReportService";
    private android.os.Messenger mMessenger;
    public TraceReportService() { super(); }
    private boolean onMessage(android.os.Message p0) { return false; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onReportTrace(android.service.tracing.TraceReportService.TraceParams p0) {}

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final class TraceParams {
        private final android.os.ParcelFileDescriptor mFd = null;
        private final java.util.UUID mUuid = null;
        private TraceParams(android.tracing.TraceReportParams p0) {}
        public android.os.ParcelFileDescriptor getFd() { return null; }
        public java.util.UUID getUuid() { return null; }
    }
}
