package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class InsightCollection extends android.service.personalcontext.insight.ContextInsight implements java.lang.Iterable<android.service.personalcontext.insight.ContextInsight> {
    private static final java.lang.String KEY_INSIGHTS = "key_insights";
    private final java.util.List<android.service.personalcontext.insight.ContextInsight> mInsights = null;
    InsightCollection(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private InsightCollection(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.Collection<android.service.personalcontext.insight.ContextInsight> p1) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Collection<android.service.personalcontext.insight.ContextInsight> getChildren() { return null; }
    int getInsightType() { return 0; }
    public java.util.List<android.service.personalcontext.insight.ContextInsight> getInsights() { return null; }
    @java.lang.Deprecated
    public java.util.Set<android.service.personalcontext.hint.PublishedContextHint> getOriginHints() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.util.Set<android.service.personalcontext.Token> getTokens() { return null; }
    public int hashCode() { return 0; }
    public java.util.Iterator<android.service.personalcontext.insight.ContextInsight> iterator() { return null; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.service.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public Builder(java.util.Collection<android.service.personalcontext.insight.ContextInsight> p0) {}
        public android.service.personalcontext.insight.InsightCollection.Builder addInsight(android.service.personalcontext.insight.ContextInsight p0) { return null; }
        public android.service.personalcontext.insight.InsightCollection build() { return null; }
        android.service.personalcontext.insight.InsightCollection.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
