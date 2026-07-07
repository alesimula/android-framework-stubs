package android.content.pm;

public class PackageItemInfo {
    public static final float DEFAULT_MAX_LABEL_SIZE_PX = 1000.0f;
    public static final int DUMP_FLAG_ALL = 3;
    public static final int DUMP_FLAG_APPLICATION = 2;
    public static final int DUMP_FLAG_DETAILS = 1;
    public static final int MAX_SAFE_LABEL_LENGTH = 1000;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int SAFE_LABEL_FLAG_FIRST_LINE = 4;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int SAFE_LABEL_FLAG_SINGLE_LINE = 2;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int SAFE_LABEL_FLAG_TRIM = 1;
    private static volatile boolean sForceSafeLabels;
    public int banner;
    public int icon;
    public boolean isArchived;
    public int labelRes;
    public int logo;
    public android.os.Bundle metaData;
    public java.lang.String name;
    public java.lang.CharSequence nonLocalizedLabel;
    public java.lang.String packageName;
    public int showUserIcon;
    public PackageItemInfo() {}
    public PackageItemInfo(android.content.pm.PackageItemInfo p0) {}
    protected PackageItemInfo(android.os.Parcel p0) {}
    @android.annotation.SystemApi
    public static void forceSafeLabels() {}
    protected void dumpBack(android.util.Printer p0, java.lang.String p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, int p2) {}
    protected void dumpFront(android.util.Printer p0, java.lang.String p1) {}
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public android.graphics.drawable.Drawable loadBanner(android.content.pm.PackageManager p0) { return null; }
    protected android.graphics.drawable.Drawable loadDefaultBanner(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadDefaultIcon(android.content.pm.PackageManager p0) { return null; }
    protected android.graphics.drawable.Drawable loadDefaultLogo(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadLogo(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.CharSequence loadSafeLabel(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.CharSequence loadSafeLabel(android.content.pm.PackageManager p0, float p1, int p2) { return null; }
    public android.graphics.drawable.Drawable loadUnbadgedIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadUnsafeLabel(android.content.pm.PackageManager p0) { return null; }
    public android.content.res.XmlResourceParser loadXmlMetaData(android.content.pm.PackageManager p0, java.lang.String p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class DisplayNameComparator implements java.util.Comparator<android.content.pm.PackageItemInfo> {
        private final android.content.pm.PackageManager mPM = null;
        private final java.text.Collator sCollator = null;
        public DisplayNameComparator(android.content.pm.PackageManager p0) {}
        public final int compare(android.content.pm.PackageItemInfo p0, android.content.pm.PackageItemInfo p1) { return 0; }
    }
}
