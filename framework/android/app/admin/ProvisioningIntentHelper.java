package android.app.admin;

final class ProvisioningIntentHelper {
    private static final java.util.Map<java.lang.String, java.lang.Class> EXTRAS_TO_CLASS_MAP = null;
    private static final java.lang.String TAG = "ProvisioningIntentHelper";
    private ProvisioningIntentHelper() {}
    private static void addPropertyToBundle(java.lang.String p0, java.util.Properties p1, android.os.Bundle p2) {}
    private static boolean containsRequiredProvisioningExtras(android.os.Bundle p0) { return false; }
    private static android.os.Bundle createBundleFromProperties(java.util.Properties p0) { return null; }
    private static java.util.Map<java.lang.String, java.lang.Class> createExtrasToClassMap() { return null; }
    private static android.content.Intent createProvisioningIntentFromBundle(android.os.Bundle p0) { return null; }
    private static android.content.Intent createProvisioningIntentFromNdefRecord(android.nfc.NdefRecord p0) { return null; }
    public static android.content.Intent createProvisioningIntentFromNfcIntent(android.content.Intent p0) { return null; }
    private static android.os.PersistableBundle deserializeExtrasBundle(java.util.Properties p0, java.lang.String p1) throws java.io.IOException { return null; }
    private static java.util.Set<java.lang.String> getBooleanExtras() { return null; }
    private static java.util.Set<java.lang.String> getComponentNameExtras() { return null; }
    private static android.nfc.NdefRecord getFirstNdefRecord(android.content.Intent p0) { return null; }
    private static java.util.Set<java.lang.String> getIntExtras() { return null; }
    private static java.util.Set<java.lang.String> getLongExtras() { return null; }
    private static java.util.Set<java.lang.String> getPersistableBundleExtras() { return null; }
    private static java.util.Properties loadPropertiesFromPayload(byte[] p0) { return null; }
}
