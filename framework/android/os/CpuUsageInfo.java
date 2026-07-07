package android.os;

public final class CpuUsageInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.CpuUsageInfo> CREATOR = null;
    private long mActive;
    private long mTotal;
    public CpuUsageInfo(long p0, long p1) {}
    private CpuUsageInfo(android.os.Parcel p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getActive() { return 0L; }
    public long getTotal() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
