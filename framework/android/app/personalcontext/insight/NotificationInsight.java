package android.app.personalcontext.insight;

public final class NotificationInsight extends android.app.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_INSIGHTS = "insights";
    private final java.util.List<android.app.personalcontext.insight.ContextInsight> mInsights = null;
    NotificationInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    NotificationInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    NotificationInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.List<android.app.personalcontext.insight.ContextInsight> p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.personalcontext.insight.ContextInsight> getChildInsights() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.app.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public android.app.personalcontext.insight.NotificationInsight.Builder addChildInsight(android.app.personalcontext.insight.ActionableInsight p0) { return null; }
        public android.app.personalcontext.insight.NotificationInsight.Builder addChildInsight(android.app.personalcontext.insight.DisplayInsight p0) { return null; }
        public android.app.personalcontext.insight.NotificationInsight build() { return null; }
        public android.app.personalcontext.insight.NotificationInsight.Builder setBranding(android.app.personalcontext.insight.InsightBranding p0) { return null; }
    }
}
