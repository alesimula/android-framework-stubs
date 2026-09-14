package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class NotificationInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_INSIGHTS = "insights";
    private final java.util.List<android.service.personalcontext.insight.ContextInsight> mInsights = null;
    NotificationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    NotificationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    NotificationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, java.util.List<android.service.personalcontext.insight.ContextInsight> p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.personalcontext.insight.ContextInsight> getChildInsights() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.service.personalcontext.insight.ContextInsight> mInsights = null;
        public Builder() {}
        public android.service.personalcontext.insight.NotificationInsight.Builder addChildInsight(android.service.personalcontext.insight.ActionableInsight p0) { return null; }
        public android.service.personalcontext.insight.NotificationInsight.Builder addChildInsight(android.service.personalcontext.insight.DisplayInsight p0) { return null; }
        public android.service.personalcontext.insight.NotificationInsight build() { return null; }
        public android.service.personalcontext.insight.NotificationInsight.Builder setBranding(android.service.personalcontext.insight.InsightBranding p0) { return null; }
    }
}
