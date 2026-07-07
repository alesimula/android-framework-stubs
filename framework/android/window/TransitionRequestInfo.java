package android.window;

public final class TransitionRequestInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo> CREATOR = null;
    private final int mDebugId = 0;
    private java.util.List<android.window.TransitionRequestInfo.DisplayChange> mDisplayChanges;
    private final int mFlags = 0;
    private android.window.TransitionRequestInfo.FullscreenRequestChange mFullscreenRequestChange;
    private android.window.TransitionRequestInfo.PipChange mPipChange;
    private android.window.TransitionRequestInfo.RemoteTransitionInfo mRemoteTransitionInfo;
    private android.window.TransitionRequestInfo.RequestedLocation mRequestedLocation;
    private android.app.ActivityManager.RunningTaskInfo mTriggerTask;
    private final int mType = 0;
    private android.window.TransitionRequestInfo.UserChange mUserChange;
    private android.window.TransitionRequestInfo.WindowingLayerChange mWindowingLayerChange;
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.app.ActivityManager.RunningTaskInfo p2, android.window.TransitionRequestInfo.RemoteTransitionInfo p3, java.util.List<android.window.TransitionRequestInfo.DisplayChange> p4, int p5) {}
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.PipChange p2, android.window.TransitionRequestInfo.RemoteTransitionInfo p3, java.util.List<android.window.TransitionRequestInfo.DisplayChange> p4, android.window.TransitionRequestInfo.RequestedLocation p5, android.window.TransitionRequestInfo.UserChange p6, android.window.TransitionRequestInfo.WindowingLayerChange p7, android.window.TransitionRequestInfo.FullscreenRequestChange p8, int p9, int p10) {}
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.RemoteTransitionInfo p2) {}
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.RemoteTransitionInfo p2, int p3) {}
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.RemoteTransitionInfo p2, java.util.List<android.window.TransitionRequestInfo.DisplayChange> p3, int p4) {}
    TransitionRequestInfo(android.os.Parcel p0) {}
    public TransitionRequestInfo(android.window.TransitionRequestInfo p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public int getDebugId() { return 0; }
    public android.window.TransitionRequestInfo.DisplayChange getDisplayChangeForDisplay(int p0) { return null; }
    public java.util.List<android.window.TransitionRequestInfo.DisplayChange> getDisplayChanges() { return null; }
    public int getFlags() { return 0; }
    public android.window.TransitionRequestInfo.FullscreenRequestChange getFullscreenRequestChange() { return null; }
    public android.window.TransitionRequestInfo.PipChange getPipChange() { return null; }
    public android.window.RemoteTransition getRemoteTransition() { return null; }
    public android.window.TransitionRequestInfo.RemoteTransitionInfo getRemoteTransitionInfo() { return null; }
    public android.window.TransitionRequestInfo.RequestedLocation getRequestedLocation() { return null; }
    public android.app.ActivityManager.RunningTaskInfo getTriggerTask() { return null; }
    public int getType() { return 0; }
    public android.window.TransitionRequestInfo.UserChange getUserChange() { return null; }
    public android.window.TransitionRequestInfo.WindowingLayerChange getWindowingLayerChange() { return null; }
    public android.window.TransitionRequestInfo setDisplayChanges(java.util.List<android.window.TransitionRequestInfo.DisplayChange> p0) { return null; }
    public android.window.TransitionRequestInfo setFullscreenRequestChange(android.window.TransitionRequestInfo.FullscreenRequestChange p0) { return null; }
    public android.window.TransitionRequestInfo setPipChange(android.window.TransitionRequestInfo.PipChange p0) { return null; }
    public void setRemoteTransition(android.window.RemoteTransition p0) {}
    public android.window.TransitionRequestInfo setRemoteTransitionInfo(android.window.TransitionRequestInfo.RemoteTransitionInfo p0) { return null; }
    public android.window.TransitionRequestInfo setRequestedLocation(android.window.TransitionRequestInfo.RequestedLocation p0) { return null; }
    public android.window.TransitionRequestInfo setTriggerTask(android.app.ActivityManager.RunningTaskInfo p0) { return null; }
    public android.window.TransitionRequestInfo setUserChange(android.window.TransitionRequestInfo.UserChange p0) { return null; }
    public android.window.TransitionRequestInfo setWindowingLayerChange(android.window.TransitionRequestInfo.WindowingLayerChange p0) { return null; }
    public java.lang.String toString() { return null; }
    java.lang.String typeToString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class DisplayChange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.DisplayChange> CREATOR = null;
        private int mDisconnectReparentDisplay;
        private final int mDisplayId = 0;
        private android.graphics.Rect mEndAbsBounds;
        private android.window.DisplayAreaInfo mEndDisplayAreaInfo;
        private android.view.InsetsState mEndInsetsState;
        private int mEndRotation;
        private boolean mPhysicalDisplayChanged;
        private android.graphics.Rect mStartAbsBounds;
        private int mStartRotation;
        public DisplayChange(int p0) {}
        public DisplayChange(int p0, int p1, int p2, android.view.InsetsState p3) {}
        DisplayChange(int p0, android.graphics.Rect p1, android.graphics.Rect p2, android.window.DisplayAreaInfo p3, int p4, int p5, boolean p6, int p7, android.view.InsetsState p8) {}
        DisplayChange(android.os.Parcel p0) {}
        public DisplayChange(android.window.DisplayAreaInfo p0) {}
        public DisplayChange(android.window.TransitionRequestInfo.DisplayChange p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public int getDisconnectReparentDisplay() { return 0; }
        public int getDisplayId() { return 0; }
        public android.graphics.Rect getEndAbsBounds() { return null; }
        public android.window.DisplayAreaInfo getEndDisplayAreaInfo() { return null; }
        public android.view.InsetsState getEndInsetsState() { return null; }
        public int getEndRotation() { return 0; }
        public android.graphics.Rect getStartAbsBounds() { return null; }
        public int getStartRotation() { return 0; }
        public boolean isPhysicalDisplayChanged() { return false; }
        public android.window.TransitionRequestInfo.DisplayChange setDisconnectReparentDisplay(int p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setEndAbsBounds(android.graphics.Rect p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setEndDisplayAreaInfo(android.window.DisplayAreaInfo p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setEndInsetsState(android.view.InsetsState p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setEndRotation(int p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setPhysicalDisplayChanged(boolean p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setStartAbsBounds(android.graphics.Rect p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setStartRotation(int p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class FullscreenRequestChange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.FullscreenRequestChange> CREATOR = null;
        private final int mModeRequest = 0;
        private final android.os.IRemoteCallback mRemoteCallback = null;
        public FullscreenRequestChange(int p0, android.os.IRemoteCallback p1) {}
        FullscreenRequestChange(android.os.Parcel p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public int getModeRequest() { return 0; }
        public android.os.IRemoteCallback getRemoteCallback() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class PipChange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.PipChange> CREATOR = null;
        private android.window.WindowContainerToken mTaskFragmentToken;
        private android.app.ActivityManager.RunningTaskInfo mTaskInfo;
        public PipChange(android.app.ActivityManager.RunningTaskInfo p0) {}
        PipChange(android.os.Parcel p0) {}
        public PipChange(android.window.WindowContainerToken p0, android.app.ActivityManager.RunningTaskInfo p1) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public android.window.WindowContainerToken getTaskFragmentToken() { return null; }
        public android.app.ActivityManager.RunningTaskInfo getTaskInfo() { return null; }
        public android.window.TransitionRequestInfo.PipChange setTaskFragmentToken(android.window.WindowContainerToken p0) { return null; }
        public android.window.TransitionRequestInfo.PipChange setTaskInfo(android.app.ActivityManager.RunningTaskInfo p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class RemoteTransitionInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.RemoteTransitionInfo> CREATOR = null;
        private final java.lang.String mDebugName = null;
        private final android.window.TransitionFilter mFilter = null;
        private final android.window.IRemoteTransition mRemoteTransition = null;
        RemoteTransitionInfo(android.os.Parcel p0) {}
        public RemoteTransitionInfo(android.window.RemoteTransition p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public java.lang.String getDebugName() { return null; }
        public android.window.TransitionFilter getFilter() { return null; }
        public android.window.IRemoteTransition getRemoteTransition() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class RequestedLocation implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.RequestedLocation> CREATOR = null;
        private android.graphics.Rect mBounds;
        private int mDisplayId;
        public RequestedLocation(int p0, android.graphics.Rect p1) {}
        RequestedLocation(android.os.Parcel p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public android.graphics.Rect getBounds() { return null; }
        public int getDisplayId() { return 0; }
        public android.window.TransitionRequestInfo.RequestedLocation setBounds(android.graphics.Rect p0) { return null; }
        public android.window.TransitionRequestInfo.RequestedLocation setDisplayId(int p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class UserChange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.UserChange> CREATOR = null;
        private final int mNewUserId = 0;
        private final int mPreviousUserId = 0;
        public UserChange(int p0, int p1) {}
        UserChange(android.os.Parcel p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public int getNewUserId() { return 0; }
        public int getPreviousUserId() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class WindowingLayerChange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.WindowingLayerChange> CREATOR = null;
        private final android.os.IRemoteCallback mRemoteCallback = null;
        private final int mWindowingLayer = 0;
        public WindowingLayerChange(int p0, android.os.IRemoteCallback p1) {}
        WindowingLayerChange(android.os.Parcel p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public android.os.IRemoteCallback getRemoteCallback() { return null; }
        public int getWindowingLayer() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
