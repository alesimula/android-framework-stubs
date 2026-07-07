package android.graphics;

public class Paint {
    public static final int ANTI_ALIAS_FLAG = 1;
    public static final int AUTO_HINTING_TEXT_FLAG = 2048;
    public static final int BIDI_DEFAULT_LTR = 2;
    public static final int BIDI_DEFAULT_RTL = 3;
    private static final int BIDI_FLAG_MASK = 7;
    public static final int BIDI_FORCE_LTR = 4;
    public static final int BIDI_FORCE_RTL = 5;
    public static final int BIDI_LTR = 0;
    private static final int BIDI_MAX_FLAG_VALUE = 5;
    public static final int BIDI_RTL = 1;
    public static final int CURSOR_AFTER = 0;
    public static final int CURSOR_AT = 4;
    public static final int CURSOR_AT_OR_AFTER = 1;
    public static final int CURSOR_AT_OR_BEFORE = 3;
    public static final int CURSOR_BEFORE = 2;
    private static final int CURSOR_OPT_MAX_VALUE = 4;
    public static final long DEPRECATE_UI_FONT = 279646685L;
    public static final long DEPRECATE_UI_FONT_ENFORCE = 349519475L;
    public static final int DEV_KERN_TEXT_FLAG = 256;
    public static final int DIRECTION_LTR = 0;
    public static final int DIRECTION_RTL = 1;
    public static final int DITHER_FLAG = 4;
    private static final int ELEGANT_TEXT_HEIGHT_DISABLED = 1;
    private static final int ELEGANT_TEXT_HEIGHT_ENABLED = 0;
    private static final int ELEGANT_TEXT_HEIGHT_UNSET = -1;
    public static final int EMBEDDED_BITMAP_TEXT_FLAG = 1024;
    public static final int END_HYPHEN_EDIT_INSERT_ARMENIAN_HYPHEN = 3;
    public static final int END_HYPHEN_EDIT_INSERT_HYPHEN = 2;
    public static final int END_HYPHEN_EDIT_INSERT_MAQAF = 4;
    public static final int END_HYPHEN_EDIT_INSERT_UCAS_HYPHEN = 5;
    public static final int END_HYPHEN_EDIT_INSERT_ZWJ_AND_HYPHEN = 6;
    public static final int END_HYPHEN_EDIT_NO_EDIT = 0;
    public static final int END_HYPHEN_EDIT_REPLACE_WITH_HYPHEN = 1;
    public static final int FAKE_BOLD_TEXT_FLAG = 32;
    public static final int FILTER_BITMAP_FLAG = 2;
    static final int HIDDEN_DEFAULT_PAINT_FLAGS = 1282;
    public static final int HINTING_OFF = 0;
    public static final int HINTING_ON = 1;
    public static final int LCD_RENDER_TEXT_FLAG = 512;
    public static final int LINEAR_TEXT_FLAG = 64;
    public static final int START_HYPHEN_EDIT_INSERT_HYPHEN = 1;
    public static final int START_HYPHEN_EDIT_INSERT_ZWJ = 2;
    public static final int START_HYPHEN_EDIT_NO_EDIT = 0;
    public static final int STRIKE_THRU_TEXT_FLAG = 16;
    public static final int SUBPIXEL_TEXT_FLAG = 128;
    private static final java.lang.String TAG = "Paint";
    public static final int TEXT_RUN_FLAG_LEFT_EDGE = 8192;
    public static final int TEXT_RUN_FLAG_RIGHT_EDGE = 16384;
    public static final int UNDERLINE_TEXT_FLAG = 8;
    public static final int VERTICAL_TEXT_FLAG = 4096;
    private static final java.lang.Object sCacheLock = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> sMinikinLocaleListIdCache = null;
    public int mBidiFlags;
    private long mColor;
    private android.graphics.ColorFilter mColorFilter;
    private float mCompatScaling;
    private java.lang.String mFontFeatureSettings;
    private java.lang.String mFontVariationOverride;
    private java.lang.String mFontVariationSettings;
    private boolean mHasCompatScaling;
    private float mInvCompatScaling;
    private android.os.LocaleList mLocales;
    private android.graphics.MaskFilter mMaskFilter;
    private long mNativeColorFilter;
    private long mNativePaint;
    private long mNativeShader;
    private long mNativeXfermode;
    private android.graphics.PathEffect mPathEffect;
    private android.graphics.Shader mShader;
    private long mShadowLayerColor;
    private float mShadowLayerDx;
    private float mShadowLayerDy;
    private float mShadowLayerRadius;
    private android.graphics.Typeface mTypeface;
    private android.graphics.Xfermode mXfermode;
    public Paint() {}
    public Paint(int p0) {}
    public Paint(android.graphics.Paint p0) {}
    private android.graphics.Xfermode installXfermode(android.graphics.Xfermode p0) { return null; }
    private static native void nAddFontVariationToBuilder(long p0, int p1, float p2);
    private static native float nAscent(long p0);
    private static native int nBreakText(long p0, java.lang.String p1, boolean p2, float p3, int p4, float[] p5);
    private static native int nBreakText(long p0, char[] p1, int p2, int p3, float p4, int p5, float[] p6);
    private static native long nCreateFontVariationBuilder(int p0);
    private static native float nDescent(long p0);
    private static native boolean nEqualsForTextMeasurement(long p0, long p1);
    private static native void nGetCharArrayBounds(long p0, char[] p1, int p2, int p3, int p4, android.graphics.Rect p5);
    private static native int nGetElegantTextHeight(long p0);
    private static native int nGetEndHyphenEdit(long p0);
    private static native boolean nGetFillPath(long p0, long p1, long p2);
    private static native int nGetFlags(long p0);
    private static native float nGetFontMetrics(long p0, android.graphics.Paint.FontMetrics p1, boolean p2);
    private static native int nGetFontMetricsInt(long p0, android.graphics.Paint.FontMetricsInt p1, boolean p2);
    private static native void nGetFontMetricsIntForText(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, boolean p6, android.graphics.Paint.FontMetricsInt p7);
    private static native void nGetFontMetricsIntForText(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, android.graphics.Paint.FontMetricsInt p7);
    private static native int nGetHinting(long p0);
    private static native float nGetLetterSpacing(long p0);
    private static native long nGetNativeFinalizer();
    private static native int nGetOffsetForAdvance(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, float p7);
    private static native float nGetRunAdvance(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, int p7);
    private static native float nGetRunCharacterAdvance(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, int p7, float[] p8, int p9, android.graphics.RectF p10);
    private static native float nGetRunCharacterAdvance(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, int p7, float[] p8, int p9, android.graphics.RectF p10, android.graphics.Paint.RunInfo p11);
    private static native int nGetStartHyphenEdit(long p0);
    private static native float nGetStrikeThruPosition(long p0);
    private static native float nGetStrikeThruThickness(long p0);
    private static native void nGetStringBounds(long p0, java.lang.String p1, int p2, int p3, int p4, android.graphics.Rect p5);
    private static native int nGetStrokeCap(long p0);
    private static native int nGetStrokeJoin(long p0);
    private static native float nGetStrokeMiter(long p0);
    private static native float nGetStrokeWidth(long p0);
    private static native int nGetStyle(long p0);
    private static native float nGetTextAdvances(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, float[] p7, int p8);
    private static native float nGetTextAdvances(long p0, char[] p1, int p2, int p3, int p4, int p5, int p6, float[] p7, int p8);
    private static native int nGetTextAlign(long p0);
    private static native void nGetTextPath(long p0, int p1, java.lang.String p2, int p3, int p4, float p5, float p6, long p7);
    private static native void nGetTextPath(long p0, int p1, char[] p2, int p3, int p4, float p5, float p6, long p7);
    private native int nGetTextRunCursor(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6);
    private native int nGetTextRunCursor(long p0, char[] p1, int p2, int p3, int p4, int p5, int p6);
    private static native float nGetTextScaleX(long p0);
    private static native float nGetTextSize(long p0);
    private static native float nGetTextSkewX(long p0);
    private static native float nGetUnderlinePosition(long p0);
    private static native float nGetUnderlineThickness(long p0);
    private static native float nGetWordSpacing(long p0);
    private static native boolean nHasGlyph(long p0, int p1, java.lang.String p2);
    private static native boolean nHasShadowLayer(long p0);
    private static native long nInit();
    private static native long nInitWithPaint(long p0);
    private static native void nReset(long p0);
    private static native void nSet(long p0, long p1);
    private static native void nSetAlpha(long p0, int p1);
    private static native void nSetAntiAlias(long p0, boolean p1);
    private static native void nSetColor(long p0, int p1);
    private static native void nSetColor(long p0, long p1, long p2);
    private static native long nSetColorFilter(long p0, long p1);
    private static native void nSetDither(long p0, boolean p1);
    private static native void nSetElegantTextHeight(long p0, int p1);
    private static native void nSetEndHyphenEdit(long p0, int p1);
    private static native void nSetFakeBoldText(long p0, boolean p1);
    private static native void nSetFilterBitmap(long p0, boolean p1);
    private static native void nSetFlags(long p0, int p1);
    private static native void nSetFontFeatureSettings(long p0, java.lang.String p1);
    private static native void nSetFontVariationOverride(long p0, long p1);
    private static native void nSetHinting(long p0, int p1);
    private static native void nSetLetterSpacing(long p0, float p1);
    private static native void nSetLinearText(long p0, boolean p1);
    private static native long nSetMaskFilter(long p0, long p1);
    private static native long nSetPathEffect(long p0, long p1);
    private static native long nSetShader(long p0, long p1);
    private static native void nSetShadowLayer(long p0, float p1, float p2, float p3, long p4, long p5);
    private static native void nSetStartHyphenEdit(long p0, int p1);
    private static native void nSetStrikeThruText(long p0, boolean p1);
    private static native void nSetStrokeCap(long p0, int p1);
    private static native void nSetStrokeJoin(long p0, int p1);
    private static native void nSetStrokeMiter(long p0, float p1);
    private static native void nSetStrokeWidth(long p0, float p1);
    private static native void nSetStyle(long p0, int p1);
    private static native void nSetSubpixelText(long p0, boolean p1);
    private static native void nSetTextAlign(long p0, int p1);
    private static native int nSetTextLocales(long p0, java.lang.String p1);
    private static native void nSetTextLocalesByMinikinLocaleListId(long p0, int p1);
    private static native void nSetTextScaleX(long p0, float p1);
    private static native void nSetTextSize(long p0, float p1);
    private static native void nSetTextSkewX(long p0, float p1);
    private static native void nSetTypeface(long p0, long p1);
    private static native void nSetUnderlineText(long p0, boolean p1);
    private static native void nSetWordSpacing(long p0, float p1);
    private static native void nSetXfermode(long p0, int p1);
    private static native void nSetXfermode(long p0, long p1);
    private void resetElegantTextHeight() {}
    private void setClassVariablesFrom(android.graphics.Paint p0) {}
    private void syncTextLocalesWithMinikin() {}
    public float ascent() { return 0.0f; }
    public int breakText(java.lang.CharSequence p0, int p1, int p2, boolean p3, float p4, float[] p5) { return 0; }
    public int breakText(java.lang.String p0, boolean p1, float p2, float[] p3) { return 0; }
    public int breakText(char[] p0, int p1, int p2, float p3, float[] p4) { return 0; }
    public void clearShadowLayer() {}
    public float descent() { return 0.0f; }
    public boolean equalsForTextMeasurement(android.graphics.Paint p0) { return false; }
    public int getAlpha() { return 0; }
    public int getBidiFlags() { return 0; }
    public android.graphics.BlendMode getBlendMode() { return null; }
    public int getColor() { return 0; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public long getColorLong() { return 0L; }
    public int getEndHyphenEdit() { return 0; }
    public boolean getFillPath(android.graphics.Path p0, android.graphics.Path p1) { return false; }
    public int getFlags() { return 0; }
    public java.lang.String getFontFeatureSettings() { return null; }
    public float getFontMetrics(android.graphics.Paint.FontMetrics p0) { return 0.0f; }
    public android.graphics.Paint.FontMetrics getFontMetrics() { return null; }
    public void getFontMetricsForLocale(android.graphics.Paint.FontMetrics p0) {}
    public int getFontMetricsInt(android.graphics.Paint.FontMetricsInt p0) { return 0; }
    public android.graphics.Paint.FontMetricsInt getFontMetricsInt() { return null; }
    public void getFontMetricsInt(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Paint.FontMetricsInt p6) {}
    public void getFontMetricsInt(char[] p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Paint.FontMetricsInt p6) {}
    public void getFontMetricsIntForLocale(android.graphics.Paint.FontMetricsInt p0) {}
    public float getFontSpacing() { return 0.0f; }
    public java.lang.String getFontVariationOverride() { return null; }
    public java.lang.String getFontVariationSettings() { return null; }
    public int getHinting() { return 0; }
    public float getLetterSpacing() { return 0.0f; }
    public android.graphics.MaskFilter getMaskFilter() { return null; }
    public long getNativeInstance() { return 0L; }
    public int getOffsetForAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, float p6) { return 0; }
    public int getOffsetForAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, float p6) { return 0; }
    public android.graphics.PathEffect getPathEffect() { return null; }
    @java.lang.Deprecated
    public android.graphics.Rasterizer getRasterizer() { return null; }
    public float getRunAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, int p6) { return 0.0f; }
    public float getRunAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, int p6) { return 0.0f; }
    public float getRunCharacterAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8) { return 0.0f; }
    public float getRunCharacterAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8, android.graphics.RectF p9, android.graphics.Paint.RunInfo p10) { return 0.0f; }
    public float getRunCharacterAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8) { return 0.0f; }
    public float getRunCharacterAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8, android.graphics.RectF p9, android.graphics.Paint.RunInfo p10) { return 0.0f; }
    public android.graphics.Shader getShader() { return null; }
    public int getShadowLayerColor() { return 0; }
    public long getShadowLayerColorLong() { return 0L; }
    public float getShadowLayerDx() { return 0.0f; }
    public float getShadowLayerDy() { return 0.0f; }
    public float getShadowLayerRadius() { return 0.0f; }
    public int getStartHyphenEdit() { return 0; }
    public float getStrikeThruPosition() { return 0.0f; }
    public float getStrikeThruThickness() { return 0.0f; }
    public android.graphics.Paint.Cap getStrokeCap() { return null; }
    public android.graphics.Paint.Join getStrokeJoin() { return null; }
    public float getStrokeMiter() { return 0.0f; }
    public float getStrokeWidth() { return 0.0f; }
    public android.graphics.Paint.Style getStyle() { return null; }
    public android.graphics.Paint.Align getTextAlign() { return null; }
    public void getTextBounds(java.lang.CharSequence p0, int p1, int p2, android.graphics.Rect p3) {}
    public void getTextBounds(java.lang.String p0, int p1, int p2, android.graphics.Rect p3) {}
    public void getTextBounds(char[] p0, int p1, int p2, android.graphics.Rect p3) {}
    public java.util.Locale getTextLocale() { return null; }
    public android.os.LocaleList getTextLocales() { return null; }
    public void getTextPath(java.lang.String p0, int p1, int p2, float p3, float p4, android.graphics.Path p5) {}
    public void getTextPath(char[] p0, int p1, int p2, float p3, float p4, android.graphics.Path p5) {}
    public float getTextRunAdvances(char[] p0, int p1, int p2, int p3, int p4, boolean p5, float[] p6, int p7) { return 0.0f; }
    public int getTextRunCursor(java.lang.CharSequence p0, int p1, int p2, boolean p3, int p4, int p5) { return 0; }
    public int getTextRunCursor(java.lang.String p0, int p1, int p2, boolean p3, int p4, int p5) { return 0; }
    public int getTextRunCursor(char[] p0, int p1, int p2, boolean p3, int p4, int p5) { return 0; }
    public float getTextScaleX() { return 0.0f; }
    public float getTextSize() { return 0.0f; }
    public float getTextSkewX() { return 0.0f; }
    public int getTextWidths(java.lang.CharSequence p0, int p1, int p2, float[] p3) { return 0; }
    public int getTextWidths(java.lang.String p0, int p1, int p2, float[] p3) { return 0; }
    public int getTextWidths(java.lang.String p0, float[] p1) { return 0; }
    public int getTextWidths(char[] p0, int p1, int p2, float[] p3) { return 0; }
    public android.graphics.Typeface getTypeface() { return null; }
    public float getUnderlinePosition() { return 0.0f; }
    public float getUnderlineThickness() { return 0.0f; }
    public float getWordSpacing() { return 0.0f; }
    public android.graphics.Xfermode getXfermode() { return null; }
    public boolean hasGlyph(java.lang.String p0) { return false; }
    public boolean hasShadowLayer() { return false; }
    public final boolean isAntiAlias() { return false; }
    public final boolean isDither() { return false; }
    @java.lang.Deprecated
    public boolean isElegantTextHeight() { return false; }
    public final boolean isFakeBoldText() { return false; }
    public final boolean isFilterBitmap() { return false; }
    public final boolean isLinearText() { return false; }
    public final boolean isStrikeThruText() { return false; }
    public final boolean isSubpixelText() { return false; }
    public final boolean isUnderlineText() { return false; }
    public float measureText(java.lang.CharSequence p0, int p1, int p2) { return 0.0f; }
    public float measureText(java.lang.String p0) { return 0.0f; }
    public float measureText(java.lang.String p0, int p1, int p2) { return 0.0f; }
    public float measureText(char[] p0, int p1, int p2) { return 0.0f; }
    public void reset() {}
    public void set(android.graphics.Paint p0) {}
    public void setARGB(int p0, int p1, int p2, int p3) {}
    public void setAlpha(int p0) {}
    public void setAntiAlias(boolean p0) {}
    public void setBidiFlags(int p0) {}
    public void setBlendMode(android.graphics.BlendMode p0) {}
    public void setColor(int p0) {}
    public void setColor(long p0) {}
    public android.graphics.ColorFilter setColorFilter(android.graphics.ColorFilter p0) { return null; }
    public void setCompatibilityScaling(float p0) {}
    public void setDither(boolean p0) {}
    @java.lang.Deprecated
    public void setElegantTextHeight(boolean p0) {}
    public void setEndHyphenEdit(int p0) {}
    public void setFakeBoldText(boolean p0) {}
    public void setFilterBitmap(boolean p0) {}
    public void setFlags(int p0) {}
    public void setFontFeatureSettings(java.lang.String p0) {}
    public void setFontVariationOverride(java.lang.String p0) {}
    public boolean setFontVariationSettings(java.lang.String p0) { return false; }
    public void setHinting(int p0) {}
    public void setLetterSpacing(float p0) {}
    public void setLinearText(boolean p0) {}
    public android.graphics.MaskFilter setMaskFilter(android.graphics.MaskFilter p0) { return null; }
    public android.graphics.PathEffect setPathEffect(android.graphics.PathEffect p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.Rasterizer setRasterizer(android.graphics.Rasterizer p0) { return null; }
    public android.graphics.Shader setShader(android.graphics.Shader p0) { return null; }
    public void setShadowLayer(float p0, float p1, float p2, int p3) {}
    public void setShadowLayer(float p0, float p1, float p2, long p3) {}
    public void setStartHyphenEdit(int p0) {}
    public void setStrikeThruText(boolean p0) {}
    public void setStrokeCap(android.graphics.Paint.Cap p0) {}
    public void setStrokeJoin(android.graphics.Paint.Join p0) {}
    public void setStrokeMiter(float p0) {}
    public void setStrokeWidth(float p0) {}
    public void setStyle(android.graphics.Paint.Style p0) {}
    public void setSubpixelText(boolean p0) {}
    public void setTextAlign(android.graphics.Paint.Align p0) {}
    public void setTextLocale(java.util.Locale p0) {}
    public void setTextLocales(android.os.LocaleList p0) {}
    public void setTextScaleX(float p0) {}
    public void setTextSize(float p0) {}
    public void setTextSkewX(float p0) {}
    public android.graphics.Typeface setTypeface(android.graphics.Typeface p0) { return null; }
    public void setUnderlineText(boolean p0) {}
    public void setWordSpacing(float p0) {}
    public android.graphics.Xfermode setXfermode(android.graphics.Xfermode p0) { return null; }

    public static enum Align {
        CENTER,
        LEFT,
        RIGHT;
        private static final android.graphics.Paint.Align[] $VALUES = null;
        final int nativeInt = 0;
        private Align() {}
    }

    public static enum Cap {
        BUTT,
        ROUND,
        SQUARE;
        private static final android.graphics.Paint.Cap[] $VALUES = null;
        final int nativeInt = 0;
        private Cap() {}
    }

    private static class ClassAttributesHolder {
        static final android.graphics.Paint.Align[] sAlignArray = null;
        static final android.graphics.Paint.Cap[] sCapArray = null;
        static final android.graphics.Paint.Join[] sJoinArray = null;
        static final android.graphics.Paint.Style[] sStyleArray = null;
        private ClassAttributesHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CursorOption {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EndHyphenEdit {
    }

    public static class FontMetrics {
        public float ascent;
        public float bottom;
        public float descent;
        public float leading;
        public float top;
        public FontMetrics() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class FontMetricsInt {
        public int ascent;
        public int bottom;
        public int descent;
        public int leading;
        public int top;
        public FontMetricsInt() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void set(android.graphics.Paint.FontMetrics p0) {}
        public void set(android.graphics.Paint.FontMetricsInt p0) {}
        public java.lang.String toString() { return null; }
    }

    public static enum Join {
        BEVEL,
        MITER,
        ROUND;
        private static final android.graphics.Paint.Join[] $VALUES = null;
        final int nativeInt = 0;
        private Join() {}
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PaintFlag {
    }

    public static final class RunInfo {
        private int mClusterCount;
        public RunInfo() {}
        public int getClusterCount() { return 0; }
        public void setClusterCount(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartHyphenEdit {
    }

    public static enum Style {
        FILL,
        FILL_AND_STROKE,
        STROKE;
        private static final android.graphics.Paint.Style[] $VALUES = null;
        final int nativeInt = 0;
        private Style() {}
    }
}
