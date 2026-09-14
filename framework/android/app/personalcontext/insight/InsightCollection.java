package android.app.personalcontext.insight;

public final class InsightCollection extends android.app.personalcontext.insight.ContextInsight implements java.lang.Iterable<android.app.personalcontext.insight.ContextInsight> {
    private static final java.lang.String KEY_INSIGHTS = "key_insights";
    private final java.util.List<android.app.personalcontext.insight.ContextInsight> mInsights = null;
    InsightCollection(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    InsightCollection(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    InsightCollection(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.Collection<android.app.personalcontext.insight.ContextInsight> p1) { super(null); }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Collection<android.app.personalcontext.insight.ContextInsight> getChildren() { return null; }
    int getInsightType() { return 0; }
    public java.util.List<android.app.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public java.util.Set<android.app.personalcontext.hint.PublishedContextHint> getOriginHints() { return null; }
    public java.util.Set<android.app.personalcontext.Token> getTokens() { return null; }
    public int hashCode() { return 0; }
    public java.util.Iterator<android.app.personalcontext.insight.ContextInsight> iterator() { return null; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.app.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public Builder(java.util.Collection<android.app.personalcontext.insight.ContextInsight> p0) {}
        public android.app.personalcontext.insight.InsightCollection.Builder addInsight(android.app.personalcontext.insight.ContextInsight p0) { return null; }
        public android.app.personalcontext.insight.InsightCollection build() { return null; }
        android.app.personalcontext.insight.InsightCollection.Builder setAttributionDetails(android.app.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
