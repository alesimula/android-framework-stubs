package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class ConversationData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.ConversationData> CREATOR = null;
    private final android.app.assist.ActivityId mActivityId = null;
    private final java.util.List<android.service.personalcontext.hint.ChatMessageData> mChatMessages = null;
    private final android.content.ComponentName mComponentName = null;
    private final java.lang.String mConversationTitle = null;
    private final boolean mHasNewMessage = false;
    private final android.view.autofill.AutofillId mInputBoxAutofillId = null;
    private final java.lang.String mInputBoxText = null;
    private final boolean mIsKeyboardShown = false;
    private final boolean mIsLastMessageFromTheUser = false;
    private final java.time.Instant mProcessingEndTimestamp = null;
    private final java.time.Instant mProcessingStartTimestamp = null;
    private ConversationData(android.app.assist.ActivityId p0, java.time.Instant p1, java.time.Instant p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, java.lang.String p5, java.lang.String p6, boolean p7, boolean p8, boolean p9, java.util.List<android.service.personalcontext.hint.ChatMessageData> p10) {}
    private ConversationData(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public android.app.assist.ActivityId getActivityId() { return null; }
    public java.util.List<android.service.personalcontext.hint.ChatMessageData> getChatMessages() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String getConversationTitle() { return null; }
    public android.view.autofill.AutofillId getInputBoxAutofillId() { return null; }
    public java.lang.String getInputBoxText() { return null; }
    public java.time.Instant getProcessingEndTimestamp() { return null; }
    public java.time.Instant getProcessingStartTimestamp() { return null; }
    public boolean hasNewMessage() { return false; }
    public int hashCode() { return 0; }
    public boolean isKeyboardShown() { return false; }
    public boolean isLastMessageFromTheUser() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private android.app.assist.ActivityId mActivityId;
        private java.util.List<android.service.personalcontext.hint.ChatMessageData> mChatMessages;
        private android.content.ComponentName mComponentName;
        private java.lang.String mConversationTitle;
        private java.lang.Boolean mHasNewMessage;
        private android.view.autofill.AutofillId mInputBoxAutofillId;
        private java.lang.String mInputBoxText;
        private java.lang.Boolean mIsKeyboardShown;
        private java.lang.Boolean mIsLastMessageFromTheUser;
        private java.time.Instant mProcessingEndTimestamp;
        private java.time.Instant mProcessingStartTimestamp;
        public Builder() {}
        public android.service.personalcontext.hint.ConversationData build() { return null; }
        @android.annotation.SystemApi
        public android.service.personalcontext.hint.ConversationData.Builder setActivityId(android.app.assist.ActivityId p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setChatMessages(java.util.List<android.service.personalcontext.hint.ChatMessageData> p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setComponentName(android.content.ComponentName p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setConversationTitle(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setHasNewMessage(boolean p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setInputBoxAutofillId(android.view.autofill.AutofillId p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setInputBoxText(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setKeyboardShown(boolean p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setLastMessageFromTheUser(boolean p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setProcessingEndTimestamp(java.time.Instant p0) { return null; }
        public android.service.personalcontext.hint.ConversationData.Builder setProcessingStartTimestamp(java.time.Instant p0) { return null; }
    }
}
