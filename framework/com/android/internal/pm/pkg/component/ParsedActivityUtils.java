package com.android.internal.pm.pkg.component;

public class ParsedActivityUtils {
    public static final boolean LOG_UNSAFE_BROADCASTS = false;
    public static final int RECREATE_ON_CONFIG_CHANGES_MASK = Integer.valueOf(0);
    public static final java.util.Set<java.lang.String> SAFE_BROADCASTS = null;
    private static final java.lang.String TAG = "PackageParsing";
    public ParsedActivityUtils() {}
    public static int getActivityConfigChanges(int p0, int p1) { return 0; }
    private static int getActivityResizeMode(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.TypedArray p1, int p2) { return 0; }
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedActivity> parseActivityAlias(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, boolean p3, java.lang.String p4, android.content.pm.parsing.result.ParseInput p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedActivity> parseActivityOrAlias(com.android.internal.pm.pkg.component.ParsedActivityImpl p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, java.lang.String p2, android.content.res.XmlResourceParser p3, android.content.res.Resources p4, android.content.res.TypedArray p5, boolean p6, boolean p7, boolean p8, android.content.pm.parsing.result.ParseInput p9, int p10, int p11, int p12) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedActivity> parseActivityOrReceiver(java.lang.String[] p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4, boolean p5, java.lang.String p6, android.content.pm.parsing.result.ParseInput p7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.content.pm.ActivityInfo.WindowLayout> parseActivityWindowLayout(android.content.res.Resources p0, android.util.AttributeSet p1, android.content.pm.parsing.result.ParseInput p2) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedIntentInfoImpl> parseIntentFilter(com.android.internal.pm.pkg.parsing.ParsingPackage p0, com.android.internal.pm.pkg.component.ParsedActivityImpl p1, boolean p2, boolean p3, android.content.res.Resources p4, android.content.res.XmlResourceParser p5, android.content.pm.parsing.result.ParseInput p6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.content.pm.ActivityInfo.WindowLayout> resolveActivityWindowLayout(com.android.internal.pm.pkg.component.ParsedActivity p0, android.content.pm.parsing.result.ParseInput p1) { return null; }
    public static boolean shouldSkipActivityRecreationOnConfigChange() { return false; }
}
