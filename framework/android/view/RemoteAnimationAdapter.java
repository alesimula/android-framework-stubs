package android.view;

public class RemoteAnimationAdapter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationAdapter> CREATOR = null;
    private android.app.IApplicationThread mCallingApplication;
    private int mCallingPid;
    private int mCallingUid;
    private final boolean mChangeNeedsSnapshot = false;
    private final long mDuration = 0L;
    private final android.view.IRemoteAnimationRunner mRunner = null;
    private final long mStatusBarTransitionDelay = 0L;
    public RemoteAnimationAdapter(android.os.Parcel p0) {}
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2) {}
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2, android.app.IApplicationThread p3) {}
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2, boolean p3) {}
    public int describeContents() { return 0; }
    public android.app.IApplicationThread getCallingApplication() { return null; }
    public int getCallingPid() { return 0; }
    public int getCallingUid() { return 0; }
    public boolean getChangeNeedsSnapshot() { return false; }
    public long getDuration() { return 0L; }
    public android.view.IRemoteAnimationRunner getRunner() { return null; }
    public long getStatusBarTransitionDelay() { return 0L; }
    public void setCallingPidUid(int p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
