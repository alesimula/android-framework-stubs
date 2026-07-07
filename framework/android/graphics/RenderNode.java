package android.graphics;

public final class RenderNode {
    public static final int USAGE_BACKGROUND = 1;
    public static final int USAGE_NAVIGATION_BAR_BACKGROUND = 4;
    public static final int USAGE_UNKNOWN = 0;
    private final android.graphics.RenderNode.AnimationHost mAnimationHost = null;
    private android.graphics.RenderNode.CompositePositionUpdateListener mCompositePositionUpdateListener;
    private android.graphics.RecordingCanvas mCurrentRecordingCanvas;
    public final long mNativeRenderNode = 0L;
    private RenderNode(long p0) {}
    public RenderNode(java.lang.String p0) {}
    private RenderNode(java.lang.String p0, android.graphics.RenderNode.AnimationHost p1) {}
    public static android.graphics.RenderNode adopt(long p0) { return null; }
    public static android.graphics.RenderNode create(java.lang.String p0, android.graphics.RenderNode.AnimationHost p1) { return null; }
    private static native void nAddAnimator(long p0, long p1);
    private static native boolean nClearStretch(long p0);
    private static native long nCreate(java.lang.String p0);
    private static native void nDiscardDisplayList(long p0);
    private static native void nEndAllAnimators(long p0);
    private static native void nForceEndAnimators(long p0);
    private static native int nGetAllocatedSize(long p0);
    private static native boolean nGetAllowForceDark(long p0);
    private static native float nGetAlpha(long p0);
    private static native int nGetAmbientShadowColor(long p0);
    private static native boolean nGetAnimationMatrix(long p0, long p1);
    private static native int nGetBottom(long p0);
    private static native float nGetCameraDistance(long p0);
    private static native boolean nGetClipToBounds(long p0);
    private static native boolean nGetClipToOutline(long p0);
    private static native float nGetElevation(long p0);
    private static native int nGetHeight(long p0);
    private static native void nGetInverseTransformMatrix(long p0, long p1);
    private static native int nGetLayerType(long p0);
    private static native int nGetLeft(long p0);
    private static native long nGetNativeFinalizer();
    private static native float nGetPivotX(long p0);
    private static native float nGetPivotY(long p0);
    private static native int nGetRight(long p0);
    private static native float nGetRotation(long p0);
    private static native float nGetRotationX(long p0);
    private static native float nGetRotationY(long p0);
    private static native float nGetScaleX(long p0);
    private static native float nGetScaleY(long p0);
    private static native int nGetSpotShadowColor(long p0);
    private static native int nGetTop(long p0);
    private static native void nGetTransformMatrix(long p0, long p1);
    private static native float nGetTranslationX(long p0);
    private static native float nGetTranslationY(long p0);
    private static native float nGetTranslationZ(long p0);
    private static native long nGetUniqueId(long p0);
    private static native int nGetUsageSize(long p0);
    private static native int nGetWidth(long p0);
    private static native boolean nHasIdentityMatrix(long p0);
    private static native boolean nHasOverlappingRendering(long p0);
    private static native boolean nHasShadow(long p0);
    private static native boolean nIsPivotExplicitlySet(long p0);
    private static native boolean nIsValid(long p0);
    private static native boolean nOffsetLeftAndRight(long p0, int p1);
    private static native boolean nOffsetTopAndBottom(long p0, int p1);
    private static native void nOutput(long p0);
    private static native void nRequestPositionUpdates(long p0, java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p1);
    private static native boolean nResetPivot(long p0);
    private static native boolean nSetAllowForceDark(long p0, boolean p1);
    private static native boolean nSetAlpha(long p0, float p1);
    private static native boolean nSetAmbientShadowColor(long p0, int p1);
    private static native boolean nSetAnimationMatrix(long p0, long p1);
    private static native boolean nSetBackdropRenderEffect(long p0, long p1);
    private static native boolean nSetBottom(long p0, int p1);
    private static native boolean nSetCameraDistance(long p0, float p1);
    private static native boolean nSetClipBounds(long p0, int p1, int p2, int p3, int p4);
    private static native boolean nSetClipBoundsEmpty(long p0);
    private static native boolean nSetClipToBounds(long p0, boolean p1);
    private static native boolean nSetClipToOutline(long p0, boolean p1);
    private static native boolean nSetElevation(long p0, float p1);
    private static native boolean nSetHasOverlappingRendering(long p0, boolean p1);
    private static native void nSetIsTextureView(long p0);
    private static native boolean nSetLayerPaint(long p0, long p1);
    private static native boolean nSetLayerType(long p0, int p1);
    private static native boolean nSetLeft(long p0, int p1);
    private static native boolean nSetLeftTopRightBottom(long p0, int p1, int p2, int p3, int p4);
    private static native boolean nSetOutlineEmpty(long p0);
    private static native boolean nSetOutlineNone(long p0);
    private static native boolean nSetOutlinePath(long p0, long p1, float p2);
    private static native boolean nSetOutlineRoundRect(long p0, int p1, int p2, int p3, int p4, float p5, float p6);
    private static native boolean nSetPivotX(long p0, float p1);
    private static native boolean nSetPivotY(long p0, float p1);
    private static native boolean nSetProjectBackwards(long p0, boolean p1);
    private static native boolean nSetProjectionReceiver(long p0, boolean p1);
    private static native boolean nSetRenderEffect(long p0, long p1);
    private static native boolean nSetRevealClip(long p0, boolean p1, float p2, float p3, float p4);
    private static native boolean nSetRight(long p0, int p1);
    private static native boolean nSetRotation(long p0, float p1);
    private static native boolean nSetRotationX(long p0, float p1);
    private static native boolean nSetRotationY(long p0, float p1);
    private static native boolean nSetScaleX(long p0, float p1);
    private static native boolean nSetScaleY(long p0, float p1);
    private static native boolean nSetSpotShadowColor(long p0, int p1);
    private static native boolean nSetStaticMatrix(long p0, long p1);
    private static native boolean nSetTop(long p0, int p1);
    private static native boolean nSetTranslationX(long p0, float p1);
    private static native boolean nSetTranslationY(long p0, float p1);
    private static native boolean nSetTranslationZ(long p0, float p1);
    private static native void nSetUsageHint(long p0, int p1);
    private static native boolean nStretch(long p0, float p1, float p2, float p3, float p4);
    public void addAnimator(android.graphics.animation.RenderNodeAnimator p0) {}
    public void addPositionUpdateListener(android.graphics.RenderNode.PositionUpdateListener p0) {}
    public android.graphics.RecordingCanvas beginRecording() { return null; }
    public android.graphics.RecordingCanvas beginRecording(int p0, int p1) { return null; }
    public boolean clearStretch() { return false; }
    public long computeApproximateMemoryAllocated() { return 0L; }
    public long computeApproximateMemoryUsage() { return 0L; }
    public void discardDisplayList() {}
    @java.lang.Deprecated
    public void end(android.graphics.RecordingCanvas p0) {}
    public void endAllAnimators() {}
    public void endRecording() {}
    public void forceEndAnimators() {}
    public float getAlpha() { return 0.0f; }
    public int getAmbientShadowColor() { return 0; }
    public android.graphics.Matrix getAnimationMatrix() { return null; }
    public int getBottom() { return 0; }
    public float getCameraDistance() { return 0.0f; }
    public boolean getClipToBounds() { return false; }
    public boolean getClipToOutline() { return false; }
    public float getElevation() { return 0.0f; }
    public int getHeight() { return 0; }
    public void getInverseMatrix(android.graphics.Matrix p0) {}
    public int getLeft() { return 0; }
    public void getMatrix(android.graphics.Matrix p0) {}
    public float getPivotX() { return 0.0f; }
    public float getPivotY() { return 0.0f; }
    public int getRight() { return 0; }
    public float getRotationX() { return 0.0f; }
    public float getRotationY() { return 0.0f; }
    public float getRotationZ() { return 0.0f; }
    public float getScaleX() { return 0.0f; }
    public float getScaleY() { return 0.0f; }
    public int getSpotShadowColor() { return 0; }
    public int getTop() { return 0; }
    public float getTranslationX() { return 0.0f; }
    public float getTranslationY() { return 0.0f; }
    public float getTranslationZ() { return 0.0f; }
    public long getUniqueId() { return 0L; }
    public boolean getUseCompositingLayer() { return false; }
    public int getWidth() { return 0; }
    public boolean hasDisplayList() { return false; }
    public boolean hasIdentityMatrix() { return false; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean hasShadow() { return false; }
    public boolean isAttached() { return false; }
    public boolean isForceDarkAllowed() { return false; }
    public boolean isPivotExplicitlySet() { return false; }
    public boolean offsetLeftAndRight(int p0) { return false; }
    public boolean offsetTopAndBottom(int p0) { return false; }
    public void output() {}
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public void removePositionUpdateListener(android.graphics.RenderNode.PositionUpdateListener p0) {}
    public boolean resetPivot() { return false; }
    public boolean setAlpha(float p0) { return false; }
    public boolean setAmbientShadowColor(int p0) { return false; }
    public boolean setAnimationMatrix(android.graphics.Matrix p0) { return false; }
    public boolean setBackdropRenderEffect(android.graphics.RenderEffect p0) { return false; }
    public boolean setBottom(int p0) { return false; }
    public boolean setCameraDistance(float p0) { return false; }
    public boolean setClipRect(android.graphics.Rect p0) { return false; }
    public boolean setClipToBounds(boolean p0) { return false; }
    public boolean setClipToOutline(boolean p0) { return false; }
    public boolean setElevation(float p0) { return false; }
    public boolean setForceDarkAllowed(boolean p0) { return false; }
    public boolean setHasOverlappingRendering(boolean p0) { return false; }
    public void setIsTextureView() {}
    @java.lang.Deprecated
    public boolean setLayerPaint(android.graphics.Paint p0) { return false; }
    @java.lang.Deprecated
    public boolean setLayerType(int p0) { return false; }
    public boolean setLeft(int p0) { return false; }
    public boolean setLeftTopRightBottom(int p0, int p1, int p2, int p3) { return false; }
    public boolean setOutline(android.graphics.Outline p0) { return false; }
    public boolean setPivotX(float p0) { return false; }
    public boolean setPivotY(float p0) { return false; }
    public boolean setPosition(int p0, int p1, int p2, int p3) { return false; }
    public boolean setPosition(android.graphics.Rect p0) { return false; }
    public boolean setProjectBackwards(boolean p0) { return false; }
    public boolean setProjectionReceiver(boolean p0) { return false; }
    public boolean setRenderEffect(android.graphics.RenderEffect p0) { return false; }
    public boolean setRevealClip(boolean p0, float p1, float p2, float p3) { return false; }
    public boolean setRight(int p0) { return false; }
    public boolean setRotationX(float p0) { return false; }
    public boolean setRotationY(float p0) { return false; }
    public boolean setRotationZ(float p0) { return false; }
    public boolean setScaleX(float p0) { return false; }
    public boolean setScaleY(float p0) { return false; }
    public boolean setSpotShadowColor(int p0) { return false; }
    public boolean setStaticMatrix(android.graphics.Matrix p0) { return false; }
    public boolean setTop(int p0) { return false; }
    public boolean setTranslationX(float p0) { return false; }
    public boolean setTranslationY(float p0) { return false; }
    public boolean setTranslationZ(float p0) { return false; }
    public void setUsageHint(int p0) {}
    public boolean setUseCompositingLayer(boolean p0, android.graphics.Paint p1) { return false; }
    @java.lang.Deprecated
    public android.graphics.RecordingCanvas start(int p0, int p1) { return null; }
    public boolean stretch(float p0, float p1, float p2, float p3) { return false; }

    public static interface AnimationHost {
        public boolean isAttached();
        public void registerAnimatingRenderNode(android.graphics.RenderNode p0, android.animation.Animator p1);
        public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0);
    }

    private static final class CompositePositionUpdateListener implements android.graphics.RenderNode.PositionUpdateListener {
        private static final android.graphics.RenderNode.PositionUpdateListener[] sEmpty = null;
        private final android.graphics.RenderNode.PositionUpdateListener[] mListeners = null;
        CompositePositionUpdateListener(android.graphics.RenderNode.PositionUpdateListener... p0) {}
        public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, boolean p11, boolean p12) {}
        public void positionLost(long p0) {}
        public android.graphics.RenderNode.CompositePositionUpdateListener with(android.graphics.RenderNode.PositionUpdateListener p0) { return null; }
        public android.graphics.RenderNode.CompositePositionUpdateListener without(android.graphics.RenderNode.PositionUpdateListener p0) { return null; }
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static interface PositionUpdateListener {
        public static boolean callApplyStretch(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11) { return false; }
        public static boolean callPositionChanged(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1, int p2, int p3, int p4, int p5) { return false; }
        public static boolean callPositionChanged2(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, boolean p12, boolean p13) { return false; }
        public static boolean callPositionLost(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1) { return false; }
        default public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4);
        default public void positionChanged(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, boolean p11, boolean p12) {}
        public void positionLost(long p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsageHint {
    }
}
