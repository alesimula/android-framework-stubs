package android.service.notification;

public class StatusBarNotification implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.StatusBarNotification> CREATOR = null;
    static final int MAX_LOG_TAG_LENGTH = 36;
    private java.lang.String groupKey;
    private final int id = 0;
    private final int initialPid = 0;
    private final java.lang.String key = null;
    private final java.util.Map<java.lang.Integer, android.content.Context> mContextForDisplayId = null;
    private com.android.internal.logging.InstanceId mInstanceId;
    private final android.app.Notification notification = null;
    private final java.lang.String opPkg = null;
    private java.lang.String overrideGroupKey;
    private final java.lang.String pkg = null;
    private final long postTime = 0L;
    private final java.lang.String tag = null;
    private final int uid = 0;
    private final android.os.UserHandle user = null;
    public StatusBarNotification(android.os.Parcel p0) {}
    @java.lang.Deprecated
    public StatusBarNotification(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, int p6, android.app.Notification p7, android.os.UserHandle p8, long p9) {}
    public StatusBarNotification(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, android.app.Notification p6, android.os.UserHandle p7, java.lang.String p8, long p9) {}
    private android.content.Context createPackageContext(android.content.Context p0) { return null; }
    public static java.lang.String getPkgFromKey(java.lang.String p0) { return null; }
    public static int getUidFromKey(java.lang.String p0) { return 0; }
    private java.lang.String groupKey() { return null; }
    private java.lang.String key() { return null; }
    private java.lang.String shortenTag(java.lang.String p0) { return null; }
    public void clearPackageContext() {}
    public android.service.notification.StatusBarNotification clone() { return null; }
    public android.service.notification.StatusBarNotification cloneLight() { return null; }
    public android.service.notification.StatusBarNotification cloneShallow(android.app.Notification p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getChannelIdLogTag() { return null; }
    public java.lang.String getGroup() { return null; }
    public java.lang.String getGroupKey() { return null; }
    public java.lang.String getGroupLogTag() { return null; }
    public int getId() { return 0; }
    public int getInitialPid() { return 0; }
    public com.android.internal.logging.InstanceId getInstanceId() { return null; }
    public java.lang.String getKey() { return null; }
    public android.metrics.LogMaker getLogMaker() { return null; }
    public int getNormalizedUserId() { return 0; }
    public android.app.Notification getNotification() { return null; }
    public java.lang.String getOpPkg() { return null; }
    public java.lang.String getOverrideGroupKey() { return null; }
    public android.content.Context getPackageContext(android.content.Context p0) { return null; }
    public android.content.pm.PackageManager getPackageManagerForUser(android.content.Context p0) { return null; }
    public java.lang.String getPackageName() { return null; }
    public long getPostTime() { return 0L; }
    public java.lang.String getShortcutId() { return null; }
    public java.lang.String getTag() { return null; }
    public int getUid() { return 0; }
    public android.os.UserHandle getUser() { return null; }
    @java.lang.Deprecated
    public int getUserId() { return 0; }
    public boolean isAppGroup() { return false; }
    public boolean isClearable() { return false; }
    public boolean isGroup() { return false; }
    public boolean isNonDismissable() { return false; }
    public boolean isOngoing() { return false; }
    public void setInstanceId(com.android.internal.logging.InstanceId p0) {}
    public void setOverrideGroupKey(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
