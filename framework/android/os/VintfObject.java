package android.os;

public class VintfObject {
    private static final java.lang.String LOG_TAG = "VintfObject";
    private VintfObject() {}
    public static native java.lang.String[] getHalNamesAndVersions();
    public static native java.lang.String getPlatformSepolicyVersion();
    public static native java.lang.String getSepolicyVersion();
    public static native java.lang.Long getTargetFrameworkCompatibilityMatrixVersion();
    public static native java.util.Map<java.lang.String, java.lang.String[]> getVndkSnapshots();
    public static native java.lang.String[] report();
    private static java.lang.String runShellCommand(java.lang.String p0) throws java.io.IOException { return null; }
    public static native int verifyBuildAtBoot();
}
