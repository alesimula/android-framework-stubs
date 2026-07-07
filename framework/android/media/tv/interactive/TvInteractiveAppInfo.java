package android.media.tv.interactive;

public class TvInteractiveAppInfo implements android.os.Parcelable {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_DESTROY = 3;
    public static final int CONTROL_CODE_KILL = 4;
    public static final int CONTROL_CODE_PRESENT = 2;
    public static final int CONTROL_CODE_STORED_AUTOSTART = 17;
    public static final int CONTROL_CODE_STORED_PRESENT = 18;
    public static final int CONTROL_CODE_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.media.tv.interactive.TvInteractiveAppInfo> CREATOR = null;
    public static final int INTERACTIVE_APP_STATE_LOADING = 5;
    public static final int INTERACTIVE_APP_STATE_READY = 6;
    public static final int INTERACTIVE_APP_STATE_SIGNALED = 4;
    public static final int INTERACTIVE_APP_STATE_STARTED = 8;
    public static final int INTERACTIVE_APP_STATE_STARTING = 7;
    public static final int INTERACTIVE_APP_STATE_STOPPED = 1;
    public static final int INTERACTIVE_APP_STATE_STOPPING = 9;
    public static final int INTERACTIVE_APP_STATE_UNKNOWN = 0;
    public static final int INTERACTIVE_APP_STATE_UNLOADED = 10;
    public static final int INTERACTIVE_APP_TYPE_HTML5 = 2;
    public static final int INTERACTIVE_APP_TYPE_NCL = 1;
    public static final int INTERACTIVE_APP_TYPE_UNKNOWN = 0;
    private final int mControlCode = 0;
    private final java.lang.String mDescription = null;
    private final android.os.Bundle mExtra = null;
    private final int mHandle = 0;
    private final android.graphics.Bitmap mIcon = null;
    private final java.lang.String mId = null;
    private final boolean mIsServiceBound = false;
    private final boolean mIsStored = false;
    private final java.lang.String mName = null;
    private final java.lang.String mOrganization = null;
    private final int mSize = 0;
    private final int mState = 0;
    private final int mType = 0;
    private final java.lang.String mVersion = null;
    private TvInteractiveAppInfo(android.media.tv.interactive.TvInteractiveAppInfo.Builder p0) {}
    private TvInteractiveAppInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getControlCode() { return 0; }
    public java.lang.String getDescription() { return null; }
    public android.os.Bundle getExtra() { return null; }
    public int getHandle() { return 0; }
    public android.graphics.Bitmap getIcon() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getOrganization() { return null; }
    public int getSize() { return 0; }
    public int getState() { return 0; }
    public int getType() { return 0; }
    public java.lang.String getVersion() { return null; }
    public boolean isServiceBound() { return false; }
    public boolean isStored() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mControlCode;
        private java.lang.String mDescription;
        private android.os.Bundle mExtra;
        private int mHandle;
        private android.graphics.Bitmap mIcon;
        private java.lang.String mId;
        private boolean mIsServiceBound;
        private boolean mIsStored;
        private java.lang.String mName;
        private java.lang.String mOrganization;
        private int mSize;
        private int mState;
        private int mType;
        private java.lang.String mVersion;
        public Builder() {}
        public android.media.tv.interactive.TvInteractiveAppInfo build() { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setControlCode(int p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setDescription(java.lang.String p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setExtra(android.os.Bundle p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setHandle(int p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setIcon(android.graphics.Bitmap p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setId(java.lang.String p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setIsServiceBound(boolean p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setIsStored(boolean p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setName(java.lang.String p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setOrganization(java.lang.String p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setSize(int p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setState(int p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setType(int p0) { return null; }
        public android.media.tv.interactive.TvInteractiveAppInfo.Builder setVersion(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ControlCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppType {
    }
}
