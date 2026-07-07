package android.service.autofill;

public final class AutofillServiceInfo {
    private static final android.content.ComponentName CREDMAN_SERVICE_COMPONENT_NAME = null;
    private static final java.lang.String TAG = "AutofillServiceInfo";
    private static final java.lang.String TAG_AUTOFILL_SERVICE = "autofill-service";
    private static final java.lang.String TAG_COMPATIBILITY_PACKAGE = "compatibility-package";
    private final android.util.ArrayMap<java.lang.String, java.lang.Long> mCompatibilityPackages = null;
    private final boolean mInlineSuggestionsEnabled = false;
    private final java.lang.String mPasswordsActivity = null;
    private final android.content.pm.ServiceInfo mServiceInfo = null;
    private final java.lang.String mSettingsActivity = null;
    public AutofillServiceInfo(android.content.Context p0, android.content.ComponentName p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException {}
    public AutofillServiceInfo(android.content.Context p0, android.content.pm.ServiceInfo p1) {}
    private AutofillServiceInfo(java.lang.String p0) {}
    public static java.util.List<android.service.autofill.AutofillServiceInfo> getAvailableServices(android.content.Context p0, int p1) { return null; }
    private static android.content.pm.ServiceInfo getServiceInfoOrThrow(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    private static boolean isCredentialManagerAutofillService(android.content.Context p0, android.content.ComponentName p1) { return false; }
    private android.util.ArrayMap<java.lang.String, java.lang.Long> parseCompatibilityPackages(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public android.util.ArrayMap<java.lang.String, java.lang.Long> getCompatibilityPackages() { return null; }
    public java.lang.String getPasswordsActivity() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public boolean isInlineSuggestionsEnabled() { return false; }
    public java.lang.String toString() { return null; }

    public static final class TestDataBuilder {
        private java.lang.String mPasswordsActivity;
        public TestDataBuilder() {}
        public android.service.autofill.AutofillServiceInfo build() { return null; }
        public android.service.autofill.AutofillServiceInfo.TestDataBuilder setPasswordsActivity(java.lang.String p0) { return null; }
    }
}
