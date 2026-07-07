package android.service.personalcontext.insight;

public final class MapInsight extends android.service.personalcontext.insight.ContextInsight {
    private final java.util.Map<java.lang.String, android.service.personalcontext.insight.ContextInsight> mInsights = null;
    MapInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private MapInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.Map<java.lang.String, android.service.personalcontext.insight.ContextInsight> p1) { super(null); }
    private static java.util.Map<java.lang.String, android.service.personalcontext.insight.ContextInsight> extractInsightMapFromBundle(android.os.Bundle p0) { return null; }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    int getInsightType() { return 0; }
    public java.util.Map<java.lang.String, android.service.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.Map<java.lang.String, android.service.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public android.service.personalcontext.insight.MapInsight.Builder addInsight(java.lang.String p0, android.service.personalcontext.insight.ContextInsight p1) { return null; }
        public android.service.personalcontext.insight.MapInsight build() { return null; }
        android.service.personalcontext.insight.MapInsight.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
