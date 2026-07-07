package android.graphics.text;

public final class PositionedGlyphs {
    public static final float NO_OVERRIDE = 1.401298464324817e-45f;
    private final java.util.ArrayList<android.graphics.fonts.Font> mFonts = null;
    private final long mLayoutPtr = 0L;
    private final float mXOffset = 0.0f;
    private final float mYOffset = 0.0f;
    public PositionedGlyphs(long p0, float p1, float p2) {}
    private static native float nGetAscent(long p0);
    private static native float nGetDescent(long p0);
    private static native boolean nGetFakeBold(long p0, int p1);
    private static native boolean nGetFakeItalic(long p0, int p1);
    private static native long nGetFont(long p0, int p1);
    private static native int nGetFontCount(long p0);
    private static native int nGetFontId(long p0, int p1);
    private static native long nGetFontRef(long p0, int p1);
    private static native int nGetGlyphCount(long p0);
    private static native int nGetGlyphId(long p0, int p1);
    private static native float nGetItalicOverride(long p0, int p1);
    private static native float nGetTotalAdvance(long p0);
    private static native float nGetWeightOverride(long p0, int p1);
    private static native float nGetX(long p0, int p1);
    private static native float nGetY(long p0, int p1);
    private static native long nReleaseFunc();
    public boolean equals(java.lang.Object p0) { return false; }
    public float getAdvance() { return 0.0f; }
    public float getAscent() { return 0.0f; }
    public float getDescent() { return 0.0f; }
    public boolean getFakeBold(int p0) { return false; }
    public boolean getFakeItalic(int p0) { return false; }
    public android.graphics.fonts.Font getFont(int p0) { return null; }
    public int getGlyphId(int p0) { return 0; }
    public float getGlyphX(int p0) { return 0.0f; }
    public float getGlyphY(int p0) { return 0.0f; }
    public float getItalicOverride(int p0) { return 0.0f; }
    public float getOffsetX() { return 0.0f; }
    public float getOffsetY() { return 0.0f; }
    public float getWeightOverride(int p0) { return 0.0f; }
    public int glyphCount() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
