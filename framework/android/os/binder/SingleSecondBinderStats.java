package android.os.binder;

public class SingleSecondBinderStats implements android.os.Parcelable {
    public static final byte CLIENT_PROCESS_STATE_BACKGROUND = 3;
    public static final byte CLIENT_PROCESS_STATE_CACHED = 4;
    public static final byte CLIENT_PROCESS_STATE_FOREGROUND = 2;
    public static final byte CLIENT_PROCESS_STATE_PERSISTENT = 1;
    public static final byte CLIENT_PROCESS_STATE_UNSPECIFIED = 0;
    public static final android.os.Parcelable.Creator<android.os.binder.SingleSecondBinderStats> CREATOR = null;
    public java.lang.String aidlMethod;
    public int callCount;
    public byte clientProcessState;
    public int clientUid;
    public int cpuTimeCount;
    public long cpuTimeMicrosSquaredSum;
    public int cpuTimeMicrosSum;
    public byte[] durationBinIndices;
    public int durationCount;
    public long durationMicrosSquaredSum;
    public int durationMicrosSum;
    public java.lang.String interfaceDescriptor;
    public boolean isBlockingMainThread;
    public long parcelSizeCount;
    public long parcelSizeSum;
    public int parcelsWithOver100KibData;
    public SingleSecondBinderStats() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
