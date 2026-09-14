package android.service.personalcontext.hint;

@android.annotation.SystemApi
public abstract class NotificationEvent {
    public static final int EVENT_TYPE_ENQUEUED = 1;
    static final int EVENT_TYPE_REMOVED = 2;
    static final int EVENT_TYPE_UNKNOWN = -1;
    private static final java.lang.String KEY_EVENT_DATA = "key_event_data";
    private static final java.lang.String KEY_EVENT_TYPE = "key_event_type";
    NotificationEvent() {}
    static android.service.personalcontext.hint.NotificationEvent fromBundle(android.os.Bundle p0) { return null; }
    static android.service.personalcontext.hint.NotificationEvent readFromParcel(android.os.Parcel p0) { return null; }
    public abstract android.os.Bundle createCompatBundle();
    public abstract int getEventType();
    public abstract android.service.personalcontext.hint.NotificationDetails getNotificationDetails();
    android.os.Bundle toBundle() { return null; }
    abstract android.os.Bundle toBundleImpl();
    final void writeToParcel(android.os.Parcel p0, int p1) {}
    void writeToParcelImpl(android.os.Parcel p0, int p1) {}

    public static final class NotificationEnqueuedEvent extends android.service.personalcontext.hint.NotificationEvent {
        private static final java.lang.String KEY_NOTIFICATION_CHANNEL = "key_notification_channel";
        private static final java.lang.String KEY_NOTIFICATION_DETAILS = "key_notification_details";
        private static final java.lang.String KEY_RANKING_MAP = "key_ranking_map";
        private static final java.lang.String KEY_STATUS_BAR_NOTIFICATION = "key_status_bar_notification";
        private final android.app.NotificationChannel mNotificationChannel = null;
        private final android.service.personalcontext.hint.NotificationDetails mNotificationDetails = null;
        private final android.service.notification.NotificationListenerService.RankingMap mRankingMap = null;
        private final android.service.notification.StatusBarNotification mStatusBarNotification = null;
        NotificationEnqueuedEvent(android.os.Bundle p0) { super(); }
        NotificationEnqueuedEvent(android.os.Parcel p0) { super(); }
        @java.lang.Deprecated
        public NotificationEnqueuedEvent(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1, android.service.notification.NotificationListenerService.RankingMap p2) { super(); }
        public NotificationEnqueuedEvent(android.service.personalcontext.hint.NotificationDetails p0, android.app.NotificationChannel p1, android.service.notification.NotificationListenerService.RankingMap p2) { super(); }
        public static android.service.notification.NotificationListenerService.RankingMap getRankingMapFromCompatBundle(android.os.Bundle p0) { return null; }
        public static android.service.notification.StatusBarNotification getStatusBarNotificationFromCompatBundle(android.os.Bundle p0) { return null; }
        public android.os.Bundle createCompatBundle() { return null; }
        public int getEventType() { return 0; }
        public android.app.NotificationChannel getNotificationChannel() { return null; }
        public android.service.personalcontext.hint.NotificationDetails getNotificationDetails() { return null; }
        @java.lang.Deprecated
        public android.service.notification.NotificationListenerService.RankingMap getRankingMap() { return null; }
        @java.lang.Deprecated
        public android.service.notification.StatusBarNotification getStatusBarNotification() { return null; }
        android.os.Bundle toBundleImpl() { return null; }
        void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    }

    public static final class NotificationRemovedEvent extends android.service.personalcontext.hint.NotificationEvent {
        private static final java.lang.String KEY_NOTIFICATION_DETAILS = "key_notification_details";
        private static final java.lang.String KEY_RANKING_MAP = "key_ranking_map";
        private static final java.lang.String KEY_REASON = "key_reason";
        private static final java.lang.String KEY_STATUS_BAR_NOTIFICATION = "key_status_bar_notification";
        private final android.service.personalcontext.hint.NotificationDetails mNotificationDetails = null;
        private final android.service.notification.NotificationListenerService.RankingMap mRankingMap = null;
        private final int mReason = 0;
        private final android.service.notification.StatusBarNotification mStatusBarNotification = null;
        NotificationRemovedEvent(android.os.Bundle p0) { super(); }
        NotificationRemovedEvent(android.os.Parcel p0) { super(); }
        @java.lang.Deprecated
        public NotificationRemovedEvent(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1, int p2) { super(); }
        public NotificationRemovedEvent(android.service.personalcontext.hint.NotificationDetails p0, android.service.notification.NotificationListenerService.RankingMap p1, int p2) { super(); }
        public static android.service.notification.NotificationListenerService.RankingMap getRankingMapFromCompatBundle(android.os.Bundle p0) { return null; }
        public static int getReasonFromCompatBundle(android.os.Bundle p0) { return 0; }
        public static android.service.notification.StatusBarNotification getStatusBarNotificationFromCompatBundle(android.os.Bundle p0) { return null; }
        public android.os.Bundle createCompatBundle() { return null; }
        public int getEventType() { return 0; }
        public android.service.personalcontext.hint.NotificationDetails getNotificationDetails() { return null; }
        @java.lang.Deprecated
        public android.service.notification.NotificationListenerService.RankingMap getRankingMap() { return null; }
        public int getReason() { return 0; }
        @java.lang.Deprecated
        public android.service.notification.StatusBarNotification getStatusBarNotification() { return null; }
        android.os.Bundle toBundleImpl() { return null; }
        void writeToParcelImpl(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
