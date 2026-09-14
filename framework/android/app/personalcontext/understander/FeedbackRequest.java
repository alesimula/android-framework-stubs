package android.app.personalcontext.understander;

public final class FeedbackRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.personalcontext.understander.FeedbackRequest> CREATOR = null;
    public static final int FEEDBACK_PROPERTY_NEGATIVE = 2;
    public static final int FEEDBACK_PROPERTY_POSITIVE = 1;
    public static final int FEEDBACK_PROPERTY_UNKNOWN = 0;
    private final int mProperties = 0;
    private final android.app.personalcontext.insight.ContextInsight mSource = null;
    public FeedbackRequest(android.app.personalcontext.insight.ContextInsight p0, int p1) {}
    private FeedbackRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getProperties() { return 0; }
    public android.app.personalcontext.insight.ContextInsight getSource() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeedbackProperty {
    }
}
