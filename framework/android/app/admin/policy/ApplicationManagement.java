package android.app.admin.policy;

public class ApplicationManagement {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> APP_INSTALL = null;
    public static final int APP_INSTALL_ALLOWED = 1;
    public static final int APP_INSTALL_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> APP_UNINSTALL = null;
    public static final int APP_UNINSTALL_ALLOWED = 1;
    public static final int APP_UNINSTALL_DISALLOWED = 2;
    @android.annotation.SystemApi
    public static final android.app.admin.PolicyIdentifier<java.util.List<android.app.admin.PackageIdentifier>> CONTENT_SAFETY_APPS = null;
    private ApplicationManagement() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppInstallValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppUninstallValue {
    }
}
