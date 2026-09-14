package android.app.personalcontext.insight;

public final class ActionableInsight extends android.app.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_ACTION_DETAILS = "key_action_details";
    private static final java.lang.String KEY_DISPLAY_DETAILS = "key_display_details";
    private final android.app.personalcontext.insight.InsightActionDetails mActionDetails = null;
    private final android.app.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
    ActionableInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.app.personalcontext.insight.InsightActionDetails p1, android.app.personalcontext.insight.InsightDisplayDetails p2) { super(null); }
    ActionableInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    ActionableInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public ActionableInsight(android.app.personalcontext.insight.InsightActionDetails p0, android.app.personalcontext.insight.InsightDisplayDetails p1, android.app.personalcontext.insight.InsightBranding p2) { super(null); }
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    public android.app.personalcontext.insight.interaction.ReturnHintReport createReturnHintReport() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.personalcontext.insight.InsightActionDetails getActionDetails() { return null; }
    public android.app.personalcontext.insight.InsightDisplayDetails getDisplayDetails() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.app.personalcontext.insight.InsightActionDetails mActionDetails = null;
        private final android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.app.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
        public Builder(android.app.personalcontext.insight.InsightActionDetails p0, android.app.personalcontext.insight.InsightDisplayDetails p1) {}
        public android.app.personalcontext.insight.ActionableInsight.Builder addOriginHint(android.app.personalcontext.hint.PublishedContextHint p0) { return null; }
        public android.app.personalcontext.insight.ActionableInsight.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.insight.ActionableInsight build() { return null; }
    }
}
