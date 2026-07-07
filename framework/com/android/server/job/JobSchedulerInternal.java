package com.android.server.job;

public interface JobSchedulerInternal {
    public void addBackingUpUid(int p0);
    public void cancelJobsForUid(int p0, boolean p1, int p2, int p3, java.lang.String p4);
    public void clearAllBackingUpUids();
    public java.lang.String getCloudMediaProviderPackage(int p0);
    public com.android.server.job.JobSchedulerInternal.JobStorePersistStats getPersistStats();
    public java.util.List<android.app.job.JobInfo> getSystemScheduledOwnJobs(java.lang.String p0);
    public boolean isAppConsideredBuggy(int p0, java.lang.String p1, int p2, java.lang.String p3);
    public boolean isNotificationAssociatedWithAnyUserInitiatedJobs(int p0, int p1, java.lang.String p2);
    public boolean isNotificationChannelAssociatedWithAnyUserInitiatedJobs(java.lang.String p0, int p1, java.lang.String p2);
    public void removeBackingUpUid(int p0);
    public void reportAppUsage(java.lang.String p0, int p1);

    public static class JobStorePersistStats {
        public int countAllJobsLoaded;
        public int countAllJobsSaved;
        public int countSystemServerJobsLoaded;
        public int countSystemServerJobsSaved;
        public int countSystemSyncManagerJobsLoaded;
        public int countSystemSyncManagerJobsSaved;
        public JobStorePersistStats() {}
        public JobStorePersistStats(com.android.server.job.JobSchedulerInternal.JobStorePersistStats p0) {}
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public java.lang.String toString() { return null; }
    }
}
