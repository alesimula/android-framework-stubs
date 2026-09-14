package android.app.personalcontext.hint;

public final class ConversationHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_CONVERSATION_EVENT = "key_conversation_event";
    private final android.app.personalcontext.hint.ConversationEvent mConversationEvent = null;
    ConversationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.app.personalcontext.hint.ConversationEvent p1) { super(null); }
    ConversationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    ConversationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public ConversationHint(android.app.personalcontext.hint.ConversationEvent p0) { super(null); }
    public static android.app.personalcontext.hint.ConversationHint fromContentCaptureConversationHint(android.app.personalcontext.hint.ContentCaptureConversationHint p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.personalcontext.hint.ConversationEvent getConversationEvent() { return null; }
    int getHintType() { return 0; }
    public java.lang.String getSourcePackageName() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public android.app.personalcontext.hint.ContentCaptureConversationHint toContentCaptureConversationHint() { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final android.app.personalcontext.hint.ConversationEvent mConversationEvent = null;
        public Builder(android.app.personalcontext.hint.ConversationEvent p0) {}
        public android.app.personalcontext.hint.ConversationHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.ConversationHint build() { return null; }
    }
}
