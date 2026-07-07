package android.view.translation;

public final class ViewTranslationResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.ViewTranslationResponse> CREATOR = null;
    private final android.view.autofill.AutofillId mAutofillId = null;
    private final java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> mTranslationResponseValues = null;
    ViewTranslationResponse(android.os.Parcel p0) {}
    ViewTranslationResponse(android.view.autofill.AutofillId p0, java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> p1) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> defaultTranslationResponseValues() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    public java.util.Set<java.lang.String> getKeys() { return null; }
    public android.view.translation.TranslationResponseValue getValue(java.lang.String p0) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.view.translation.ViewTranslationResponse.Builder setTranslationResponseValues(java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> p0);
        public android.view.translation.ViewTranslationResponse.Builder setValue(java.lang.String p0, android.view.translation.TranslationResponseValue p1) { return null; }
    }

    public static final class Builder extends android.view.translation.ViewTranslationResponse.BaseBuilder {
        private android.view.autofill.AutofillId mAutofillId;
        private long mBuilderFieldsSet;
        private java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> mTranslationResponseValues;
        public Builder(android.view.autofill.AutofillId p0) { super(); }
        private void checkNotUsed() {}
        public android.view.translation.ViewTranslationResponse build() { return null; }
        android.view.translation.ViewTranslationResponse.Builder setTranslationResponseValues(java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> p0) { return null; }
    }
}
