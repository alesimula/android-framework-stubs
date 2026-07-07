package android.graphics.fonts;

public final class FontFamily {
    private static final java.lang.String TAG = "FontFamily";
    private final long mNativePtr = 0L;
    public FontFamily(long p0) {}
    private static native long nGetFont(long p0, int p1);
    private static native int nGetFontSize(long p0);
    private static native java.lang.String nGetLangTags(long p0);
    private static native int nGetVariant(long p0);
    public android.graphics.fonts.Font getFont(int p0) { return null; }
    public java.lang.String getLangTags() { return null; }
    public long getNativePtr() { return 0L; }
    public int getSize() { return 0; }
    public int getVariant() { return 0; }

    public static final class Builder {
        private static final int TAG_ital = 1769234796;
        private static final int TAG_wght = 2003265652;
        public static final int VARIABLE_FONT_FAMILY_TYPE_NONE = 0;
        public static final int VARIABLE_FONT_FAMILY_TYPE_SINGLE_FONT_WGHT_ITAL = 2;
        public static final int VARIABLE_FONT_FAMILY_TYPE_SINGLE_FONT_WGHT_ONLY = 1;
        public static final int VARIABLE_FONT_FAMILY_TYPE_TWO_FONTS_WGHT = 3;
        public static final int VARIABLE_FONT_FAMILY_TYPE_UNKNOWN = -1;
        private final java.util.ArrayList<android.graphics.fonts.Font> mFonts = null;
        private final android.util.SparseIntArray mStyles = null;
        public Builder(android.graphics.fonts.Font p0) {}
        public static int analyzeAndResolveVariableType(java.util.ArrayList<android.graphics.fonts.Font> p0) { return 0; }
        private static int makeStyleIdentifier(android.graphics.fonts.Font p0) { return 0; }
        private static native void nAddFont(long p0, long p1);
        private static native long nBuild(long p0, java.lang.String p1, int p2, boolean p3, boolean p4, int p5);
        private static native long nGetReleaseNativeFamily();
        private static native long nInitBuilder();
        public android.graphics.fonts.FontFamily.Builder addFont(android.graphics.fonts.Font p0) { return null; }
        public android.graphics.fonts.FontFamily build() { return null; }
        public android.graphics.fonts.FontFamily build(java.lang.String p0, int p1, boolean p2, boolean p3, int p4) { return null; }
        public android.graphics.fonts.FontFamily buildVariableFamily() { return null; }

        private static class NoImagePreloadHolder {
            private NoImagePreloadHolder() {}
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface VariableFontFamilyType {
        }
    }
}
