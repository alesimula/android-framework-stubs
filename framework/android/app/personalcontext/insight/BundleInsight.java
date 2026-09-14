package android.app.personalcontext.insight;

public final class BundleInsight extends android.app.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_DATA = "data";
    private static final java.lang.String KEY_TYPE = "type";
    private final android.os.Bundle mDataBundle = null;
    private final java.lang.String mInsightTypeName = null;
    BundleInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    BundleInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    BundleInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, java.lang.String p1, android.os.Bundle p2) { super(null); }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    public android.os.Bundle getDataBundle() { return null; }
    int getInsightType() { return 0; }
    public java.lang.String getInsightTypeName() { return null; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.os.Bundle mDataBundle = null;
        private java.lang.String mInsightTypeName;
        public Builder() {}
        public android.app.personalcontext.insight.BundleInsight.Builder addOriginHint(android.app.personalcontext.hint.PublishedContextHint p0) { return null; }
        public android.app.personalcontext.insight.BundleInsight.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.insight.BundleInsight build() { return null; }
        android.app.personalcontext.insight.BundleInsight.Builder setAttributionDetails(android.app.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
        public android.app.personalcontext.insight.BundleInsight.Builder setDataBundle(android.os.Bundle p0) { return null; }
        public android.app.personalcontext.insight.BundleInsight.Builder setInsightTypeName(java.lang.String p0) { return null; }
    }
}
