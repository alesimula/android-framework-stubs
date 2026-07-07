package android.service.personalcontext.insight;

public final class ListInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_INSIGHTS = "insights";
    private final java.util.List<android.service.personalcontext.insight.ContextInsight> mInsights = null;
    ListInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private ListInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.List<android.service.personalcontext.insight.ContextInsight> p1) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    int getInsightType() { return 0; }
    public java.util.List<android.service.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.service.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public android.service.personalcontext.insight.ListInsight.Builder addInsight(android.service.personalcontext.insight.ContextInsight p0) { return null; }
        public android.service.personalcontext.insight.ListInsight build() { return null; }
        android.service.personalcontext.insight.ListInsight.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
