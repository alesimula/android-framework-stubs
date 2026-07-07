package android.view.translation;

@android.annotation.SystemApi
public final class UiTranslationSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.UiTranslationSpec> CREATOR = null;
    private boolean mShouldPadContentForCompat;
    UiTranslationSpec(android.os.Parcel p0) {}
    UiTranslationSpec(boolean p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean shouldPadContentForCompat() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private boolean mShouldPadContentForCompat;
        public Builder() {}
        private void checkNotUsed() {}
        public android.view.translation.UiTranslationSpec build() { return null; }
        public android.view.translation.UiTranslationSpec.Builder setShouldPadContentForCompat(boolean p0) { return null; }
    }
}
