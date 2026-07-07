package android.view.translation;

public final class TranslationContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationContext> CREATOR = null;
    public static final int FLAG_DEFINITIONS = 4;
    public static final int FLAG_LOW_LATENCY = 1;
    public static final int FLAG_TRANSLITERATION = 2;
    private final android.app.assist.ActivityId mActivityId = null;
    private final android.view.translation.TranslationSpec mSourceSpec = null;
    private final android.view.translation.TranslationSpec mTargetSpec = null;
    private final int mTranslationFlags = 0;
    TranslationContext(android.os.Parcel p0) {}
    TranslationContext(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1, int p2, android.app.assist.ActivityId p3) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static android.app.assist.ActivityId defaultActivityId() { return null; }
    private static int defaultTranslationFlags() { return 0; }
    private void parcelActivityId(android.os.Parcel p0, int p1) {}
    static java.lang.String singleTranslationFlagToString(int p0) { return null; }
    public static java.lang.String translationFlagToString(int p0) { return null; }
    private android.app.assist.ActivityId unparcelActivityId(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public android.app.assist.ActivityId getActivityId() { return null; }
    public android.view.translation.TranslationSpec getSourceSpec() { return null; }
    public android.view.translation.TranslationSpec getTargetSpec() { return null; }
    public int getTranslationFlags() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.view.translation.TranslationContext.BaseBuilder {
        private android.app.assist.ActivityId mActivityId;
        private long mBuilderFieldsSet;
        private android.view.translation.TranslationSpec mSourceSpec;
        private android.view.translation.TranslationSpec mTargetSpec;
        private int mTranslationFlags;
        public Builder(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1) { super(); }
        private void checkNotUsed() {}
        public android.view.translation.TranslationContext build() { return null; }
        public android.view.translation.TranslationContext.Builder setActivityId(android.app.assist.ActivityId p0) { return null; }
        public android.view.translation.TranslationContext.Builder setTranslationFlags(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TranslationFlag {
    }
}
