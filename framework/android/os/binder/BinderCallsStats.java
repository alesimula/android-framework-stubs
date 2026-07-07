package android.os.binder;

public class BinderCallsStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.binder.BinderCallsStats> CREATOR = null;
    public java.lang.String aidlMethod;
    public long callCount;
    public long callDurationSumSquaredMicros;
    public int clientUid;
    public long cpuTimeCount;
    public long cpuTimeSumMicros;
    public long cpuTimeSumSquaredMicros;
    public long durationSumMicros;
    public java.lang.String interfaceDescriptor;
    public int secondsWithAtLeast10Calls;
    public int secondsWithAtLeast50Calls;
    public BinderCallsStats() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
