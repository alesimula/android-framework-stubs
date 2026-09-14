package android.service.personalcontext.embedded;

public final class VisualizerViewAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.embedded.VisualizerViewAction> CREATOR = null;
    public static final java.lang.String EXTRA_ON_CLICK_ACTION = "android.service.personalcontext.embedded.extra.ON_CLICK_ACTION";
    public static final java.lang.String EXTRA_ON_LONG_CLICK_ACTION = "android.service.personalcontext.embedded.extra.ON_LONG_CLICK_ACTION";
    private final android.service.personalcontext.insight.ContextInsight mAttributionInsight = null;
    private final android.service.personalcontext.insight.ContextInsight mEgressInsight = null;
    private final android.app.personalcontext.understander.FeedbackRequest mFeedbackRequest = null;
    private final boolean mShouldCloseSessionOnTriggered = false;
    private VisualizerViewAction(android.service.personalcontext.insight.ContextInsight p0, android.service.personalcontext.insight.ContextInsight p1, android.app.personalcontext.understander.FeedbackRequest p2, boolean p3) {}
    public static void attach(android.content.Context p0, android.widget.RemoteViews p1, int p2, android.service.personalcontext.embedded.VisualizerViewAction p3, android.service.personalcontext.embedded.VisualizerViewAction p4) {}
    public static android.content.Intent createIntent(android.service.personalcontext.embedded.VisualizerViewAction p0, android.service.personalcontext.embedded.VisualizerViewAction p1) { return null; }
    public int describeContents() { return 0; }
    public android.service.personalcontext.insight.ContextInsight getAttributionInsight() { return null; }
    public android.service.personalcontext.insight.ContextInsight getEgressInsight() { return null; }
    public android.app.personalcontext.understander.FeedbackRequest getFeedbackRequest() { return null; }
    public boolean shouldCloseSessionOnTriggered() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mActionSet;
        private android.service.personalcontext.insight.ContextInsight mAttributionInsight;
        private android.service.personalcontext.insight.ContextInsight mEgressInsight;
        private android.app.personalcontext.understander.FeedbackRequest mFeedbackRequest;
        private boolean mShouldCloseSessionOnTriggered;
        public Builder() {}
        public android.service.personalcontext.embedded.VisualizerViewAction build() { return null; }
        public android.service.personalcontext.embedded.VisualizerViewAction.Builder setAttributionInsight(android.service.personalcontext.insight.ContextInsight p0) { return null; }
        public android.service.personalcontext.embedded.VisualizerViewAction.Builder setEgressInsight(android.service.personalcontext.insight.ContextInsight p0) { return null; }
        public android.service.personalcontext.embedded.VisualizerViewAction.Builder setFeedbackRequest(android.app.personalcontext.understander.FeedbackRequest p0) { return null; }
        public android.service.personalcontext.embedded.VisualizerViewAction.Builder setShouldCloseSessionOnTriggered(boolean p0) { return null; }
    }
}
