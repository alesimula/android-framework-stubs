package android.service.personalcontext.understander;

public final class UnderstandResult {
    private final android.app.PendingIntent mFeedbackActivity = null;
    private final android.util.SparseArray<android.app.personalcontext.insight.ContextInsight> mInsightMapping = null;
    private final android.service.personalcontext.understander.UnderstandRequest mRequest = null;
    private final android.service.personalcontext.embedded.InsightVisualizerSession mVisualizerSession = null;
    private UnderstandResult(android.service.personalcontext.understander.UnderstandResult.Builder p0) {}
    public android.app.PendingIntent getFeedbackActivity() { return null; }
    android.util.SparseArray<android.app.personalcontext.insight.ContextInsight> getInsightMapping() { return null; }
    public android.app.personalcontext.insight.ContextInsight getResponseForDestination(int p0) { return null; }
    public android.service.personalcontext.embedded.InsightVisualizerSession getVisualizerSession() { return null; }

    public static final class Builder {
        private android.app.PendingIntent mFeedbackActivity;
        private final android.util.SparseArray<android.app.personalcontext.insight.ContextInsight> mInsightMapping = null;
        private final android.service.personalcontext.understander.UnderstandRequest mRequest = null;
        private android.service.personalcontext.embedded.InsightVisualizerSession mVisualizerSession;
        public Builder(android.service.personalcontext.understander.UnderstandRequest p0) {}
        public android.service.personalcontext.understander.UnderstandResult build() { return null; }
        public android.service.personalcontext.understander.UnderstandResult.Builder setFeedbackActivity(android.app.PendingIntent p0) { return null; }
        public android.service.personalcontext.understander.UnderstandResult.Builder setResponseForDestination(int p0, android.app.personalcontext.insight.ContextInsight p1) { return null; }
        public android.service.personalcontext.understander.UnderstandResult.Builder setVisualizerSession(android.service.personalcontext.embedded.InsightVisualizerSession p0) { return null; }
    }
}
