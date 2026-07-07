package android.content.pm;

public class IncrementalStatesInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.IncrementalStatesInfo> CREATOR = null;
    private final boolean mIsLoading = false;
    private long mLoadingCompletedTime;
    private final float mProgress = 0.0f;
    private IncrementalStatesInfo(android.os.Parcel p0) {}
    public IncrementalStatesInfo(boolean p0, float p1, long p2) {}
    public int describeContents() { return 0; }
    public long getLoadingCompletedTime() { return 0L; }
    public float getProgress() { return 0.0f; }
    public boolean isLoading() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
