package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class TextStyle extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.ComponentData {
    public static final float DEFAULT_FONT_SIZE = 36.0f;
    public static final float DEFAULT_FONT_WEIGHT = 400.0f;
    public static final com.android.internal.widget.remotecompose.core.operations.utilities.touch.CommandParameters PARAMETERS = null;
    public static final byte P_ANIMATION_ID = 2;
    public static final byte P_AUTOSIZE = 22;
    public static final byte P_BREAK_STRATEGY = 15;
    public static final byte P_COLOR = 3;
    public static final byte P_COLOR_ID = 4;
    public static final byte P_FLAGS = 23;
    public static final byte P_FONT_AXIS = 20;
    public static final byte P_FONT_AXIS_VALUES = 21;
    public static final byte P_FONT_FAMILY = 8;
    public static final byte P_FONT_SIZE = 5;
    public static final byte P_FONT_STYLE = 6;
    public static final byte P_FONT_WEIGHT = 7;
    public static final byte P_HYPHENATION_FREQUENCY = 16;
    public static final byte P_ID = 1;
    public static final byte P_JUSTIFICATION_MODE = 17;
    public static final byte P_LETTER_SPACING = 12;
    public static final byte P_LINE_HEIGHT_ADD = 13;
    public static final byte P_LINE_HEIGHT_MULTIPLIER = 14;
    public static final byte P_MAX_FONT_SIZE = 26;
    public static final byte P_MAX_LINES = 11;
    public static final byte P_MIN_FONT_SIZE = 25;
    public static final byte P_OVERFLOW = 10;
    public static final byte P_PARENT_ID = 24;
    public static final byte P_STRIKETHROUGH = 19;
    public static final byte P_TEXT_ALIGN = 9;
    public static final byte P_UNDERLINE = 18;
    java.lang.Boolean mAutosize;
    java.lang.Integer mColor;
    java.lang.Integer mColorId;
    int[] mFontAxis;
    float[] mFontAxisValues;
    java.lang.Integer mFontFamilyId;
    java.lang.Float mFontSize;
    java.lang.Integer mFontStyle;
    java.lang.Float mFontWeight;
    java.lang.Integer mHyphenationFrequency;
    java.lang.Integer mId;
    java.lang.Integer mJustificationMode;
    java.lang.Float mLetterSpacing;
    java.lang.Integer mLineBreakStrategy;
    java.lang.Float mLineHeightAdd;
    java.lang.Float mLineHeightMultiplier;
    java.lang.Float mMaxFontSize;
    java.lang.Integer mMaxLines;
    java.lang.Float mMinFontSize;
    java.lang.Integer mOverflow;
    java.lang.Integer mParentId;
    java.lang.Boolean mStrikethrough;
    java.lang.Integer mTextAlign;
    java.lang.Boolean mUnderline;
    public TextStyle() { super(); }
    public TextStyle(int p0, int p1, int p2, float p3, float p4, float p5, int p6, float p7, int p8, int p9, int p10, int p11, float p12, float p13, float p14, int p15, int p16, int p17, boolean p18, boolean p19, int[] p20, float[] p21, boolean p22) { super(); }
    public TextStyle(int p0, int p1, int p2, float p3, float p4, float p5, int p6, float p7, int p8, int p9, int p10, int p11, float p12, float p13, float p14, int p15, int p16, int p17, boolean p18, boolean p19, int[] p20, float[] p21, boolean p22, int p23) { super(); }
    public TextStyle(int p0, java.lang.Integer p1, java.lang.Integer p2, java.lang.Float p3, java.lang.Float p4, java.lang.Float p5, java.lang.Integer p6, java.lang.Float p7, java.lang.Integer p8, java.lang.Integer p9, java.lang.Integer p10, java.lang.Integer p11, java.lang.Float p12, java.lang.Float p13, java.lang.Float p14, java.lang.Integer p15, java.lang.Integer p16, java.lang.Integer p17, java.lang.Boolean p18, java.lang.Boolean p19, int[] p20, float[] p21, java.lang.Boolean p22, java.lang.Integer p23) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Float p4, java.lang.Float p5, java.lang.Float p6, java.lang.Integer p7, java.lang.Float p8, java.lang.Integer p9, java.lang.Integer p10, java.lang.Integer p11, java.lang.Integer p12, java.lang.Float p13, java.lang.Float p14, java.lang.Float p15, java.lang.Integer p16, java.lang.Integer p17, java.lang.Integer p18, java.lang.Boolean p19, java.lang.Boolean p20, int[] p21, float[] p22, java.lang.Boolean p23, java.lang.Integer p24) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void applyStyle(com.android.internal.widget.remotecompose.core.operations.layout.managers.TextStyle p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
