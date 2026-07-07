package com.android.internal.widget.remotecompose.core;

public class RemoteComposeBuffer {
    private static final boolean DEBUG = false;
    public static final int EASING_CUBIC_ACCELERATE = 2;
    public static final int EASING_CUBIC_ANTICIPATE = 5;
    public static final int EASING_CUBIC_CUSTOM = 11;
    public static final int EASING_CUBIC_DECELERATE = 3;
    public static final int EASING_CUBIC_LINEAR = 4;
    public static final int EASING_CUBIC_OVERSHOOT = 6;
    public static final int EASING_CUBIC_STANDARD = 1;
    public static final int EASING_EASE_OUT_BOUNCE = 13;
    public static final int EASING_EASE_OUT_ELASTIC = 14;
    public static final int EASING_SPLINE_CUSTOM = 12;
    public static final int PAD_AFTER_NONE = 1;
    public static final int PAD_AFTER_SPACE = 0;
    public static final int PAD_AFTER_ZERO = 3;
    public static final int PAD_PRE_NONE = 4;
    public static final int PAD_PRE_SPACE = 0;
    public static final int PAD_PRE_ZERO = 12;
    protected int mApiLevel;
    private com.android.internal.widget.remotecompose.core.WireBuffer mBuffer;
    private int mGeneratedComponentId;
    protected int mLastComponentId;
    com.android.internal.widget.remotecompose.core.Operations.UniqueIntMap<com.android.internal.widget.remotecompose.core.CompanionOperation> mMap;
    protected int mProfileMask;
    public RemoteComposeBuffer() {}
    public RemoteComposeBuffer(int p0) {}
    public static com.android.internal.widget.remotecompose.core.RemoteComposeBuffer fromFile(java.lang.String p0) throws java.io.IOException { return null; }
    public static com.android.internal.widget.remotecompose.core.RemoteComposeBuffer fromInputStream(java.io.InputStream p0) { return null; }
    public static float[] packAnimation(float p0, int p1, float[] p2, float p3, float p4) { return null; }
    static void read(java.io.File p0, com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p1) throws java.io.IOException {}
    public static void read(java.io.InputStream p0, com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p1) {}
    private static byte[] readAllBytes(java.io.InputStream p0) throws java.io.IOException { return null; }
    static java.lang.String version() { return null; }
    public void addAnimatedFloat(int p0, float... p1) {}
    public void addAnimatedFloat(int p0, float[] p1, float[] p2) {}
    public void addAnimationSpecModifier(int p0, float p1, int p2, float p3, int p4, int p5, int p6) {}
    public int addBitmapFont(int p0, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p1) { return 0; }
    public int addBitmapFont(int p0, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p1, java.util.Map<java.lang.String, java.lang.Short> p2) { return 0; }
    public void addBoolean(int p0, boolean p1) {}
    public void addBoxStart(int p0, int p1, int p2, int p3) {}
    public void addCanvasContentStart(int p0) {}
    public void addCanvasOperationsStart() {}
    public void addCanvasStart(int p0, int p1) {}
    public void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    public void addClickModifierOperation() {}
    public void addClickModifierOperation(int p0) {}
    public void addClipPath(int p0) {}
    public void addClipRect(float p0, float p1, float p2, float p3) {}
    public void addClipRectModifier() {}
    public void addCollapsibleColumnStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addCollapsiblePriorityModifier(int p0, float p1) {}
    public void addCollapsibleRowStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addColor(int p0, int p1) {}
    public void addColorExpression(int p0, float p1, float p2, float p3) {}
    public void addColorExpression(int p0, float p1, float p2, float p3, float p4) {}
    public void addColorExpression(int p0, int p1, float p2, float p3, float p4) {}
    public void addColorExpression(int p0, int p1, int p2, float p3) {}
    public void addColorExpression(int p0, int p1, short p2, float p3) {}
    public void addColorExpression(int p0, short p1, int p2, float p3) {}
    public void addColorExpression(int p0, short p1, short p2, float p3) {}
    public void addColumnStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addComponentContentHeightValue(int p0) {}
    public void addComponentContentWidthValue(int p0) {}
    public void addComponentHeightValue(int p0) {}
    public void addComponentRootXValue(int p0) {}
    public void addComponentRootYValue(int p0) {}
    public void addComponentStart(int p0) {}
    public void addComponentStart(int p0, int p1) {}
    public void addComponentValue(int p0, int p1) {}
    public void addComponentVisibilityOperation(int p0) {}
    public void addComponentWidthValue(int p0) {}
    public void addComponentXValue(int p0) {}
    public void addComponentYValue(int p0) {}
    public void addConditionalOperations(byte p0, float p1, float p2) {}
    public void addContainerEnd() {}
    public void addContentStart() {}
    public void addDebugMessage(int p0, float p1, int p2) {}
    public void addDimensionConstraintsModifierOperation(int p0, float p1, float p2) {}
    public void addDrawArc(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addDrawBitmap(int p0, float p1, float p2, float p3, float p4, int p5) {}
    public void addDrawBitmapFontTextRun(int p0, int p1, int p2, int p3, float p4, float p5, float p6) {}
    public void addDrawBitmapFontTextRunOnPath(int p0, int p1, int p2, int p3, int p4, float p5, float p6) {}
    public void addDrawCircle(float p0, float p1, float p2) {}
    public void addDrawContentOperation() {}
    public void addDrawLine(float p0, float p1, float p2, float p3) {}
    public void addDrawOval(float p0, float p1, float p2, float p3) {}
    public void addDrawPath(int p0) {}
    public void addDrawRect(float p0, float p1, float p2, float p3) {}
    public void addDrawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addDrawSector(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addDrawTextOnCircle(int p0, float p1, float p2, float p3, float p4, float p5, com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Alignment p6, com.android.internal.widget.remotecompose.core.operations.DrawTextOnCircle.Placement p7) {}
    public void addDrawTextOnPath(int p0, int p1, float p2, float p3) {}
    public void addDrawTextRun(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7) {}
    public void addDrawTweenPath(int p0, int p1, float p2, float p3, float p4) {}
    public void addDynamicFloatArray(int p0, float p1) {}
    public void addDynamicModifierBackground(int p0, int p1) {}
    public void addEndFloatFunctionDef() {}
    public void addFitBoxStart(int p0, int p1, int p2, int p3) {}
    public float addFloat(int p0, float p1) { return 0.0f; }
    public void addFloatArray(int p0, float[] p1) {}
    public void addFlowStart(int p0, int p1, int p2, int p3, float p4, int p5, int p6) {}
    public void addFont(int p0, int p1, byte[] p2) {}
    public void addHeader(short[] p0, java.lang.Object[] p1) {}
    public void addHeightInModifierOperation(float p0, float p1) {}
    public void addHeightModifierOperation(int p0, float p1) {}
    public void addImage(int p0, int p1, int p2, int p3, float p4) {}
    public void addImpulse(float p0, float p1) {}
    public void addImpulseEnd() {}
    public void addImpulseProcess() {}
    public void addInteger(int p0, int p1) {}
    public void addIntegerExpression(int p0, int p1, int[] p2) {}
    public void addList(int p0, int[] p1) {}
    public void addLong(int p0, long p1) {}
    public void addLoopEnd() {}
    public void addLoopStart(int p0, float p1, float p2, float p3) {}
    public void addMap(int p0, java.lang.String[] p1, byte[] p2, int[] p3) {}
    public void addMatrixConst(int p0, float[] p1) {}
    public void addMatrixExpression(int p0, float[] p1) {}
    public void addMatrixRestore() {}
    public void addMatrixRotate(float p0, float p1, float p2) {}
    public void addMatrixSave() {}
    public void addMatrixScale(float p0, float p1) {}
    public void addMatrixScale(float p0, float p1, float p2, float p3) {}
    public void addMatrixSkew(float p0, float p1) {}
    public void addMatrixTranslate(float p0, float p1) {}
    public void addMatrixVectorMath(float p0, short p1, float[] p2, int[] p3) {}
    public void addModifierAlignBy(float p0) {}
    public void addModifierBackground(float p0, float p1, float p2, float p3, int p4) {}
    public void addModifierBackground(int p0, int p1) {}
    public void addModifierBorder(float p0, float p1, int p2, int p3) {}
    public void addModifierDynamicBorder(float p0, float p1, int p2, int p3) {}
    public void addModifierGraphicsLayer(java.util.HashMap<java.lang.Integer, java.lang.Object> p0) {}
    public void addModifierMarquee(int p0, int p1, float p2, float p3, float p4, float p5) {}
    public void addModifierOffset(float p0, float p1) {}
    public void addModifierPadding(float p0, float p1, float p2, float p3) {}
    public void addModifierRipple() {}
    public void addModifierScroll(int p0, float p1) {}
    public void addModifierZIndex(float p0) {}
    public void addPaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) {}
    public void addParticleLoopEnd() {}
    public void addParticles(int p0, int[] p1, float[][] p2, int p3) {}
    public void addParticlesComparison(int p0, short p1, float p2, float p3, float[] p4, float[][] p5, float[][] p6) {}
    public void addParticlesLoop(int p0, float[] p1, float[][] p2) {}
    public int addPathData(int p0, float[] p1) { return 0; }
    public int addPathData(int p0, float[] p1, int p2) { return 0; }
    public void addPathExpression(int p0, float[] p1, float[] p2, float p3, float p4, float p5, int p6) {}
    public void addRootContentDescription(int p0) {}
    public void addRootStart() {}
    public void addRoundClipRectModifier(float p0, float p1, float p2, float p3) {}
    public void addRowStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addRunActionsStart() {}
    public void addSemanticsModifier(int p0, byte p1, int p2, int p3, int p4, boolean p5, boolean p6) {}
    public void addStateLayout(int p0, int p1, int p2, int p3, int p4) {}
    public void addText(int p0, java.lang.String p1) {}
    public void addTextComponentStart(int p0, int p1, int p2, int p3, float p4, int p5, float p6, int p7, short p8, short p9, int p10, int p11) {}
    public void addTextComponentStart(int p0, int p1, int p2, int p3, int p4) {}
    public void addTextComponentStart(int p0, int p1, int p2, int p3, int p4, int p5, float p6, float p7, float p8, int p9, float p10, int p11, int p12, int p13, int p14, float p15, float p16, float p17, int p18, int p19, int p20, boolean p21, boolean p22, int[] p23, float[] p24, boolean p25, int p26) {}
    public void addTextStyle(int p0, java.lang.Integer p1, java.lang.Integer p2, java.lang.Float p3, java.lang.Float p4, java.lang.Float p5, java.lang.Integer p6, java.lang.Float p7, java.lang.Integer p8, java.lang.Integer p9, java.lang.Integer p10, java.lang.Integer p11, java.lang.Float p12, java.lang.Float p13, java.lang.Float p14, java.lang.Integer p15, java.lang.Integer p16, java.lang.Integer p17, java.lang.Boolean p18, java.lang.Boolean p19, int[] p20, float[] p21, java.lang.Boolean p22, java.lang.Integer p23) {}
    public void addThemedColor(int p0, int p1, short p2, short p3, int p4, int p5) {}
    public void addTouchCancelModifierOperation() {}
    public void addTouchDownModifierOperation() {}
    public void addTouchExpression(int p0, float p1, float p2, float p3, float p4, int p5, float[] p6, int p7, float[] p8, float[] p9) {}
    public void addTouchUpModifierOperation() {}
    public void addValueFloatChangeActionOperation(int p0, float p1) {}
    public void addValueFloatExpressionChangeActionOperation(int p0, int p1) {}
    public void addValueIntegerChangeActionOperation(int p0, int p1) {}
    public void addValueIntegerExpressionChangeActionOperation(long p0, long p1) {}
    public void addValueStringChangeActionOperation(int p0, int p1) {}
    public void addWidthInModifierOperation(float p0, float p1) {}
    public void addWidthModifierOperation(int p0, float p1) {}
    public float asFloatId(int p0) { return 0.0f; }
    public int beginSkip(short p0, int p1) { return 0; }
    public void bitmapAttribute(int p0, int p1, short p2) {}
    public void bitmapTextMeasure(int p0, int p1, int p2, int p3, float p4) {}
    public void callFloatFunction(int p0, float[] p1) {}
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer copy() { return null; }
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer copyFromOperations(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p1) { return null; }
    public int createBitmap(int p0, short p1, short p2) { return 0; }
    public int createTextFromFloat(int p0, float p1, short p2, short p3, int p4) { return 0; }
    public void defineFloatFunction(int p0, int[] p1) {}
    public void drawBitmap(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11) {}
    public void drawBitmapTextAnchored(int p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8) {}
    public void drawComponentContent() {}
    public void drawOnBitmap(int p0, int p1, int p2) {}
    public void drawScaledBitmap(int p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, float p10, int p11) {}
    public void drawTextAnchored(int p0, float p1, float p2, float p3, float p4, int p5) {}
    public void endConditionalOperations() {}
    public void endLayoutCompute() {}
    public void endSkip(int p0) {}
    public com.android.internal.widget.remotecompose.core.RemoteComposeBuffer fromFile(java.io.File p0) throws java.io.IOException { return null; }
    public com.android.internal.widget.remotecompose.core.WireBuffer getBuffer() { return null; }
    public void getColorAttribute(int p0, int p1, short p2) {}
    protected int getComponentId(int p0) { return 0; }
    public int getLastComponentId() { return 0; }
    public void header(int p0, int p1, float p2, long p3) {}
    public void idLookup(int p0, float p1, float p2) {}
    public void inflateFromBuffer(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0) {}
    public void mapLookup(int p0, int p1, int p2) {}
    public void pathAppend(int p0, float... p1) {}
    public void pathCombine(int p0, int p1, int p2, byte p3) {}
    public int pathCreate(int p0, float p1, float p2) { return 0; }
    public int pathTween(int p0, int p1, int p2, float p3) { return 0; }
    public void performHaptic(int p0) {}
    public void rem(java.lang.String p0) {}
    public void reset(int p0) {}
    public void setArrayValue(int p0, float p1, float p2) {}
    public void setBitmapName(int p0, java.lang.String p1) {}
    public void setBuffer(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void setMatrixFromPath(int p0, float p1, float p2, int p3) {}
    public void setNamedVariable(int p0, java.lang.String p1, int p2) {}
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void setTheme(int p0) {}
    public void setVersion(int p0, int p1) {}
    public void setVersion(int p0, int p1, java.util.Set<java.lang.Integer> p2) {}
    public void startLayoutCompute(int p0, int p1, boolean p2) {}
    public int storeBitmap(int p0, int p1, int p2, byte[] p3) { return 0; }
    public int storeBitmapA8(int p0, int p1, int p2, byte[] p3) { return 0; }
    public int storeBitmapUrl(int p0, java.lang.String p1) { return 0; }
    public void textAttribute(int p0, int p1, short p2) {}
    public void textLength(int p0, int p1) {}
    public void textLookup(int p0, float p1, float p2) {}
    public void textLookup(int p0, float p1, int p2) {}
    public void textMeasure(int p0, int p1, int p2) {}
    public int textMerge(int p0, int p1, int p2) { return 0; }
    public void textSubtext(int p0, int p1, float p2, float p3) {}
    public void textTransform(int p0, int p1, float p2, float p3, int p4) {}
    public void timeAttribute(int p0, int p1, short p2, int... p3) {}
    public void wakeIn(float p0) {}
    public void write(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0, java.io.File p1) {}
}
