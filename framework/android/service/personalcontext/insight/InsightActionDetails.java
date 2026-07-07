package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class InsightActionDetails implements android.os.Parcelable {
    public static final int ACTION_TYPE_PENDING_INTENT = 1;
    public static final int ACTION_TYPE_REMOTE_ACTION = 2;
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.InsightActionDetails> CREATOR = null;
    private final int mActionTypes = 0;
    private final android.app.PendingIntent mPendingIntent = null;
    private final android.app.RemoteAction mRemoteAction = null;
    private InsightActionDetails(android.app.PendingIntent p0, android.app.RemoteAction p1) {}
    private InsightActionDetails(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getActionTypes() { return 0; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public android.app.RemoteAction getRemoteAction() { return null; }
    public boolean hasActionType(int p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    public static final class Builder {
        private android.app.PendingIntent mPendingIntent;
        private android.app.RemoteAction mRemoteAction;
        public Builder() {}
        public android.service.personalcontext.insight.InsightActionDetails build() { return null; }
        public android.service.personalcontext.insight.InsightActionDetails.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.service.personalcontext.insight.InsightActionDetails.Builder setRemoteAction(android.app.RemoteAction p0) { return null; }
    }
}
