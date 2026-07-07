package android.view;

@java.lang.Deprecated
public final class InputMonitor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InputMonitor> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "InputMonitor";
    private final android.view.IInputMonitorHost mHost = null;
    private final android.view.InputChannel mInputChannel = null;
    private final android.view.SurfaceControl mSurface = null;
    InputMonitor(android.os.Parcel p0) {}
    public InputMonitor(android.view.InputChannel p0, android.view.IInputMonitorHost p1, android.view.SurfaceControl p2) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public void dispose() {}
    public android.view.IInputMonitorHost getHost() { return null; }
    public android.view.InputChannel getInputChannel() { return null; }
    public android.view.SurfaceControl getSurface() { return null; }
    @java.lang.Deprecated
    public void pilferPointers() {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
