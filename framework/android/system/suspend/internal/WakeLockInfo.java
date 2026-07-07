package android.system.suspend.internal;

public class WakeLockInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.system.suspend.internal.WakeLockInfo> CREATOR = null;
    public long activeCount;
    public long activeTime;
    public long eventCount;
    public long expireCount;
    public boolean isActive;
    public boolean isKernelWakelock;
    public long lastChange;
    public long maxTime;
    public java.lang.String name;
    public int pid;
    public long preventSuspendTime;
    public long totalTime;
    public long wakeupCount;
    public WakeLockInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
