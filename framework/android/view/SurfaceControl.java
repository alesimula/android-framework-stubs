package android.view;

public final class SurfaceControl implements android.os.Parcelable {
    public static final int BUFFER_TRANSFORM_IDENTITY = 0;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL = 1;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL_ROTATE_90 = 5;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL = 2;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL_ROTATE_90 = 6;
    public static final int BUFFER_TRANSFORM_ROTATE_180 = 3;
    public static final int BUFFER_TRANSFORM_ROTATE_270 = 7;
    public static final int BUFFER_TRANSFORM_ROTATE_90 = 4;
    public static final int CACHING_DISABLED = 0;
    public static final int CACHING_ENABLED = 1;
    public static final int CAN_OCCLUDE_PRESENTATION = 4096;
    public static final android.os.Parcelable.Creator<android.view.SurfaceControl> CREATOR = null;
    public static final int CURSOR_WINDOW = 8192;
    public static final int DISPLAY_DECORATION = 512;
    public static final int DISPLAY_OPTIMIZATION_POWER = 2;
    public static final int DISPLAY_RECEIVES_INPUT = 1;
    public static final int ENABLE_BACKPRESSURE = 256;
    public static final int FRAME_RATE_SELECTION_STRATEGY_OVERRIDE_CHILDREN = 1;
    public static final int FRAME_RATE_SELECTION_STRATEGY_PROPAGATE = 0;
    public static final int FRAME_RATE_SELECTION_STRATEGY_SELF = 2;
    public static final int FX_SURFACE_BLAST = 262144;
    public static final int FX_SURFACE_CONTAINER = 524288;
    public static final int FX_SURFACE_EFFECT = 131072;
    public static final int FX_SURFACE_MASK = 983040;
    public static final int FX_SURFACE_NORMAL = 0;
    public static final int HIDDEN = 4;
    public static final int IGNORE_DESTINATION_FRAME = 1024;
    public static final int INVALID_LAYER_ID = -1;
    public static final int LAYER_IS_REFRESH_RATE_INDICATOR = 2048;
    public static final int METADATA_ACCESSIBILITY_ID = 5;
    public static final int METADATA_GAME_MODE = 8;
    public static final int METADATA_MOUSE_CURSOR = 4;
    public static final int METADATA_OWNER_PID = 6;
    public static final int METADATA_OWNER_UID = 1;
    public static final int METADATA_TASK_ID = 3;
    public static final int METADATA_WINDOW_TYPE = 2;
    public static final int NON_PREMULTIPLIED = 256;
    public static final int NOT_ADD_TO_ROOT = 32768;
    public static final int NO_COLOR_FILL = 16384;
    public static final int OPAQUE = 1024;
    public static final int POWER_MODE_DOZE = 1;
    public static final int POWER_MODE_DOZE_SUSPEND = 3;
    public static final int POWER_MODE_NORMAL = 2;
    public static final int POWER_MODE_OFF = 0;
    public static final int POWER_MODE_ON_SUSPEND = 4;
    public static final int PROTECTED_APP = 2048;
    public static final int RECOVERABLE_FROM_BUFFER_STUFFING = 8192;
    private static final android.view.SurfaceControl.NativeProperties RELEASED_NATIVE_PROPERTIES = null;
    public static final int SECURE = 128;
    public static final int SKIP_SCREENSHOT = 64;
    private static final int SURFACE_HIDDEN = 1;
    private static final int SURFACE_OPAQUE = 2;
    public static final int SURFACE_WOULD_BE_OPAQUE_IF_NOT_FOR_CLIENT_ROUNDED_CORNERS = 32768;
    private static final java.lang.String TAG = "SurfaceControl";
    private static volatile boolean sDebugUsageAfterRelease;
    private static final java.util.Map<android.view.SurfaceControl.OnDisplayEventListener, java.lang.Long> sDisplayEventListeners = null;
    private java.lang.String mCallsite;
    private android.view.Choreographer mChoreographer;
    private final java.lang.Object mChoreographerLock = null;
    private java.lang.Runnable mFreeNativeResources;
    private int mHeight;
    private java.lang.ref.WeakReference<android.view.View> mLocalOwnerView;
    private final java.lang.Object mLock = null;
    public long mNativeObject;
    private android.view.SurfaceControl.NativeProperties mNativeProperties;
    private java.lang.Throwable mReleaseStack;
    private java.util.ArrayList<android.view.SurfaceControl.OnReparentListener> mReparentListeners;
    private android.view.SurfaceControl.TrustedPresentationCallback mTrustedPresentationCallback;
    private int mWidth;
    public SurfaceControl() {}
    private SurfaceControl(android.os.Parcel p0) {}
    public SurfaceControl(android.view.SurfaceControl p0, java.lang.String p1) {}
    private SurfaceControl(android.view.SurfaceSession p0, java.lang.String p1, int p2, int p3, int p4, int p5, android.view.SurfaceControl p6, android.util.SparseIntArray p7, java.lang.ref.WeakReference<android.view.View> p8, java.lang.String p9) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException {}
    public static void addDisplayEventListener(android.view.SurfaceControl.OnDisplayEventListener p0) {}
    private void assignNativeObject(long p0, java.lang.String p1) {}
    public static boolean bootFinished() { return false; }
    private void checkNotReleased() {}
    public static boolean clearAnimationFrameStats() { return false; }
    public static void clearBootDisplayMode(android.os.IBinder p0) {}
    @java.lang.Deprecated
    public static void closeTransaction() {}
    public static boolean getAnimationFrameStats(android.view.WindowAnimationFrameStats p0) { return false; }
    public static boolean getBootDisplayModeSupport() { return false; }
    public static android.graphics.ColorSpace[] getCompositionColorSpaces() { return null; }
    public static android.view.SurfaceControl.DesiredDisplayModeSpecs getDesiredDisplayModeSpecs(android.os.IBinder p0) { return null; }
    public static boolean getDisplayBrightnessSupport(android.os.IBinder p0) { return false; }
    public static android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(android.os.IBinder p0) { return null; }
    public static android.view.SurfaceControl.DisplayPrimaries getDisplayNativePrimaries(android.os.IBinder p0) { return null; }
    public static android.hardware.display.DisplayedContentSample getDisplayedContentSample(android.os.IBinder p0, long p1, long p2) { return null; }
    public static android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(android.os.IBinder p0) { return null; }
    public static android.view.SurfaceControl.DynamicDisplayInfo getDynamicDisplayInfo(long p0) { return null; }
    public static int getGPUContextPriority() { return 0; }
    public static int getMaxPictureProfiles() { return 0; }
    public static boolean getMultiDisplayModeSetSupport() { return false; }
    private android.view.SurfaceControl.NativeProperties getNativeProperties(long p0) { return null; }
    private static native long getNativeTrustedPresentationCallbackFinalizer();
    public static android.hardware.OverlayProperties getOverlaySupport() { return null; }
    public static boolean getProtectedContentSupport() { return false; }
    public static android.gui.StalledTransactionInfo getStalledTransactionInfo(int p0) { return null; }
    public static android.view.SurfaceControl.StaticDisplayInfo getStaticDisplayInfo(long p0) { return null; }
    private static void invokeReleaseCallback(java.util.function.Consumer<android.hardware.SyncFence> p0, long p1) {}
    public static android.view.SurfaceControl mirrorSurface(android.view.SurfaceControl p0) { return null; }
    public static android.view.SurfaceControl mirrorSurface(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
    public static android.view.SurfaceControl mirrorWithCrop(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
    public static android.view.SurfaceControl mirrorWithCrop(android.view.SurfaceControl p0, android.view.SurfaceControl p1, android.view.SurfaceControl p2) { return null; }
    private static native void nativeAddDisplayEventListener(long p0);
    private static native void nativeAddJankDataListener(long p0);
    private static native void nativeAddTransactionBarrier(long p0, android.os.Parcel p1);
    private static native void nativeAddTransactionCommittedListener(long p0, android.view.SurfaceControl.TransactionCommittedListener p1);
    private static native void nativeAddTransactionCompletedListener(long p0, java.util.function.Consumer<android.view.SurfaceControl.TransactionStats> p1);
    private static native void nativeAddWindowInfosReportedListener(long p0, java.lang.Runnable p1);
    private static native void nativeApplyTransaction(long p0, boolean p1, boolean p2);
    private static native boolean nativeBootFinished();
    private static native boolean nativeClearAnimationFrameStats();
    private static native void nativeClearBootDisplayMode(android.os.IBinder p0);
    private static native boolean nativeClearContentFrameStats(long p0);
    private static native void nativeClearTransaction(long p0);
    private static native void nativeClearTrustedPresentationCallback(long p0, long p1);
    private static native long nativeCopyFromSurfaceControl(long p0);
    private static native long nativeCreate(android.view.SurfaceSession p0, java.lang.String p1, int p2, int p3, int p4, int p5, long p6, android.os.Parcel p7) throws android.view.Surface.OutOfResourcesException;
    private static native long nativeCreateDisplayEventListenerWrapper(android.view.SurfaceControl.DisplayEventListenerWrapper p0);
    private static native long nativeCreateJankDataListenerWrapper(long p0, android.view.SurfaceControl.OnJankDataListener p1);
    private static native long nativeCreateTpc(android.view.SurfaceControl.TrustedPresentationCallback p0);
    private static native long nativeCreateTransaction();
    private static native void nativeDestroyDisplayEventListenerWrapper(long p0);
    private static native void nativeDisconnect(long p0);
    private static native void nativeEnableDebugLogCallPoints(long p0);
    private static native void nativeFlushJankData(long p0);
    private static native boolean nativeGetAnimationFrameStats(android.view.WindowAnimationFrameStats p0);
    private static native boolean nativeGetBootDisplayModeSupport();
    private static native int[] nativeGetCompositionDataspaces();
    private static native boolean nativeGetContentFrameStats(long p0, android.view.WindowContentFrameStats p1);
    private static native android.os.IBinder nativeGetDefaultApplyToken();
    private static native android.view.SurfaceControl.DesiredDisplayModeSpecs nativeGetDesiredDisplayModeSpecs(android.os.IBinder p0);
    private static native boolean nativeGetDisplayBrightnessSupport(android.os.IBinder p0);
    private static native android.hardware.graphics.common.DisplayDecorationSupport nativeGetDisplayDecorationSupport(android.os.IBinder p0);
    private static native android.view.SurfaceControl.DisplayPrimaries nativeGetDisplayNativePrimaries(android.os.IBinder p0);
    private static native android.hardware.display.DisplayedContentSample nativeGetDisplayedContentSample(android.os.IBinder p0, long p1, long p2);
    private static native android.hardware.display.DisplayedContentSamplingAttributes nativeGetDisplayedContentSamplingAttributes(android.os.IBinder p0);
    private static native android.view.SurfaceControl.DynamicDisplayInfo nativeGetDynamicDisplayInfo(long p0);
    private static native int nativeGetGPUContextPriority();
    private static native long nativeGetHandle(long p0);
    private static native long nativeGetJankDataListenerWrapperFinalizer();
    private static native int nativeGetLayerId(long p0);
    private static native int nativeGetMaxPictureProfiles();
    private static native boolean nativeGetMultiDisplayModeSetSupport();
    private static native java.lang.String nativeGetName(long p0);
    private static native long nativeGetNativeSurfaceControlFinalizer();
    private static native long nativeGetNativeTransactionFinalizer();
    private static native android.hardware.OverlayProperties nativeGetOverlaySupport();
    private static native boolean nativeGetProtectedContentSupport();
    private static native android.gui.StalledTransactionInfo nativeGetStalledTransactionInfo(int p0);
    private static native android.view.SurfaceControl.StaticDisplayInfo nativeGetStaticDisplayInfo(long p0);
    private static native long nativeGetTransactionId(long p0);
    private static native int nativeGetTransformHint(long p0);
    private static native void nativeMergeTransaction(long p0, long p1);
    private static native long nativeMirrorSurface(long p0, long p1);
    private static native long nativeMirrorSurfaceWithCrop(long p0, long p1, long p2);
    private static native void nativeNotifyShutdown();
    private static native long nativeReadFromParcel(android.os.Parcel p0);
    private static native long nativeReadTransactionFromParcel(android.os.Parcel p0);
    private static native android.os.IBinder nativeRegisterShader(java.lang.String p0, java.lang.String p1);
    private static native void nativeRemoveCurrentInputFocus(long p0, int p1);
    private static native void nativeRemoveDisplayEventListener(long p0);
    private static native void nativeRemoveJankDataListener(long p0, long p1);
    private static native void nativeReparent(long p0, long p1, long p2);
    private static native void nativeSanitize(long p0, int p1, int p2);
    private static native boolean nativeSetActiveColorMode(android.os.IBinder p0, int p1);
    private static native void nativeSetAlpha(long p0, long p1, float p2);
    private static native void nativeSetAnimationTransaction(long p0);
    private static native void nativeSetAutoLowLatencyMode(android.os.IBinder p0, boolean p1);
    private static native void nativeSetBackgroundBlurRadius(long p0, long p1, int p2);
    private static native void nativeSetBackgroundBlurScale(long p0, long p1, float p2);
    private static native void nativeSetBlurRegions(long p0, long p1, float[][] p2, int p3);
    private static native void nativeSetBlurThrottlingTargetFps(long p0, long p1, int p2);
    private static native void nativeSetBootDisplayMode(android.os.IBinder p0, int p1);
    private static native void nativeSetBorderSettings(long p0, long p1, android.os.Parcel p2);
    private static native void nativeSetBoxShadowSettings(long p0, long p1, android.os.Parcel p2);
    private static native void nativeSetBuffer(long p0, long p1, android.hardware.HardwareBuffer p2, long p3, java.util.function.Consumer<android.hardware.SyncFence> p4);
    private static native void nativeSetBufferTransform(long p0, long p1, int p2);
    private static native void nativeSetCachingHint(long p0, long p1, int p2);
    private static native void nativeSetCanOccludePresentation(long p0, long p1, boolean p2);
    private static native void nativeSetClientDrawnCornerRadius(long p0, long p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9);
    private static native void nativeSetColor(long p0, long p1, float[] p2);
    private static native void nativeSetColorSpaceAgnostic(long p0, long p1, boolean p2);
    private static native void nativeSetColorTransform(long p0, long p1, float[] p2, float[] p3);
    private static native void nativeSetCompositionFilterFlag(long p0, long p1, int p2);
    private static native void nativeSetContentPriority(long p0, long p1, int p2);
    private static native void nativeSetCornerRadius(long p0, long p1, float p2);
    private static native void nativeSetCornerRadius(long p0, long p1, float p2, float p3, float p4, float p5);
    private static native void nativeSetCrop(long p0, long p1, float p2, float p3, float p4, float p5);
    private static native void nativeSetDamageRegion(long p0, long p1, android.graphics.Region p2);
    private static native void nativeSetDataSpace(long p0, long p1, int p2);
    private static native void nativeSetDefaultApplyToken(android.os.IBinder p0);
    private static native void nativeSetDefaultFrameRateCompatibility(long p0, long p1, int p2);
    private static native int nativeSetDesiredDisplayModeSpecs(android.os.IBinder p0, android.view.SurfaceControl.DesiredDisplayModeSpecs[] p1);
    private static native void nativeSetDesiredHdrHeadroom(long p0, long p1, float p2);
    private static native void nativeSetDesiredMaxHdrHeadroom(long p0, long p1, float p2);
    private static native void nativeSetDesiredPresentTimeNanos(long p0, long p1);
    private static native void nativeSetDestinationFrame(long p0, long p1, int p2, int p3, int p4, int p5);
    private static native void nativeSetDimmingEnabled(long p0, long p1, boolean p2);
    private static native boolean nativeSetDisplayBrightness(android.os.IBinder p0, float p1, float p2, float p3, float p4);
    private static native void nativeSetDisplayExclusionMask(long p0, android.os.IBinder p1, int p2);
    private static native void nativeSetDisplayFlags(long p0, android.os.IBinder p1, int p2);
    private static native void nativeSetDisplayLayerStack(long p0, android.os.IBinder p1, int p2);
    private static native void nativeSetDisplayPowerMode(android.os.IBinder p0, int p1);
    private static native void nativeSetDisplayProjection(long p0, android.os.IBinder p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10);
    private static native void nativeSetDisplaySize(long p0, android.os.IBinder p1, int p2, int p3);
    private static native void nativeSetDisplaySurface(long p0, android.os.IBinder p1, long p2);
    private static native boolean nativeSetDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3);
    private static native void nativeSetDropInputMode(long p0, long p1, int p2);
    private static native void nativeSetEarlyWakeupEnd(long p0, android.os.Parcel p1);
    private static native void nativeSetEarlyWakeupStart(long p0, android.os.Parcel p1);
    private static native void nativeSetEdgeExtensionEffect(long p0, long p1, boolean p2, boolean p3, boolean p4, boolean p5);
    private static native void nativeSetExtendedRangeBrightness(long p0, long p1, float p2, float p3);
    private static native void nativeSetFixedTransformHint(long p0, long p1, int p2);
    private static native void nativeSetFlags(long p0, long p1, int p2, int p3);
    private static native void nativeSetFocusedWindow(long p0, android.os.IBinder p1, java.lang.String p2, int p3);
    private static native void nativeSetFrameRate(long p0, long p1, float p2, int p3, int p4);
    private static native void nativeSetFrameRateCategory(long p0, long p1, int p2, boolean p3);
    private static native void nativeSetFrameRateSelectionPriority(long p0, long p1, int p2);
    private static native void nativeSetFrameRateSelectionStrategy(long p0, long p1, int p2);
    private static native void nativeSetFrameTimelineVsync(long p0, long p1);
    private static native void nativeSetGameContentType(android.os.IBinder p0, boolean p1);
    private static native void nativeSetGeometry(long p0, long p1, android.graphics.Rect p2, android.graphics.Rect p3, long p4);
    private static native void nativeSetGlobalShadowSettings(float[] p0, float[] p1, float p2, float p3, float p4);
    private static native void nativeSetInputWindowInfo(long p0, long p1, android.view.InputWindowHandle p2);
    private static native void nativeSetLayer(long p0, long p1, int p2);
    private static native void nativeSetLayerStack(long p0, long p1, int p2);
    private static native void nativeSetLuts(long p0, long p1, float[] p2, int[] p3, int[] p4, int[] p5, int[] p6);
    private static native void nativeSetMatrix(long p0, long p1, float p2, float p3, float p4, float p5);
    private static native void nativeSetMetadata(long p0, long p1, int p2, android.os.Parcel p3);
    private static native void nativeSetPictureProfileId(long p0, long p1, long p2);
    private static native void nativeSetPosition(long p0, long p1, float p2, float p3);
    private static native void nativeSetPostProcess(long p0, long p1, android.os.IBinder p2, byte[] p3, int p4);
    private static native void nativeSetRelativeLayer(long p0, long p1, long p2, int p3);
    private static native void nativeSetScale(long p0, long p1, float p2, float p3);
    private static native void nativeSetShadowRadius(long p0, long p1, float p2);
    private static native void nativeSetStretchEffect(long p0, long p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11);
    private static native void nativeSetSystemContentPriority(long p0, long p1, int p2);
    private static native void nativeSetTransformHint(long p0, int p1);
    private static native void nativeSetTransparentRegionHint(long p0, long p1, android.graphics.Region p2);
    private static native void nativeSetTrustedOverlay(long p0, long p1, int p2);
    private static native void nativeSetTrustedPresentationCallback(long p0, long p1, long p2, android.view.SurfaceControl.TrustedPresentationThresholds p3);
    private static native void nativeSetWindowCrop(long p0, long p1, int p2, int p3, int p4, int p5);
    private static native void nativeSurfaceFlushJankData(long p0);
    private static native void nativeToggleRoundedCornerOpt(long p0, long p1, boolean p2);
    private static native void nativeUnregisterShader(android.os.IBinder p0);
    private static native void nativeUnsetBuffer(long p0, long p1);
    private static native void nativeUpdateDefaultBufferSize(long p0, int p1, int p2);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static native void nativeWriteTransactionToParcel(long p0, android.os.Parcel p1);
    public static void notifyShutdown() {}
    @java.lang.Deprecated
    public static void openTransaction() {}
    public static android.os.IBinder registerShader(java.lang.String p0, java.lang.String p1) { return null; }
    public static void removeDisplayEventListener(android.view.SurfaceControl.OnDisplayEventListener p0) {}
    public static int rotationToBufferTransform(int p0) { return 0; }
    public static boolean setActiveColorMode(android.os.IBinder p0, int p1) { return false; }
    public static void setAutoLowLatencyMode(android.os.IBinder p0, boolean p1) {}
    public static void setBootDisplayMode(android.os.IBinder p0, int p1) {}
    public static void setDebugUsageAfterRelease(boolean p0) {}
    public static android.view.SurfaceControl.ModeSpecsUpdateResult setDesiredDisplayModeSpecs(android.os.IBinder p0, android.view.SurfaceControl.DesiredDisplayModeSpecs[] p1) { return null; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1) { return false; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1, float p2, float p3, float p4) { return false; }
    public static void setDisplayPowerMode(android.os.IBinder p0, int p1) {}
    public static boolean setDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3) { return false; }
    public static void setGameContentType(android.os.IBinder p0, boolean p1) {}
    public static void setGlobalShadowSettings(float[] p0, float[] p1, float p2, float p3, float p4) {}
    public static void unregisterShader(android.os.IBinder p0) {}
    private static void validateColorArg(float[] p0) {}
    public android.view.SurfaceControl.OnJankDataListenerRegistration addOnJankDataListener(android.view.SurfaceControl.OnJankDataListener p0) { return null; }
    public boolean addOnReparentListener(android.view.SurfaceControl.OnReparentListener p0) { return false; }
    public boolean clearContentFrameStats() { return false; }
    public void copyFrom(android.view.SurfaceControl p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void disconnect() {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    protected void finalize() throws java.lang.Throwable {}
    java.lang.String getCallsite() { return null; }
    public android.view.Choreographer getChoreographer() { return null; }
    public android.view.Choreographer getChoreographer(android.os.Looper p0) { return null; }
    public boolean getContentFrameStats(android.view.WindowContentFrameStats p0) { return false; }
    public int getHeight() { return 0; }
    public int getLayerId() { return 0; }
    public android.view.View getLocalOwnerView() { return null; }
    java.lang.String getName() { return null; }
    public int getTransformHint() { return 0; }
    public int getWidth() { return 0; }
    public boolean hasChoreographer() { return false; }
    public boolean isSameSurface(android.view.SurfaceControl p0) { return false; }
    public boolean isValid() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void release() {}
    public boolean removeOnReparentListener(android.view.SurfaceControl.OnReparentListener p0) { return false; }
    public void resize(int p0, int p1) {}
    public void setTransformHint(int p0) {}
    public void setUnreleasedWarningCallSite(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BufferTransform {
    }

    public static class Builder {
        private java.lang.String mCallsite;
        private int mFlags;
        private int mFormat;
        private int mHeight;
        private java.lang.ref.WeakReference<android.view.View> mLocalOwnerView;
        private android.util.SparseIntArray mMetadata;
        private java.lang.String mName;
        private android.view.SurfaceControl mParent;
        private android.view.SurfaceSession mSession;
        private int mWidth;
        public Builder() {}
        public Builder(android.view.SurfaceSession p0) {}
        private boolean isContainerLayer() { return false; }
        private boolean isEffectLayer() { return false; }
        private android.view.SurfaceControl.Builder setFlags(int p0, int p1) { return null; }
        private void unsetBufferSize() {}
        public android.view.SurfaceControl build() { return null; }
        public android.view.SurfaceControl.Builder setBLASTLayer() { return null; }
        public android.view.SurfaceControl.Builder setBufferSize(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setCallsite(java.lang.String p0) { return null; }
        public android.view.SurfaceControl.Builder setColorLayer() { return null; }
        public android.view.SurfaceControl.Builder setContainerLayer() { return null; }
        public android.view.SurfaceControl.Builder setEffectLayer() { return null; }
        public android.view.SurfaceControl.Builder setFlags(int p0) { return null; }
        public android.view.SurfaceControl.Builder setFormat(int p0) { return null; }
        public android.view.SurfaceControl.Builder setHidden(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setLocalOwnerView(android.view.View p0) { return null; }
        public android.view.SurfaceControl.Builder setMetadata(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setName(java.lang.String p0) { return null; }
        public android.view.SurfaceControl.Builder setNotAddToRoot() { return null; }
        public android.view.SurfaceControl.Builder setOpaque(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setParent(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Builder setProtected(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setSecure(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CachingHint {
    }

    public static final class CieXyz {
        public float X;
        public float Y;
        public float Z;
        public CieXyz() {}
    }

    public static final class DesiredDisplayModeSpecs {
        public boolean allowGroupSwitching;
        public final android.view.SurfaceControl.RefreshRateRanges appRequestRanges = null;
        public int defaultMode;
        public android.os.IBinder displayToken;
        public android.view.SurfaceControl.IdleScreenRefreshRateConfig idleScreenRefreshRateConfig;
        public final android.view.SurfaceControl.RefreshRateRanges primaryRanges = null;
        public android.view.SurfaceControl.WorkDuration workDuration;
        public DesiredDisplayModeSpecs() {}
        public DesiredDisplayModeSpecs(android.os.IBinder p0, int p1, boolean p2, android.view.SurfaceControl.RefreshRateRanges p3, android.view.SurfaceControl.RefreshRateRanges p4, android.view.SurfaceControl.IdleScreenRefreshRateConfig p5, android.view.SurfaceControl.WorkDuration p6) {}
        public DesiredDisplayModeSpecs(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) {}
        private void copyIdleScreenRefreshRateConfig(android.view.SurfaceControl.IdleScreenRefreshRateConfig p0) {}
        public void copyFrom(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) {}
        public boolean equals(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class DisplayEventListenerWrapper {
        private final android.view.SurfaceControl.OnDisplayEventListener mListener = null;
        DisplayEventListenerWrapper(android.view.SurfaceControl.OnDisplayEventListener p0) {}
        private void dispatchDisplayModeChange(android.os.IBinder p0, int p1) {}
    }

    public static final class DisplayMode {
        public long appVsyncOffsetNanos;
        public int group;
        public int height;
        public int id;
        public float peakRefreshRate;
        public long presentationDeadlineNanos;
        public int[] supportedHdrTypes;
        public float vsyncRate;
        public int width;
        public float xDpi;
        public float yDpi;
        public DisplayMode() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class DisplayPrimaries {
        public android.view.SurfaceControl.CieXyz blue;
        public android.view.SurfaceControl.CieXyz green;
        public android.view.SurfaceControl.CieXyz red;
        public android.view.SurfaceControl.CieXyz white;
        public DisplayPrimaries() {}
    }

    public static final class DynamicDisplayInfo {
        public int activeColorMode;
        public int activeDisplayModeId;
        public boolean autoLowLatencyModeSupported;
        public android.view.FrameRateCategoryRate frameRateCategoryRate;
        public boolean gameContentTypeSupported;
        public boolean hasArrSupport;
        public android.view.Display.HdrCapabilities hdrCapabilities;
        public int preferredBootDisplayMode;
        public float renderFrameRate;
        public int[] supportedColorModes;
        public android.view.SurfaceControl.DisplayMode[] supportedDisplayModes;
        public float[] supportedRefreshRates;
        public DynamicDisplayInfo() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateSelectionStrategy {
    }

    public static final class IdleScreenRefreshRateConfig {
        public int timeoutMillis;
        public IdleScreenRefreshRateConfig() {}
        public IdleScreenRefreshRateConfig(int p0) {}
        public void copyFrom(android.view.SurfaceControl.IdleScreenRefreshRateConfig p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class JankData {
        public static final int JANK_APPLICATION = 2;
        public static final int JANK_COMPOSER = 1;
        public static final int JANK_NONE = 0;
        public static final int JANK_OTHER = 4;
        private final long mActualAppFrameTimeNs = 0L;
        private final long mActualPresentDeltaNs = 0L;
        private final long mFrameIntervalNs = 0L;
        private final long mFrameVsyncId = 0L;
        private final double mJankScore = 0.0;
        private final int mJankTypeExperimental = 0;
        private final int mJankTypeLegacy = 0;
        private final long mPresentDelayNs = 0L;
        private final long mScheduledAppFrameTimeNs = 0L;
        public JankData(long p0, int p1, int p2, long p3, long p4, long p5, long p6, long p7, double p8) {}
        public long getActualAppFrameTimeNanos() { return 0L; }
        public long getActualPresentDeltaNanos() { return 0L; }
        public long getFrameIntervalNanos() { return 0L; }
        public double getJankScore() { return 0.0; }
        public int getJankType() { return 0; }
        public int getJankTypeExperimental() { return 0; }
        public int getJankTypeLegacy() { return 0; }
        public long getPresentDelayNanos() { return 0L; }
        public long getScheduledAppFrameTimeNanos() { return 0L; }
        public long getVsyncId() { return 0L; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface JankType {
        }
    }

    public static class LockDebuggingTransaction extends android.view.SurfaceControl.Transaction {
        java.lang.Object mMonitor;
        public LockDebuggingTransaction(java.lang.Object p0) { super(); }
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
    }

    public static enum ModeChangeResult {
        FAILURE,
        REJECTED,
        SUCCESS;
        private static final android.view.SurfaceControl.ModeChangeResult[] $VALUES = null;
        private ModeChangeResult() {}
        public static android.view.SurfaceControl.ModeChangeResult fromInt(int p0) { return null; }
    }

    public static enum ModeSpecsUpdateResult {
        FAILURE,
        SUCCESS_MODES_CHANGED,
        SUCCESS_MODES_UNCHANGED;
        private static final android.view.SurfaceControl.ModeSpecsUpdateResult[] $VALUES = null;
        private ModeSpecsUpdateResult() {}
        public static android.view.SurfaceControl.ModeSpecsUpdateResult fromInt(int p0) { return null; }
    }

    private static class NativeProperties {
        public final int layerId = 0;
        public final java.lang.String name = null;
        public final long nativeHandle = 0L;
        NativeProperties(long p0, java.lang.String p1, int p2) {}
    }

    public static interface OnDisplayEventListener {
        public void onDisplayModeChange(android.os.IBinder p0, android.view.SurfaceControl.ModeChangeResult p1);
    }

    public static interface OnJankDataListener {
        public void onJankDataAvailable(java.util.List<android.view.SurfaceControl.JankData> p0);
    }

    public static class OnJankDataListenerRegistration {
        public static final android.view.SurfaceControl.OnJankDataListenerRegistration NONE = null;
        private final java.lang.Runnable mFreeNativeResources = null;
        private android.view.SurfaceControl.OnJankDataListener mListener;
        private final long mNativeObject = 0L;
        private boolean mRemoved;
        private OnJankDataListenerRegistration() {}
        OnJankDataListenerRegistration(android.view.SurfaceControl p0, android.view.SurfaceControl.OnJankDataListener p1) {}
        public void flush() {}
        public void release() {}
        public void removeAfter(long p0) {}
    }

    public static interface OnReparentListener {
        public void onReparent(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1);
    }

    public static final class RefreshRateRange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.SurfaceControl.RefreshRateRange> CREATOR = null;
        public static final float FLOAT_TOLERANCE = 0.009999999776482582f;
        public static final java.lang.String TAG = "RefreshRateRange";
        public float max;
        public float min;
        public RefreshRateRange() {}
        public RefreshRateRange(float p0, float p1) {}
        public void copyFrom(android.view.SurfaceControl.RefreshRateRange p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class RefreshRateRanges {
        public static final java.lang.String TAG = "RefreshRateRanges";
        public final android.view.SurfaceControl.RefreshRateRange physical = null;
        public final android.view.SurfaceControl.RefreshRateRange render = null;
        public RefreshRateRanges() {}
        public RefreshRateRanges(android.view.SurfaceControl.RefreshRateRange p0, android.view.SurfaceControl.RefreshRateRange p1) {}
        public void copyFrom(android.view.SurfaceControl.RefreshRateRanges p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class StaticDisplayInfo {
        public float density;
        public android.hardware.display.DeviceProductInfo deviceProductInfo;
        public int installOrientation;
        public boolean isInternal;
        public int port;
        public int screenPartStatus;
        public boolean secure;
        public StaticDisplayInfo() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class Transaction implements java.io.Closeable, android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.SurfaceControl.Transaction> CREATOR = null;
        private static final float[] INVALID_COLOR = null;
        public static final int SAMPLE_BEHIND = 1;
        public static final int SAMPLE_SELF = 0;
        java.util.ArrayList<java.lang.String> mCalls;
        java.lang.Runnable mFreeNativeResources;
        public long mNativeObject;
        private final android.util.ArrayMap<android.view.SurfaceControl, android.view.SurfaceControl> mReparentedSurfaces = null;
        private final android.util.ArrayMap<android.view.SurfaceControl, android.graphics.Point> mResizedSurfaces = null;
        public Transaction() {}
        private Transaction(long p0) {}
        private Transaction(android.os.Parcel p0) {}
        private void apply(boolean p0, boolean p1) {}
        public static android.os.IBinder getDefaultApplyToken() { return null; }
        public static void sendSurfaceFlushJankData(android.view.SurfaceControl p0) {}
        public static void setDefaultApplyToken(android.os.IBinder p0) {}
        private void setUpForSurfaceControlRegistry() {}
        public android.view.SurfaceControl.Transaction addTransactionBarrier(android.gui.TransactionBarrier p0) { return null; }
        public android.view.SurfaceControl.Transaction addTransactionCommittedListener(java.util.concurrent.Executor p0, android.view.SurfaceControl.TransactionCommittedListener p1) { return null; }
        public android.view.SurfaceControl.Transaction addTransactionCompletedListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.SurfaceControl.TransactionStats> p1) { return null; }
        public android.view.SurfaceControl.Transaction addWindowInfosReportedListener(java.lang.Runnable p0) { return null; }
        public void apply() {}
        public void apply(boolean p0) {}
        public void applyAsyncUnsafe() {}
        protected void applyResizedSurfaces() {}
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
        public void clear() {}
        public android.view.SurfaceControl.Transaction clearFrameRate(android.view.SurfaceControl p0) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction clearTrustedPresentationCallback(android.view.SurfaceControl p0) { return null; }
        public void close() {}
        public int describeContents() { return 0; }
        public long getId() { return 0L; }
        public android.view.SurfaceControl.Transaction hide(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction merge(android.view.SurfaceControl.Transaction p0) { return null; }
        protected void notifyReparentedSurfaces() {}
        void onMergeWithNextTransaction(java.lang.CharSequence p0) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public android.view.SurfaceControl.Transaction remove(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction removeCurrentInputFocus(int p0) { return null; }
        public android.view.SurfaceControl.Transaction reparent(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
        public void sanitize(int p0, int p1) {}
        public android.view.SurfaceControl.Transaction setAlpha(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setAnimationTransaction() { return null; }
        public android.view.SurfaceControl.Transaction setBackgroundBlurRadius(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setBackgroundBlurScale(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setBlurRegions(android.view.SurfaceControl p0, float[][] p1) { return null; }
        public android.view.SurfaceControl.Transaction setBlurThrottlingTargetFps(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setBorderSettings(android.view.SurfaceControl p0, android.gui.BorderSettings p1) { return null; }
        public android.view.SurfaceControl.Transaction setBoxShadowSettings(android.view.SurfaceControl p0, android.gui.BoxShadowSettings p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.graphics.GraphicBuffer p1) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1, android.hardware.SyncFence p2) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1, android.hardware.SyncFence p2, java.util.function.Consumer<android.hardware.SyncFence> p3) { return null; }
        public android.view.SurfaceControl.Transaction setBufferSize(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setBufferTransform(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setCachingHint(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setCanOccludePresentation(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setClientDrawnCornerRadius(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4, android.graphics.RectF p5) { return null; }
        public android.view.SurfaceControl.Transaction setColor(android.view.SurfaceControl p0, float[] p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setColorSpace(android.view.SurfaceControl p0, android.graphics.ColorSpace p1) { return null; }
        public android.view.SurfaceControl.Transaction setColorSpaceAgnostic(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setColorTransform(android.view.SurfaceControl p0, float[] p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setCompositionFilterFlag(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setContentPriority(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setCornerRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setCornerRadius(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        public android.view.SurfaceControl.Transaction setCrop(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        public android.view.SurfaceControl.Transaction setCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setDamageRegion(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        public android.view.SurfaceControl.Transaction setDataSpace(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDefaultFrameRateCompatibility(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDesiredHdrHeadroom(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setDesiredMaxHdrHeadroom(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setDesiredPresentTimeNanos(long p0) { return null; }
        public android.view.SurfaceControl.Transaction setDestinationFrame(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setDestinationFrame(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setDimmingEnabled(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayDecoration(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayExclusionMask(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayFlags(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayLayerStack(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySize(android.os.IBinder p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) { return null; }
        public android.view.SurfaceControl.Transaction setDropInputMode(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeupEnd(android.gui.EarlyWakeupInfo p0) { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeupStart(android.gui.EarlyWakeupInfo p0) { return null; }
        public android.view.SurfaceControl.Transaction setEdgeExtensionEffect(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setExtendedRangeBrightness(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        public android.view.SurfaceControl.Transaction setFixedTransformHint(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setFocusedWindow(android.os.IBinder p0, java.lang.String p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, android.view.Surface.FrameRateParams p1) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRateCategory(android.view.SurfaceControl p0, int p1, boolean p2) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRateSelectionPriority(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRateSelectionStrategy(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setFrameTimeline(long p0) { return null; }
        public android.view.SurfaceControl.Transaction setFrameTimelineVsync(long p0) { return null; }
        public android.view.SurfaceControl.Transaction setGeometry(android.view.SurfaceControl p0, android.graphics.Rect p1, android.graphics.Rect p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setInputWindowInfo(android.view.SurfaceControl p0, android.view.InputWindowHandle p1) { return null; }
        public android.view.SurfaceControl.Transaction setLayer(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setLayerStack(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setLuts(android.view.SurfaceControl p0, android.hardware.DisplayLuts p1) { return null; }
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, android.graphics.Matrix p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, android.os.Parcel p2) { return null; }
        public android.view.SurfaceControl.Transaction setOpaque(android.view.SurfaceControl p0, boolean p1) { return null; }
        @android.annotation.SystemApi
        public android.view.SurfaceControl.Transaction setPictureProfileHandle(android.view.SurfaceControl p0, android.media.quality.PictureProfileHandle p1) { return null; }
        public android.view.SurfaceControl.Transaction setPosition(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        public android.view.SurfaceControl.Transaction setPostProcess(android.view.SurfaceControl p0, android.os.IBinder p1, byte[] p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setRecoverableFromBufferStuffing(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setRelativeLayer(android.view.SurfaceControl p0, android.view.SurfaceControl p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setScale(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        public android.view.SurfaceControl.Transaction setSecure(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setShadowRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setSkipScreenshot(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setStretchEffect(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) { return null; }
        public android.view.SurfaceControl.Transaction setSystemContentPriority(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setTransparentRegionHint(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        public android.view.SurfaceControl.Transaction setTrustedOverlay(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setTrustedOverlay(android.view.SurfaceControl p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setTrustedPresentationCallback(android.view.SurfaceControl p0, android.view.SurfaceControl.TrustedPresentationThresholds p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) { return null; }
        public android.view.SurfaceControl.Transaction setVisibility(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setWouldBeOpaqueIfNotForClientRoundedCorners(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction show(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction toggleClientDrawnRoundedCornersOpt(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction unsetBuffer(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction unsetColor(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction unsetFixedTransformHint(android.view.SurfaceControl p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface TransactionCommittedListener {
        public void onTransactionCommitted();
    }

    public static final class TransactionStats {
        private long mLatchTimeNanos;
        private android.hardware.SyncFence mSyncFence;
        private TransactionStats(long p0, long p1) {}
        public void close() {}
        public long getLatchTimeNanos() { return 0L; }
        public android.hardware.SyncFence getPresentFence() { return null; }
    }

    public static abstract class TrustedPresentationCallback {
        private final java.lang.Runnable mFreeNativeResources = null;
        private final long mNativeObject = 0L;
        private TrustedPresentationCallback() {}
        public abstract void onTrustedPresentationChanged(boolean p0);
    }

    @java.lang.Deprecated
    public static final class TrustedPresentationThresholds {
        private final float mMinAlpha = 0.0f;
        private final float mMinFractionRendered = 0.0f;
        private final int mStabilityRequirementMs = 0;
        public TrustedPresentationThresholds(float p0, float p1, int p2) {}
        private void checkValid() {}
    }

    public static class WorkDuration {
        public final long appDurationNanos = 0L;
        public final long maxSfDurationNanos = 0L;
        public final long minSfDurationNanos = 0L;
        public WorkDuration(long p0, long p1, long p2) {}
        public WorkDuration(android.view.SurfaceControl.WorkDuration p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
