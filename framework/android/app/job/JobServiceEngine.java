package android.app.job;

public abstract class JobServiceEngine {
    private static final boolean DEBUG_STORE_ENABLED = Boolean.valueOf(false);
    private static final int MSG_EXECUTE_JOB = 0;
    private static final int MSG_GET_TRANSFERRED_DOWNLOAD_BYTES = 3;
    private static final int MSG_GET_TRANSFERRED_UPLOAD_BYTES = 4;
    private static final int MSG_INFORM_OF_NETWORK_CHANGE = 8;
    private static final int MSG_JOB_FINISHED = 2;
    private static final int MSG_SET_NOTIFICATION = 7;
    private static final int MSG_STOP_JOB = 1;
    private static final int MSG_UPDATE_ESTIMATED_NETWORK_BYTES = 6;
    private static final int MSG_UPDATE_TRANSFERRED_NETWORK_BYTES = 5;
    private static final java.lang.String TAG = "JobServiceEngine";
    private final android.app.job.IJobService mBinder = null;
    android.app.job.JobServiceEngine.JobHandler mHandler;
    public JobServiceEngine(android.app.Service p0) {}
    public final android.os.IBinder getBinder() { return null; }
    public long getTransferredDownloadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) { return 0L; }
    public long getTransferredUploadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) { return 0L; }
    public void jobFinished(android.app.job.JobParameters p0, boolean p1) {}
    public void onNetworkChanged(android.app.job.JobParameters p0) {}
    public abstract boolean onStartJob(android.app.job.JobParameters p0);
    public abstract boolean onStopJob(android.app.job.JobParameters p0);
    public void setNotification(android.app.job.JobParameters p0, int p1, android.app.Notification p2, int p3) {}
    public void updateEstimatedNetworkBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2, long p3) {}
    public void updateTransferredNetworkBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2, long p3) {}

    class JobHandler extends android.os.Handler {
        JobHandler(android.app.job.JobServiceEngine p0, android.os.Looper p1) { super(); }
        private void ackGetTransferredDownloadBytesMessage(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2) {}
        private void ackGetTransferredUploadBytesMessage(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1, long p2) {}
        private void ackStartMessage(android.app.job.JobParameters p0, boolean p1) {}
        private void ackStopMessage(android.app.job.JobParameters p0, boolean p1) {}
        public void handleMessage(android.os.Message p0) {}
    }

    static final class JobInterface extends android.app.job.IJobService.Stub {
        final java.lang.ref.WeakReference<android.app.job.JobServiceEngine> mService = null;
        JobInterface(android.app.job.JobServiceEngine p0) { super(); }
        public void getTransferredDownloadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException {}
        public void getTransferredUploadBytes(android.app.job.JobParameters p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException {}
        public void onNetworkChanged(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
    }
}
