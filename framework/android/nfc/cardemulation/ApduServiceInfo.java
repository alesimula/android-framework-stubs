package android.nfc.cardemulation;

@android.annotation.SystemApi
public final class ApduServiceInfo implements android.os.Parcelable {
    private static final java.util.regex.Pattern AID_PATTERN = null;
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.ApduServiceInfo> CREATOR = null;
    private static final java.util.regex.Pattern PLF_PATTERN = null;
    private static final java.util.regex.Pattern PLPF_PATTERN = null;
    @android.annotation.SystemApi
    public static final java.lang.String PROPERTY_WALLET_PREFERRED_BANNER_AND_LABEL = "android.nfc.cardemulation.PROPERTY_WALLET_PREFERRED_BANNER_AND_LABEL";
    private static final java.lang.String TAG = "ApduServiceInfo";
    private final java.util.Map<java.lang.String, java.lang.Boolean> mAutoTransact = null;
    private final java.util.Map<java.util.regex.Pattern, java.lang.Boolean> mAutoTransactPatterns = null;
    private final int mBannerResourceId = 0;
    private boolean mCategoryOtherServiceEnabled;
    private final java.lang.String mDescription = null;
    private final java.util.HashMap<java.lang.String, android.nfc.cardemulation.AidGroup> mDynamicAidGroups = null;
    private final java.lang.Object mLock = null;
    private java.lang.String mOffHostName;
    private final boolean mOnHost = false;
    private boolean mRequiresDeviceScreenOn;
    private boolean mRequiresDeviceUnlock;
    private final android.content.pm.ResolveInfo mService = null;
    private final java.lang.String mSettingsActivityName = null;
    private boolean mShouldDefaultToObserveMode;
    private final java.util.HashMap<java.lang.String, android.nfc.cardemulation.AidGroup> mStaticAidGroups = null;
    private final java.lang.String mStaticOffHostName = null;
    private final int mUid = 0;
    private boolean mWantsRoleHolderPriority;
    public ApduServiceInfo(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1, boolean p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    @android.annotation.SystemApi
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.nfc.cardemulation.AidGroup> p3, java.util.List<android.nfc.cardemulation.AidGroup> p4, boolean p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10) {}
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.nfc.cardemulation.AidGroup> p3, java.util.List<android.nfc.cardemulation.AidGroup> p4, boolean p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, boolean p11) {}
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.nfc.cardemulation.AidGroup> p3, java.util.List<android.nfc.cardemulation.AidGroup> p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, boolean p12) {}
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.nfc.cardemulation.AidGroup> p3, java.util.List<android.nfc.cardemulation.AidGroup> p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, boolean p12, java.util.Map<java.lang.String, java.lang.Boolean> p13, java.util.Map<java.util.regex.Pattern, java.lang.Boolean> p14) {}
    private static boolean isValidAid(java.lang.String p0) { return false; }
    public void addPollingLoopFilter(java.lang.String p0, boolean p1) {}
    public void addPollingLoopPatternFilter(java.lang.String p0, boolean p1) {}
    public int describeContents() { return 0; }
    public void dump(android.os.ParcelFileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.nfc.cardemulation.AidGroup> getAidGroups() { return null; }
    public java.util.List<java.lang.String> getAids() { return null; }
    public java.lang.String getCategoryForAid(java.lang.String p0) { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getDescription() { return null; }
    public android.nfc.cardemulation.AidGroup getDynamicAidGroupForCategory(java.lang.String p0) { return null; }
    public java.lang.String getOffHostSecureElement() { return null; }
    public java.util.List<java.lang.String> getPollingLoopFilters() { return null; }
    public java.util.List<java.util.regex.Pattern> getPollingLoopPatternFilters() { return null; }
    public java.util.List<java.lang.String> getPrefixAids() { return null; }
    public java.lang.String getSettingsActivityName() { return null; }
    public boolean getShouldAutoTransact(java.lang.String p0) { return false; }
    public java.util.List<java.lang.String> getSubsetAids() { return null; }
    public int getUid() { return 0; }
    public boolean hasCategory(java.lang.String p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isCategoryOtherServiceEnabled() { return false; }
    public boolean isOnHost() { return false; }
    public java.lang.CharSequence loadAppLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadBanner(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public boolean removeDynamicAidGroupForCategory(java.lang.String p0) { return false; }
    public void removePollingLoopFilter(java.lang.String p0) {}
    public void removePollingLoopPatternFilter(java.lang.String p0) {}
    public boolean requiresScreenOn() { return false; }
    public boolean requiresUnlock() { return false; }
    public void resetOffHostSecureElement() {}
    public void setCategoryOtherServiceEnabled(boolean p0) {}
    public void setDynamicAidGroup(android.nfc.cardemulation.AidGroup p0) {}
    public void setOffHostSecureElement(java.lang.String p0) {}
    public void setRequiresScreenOn(boolean p0) {}
    public void setRequiresUnlock(boolean p0) {}
    public void setShouldDefaultToObserveMode(boolean p0) {}
    public boolean shouldDefaultToObserveMode() { return false; }
    public java.lang.String toString() { return null; }
    public boolean wantsRoleHolderPriority() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
