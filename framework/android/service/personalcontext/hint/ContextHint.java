package android.service.personalcontext.hint;

public abstract class ContextHint {
    private static final android.service.personalcontext.hint.ContextHint ERROR_HINT = null;
    static final int HINT_TYPE_AUTOFILL_INLINE_REQUEST = 7;
    public static final int HINT_TYPE_BUNDLE = 1;
    static final int HINT_TYPE_CALL = 8;
    static final int HINT_TYPE_CONVERSATION = 4;
    static final int HINT_TYPE_ERROR = -1;
    static final int HINT_TYPE_HINT_INVALIDATION = 9;
    static final int HINT_TYPE_INSIGHT_REFERENCE = 10;
    static final int HINT_TYPE_MESSAGE = 11;
    static final int HINT_TYPE_NOTIFICATION = 2;
    static final int HINT_TYPE_RECENT_VIEW = 5;
    static final int HINT_TYPE_TEXT_CLASSIFICATION = 3;
    static final int HINT_TYPE_USER_INPUT = 6;
    private static final java.lang.String KEY_ATTRIBUTION_HINTS = "key_attribution_hints";
    private static final java.lang.String KEY_CREATION_TIME = "key_creation_time";
    private static final java.lang.String KEY_HINT_DATA = "key_hint_data";
    private static final java.lang.String KEY_HINT_ID = "key_hint_id";
    private static final java.lang.String KEY_HINT_TOKENS = "key_hint_tokens";
    private static final java.lang.String KEY_HINT_TYPE = "key_hint_type";
    private static final java.lang.String KEY_HINT_TYPE_NAME = "key_hint_type_name";
    private static final java.lang.String KEY_PUBLISHED_TIMESTAMP = "key_published_timestamp";
    private static final java.lang.String KEY_PUBLISHING_PACKAGE = "key_publishing_package";
    private static final java.lang.String KEY_RENDER_TOKENS = "key_render_tokens";
    private static final java.lang.String TAG = "ContextHint";
    private final java.util.Set<android.service.personalcontext.hint.ContextHint> mAttributionHints = null;
    private final java.time.Instant mCreationTime = null;
    private final java.util.UUID mId = null;
    private final java.time.Instant mPublishedTimestamp = null;
    private final java.lang.String mPublishingPackage = null;
    private final java.util.Set<android.service.personalcontext.RenderToken> mRenderTokens = null;
    private final java.util.Set<android.service.personalcontext.Token> mTokens = null;
    ContextHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0) {}
    public static android.service.personalcontext.hint.ContextHint createHintFromBundle(android.os.Bundle p0) { return null; }
    public android.service.personalcontext.hint.ContextHint attachPublisherInfo(java.lang.String p0, java.util.Collection<android.service.personalcontext.hint.ContextHint> p1, java.util.Collection<android.service.personalcontext.RenderToken> p2) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<android.service.personalcontext.hint.ContextHint> getAttributionHints() { return null; }
    public final java.time.Instant getCreationTime() { return null; }
    @android.annotation.SystemApi
    public final java.util.UUID getHintId() { return null; }
    abstract int getHintType();
    @android.annotation.SystemApi
    public java.lang.String getHintTypeName() { return null; }
    public java.time.Instant getPublishedTime() { return null; }
    public java.lang.String getPublishingPackage() { return null; }
    public java.util.Set<android.service.personalcontext.RenderToken> getRenderTokens() { return null; }
    public java.lang.String getSourcePackageName() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public final java.util.Set<android.service.personalcontext.Token> getTokens() { return null; }
    public int hashCode() { return 0; }
    public android.os.Bundle toBundle() { return null; }
    abstract android.os.Bundle toBundleImpl();
    public java.lang.String toString() { return null; }
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    static class ConstructorParams {
        private final java.util.Set<android.service.personalcontext.hint.ContextHint> mAttributionHints = null;
        private final java.time.Instant mCreationTime = null;
        private final java.util.UUID mId = null;
        private final java.time.Instant mPublishedTimestamp = null;
        private final java.lang.String mPublishingPackage = null;
        private final java.util.Set<android.service.personalcontext.RenderToken> mRenderTokens = null;
        private final java.util.Collection<android.service.personalcontext.Token> mTokens = null;
        private ConstructorParams(java.util.Collection<android.service.personalcontext.Token> p0) {}
        private ConstructorParams(java.util.UUID p0, java.util.Collection<android.service.personalcontext.Token> p1, java.time.Instant p2, java.lang.String p3, java.time.Instant p4, java.util.Set<android.service.personalcontext.hint.ContextHint> p5, java.util.Set<android.service.personalcontext.RenderToken> p6) {}

        static final class Builder {
            private final java.util.Set<android.service.personalcontext.Token> mTokens = null;
            Builder() {}
            android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder addToken(android.service.personalcontext.Token p0) { return null; }
            android.service.personalcontext.hint.ContextHint.ConstructorParams build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HintType {
    }
}
