package com.android.internal.content.om;

public class OverlayScanner {
    private final java.util.List<android.util.Pair<java.lang.String, java.io.File>> mExcludedOverlayPackages = null;
    private final android.util.ArrayMap<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> mParsedOverlayInfos = null;
    public OverlayScanner() {}
    final java.util.Collection<com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> getAllParsedInfos() { return null; }
    public final com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo getParsedInfo(java.lang.String p0) { return null; }
    final boolean isExcludedOverlayPackage(java.lang.String p0, com.android.internal.content.om.OverlayConfigParser.OverlayPartition p1) { return false; }
    public com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo parseOverlayManifest(java.io.File p0, java.util.List<android.util.Pair<java.lang.String, java.io.File>> p1) { return null; }
    public void scanDir(java.io.File p0) {}

    public static class ParsedOverlayInfo {
        public final boolean isStatic = false;
        public final java.lang.String packageName = null;
        public final java.io.File path = null;
        public final java.io.File preInstalledApexPath = null;
        public final int priority = 0;
        public final java.lang.String targetPackageName = null;
        public final int targetSdkVersion = 0;
        public ParsedOverlayInfo(java.lang.String p0, java.lang.String p1, int p2, boolean p3, int p4, java.io.File p5, java.io.File p6) {}
        public java.io.File getOriginalPartitionPath() { return null; }
        public java.lang.String toString() { return null; }
    }
}
