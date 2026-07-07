package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class ContentCaptureConversationHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_CONVERSATION_EVENT = "key_conversation_event";
    private final android.service.personalcontext.hint.ContentCaptureConversationEvent mConversationEvent = null;
    ContentCaptureConversationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private ContentCaptureConversationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.service.personalcontext.hint.ContentCaptureConversationEvent p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.personalcontext.hint.ContentCaptureConversationEvent getConversationEvent() { return null; }
    int getHintType() { return 0; }
    public java.lang.String getSourcePackageName() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final android.service.personalcontext.hint.ContentCaptureConversationEvent mConversationEvent = null;
        public Builder(android.service.personalcontext.hint.ContentCaptureConversationEvent p0) {}
        public android.service.personalcontext.hint.ContentCaptureConversationHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.ContentCaptureConversationHint build() { return null; }
    }
}
