package android.content;

public final class ContextParams {
    public static final android.content.ContextParams EMPTY = null;
    private final java.lang.String mAttributionTag = null;
    private final android.content.AttributionSource mNext = null;
    private final java.util.Set<java.lang.String> mRenouncedPermissions = null;
    private final boolean mShouldRegisterAttributionSource = false;
    private ContextParams(java.lang.String p0, android.content.AttributionSource p1, java.util.Set<java.lang.String> p2, boolean p3) {}
    public java.lang.String getAttributionTag() { return null; }
    public android.content.AttributionSource getNextAttributionSource() { return null; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getRenouncedPermissions() { return null; }
    public boolean isRenouncedPermission(java.lang.String p0) { return false; }
    public boolean shouldRegisterAttributionSource() { return false; }

    public static final class Builder {
        private java.lang.String mAttributionTag;
        private android.content.AttributionSource mNext;
        private java.util.Set<java.lang.String> mRenouncedPermissions;
        private boolean mShouldRegisterAttributionSource;
        public Builder() {}
        public Builder(android.content.ContextParams p0) {}
        public android.content.ContextParams build() { return null; }
        public android.content.ContextParams.Builder setAttributionTag(java.lang.String p0) { return null; }
        public android.content.ContextParams.Builder setNextAttributionSource(android.content.AttributionSource p0) { return null; }
        @android.annotation.SystemApi
        public android.content.ContextParams.Builder setRenouncedPermissions(java.util.Set<java.lang.String> p0) { return null; }
        public android.content.ContextParams.Builder setShouldRegisterAttributionSource(boolean p0) { return null; }
    }
}
