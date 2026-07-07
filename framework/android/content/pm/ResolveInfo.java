package android.content.pm;

public class ResolveInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ResolveInfo> CREATOR = null;
    private static final java.lang.String INTENT_FORWARDER_ACTIVITY = "com.android.internal.app.IntentForwarderActivity";
    private static final java.lang.String TAG = "ResolveInfo";
    public android.content.pm.ActivityInfo activityInfo;
    public android.content.pm.AuxiliaryResolveInfo auxiliaryInfo;
    public android.content.IntentFilter filter;
    @android.annotation.SystemApi
    public boolean handleAllWebDataURI;
    public int icon;
    public int iconResourceId;
    public boolean isDefault;
    public boolean isInstantAppAvailable;
    public int labelRes;
    private final boolean mAutoResolutionAllowed = false;
    public int match;
    public boolean noResourceId;
    public java.lang.CharSequence nonLocalizedLabel;
    public int preferredOrder;
    public int priority;
    public android.content.pm.ProviderInfo providerInfo;
    public java.lang.String resolvePackageName;
    public android.content.pm.ServiceInfo serviceInfo;
    public int specificIndex;
    public boolean system;
    public int targetUserId;
    public android.os.UserHandle userHandle;
    public ResolveInfo() {}
    public ResolveInfo(android.content.pm.ResolveInfo p0) {}
    private ResolveInfo(android.os.Parcel p0) {}
    public ResolveInfo(boolean p0) {}
    public int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public android.content.pm.ComponentInfo getComponentInfo() { return null; }
    public final int getIconResource() { return 0; }
    final int getIconResourceInternal() { return 0; }
    public boolean isAutoResolutionAllowed() { return false; }
    public boolean isCrossProfileIntentForwarderActivity() { return false; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public int resolveIconResId() { return 0; }
    public int resolveLabelResId() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class DisplayNameComparator implements java.util.Comparator<android.content.pm.ResolveInfo> {
        private final java.text.Collator mCollator = null;
        private final android.content.pm.PackageManager mPM = null;
        public DisplayNameComparator(android.content.pm.PackageManager p0) {}
        public final int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    }
}
