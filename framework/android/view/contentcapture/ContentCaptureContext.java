package android.view.contentcapture;

public final class ContentCaptureContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.contentcapture.ContentCaptureContext> CREATOR = null;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int FLAG_DISABLED_BY_APP = 1;
    @android.annotation.SystemApi
    public static final int FLAG_DISABLED_BY_FLAG_SECURE = 2;
    @android.annotation.SystemApi
    public static final int FLAG_RECONNECTED = 4;
    private final android.app.assist.ActivityId mActivityId = null;
    private final android.content.ComponentName mComponentName = null;
    private final int mDisplayId = 0;
    private final android.os.Bundle mExtras = null;
    private final int mFlags = 0;
    private final boolean mHasClientContext = false;
    private final android.content.LocusId mId = null;
    private int mParentSessionId;
    private final android.os.IBinder mWindowToken = null;
    private ContentCaptureContext(android.view.contentcapture.ContentCaptureContext.Builder p0) {}
    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0, int p1) {}
    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0, android.app.assist.ActivityId p1, android.content.ComponentName p2, int p3, android.os.IBinder p4, int p5) {}
    public static android.view.contentcapture.ContentCaptureContext forLocusId(java.lang.String p0) { return null; }
    private boolean fromServer() { return false; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0) {}
    @android.annotation.SystemApi
    public android.content.ComponentName getActivityComponent() { return null; }
    @android.annotation.SystemApi
    public android.app.assist.ActivityId getActivityId() { return null; }
    @android.annotation.SystemApi
    public int getDisplayId() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.SystemApi
    public int getFlags() { return 0; }
    public android.content.LocusId getLocusId() { return null; }
    @android.annotation.SystemApi
    public android.view.contentcapture.ContentCaptureSessionId getParentSessionId() { return null; }
    @android.annotation.SystemApi
    public int getTaskId() { return 0; }
    @android.annotation.SystemApi
    public android.os.IBinder getWindowToken() { return null; }
    public void setParentSessionId(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mDestroyed;
        private android.os.Bundle mExtras;
        private final android.content.LocusId mId = null;
        public Builder(android.content.LocusId p0) {}
        private void throwIfDestroyed() {}
        public android.view.contentcapture.ContentCaptureContext build() { return null; }
        public android.view.contentcapture.ContentCaptureContext.Builder setExtras(android.os.Bundle p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContextCreationFlags {
    }
}
