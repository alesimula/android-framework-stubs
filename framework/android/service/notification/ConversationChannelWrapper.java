package android.service.notification;

public final class ConversationChannelWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.ConversationChannelWrapper> CREATOR = null;
    private java.lang.CharSequence mGroupLabel;
    private android.app.NotificationChannel mNotificationChannel;
    private java.lang.CharSequence mParentChannelLabel;
    private java.lang.String mPkg;
    private android.content.pm.ShortcutInfo mShortcutInfo;
    private int mUid;
    public ConversationChannelWrapper() {}
    protected ConversationChannelWrapper(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.CharSequence getGroupLabel() { return null; }
    public android.app.NotificationChannel getNotificationChannel() { return null; }
    public java.lang.CharSequence getParentChannelLabel() { return null; }
    public java.lang.String getPkg() { return null; }
    public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
    public int getUid() { return 0; }
    public int hashCode() { return 0; }
    public void setGroupLabel(java.lang.CharSequence p0) {}
    public void setNotificationChannel(android.app.NotificationChannel p0) {}
    public void setParentChannelLabel(java.lang.CharSequence p0) {}
    public void setPkg(java.lang.String p0) {}
    public void setShortcutInfo(android.content.pm.ShortcutInfo p0) {}
    public void setUid(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
