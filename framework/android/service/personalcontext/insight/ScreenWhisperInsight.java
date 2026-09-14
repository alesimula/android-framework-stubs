package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class ScreenWhisperInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_INSIGHT = "insight";
    private final android.service.personalcontext.insight.ContextInsight mChildInsight = null;
    ScreenWhisperInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    ScreenWhisperInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    ScreenWhisperInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.service.personalcontext.insight.ContextInsight p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.insight.ContextInsight getChildInsight() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.service.personalcontext.insight.ContextInsight mChildInsight = null;
        public Builder(android.service.personalcontext.insight.ActionableInsight p0) {}
        public Builder(android.service.personalcontext.insight.PromptInsight p0) {}
        public android.service.personalcontext.insight.ScreenWhisperInsight build() { return null; }
        public android.service.personalcontext.insight.ScreenWhisperInsight.Builder setBranding(android.service.personalcontext.insight.InsightBranding p0) { return null; }
    }
}
