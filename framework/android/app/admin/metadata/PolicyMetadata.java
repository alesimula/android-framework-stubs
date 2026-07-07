package android.app.admin.metadata;

public abstract class PolicyMetadata<T extends java.lang.Object> {
    private final int mAffectedResource = 0;
    private final java.util.Set<java.lang.Integer> mAllowedDpcTypes = null;
    private final java.util.Set<java.lang.Integer> mAllowedScopes = null;
    private final java.lang.String mFeatureFlag = null;
    private final android.app.admin.PolicyIdentifier<T> mId = null;
    private final java.lang.String mRequiredCrossUserPermission = null;
    private final java.lang.String mRequiredPermission = null;
    private final android.app.admin.metadata.ResolutionMechanismMetadata<T> mResolutionMechanism = null;
    public PolicyMetadata(android.app.admin.PolicyIdentifier<T> p0, java.util.Set<java.lang.Integer> p1, int p2, java.lang.String p3, java.lang.String p4, java.util.Set<java.lang.Integer> p5, java.lang.String p6, android.app.admin.metadata.ResolutionMechanismMetadata<T> p7) {}
    public int getAffectedResource() { return 0; }
    public java.util.Set<java.lang.Integer> getAllowedDpcTypes() { return null; }
    public java.util.Set<java.lang.Integer> getAllowedScopes() { return null; }
    public java.lang.String getFeatureFlag() { return null; }
    public android.app.admin.PolicyIdentifier<T> getId() { return null; }
    public java.lang.String getRequiredCrossUserPermission() { return null; }
    public java.lang.String getRequiredPermission() { return null; }
    public android.app.admin.metadata.ResolutionMechanismMetadata<T> getResolutionMechanism() { return null; }
    protected java.lang.String toAttributes() { return null; }
    public java.lang.String toString() { return null; }
}
