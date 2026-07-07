package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class RecentViewHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_CAPTURED_TEXTS = "key_captured_texts";
    private static final java.lang.String KEY_LOCUS_ID = "key_locus_id";
    private static final java.lang.String KEY_SOURCE_APP_ACTIVITY_COMPONENT_NAME = "key_source_app_activity_component_name";
    private final java.util.List<android.service.personalcontext.hint.CapturedText> mCapturedTexts = null;
    private final java.lang.String mLocusId = null;
    private final android.content.ComponentName mSourceAppActivityComponentName = null;
    RecentViewHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private RecentViewHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, java.util.List<android.service.personalcontext.hint.CapturedText> p1, android.content.ComponentName p2, java.lang.String p3) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.personalcontext.hint.CapturedText> getCapturedTexts() { return null; }
    int getHintType() { return 0; }
    public java.lang.String getLocusId() { return null; }
    public android.content.ComponentName getSourceAppActivityComponentName() { return null; }
    public java.lang.String getSourcePackageName() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.List<android.service.personalcontext.hint.CapturedText> mCapturedTexts = null;
        private java.lang.String mLocusId;
        private android.content.ComponentName mSourceAppActivityComponentName;
        public Builder() {}
        public android.service.personalcontext.hint.RecentViewHint.Builder addCapturedText(android.service.personalcontext.hint.CapturedText p0) { return null; }
        public android.service.personalcontext.hint.RecentViewHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.RecentViewHint build() { return null; }
        public android.service.personalcontext.hint.RecentViewHint.Builder setLocusId(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.RecentViewHint.Builder setSourceAppActivityComponentName(android.content.ComponentName p0) { return null; }
    }
}
