package android.app;

public class ActivityOptions extends android.app.ComponentOptions {
    public static final int ANIM_CLIP_REVEAL = 11;
    public static final int ANIM_CUSTOM = 1;
    public static final int ANIM_CUSTOM_IN_PLACE = 10;
    public static final int ANIM_DEFAULT = 6;
    public static final int ANIM_FROM_STYLE = 14;
    public static final int ANIM_LAUNCH_TASK_BEHIND = 7;
    public static final int ANIM_NONE = 0;
    public static final int ANIM_OPEN_CROSS_PROFILE_APPS = 12;
    public static final int ANIM_REMOTE_ANIMATION = 13;
    public static final int ANIM_SCALE_UP = 2;
    public static final int ANIM_SCENE_TRANSITION = 5;
    public static final int ANIM_THUMBNAIL_SCALE_DOWN = 4;
    public static final int ANIM_THUMBNAIL_SCALE_UP = 3;
    public static final int ANIM_UNDEFINED = -1;
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
    private static final java.lang.String KEY_ALLOW_PASS_THROUGH_ON_TOUCH_OUTSIDE = "android.activity.allowPassThroughOnTouchOutside";
    private static final java.lang.String KEY_ANIMATION_FINISHED_LISTENER = "android:activity.animationFinishedListener";
    private static final java.lang.String KEY_ANIM_ABORT_LISTENER = "android:activity.animAbortListener";
    public static final java.lang.String KEY_ANIM_BACKGROUND_COLOR = "android:activity.backgroundColor";
    public static final java.lang.String KEY_ANIM_ENTER_RES_ID = "android:activity.animEnterRes";
    public static final java.lang.String KEY_ANIM_EXIT_RES_ID = "android:activity.animExitRes";
    public static final java.lang.String KEY_ANIM_HEIGHT = "android:activity.animHeight";
    public static final java.lang.String KEY_ANIM_IN_PLACE_RES_ID = "android:activity.animInPlaceRes";
    public static final java.lang.String KEY_ANIM_START_LISTENER = "android:activity.animStartListener";
    public static final java.lang.String KEY_ANIM_START_X = "android:activity.animStartX";
    public static final java.lang.String KEY_ANIM_START_Y = "android:activity.animStartY";
    public static final java.lang.String KEY_ANIM_THUMBNAIL = "android:activity.animThumbnail";
    public static final java.lang.String KEY_ANIM_TYPE = "android:activity.animType";
    public static final java.lang.String KEY_ANIM_WIDTH = "android:activity.animWidth";
    private static final java.lang.String KEY_APPLY_ACTIVITY_FLAGS_FOR_BUBBLES = "android:activity.applyActivityFlagsForBubbles";
    private static final java.lang.String KEY_APPLY_MULTIPLE_TASK_FLAG_FOR_SHORTCUT = "android:activity.applyMultipleTaskFlagForShortcut";
    private static final java.lang.String KEY_APPLY_NO_USER_ACTION_FLAG_FOR_SHORTCUT = "android:activity.applyNoUserActionFlagForShortcut";
    private static final java.lang.String KEY_AVOID_MOVE_TO_FRONT = "android.activity.avoidMoveToFront";
    private static final java.lang.String KEY_CALLER_DISPLAY_ID = "android.activity.callerDisplayId";
    private static final java.lang.String KEY_DISABLE_STARTING_WINDOW = "android.activity.disableStarting";
    private static final java.lang.String KEY_DISALLOW_ENTER_PICTURE_IN_PICTURE_WHILE_LAUNCHING = "android:activity.disallowEnterPictureInPictureWhileLaunching";
    private static final java.lang.String KEY_DISMISS_KEYGUARD_IF_INSECURE = "android.activity.dismissKeyguardIfInsecure";
    private static final java.lang.String KEY_FLEXIBLE_LAUNCH_SIZE = "android.activity.flexibleLaunchSize";
    private static final java.lang.String KEY_FREEZE_RECENT_TASKS_REORDERING = "android.activity.freezeRecentTasksReordering";
    private static final java.lang.String KEY_INSTANT_APP_VERIFICATION_BUNDLE = "android:instantapps.installerbundle";
    private static final java.lang.String KEY_LAUNCHED_FROM_BUBBLE = "android.activity.launchTypeBubble";
    private static final java.lang.String KEY_LAUNCH_ACTIVITY_TYPE = "android.activity.activityType";
    public static final java.lang.String KEY_LAUNCH_BOUNDS = "android:activity.launchBounds";
    public static final java.lang.String KEY_LAUNCH_COOKIE = "android.activity.launchCookie";
    private static final java.lang.String KEY_LAUNCH_DISPLAY_ID = "android.activity.launchDisplayId";
    private static final java.lang.String KEY_LAUNCH_INTO_PIP_PARAMS = "android.activity.launchIntoPipParams";
    private static final java.lang.String KEY_LAUNCH_NEXT_TO_BUBBLE = "android.activity.launchNextToBubble";
    public static final java.lang.String KEY_LAUNCH_ROOT_TASK_TOKEN = "android.activity.launchRootTaskToken";
    private static final java.lang.String KEY_LAUNCH_TASK_DISPLAY_AREA_FEATURE_ID = "android.activity.launchTaskDisplayAreaFeatureId";
    private static final java.lang.String KEY_LAUNCH_TASK_DISPLAY_AREA_TOKEN = "android.activity.launchTaskDisplayAreaToken";
    public static final java.lang.String KEY_LAUNCH_TASK_FRAGMENT_TOKEN = "android.activity.launchTaskFragmentToken";
    private static final java.lang.String KEY_LAUNCH_TASK_ID = "android.activity.launchTaskId";
    private static final java.lang.String KEY_LAUNCH_WINDOWING_MODE = "android.activity.windowingMode";
    public static final java.lang.String KEY_LEGACY_PERMISSION_PROMPT_ELIGIBLE = "android:activity.legacyPermissionPromptEligible";
    private static final java.lang.String KEY_LOCK_TASK_MODE = "android:activity.lockTaskMode";
    private static final java.lang.String KEY_MOVABLE_TASK_REQUIRED = "android.activity.movableTaskRequired";
    private static final java.lang.String KEY_OVERRIDE_TASK_TRANSITION = "android:activity.overrideTaskTransition";
    public static final java.lang.String KEY_PACKAGE_NAME = "android:activity.packageName";
    private static final java.lang.String KEY_PENDING_INTENT_CREATOR_BACKGROUND_ACTIVITY_START_MODE = "android.activity.pendingIntentCreatorBackgroundActivityStartMode";
    private static final java.lang.String KEY_PENDING_INTENT_LAUNCH_FLAGS = "android.activity.pendingIntentLaunchFlags";
    private static final java.lang.String KEY_REMOTE_ANIMATION_ADAPTER = "android:activity.remoteAnimationAdapter";
    private static final java.lang.String KEY_REMOTE_TRANSITION = "android:activity.remoteTransition";
    private static final java.lang.String KEY_REMOVE_WITH_TASK_ORGANIZER = "android.activity.removeWithTaskOrganizer";
    private static final java.lang.String KEY_REPARENT_LEAF_TASK_TO_TDA = "android.activity.reparentLeafTaskToTda";
    private static final java.lang.String KEY_ROTATION_ANIMATION_HINT = "android:activity.rotationAnimationHint";
    private static final java.lang.String KEY_SCENE_TRANSITION_INFO = "android:activity.sceneTransitionInfo";
    private static final java.lang.String KEY_SHARED_SURFACE_ANIMATION = "android.window.sharedSurfaceAnimation";
    private static final java.lang.String KEY_SHARE_IDENTITY = "android:activity.shareIdentity";
    private static final java.lang.String KEY_SOURCE_INFO = "android.activity.sourceInfo";
    private static final java.lang.String KEY_SPLASH_SCREEN_STYLE = "android.activity.splashScreenStyle";
    public static final java.lang.String KEY_SPLASH_SCREEN_THEME = "android.activity.splashScreenTheme";
    private static final java.lang.String KEY_TASK_ALWAYS_ON_TOP = "android.activity.alwaysOnTop";
    private static final java.lang.String KEY_TASK_OVERLAY = "android.activity.taskOverlay";
    private static final java.lang.String KEY_TASK_OVERLAY_CAN_RESUME = "android.activity.taskOverlayCanResume";
    public static final java.lang.String KEY_TRANSIENT_LAUNCH = "android.activity.transientLaunch";
    private static final java.lang.String KEY_USAGE_TIME_REPORT = "android:activity.usageTimeReport";
    @java.lang.Deprecated
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOWED = 1;
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOW_ALWAYS = 3;
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOW_IF_VISIBLE = 4;
    public static final int MODE_BACKGROUND_ACTIVITY_START_COMPAT = -1;
    public static final int MODE_BACKGROUND_ACTIVITY_START_DENIED = 2;
    public static final int MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED = 0;
    private static final java.lang.String TAG = "ActivityOptions";
    private boolean mAllowPassThroughOnTouchOutside;
    private android.os.IRemoteCallback mAnimationAbortListener;
    private android.os.IRemoteCallback mAnimationFinishedListener;
    private android.os.IRemoteCallback mAnimationStartedListener;
    private int mAnimationType;
    private android.os.Bundle mAppVerificationBundle;
    private boolean mApplyActivityFlagsForBubbles;
    private boolean mApplyMultipleTaskFlagForShortcut;
    private boolean mApplyNoUserActionFlagForShortcut;
    private boolean mAvoidMoveToFront;
    private int mCallerDisplayId;
    private int mCustomBackgroundColor;
    private int mCustomEnterResId;
    private int mCustomExitResId;
    private int mCustomInPlaceResId;
    private boolean mDisableStartingWindow;
    private boolean mDisallowEnterPictureInPictureWhileLaunching;
    private boolean mDismissKeyguardIfInsecure;
    private boolean mFlexibleLaunchSize;
    private boolean mFreezeRecentTasksReordering;
    private int mHeight;
    private boolean mIsEligibleForLegacyPermissionPrompt;
    private int mLaunchActivityType;
    private android.graphics.Rect mLaunchBounds;
    private android.os.IBinder mLaunchCookie;
    private int mLaunchDisplayId;
    private android.app.PictureInPictureParams mLaunchIntoPipParams;
    private boolean mLaunchNextToBubble;
    private android.window.WindowContainerToken mLaunchRootTask;
    private android.window.WindowContainerToken mLaunchTaskDisplayArea;
    private int mLaunchTaskDisplayAreaFeatureId;
    private android.os.IBinder mLaunchTaskFragmentToken;
    private int mLaunchTaskId;
    private int mLaunchWindowingMode;
    private boolean mLaunchedFromBubble;
    private boolean mLockTaskMode;
    private boolean mMovableTaskRequired;
    private boolean mOverrideTaskTransition;
    private java.lang.String mPackageName;
    private int mPendingIntentCreatorBackgroundActivityStartMode;
    private int mPendingIntentLaunchFlags;
    private android.view.RemoteAnimationAdapter mRemoteAnimationAdapter;
    private android.window.RemoteTransition mRemoteTransition;
    private boolean mRemoveWithTaskOrganizer;
    private boolean mReparentLeafTaskToTda;
    private int mRotationAnimationHint;
    private android.app.ActivityOptions.SceneTransitionInfo mSceneTransitionInfo;
    private boolean mShareIdentity;
    private android.app.ActivityOptions.SharedSurfaceAnimationInfo mSharedSurfaceAnimationInfo;
    private android.app.ActivityOptions.SourceInfo mSourceInfo;
    private int mSplashScreenStyle;
    private java.lang.String mSplashScreenThemeResName;
    private int mStartX;
    private int mStartY;
    private boolean mTaskAlwaysOnTop;
    private boolean mTaskOverlay;
    private boolean mTaskOverlayCanResume;
    private android.graphics.Bitmap mThumbnail;
    private boolean mTransientLaunch;
    private android.app.PendingIntent mUsageTimeReport;
    private int mWidth;
    private ActivityOptions() { super(); }
    public ActivityOptions(android.os.Bundle p0) { super(); }
    public static void abort(android.app.ActivityOptions p0) {}
    public static android.app.ActivityOptions fromBundle(android.os.Bundle p0) { return null; }
    public static boolean hasLaunchTargetContainer(android.app.ActivityOptions p0) { return false; }
    public static android.app.ActivityOptions makeBasic() { return null; }
    public static android.app.ActivityOptions makeClipRevealAnimation(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, int p3) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, int p3, android.os.Handler p4, android.app.ActivityOptions.OnAnimationStartedListener p5) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, int p3, android.os.Handler p4, android.app.ActivityOptions.OnAnimationStartedListener p5, android.app.ActivityOptions.OnAnimationFinishedListener p6) { return null; }
    public static android.app.ActivityOptions makeCustomInPlaceAnimation(android.content.Context p0, int p1) { return null; }
    public static android.app.ActivityOptions makeCustomTaskAnimation(android.content.Context p0, int p1, int p2, android.os.Handler p3, android.app.ActivityOptions.OnAnimationStartedListener p4, android.app.ActivityOptions.OnAnimationFinishedListener p5) { return null; }
    public static android.app.ActivityOptions makeLaunchIntoPip(android.app.PictureInPictureParams p0) { return null; }
    public static android.app.ActivityOptions makeOpenCrossProfileAppsAnimation() { return null; }
    public static android.app.ActivityOptions makeRemoteAnimation(android.view.RemoteAnimationAdapter p0) { return null; }
    public static android.app.ActivityOptions makeRemoteAnimation(android.view.RemoteAnimationAdapter p0, android.window.RemoteTransition p1) { return null; }
    public static android.app.ActivityOptions makeRemoteTransition(android.window.RemoteTransition p0) { return null; }
    public static android.app.ActivityOptions makeScaleUpAnimation(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
    static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.app.ExitTransitionCoordinator p1, java.util.ArrayList<java.lang.String> p2, int p3, android.content.Intent p4) { return null; }
    public static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.view.View p1, java.lang.String p2) { return null; }
    @java.lang.SafeVarargs
    public static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.util.Pair<android.view.View, java.lang.String>... p1) { return null; }
    static android.app.ExitTransitionCoordinator makeSceneTransitionAnimation(android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p0, android.app.SharedElementCallback p1, android.view.Window p2, android.app.ActivityOptions p3, android.util.Pair<android.view.View, java.lang.String>[] p4) { return null; }
    @java.lang.Deprecated
    public static android.app.ActivityOptions makeTaskLaunchBehind() { return null; }
    private static android.app.ActivityOptions makeThumbnailAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, android.app.ActivityOptions.OnAnimationStartedListener p4, boolean p5) { return null; }
    public static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3) { return null; }
    private static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, android.app.ActivityOptions.OnAnimationStartedListener p4) { return null; }
    private void sendResultIgnoreErrors(android.os.IRemoteCallback p0, android.os.Bundle p1) {}
    public static void setExitTransitionTimeout(long p0) {}
    private void setOnAnimationFinishedListener(android.os.Handler p0, android.app.ActivityOptions.OnAnimationFinishedListener p1) {}
    private void setOnAnimationStartedListener(android.os.Handler p0, android.app.ActivityOptions.OnAnimationStartedListener p1) {}
    @java.lang.SafeVarargs
    public static android.util.Pair<android.app.ActivityOptions, android.app.ExitTransitionCoordinator> startSharedElementAnimation(android.view.Window p0, android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p1, android.app.SharedElementCallback p2, android.util.Pair<android.view.View, java.lang.String>... p3) { return null; }
    public static void stopSharedElementAnimation(android.view.Window p0) {}
    public void abort() {}
    public boolean canTaskOverlayResume() { return false; }
    public boolean disallowEnterPictureInPictureWhileLaunching() { return false; }
    public android.app.ActivityOptions forTargetActivity() { return null; }
    public boolean freezeRecentTasksReordering() { return false; }
    public android.os.IRemoteCallback getAnimationFinishedListener() { return null; }
    public android.os.IRemoteCallback getAnimationStartedListener() { return null; }
    public int getAnimationType() { return 0; }
    public boolean getAvoidMoveToFront() { return false; }
    public int getCallerDisplayId() { return 0; }
    public int getCustomBackgroundColor() { return 0; }
    public int getCustomEnterResId() { return 0; }
    public int getCustomExitResId() { return 0; }
    public int getCustomInPlaceResId() { return 0; }
    public boolean getDisableStartingWindow() { return false; }
    public boolean getDismissKeyguardIfInsecure() { return false; }
    public boolean getFlexibleLaunchSize() { return false; }
    public int getHeight() { return 0; }
    public int getLaunchActivityType() { return 0; }
    public android.graphics.Rect getLaunchBounds() { return null; }
    public android.os.IBinder getLaunchCookie() { return null; }
    public int getLaunchDisplayId() { return 0; }
    public android.app.PictureInPictureParams getLaunchIntoPipParams() { return null; }
    public boolean getLaunchNextToBubble() { return false; }
    public android.window.WindowContainerToken getLaunchRootTask() { return null; }
    public boolean getLaunchTaskBehind() { return false; }
    public android.window.WindowContainerToken getLaunchTaskDisplayArea() { return null; }
    public int getLaunchTaskDisplayAreaFeatureId() { return 0; }
    public android.os.IBinder getLaunchTaskFragmentToken() { return null; }
    @android.annotation.SystemApi
    public int getLaunchTaskId() { return 0; }
    public int getLaunchWindowingMode() { return 0; }
    public boolean getLaunchedFromBubble() { return false; }
    public boolean getLockTaskMode() { return false; }
    public boolean getOverrideTaskTransition() { return false; }
    public java.lang.String getPackageName() { return null; }
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    public int getPendingIntentCreatorBackgroundActivityStartMode() { return 0; }
    public int getPendingIntentLaunchFlags() { return 0; }
    public android.view.RemoteAnimationAdapter getRemoteAnimationAdapter() { return null; }
    public android.window.RemoteTransition getRemoteTransition() { return null; }
    public boolean getRemoveWithTaskOranizer() { return false; }
    public boolean getReparentLeafTaskToTda() { return false; }
    public int getRotationAnimationHint() { return 0; }
    public android.app.ActivityOptions.SceneTransitionInfo getSceneTransitionInfo() { return null; }
    public android.app.ActivityOptions.SharedSurfaceAnimationInfo getSharedSurfaceAnimationInfo() { return null; }
    public android.app.ActivityOptions.SourceInfo getSourceInfo() { return null; }
    public int getSplashScreenStyle() { return 0; }
    public java.lang.String getSplashScreenThemeResName() { return null; }
    public int getStartX() { return 0; }
    public int getStartY() { return 0; }
    public boolean getTaskAlwaysOnTop() { return false; }
    public boolean getTaskOverlay() { return false; }
    public android.hardware.HardwareBuffer getThumbnail() { return null; }
    public boolean getTransientLaunch() { return false; }
    public android.app.PendingIntent getUsageTimeReport() { return null; }
    public int getWidth() { return 0; }
    public boolean isAllowPassThroughOnTouchOutside() { return false; }
    public boolean isApplyActivityFlagsForBubbles() { return false; }
    public boolean isApplyMultipleTaskFlagForShortcut() { return false; }
    public boolean isApplyNoUserActionFlagForShortcut() { return false; }
    public boolean isEligibleForLegacyPermissionPrompt() { return false; }
    public boolean isLaunchIntoPip() { return false; }
    public boolean isMovableTaskRequired() { return false; }
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    public boolean isShareIdentityEnabled() { return false; }
    public android.os.Bundle popAppVerificationBundle() { return null; }
    public void requestUsageTimeReport(android.app.PendingIntent p0) {}
    public void setAllowPassThroughOnTouchOutside(boolean p0) {}
    public android.app.ActivityOptions setAppVerificationBundle(android.os.Bundle p0) { return null; }
    public void setApplyActivityFlagsForBubbles(boolean p0) {}
    public void setApplyMultipleTaskFlagForShortcut(boolean p0) {}
    public void setApplyNoUserActionFlagForShortcut(boolean p0) {}
    public void setAvoidMoveToFront() {}
    public android.app.ActivityOptions setCallerDisplayId(int p0) { return null; }
    public void setDisableStartingWindow(boolean p0) {}
    public void setDisallowEnterPictureInPictureWhileLaunching(boolean p0) {}
    public void setDismissKeyguardIfInsecure() {}
    public void setEligibleForLegacyPermissionPrompt(boolean p0) {}
    public android.app.ActivityOptions setFlexibleLaunchSize(boolean p0) { return null; }
    public void setFreezeRecentTasksReordering() {}
    public void setLaunchActivityType(int p0) {}
    public android.app.ActivityOptions setLaunchBounds(android.graphics.Rect p0) { return null; }
    public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) {}
    public void setLaunchCookie(android.os.IBinder p0) {}
    public android.app.ActivityOptions setLaunchDisplayId(int p0) { return null; }
    public android.app.ActivityOptions setLaunchNextToBubble(boolean p0) { return null; }
    public android.app.ActivityOptions setLaunchRootTask(android.window.WindowContainerToken p0) { return null; }
    public android.app.ActivityOptions setLaunchTaskDisplayArea(android.window.WindowContainerToken p0) { return null; }
    public void setLaunchTaskDisplayAreaFeatureId(int p0) {}
    public android.app.ActivityOptions setLaunchTaskFragmentToken(android.os.IBinder p0) { return null; }
    @android.annotation.SystemApi
    public void setLaunchTaskId(int p0) {}
    public void setLaunchWindowingMode(int p0) {}
    public void setLaunchedFromBubble(boolean p0) {}
    public android.app.ActivityOptions setLockTaskEnabled(boolean p0) { return null; }
    public android.app.ActivityOptions setMovableTaskRequired(boolean p0) { return null; }
    public void setOnAnimationAbortListener(android.os.IRemoteCallback p0) {}
    public void setOnAnimationFinishedListener(android.os.IRemoteCallback p0) {}
    public android.app.ActivityOptions setOverrideTaskTransition(boolean p0) { return null; }
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    public android.app.ActivityOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    public android.app.ActivityOptions setPendingIntentCreatorBackgroundActivityStartMode(int p0) { return null; }
    public void setPendingIntentLaunchFlags(int p0) {}
    public void setRemoteAnimationAdapter(android.view.RemoteAnimationAdapter p0) {}
    public android.app.ActivityOptions setRemoteTransition(android.window.RemoteTransition p0) { return null; }
    public void setRemoveWithTaskOrganizer(boolean p0) {}
    public void setReparentLeafTaskToTda(boolean p0) {}
    public void setRotationAnimationHint(int p0) {}
    public android.app.ActivityOptions setSceneTransitionInfo(android.app.ActivityOptions.SceneTransitionInfo p0) { return null; }
    public android.app.ActivityOptions setShareIdentityEnabled(boolean p0) { return null; }
    public android.app.ActivityOptions setSharedSurfaceAnimationProvider(android.window.sharedsurface.SharedSurfaceDispatcher p0, android.window.sharedsurface.SharedAnimationProvider p1) { return null; }
    public void setSourceInfo(int p0, long p1) {}
    public android.app.ActivityOptions setSplashScreenStyle(int p0) { return null; }
    public void setSplitScreenCreateMode(int p0) {}
    public void setTaskAlwaysOnTop(boolean p0) {}
    public void setTaskOverlay(boolean p0, boolean p1) {}
    public android.app.ActivityOptions setTransientLaunch() { return null; }
    public android.os.Bundle toBundle() { return null; }
    public java.lang.String toString() { return null; }
    public void update(android.app.ActivityOptions p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackgroundActivityStartMode {
    }

    public static final class LaunchCookie implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityOptions.LaunchCookie> CREATOR = null;
        public final android.os.IBinder binder = null;
        public LaunchCookie() {}
        private LaunchCookie(android.os.IBinder p0) {}
        public LaunchCookie(java.lang.String p0) {}
        public static android.app.ActivityOptions.LaunchCookie readFromParcel(android.os.Parcel p0) { return null; }
        public static void writeToParcel(android.app.ActivityOptions.LaunchCookie p0, android.os.Parcel p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface OnAnimationFinishedListener {
        public void onAnimationFinished(long p0);
    }

    public static interface OnAnimationStartedListener {
        public void onAnimationStarted(long p0);
    }

    public static class SceneTransitionInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityOptions.SceneTransitionInfo> CREATOR = null;
        private int mExitCoordinatorIndex;
        private boolean mIsReturning;
        private int mResultCode;
        private android.content.Intent mResultData;
        private android.os.ResultReceiver mResultReceiver;
        private java.util.ArrayList<java.lang.String> mSharedElementNames;
        public SceneTransitionInfo() {}
        SceneTransitionInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public int getExitCoordinatorKey() { return 0; }
        public int getResultCode() { return 0; }
        public android.content.Intent getResultData() { return null; }
        public android.os.ResultReceiver getResultReceiver() { return null; }
        public java.util.ArrayList<java.lang.String> getSharedElementNames() { return null; }
        boolean isCrossTask() { return false; }
        public boolean isReturning() { return false; }
        public void setExitCoordinatorKey(int p0) {}
        public void setResultCode(int p0) {}
        public void setResultData(android.content.Intent p0) {}
        public void setResultReceiver(android.os.ResultReceiver p0) {}
        public void setReturning(boolean p0) {}
        public void setSharedElementNames(java.util.ArrayList<java.lang.String> p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SharedSurfaceAnimationInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityOptions.SharedSurfaceAnimationInfo> CREATOR = null;
        final android.window.sharedsurface.ISharedAnimationProvider mISharedAnimationProvider = null;
        final android.view.IWindow mPivotWindow = null;
        final android.window.sharedsurface.SharedAnimationParams mSharedAnimationParams = null;
        private SharedSurfaceAnimationInfo(android.os.Parcel p0) {}
        public SharedSurfaceAnimationInfo(android.view.IWindow p0, android.window.sharedsurface.ISharedAnimationProvider p1, android.window.sharedsurface.SharedAnimationParams p2) {}
        public int describeContents() { return 0; }
        public android.window.sharedsurface.ISharedAnimationProvider getISharedAnimationProvider() { return null; }
        public android.view.IWindow getPivotWindow() { return null; }
        public android.window.sharedsurface.SharedAnimationParams getSharedAnimationParams() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SourceInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityOptions.SourceInfo> CREATOR = null;
        public static final int TYPE_COMPLICATION = 8;
        public static final int TYPE_DESKTOP_ANIMATION = 5;
        public static final int TYPE_LAUNCHER = 1;
        public static final int TYPE_LOCKSCREEN = 3;
        public static final int TYPE_NOTIFICATION = 2;
        public static final int TYPE_ONGOING_LIVE_UPDATE = 9;
        public static final int TYPE_QSS = 6;
        public static final int TYPE_RECENTS_ANIMATION = 4;
        public static final int TYPE_TILE = 7;
        public final long eventTimeMs = 0L;
        public final int type = 0;
        SourceInfo(int p0, long p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SourceType {
        }
    }
}
