package android.webkit;

public class UserPackage {
    public static final int MINIMUM_SUPPORTED_SDK = 33;
    private final android.content.pm.PackageInfo mPackageInfo = null;
    private final android.os.UserHandle mUser = null;
    public UserPackage(android.os.UserHandle p0, android.content.pm.PackageInfo p1) {}
    public static java.util.List<android.webkit.UserPackage> getPackageInfosAllUsers(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    public static boolean hasCorrectTargetSdkVersion(android.content.pm.PackageInfo p0) { return false; }
    public android.content.pm.PackageInfo getPackageInfo() { return null; }
    public android.os.UserHandle getUser() { return null; }
    public boolean isEnabledPackage() { return false; }
    public boolean isInstalledPackage() { return false; }
}
