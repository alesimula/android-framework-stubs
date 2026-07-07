package android.app.job;

public abstract class JobScheduler {
    public static final int PENDING_JOB_REASON_APP = 1;
    public static final int PENDING_JOB_REASON_APP_STANDBY = 2;
    public static final int PENDING_JOB_REASON_BACKGROUND_RESTRICTION = 3;
    public static final int PENDING_JOB_REASON_CONSTRAINT_BATTERY_NOT_LOW = 4;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CHARGING = 5;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONNECTIVITY = 6;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONNECTIVITY_METERED_RESTRICTED = 20;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONNECTIVITY_NETWORK_UNAVAILABLE = 19;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONTENT_TRIGGER = 7;
    public static final int PENDING_JOB_REASON_CONSTRAINT_DEADLINE = 16;
    public static final int PENDING_JOB_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int PENDING_JOB_REASON_CONSTRAINT_MINIMUM_LATENCY = 9;
    public static final int PENDING_JOB_REASON_CONSTRAINT_PREFETCH = 10;
    public static final int PENDING_JOB_REASON_CONSTRAINT_STORAGE_NOT_LOW = 11;
    public static final int PENDING_JOB_REASON_DEVICE_STATE = 12;
    public static final int PENDING_JOB_REASON_DEVICE_STATE_BATTERY_SAVER = 18;
    public static final int PENDING_JOB_REASON_DEVICE_STATE_THERMAL = 17;
    public static final int PENDING_JOB_REASON_EXECUTING = -1;
    public static final int PENDING_JOB_REASON_INVALID_JOB_ID = -2;
    public static final int PENDING_JOB_REASON_JOB_SCHEDULER_OPTIMIZATION = 13;
    public static final int PENDING_JOB_REASON_QUOTA = 14;
    public static final int PENDING_JOB_REASON_UNDEFINED = 0;
    public static final int PENDING_JOB_REASON_USER = 15;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final long THROW_ON_INVALID_DATA_TRANSFER_IMPLEMENTATION = 255371817L;
    public JobScheduler() {}
    public static java.lang.String sanitizeNamespace(java.lang.String p0) { return null; }
    public boolean canRunUserInitiatedJobs() { return false; }
    public abstract void cancel(int p0);
    public abstract void cancelAll();
    public void cancelInAllNamespaces() {}
    public abstract int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1);
    public android.app.job.JobScheduler forNamespace(java.lang.String p0) { return null; }
    public java.util.List<android.app.job.JobSnapshot> getAllJobSnapshots() { return null; }
    public abstract java.util.List<android.app.job.JobInfo> getAllPendingJobs();
    public java.lang.String getNamespace() { return null; }
    public abstract android.app.job.JobInfo getPendingJob(int p0);
    public int getPendingJobReason(int p0) { return 0; }
    public java.util.Map<java.lang.Integer, java.time.Duration> getPendingJobReasonStats(int p0) { return null; }
    public int[] getPendingJobReasons(int p0) { return null; }
    public java.util.List<android.app.job.PendingJobReasonsInfo> getPendingJobReasonsHistory(int p0) { return null; }
    public java.util.Map<java.lang.String, java.util.List<android.app.job.JobInfo>> getPendingJobsInAllNamespaces() { return null; }
    public java.util.List<android.app.job.JobInfo> getStartedJobs() { return null; }
    public boolean hasRunUserInitiatedJobsPermission(java.lang.String p0, int p1) { return false; }
    public void notePendingUserRequestedAppStop(java.lang.String p0, int p1, java.lang.String p2) {}
    public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}
    public abstract int schedule(android.app.job.JobInfo p0);
    @android.annotation.SystemApi
    public abstract int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3);
    public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PendingJobReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }
}
