package android.view;

public final class ContentRecordingSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.ContentRecordingSession> CREATOR = null;
    public static final int RECORD_CONTENT_APP_CONTENT = 3;
    public static final int RECORD_CONTENT_BELOW_OVERLAY = 2;
    public static final int RECORD_CONTENT_DISPLAY = 0;
    public static final int RECORD_CONTENT_TASK = 1;
    public static final int TARGET_UID_FULL_SCREEN = -1;
    public static final int TARGET_UID_UNKNOWN = -2;
    public static final int TASK_ID_UNKNOWN = -1;
    private int mContentToRecord;
    private int mDisplayToRecord;
    private android.os.IBinder mRecordingOverlayToken;
    private int mRecordingOwnerUid;
    private int mTargetUid;
    private int mTaskId;
    private android.os.IBinder mTokenToRecord;
    private int mVirtualDisplayId;
    private boolean mWaitingForConsent;
    private ContentRecordingSession() {}
    ContentRecordingSession(int p0, int p1, int p2, int p3, int p4, android.os.IBinder p5, android.os.IBinder p6, boolean p7, int p8) {}
    ContentRecordingSession(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static android.view.ContentRecordingSession createAppContentSession() { return null; }
    public static android.view.ContentRecordingSession createDisplaySession(int p0) { return null; }
    public static android.view.ContentRecordingSession createOverlaySession(int p0, int p1, android.os.IBinder p2) { return null; }
    public static android.view.ContentRecordingSession createTaskSession(android.os.IBinder p0) { return null; }
    public static android.view.ContentRecordingSession createTaskSession(android.os.IBinder p0, int p1) { return null; }
    public static boolean isProjectionOnSameDisplay(android.view.ContentRecordingSession p0, android.view.ContentRecordingSession p1) { return false; }
    public static boolean isValid(android.view.ContentRecordingSession p0) { return false; }
    public static java.lang.String recordContentToString(int p0) { return null; }
    public static java.lang.String targetUidToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getContentToRecord() { return 0; }
    public int getDisplayToRecord() { return 0; }
    public android.os.IBinder getRecordingOverlayToken() { return null; }
    public int getRecordingOwnerUid() { return 0; }
    public int getTargetUid() { return 0; }
    public int getTaskId() { return 0; }
    public android.os.IBinder getTokenToRecord() { return null; }
    public int getVirtualDisplayId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isWaitingForConsent() { return false; }
    public android.view.ContentRecordingSession setContentToRecord(int p0) { return null; }
    public android.view.ContentRecordingSession setDisplayToRecord(int p0) { return null; }
    public android.view.ContentRecordingSession setRecordingOverlayToken(android.os.IBinder p0) { return null; }
    public android.view.ContentRecordingSession setRecordingOwnerUid(int p0) { return null; }
    public android.view.ContentRecordingSession setTargetUid(int p0) { return null; }
    public android.view.ContentRecordingSession setTaskId(int p0) { return null; }
    public android.view.ContentRecordingSession setTokenToRecord(android.os.IBinder p0) { return null; }
    public android.view.ContentRecordingSession setVirtualDisplayId(int p0) { return null; }
    public android.view.ContentRecordingSession setWaitingForConsent(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private int mContentToRecord;
        private int mDisplayToRecord;
        private android.os.IBinder mRecordingOverlayToken;
        private int mRecordingOwnerUid;
        private int mTargetUid;
        private int mTaskId;
        private android.os.IBinder mTokenToRecord;
        private int mVirtualDisplayId;
        private boolean mWaitingForConsent;
        public Builder(int p0) {}
        private void checkNotUsed() {}
        public android.view.ContentRecordingSession build() { return null; }
        public android.view.ContentRecordingSession.Builder setContentToRecord(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setDisplayToRecord(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setRecordingOverlayToken(android.os.IBinder p0) { return null; }
        public android.view.ContentRecordingSession.Builder setRecordingOwnerUid(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setTargetUid(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setTaskId(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setTokenToRecord(android.os.IBinder p0) { return null; }
        public android.view.ContentRecordingSession.Builder setVirtualDisplayId(int p0) { return null; }
        public android.view.ContentRecordingSession.Builder setWaitingForConsent(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecordContent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TargetUid {
    }
}
