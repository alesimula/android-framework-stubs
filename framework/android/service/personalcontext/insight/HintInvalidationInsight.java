package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class HintInvalidationInsight extends android.service.personalcontext.insight.ContextInsight {
    private final android.service.personalcontext.hint.PublishedContextHint mInvalidationHint = null;
    private HintInvalidationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0) { super(null); }
    HintInvalidationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    int getInsightType() { return 0; }
    public java.util.UUID getInvalidatedHintId() { return null; }
    public boolean isHintInvalidated(android.service.personalcontext.hint.PublishedContextHint p0) { return false; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        public Builder(android.service.personalcontext.hint.PublishedContextHint p0) {}
        public android.service.personalcontext.insight.HintInvalidationInsight.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.insight.HintInvalidationInsight build() { return null; }
    }
}
