package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class TextLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
    private static final boolean DEBUG = false;
    public static final int FLAG_IS_DYNAMIC_COLOR = 1;
    public static final int OVERFLOW_CLIP = 1;
    public static final int OVERFLOW_ELLIPSIS = 3;
    public static final int OVERFLOW_MIDDLE_ELLIPSIS = 5;
    public static final int OVERFLOW_START_ELLIPSIS = 4;
    public static final int OVERFLOW_VISIBLE = 2;
    public static final int TEXT_ALIGN_CENTER = 3;
    public static final int TEXT_ALIGN_END = 6;
    public static final int TEXT_ALIGN_JUSTIFY = 4;
    public static final int TEXT_ALIGN_LEFT = 1;
    public static final int TEXT_ALIGN_RIGHT = 2;
    public static final int TEXT_ALIGN_START = 5;
    private float mBaseline;
    private final com.android.internal.widget.remotecompose.core.operations.layout.measure.Size mCachedSize = null;
    private java.lang.String mCachedString;
    private int mColor;
    private int mColorValue;
    com.android.internal.widget.remotecompose.core.RcPlatformServices.ComputedTextLayout mComputedTextLayout;
    private int mFontFamilyId;
    private float mFontSize;
    private float mFontSizeValue;
    private int mFontStyle;
    private float mFontWeight;
    private final boolean mIsDynamicColorEnabled = false;
    private int mMaxLines;
    private java.lang.String mNewString;
    private int mOverflow;
    public com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    private int mTextAlign;
    private int mTextAlignValue;
    private float mTextH;
    private int mTextId;
    private float mTextW;
    private float mTextX;
    private float mTextY;
    private int mType;
    public TextLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, int p8, float p9, int p10, float p11, int p12, int p13, int p14, int p15) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public TextLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4, float p5, int p6, float p7, int p8, int p9, int p10, int p11) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5, int p6, float p7, int p8, int p9, int p10, int p11) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private static short getFlagsFromTextAlign(int p0) { return 0; }
    public static int id() { return 0; }
    private static boolean isAtLeastVersion7(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return false; }
    private boolean isDynamicColorEnabled(int p0) { return false; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    public float getAlignValue(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1) { return 0.0f; }
    protected java.lang.String getSerializedName() { return null; }
    public java.lang.Integer getTextId() { return null; }
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
