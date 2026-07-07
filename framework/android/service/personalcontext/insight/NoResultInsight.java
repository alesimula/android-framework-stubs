package android.service.personalcontext.insight;

public final class NoResultInsight extends android.service.personalcontext.insight.ContextInsight {
    public NoResultInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0) { super(null); }
    NoResultInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    int getInsightType() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        public Builder() {}
        public android.service.personalcontext.insight.NoResultInsight build() { return null; }
        android.service.personalcontext.insight.NoResultInsight.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
