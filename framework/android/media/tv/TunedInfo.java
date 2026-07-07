package android.media.tv;

@android.annotation.SystemApi
public final class TunedInfo implements android.os.Parcelable {
    public static final int APP_TAG_SELF = 0;
    public static final int APP_TYPE_NON_SYSTEM = 3;
    public static final int APP_TYPE_SELF = 1;
    public static final int APP_TYPE_SYSTEM = 2;
    public static final android.os.Parcelable.Creator<android.media.tv.TunedInfo> CREATOR = null;
    static final java.lang.String TAG = "TunedInfo";
    private final int mAppTag = 0;
    private final int mAppType = 0;
    private final android.net.Uri mChannelUri = null;
    private final java.lang.String mInputId = null;
    private final boolean mIsMainSession = false;
    private final boolean mIsRecordingSession = false;
    private final boolean mIsVisible = false;
    private TunedInfo(android.os.Parcel p0) {}
    public TunedInfo(java.lang.String p0, android.net.Uri p1, boolean p2, boolean p3, boolean p4, int p5, int p6) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAppTag() { return 0; }
    public int getAppType() { return 0; }
    public android.net.Uri getChannelUri() { return null; }
    public java.lang.String getInputId() { return null; }
    public int hashCode() { return 0; }
    public boolean isMainSession() { return false; }
    public boolean isRecordingSession() { return false; }
    public boolean isVisible() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppType {
    }
}
