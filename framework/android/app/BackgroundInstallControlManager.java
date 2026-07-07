package android.app;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public final class BackgroundInstallControlManager {
    private static final java.lang.String TAG = "BackgroundInstallControlManager";
    private static android.content.pm.IBackgroundInstallControlService sService;
    private final android.content.Context mContext = null;
    BackgroundInstallControlManager(android.content.Context p0) {}
    private static android.content.pm.IBackgroundInstallControlService getService() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.PackageInfo> getBackgroundInstalledPackages(long p0) { return null; }
}
