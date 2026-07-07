package android.app;

public final class NotificationHistory implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.NotificationHistory> CREATOR = null;
    private int mHistoryCount;
    private int mIndex;
    private java.util.List<android.app.NotificationHistory.HistoricalNotification> mNotificationsToWrite;
    private android.os.Parcel mParcel;
    private java.lang.String[] mStringPool;
    private java.util.Set<java.lang.String> mStringsToWrite;
    public NotificationHistory() {}
    private NotificationHistory(android.os.Parcel p0) {}
    private int findStringIndex(java.lang.String p0) { return 0; }
    private android.app.NotificationHistory.HistoricalNotification readNotificationFromParcel(android.os.Parcel p0) { return null; }
    private void writeNotificationToParcel(android.app.NotificationHistory.HistoricalNotification p0, android.os.Parcel p1, int p2) {}
    public void addNewNotificationToWrite(android.app.NotificationHistory.HistoricalNotification p0) {}
    public void addNotificationToWrite(android.app.NotificationHistory.HistoricalNotification p0) {}
    public void addNotificationsToWrite(android.app.NotificationHistory p0) {}
    public void addPooledStrings(java.util.List<java.lang.String> p0) {}
    public int describeContents() { return 0; }
    public int getHistoryCount() { return 0; }
    public android.app.NotificationHistory.HistoricalNotification getNextNotification() { return null; }
    public java.util.List<android.app.NotificationHistory.HistoricalNotification> getNotificationsToWrite() { return null; }
    public java.lang.String[] getPooledStringsToWrite() { return null; }
    public boolean hasNextNotification() { return false; }
    public void poolStringsFromNotifications() {}
    public boolean removeChannelFromWrite(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean removeConversationsFromWrite(java.lang.String p0, java.util.Set<java.lang.String> p1) { return false; }
    public boolean removeNotificationFromWrite(java.lang.String p0, long p1) { return false; }
    public void removeNotificationsFromWrite(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class HistoricalNotification {
        private java.lang.String mChannelId;
        private java.lang.String mChannelName;
        private java.lang.String mConversationId;
        private android.graphics.drawable.Icon mIcon;
        private java.lang.String mPackage;
        private long mPostedTimeMs;
        private java.lang.String mText;
        private java.lang.String mTitle;
        private int mUid;
        private int mUserId;
        private HistoricalNotification() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getChannelId() { return null; }
        public java.lang.String getChannelName() { return null; }
        public java.lang.String getConversationId() { return null; }
        public android.graphics.drawable.Icon getIcon() { return null; }
        public java.lang.String getKey() { return null; }
        public java.lang.String getPackage() { return null; }
        public long getPostedTimeMs() { return 0L; }
        public java.lang.String getText() { return null; }
        public java.lang.String getTitle() { return null; }
        public int getUid() { return 0; }
        public int getUserId() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            private java.lang.String mChannelId;
            private java.lang.String mChannelName;
            private java.lang.String mConversationId;
            private android.graphics.drawable.Icon mIcon;
            private java.lang.String mPackage;
            private long mPostedTimeMs;
            private java.lang.String mText;
            private java.lang.String mTitle;
            private int mUid;
            private int mUserId;
            public Builder() {}
            public android.app.NotificationHistory.HistoricalNotification build() { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setChannelId(java.lang.String p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setChannelName(java.lang.String p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setConversationId(java.lang.String p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setPackage(java.lang.String p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setPostedTimeMs(long p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setText(java.lang.String p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setTitle(java.lang.String p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setUid(int p0) { return null; }
            public android.app.NotificationHistory.HistoricalNotification.Builder setUserId(int p0) { return null; }
        }
    }
}
