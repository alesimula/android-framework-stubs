package android.view.inputmethod;

public final class InlineSuggestionsRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InlineSuggestionsRequest> CREATOR = null;
    private static final long IME_AUTOFILL_DEFAULT_SUPPORTED_LOCALES_IS_EMPTY = 169273070L;
    public static final int SUGGESTION_COUNT_UNLIMITED = 2147483647;
    private android.os.Bundle mExtras;
    private int mHostDisplayId;
    private android.os.IBinder mHostInputToken;
    private java.lang.String mHostPackageName;
    private final java.util.List<android.widget.inline.InlinePresentationSpec> mInlinePresentationSpecs = null;
    private android.widget.inline.InlinePresentationSpec mInlineTooltipPresentationSpec;
    private final int mMaxSuggestionCount = 0;
    private android.os.LocaleList mSupportedLocales;
    InlineSuggestionsRequest(int p0, java.util.List<android.widget.inline.InlinePresentationSpec> p1, java.lang.String p2, android.os.LocaleList p3, android.os.Bundle p4, android.os.IBinder p5, int p6, android.widget.inline.InlinePresentationSpec p7) {}
    InlineSuggestionsRequest(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static android.os.Bundle defaultExtras() { return null; }
    private static int defaultHostDisplayId() { return 0; }
    private static android.os.IBinder defaultHostInputToken() { return null; }
    private static java.lang.String defaultHostPackageName() { return null; }
    private static android.widget.inline.InlinePresentationSpec defaultInlineTooltipPresentationSpec() { return null; }
    private static int defaultMaxSuggestionCount() { return 0; }
    private static android.os.LocaleList defaultSupportedLocales() { return null; }
    private boolean extrasEquals(android.os.Bundle p0) { return false; }
    private int extrasHashCode() { return 0; }
    private void onConstructed() {}
    private void parcelHostInputToken(android.os.Parcel p0, int p1) {}
    private android.os.IBinder unparcelHostInputToken(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void filterContentTypes() {}
    public android.os.Bundle getExtras() { return null; }
    public int getHostDisplayId() { return 0; }
    public android.os.IBinder getHostInputToken() { return null; }
    public java.lang.String getHostPackageName() { return null; }
    public java.util.List<android.widget.inline.InlinePresentationSpec> getInlinePresentationSpecs() { return null; }
    public android.widget.inline.InlinePresentationSpec getInlineTooltipPresentationSpec() { return null; }
    public int getMaxSuggestionCount() { return 0; }
    public android.os.LocaleList getSupportedLocales() { return null; }
    public int hashCode() { return 0; }
    public void setHostDisplayId(int p0) {}
    public void setHostInputToken(android.os.IBinder p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setHostDisplayId(int p0);
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setHostInputToken(android.os.IBinder p0);
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setHostPackageName(java.lang.String p0);
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setInlinePresentationSpecs(java.util.List<android.widget.inline.InlinePresentationSpec> p0);
    }

    public static final class Builder extends android.view.inputmethod.InlineSuggestionsRequest.BaseBuilder {
        private long mBuilderFieldsSet;
        private android.os.Bundle mExtras;
        private int mHostDisplayId;
        private android.os.IBinder mHostInputToken;
        private java.lang.String mHostPackageName;
        private java.util.List<android.widget.inline.InlinePresentationSpec> mInlinePresentationSpecs;
        private android.widget.inline.InlinePresentationSpec mInlineTooltipPresentationSpec;
        private int mMaxSuggestionCount;
        private android.os.LocaleList mSupportedLocales;
        public Builder(java.util.List<android.widget.inline.InlinePresentationSpec> p0) { super(); }
        private void checkNotUsed() {}
        public android.view.inputmethod.InlineSuggestionsRequest.Builder addInlinePresentationSpecs(android.widget.inline.InlinePresentationSpec p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest build() { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        android.view.inputmethod.InlineSuggestionsRequest.Builder setHostDisplayId(int p0) { return null; }
        android.view.inputmethod.InlineSuggestionsRequest.Builder setHostInputToken(android.os.IBinder p0) { return null; }
        android.view.inputmethod.InlineSuggestionsRequest.Builder setHostPackageName(java.lang.String p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setInlinePresentationSpecs(java.util.List<android.widget.inline.InlinePresentationSpec> p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setInlineTooltipPresentationSpec(android.widget.inline.InlinePresentationSpec p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setMaxSuggestionCount(int p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setSupportedLocales(android.os.LocaleList p0) { return null; }
    }
}
