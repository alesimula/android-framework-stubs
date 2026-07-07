package android.app.job;

public class JobSnapshot implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.job.JobSnapshot> CREATOR = null;
    private final boolean mIsRunnable = false;
    private final android.app.job.JobInfo mJob = null;
    private final int mSatisfiedConstraints = 0;
    public JobSnapshot(android.app.job.JobInfo p0, int p1, boolean p2) {}
    public JobSnapshot(android.os.Parcel p0) {}
    private boolean satisfied(int p0) { return false; }
    public int describeContents() { return 0; }
    public android.app.job.JobInfo getJobInfo() { return null; }
    public boolean isBatteryNotLowSatisfied() { return false; }
    public boolean isChargingSatisfied() { return false; }
    public boolean isRequireDeviceIdleSatisfied() { return false; }
    public boolean isRequireStorageNotLowSatisfied() { return false; }
    public boolean isRunnable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
