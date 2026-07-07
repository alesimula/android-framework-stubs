package android.app;

public final class DirectAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.DirectAction> CREATOR = null;
    public static final java.lang.String KEY_ACTIONS_LIST = "actions_list";
    private android.os.IBinder mActivityId;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mID = null;
    private final android.content.LocusId mLocusId = null;
    private int mTaskId;
    public DirectAction(android.app.DirectAction p0) {}
    private DirectAction(android.os.Parcel p0) {}
    public DirectAction(java.lang.String p0, android.os.Bundle p1, android.content.LocusId p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.IBinder getActivityId() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getId() { return null; }
    public android.content.LocusId getLocusId() { return null; }
    public int getTaskId() { return 0; }
    public int hashCode() { return 0; }
    public void setSource(int p0, android.os.IBinder p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.Bundle mExtras;
        private java.lang.String mId;
        private android.content.LocusId mLocusId;
        public Builder(java.lang.String p0) {}
        public android.app.DirectAction build() { return null; }
        public android.app.DirectAction.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.DirectAction.Builder setLocusId(android.content.LocusId p0) { return null; }
    }
}
