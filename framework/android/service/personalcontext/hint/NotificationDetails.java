package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class NotificationDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.NotificationDetails> CREATOR = null;
    private final java.lang.String mKey = null;
    private final android.app.Notification mNotification = null;
    private final java.lang.String mPackageName = null;
    private final long mPostTimeMillis = 0L;
    private final android.os.UserHandle mUser = null;
    public NotificationDetails(android.app.Notification p0, java.lang.String p1, long p2, java.lang.String p3, android.os.UserHandle p4) {}
    private NotificationDetails(android.os.Parcel p0) {}
    public NotificationDetails(android.service.notification.StatusBarNotification p0) {}
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
}
