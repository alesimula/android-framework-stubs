package com.android.internal.content.om;

public final class OverlayConfigParser {
    private static final java.lang.String CONFIG_DEFAULT_FILENAME = "config/config.xml";
    private static final java.lang.String CONFIG_DIRECTORY = "config";
    static final boolean DEFAULT_ENABLED_STATE = false;
    static final boolean DEFAULT_MUTABILITY = true;
    private static final int MAXIMUM_MERGE_DEPTH = 5;
    public OverlayConfigParser() {}
    private static java.lang.String currentParserContextToString(org.xmlpull.v1.XmlPullParser p0) { return null; }
    public static java.lang.String expandProperty(java.lang.String p0, com.android.internal.content.om.OverlayConfigParser.SysPropWrapper p1) { return null; }
    static java.util.ArrayList<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> getConfigurations(com.android.internal.content.om.OverlayConfigParser.OverlayPartition p0, com.android.internal.content.om.OverlayScanner p1, java.util.Map<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> p2, java.util.List<java.lang.String> p3) { return null; }
    private static void parseMerge(java.io.File p0, org.xmlpull.v1.XmlPullParser p1, com.android.internal.content.om.OverlayScanner p2, java.util.Map<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> p3, com.android.internal.content.om.OverlayConfigParser.ParsingContext p4) {}
    private static void parseOverlay(java.io.File p0, org.xmlpull.v1.XmlPullParser p1, com.android.internal.content.om.OverlayScanner p2, java.util.Map<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> p3, com.android.internal.content.om.OverlayConfigParser.ParsingContext p4) {}
    private static void readConfigFile(java.io.File p0, com.android.internal.content.om.OverlayScanner p1, java.util.Map<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> p2, com.android.internal.content.om.OverlayConfigParser.ParsingContext p3) {}

    public static class OverlayPartition extends android.content.pm.PackagePartitions.SystemPartition {
        static final java.lang.String POLICY_ODM = "odm";
        static final java.lang.String POLICY_OEM = "oem";
        static final java.lang.String POLICY_PRODUCT = "product";
        static final java.lang.String POLICY_PUBLIC = "public";
        static final java.lang.String POLICY_SYSTEM = "system";
        static final java.lang.String POLICY_VENDOR = "vendor";
        public final java.lang.String policy = null;
        public OverlayPartition(android.content.pm.PackagePartitions.SystemPartition p0) { super((android.content.pm.PackagePartitions.SystemPartition)null); }
        OverlayPartition(java.io.File p0, android.content.pm.PackagePartitions.SystemPartition p1) { super((android.content.pm.PackagePartitions.SystemPartition)null); }
        private static java.lang.String policyForPartition(android.content.pm.PackagePartitions.SystemPartition p0) { return null; }
    }

    public static class ParsedConfigFile {
        public final int line = 0;
        public final java.lang.String path = null;
        public final java.lang.String xml = null;
        ParsedConfigFile(java.lang.String p0, int p1, java.lang.String p2) {}
        public java.lang.String toString() { return null; }
    }

    public static class ParsedConfiguration {
        public final boolean enabled = false;
        public final boolean mutable = false;
        public final java.lang.String packageName = null;
        public final com.android.internal.content.om.OverlayConfigParser.ParsedConfigFile parsedConfigFile = null;
        public final com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo parsedInfo = null;
        public final java.lang.String policy = null;
        ParsedConfiguration(java.lang.String p0, boolean p1, boolean p2, java.lang.String p3, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo p4, com.android.internal.content.om.OverlayConfigParser.ParsedConfigFile p5) {}
        public java.lang.String toString() { return null; }
    }

    private static class ParsingContext {
        private final android.util.ArraySet<java.lang.String> mConfiguredOverlays = null;
        private boolean mFoundMutableOverlay;
        private int mMergeDepth;
        private final java.util.ArrayList<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> mOrderedConfigurations = null;
        private final com.android.internal.content.om.OverlayConfigParser.OverlayPartition mPartition = null;
        private ParsingContext(com.android.internal.content.om.OverlayConfigParser.OverlayPartition p0) {}
    }

    @java.lang.FunctionalInterface
    public static interface SysPropWrapper {
        public java.lang.String get(java.lang.String p0);
    }
}
