package android.app;

public final class NotificationChannelGroup implements android.os.Parcelable {
    private static final java.lang.String ATT_BLOCKED = "blocked";
    private static final java.lang.String ATT_DESC = "desc";
    private static final java.lang.String ATT_ID = "id";
    private static final java.lang.String ATT_NAME = "name";
    private static final java.lang.String ATT_USER_LOCKED = "locked";
    public static final android.os.Parcelable.Creator<android.app.NotificationChannelGroup> CREATOR = null;
    public static final int MAX_TEXT_LENGTH = 1000;
    private static final java.lang.String TAG_GROUP = "channelGroup";
    public static final int USER_LOCKED_BLOCKED_STATE = 1;
    private boolean mBlocked;
    private java.util.List<android.app.NotificationChannel> mChannels;
    private java.lang.String mDescription;
    private final java.lang.String mId = null;
    private java.lang.CharSequence mName;
    private int mUserLockedFields;
    protected NotificationChannelGroup(android.os.Parcel p0) {}
    public NotificationChannelGroup(java.lang.String p0, java.lang.CharSequence p1) {}
    private java.lang.String getTrimmedString(java.lang.String p0) { return null; }
    public void addChannel(android.app.NotificationChannel p0) {}
    public android.app.NotificationChannelGroup clone() { return null; }
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.NotificationChannel> getChannels() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public int getUserLockedFields() { return 0; }
    public int hashCode() { return 0; }
    public boolean isBlocked() { return false; }
    public void lockFields(int p0) {}
    public void populateFromXml(com.android.modules.utils.TypedXmlPullParser p0) {}
    public void setBlocked(boolean p0) {}
    public void setChannels(java.util.List<android.app.NotificationChannel> p0) {}
    public void setDescription(java.lang.String p0) {}
    @android.annotation.SystemApi
    public org.json.JSONObject toJson() throws org.json.JSONException { return null; }
    public java.lang.String toString() { return null; }
    public void unlockFields(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
}
