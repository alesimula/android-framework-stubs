package android.os.incremental;

public class StorageHealthCheckParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.incremental.StorageHealthCheckParams> CREATOR = null;
    public int blockedTimeoutMs;
    public int unhealthyMonitoringMs;
    public int unhealthyTimeoutMs;
    public StorageHealthCheckParams() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
