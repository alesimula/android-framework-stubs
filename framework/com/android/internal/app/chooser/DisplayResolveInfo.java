package com.android.internal.app.chooser;

public class DisplayResolveInfo implements com.android.internal.app.chooser.TargetInfo, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.app.chooser.DisplayResolveInfo> CREATOR = null;
    private android.graphics.drawable.Drawable mDisplayIcon;
    private java.lang.CharSequence mDisplayLabel;
    private java.lang.CharSequence mExtendedInfo;
    private boolean mIsSuspended;
    private boolean mPinned;
    private boolean mPreferredActivity;
    private final android.content.pm.ResolveInfo mResolveInfo = null;
    private com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter mResolveInfoPresentationGetter;
    private final android.content.Intent mResolvedIntent = null;
    private final java.util.List<android.content.Intent> mSourceIntents = null;
    public DisplayResolveInfo(android.content.Intent p0, android.content.pm.ResolveInfo p1, android.content.Intent p2, com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter p3) {}
    public DisplayResolveInfo(android.content.Intent p0, android.content.pm.ResolveInfo p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.content.Intent p4, com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter p5) {}
    private DisplayResolveInfo(android.os.Parcel p0) {}
    DisplayResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
    private DisplayResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0, android.content.Intent p1, int p2, com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter p3) {}
    public void addAlternateSourceIntent(android.content.Intent p0) {}
    public com.android.internal.app.chooser.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
    public int describeContents() { return 0; }
    public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    public java.lang.CharSequence getDisplayLabel() { return null; }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public android.content.ComponentName getResolvedComponentName() { return null; }
    public android.content.Intent getResolvedIntent() { return null; }
    public boolean hasDisplayIcon() { return false; }
    public boolean hasDisplayLabel() { return false; }
    public boolean isPinned() { return false; }
    public boolean isPreferredActivity() { return false; }
    public boolean isSuspended() { return false; }
    public void setDisplayIcon(android.graphics.drawable.Drawable p0) {}
    public void setDisplayLabel(java.lang.CharSequence p0) {}
    public void setExtendedInfo(java.lang.CharSequence p0) {}
    public void setPinned(boolean p0) {}
    public void setPreferredActivity(boolean p0) {}
    public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
    public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
