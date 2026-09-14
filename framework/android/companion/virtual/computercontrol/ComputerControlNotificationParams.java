package android.companion.virtual.computercontrol;

public final class ComputerControlNotificationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.computercontrol.ComputerControlNotificationParams> CREATOR = null;
    private final android.app.Notification mNotification = null;
    private final int mNotificationId = 0;
    private final java.lang.String mNotificationTag = null;
    private ComputerControlNotificationParams(android.app.Notification p0, int p1, java.lang.String p2) {}
    private ComputerControlNotificationParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.Notification getNotification() { return null; }
    public int getNotificationId() { return 0; }
    public java.lang.String getNotificationTag() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.app.Notification mNotification = null;
        private final int mNotificationId = 0;
        private java.lang.String mNotificationTag;
        public Builder(android.app.Notification p0, int p1) {}
        public android.companion.virtual.computercontrol.ComputerControlNotificationParams build() { return null; }
        public android.companion.virtual.computercontrol.ComputerControlNotificationParams.Builder setNotificationTag(java.lang.String p0) { return null; }
    }
}
