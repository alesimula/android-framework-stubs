package android.app.personalcontext.hint;

public abstract class NotificationEvent {
    public static final int EVENT_TYPE_ENQUEUED = 1;
    static final int EVENT_TYPE_REMOVED = 2;
    static final int EVENT_TYPE_UNKNOWN = -1;
    private static final java.lang.String KEY_EVENT_DATA = "key_event_data";
    private static final java.lang.String KEY_EVENT_TYPE = "key_event_type";
    NotificationEvent() {}
    static android.app.personalcontext.hint.NotificationEvent fromBundle(android.os.Bundle p0) { return null; }
    static android.app.personalcontext.hint.NotificationEvent readFromParcel(android.os.Parcel p0) { return null; }
    public abstract int getEventType();
    public abstract android.app.personalcontext.hint.NotificationDetails getNotificationDetails();
    android.os.Bundle toBundle() { return null; }
    abstract android.os.Bundle toBundleImpl();
    final void writeToParcel(android.os.Parcel p0, int p1) {}
    void writeToParcelImpl(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    public static final class NotificationEnqueuedEvent extends android.app.personalcontext.hint.NotificationEvent {
        private static final java.lang.String KEY_NOTIFICATION_CHANNEL = "key_notification_channel";
        private static final java.lang.String KEY_NOTIFICATION_DETAILS = "key_notification_details";
        private final android.app.NotificationChannel mNotificationChannel = null;
        private final android.app.personalcontext.hint.NotificationDetails mNotificationDetails = null;
        public NotificationEnqueuedEvent(android.app.personalcontext.hint.NotificationDetails p0, android.app.NotificationChannel p1) { super(); }
        NotificationEnqueuedEvent(android.os.Bundle p0) { super(); }
        NotificationEnqueuedEvent(android.os.Parcel p0) { super(); }
        public int getEventType() { return 0; }
        public android.app.NotificationChannel getNotificationChannel() { return null; }
        public android.app.personalcontext.hint.NotificationDetails getNotificationDetails() { return null; }
        android.os.Bundle toBundleImpl() { return null; }
        void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    }

    public static final class NotificationRemovedEvent extends android.app.personalcontext.hint.NotificationEvent {
        private static final java.lang.String KEY_NOTIFICATION_DETAILS = "key_notification_details";
        private final android.app.personalcontext.hint.NotificationDetails mNotificationDetails = null;
        public NotificationRemovedEvent(android.app.personalcontext.hint.NotificationDetails p0) { super(); }
        NotificationRemovedEvent(android.os.Bundle p0) { super(); }
        NotificationRemovedEvent(android.os.Parcel p0) { super(); }
        public int getEventType() { return 0; }
        public android.app.personalcontext.hint.NotificationDetails getNotificationDetails() { return null; }
        android.os.Bundle toBundleImpl() { return null; }
        void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    }
}
