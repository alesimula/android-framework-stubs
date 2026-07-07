package android.hardware.biometrics;

public class ParentalControlsUtilsInternal {
    private static final java.lang.String TEST_ALWAYS_REQUIRE_CONSENT_CLASS = "android.hardware.biometrics.ParentalControlsUtilsInternal.require_consent_class";
    private static final java.lang.String TEST_ALWAYS_REQUIRE_CONSENT_PACKAGE = "android.hardware.biometrics.ParentalControlsUtilsInternal.require_consent_package";
    public ParentalControlsUtilsInternal() {}
    private static boolean containsFlag(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public static android.content.ComponentName getSupervisionComponentName(android.app.admin.DevicePolicyManager p0, android.os.UserHandle p1) { return null; }
    public static android.content.ComponentName getTestComponentName(android.content.Context p0, int p1) { return null; }
    public static boolean parentConsentRequired(android.app.admin.DevicePolicyManager p0, android.app.supervision.SupervisionManager p1, int p2, android.os.UserHandle p3) { return false; }
    public static boolean parentConsentRequired(android.content.Context p0, android.app.admin.DevicePolicyManager p1, android.app.supervision.SupervisionManager p2, int p3, android.os.UserHandle p4) { return false; }
}
