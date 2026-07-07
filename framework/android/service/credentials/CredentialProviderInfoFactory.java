package android.service.credentials;

public final class CredentialProviderInfoFactory {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String TAG = "CredentialManager";
    private static final java.lang.String TAG_CAPABILITIES = "capabilities";
    private static final java.lang.String TAG_CAPABILITY = "capability";
    private static final java.lang.String TAG_CREDENTIAL_PROVIDER = "credential-provider";
    public CredentialProviderInfoFactory() {}
    public static android.credentials.CredentialProviderInfo create(android.content.Context p0, android.content.ComponentName p1, int p2, boolean p3, boolean p4) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.NullPointerException { return null; }
    public static android.credentials.CredentialProviderInfo create(android.content.Context p0, android.content.pm.ServiceInfo p1, boolean p2, boolean p3, boolean p4, boolean p5) throws java.lang.SecurityException, java.lang.NullPointerException { return null; }
    public static android.credentials.CredentialProviderInfo createForTests(android.content.pm.ServiceInfo p0, java.lang.CharSequence p1, boolean p2, boolean p3, java.util.List<java.lang.String> p4) { return null; }
    private static android.credentials.CredentialProviderInfo.Builder extractXmlMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1, android.content.pm.PackageManager p2, android.content.res.Resources p3) { return null; }
    private static java.lang.String getAfsAttributeSafe(android.content.res.TypedArray p0, int p1) { return null; }
    private static java.util.List<android.content.pm.ServiceInfo> getAvailableSystemServiceInfos(android.content.Context p0, int p1, boolean p2) { return null; }
    public static java.util.List<android.credentials.CredentialProviderInfo> getAvailableSystemServices(android.content.Context p0, int p1, boolean p2, java.util.Set<android.content.ComponentName> p3) { return null; }
    public static java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(android.content.Context p0, int p1, int p2, java.util.Set<android.content.ComponentName> p3, java.util.Set<android.content.ComponentName> p4) { return null; }
    public static java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(android.content.Context p0, int p1, int p2, java.util.Set<android.content.ComponentName> p3, java.util.Set<android.content.ComponentName> p4) { return null; }
    private static android.app.admin.PackagePolicy getDeviceManagerPolicy(android.content.Context p0, int p1) { return null; }
    private static android.content.pm.ServiceInfo getServiceInfoOrThrow(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    private static java.util.List<android.credentials.CredentialProviderInfo> getUserProviders(android.content.Context p0, int p1, boolean p2, java.util.Set<android.content.ComponentName> p3, java.util.Set<android.content.ComponentName> p4) { return null; }
    private static boolean isSystemProviderWithValidPermission(android.content.pm.ServiceInfo p0, android.content.Context p1) { return false; }
    private static boolean isValidSystemProvider(android.content.Context p0, android.content.pm.ServiceInfo p1, boolean p2) { return false; }
    private static java.util.List<java.lang.String> parseXmlProviderInnerCapabilities(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static java.util.List<java.lang.String> parseXmlProviderOuterCapabilities(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.credentials.CredentialProviderInfo.Builder populateMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) throws java.lang.NullPointerException { return null; }
    private static void verifyProviderPermission(android.content.pm.ServiceInfo p0) throws java.lang.SecurityException {}

    private static class ProviderGenerator {
        private final android.content.Context mContext = null;
        private final boolean mDisableSystemAppVerificationForTests = false;
        private final android.app.admin.PackagePolicy mPp = null;
        private final int mProviderFilter = 0;
        private final java.util.Map<java.lang.String, android.credentials.CredentialProviderInfo> mServices = null;
        ProviderGenerator(android.content.Context p0, android.app.admin.PackagePolicy p1, boolean p2, int p3) {}
        private void addProvider(android.credentials.CredentialProviderInfo p0) {}
        private boolean isPackageAllowed(boolean p0, java.lang.String p1) { return false; }
        private boolean isProviderAllowedWithFilter(android.credentials.CredentialProviderInfo p0) { return false; }
        public void addSystemProviders(java.util.List<android.credentials.CredentialProviderInfo> p0) {}
        public void addUserProviders(java.util.List<android.credentials.CredentialProviderInfo> p0) {}
        public java.util.List<android.credentials.CredentialProviderInfo> getProviders() { return null; }
    }
}
