package android.app.personalcontext.hint;

public final class NotificationHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_SERVICE_COMPAT = "service_compat";
    private final android.app.personalcontext.hint.NotificationEvent mNotificationEvent = null;
    private final android.os.Bundle mServiceCompat = null;
    NotificationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.app.personalcontext.hint.NotificationEvent p1, android.os.Bundle p2) { super(null); }
    NotificationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    NotificationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public NotificationHint(android.app.personalcontext.hint.NotificationEvent p0) { super(null); }
    int getHintType() { return 0; }
    public android.app.personalcontext.hint.NotificationEvent getNotificationEvent() { return null; }
    public android.os.Bundle getServiceCompat() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private android.app.personalcontext.hint.NotificationEvent mNotificationEvent;
        private android.os.Bundle mServiceCompat;
        public Builder(android.app.personalcontext.hint.NotificationEvent p0) {}
        public android.app.personalcontext.hint.NotificationHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.NotificationHint build() { return null; }
        public android.app.personalcontext.hint.NotificationHint.Builder setServiceCompat(android.os.Bundle p0) { return null; }
    }
}
