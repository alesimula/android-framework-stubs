package android.service.quicksettings;

public final class Tile implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.quicksettings.Tile> CREATOR = null;
    public static final int STATE_ACTIVE = 2;
    public static final int STATE_INACTIVE = 1;
    public static final int STATE_UNAVAILABLE = 0;
    private static final java.lang.String TAG = "Tile";
    private java.lang.CharSequence mContentDescription;
    private java.lang.CharSequence mDefaultLabel;
    private android.graphics.drawable.Icon mIcon;
    private java.lang.CharSequence mLabel;
    private android.app.PendingIntent mPendingIntent;
    private android.service.quicksettings.IQSService mService;
    private int mState;
    private java.lang.CharSequence mStateDescription;
    private java.lang.CharSequence mSubtitle;
    private android.os.IBinder mToken;
    public Tile() {}
    public Tile(android.os.Parcel p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getActivityLaunchForClick() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public java.lang.CharSequence getCustomLabel() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public int getState() { return 0; }
    public java.lang.CharSequence getStateDescription() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public void setActivityLaunchForClick(android.app.PendingIntent p0) {}
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void setDefaultLabel(java.lang.CharSequence p0) {}
    public void setIcon(android.graphics.drawable.Icon p0) {}
    public void setLabel(java.lang.CharSequence p0) {}
    public void setService(android.service.quicksettings.IQSService p0, android.os.IBinder p1) {}
    public void setState(int p0) {}
    public void setStateDescription(java.lang.CharSequence p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void updateTile() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
