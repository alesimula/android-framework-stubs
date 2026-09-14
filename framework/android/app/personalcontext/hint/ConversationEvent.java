package android.app.personalcontext.hint;

public abstract class ConversationEvent {
    static final int EVENT_TYPE_ENTER = 1;
    static final int EVENT_TYPE_EXIT = 2;
    static final int EVENT_TYPE_PROCESSING = 3;
    static final int EVENT_TYPE_UNKNOWN = 0;
    static final int EVENT_TYPE_UPDATE = 4;
    private static final java.lang.String KEY_CLIENT_EVENT_TIMESTAMP = "key_client_event_timestamp";
    private static final java.lang.String KEY_CONVERSATION_SESSION_ID = "key_conversation_session_id";
    private static final java.lang.String KEY_EVENT_DATA = "key_event_data";
    private static final java.lang.String KEY_EVENT_TYPE = "key_event_type";
    private static final java.lang.String KEY_TIMESTAMP = "key_timestamp";
    private static final java.lang.String TAG = "ConversationEvent";
    private final long mClientEventTimestampMillis = 0L;
    private final java.lang.String mConversationSessionId = null;
    private final long mTimestampMillis = 0L;
    ConversationEvent(java.lang.String p0, long p1, long p2) {}
    public static android.app.personalcontext.hint.ConversationEvent fromBundle(android.os.Bundle p0) { return null; }
    public static android.app.personalcontext.hint.ConversationEvent fromContentCaptureConversationEvent(android.app.personalcontext.hint.ContentCaptureConversationEvent p0) { return null; }
    static android.app.personalcontext.hint.ConversationEvent readFromParcel(android.os.Parcel p0) { return null; }
    private android.os.Bundle toBundleBase() { return null; }
    public java.time.Instant getClientEventTimestamp() { return null; }
    public long getClientEventTimestampMillis() { return 0L; }
    public java.lang.String getConversationSessionId() { return null; }
    abstract int getEventType();
    public java.time.Instant getTimestamp() { return null; }
    public long getTimestampMillis() { return 0L; }
    public android.os.Bundle toBundle() { return null; }
    abstract android.os.Bundle toBundleImpl();
    public android.app.personalcontext.hint.ContentCaptureConversationEvent toContentCaptureConversationEvent() { return null; }
    final void writeToParcel(android.os.Parcel p0, int p1) {}
    void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    final void writeToSignatureParcel(android.os.Parcel p0) {}
    void writeToSignatureParcelImpl(android.os.Parcel p0) {}

    public static final class ConversationEnterEvent extends android.app.personalcontext.hint.ConversationEvent {
        public ConversationEnterEvent(java.lang.String p0, long p1, long p2) { super(null, 0L, 0L); }
        public ConversationEnterEvent(java.lang.String p0, java.time.Instant p1, java.time.Instant p2) { super(null, 0L, 0L); }
        public boolean equals(java.lang.Object p0) { return false; }
        int getEventType() { return 0; }
        public java.time.Instant getTimestamp() { return null; }
        public long getTimestampMillis() { return 0L; }
        public int hashCode() { return 0; }
        android.os.Bundle toBundleImpl() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class ConversationExitEvent extends android.app.personalcontext.hint.ConversationEvent {
        public ConversationExitEvent(java.lang.String p0, long p1, long p2) { super(null, 0L, 0L); }
        public ConversationExitEvent(java.lang.String p0, java.time.Instant p1, java.time.Instant p2) { super(null, 0L, 0L); }
        public boolean equals(java.lang.Object p0) { return false; }
        int getEventType() { return 0; }
        public java.time.Instant getTimestamp() { return null; }
        public long getTimestampMillis() { return 0L; }
        public int hashCode() { return 0; }
        android.os.Bundle toBundleImpl() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class ConversationProcessingEvent extends android.app.personalcontext.hint.ConversationEvent {
        private static final java.lang.String KEY_MESSAGE_AUTOFILL_ID = "key_message_autofill_id";
        private final android.view.autofill.AutofillId mMessageAutofillId = null;
        ConversationProcessingEvent(java.lang.String p0, long p1, long p2, android.os.Bundle p3) { super(null, 0L, 0L); }
        ConversationProcessingEvent(java.lang.String p0, long p1, long p2, android.os.Parcel p3) { super(null, 0L, 0L); }
        public ConversationProcessingEvent(java.lang.String p0, long p1, long p2, android.view.autofill.AutofillId p3) { super(null, 0L, 0L); }
        public ConversationProcessingEvent(java.lang.String p0, java.time.Instant p1, java.time.Instant p2, android.view.autofill.AutofillId p3) { super(null, 0L, 0L); }
        public boolean equals(java.lang.Object p0) { return false; }
        int getEventType() { return 0; }
        public android.view.autofill.AutofillId getMessageAutofillId() { return null; }
        public java.time.Instant getTimestamp() { return null; }
        public long getTimestampMillis() { return 0L; }
        public int hashCode() { return 0; }
        android.os.Bundle toBundleImpl() { return null; }
        public java.lang.String toString() { return null; }
        void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    }

    public static final class ConversationUpdateEvent extends android.app.personalcontext.hint.ConversationEvent {
        private static final java.lang.String KEY_CONVERSATION_DATA = "key_conversation_data";
        private final android.app.personalcontext.hint.ConversationData mConversationData = null;
        public ConversationUpdateEvent(java.lang.String p0, long p1, long p2, android.app.personalcontext.hint.ConversationData p3) { super(null, 0L, 0L); }
        ConversationUpdateEvent(java.lang.String p0, long p1, long p2, android.os.Bundle p3) { super(null, 0L, 0L); }
        ConversationUpdateEvent(java.lang.String p0, long p1, long p2, android.os.Parcel p3) { super(null, 0L, 0L); }
        public ConversationUpdateEvent(java.lang.String p0, java.time.Instant p1, java.time.Instant p2, android.app.personalcontext.hint.ConversationData p3) { super(null, 0L, 0L); }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.personalcontext.hint.ConversationData getConversationData() { return null; }
        int getEventType() { return 0; }
        public java.time.Instant getTimestamp() { return null; }
        public long getTimestampMillis() { return 0L; }
        public int hashCode() { return 0; }
        android.os.Bundle toBundleImpl() { return null; }
        public java.lang.String toString() { return null; }
        void writeToParcelImpl(android.os.Parcel p0, int p1) {}
        void writeToSignatureParcelImpl(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EventType {
    }
}
