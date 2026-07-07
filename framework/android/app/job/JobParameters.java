package android.app.job;

public class JobParameters implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.job.JobParameters> CREATOR = null;
    public static final int INTERNAL_STOP_REASON_ANR = 12;
    public static final int INTERNAL_STOP_REASON_CANCELED = 0;
    public static final int INTERNAL_STOP_REASON_CONSTRAINTS_NOT_SATISFIED = 1;
    public static final int INTERNAL_STOP_REASON_DATA_CLEARED = 8;
    public static final int INTERNAL_STOP_REASON_DEVICE_IDLE = 4;
    public static final int INTERNAL_STOP_REASON_DEVICE_STATE_BATTERY_SAVER = 14;
    public static final int INTERNAL_STOP_REASON_DEVICE_THERMAL = 5;
    public static final int INTERNAL_STOP_REASON_PREEMPT = 2;
    public static final int INTERNAL_STOP_REASON_RESTRICTED_BUCKET = 6;
    public static final int INTERNAL_STOP_REASON_RTC_UPDATED = 9;
    public static final int INTERNAL_STOP_REASON_SUCCESSFUL_FINISH = 10;
    public static final int INTERNAL_STOP_REASON_TIMEOUT = 3;
    public static final int INTERNAL_STOP_REASON_TIMEOUT_ABANDONED = 13;
    public static final int INTERNAL_STOP_REASON_UNINSTALL = 7;
    public static final int INTERNAL_STOP_REASON_UNKNOWN = -1;
    public static final int INTERNAL_STOP_REASON_USER_UI_STOP = 11;
    public static final int[] JOB_STOP_REASON_CODES = null;
    public static final long OVERRIDE_HANDLE_ABANDONED_JOBS = 372529068L;
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY_METERED_RESTRICTED = 20;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY_NETWORK_UNAVAILABLE = 19;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_DEVICE_STATE_BATTERY_SAVER = 18;
    public static final int STOP_REASON_DEVICE_STATE_THERMAL = 17;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_TIMEOUT_ABANDONED = 16;
    public static final int STOP_REASON_UNDEFINED = 0;
    public static final int STOP_REASON_USER = 13;
    private static final java.lang.String TAG = "JobParameters";
    private final android.os.IBinder callback = null;
    private final android.content.ClipData clipData = null;
    private final int clipGrantFlags = 0;
    private java.lang.String debugStopReason;
    private final android.os.PersistableBundle extras = null;
    private final int jobId = 0;
    private java.lang.ref.Cleaner.Cleanable mCleanable;
    private int mInternalStopReason;
    private final boolean mIsExpedited = false;
    private final boolean mIsUserInitiated = false;
    private android.app.job.JobParameters.JobCleanupCallback mJobCleanupCallback;
    private final java.lang.String mJobNamespace = null;
    private int mStopReason;
    private final java.lang.String[] mTriggeredContentAuthorities = null;
    private final android.net.Uri[] mTriggeredContentUris = null;
    private final boolean overrideDeadlineExpired = false;
    private final android.os.Bundle transientExtras = null;
    public JobParameters(android.os.IBinder p0, java.lang.String p1, int p2, android.os.PersistableBundle p3, android.os.Bundle p4, android.content.ClipData p5, int p6, boolean p7, boolean p8, boolean p9, android.net.Uri[] p10, java.lang.String[] p11, android.net.Network p12) {}
    private JobParameters(android.os.Parcel p0) {}
    public static java.lang.String getInternalReasonCodeDescription(int p0) { return null; }
    public static int[] getJobStopReasonCodes() { return null; }
    public void completeWork(android.app.job.JobWorkItem p0) {}
    public android.app.job.JobWorkItem dequeueWork() { return null; }
    public int describeContents() { return 0; }
    public void disableCleaner() {}
    public void enableCleaner() {}
    public android.app.job.IJobCallback getCallback() { return null; }
    public java.lang.ref.Cleaner.Cleanable getCleanable() { return null; }
    public android.content.ClipData getClipData() { return null; }
    public int getClipGrantFlags() { return 0; }
    public java.lang.String getDebugStopReason() { return null; }
    public android.os.PersistableBundle getExtras() { return null; }
    public int getInternalStopReasonCode() { return 0; }
    public android.app.job.JobParameters.JobCleanupCallback getJobCleanupCallback() { return null; }
    public int getJobId() { return 0; }
    public java.lang.String getJobNamespace() { return null; }
    public android.net.Network getNetwork() { return null; }
    public int getStopReason() { return 0; }
    public android.os.Bundle getTransientExtras() { return null; }
    public java.lang.String[] getTriggeredContentAuthorities() { return null; }
    public android.net.Uri[] getTriggeredContentUris() { return null; }
    public void initCleaner(android.app.job.JobParameters.JobCleanupCallback p0) {}
    public boolean isExpeditedJob() { return false; }
    public boolean isOverrideDeadlineExpired() { return false; }
    public boolean isUserInitiatedJob() { return false; }
    public void setNetwork(android.net.Network p0) {}
    public void setStopReason(int p0, int p1, java.lang.String p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class JobCleanupCallback implements java.lang.Runnable {
        private final android.app.job.IJobCallback mCallback = null;
        private boolean mIsCleanerEnabled;
        private final int mJobId = 0;
        private final boolean mNonBlockingAbandonedJobs = false;
        public JobCleanupCallback(android.app.job.IJobCallback p0, int p1) {}
        public void disableCleaner() {}
        public void enableCleaner() {}
        public boolean isCleanerEnabled() { return false; }
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StopReason {
    }
}
