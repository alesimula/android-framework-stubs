package com.android.internal.pm.parsing;

public class PackageInfoCommonUtils {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "PackageParsing";
    public PackageInfoCommonUtils() {}
    private static void assignFieldsComponentInfoParsedMainComponent(android.content.pm.ComponentInfo p0, com.android.internal.pm.pkg.component.ParsedMainComponent p1) {}
    private static void assignFieldsPackageItemInfoParsedComponent(android.content.pm.PackageItemInfo p0, com.android.internal.pm.pkg.component.ParsedComponent p1) {}
    public static android.content.pm.PackageInfo generate(com.android.server.pm.pkg.AndroidPackage p0, long p1, int p2) { return null; }
    private static android.content.pm.ActivityInfo generateActivityInfo(com.android.internal.pm.pkg.component.ParsedActivity p0, long p1, android.content.pm.ApplicationInfo p2) { return null; }
    private static android.content.pm.ApplicationInfo generateApplicationInfo(com.android.server.pm.pkg.AndroidPackage p0, long p1, int p2) { return null; }
    private static android.content.pm.InstrumentationInfo generateInstrumentationInfo(com.android.internal.pm.pkg.component.ParsedInstrumentation p0, com.android.server.pm.pkg.AndroidPackage p1, long p2, int p3) { return null; }
    private static android.content.pm.PermissionInfo generatePermissionInfo(com.android.internal.pm.pkg.component.ParsedPermission p0, long p1) { return null; }
    private static android.content.pm.ProviderInfo generateProviderInfo(com.android.server.pm.pkg.AndroidPackage p0, com.android.internal.pm.pkg.component.ParsedProvider p1, long p2, android.content.pm.ApplicationInfo p3, int p4) { return null; }
    private static android.content.pm.ServiceInfo generateServiceInfo(com.android.internal.pm.pkg.component.ParsedService p0, long p1, android.content.pm.ApplicationInfo p2) { return null; }
    private static void initForUser(android.content.pm.ApplicationInfo p0, com.android.server.pm.pkg.AndroidPackage p1, int p2) {}
    private static void initForUser(android.content.pm.InstrumentationInfo p0, com.android.server.pm.pkg.AndroidPackage p1, int p2) {}
    private static boolean isMatch(com.android.server.pm.pkg.AndroidPackage p0, boolean p1, long p2) { return false; }
    private static boolean reportIfDebug(boolean p0, long p1) { return false; }
    private static void updateApplicationInfo(android.content.pm.ApplicationInfo p0, long p1) {}
}
