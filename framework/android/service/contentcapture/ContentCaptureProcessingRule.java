package android.service.contentcapture;

@android.annotation.SystemApi
public abstract class ContentCaptureProcessingRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.ContentCaptureProcessingRule> CREATOR = null;
    private static final java.lang.String TAG = "CCProcessingRule";
    public static final int TYPE_CONVERSATION_RULE = 1;
    public static final int TYPE_MEMORY_RECENT_VIEW_RULE = 2;
    public static final int TYPE_MEMORY_USER_INPUT_RULE = 3;
    private final int mType = 0;
    protected ContentCaptureProcessingRule(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    int getType() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected abstract void writeToParcelImpl(android.os.Parcel p0, int p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RuleType {
    }
}
