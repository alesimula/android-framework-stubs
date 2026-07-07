package android.content.pm;

public class ComponentInfo extends android.content.pm.PackageItemInfo {
    private static final int FLAG_DIRECT_BOOT_AWARE = 4;
    private static final int FLAG_ENABLED = 1;
    private static final int FLAG_EXPORTED = 2;
    private static final int FLAG_INHERIT_BANNER = 1024;
    private static final int FLAG_INHERIT_ICON = 256;
    private static final int FLAG_INHERIT_LABEL = 128;
    private static final int FLAG_INHERIT_LOGO = 512;
    private static final int FLAG_INHERIT_META_DATA = 64;
    private static final int FLAG_INHERIT_PACKAGE_NAME = 16;
    private static final int FLAG_INHERIT_PROCESS_NAME = 32;
    private static final int FLAG_IS_ARCHIVED = 8;
    public static final int MAX_SAFE_DESCRIPTION_LENGTH = 1024;
    public android.content.pm.ApplicationInfo applicationInfo;
    public java.lang.String[] attributionTags;
    public int descriptionRes;
    public boolean directBootAware;
    public boolean enabled;
    public boolean exported;
    public java.lang.String processName;
    public java.lang.String splitName;
    public ComponentInfo() { super(); }
    public ComponentInfo(android.content.pm.ComponentInfo p0) { super(); }
    protected ComponentInfo(android.os.Parcel p0) { super(); }
    protected void dumpBack(android.util.Printer p0, java.lang.String p1) {}
    void dumpBack(android.util.Printer p0, java.lang.String p1, int p2) {}
    protected void dumpFront(android.util.Printer p0, java.lang.String p1) {}
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public final int getBannerResource() { return 0; }
    public android.content.ComponentName getComponentName() { return null; }
    public final int getIconResource() { return 0; }
    public final int getLogoResource() { return 0; }
    public final int getUid() { return 0; }
    public boolean isEnabled() { return false; }
    protected android.graphics.drawable.Drawable loadDefaultBanner(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadDefaultIcon(android.content.pm.PackageManager p0) { return null; }
    protected android.graphics.drawable.Drawable loadDefaultLogo(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadUnsafeLabel(android.content.pm.PackageManager p0) { return null; }
    public boolean shouldRunInPccSandbox() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
