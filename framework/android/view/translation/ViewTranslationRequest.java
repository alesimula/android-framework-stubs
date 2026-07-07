package android.view.translation;

public final class ViewTranslationRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.ViewTranslationRequest> CREATOR = null;
    public static final java.lang.String ID_CONTENT_DESCRIPTION = "android:content_description";
    public static final java.lang.String ID_TEXT = "android:text";
    private final android.view.autofill.AutofillId mAutofillId = null;
    private final java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> mTranslationRequestValues = null;
    ViewTranslationRequest(android.os.Parcel p0) {}
    public ViewTranslationRequest(android.view.autofill.AutofillId p0, java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> p1) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> defaultTranslationRequestValues() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    public java.util.Set<java.lang.String> getKeys() { return null; }
    public android.view.translation.TranslationRequestValue getValue(java.lang.String p0) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.view.autofill.AutofillId mAutofillId;
        private long mBuilderFieldsSet;
        private java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> mTranslationRequestValues;
        public Builder(android.view.autofill.AutofillId p0) {}
        public Builder(android.view.autofill.AutofillId p0, long p1) {}
        private void checkNotUsed() {}
        public android.view.translation.ViewTranslationRequest build() { return null; }
        android.view.translation.ViewTranslationRequest.Builder setTranslationRequestValues(java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> p0) { return null; }
        public android.view.translation.ViewTranslationRequest.Builder setValue(java.lang.String p0, android.view.translation.TranslationRequestValue p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Id {
    }
}
