package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class PublishedContextHint {
    public static final java.lang.String HMAC_ALGORITHM = "HmacSHA256";
    private final android.service.personalcontext.hint.ContextHint mHint = null;
    public PublishedContextHint(android.service.personalcontext.hint.ContextHint p0) {}
    public static <T extends java.util.Collection<android.service.personalcontext.hint.ContextHint>> T unwrapInto(java.util.Collection<android.service.personalcontext.hint.PublishedContextHint> p0, T p1) { return null; }
    public static java.util.List<android.service.personalcontext.hint.ContextHint> unwrapList(java.util.Collection<android.service.personalcontext.hint.PublishedContextHint> p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<android.service.personalcontext.hint.PublishedContextHint> getAttributionHints() { return null; }
    public android.service.personalcontext.hint.ContextHint getContextHint() { return null; }
    public java.lang.String getOriginatingPackage() { return null; }
    public java.util.Set<android.service.personalcontext.RenderToken> getRenderTokens() { return null; }
    public int hashCode() { return 0; }
    public boolean isSignatureValid(javax.crypto.spec.SecretKeySpec p0) throws java.security.GeneralSecurityException { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final java.util.List<android.service.personalcontext.hint.PublishedContextHint> mAttributionHints = null;
        private final android.service.personalcontext.hint.ContextHint mHint = null;
        private java.lang.String mOriginatingPackageName;
        private final java.util.Set<android.service.personalcontext.RenderToken> mRenderTokens = null;
        public Builder(android.service.personalcontext.hint.ContextHint p0, javax.crypto.spec.SecretKeySpec p1) {}
        public Builder(android.service.personalcontext.hint.ContextHintWrapper p0, javax.crypto.spec.SecretKeySpec p1) {}
        public android.service.personalcontext.hint.PublishedContextHint.Builder addAttributionHint(android.service.personalcontext.hint.PublishedContextHint p0) { return null; }
        public android.service.personalcontext.hint.PublishedContextHint.Builder addAttributionHints(java.util.Collection<android.service.personalcontext.hint.PublishedContextHint> p0) { return null; }
        public android.service.personalcontext.hint.PublishedContextHint.Builder addRenderTokens(java.util.Collection<android.service.personalcontext.RenderToken> p0) { return null; }
        public android.service.personalcontext.hint.PublishedContextHint build() throws java.security.GeneralSecurityException { return null; }
        public android.service.personalcontext.hint.PublishedContextHint.Builder setOriginatingPackage(java.lang.String p0) { return null; }
    }
}
