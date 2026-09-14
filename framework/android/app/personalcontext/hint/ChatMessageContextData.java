package android.app.personalcontext.hint;

public final class ChatMessageContextData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.personalcontext.hint.ChatMessageContextData> CREATOR = null;
    private final android.view.autofill.AutofillId mAutofillId = null;
    private final java.lang.String mRawDateString = null;
    private final java.lang.String mRawTimeString = null;
    private ChatMessageContextData(android.os.Parcel p0) {}
    ChatMessageContextData(java.lang.String p0, java.lang.String p1, android.view.autofill.AutofillId p2) {}
    public static android.app.personalcontext.hint.ChatMessageContextData fromChatMessageContentCaptureData(android.app.personalcontext.hint.ChatMessageContentCaptureData p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    public java.lang.String getRawDateString() { return null; }
    public java.lang.String getRawTimeString() { return null; }
    public int hashCode() { return 0; }
    public android.app.personalcontext.hint.ChatMessageContentCaptureData toChatMessageContentCaptureData() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.view.autofill.AutofillId mAutofillId;
        private java.lang.String mRawDateString;
        private java.lang.String mRawTimeString;
        public Builder() {}
        public android.app.personalcontext.hint.ChatMessageContextData build() { return null; }
        public android.app.personalcontext.hint.ChatMessageContextData.Builder setAutofillId(android.view.autofill.AutofillId p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageContextData.Builder setRawDateString(java.lang.String p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageContextData.Builder setRawTimeString(java.lang.String p0) { return null; }
    }
}
