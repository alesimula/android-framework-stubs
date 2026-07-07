package android.app;

public class JobSchedulerImpl extends android.app.job.JobScheduler {
    android.app.job.IJobScheduler mBinder;
    private final android.content.Context mContext = null;
    private final java.lang.String mNamespace = null;
    private JobSchedulerImpl(android.app.JobSchedulerImpl p0, java.lang.String p1) { super(); }
    public JobSchedulerImpl(android.content.Context p0, android.app.job.IJobScheduler p1) { super(); }
    private JobSchedulerImpl(android.content.Context p0, android.app.job.IJobScheduler p1, java.lang.String p2) { super(); }
    public boolean canRunUserInitiatedJobs() { return false; }
    public void cancel(int p0) {}
    public void cancelAll() {}
    public void cancelInAllNamespaces() {}
    public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) { return 0; }
    public android.app.job.JobScheduler forNamespace(java.lang.String p0) { return null; }
    public java.util.List<android.app.job.JobSnapshot> getAllJobSnapshots() { return null; }
    public java.util.List<android.app.job.JobInfo> getAllPendingJobs() { return null; }
    public java.lang.String getNamespace() { return null; }
    public android.app.job.JobInfo getPendingJob(int p0) { return null; }
    public int getPendingJobReason(int p0) { return 0; }
    public java.util.Map<java.lang.Integer, java.time.Duration> getPendingJobReasonStats(int p0) { return null; }
    public int[] getPendingJobReasons(int p0) { return null; }
    public java.util.List<android.app.job.PendingJobReasonsInfo> getPendingJobReasonsHistory(int p0) { return null; }
    public java.util.Map<java.lang.String, java.util.List<android.app.job.JobInfo>> getPendingJobsInAllNamespaces() { return null; }
    public java.util.List<android.app.job.JobInfo> getStartedJobs() { return null; }
    public boolean hasRunUserInitiatedJobsPermission(java.lang.String p0, int p1) { return false; }
    public void notePendingUserRequestedAppStop(java.lang.String p0, int p1, java.lang.String p2) {}
    public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
    public int schedule(android.app.job.JobInfo p0) { return 0; }
    public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
}
