package android.app.personalcontext.hint;

public final class NotificationDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.personalcontext.hint.NotificationDetails> CREATOR = null;
    private final java.lang.String mKey = null;
    private final android.app.Notification mNotification = null;
    private final java.lang.String mPackageName = null;
    private final long mPostTimeMillis = 0L;
    private final android.os.UserHandle mUser = null;
    public NotificationDetails(android.app.Notification p0, java.lang.String p1, long p2, java.lang.String p3, android.os.UserHandle p4) {}
    private NotificationDetails(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getKey() { return null; }
    public android.app.Notification getNotification() { return null; }
    public java.lang.String getPackageName() { return null; }
    public long getPostTimeMillis() { return 0L; }
    public android.os.UserHandle getUser() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mKey;
        private android.app.Notification mNotification;
        private java.lang.String mPackageName;
        private java.lang.Long mPostTimeMillis;
        private android.os.UserHandle mUser;
        public Builder() {}
        public android.app.personalcontext.hint.NotificationDetails build() { return null; }
        public android.app.personalcontext.hint.NotificationDetails.Builder setKey(java.lang.String p0) { return null; }
        public android.app.personalcontext.hint.NotificationDetails.Builder setNotification(android.app.Notification p0) { return null; }
        public android.app.personalcontext.hint.NotificationDetails.Builder setPackageName(java.lang.String p0) { return null; }
        public android.app.personalcontext.hint.NotificationDetails.Builder setPostTimeMillis(long p0) { return null; }
        public android.app.personalcontext.hint.NotificationDetails.Builder setUser(android.os.UserHandle p0) { return null; }
    }
}
