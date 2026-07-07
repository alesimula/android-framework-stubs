package android.os.connectivity;

@android.annotation.SystemApi
public final class WifiActivityEnergyInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.connectivity.WifiActivityEnergyInfo> CREATOR = null;
    private static final long DEFERRED_ENERGY_ESTIMATE = -1L;
    public static final int STACK_STATE_INVALID = 0;
    public static final int STACK_STATE_STATE_ACTIVE = 1;
    public static final int STACK_STATE_STATE_IDLE = 3;
    public static final int STACK_STATE_STATE_SCANNING = 2;
    private long mControllerEnergyUsedMicroJoules;
    private final long mControllerIdleDurationMillis = 0L;
    private final long mControllerRxDurationMillis = 0L;
    private final long mControllerScanDurationMillis = 0L;
    private final long mControllerTxDurationMillis = 0L;
    private final int mStackState = 0;
    private final long mTimeSinceBootMillis = 0L;
    public WifiActivityEnergyInfo(long p0, int p1, long p2, long p3, long p4, long p5) {}
    public WifiActivityEnergyInfo(long p0, int p1, long p2, long p3, long p4, long p5, long p6) {}
    private static long calculateEnergyMicroJoules(long p0, long p1, long p2) { return 0L; }
    private static long calculateEnergyMicroJoules$ravenwood(long p0, long p1, long p2) { return 0L; }
    public int describeContents() { return 0; }
    public long getControllerEnergyUsedMicroJoules() { return 0L; }
    public long getControllerIdleDurationMillis() { return 0L; }
    public long getControllerRxDurationMillis() { return 0L; }
    public long getControllerScanDurationMillis() { return 0L; }
    public long getControllerTxDurationMillis() { return 0L; }
    public int getStackState() { return 0; }
    public long getTimeSinceBootMillis() { return 0L; }
    public boolean isValid() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StackState {
    }
}
