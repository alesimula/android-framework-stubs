package android.app.personalcontext.insight;

public final class ListInsight extends android.app.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_INSIGHTS = "insights";
    private final java.util.List<android.app.personalcontext.insight.ContextInsight> mInsights = null;
    ListInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    ListInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    ListInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.List<android.app.personalcontext.insight.ContextInsight> p1) { super(null); }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    int getInsightType() { return 0; }
    public java.util.List<android.app.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.app.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public android.app.personalcontext.insight.ListInsight.Builder addInsight(android.app.personalcontext.insight.ContextInsight p0) { return null; }
        public android.app.personalcontext.insight.ListInsight build() { return null; }
        android.app.personalcontext.insight.ListInsight.Builder setAttributionDetails(android.app.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
