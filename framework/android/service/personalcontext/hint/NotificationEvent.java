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
    public abstract int getEventType();
    android.os.Bundle toBundle() { return null; }
    abstract android.os.Bundle toBundleImpl();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    public static final class NotificationEnqueuedEvent extends android.service.personalcontext.hint.NotificationEvent {
        private static final java.lang.String KEY_NOTIFICATION_CHANNEL = "key_notification_channel";
        private static final java.lang.String KEY_RANKING_MAP = "key_ranking_map";
        private static final java.lang.String KEY_STATUS_BAR_NOTIFICATION = "key_status_bar_notification";
        private final android.app.NotificationChannel mNotificationChannel = null;
        private final android.service.notification.NotificationListenerService.RankingMap mRankingMap = null;
        private final android.service.notification.StatusBarNotification mStatusBarNotification = null;
        NotificationEnqueuedEvent(android.os.Bundle p0) { super(); }
        public NotificationEnqueuedEvent(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1, android.service.notification.NotificationListenerService.RankingMap p2) { super(); }
        public int getEventType() { return 0; }
        public android.app.NotificationChannel getNotificationChannel() { return null; }
        public android.service.notification.NotificationListenerService.RankingMap getRankingMap() { return null; }
        public android.service.notification.StatusBarNotification getStatusBarNotification() { return null; }
        android.os.Bundle toBundleImpl() { return null; }
    }

    public static final class NotificationRemovedEvent extends android.service.personalcontext.hint.NotificationEvent {
        private static final java.lang.String KEY_RANKING_MAP = "key_ranking_map";
        private static final java.lang.String KEY_REASON = "key_reason";
        private static final java.lang.String KEY_STATUS_BAR_NOTIFICATION = "key_status_bar_notification";
        private final android.service.notification.NotificationListenerService.RankingMap mRankingMap = null;
        private final int mReason = 0;
        private final android.service.notification.StatusBarNotification mStatusBarNotification = null;
        NotificationRemovedEvent(android.os.Bundle p0) { super(); }
        public NotificationRemovedEvent(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1, int p2) { super(); }
        public int getEventType() { return 0; }
        public android.service.notification.NotificationListenerService.RankingMap getRankingMap() { return null; }
        public int getReason() { return 0; }
        public android.service.notification.StatusBarNotification getStatusBarNotification() { return null; }
        android.os.Bundle toBundleImpl() { return null; }
    }
}
