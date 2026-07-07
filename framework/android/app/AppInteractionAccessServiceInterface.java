package android.app;

public interface AppInteractionAccessServiceInterface {
    public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1);
    public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3);
    public int getAccessRequestState(java.lang.String p0, int p1, java.lang.String p2, int p3);
    public java.util.List<java.lang.String> getValidAgents(int p0);
    public java.util.List<java.lang.String> getValidTargets(int p0);
    public void onUserStarting(int p0);
    public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1);
    public void revokeSelfAccess(java.lang.String p0);
    public void setAgentAllowlist(java.util.Set<android.content.pm.SignedPackage> p0);
    public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws java.lang.IllegalArgumentException;
}
