package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class ChatMessageContentCaptureData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.ChatMessageContentCaptureData> CREATOR = null;
    private final android.view.autofill.AutofillId mAutofillId = null;
    private final java.lang.String mRawDateString = null;
    private final java.lang.String mRawTimeString = null;
    private ChatMessageContentCaptureData(android.os.Parcel p0) {}
    private ChatMessageContentCaptureData(java.lang.String p0, java.lang.String p1, android.view.autofill.AutofillId p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    public java.lang.String getRawDateString() { return null; }
    public java.lang.String getRawTimeString() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.view.autofill.AutofillId mAutofillId;
        private java.lang.String mRawDateString;
        private java.lang.String mRawTimeString;
        public Builder() {}
        public android.service.personalcontext.hint.ChatMessageContentCaptureData build() { return null; }
        public android.service.personalcontext.hint.ChatMessageContentCaptureData.Builder setAutofillId(android.view.autofill.AutofillId p0) { return null; }
        public android.service.personalcontext.hint.ChatMessageContentCaptureData.Builder setRawDateString(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.ChatMessageContentCaptureData.Builder setRawTimeString(java.lang.String p0) { return null; }
    }
}
