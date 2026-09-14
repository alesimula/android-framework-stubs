package android.app.personalcontext.hint;

public final class ChatMessageData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.personalcontext.hint.ChatMessageData> CREATOR = null;
    private final java.lang.String mAuthor = null;
    private final android.app.personalcontext.hint.ChatMessageContentCaptureData mContentCaptureData = null;
    private final android.app.personalcontext.hint.ChatMessageContextData mContextData = null;
    private final boolean mIsOutgoingMessage = false;
    private final java.time.Instant mReferenceTime = null;
    private final java.lang.String mText = null;
    private ChatMessageData(android.os.Parcel p0) {}
    public ChatMessageData(java.lang.String p0, java.lang.String p1, java.time.Instant p2, boolean p3, android.app.personalcontext.hint.ChatMessageContentCaptureData p4) {}
    public ChatMessageData(java.lang.String p0, java.lang.String p1, java.time.Instant p2, boolean p3, android.app.personalcontext.hint.ChatMessageContentCaptureData p4, android.app.personalcontext.hint.ChatMessageContextData p5) {}
    public ChatMessageData(java.lang.String p0, java.lang.String p1, java.time.Instant p2, boolean p3, android.app.personalcontext.hint.ChatMessageContextData p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAuthor() { return null; }
    public android.app.personalcontext.hint.ChatMessageContentCaptureData getContentCaptureData() { return null; }
    public android.app.personalcontext.hint.ChatMessageContextData getContextData() { return null; }
    public java.time.Instant getReferenceTime() { return null; }
    public long getReferenceTimeMillis() { return 0L; }
    public java.lang.String getText() { return null; }
    public int hashCode() { return 0; }
    public boolean isOutgoingMessage() { return false; }
    public android.app.personalcontext.hint.ChatMessageData toContentCaptureMessageData() { return null; }
    public android.app.personalcontext.hint.ChatMessageData toContextMessageData() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mAuthor;
        private android.app.personalcontext.hint.ChatMessageContentCaptureData mContentCaptureData;
        private java.lang.String mContentDescription;
        private android.app.personalcontext.hint.ChatMessageContextData mContextData;
        private java.lang.Boolean mIsOutgoingMessage;
        private java.time.Instant mReferenceTime;
        private java.lang.String mText;
        public Builder() {}
        public android.app.personalcontext.hint.ChatMessageData build() { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setAuthor(java.lang.String p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setContentCaptureData(android.app.personalcontext.hint.ChatMessageContentCaptureData p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setContextData(android.app.personalcontext.hint.ChatMessageContextData p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setOutgoingMessage(boolean p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setReferenceTime(java.time.Instant p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setReferenceTimeMillis(long p0) { return null; }
        public android.app.personalcontext.hint.ChatMessageData.Builder setText(java.lang.String p0) { return null; }
    }
}
