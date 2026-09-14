package android.app.personalcontext.insight;

public final class HintInvalidationInsight extends android.app.personalcontext.insight.ContextInsight {
    private final android.app.personalcontext.hint.PublishedContextHint mInvalidationHint = null;
    HintInvalidationInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0) { super(null); }
    HintInvalidationInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    HintInvalidationInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    int getInsightType() { return 0; }
    public java.util.UUID getInvalidatedHintId() { return null; }
    public boolean isHintInvalidated(android.app.personalcontext.hint.PublishedContextHint p0) { return false; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        public Builder(android.app.personalcontext.hint.HintInvalidationHint p0) {}
        public Builder(android.app.personalcontext.hint.PublishedContextHint p0) {}
        public android.app.personalcontext.insight.HintInvalidationInsight.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.insight.HintInvalidationInsight build() { return null; }
    }
}
