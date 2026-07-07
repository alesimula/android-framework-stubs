package android.content.om;

public class OverlayManager {
    public static final long SELF_TARGETING_OVERLAY = 205919743L;
    private static final long THROW_SECURITY_EXCEPTIONS = 147340954L;
    private final com.android.internal.content.om.OverlayManagerImpl mOverlayManagerImpl = null;
    private final android.content.om.IOverlayManager mService = null;
    public OverlayManager(android.content.Context p0) {}
    public OverlayManager(android.content.Context p0, android.content.om.IOverlayManager p1) {}
    private void commitToSystemServer(android.content.om.OverlayManagerTransaction p0) {}
    private void rethrowSecurityException(java.lang.SecurityException p0) {}
    public void commit(android.content.om.OverlayManagerTransaction p0) {}
    void commitSelfTarget(android.content.om.OverlayManagerTransaction p0) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {}
    public void enableWithConstraints(java.lang.String p0, android.os.UserHandle p1, java.util.List<android.content.om.OverlayConstraint> p2) throws java.lang.SecurityException, java.lang.IllegalStateException {}
    public android.content.om.OverlayInfo getOverlayInfo(android.content.om.OverlayIdentifier p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SystemApi
    public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public void invalidateCachesForOverlay(java.lang.String p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    public void setEnabled(java.lang.String p0, boolean p1, android.os.UserHandle p2) throws java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    public void setEnabledExclusiveInCategory(java.lang.String p0, android.os.UserHandle p1) throws java.lang.SecurityException, java.lang.IllegalStateException {}
}
