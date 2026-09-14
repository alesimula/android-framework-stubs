package android.app;

public interface AppInteractionAccessServiceInterface {
    public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1);
    public int checkAccess(java.lang.String p0, java.lang.String p1, int p2);
    public android.content.IntentSender createRequestAccessIntentSender(java.lang.String p0, java.lang.String[] p1, int p2, int p3, java.util.concurrent.Executor p4, java.util.function.Consumer<int[]> p5);
    public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3);
    public android.app.AppInteractionAccessInfo getAccessInfo(java.lang.String p0, java.lang.String p1, int p2);
    public java.util.Map<java.lang.String, java.lang.Integer> getInteractorAccessFlags(java.lang.String p0, int p1);
    public java.util.List<java.lang.String> getInteractorPackageNames(int p0);
    public java.util.Map<java.lang.String, java.lang.Integer> getTargetAccessFlags(java.lang.String p0, int p1);
    public void onUserStarting(int p0);
    public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1);
    public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws java.lang.IllegalArgumentException;
}
