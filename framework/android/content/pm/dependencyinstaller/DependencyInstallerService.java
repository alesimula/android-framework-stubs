package android.content.pm.dependencyinstaller;

@android.annotation.SystemApi
@java.lang.Deprecated
public abstract class DependencyInstallerService extends android.app.Service {
    private android.content.pm.dependencyinstaller.IDependencyInstallerService mBinder;
    public DependencyInstallerService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDependenciesRequired(java.util.List<android.content.pm.SharedLibraryInfo> p0, android.content.pm.dependencyinstaller.DependencyInstallerCallback p1);
}
