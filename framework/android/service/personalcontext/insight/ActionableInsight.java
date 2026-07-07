package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class ActionableInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_ACTION_DETAILS = "key_action_details";
    private static final java.lang.String KEY_DISPLAY_DETAILS = "key_display_details";
    private final android.service.personalcontext.insight.InsightActionDetails mActionDetails = null;
    private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
    ActionableInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private ActionableInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.service.personalcontext.insight.InsightActionDetails p1, android.service.personalcontext.insight.InsightDisplayDetails p2) { super(null); }
    public void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1) {}
    public android.service.personalcontext.insight.interaction.ReturnHintReport createReturnHintReport() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.insight.InsightActionDetails getActionDetails() { return null; }
    public android.service.personalcontext.insight.InsightDisplayDetails getDisplayDetails() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.insight.InsightActionDetails mActionDetails = null;
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
        public Builder(android.service.personalcontext.insight.InsightActionDetails p0, android.service.personalcontext.insight.InsightDisplayDetails p1) {}
        public android.service.personalcontext.insight.ActionableInsight.Builder addOriginHint(android.service.personalcontext.hint.PublishedContextHint p0) { return null; }
        public android.service.personalcontext.insight.ActionableInsight.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.insight.ActionableInsight build() { return null; }
        android.service.personalcontext.insight.ActionableInsight.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
    }
}
