package com.android.internal.pm.pkg.component;

public class AconfigFlags {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "AconfigFlags";
    private static final java.lang.String OVERRIDE_PREFIX = "device_config_overrides/";
    private static final java.lang.String STAGED_PREFIX = "staged/";
    private static final android.util.Singleton<com.android.internal.pm.pkg.component.AconfigFlags> sAconfigFlags = null;
    private final java.util.Map<java.lang.String, android.os.flagging.AconfigPackage> mAconfigPackages = null;
    private final java.util.Map<java.lang.String, java.lang.Boolean> mFlagValues = null;
    private AconfigFlags() {}
    private java.lang.Boolean getFlagValueFromNewStorage(java.lang.String p0) { return null; }
    public static com.android.internal.pm.pkg.component.AconfigFlags getInstance() { return null; }
    private void loadAconfigDefaultValues(byte[] p0) throws java.io.IOException {}
    private void loadServerOverrides() {}
    private static java.lang.String parseFlagPackageAndName(java.lang.String p0, java.lang.String p1) { return null; }
    private static boolean useNewStorage() { return false; }
    public void addFlagValuesForTesting(java.util.Map<java.lang.String, java.lang.Boolean> p0) {}
    public java.lang.Boolean getFlagValue(java.lang.String p0) { return null; }
    public boolean skip(com.android.internal.pm.pkg.parsing.ParsingPackage p0, java.lang.String p1, boolean p2) { return false; }
    public boolean skipCurrentElement(com.android.internal.pm.pkg.parsing.ParsingPackage p0, org.xmlpull.v1.XmlPullParser p1) { return false; }
    public boolean skipCurrentElement(com.android.internal.pm.pkg.parsing.ParsingPackage p0, org.xmlpull.v1.XmlPullParser p1, boolean p2) { return false; }
}
