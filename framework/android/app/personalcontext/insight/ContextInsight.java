package android.app.personalcontext.insight;

public abstract class ContextInsight {
    protected static final android.app.personalcontext.insight.ContextInsight ERROR_INSIGHT = null;
    static final int INSIGHT_TYPE_ACTIONABLE = 2;
    static final int INSIGHT_TYPE_AUGMENTED_AUTOFILL = 15;
    static final int INSIGHT_TYPE_AUGMENTED_AUTOFILL_OPTION = 16;
    public static final int INSIGHT_TYPE_BUNDLE = 1;
    static final int INSIGHT_TYPE_COLLECTION = 4;
    static final int INSIGHT_TYPE_DISPLAY = 3;
    static final int INSIGHT_TYPE_ERROR = -1;
    static final int INSIGHT_TYPE_HINT_INVALIDATION = 5;
    static final int INSIGHT_TYPE_LIST = 6;
    static final int INSIGHT_TYPE_MAP = 7;
    static final int INSIGHT_TYPE_NOTIFICATION = 12;
    static final int INSIGHT_TYPE_NO_RESULT = 8;
    static final int INSIGHT_TYPE_PROMPT = 9;
    static final int INSIGHT_TYPE_SCREEN_WHISPER = 10;
    static final int INSIGHT_TYPE_SCREEN_WHISPER_AUTOFILL = 11;
    static final int INSIGHT_TYPE_TEXT_CLASSIFICATION = 14;
    private static final java.lang.String KEY_ATTRIBUTION = "key_attribution";
    private static final java.lang.String KEY_BRANDING = "key_branding";
    private static final java.lang.String KEY_CREATION_TIME = "key_creation_time";
    private static final java.lang.String KEY_INSIGHT_DATA = "key_insight_data";
    private static final java.lang.String KEY_INSIGHT_ID = "key_insight_id";
    private static final java.lang.String KEY_INSIGHT_TYPE = "key_insight_type";
    private static final java.lang.String KEY_ORIGIN_HINTS = "key_origin_hints";
    private static final java.lang.String KEY_PUBLISHED_TIMESTAMP = "key_published_timestamp";
    private static final java.lang.String KEY_PUBLISHING_COMPONENT_ID = "key_publishing_component_id";
    private static final java.lang.String KEY_TOKENS = "key_tokens";
    private static final java.lang.String TAG = "ContextInsight";
    private final android.app.personalcontext.insight.interaction.AttributionDetails mAttributionDetails = null;
    private final android.app.personalcontext.insight.InsightBranding mBranding = null;
    private final java.time.Instant mCreationTime = null;
    private final java.util.UUID mId = null;
    private final java.util.Set<android.app.personalcontext.hint.PublishedContextHint> mOriginHints = null;
    private final java.time.Instant mPublishedTimestamp = null;
    private final java.util.UUID mPublisherComponentId = null;
    private final java.util.Set<android.app.personalcontext.Token> mTokens = null;
    ContextInsight(android.app.personalcontext.insight.ContextInsight.ConstructorParams p0) {}
    public static android.app.personalcontext.insight.ContextInsight.ConstructorParams createConstructorParams(java.util.UUID p0, java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> p1, java.util.Collection<android.app.personalcontext.Token> p2, java.time.Instant p3, android.app.personalcontext.insight.InsightBranding p4, android.app.personalcontext.insight.interaction.AttributionDetails p5, java.util.UUID p6, java.time.Instant p7) { return null; }
    public static android.app.personalcontext.insight.ContextInsight createInsightFromBundle(android.os.Bundle p0) { return null; }
    static android.app.personalcontext.insight.ContextInsight readFromParcel(android.os.Parcel p0) { return null; }
    static java.util.List<android.app.personalcontext.insight.ContextInsight> readInsightsFromParcel(android.os.Parcel p0) { return null; }
    static <T extends android.app.personalcontext.insight.ContextInsight> java.util.List<T> readInsightsFromParcel(android.os.Parcel p0, java.lang.Class<T> p1) { return null; }
    static void writeInsightsToParcel(java.util.Collection<? extends android.app.personalcontext.insight.ContextInsight> p0, android.os.Parcel p1, int p2, boolean p3) {}
    public void accept(android.app.personalcontext.insight.InsightVisitor p0, int p1) {}
    public android.app.personalcontext.insight.ContextInsight attachPublisherInfo(java.util.UUID p0) { return null; }
    public android.app.personalcontext.insight.ContextInsight copyWithoutHints() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.personalcontext.insight.interaction.AttributionDetails getAttributionDetails() { return null; }
    public final android.app.personalcontext.insight.InsightBranding getBranding() { return null; }
    public java.util.Collection<android.app.personalcontext.insight.ContextInsight> getChildren() { return null; }
    public final java.time.Instant getCreationTime() { return null; }
    public final java.util.UUID getInsightId() { return null; }
    abstract int getInsightType();
    public java.lang.String getInsightTypeName() { return null; }
    public java.util.Set<android.app.personalcontext.hint.PublishedContextHint> getOriginHints() { return null; }
    public java.time.Instant getPublishedTime() { return null; }
    public java.time.Instant getPublishedTimestampInternal() { return null; }
    public java.util.UUID getPublisherComponentId() { return null; }
    public java.util.Set<android.app.personalcontext.RenderToken> getRenderTokens() { return null; }
    public java.util.Set<android.app.personalcontext.Token> getTokens() { return null; }
    public boolean hasAttribution() { return false; }
    public int hashCode() { return 0; }
    public android.os.Bundle toBundle() { return null; }
    public android.os.Bundle toBundle(boolean p0) { return null; }
    abstract android.os.Bundle toBundleImpl(boolean p0);
    public java.lang.String toString() { return null; }
    abstract void writeImplementationDataToParcel(android.os.Parcel p0, int p1, boolean p2);
    final void writeToParcel(android.os.Parcel p0, int p1, boolean p2) {}

    public static class ConstructorParams {
        private final android.app.personalcontext.insight.interaction.AttributionDetails mAttributionDetails = null;
        private final android.app.personalcontext.insight.InsightBranding mBranding = null;
        private final java.time.Instant mCreationTime = null;
        private final java.util.UUID mId = null;
        private final java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> mOriginHints = null;
        private final java.time.Instant mPublishedTimestamp = null;
        private final java.util.UUID mPublisherComponentId = null;
        private final java.util.Collection<android.app.personalcontext.Token> mTokens = null;
        private ConstructorParams(android.os.Parcel p0) {}
        private ConstructorParams(java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> p0, java.util.Collection<android.app.personalcontext.Token> p1, android.app.personalcontext.insight.InsightBranding p2, android.app.personalcontext.insight.interaction.AttributionDetails p3) {}
        ConstructorParams(java.util.UUID p0, java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> p1, java.util.Collection<android.app.personalcontext.Token> p2, java.time.Instant p3, android.app.personalcontext.insight.InsightBranding p4, android.app.personalcontext.insight.interaction.AttributionDetails p5, java.util.UUID p6, java.time.Instant p7) {}

        static final class Builder {
            private android.app.personalcontext.insight.interaction.AttributionDetails mAttributionDetails;
            private android.app.personalcontext.insight.InsightBranding mBranding;
            private final java.util.Set<android.app.personalcontext.hint.PublishedContextHint> mOriginHints = null;
            private final java.util.Set<android.app.personalcontext.Token> mTokens = null;
            Builder() {}
            android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder addOriginHint(android.app.personalcontext.hint.PublishedContextHint p0) { return null; }
            android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder addToken(android.app.personalcontext.Token p0) { return null; }
            android.app.personalcontext.insight.ContextInsight.ConstructorParams build() { return null; }
            android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder setAttributionDetails(android.app.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
            android.app.personalcontext.insight.ContextInsight.ConstructorParams.Builder setBranding(android.app.personalcontext.insight.InsightBranding p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InsightType {
    }
}
