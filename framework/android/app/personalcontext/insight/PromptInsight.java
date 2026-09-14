package android.app.personalcontext.insight;

public final class PromptInsight extends android.app.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_COUNT = "key_count";
    private static final java.lang.String KEY_DISPLAY_DETAILS = "key_display_details";
    private static final java.lang.String KEY_PROMPT_INTENT = "key_prompt_intent";
    private final int mCount = 0;
    private final android.app.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
    private final android.app.PendingIntent mPromptIntent = null;
    PromptInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.app.personalcontext.insight.InsightDisplayDetails p1, int p2, android.app.PendingIntent p3) { super(null); }
    PromptInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    PromptInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCount() { return 0; }
    public android.app.personalcontext.insight.InsightDisplayDetails getDetails() { return null; }
    int getInsightType() { return 0; }
    public android.app.PendingIntent getPromptIntent() { return null; }
    public boolean hasCount() { return false; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private int mCount;
        private final android.app.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
        private android.app.PendingIntent mPromptIntent;
        public Builder(android.app.personalcontext.insight.InsightDisplayDetails p0) {}
        public android.app.personalcontext.insight.PromptInsight build() { return null; }
        public android.app.personalcontext.insight.PromptInsight.Builder clearCount() { return null; }
        public android.app.personalcontext.insight.PromptInsight.Builder setBranding(android.app.personalcontext.insight.InsightBranding p0) { return null; }
        public android.app.personalcontext.insight.PromptInsight.Builder setCount(int p0) { return null; }
        public android.app.personalcontext.insight.PromptInsight.Builder setPromptIntent(android.app.PendingIntent p0) { return null; }
    }
}
