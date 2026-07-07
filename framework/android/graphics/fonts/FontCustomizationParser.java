package android.graphics.fonts;

public class FontCustomizationParser {
    private static final java.lang.String TAG = "FontCustomizationParser";
    public FontCustomizationParser() {}
    public static android.graphics.fonts.FontCustomizationParser.Result parse(java.io.InputStream p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.graphics.fonts.FontCustomizationParser.Result readFamilies(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static void readFamily(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.List<android.text.FontConfig.NamedFamilyList> p2, java.util.List<android.text.FontConfig.Customization.LocaleFallback> p3, java.util.Map<java.lang.String, java.io.File> p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private static void readFamilyList(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.List<android.text.FontConfig.NamedFamilyList> p2, java.util.Map<java.lang.String, java.io.File> p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private static android.graphics.fonts.FontCustomizationParser.Result validateAndTransformToResult(java.util.List<android.text.FontConfig.NamedFamilyList> p0, java.util.List<android.text.FontConfig.Customization.LocaleFallback> p1, java.util.List<android.text.FontConfig.Alias> p2) { return null; }

    public static class Result {
        private final java.util.List<android.text.FontConfig.Alias> mAdditionalAliases = null;
        private final java.util.Map<java.lang.String, android.text.FontConfig.NamedFamilyList> mAdditionalNamedFamilies = null;
        private final java.util.List<android.text.FontConfig.Customization.LocaleFallback> mLocaleFamilyCustomizations = null;
        public Result() {}
        public Result(java.util.Map<java.lang.String, android.text.FontConfig.NamedFamilyList> p0, java.util.List<android.text.FontConfig.Customization.LocaleFallback> p1, java.util.List<android.text.FontConfig.Alias> p2) {}
        public java.util.List<android.text.FontConfig.Alias> getAdditionalAliases() { return null; }
        public java.util.Map<java.lang.String, android.text.FontConfig.NamedFamilyList> getAdditionalNamedFamilies() { return null; }
        public java.util.List<android.text.FontConfig.Customization.LocaleFallback> getLocaleFamilyCustomizations() { return null; }
    }
}
