package android.app.personalcontext.insight;

public final class MapInsight extends android.app.personalcontext.insight.ContextInsight {
    private final java.util.Map<java.lang.String, android.app.personalcontext.insight.ContextInsight> mInsights = null;
    MapInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    MapInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    MapInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.Map<java.lang.String, android.app.personalcontext.insight.ContextInsight> p1) { super(null); }
    private static java.util.Map<java.lang.String, android.app.personalcontext.insight.ContextInsight> extractInsightMapFromBundle(android.os.Bundle p0) { return null; }
    private static java.util.Map<java.lang.String, android.app.personalcontext.insight.ContextInsight> readInsightMapFromParcel(android.os.Parcel p0) { return null; }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    int getInsightType() { return 0; }
    public java.util.Map<java.lang.String, android.app.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.Map<java.lang.String, android.app.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public android.app.personalcontext.insight.MapInsight.Builder addInsight(java.lang.String p0, android.app.personalcontext.insight.ContextInsight p1) { return null; }
        public android.app.personalcontext.insight.MapInsight build() { return null; }
        android.app.personalcontext.insight.MapInsight.Builder setAttributionDetails(android.app.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
