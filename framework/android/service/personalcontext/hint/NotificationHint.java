package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class NotificationHint extends android.service.personalcontext.hint.ContextHint {
    private final android.service.personalcontext.hint.NotificationEvent mNotificationEvent = null;
    NotificationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    NotificationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.service.personalcontext.hint.NotificationEvent p1) { super(null); }
    int getHintType() { return 0; }
    public android.service.personalcontext.hint.NotificationEvent getNotificationEvent() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private android.service.personalcontext.hint.NotificationEvent mNotificationEvent;
        public Builder(android.service.personalcontext.hint.NotificationEvent p0) {}
        public android.service.personalcontext.hint.NotificationHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.NotificationHint build() { return null; }
    }
}
