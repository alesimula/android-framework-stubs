package android.companion.virtual.computercontrol;

public final class ComputerControlSessionParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.computercontrol.ComputerControlSessionParams> CREATOR = null;
    public static final int MAX_TARGET_PACKAGES = 6;
    public static final int MIN_COMPUTER_CONTROL_VERSION_FOR_ANDROID_17 = 5;
    private final android.app.AppInteractionAttribution mAppInteractionAttribution = null;
    private final int mDisplayId = 0;
    private final java.lang.String mName = null;
    private final android.companion.virtual.computercontrol.ComputerControlNotificationParams mNotificationParams = null;
    private final android.app.PendingIntent mPreviewIntent = null;
    private final byte[] mRemoteDeviceAuthToken = null;
    private final int mTargetComputerControlVersion = 0;
    private final java.util.List<java.lang.String> mTargetPackageNames = null;
    private ComputerControlSessionParams(android.os.Parcel p0) {}
    private ComputerControlSessionParams(java.lang.String p0, int p1, java.util.List<java.lang.String> p2, android.app.PendingIntent p3, android.app.AppInteractionAttribution p4, byte[] p5, android.companion.virtual.computercontrol.ComputerControlNotificationParams p6, int p7) {}
    public int describeContents() { return 0; }
    public android.app.AppInteractionAttribution getAppInteractionAttribution() { return null; }
    public int getDisplayId() { return 0; }
    public java.lang.String getName() { return null; }
    public android.companion.virtual.computercontrol.ComputerControlNotificationParams getNotificationParams() { return null; }
    public android.app.PendingIntent getPreviewIntent() { return null; }
    public byte[] getRemoteDeviceAuthToken() { return null; }
    public int getTargetComputerControlVersion() { return 0; }
    public java.util.List<java.lang.String> getTargetPackageNames() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.AppInteractionAttribution mAppInteractionAttribution;
        private int mDisplayId;
        private java.lang.String mName;
        private android.companion.virtual.computercontrol.ComputerControlNotificationParams mNotificationParams;
        private android.app.PendingIntent mPreviewIntent;
        private byte[] mRemoteDeviceAuthToken;
        private int mTargetComputerControlVersion;
        private java.util.List<java.lang.String> mTargetPackageNames;
        public Builder() {}
        public android.companion.virtual.computercontrol.ComputerControlSessionParams build() { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setAppInteractionAttribution(android.app.AppInteractionAttribution p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setDisplayId(int p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setName(java.lang.String p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setNotificationParams(android.companion.virtual.computercontrol.ComputerControlNotificationParams p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setPreviewIntent(android.app.PendingIntent p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setRemoteDeviceAuthToken(byte[] p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setTargetComputerControlVersion(int p0) { return null; }
        public android.companion.virtual.computercontrol.ComputerControlSessionParams.Builder setTargetPackageNames(java.util.List<java.lang.String> p0) { return null; }
    }
}
