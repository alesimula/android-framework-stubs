package android.view;

public final class WindowRelayoutResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.WindowRelayoutResult> CREATOR = null;
    public android.view.InsetsSourceControl.Array activeControls;
    public android.window.ActivityWindowInfo activityWindowInfo;
    public final android.window.ClientWindowFrames frames = null;
    public final android.view.InsetsState insetsState = null;
    public final android.util.MergedConfiguration mergedConfiguration = null;
    public int syncSeqId;
    public boolean usesSyncedInsetsAnimation;
    public WindowRelayoutResult() {}
    private WindowRelayoutResult(android.os.Parcel p0) {}
    public WindowRelayoutResult(android.view.WindowRelayoutResult p0) {}
    public WindowRelayoutResult(android.window.ClientWindowFrames p0, android.util.MergedConfiguration p1, android.view.InsetsState p2, android.view.InsetsSourceControl.Array p3) {}
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
