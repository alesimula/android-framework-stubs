package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class MessagesHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_CHAT_MESSAGES = "key_chat_messages";
    private static final java.lang.String KEY_PACKAGE_NAME = "key_package_name";
    private final java.util.List<android.service.personalcontext.hint.ChatMessageData> mChatMessages = null;
    private final java.lang.String mPackageName = null;
    MessagesHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private MessagesHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, java.lang.String p1, java.util.List<android.service.personalcontext.hint.ChatMessageData> p2) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.personalcontext.hint.ChatMessageData> getChatMessages() { return null; }
    int getHintType() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private java.util.List<android.service.personalcontext.hint.ChatMessageData> mChatMessages;
        private java.lang.String mPackageName;
        public Builder(java.lang.String p0) {}
        public android.service.personalcontext.hint.MessagesHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.MessagesHint build() { return null; }
        public android.service.personalcontext.hint.MessagesHint.Builder setChatMessages(java.util.List<android.service.personalcontext.hint.ChatMessageData> p0) { return null; }
    }
}
