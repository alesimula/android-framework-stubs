package android.telephony;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class TelephonyFrameworkInitializer {
    static final long ENABLE_CHECKING_TELEPHONY_FEATURES = 330583731L;
    private static volatile java.lang.Boolean sForcePhoneGlobalsCreation;
    private static volatile android.os.TelephonyServiceManager sTelephonyServiceManager;
    private static int sVendorApiLevel;
    private TelephonyFrameworkInitializer() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static android.os.TelephonyServiceManager getTelephonyServiceManager() { return null; }
    private static boolean hasSystemFeature(android.content.Context p0, java.lang.String p1) { return false; }
    public static void registerServiceWrappers() {}
    public static void setTelephonyServiceManager(android.os.TelephonyServiceManager p0) {}
    private static boolean shouldForcePhoneGlobalsCreation(android.content.Context p0) { return false; }
}
