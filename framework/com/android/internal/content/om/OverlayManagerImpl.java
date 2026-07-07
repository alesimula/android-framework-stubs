package com.android.internal.content.om;

public class OverlayManagerImpl {
    private static final boolean DEBUG = false;
    private static final java.lang.String FRRO_EXTENSION = ".frro";
    private static final java.lang.String IDMAP_EXTENSION = ".idmap";
    public static final java.lang.String SELF_TARGET = ".self_target";
    private static final java.lang.String TAG = "OverlayManagerImpl";
    private java.nio.file.Path mBasePath;
    private final android.content.Context mContext = null;
    public OverlayManagerImpl(android.content.Context p0) {}
    public static java.lang.String checkOverlayNameValid(java.lang.String p0) { return null; }
    private void checkPackageName(java.lang.String p0) {}
    private static void cleanExpiredOverlays(java.nio.file.Path p0, java.nio.file.Path p1) {}
    private static native void createFrroFile(java.lang.String p0, android.os.FabricatedOverlayInternal p1) throws java.io.IOException;
    private static native void createIdmapFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9) throws java.io.IOException;
    private static native android.os.FabricatedOverlayInfo getFabricatedOverlayInfo(java.lang.String p0) throws java.io.IOException;
    private boolean isSameWithTargetSignature(java.lang.String p0) { return false; }
    public void commit(android.content.om.OverlayManagerTransaction p0) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {}
    public void ensureBaseDir() {}
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0) { return null; }
    public void registerFabricatedOverlay(android.os.FabricatedOverlayInternal p0) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {}
    public void unregisterFabricatedOverlay(java.lang.String p0) {}
}
