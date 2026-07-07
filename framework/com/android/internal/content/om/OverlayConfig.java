package com.android.internal.content.om;

public class OverlayConfig {
    public static final int DEFAULT_PRIORITY = 2147483647;
    public static final java.lang.String PARTITION_ORDER_FILE_PATH = "/product/overlay/partition_order.xml";
    static final java.lang.String TAG = "OverlayConfig";
    private static com.android.internal.content.om.OverlayConfig sInstance;
    private static final java.util.Comparator<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> sStaticOverlayComparator = null;
    private final android.util.ArrayMap<java.lang.String, com.android.internal.content.om.OverlayConfig.Configuration> mConfigurations = null;
    private final boolean mIsDefaultPartitionOrder = false;
    private final java.lang.String mPartitionOrder = null;
    public OverlayConfig(java.io.File p0, java.util.function.Supplier<com.android.internal.content.om.OverlayScanner> p1, com.android.internal.content.om.OverlayConfig.PackageProvider p2) {}
    private static native java.lang.String[] createIdmap(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, boolean p3);
    private static java.lang.String generatePartitionOrderString(java.util.List<com.android.internal.content.om.OverlayConfigParser.OverlayPartition> p0) { return null; }
    private static android.util.ArrayMap<java.lang.Integer, java.util.List<java.lang.String>> getActiveApexes(java.util.List<com.android.internal.content.om.OverlayConfigParser.OverlayPartition> p0) { return null; }
    private static java.util.Map<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> getOverlayPackageInfos(com.android.internal.content.om.OverlayConfig.PackageProvider p0) { return null; }
    private java.util.ArrayList<com.android.internal.content.om.OverlayConfig.Configuration> getSortedOverlays() { return null; }
    public static com.android.internal.content.om.OverlayConfig getSystemInstance() { return null; }
    public static com.android.internal.content.om.OverlayConfig getZygoteInstance() { return null; }
    public static com.android.internal.content.om.OverlayConfig initializeSystemInstance(com.android.internal.content.om.OverlayConfig.PackageProvider p0) { return null; }
    private static boolean parseAndValidatePartitionsOrderXml(java.lang.String p0, java.util.Map<java.lang.String, java.lang.Integer> p1, java.util.List<com.android.internal.content.om.OverlayConfigParser.OverlayPartition> p2) { return false; }
    public static boolean sortPartitions(java.lang.String p0, java.util.List<com.android.internal.content.om.OverlayConfigParser.OverlayPartition> p1) { return false; }
    public java.lang.String[] createImmutableFrameworkIdmapsInZygote() { return null; }
    public void dump(java.io.PrintWriter p0) {}
    public com.android.internal.content.om.OverlayConfig.Configuration getConfiguration(java.lang.String p0) { return null; }
    public java.util.ArrayList<com.android.internal.content.om.OverlayConfig.IdmapInvocation> getImmutableFrameworkOverlayIdmapInvocations() { return null; }
    public java.lang.String getPartitionOrder() { return null; }
    public int getPriority(java.lang.String p0) { return 0; }
    public boolean isDefaultPartitionOrder() { return false; }
    public boolean isEnabled(java.lang.String p0) { return false; }
    public boolean isMutable(java.lang.String p0) { return false; }

    public static final class Configuration {
        public final int configIndex = 0;
        public final com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration parsedConfig = null;
        public Configuration(com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration p0, int p1) {}
    }

    public static class IdmapInvocation {
        public final boolean enforceOverlayable = false;
        public final java.util.ArrayList<java.lang.String> overlayPaths = null;
        public final java.lang.String policy = null;
        IdmapInvocation(boolean p0, java.lang.String p1) {}
        public java.lang.String toString() { return null; }
    }

    public static interface PackageProvider {
        public void forEachPackage(com.android.internal.util.function.TriConsumer<com.android.internal.content.om.OverlayConfig.PackageProvider.Package, java.lang.Boolean, java.io.File> p0);

        public static interface Package {
            public java.lang.String getBaseApkPath();
            public int getOverlayPriority();
            public java.lang.String getOverlayTarget();
            public java.lang.String getPackageName();
            public int getTargetSdkVersion();
            public boolean isOverlayIsStatic();
        }
    }
}
