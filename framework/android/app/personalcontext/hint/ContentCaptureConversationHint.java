package android.app.personalcontext.hint;

public final class ContentCaptureConversationHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_CONVERSATION_EVENT = "key_conversation_event";
    private final android.app.personalcontext.hint.ContentCaptureConversationEvent mConversationEvent = null;
    ContentCaptureConversationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.app.personalcontext.hint.ContentCaptureConversationEvent p1) { super(null); }
    ContentCaptureConversationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    ContentCaptureConversationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.personalcontext.hint.ContentCaptureConversationEvent getConversationEvent() { return null; }
    int getHintType() { return 0; }
    public java.lang.String getSourcePackageName() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final android.app.personalcontext.hint.ContentCaptureConversationEvent mConversationEvent = null;
        public Builder(android.app.personalcontext.hint.ContentCaptureConversationEvent p0) {}
        public android.app.personalcontext.hint.ContentCaptureConversationHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.ContentCaptureConversationHint build() { return null; }
    }
}
