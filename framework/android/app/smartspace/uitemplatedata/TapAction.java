package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class TapAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.TapAction> CREATOR = null;
    private final android.os.Bundle mExtras = null;
    private final java.lang.CharSequence mId = null;
    private final android.content.Intent mIntent = null;
    private final android.app.PendingIntent mPendingIntent = null;
    private final boolean mShouldShowOnLockscreen = false;
    private final android.os.UserHandle mUserHandle = null;
    TapAction(android.os.Parcel p0) {}
    private TapAction(java.lang.CharSequence p0, android.content.Intent p1, android.app.PendingIntent p2, android.os.UserHandle p3, android.os.Bundle p4, boolean p5) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.CharSequence getId() { return null; }
    public android.content.Intent getIntent() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public int hashCode() { return 0; }
    public boolean shouldShowOnLockscreen() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.os.Bundle mExtras;
        private java.lang.CharSequence mId;
        private android.content.Intent mIntent;
        private android.app.PendingIntent mPendingIntent;
        private boolean mShouldShowOnLockScreen;
        private android.os.UserHandle mUserHandle;
        public Builder(java.lang.CharSequence p0) {}
        public android.app.smartspace.uitemplatedata.TapAction build() { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setIntent(android.content.Intent p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setShouldShowOnLockscreen(boolean p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setUserHandle(android.os.UserHandle p0) { return null; }
    }
}
