package android.window;

public final class RemoteTransition implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.RemoteTransition> CREATOR = null;
    private android.app.IApplicationThread mAppThread;
    private java.lang.String mDebugName;
    private android.window.TransitionFilter mFilter;
    private android.window.IRemoteTransition mRemoteTransition;
    protected RemoteTransition(android.os.Parcel p0) {}
    public RemoteTransition(android.window.IRemoteTransition p0) {}
    public RemoteTransition(android.window.IRemoteTransition p0, android.app.IApplicationThread p1, java.lang.String p2) {}
    public RemoteTransition(android.window.IRemoteTransition p0, android.app.IApplicationThread p1, java.lang.String p2, android.window.TransitionFilter p3) {}
    public RemoteTransition(android.window.IRemoteTransition p0, java.lang.String p1) {}
    public android.os.IBinder asBinder() { return null; }
    public int describeContents() { return 0; }
    public android.app.IApplicationThread getAppThread() { return null; }
    public java.lang.String getDebugName() { return null; }
    public android.window.TransitionFilter getFilter() { return null; }
    public android.window.IRemoteTransition getRemoteTransition() { return null; }
    public android.window.RemoteTransition setAppThread(android.app.IApplicationThread p0) { return null; }
    public android.window.RemoteTransition setDebugName(java.lang.String p0) { return null; }
    public android.window.RemoteTransition setFilter(android.window.TransitionFilter p0) { return null; }
    public android.window.RemoteTransition setRemoteTransition(android.window.IRemoteTransition p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
