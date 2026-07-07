package android.app;

public final class RemoteAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RemoteAction> CREATOR = null;
    private static final java.lang.String TAG = "RemoteAction";
    private final android.app.PendingIntent mActionIntent = null;
    private final java.lang.CharSequence mContentDescription = null;
    private boolean mEnabled;
    private final android.graphics.drawable.Icon mIcon = null;
    private boolean mShouldShowIcon;
    private final java.lang.CharSequence mTitle = null;
    public RemoteAction(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
    RemoteAction(android.os.Parcel p0) {}
    public android.app.RemoteAction clone() { return null; }
    public int describeContents() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.PendingIntent getActionIntent() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public void setShouldShowIcon(boolean p0) {}
    public boolean shouldShowIcon() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
