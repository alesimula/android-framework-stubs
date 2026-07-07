package android.graphics.fonts;

public final class SystemFonts {
    private static final java.lang.String DEVICE_FONTS_XML_DIR = "/system/etc/";
    private static final java.lang.String DEVICE_FONT_DIR = "/system/fonts/";
    private static final java.lang.String FONTS_XML = null;
    public static final java.lang.String LEGACY_FONTS_XML = null;
    private static final java.lang.Object LOCK = null;
    public static final java.lang.String OEM_FONT_DIR = "/product/fonts/";
    private static final java.lang.String OEM_XML = "/product/etc/fonts_customization.xml";
    public static final java.lang.String SYSTEM_FONT_DIR = null;
    private static final java.lang.String TAG = "SystemFonts";
    private static java.util.Set<android.graphics.fonts.Font> sAvailableFonts;
    private SystemFonts() {}
    private static void appendNamedFamilyList(android.text.FontConfig.NamedFamilyList p0, android.util.ArrayMap<java.lang.String, java.nio.ByteBuffer> p1, android.util.ArrayMap<java.lang.String, android.graphics.fonts.SystemFonts.NativeFamilyListSet> p2) {}
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> buildSystemFallback(android.text.FontConfig p0) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> buildSystemFallback(android.text.FontConfig p0, android.util.ArrayMap<java.lang.String, java.nio.ByteBuffer> p1) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.Typeface> buildSystemTypefaces(android.text.FontConfig p0, java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> p1) { return null; }
    private static android.graphics.fonts.FontFamily createFontFamily(java.util.List<android.text.FontConfig.Font> p0, java.lang.String p1, int p2, int p3, boolean p4, java.util.Map<java.lang.String, java.nio.ByteBuffer> p5) { return null; }
    public static java.util.Set<android.graphics.fonts.Font> getAvailableFonts() { return null; }
    private static java.lang.String getFontsXmlDir() { return null; }
    private static java.lang.String getFontsXmlDir$ravenwood() { return null; }
    public static android.text.FontConfig getSystemFontConfig(java.util.Map<java.lang.String, java.io.File> p0, long p1, int p2) { return null; }
    public static android.text.FontConfig getSystemFontConfigForTesting(java.lang.String p0, java.util.Map<java.lang.String, java.io.File> p1, long p2, int p3) { return null; }
    static android.text.FontConfig getSystemFontConfigInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map<java.lang.String, java.io.File> p4, long p5, int p6) { return null; }
    private static java.lang.String getSystemFontDir() { return null; }
    private static java.lang.String getSystemFontDir$ravenwood() { return null; }
    public static android.text.FontConfig getSystemPreinstalledFontConfig() { return null; }
    public static android.text.FontConfig getSystemPreinstalledFontConfigFromLegacyXml() { return null; }
    private static java.nio.ByteBuffer mmap(java.lang.String p0) { return null; }
    private static void pushFamilyToFallback(android.text.FontConfig.FontFamily p0, android.util.ArrayMap<java.lang.String, android.graphics.fonts.SystemFonts.NativeFamilyListSet> p1, java.util.Map<java.lang.String, java.nio.ByteBuffer> p2) {}
    public static void resetAvailableFonts() {}
    public static int resolveVarFamilyType(android.text.FontConfig.FontFamily p0, java.lang.String p1) { return 0; }
    private static boolean scriptMatch(android.os.LocaleList p0, java.lang.String p1) { return false; }

    private static final class NativeFamilyListSet {
        public java.lang.String customFallback;
        public java.util.List<android.graphics.fonts.FontFamily> familyList;
        public android.util.SparseIntArray seenXmlFamilies;
        private NativeFamilyListSet() {}
    }
}
