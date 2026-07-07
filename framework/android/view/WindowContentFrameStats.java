package android.view;

public final class WindowContentFrameStats extends android.view.FrameStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.WindowContentFrameStats> CREATOR = null;
    private long[] mFramesPostedTimeNano;
    private long[] mFramesReadyTimeNano;
    public WindowContentFrameStats() { super(); }
    private WindowContentFrameStats(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public long getFramePostedTimeNano(int p0) { return 0L; }
    public long getFrameReadyTimeNano(int p0) { return 0L; }
    public void init(long p0, long[] p1, long[] p2, long[] p3) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
