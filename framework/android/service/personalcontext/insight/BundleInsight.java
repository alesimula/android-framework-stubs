package android.service.personalcontext.insight;

public final class BundleInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_DATA = "data";
    private static final java.lang.String KEY_TYPE = "type";
    private final android.os.Bundle mDataBundle = null;
    private final java.lang.String mInsightTypeName = null;
    BundleInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private BundleInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1, java.lang.String p2) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    public android.os.Bundle getDataBundle() { return null; }
    int getInsightType() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String getInsightTypeName() { return null; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.os.Bundle mDataBundle = null;
        private java.lang.String mInsightTypeName;
        public Builder() {}
        @android.annotation.SystemApi
        public android.service.personalcontext.insight.BundleInsight.Builder addOriginHint(android.service.personalcontext.hint.PublishedContextHint p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public android.service.personalcontext.insight.BundleInsight.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.insight.BundleInsight build() { return null; }
        android.service.personalcontext.insight.BundleInsight.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
        public android.service.personalcontext.insight.BundleInsight.Builder setDataBundle(android.os.Bundle p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public android.service.personalcontext.insight.BundleInsight.Builder setInsightTypeName(java.lang.String p0) { return null; }
    }
}
