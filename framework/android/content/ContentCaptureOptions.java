package android.content;

public final class ContentCaptureOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.ContentCaptureOptions> CREATOR = null;
    private static final java.lang.String TAG = null;
    public final android.util.ArrayMap<android.content.ComponentName, java.lang.Integer> componentNameVersionMapping = null;
    public final int contentCaptureVersion = 0;
    public final android.content.ContentCaptureOptions.ContentProtectionOptions contentProtectionOptions = null;
    public final boolean enableReceiver = false;
    public final int idleFlushingFrequencyMs = 0;
    public final boolean lite = false;
    public final int logHistorySize = 0;
    public final int loggingLevel = 0;
    public final int maxBufferSize = 0;
    public final int textChangeFlushingFrequencyMs = 0;
    public final android.util.ArraySet<android.content.ComponentName> whitelistedComponents = null;
    public ContentCaptureOptions(int p0) {}
    public ContentCaptureOptions(int p0, int p1, int p2, int p3, int p4, android.util.ArraySet<android.content.ComponentName> p5) {}
    public ContentCaptureOptions(int p0, int p1, int p2, int p3, int p4, boolean p5, int p6, android.content.ContentCaptureOptions.ContentProtectionOptions p7, android.util.ArraySet<android.content.ComponentName> p8, android.util.ArrayMap<android.content.ComponentName, java.lang.Integer> p9) {}
    public ContentCaptureOptions(android.util.ArraySet<android.content.ComponentName> p0) {}
    private ContentCaptureOptions(boolean p0, int p1, int p2, int p3, int p4, int p5, boolean p6, int p7, android.content.ContentCaptureOptions.ContentProtectionOptions p8, android.util.ArraySet<android.content.ComponentName> p9, android.util.ArrayMap<android.content.ComponentName, java.lang.Integer> p10) {}
    public static android.content.ContentCaptureOptions forWhitelistingItself() { return null; }
    public int describeContents() { return 0; }
    public void dumpShort(java.io.PrintWriter p0) {}
    public int getContentCaptureVersion() { return 0; }
    public int getContentCaptureVersion(android.content.ComponentName p0) { return 0; }
    public boolean isWhitelisted(android.content.Context p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class ContentProtectionOptions {
        public final int bufferSize = 0;
        public final boolean enableReceiver = false;
        public final java.util.List<java.util.List<java.lang.String>> optionalGroups = null;
        public final int optionalGroupsThreshold = 0;
        public final java.util.List<java.util.List<java.lang.String>> requiredGroups = null;
        public ContentProtectionOptions() {}
        public ContentProtectionOptions(boolean p0, int p1, java.util.List<java.util.List<java.lang.String>> p2, java.util.List<java.util.List<java.lang.String>> p3, int p4) {}
        private static android.content.ContentCaptureOptions.ContentProtectionOptions createFromParcel(android.os.Parcel p0) { return null; }
        private static java.util.List<java.util.List<java.lang.String>> createGroupsFromParcel(android.os.Parcel p0) { return null; }
        private void dumpShort(java.io.PrintWriter p0) {}
        private static void writeGroupsToParcel(java.util.List<java.util.List<java.lang.String>> p0, android.os.Parcel p1) {}
        private void writeToParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
    }
}
