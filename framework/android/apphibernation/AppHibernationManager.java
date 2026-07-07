package android.apphibernation;

@android.annotation.SystemApi
public class AppHibernationManager {
    private static final java.lang.String TAG = "AppHibernationManager";
    private final android.content.Context mContext = null;
    private final android.apphibernation.IAppHibernationService mIAppHibernationService = null;
    public AppHibernationManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getHibernatingPackagesForUser() { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser() { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser(java.util.Set<java.lang.String> p0) { return null; }
    @android.annotation.SystemApi
    public boolean isHibernatingForUser(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean isHibernatingGlobally(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean isOatArtifactDeletionEnabled() { return false; }
    @android.annotation.SystemApi
    public void setHibernatingForUser(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setHibernatingGlobally(java.lang.String p0, boolean p1) {}
}
