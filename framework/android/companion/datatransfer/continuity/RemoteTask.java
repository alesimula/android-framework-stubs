package android.companion.datatransfer.continuity;

@android.annotation.SystemApi
public final class RemoteTask implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.datatransfer.continuity.RemoteTask> CREATOR = null;
    private final java.lang.String mAssociationDisplayName = null;
    private final int mCompanionDeviceAssociationId = 0;
    private final android.graphics.drawable.Icon mIcon = null;
    private final boolean mIsHandoffEnabled = false;
    private final boolean mIsTaskInForeground = false;
    private final java.lang.String mLabel = null;
    private final long mLastUsedTimestampMillis = 0L;
    private final java.lang.String mPackageName = null;
    private final int mTaskId = 0;
    RemoteTask(android.companion.datatransfer.continuity.RemoteTask.Builder p0) {}
    RemoteTask(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAssociationDisplayName() { return null; }
    public int getCompanionDeviceAssociationId() { return 0; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.String getLabel() { return null; }
    public long getLastUsedTimestampMillis() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public int getTaskId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isHandoffEnabled() { return false; }
    public boolean isTaskInForeground() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mAssociationDisplayName;
        private int mCompanionDeviceAssociationId;
        private android.graphics.drawable.Icon mIcon;
        private boolean mIsHandoffEnabled;
        private boolean mIsTaskInForeground;
        private java.lang.String mLabel;
        private long mLastUsedTimestampMillis;
        private java.lang.String mPackageName;
        private int mTaskId;
        public Builder(int p0, int p1) {}
        public android.companion.datatransfer.continuity.RemoteTask build() { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setAssociationDisplayName(java.lang.String p0) { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setHandoffEnabled(boolean p0) { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setLabel(java.lang.String p0) { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setLastUsedTimestampMillis(long p0) { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setPackageName(java.lang.String p0) { return null; }
        public android.companion.datatransfer.continuity.RemoteTask.Builder setTaskInForeground(boolean p0) { return null; }
    }
}
