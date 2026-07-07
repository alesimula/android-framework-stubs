package android.window;

public final class TransitionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TransitionInfo> CREATOR = null;
    public static final int FLAGS_IS_NON_APP_WINDOW = 65794;
    public static final int FLAGS_IS_OCCLUDED_NO_ANIMATION = 294912;
    public static final int FLAG_ALWAYS_ON_TOP = 16777216;
    public static final int FLAG_BACK_GESTURE_ANIMATED = 131072;
    public static final int FLAG_CHANGED_INTERACTIVE = 33554432;
    public static final int FLAG_CONFIG_AT_END = 4194304;
    public static final int FLAG_CROSS_PROFILE_OWNER_THUMBNAIL = 4096;
    public static final int FLAG_CROSS_PROFILE_WORK_THUMBNAIL = 8192;
    public static final int FLAG_DISPLAY_HAS_ALERT_WINDOWS = 128;
    public static final int FLAG_FILLS_TASK = 1024;
    public static final int FLAG_FIRST_CUSTOM = 134217728;
    public static final int FLAG_INVISIBLE = 67108864;
    public static final int FLAG_IN_TASK_WITH_EMBEDDED_ACTIVITY = 512;
    public static final int FLAG_IS_BEHIND_STARTING_WINDOW = 16384;
    public static final int FLAG_IS_DISPLAY = 32;
    public static final int FLAG_IS_INPUT_METHOD = 256;
    public static final int FLAG_IS_OCCLUDED = 32768;
    public static final int FLAG_IS_SYSTEM_WINDOW = 65536;
    public static final int FLAG_IS_TASK_DISPLAY_AREA = 8388608;
    public static final int FLAG_IS_VOICE_INTERACTION = 16;
    public static final int FLAG_IS_WALLPAPER = 2;
    public static final int FLAG_MOVED_TO_TOP = 1048576;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_NO_ANIMATION = 262144;
    public static final int FLAG_SHOW_WALLPAPER = 1;
    public static final int FLAG_STARTING_WINDOW_TRANSFER_RECIPIENT = 8;
    public static final int FLAG_SYNC = 2097152;
    public static final int FLAG_TASK_LAUNCHING_BEHIND = 524288;
    public static final int FLAG_TRANSLUCENT = 4;
    public static final int FLAG_WILL_IME_SHOWN = 2048;
    private static final java.lang.String TAG = "TransitionInfo";
    private final java.util.ArrayList<android.window.TransitionInfo.Change> mChanges = null;
    private int mDebugId;
    private int mFlags;
    private final java.util.ArrayList<android.window.TransitionInfo.Root> mRoots = null;
    private int mTrack;
    private final int mType = 0;
    public TransitionInfo(int p0, int p1) {}
    private TransitionInfo(android.os.Parcel p0) {}
    public static java.lang.String flagsToString(int p0) { return null; }
    public static boolean isCrossDisplay(int p0, int p1) { return false; }
    public static boolean isIndependent(android.window.TransitionInfo.Change p0, android.window.TransitionInfo p1) { return false; }
    public static java.lang.String modeToString(int p0) { return null; }
    public void addChange(android.window.TransitionInfo.Change p0) {}
    public void addRoot(android.window.TransitionInfo.Root p0) {}
    public void addRootLeash(int p0, android.view.SurfaceControl p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public int findRootIndex(int p0) { return 0; }
    public android.window.TransitionInfo.Change getChange(android.window.WindowContainerToken p0) { return null; }
    public java.util.List<android.window.TransitionInfo.Change> getChanges() { return null; }
    public int getDebugId() { return 0; }
    public int getFlags() { return 0; }
    public android.window.TransitionInfo.Root getRoot(int p0) { return null; }
    public int getRootCount() { return 0; }
    @java.lang.Deprecated
    public android.view.SurfaceControl getRootLeash() { return null; }
    public int getTrack() { return 0; }
    public int getType() { return 0; }
    public boolean hasChangesOrSideEffects() { return false; }
    public boolean isKeyguardGoingAway() { return false; }
    public android.window.TransitionInfo localRemoteCopy() { return null; }
    public void releaseAllSurfaces() {}
    public void releaseAnimSurfaces() {}
    public android.window.TransitionInfo.Change removeChangeFor(android.window.WindowContainerToken p0) { return null; }
    public void setDebugId(int p0) {}
    public void setFlags(int p0) {}
    public void setTrack(int p0) {}
    public void setUnreleasedWarningCallSiteForAllSurfaces(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public java.lang.String toString(java.lang.String p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class AnimationOptions implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.AnimationOptions> CREATOR = null;
        public static final int DEFAULT_ANIMATION_RESOURCES_ID = -1;
        private int mAnimations;
        private int mBackgroundColor;
        private int mChangeResId;
        private android.window.TransitionInfo.AnimationOptions.CustomActivityTransition mCustomActivityCloseTransition;
        private android.window.TransitionInfo.AnimationOptions.CustomActivityTransition mCustomActivityOpenTransition;
        private int mEnterResId;
        private int mExitResId;
        private boolean mOverrideTaskTransition;
        private java.lang.String mPackageName;
        private android.window.sharedsurface.SharedSurfaceProviderInfo mSharedSurfaceProviderInfo;
        private android.hardware.HardwareBuffer mThumbnail;
        private final android.graphics.Rect mTransitionBounds = null;
        private int mType;
        private int mUserId;
        private AnimationOptions(int p0) {}
        private AnimationOptions(android.os.Parcel p0) {}
        public static android.window.TransitionInfo.AnimationOptions makeAnimOptionsFromLayoutParameters(android.view.WindowManager.LayoutParams p0) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeClipRevealAnimOptions(int p0, int p1, int p2, int p3) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeCommonAnimOptions(java.lang.String p0) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeCrossProfileAnimOptions() { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeCustomAnimOptions(java.lang.String p0, int p1, int p2, int p3, boolean p4) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeScaleUpAnimOptions(int p0, int p1, int p2, int p3, boolean p4) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeSceneTransitionAnimOptions() { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeThumbnailAnimOptions(android.hardware.HardwareBuffer p0, int p1, int p2, boolean p3) { return null; }
        private static java.lang.String typeToString(int p0) { return null; }
        public void addCustomActivityTransition(boolean p0, int p1, int p2, int p3) {}
        public void addOptionsFromLayoutParameters(android.view.WindowManager.LayoutParams p0) {}
        public int describeContents() { return 0; }
        public int getAnimations() { return 0; }
        public int getChangeResId() { return 0; }
        public android.window.TransitionInfo.AnimationOptions.CustomActivityTransition getCustomActivityTransition(boolean p0) { return null; }
        public int getEnterResId() { return 0; }
        public int getExitResId() { return 0; }
        public boolean getOverrideTaskTransition() { return false; }
        public java.lang.String getPackageName() { return null; }
        public android.window.sharedsurface.SharedSurfaceProviderInfo getSharedSurfaceProviderInfo() { return null; }
        public android.hardware.HardwareBuffer getThumbnail() { return null; }
        public android.graphics.Rect getTransitionBounds() { return null; }
        public int getType() { return 0; }
        public int getUserId() { return 0; }
        public void setSharedAnimationProvider(android.window.sharedsurface.SharedSurfaceProviderInfo p0) {}
        public void setUserId(int p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class CustomActivityTransition implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.window.TransitionInfo.AnimationOptions.CustomActivityTransition> CREATOR = null;
            private int mCustomBackgroundColor;
            private int mCustomEnterResId;
            private int mCustomExitResId;
            CustomActivityTransition() {}
            CustomActivityTransition(android.os.Parcel p0) {}
            public void addCustomActivityTransition(int p0, int p1, int p2) {}
            public int describeContents() { return 0; }
            public int getCustomBackgroundColor() { return 0; }
            public int getCustomEnterResId() { return 0; }
            public int getCustomExitResId() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static final class Change implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.Change> CREATOR = null;
        private android.window.ActivityTransitionInfo mActivityTransitionInfo;
        private boolean mAllowEnterPip;
        private android.window.TransitionInfo.AnimationOptions mAnimationOptions;
        private int mBackgroundColor;
        private final android.window.WindowContainerToken mContainer = null;
        private final android.graphics.Rect mEndAbsBounds = null;
        private int mEndDisplayId;
        private int mEndFixedRotation;
        private final android.graphics.Point mEndParentSize = null;
        private final android.graphics.Point mEndRelOffset = null;
        private int mEndRotation;
        private int mFlags;
        private android.window.WindowContainerToken mLastParent;
        private android.view.SurfaceControl mLeash;
        private int mMode;
        private android.window.WindowContainerToken mParent;
        private int mRotationAnimation;
        private android.view.SurfaceControl mSnapshot;
        private float mSnapshotLuma;
        private final android.graphics.Rect mStartAbsBounds = null;
        private int mStartDisplayId;
        private int mStartRotation;
        private android.os.IBinder mTaskFragmentToken;
        private android.app.ActivityManager.RunningTaskInfo mTaskInfo;
        private android.view.SurfaceControl mTopCompatActivityLeash;
        private Change(android.os.Parcel p0) {}
        public Change(android.window.WindowContainerToken p0, android.view.SurfaceControl p1) {}
        private android.window.TransitionInfo.Change localRemoteCopy() { return null; }
        public int describeContents() { return 0; }
        public android.content.ComponentName getActivityComponent() { return null; }
        public android.window.ActivityTransitionInfo getActivityTransitionInfo() { return null; }
        public android.window.TransitionInfo.AnimationOptions getAnimationOptions() { return null; }
        public int getBackgroundColor() { return 0; }
        public android.window.WindowContainerToken getContainer() { return null; }
        public android.graphics.Rect getEndAbsBounds() { return null; }
        public int getEndDisplayId() { return 0; }
        public int getEndFixedRotation() { return 0; }
        public android.graphics.Point getEndParentSize() { return null; }
        public android.graphics.Point getEndRelOffset() { return null; }
        public int getEndRotation() { return 0; }
        public int getFlags() { return 0; }
        public android.window.WindowContainerToken getLastParent() { return null; }
        public android.view.SurfaceControl getLeash() { return null; }
        public int getMode() { return 0; }
        public android.window.WindowContainerToken getParent() { return null; }
        public int getRotationAnimation() { return 0; }
        public android.view.SurfaceControl getSnapshot() { return null; }
        public float getSnapshotLuma() { return 0.0f; }
        public android.graphics.Rect getStartAbsBounds() { return null; }
        public int getStartDisplayId() { return 0; }
        public int getStartRotation() { return 0; }
        public android.os.IBinder getTaskFragmentToken() { return null; }
        public android.app.ActivityManager.RunningTaskInfo getTaskInfo() { return null; }
        public android.view.SurfaceControl getTopCompatActivityLeash() { return null; }
        public boolean hasAllFlags(int p0) { return false; }
        public boolean hasAnyFlag(int p0) { return false; }
        @java.lang.Deprecated
        public boolean hasFlags(int p0) { return false; }
        public boolean isAllowEnterPip() { return false; }
        public boolean isCrossDisplay() { return false; }
        public void setActivityTransitionInfo(android.window.ActivityTransitionInfo p0) {}
        public void setAllowEnterPip(boolean p0) {}
        public void setAnimationOptions(android.window.TransitionInfo.AnimationOptions p0) {}
        public void setBackgroundColor(int p0) {}
        public void setDisplayId(int p0, int p1) {}
        public void setEndAbsBounds(android.graphics.Rect p0) {}
        public void setEndFixedRotation(int p0) {}
        public void setEndParentSize(int p0, int p1) {}
        public void setEndRelOffset(int p0, int p1) {}
        public void setFlags(int p0) {}
        public void setLastParent(android.window.WindowContainerToken p0) {}
        public void setLeash(android.view.SurfaceControl p0) {}
        public void setMode(int p0) {}
        public void setParent(android.window.WindowContainerToken p0) {}
        public void setRotation(int p0, int p1) {}
        public void setRotationAnimation(int p0) {}
        public void setSnapshot(android.view.SurfaceControl p0, float p1) {}
        public void setStartAbsBounds(android.graphics.Rect p0) {}
        public void setTaskFragmentToken(android.os.IBinder p0) {}
        public void setTaskInfo(android.app.ActivityManager.RunningTaskInfo p0) {}
        public void setTopCompatActivityLeash(android.view.SurfaceControl p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ChangeFlags {
    }

    public static final class Root implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.Root> CREATOR = null;
        private final int mDisplayId = 0;
        private final android.view.SurfaceControl mLeash = null;
        private final android.graphics.Point mOffset = null;
        public Root(int p0, android.view.SurfaceControl p1, int p2, int p3) {}
        private Root(android.os.Parcel p0) {}
        private android.window.TransitionInfo.Root localRemoteCopy() { return null; }
        public int describeContents() { return 0; }
        public int getDisplayId() { return 0; }
        public android.view.SurfaceControl getLeash() { return null; }
        public android.graphics.Point getOffset() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionMode {
    }
}
