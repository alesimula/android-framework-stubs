package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class AugmentedAutofillOptionInsight extends android.service.personalcontext.insight.ContextInsight {
    private static final java.lang.String KEY_DISPLAY_DETAILS = "key_display_details";
    private static final java.lang.String KEY_INLINE_SUGGESTION_HINTS = "key_inline_suggestion_hints";
    private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
    private final java.util.List<java.lang.String> mInlineSuggestionHints = null;
    AugmentedAutofillOptionInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    AugmentedAutofillOptionInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    AugmentedAutofillOptionInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0, android.service.personalcontext.insight.InsightDisplayDetails p1, java.util.List<java.lang.String> p2) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.insight.InsightDisplayDetails getDetails() { return null; }
    public java.util.List<java.lang.String> getInlineSuggestionHints() { return null; }
    int getInsightType() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static final class Builder {
        private final android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder mBaseBuilder = null;
        private final android.service.personalcontext.insight.InsightDisplayDetails mDisplayDetails = null;
        private final java.util.List<java.lang.String> mInlineSuggestionHints = null;
        public Builder(android.service.personalcontext.insight.InsightDisplayDetails p0) {}
        public android.service.personalcontext.insight.AugmentedAutofillOptionInsight.Builder addInlineSuggestionHint(java.lang.String p0) { return null; }
        public android.service.personalcontext.insight.AugmentedAutofillOptionInsight build() { return null; }
    }
}
