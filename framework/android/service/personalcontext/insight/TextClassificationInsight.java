package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class TextClassificationInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_ACTION_DETAILS = "key_action_details";
    private static final java.lang.String KEY_DISPLAY_DETAILS = "key_display_details";
    private final android.service.personalcontext.insight.InsightActionDetails mActionDetails = null;
    private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
    TextClassificationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    TextClassificationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    TextClassificationInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.service.personalcontext.insight.InsightActionDetails p1, android.service.personalcontext.insight.InsightDisplayDetails p2) { super(null); }
    public TextClassificationInsight(android.service.personalcontext.insight.InsightActionDetails p0, android.service.personalcontext.insight.InsightDisplayDetails p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.insight.InsightActionDetails getActionDetails() { return null; }
    public android.service.personalcontext.insight.InsightDisplayDetails getDisplayDetails() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}
}
