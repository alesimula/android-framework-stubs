package com.android.internal.policy;

public class TransitionAnimation {
    private static final int CLIP_REVEAL_TRANSLATION_Y_DP = 8;
    public static final int DEFAULT_APP_TRANSITION_DURATION = 336;
    private static final java.lang.String DEFAULT_PACKAGE = "android";
    public static final int MAX_ANIMATION_DURATION = 1500;
    private static final int MAX_CLIP_REVEAL_TRANSITION_DURATION = 420;
    private static final float RECENTS_THUMBNAIL_FADEIN_FRACTION = 0.5f;
    private static final float RECENTS_THUMBNAIL_FADEOUT_FRACTION = 0.5f;
    private static final int THUMBNAIL_APP_TRANSITION_DURATION = 336;
    private static final int THUMBNAIL_TRANSITION_ENTER_SCALE_DOWN = 2;
    private static final int THUMBNAIL_TRANSITION_ENTER_SCALE_UP = 0;
    private static final int THUMBNAIL_TRANSITION_EXIT_SCALE_DOWN = 3;
    private static final int THUMBNAIL_TRANSITION_EXIT_SCALE_UP = 1;
    static final android.view.animation.Interpolator TOUCH_RESPONSE_INTERPOLATOR = null;
    public static final int WALLPAPER_TRANSITION_CHANGE = 1;
    public static final int WALLPAPER_TRANSITION_CLOSE = 3;
    public static final int WALLPAPER_TRANSITION_INTRA_CLOSE = 5;
    public static final int WALLPAPER_TRANSITION_INTRA_OPEN = 4;
    public static final int WALLPAPER_TRANSITION_NONE = 0;
    public static final int WALLPAPER_TRANSITION_OPEN = 2;
    private final android.view.animation.Interpolator mClipHorizontalInterpolator = null;
    private final int mClipRevealTranslationY = 0;
    private final int mConfigShortAnimTime = 0;
    private final android.content.Context mContext = null;
    private final boolean mDebug = false;
    private final android.view.animation.Interpolator mDecelerateInterpolator = null;
    private final int mDefaultWindowAnimationStyleResId = 0;
    private final android.view.animation.Interpolator mFastOutLinearInInterpolator = null;
    private final com.android.internal.policy.LogDecelerateInterpolator mInterpolator = null;
    private final android.view.animation.Interpolator mLinearOutSlowInInterpolator = null;
    private final java.lang.String mTag = null;
    private final android.view.animation.Interpolator mThumbnailFadeInInterpolator = null;
    private final android.view.animation.Interpolator mThumbnailFadeOutInterpolator = null;
    private final android.graphics.Rect mTmpFromClipRect = null;
    private final android.graphics.Rect mTmpRect = null;
    private final android.graphics.Rect mTmpToClipRect = null;
    private final android.view.animation.Interpolator mTouchResponseInterpolator = null;
    public TransitionAnimation(android.content.Context p0, boolean p1, java.lang.String p2) {}
    private static long calculateClipRevealTransitionDuration(boolean p0, float p1, float p2, android.graphics.Rect p3) { return 0L; }
    public static float computePivot(int p0, float p1) { return 0.0f; }
    public static void configureScreenshotLayer(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer p2) {}
    private static android.view.animation.Animation createCurvedMotion(float p0, float p1, float p2, float p3) { return null; }
    public static android.view.animation.Animation createHiddenByKeyguardExit(android.content.Context p0, com.android.internal.policy.LogDecelerateInterpolator p1, boolean p2, boolean p3, boolean p4) { return null; }
    public static float getBorderLuma(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1) { return 0.0f; }
    public static float getBorderLuma(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, android.view.SurfaceControl p2) { return 0.0f; }
    public static float getBorderLuma(android.view.SurfaceControl p0, int p1, int p2) { return 0.0f; }
    private com.android.internal.policy.AttributeCache.Entry getCachedAnimations(android.view.WindowManager.LayoutParams p0) { return null; }
    private com.android.internal.policy.AttributeCache.Entry getCachedAnimations(java.lang.String p0, int p1) { return null; }
    private com.android.internal.policy.AttributeCache.Entry getCachedAnimations(java.lang.String p0, int p1, int p2) { return null; }
    private void getNextAppTransitionStartRect(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    private static int getPixelLuminance(java.nio.ByteBuffer p0, int p1, int p2, int p3, int p4) { return 0; }
    private int getThumbnailTransitionState(boolean p0, boolean p1) { return 0; }
    public static boolean hasProtectedContent(android.hardware.HardwareBuffer p0) { return false; }
    public static void initAttributeCache(android.content.Context p0, android.os.Handler p1) {}
    public static android.view.animation.Animation loadAnimationSafely(android.content.Context p0, int p1, java.lang.String p2) { return null; }
    public static android.view.animation.Animation prepareThumbnailAnimationWithDuration(android.view.animation.Animation p0, int p1, int p2, long p3, android.view.animation.Interpolator p4) { return null; }
    private void setupDefaultNextAppTransitionStartRect(android.graphics.Rect p0, android.graphics.Rect p1) {}
    private boolean shouldScaleDownThumbnailTransition(int p0) { return false; }
    private static int updateToTranslucentAnimIfNeeded(int p0) { return 0; }
    public android.view.animation.Animation createClipRevealAnimationLocked(int p0, int p1, boolean p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5) { return null; }
    public android.hardware.HardwareBuffer createCrossProfileAppsThumbnail(android.graphics.drawable.Drawable p0, android.graphics.Rect p1) { return null; }
    public android.view.animation.Animation createCrossProfileAppsThumbnailAnimationLocked(android.graphics.Rect p0) { return null; }
    public android.view.animation.Animation createRelaunchAnimation(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public android.view.animation.Animation createScaleUpAnimationLocked(int p0, int p1, boolean p2, android.graphics.Rect p3, android.graphics.Rect p4) { return null; }
    public android.view.animation.Animation createThumbnailAspectScaleAnimationLocked(android.graphics.Rect p0, android.graphics.Rect p1, android.hardware.HardwareBuffer p2, int p3, android.graphics.Rect p4, android.graphics.Rect p5, boolean p6) { return null; }
    public android.view.animation.Animation createThumbnailEnterExitAnimationLocked(boolean p0, boolean p1, android.graphics.Rect p2, int p3, int p4, android.hardware.HardwareBuffer p5, android.graphics.Rect p6) { return null; }
    public int getAnimationResId(android.view.WindowManager.LayoutParams p0, int p1) { return 0; }
    public int getAnimationStyleResId(android.view.WindowManager.LayoutParams p0) { return 0; }
    public int getDefaultAnimationResId(int p0) { return 0; }
    public android.view.animation.Animation loadAnimationAttr(android.view.WindowManager.LayoutParams p0, int p1) { return null; }
    public android.view.animation.Animation loadAnimationAttr(java.lang.String p0, int p1, int p2, boolean p3) { return null; }
    public android.view.animation.Animation loadAnimationRes(java.lang.String p0, int p1) { return null; }
    public android.view.animation.Animation loadAnimationRes(java.lang.String p0, int p1, int p2) { return null; }
    public android.view.animation.Animation loadAppTransitionAnimation(java.lang.String p0, int p1) { return null; }
    public android.view.animation.Animation loadCrossProfileAppEnterAnimation(int p0) { return null; }
    public android.view.animation.Animation loadCrossProfileAppThumbnailEnterAnimation() { return null; }
    public android.view.animation.Animation loadDefaultAnimationAttr(int p0, boolean p1) { return null; }
    public android.view.animation.Animation loadDefaultAnimationRes(int p0) { return null; }
    public android.view.animation.Animation loadDefaultAnimationRes(int p0, int p1) { return null; }
    public android.view.animation.Animation loadKeyguardExitAnimation(int p0, boolean p1) { return null; }
    public android.view.animation.Animation loadKeyguardUnoccludeAnimation(int p0) { return null; }
    public android.view.animation.Animation loadVoiceActivityExitAnimation(boolean p0, int p1) { return null; }
    public android.view.animation.Animation loadVoiceActivityOpenAnimation(boolean p0, int p1) { return null; }
}
