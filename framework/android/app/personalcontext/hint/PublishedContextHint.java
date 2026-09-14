package android.app.personalcontext.hint;

public final class PublishedContextHint {
    public static final java.lang.String HMAC_ALGORITHM = "HmacSHA256";
    private final java.util.List<android.app.personalcontext.hint.PublishedContextHint> mAttributionHints = null;
    private final android.app.personalcontext.hint.ContextHintWrapper mContextHintWrapper = null;
    private final byte[] mHash = null;
    private final android.app.personalcontext.hint.ContextHint mHint = null;
    private final java.lang.String mOriginatingPackageName = null;
    private final java.util.Set<android.app.personalcontext.RenderToken> mRenderTokens = null;
    public PublishedContextHint(android.app.personalcontext.hint.ContextHint p0) {}
    public PublishedContextHint(android.os.Parcel p0) {}
    public PublishedContextHint(byte[] p0, android.app.personalcontext.hint.ContextHintWrapper p1, java.util.List<android.app.personalcontext.hint.PublishedContextHint> p2, java.lang.String p3, java.util.Set<android.app.personalcontext.RenderToken> p4) {}
    private static java.util.List<android.app.personalcontext.RenderToken> orderRenderTokens(java.util.Collection<android.app.personalcontext.RenderToken> p0) { return null; }
    private static byte[] signData(android.app.personalcontext.hint.ContextHintWrapper p0, java.util.List<android.app.personalcontext.hint.PublishedContextHint> p1, java.lang.String p2, java.util.Set<android.app.personalcontext.RenderToken> p3, javax.crypto.spec.SecretKeySpec p4) throws java.security.GeneralSecurityException { return null; }
    public static <T extends java.util.Collection<android.app.personalcontext.hint.ContextHint>> T unwrapInto(java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> p0, T p1) { return null; }
    public static java.util.List<android.app.personalcontext.hint.ContextHint> unwrapList(java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<android.app.personalcontext.hint.PublishedContextHint> getAttributionHints() { return null; }
    public android.app.personalcontext.hint.ContextHint getContextHint() { return null; }
    public java.lang.String getOriginatingPackage() { return null; }
    public java.lang.String getRawOriginatingPackage() { return null; }
    public java.util.Set<android.app.personalcontext.RenderToken> getRenderTokens() { return null; }
    public byte[] getSignature() { return null; }
    public int hashCode() { return 0; }
    public boolean isSignatureValid(javax.crypto.spec.SecretKeySpec p0) throws java.security.GeneralSecurityException { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.List<android.app.personalcontext.hint.PublishedContextHint> mAttributionHints = null;
        private final android.app.personalcontext.hint.ContextHintWrapper mContextHintWrapper = null;
        private final android.app.personalcontext.hint.ContextHint mHint = null;
        private java.lang.String mOriginatingPackageName;
        private final java.util.Set<android.app.personalcontext.RenderToken> mRenderTokens = null;
        private final javax.crypto.spec.SecretKeySpec mSecretKey = null;
        public Builder(android.app.personalcontext.hint.ContextHint p0, javax.crypto.spec.SecretKeySpec p1) {}
        public Builder(android.app.personalcontext.hint.ContextHintWrapper p0, javax.crypto.spec.SecretKeySpec p1) {}
        public android.app.personalcontext.hint.PublishedContextHint.Builder addAttributionHint(android.app.personalcontext.hint.PublishedContextHint p0) { return null; }
        public android.app.personalcontext.hint.PublishedContextHint.Builder addAttributionHints(java.util.Collection<android.app.personalcontext.hint.PublishedContextHint> p0) { return null; }
        public android.app.personalcontext.hint.PublishedContextHint.Builder addRenderTokens(java.util.Collection<android.app.personalcontext.RenderToken> p0) { return null; }
        public android.app.personalcontext.hint.PublishedContextHint build() throws java.security.GeneralSecurityException { return null; }
        public android.app.personalcontext.hint.PublishedContextHint.Builder setOriginatingPackage(java.lang.String p0) { return null; }
    }
}
