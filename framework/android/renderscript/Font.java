package android.renderscript;

@java.lang.Deprecated
public class Font extends android.renderscript.BaseObj {
    private static java.util.Map<java.lang.String, android.renderscript.Font.FontFamily> sFontFamilyMap;
    private static final java.lang.String[] sMonoNames = null;
    private static final java.lang.String[] sSansNames = null;
    private static final java.lang.String[] sSerifNames = null;
    Font(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    private static void addFamilyToMap(android.renderscript.Font.FontFamily p0) {}
    public static android.renderscript.Font create(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.lang.String p2, android.renderscript.Font.Style p3, float p4) { return null; }
    public static android.renderscript.Font createFromAsset(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.lang.String p2, float p3) { return null; }
    public static android.renderscript.Font createFromFile(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.io.File p2, float p3) { return null; }
    public static android.renderscript.Font createFromFile(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.lang.String p2, float p3) { return null; }
    public static android.renderscript.Font createFromResource(android.renderscript.RenderScript p0, android.content.res.Resources p1, int p2, float p3) { return null; }
    static java.lang.String getFontFileName(java.lang.String p0, android.renderscript.Font.Style p1) { return null; }
    private static void initFontFamilyMap() {}

    private static class FontFamily {
        java.lang.String mBoldFileName;
        java.lang.String mBoldItalicFileName;
        java.lang.String mItalicFileName;
        java.lang.String[] mNames;
        java.lang.String mNormalFileName;
        private FontFamily() {}
    }

    public static enum Style {
        BOLD,
        BOLD_ITALIC,
        ITALIC,
        NORMAL;
        private static final android.renderscript.Font.Style[] $VALUES = null;
        private Style() {}
    }
}
