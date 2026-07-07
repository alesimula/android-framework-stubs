package android.system.suspend.internal;

public class SuspendInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.system.suspend.internal.SuspendInfo> CREATOR = null;
    public long backoffContinueCount;
    public long breakEvenMillis;
    public long[] consecutiveBadSuspendBins;
    public long earlyRecoveryBadSuspends;
    public long failedSuspendCount;
    public long failedSuspendOverheadTimeMillis;
    public long maxBackoffContinuations;
    public long newBackoffCount;
    public long newBadSuspends;
    public long shortSuspendCount;
    public long shortSuspendTimeMillis;
    public long sleepTimeMillis;
    public long suspendAttemptCount;
    public long[] suspendDurationMillisBins;
    public long suspendOverheadTimeMillis;
    public long suspendTimeMillis;
    public SuspendInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
