package com.android.internal.widget.remotecompose.core;

public class RecordingRemoteComposeBuffer extends com.android.internal.widget.remotecompose.core.RemoteComposeBuffer {
    private final com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.DependencyExtractingRemoteContext mDependencyExtractingRemoteContext = null;
    private com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mInsertPoint;
    private final java.util.Map<java.lang.Integer, com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.SpanOp> mOperationMap = null;
    private com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mSpanTreeRoot;
    private final com.android.internal.widget.remotecompose.core.WireBuffer mTinyBuffer = null;
    public RecordingRemoteComposeBuffer() { super(); }
    public RecordingRemoteComposeBuffer(int p0) { super(); }
    private void addOperation(int p0, com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.OperationBlock p1) {}
    private void addOperation(com.android.internal.widget.remotecompose.core.Operation p0) {}
    private void addOperation(com.android.internal.widget.remotecompose.core.Operation p0, int p1) {}
    private void addOperation(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.OperationBlock p0) {}
    private static com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span findCommonAncestor(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span p0, com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span p1) { return null; }
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
    public void addComponentHeightValue(int p0) {}
    public void addComponentStart(int p0, int p1) {}
    public void addComponentVisibilityOperation(int p0) {}
    public void addComponentWidthValue(int p0) {}
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
    public void addEndFloatFunctionDef() {}
    public void addFitBoxStart(int p0, int p1, int p2, int p3) {}
    public float addFloat(int p0, float p1) { return 0.0f; }
    public void addFloatArray(int p0, float[] p1) {}
    public void addFont(int p0, int p1, byte[] p2) {}
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
    public void bitmapAttribute(int p0, int p1, short p2) {}
    public void bitmapTextMeasure(int p0, int p1, int p2, int p3, float p4) {}
    public void callFloatFunction(int p0, float[] p1) {}
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
    public void getColorAttribute(int p0, int p1, short p2) {}
    public void idLookup(int p0, float p1, float p2) {}
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
    public void writeToBuffer() {}

    private class DependencyExtractingRemoteContext extends com.android.internal.widget.remotecompose.core.RemoteContext {
        private com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.SpanOp mSpanOp;
        private DependencyExtractingRemoteContext(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer p0) { super(); }
        public void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
        public void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1) {}
        public void clearNamedBooleanOverride(java.lang.String p0) {}
        public void clearNamedDataOverride(java.lang.String p0) {}
        public void clearNamedFloatOverride(java.lang.String p0) {}
        public void clearNamedIntegerOverride(java.lang.String p0) {}
        public void clearNamedStringOverride(java.lang.String p0) {}
        public int getColor(int p0) { return 0; }
        public com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0) { return null; }
        public float getFloat(int p0) { return 0.0f; }
        public int getInteger(int p0) { return 0; }
        public long getLong(int p0) { return 0L; }
        public java.lang.Object getObject(int p0) { return null; }
        public float[] getPathData(int p0) { return null; }
        public com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0) { return null; }
        public java.lang.String getText(int p0) { return null; }
        public void hapticEffect(int p0) {}
        public void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
        public void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1) {}
        public void loadBitmap(int p0, short p1, short p2, int p3, int p4, byte[] p5) {}
        public void loadColor(int p0, int p1) {}
        public void loadFloat(int p0, float p1) {}
        public void loadInteger(int p0, int p1) {}
        public void loadPathData(int p0, int p1, float[] p2) {}
        public void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1) {}
        public void loadText(int p0, java.lang.String p1) {}
        public void loadVariableName(java.lang.String p0, int p1, int p2) {}
        public void overrideFloat(int p0, float p1) {}
        public void overrideInteger(int p0, int p1) {}
        public void overrideText(int p0, int p1) {}
        public void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1) {}
        public void putObject(int p0, java.lang.Object p1) {}
        public void recordDependency(int p0) {}
        public void runAction(int p0, java.lang.String p1) {}
        public void runNamedAction(int p0, java.lang.Object p1) {}
        public void setNamedBooleanOverride(java.lang.String p0, boolean p1) {}
        public void setNamedColorOverride(java.lang.String p0, int p1) {}
        public void setNamedDataOverride(java.lang.String p0, java.lang.Object p1) {}
        public void setNamedFloatOverride(java.lang.String p0, float p1) {}
        public void setNamedIntegerOverride(java.lang.String p0, int p1) {}
        public void setNamedLong(java.lang.String p0, long p1) {}
        public void setNamedStringOverride(java.lang.String p0, java.lang.String p1) {}
        public void setSpanOp(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.SpanOp p0) {}
        public int updateOps() { return 0; }
    }

    private static interface OperationBlock {
        public void run(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1);
    }

    private static class Span {
        com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mChild;
        final int mDepth = 0;
        com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mNext;
        final java.util.List<com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.SpanOp> mOperations = null;
        final com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mParent = null;
        final com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mPrev = null;
        final int mSiblingRank = 0;
        Span(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span p0, com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span p1, int p2, int p3) {}
        void record(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    }

    private static class SpanOp {
        final java.util.List<com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.SpanOp> mDeps = null;
        com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span mIdealSpan;
        final com.android.internal.widget.remotecompose.core.Operation mOp = null;
        SpanOp(com.android.internal.widget.remotecompose.core.Operation p0, com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span p1) {}
        void collectDependencies(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.DependencyExtractingRemoteContext p0) {}
        void recordUsageBySpan(com.android.internal.widget.remotecompose.core.RecordingRemoteComposeBuffer.Span p0) {}
    }
}
