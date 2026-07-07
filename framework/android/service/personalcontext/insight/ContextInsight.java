package android.service.personalcontext.insight;

public abstract class ContextInsight {
    protected static final android.service.personalcontext.insight.ContextInsight ERROR_INSIGHT = null;
    static final int INSIGHT_TYPE_ACTIONABLE = 2;
    public static final int INSIGHT_TYPE_BUNDLE = 1;
    static final int INSIGHT_TYPE_COLLECTION = 4;
    static final int INSIGHT_TYPE_DISPLAY = 3;
    static final int INSIGHT_TYPE_ERROR = -1;
    static final int INSIGHT_TYPE_HINT_INVALIDATION = 5;
    static final int INSIGHT_TYPE_LIST = 6;
    static final int INSIGHT_TYPE_MAP = 7;
    static final int INSIGHT_TYPE_NO_RESULT = 8;
    private static final java.lang.String KEY_ATTRIBUTION = "key_attribution";
    private static final java.lang.String KEY_CREATION_TIME = "key_creation_time";
    private static final java.lang.String KEY_INSIGHT_DATA = "key_insight_data";
    private static final java.lang.String KEY_INSIGHT_ID = "key_insight_id";
    private static final java.lang.String KEY_INSIGHT_TYPE = "key_insight_type";
    private static final java.lang.String KEY_ORIGIN_HINTS = "key_origin_hints";
    private static final java.lang.String KEY_PUBLISHED_TIMESTAMP = "key_published_timestamp";
    private static final java.lang.String KEY_PUBLISHING_COMPONENT_ID = "key_publishing_component_id";
    private static final java.lang.String KEY_TOKENS = "key_tokens";
    private static final java.lang.String TAG = "ContextInsight";
    private final android.service.personalcontext.insight.interaction.AttributionDetails mAttributionDetails = null;
    private final java.time.Instant mCreationTime = null;
    private final java.util.UUID mId = null;
    private final java.util.Set<android.service.personalcontext.hint.PublishedContextHint> mOriginHints = null;
    private final java.time.Instant mPublishedTimestamp = null;
    private final java.util.UUID mPublisherComponentId = null;
    private final java.util.Set<android.service.personalcontext.Token> mTokens = null;
    ContextInsight(android.service.personalcontext.insight.ContextInsight.ConstructorParams p0) {}
    public static android.service.personalcontext.insight.ContextInsight createInsightFromBundle(android.os.Bundle p0) { return null; }
    public abstract void accept(android.service.personalcontext.insight.InsightVisitor p0, int p1);
    public android.service.personalcontext.insight.ContextInsight attachPublisherInfo(java.util.UUID p0) { return null; }
    public android.service.personalcontext.insight.ContextInsight copyWithoutHints() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.insight.interaction.AttributionDetails getAttributionDetails() { return null; }
    public java.util.Collection<android.service.personalcontext.insight.ContextInsight> getChildren() { return null; }
    @android.annotation.SystemApi
    public final java.time.Instant getCreationTime() { return null; }
    public final java.util.UUID getInsightId() { return null; }
    abstract int getInsightType();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String getInsightTypeName() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.util.Set<android.service.personalcontext.hint.PublishedContextHint> getOriginHints() { return null; }
    public java.time.Instant getPublishedTime() { return null; }
    public java.util.UUID getPublisherComponentId() { return null; }
    public java.util.Set<android.service.personalcontext.RenderToken> getRenderTokens() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.util.Set<android.service.personalcontext.Token> getTokens() { return null; }
    public boolean hasAttribution() { return false; }
    public int hashCode() { return 0; }
    public android.os.Bundle toBundle() { return null; }
    public android.os.Bundle toBundle(boolean p0) { return null; }
    abstract android.os.Bundle toBundleImpl(boolean p0);
    public java.lang.String toString() { return null; }

    static class ConstructorParams {
        private final android.service.personalcontext.insight.interaction.AttributionDetails mAttributionDetails = null;
        private final java.time.Instant mCreationTime = null;
        private final java.util.UUID mId = null;
        private final java.util.Collection<android.service.personalcontext.hint.PublishedContextHint> mOriginHints = null;
        private final java.time.Instant mPublishedTimestamp = null;
        private final java.util.UUID mPublisherComponentId = null;
        private final java.util.Collection<android.service.personalcontext.Token> mTokens = null;
        private ConstructorParams(java.util.Collection<android.service.personalcontext.hint.PublishedContextHint> p0, java.util.Collection<android.service.personalcontext.Token> p1, android.service.personalcontext.insight.interaction.AttributionDetails p2) {}
        private ConstructorParams(java.util.UUID p0, java.util.Collection<android.service.personalcontext.hint.PublishedContextHint> p1, java.util.Collection<android.service.personalcontext.Token> p2, java.time.Instant p3, android.service.personalcontext.insight.interaction.AttributionDetails p4, java.util.UUID p5, java.time.Instant p6) {}

        static final class Builder {
            private android.service.personalcontext.insight.interaction.AttributionDetails mAttributionDetails;
            private final java.util.Set<android.service.personalcontext.hint.PublishedContextHint> mOriginHints = null;
            private final java.util.Set<android.service.personalcontext.Token> mTokens = null;
            Builder() {}
            android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder addOriginHint(android.service.personalcontext.hint.PublishedContextHint p0) { return null; }
            android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder addToken(android.service.personalcontext.Token p0) { return null; }
            android.service.personalcontext.insight.ContextInsight.ConstructorParams build() { return null; }
            android.service.personalcontext.insight.ContextInsight.ConstructorParams.Builder setAttributionDetails(android.service.personalcontext.insight.interaction.AttributionDetails p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InsightType {
    }
}
