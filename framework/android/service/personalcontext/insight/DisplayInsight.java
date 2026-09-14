package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class DisplayInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_DISPLAY_DETAILS = "key_display_details";
    private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
    DisplayInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    DisplayInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    DisplayInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.service.personalcontext.insight.InsightDisplayDetails p1) { super(null); }
    public DisplayInsight(android.service.personalcontext.insight.InsightDisplayDetails p0, android.service.personalcontext.insight.InsightBranding p1) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.insight.InsightDisplayDetails getDetails() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    @java.lang.Deprecated
    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
        public Builder(android.service.personalcontext.insight.InsightDisplayDetails p0) {}
        @java.lang.Deprecated
        public android.service.personalcontext.insight.DisplayInsight.Builder addOriginHint(android.service.personalcontext.hint.PublishedContextHint p0) { return null; }
        @java.lang.Deprecated
        public android.service.personalcontext.insight.DisplayInsight.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.insight.DisplayInsight build() { return null; }
    }
}
