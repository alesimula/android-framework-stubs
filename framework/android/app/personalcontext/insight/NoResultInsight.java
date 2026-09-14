package android.app.personalcontext.insight;

public final class NoResultInsight extends android.app.personalcontext.insight.ContextInsight {
    public NoResultInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0) { super(null); }
    NoResultInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    NoResultInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    int getInsightType() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        public Builder() {}
        public android.app.personalcontext.insight.NoResultInsight build() { return null; }
        android.app.personalcontext.insight.NoResultInsight.Builder setAttributionDetails(android.app.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
