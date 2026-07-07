package android.companion.virtual.computercontrol;

public final class ComputerControlSessionParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.computercontrol.ComputerControlSessionParams> CREATOR = null;
    public static final int MAX_TARGET_PACKAGES = 6;
    public static final int MIN_COMPUTER_CONTROL_VERSION_FOR_ANDROID_17 = 5;
    private final android.app.AppInteractionAttribution mAppInteractionAttribution = null;
    private final java.lang.String mName = null;
    private final android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams mNotificationParams = null;
    private final android.app.PendingIntent mPreviewIntent = null;
    private final int mTargetComputerControlVersion = 0;
    private final java.util.List<java.lang.String> mTargetPackageNames = null;
    private ComputerControlSessionParams(android.os.Parcel p0) {}
    private ComputerControlSessionParams(java.lang.String p0, int p1, java.util.List<java.lang.String> p2, android.app.PendingIntent p3, android.app.AppInteractionAttribution p4, android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams p5) {}
    public int describeContents() { return 0; }
    public android.app.AppInteractionAttribution getAppInteractionAttribution() { return null; }
    public java.lang.String getName() { return null; }
    public android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams getNotificationParams() { return null; }
    public android.app.PendingIntent getPreviewIntent() { return null; }
    public int getTargetComputerControlVersion() { return 0; }
    public java.util.List<java.lang.String> getTargetPackageNames() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.AppInteractionAttribution mAppInteractionAttribution;
        private java.lang.String mName;
        private android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams mNotificationParams;
        private android.app.PendingIntent mPreviewIntent;
        private int mTargetComputerControlVersion;
        private java.util.List<java.lang.String> mTargetPackageNames;
        public Builder() {}
        public android.companion.virtual.computercontrol.ComputerControlSessionParams build() { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setAppInteractionAttribution(android.app.AppInteractionAttribution p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setName(java.lang.String p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setNotificationParams(android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setPreviewIntent(android.app.PendingIntent p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setTargetComputerControlVersion(int p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setTargetPackageNames(java.util.List<java.lang.String> p0) { return null; }
    }

    public static final class NotificationParams implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams> CREATOR = null;
        private final android.app.Notification mNotification = null;
        private final int mNotificationId = 0;
        private final java.lang.String mNotificationTag = null;
        private NotificationParams(android.app.Notification p0, int p1, java.lang.String p2) {}
        private NotificationParams(android.os.Parcel p0) {}
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
            public android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams build() { return null; }
            public android.companion.virtual.computercontrol.ComputerControlSessionParams.NotificationParams.Builder setNotificationTag(java.lang.String p0) { return null; }
        }
    }
}
