package android.window;

public final class WindowContainerTransaction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction> CREATOR = null;
    public static final int FLAG_DROP_DURING_DISPLAY_CHANGE = 1;
    private final android.util.ArrayMap<android.os.IBinder, android.window.WindowContainerTransaction.Change> mChanges = null;
    private android.os.IBinder mErrorCallbackToken;
    private int mFlags;
    private final java.util.ArrayList<android.window.WindowContainerTransaction.HierarchyOp> mHierarchyOps = null;
    private android.window.ITaskFragmentOrganizer mTaskFragmentOrganizer;
    public WindowContainerTransaction() {}
    private WindowContainerTransaction(android.os.Parcel p0) {}
    private android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, android.view.InsetsFrameProvider p2) { return null; }
    private android.window.WindowContainerTransaction.Change getOrCreateChange(android.os.IBinder p0) { return null; }
    @java.lang.Deprecated
    public android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3, android.graphics.Insets p4, android.graphics.Rect[] p5, int p6) { return null; }
    public android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3, android.graphics.Insets p4, android.view.InsetsBoundingRect[] p5, int p6) { return null; }
    @java.lang.Deprecated
    public android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3, android.graphics.Rect p4, android.graphics.Rect[] p5, int p6) { return null; }
    public android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3, android.graphics.Rect p4, android.view.InsetsBoundingRect[] p5, int p6) { return null; }
    public android.window.WindowContainerTransaction addKeyguardState(android.window.KeyguardState p0) { return null; }
    public android.window.WindowContainerTransaction addTaskFragmentOperation(android.os.IBinder p0, android.window.TaskFragmentOperation p1) { return null; }
    public void clear() {}
    public android.window.WindowContainerTransaction clearAdjacentRoots(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction clearAdjacentTaskFragments(android.os.IBinder p0) { return null; }
    public android.window.WindowContainerTransaction clearLaunchAdjacentFlagRoot(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction continuePackageUpdate(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction createTaskFragment(android.window.TaskFragmentCreationParams p0) { return null; }
    public android.window.WindowContainerTransaction deferConfigToTransitionEnd(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction deleteTaskFragment(android.os.IBinder p0) { return null; }
    public int describeContents() { return 0; }
    public android.window.WindowContainerTransaction finishActivity(android.os.IBinder p0) { return null; }
    public java.util.Map<android.os.IBinder, android.window.WindowContainerTransaction.Change> getChanges() { return null; }
    public android.os.IBinder getErrorCallbackToken() { return null; }
    public int getFlags() { return 0; }
    public java.util.List<android.window.WindowContainerTransaction.HierarchyOp> getHierarchyOps() { return null; }
    public android.window.ITaskFragmentOrganizer getTaskFragmentOrganizer() { return null; }
    public boolean isEmpty() { return false; }
    public void merge(android.window.WindowContainerTransaction p0, boolean p1) {}
    public android.window.WindowContainerTransaction movePipActivityToPinnedRootTask(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction removeInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3) { return null; }
    public android.window.WindowContainerTransaction removeRootTask(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction removeTask(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction removeTask(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction removeTask(android.window.WindowContainerToken p0, boolean p1, boolean p2) { return null; }
    public android.window.WindowContainerTransaction reorder(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction reorder(android.window.WindowContainerToken p0, boolean p1, boolean p2) { return null; }
    public android.window.WindowContainerTransaction reparent(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, boolean p2) { return null; }
    public android.window.WindowContainerTransaction reparentActivityToTaskFragment(android.os.IBinder p0, android.os.IBinder p1) { return null; }
    public android.window.WindowContainerTransaction reparentTasks(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, int[] p2, int[] p3, boolean p4) { return null; }
    public android.window.WindowContainerTransaction reparentTasks(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, int[] p2, int[] p3, boolean p4, boolean p5) { return null; }
    public android.window.WindowContainerTransaction reparentTasks(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, int[] p2, int[] p3, boolean p4, boolean p5, boolean p6) { return null; }
    public android.window.WindowContainerTransaction requestFocusOnTaskFragment(android.os.IBinder p0) { return null; }
    public android.window.WindowContainerTransaction restoreBackNavi() { return null; }
    public android.window.WindowContainerTransaction restoreTransientOrder(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction scheduleFinishEnterPip(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction sendPendingIntent(android.app.PendingIntent p0, android.content.Intent p1, android.os.Bundle p2) { return null; }
    public android.window.WindowContainerTransaction setActivityWindowingMode(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setAdjacentRoots(android.window.WindowContainerToken... p0) { return null; }
    public android.window.WindowContainerTransaction setAdjacentTaskFragments(android.os.IBinder p0, android.os.IBinder p1, android.window.WindowContainerTransaction.TaskFragmentAdjacentParams p2) { return null; }
    public android.window.WindowContainerTransaction setAlwaysOnTop(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setAnimationDelegate(android.os.IBinder p0) { return null; }
    public android.window.WindowContainerTransaction setAppBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setBoundsChangeTransaction(android.window.WindowContainerToken p0, android.view.SurfaceControl.Transaction p1) { return null; }
    public void setCanDropDuringDisplayChange(boolean p0) {}
    public android.window.WindowContainerTransaction setCompanionTaskFragment(android.os.IBinder p0, android.os.IBinder p1, android.os.IBinder p2) { return null; }
    public android.window.WindowContainerTransaction setDensityDpi(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setDisableLaunchAdjacent(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setDisablePip(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setDisallowOverrideBoundsForChildren(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setDisallowOverrideWindowingModeForChildren(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setDoNotPip(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction setDragResizing(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setErrorCallbackToken(android.os.IBinder p0) { return null; }
    public android.window.WindowContainerTransaction setExcludeImeInsets(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setFocusable(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setForceTranslucent(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setFullscreenRequestAllowMode(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setHandlePackageUpdateForRootContainer(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setHidden(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setIgnoreOrientationRequest(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setInterceptBackPressedOnTaskRoot(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setIsTaskMoveAllowed(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setLaunchAdjacentFlagRoot(android.window.WindowContainerToken p0) { return null; }
    public android.window.WindowContainerTransaction setLaunchNextToBubble(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setLaunchRoot(android.window.WindowContainerToken p0, int[] p1, int[] p2) { return null; }
    public android.window.WindowContainerTransaction setPreserveLeafTaskIfRelaunch(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setReachabilityOffset(android.window.WindowContainerToken p0, int p1, int p2, int p3) { return null; }
    public android.window.WindowContainerTransaction setRelativeBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setReparentLeafTaskIfRelaunch(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setSafeRegionBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setScreenSizeDp(android.window.WindowContainerToken p0, int p1, int p2) { return null; }
    public android.window.WindowContainerTransaction setSelfMovable(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setSmallestScreenWidthDp(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setSystemBarVisibilityOverride(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3) { return null; }
    public android.window.WindowContainerTransaction setTaskForceExcludedFromRecents(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setTaskFragmentOrganizer(android.window.ITaskFragmentOrganizer p0) { return null; }
    public android.window.WindowContainerTransaction setTaskTrimmableFromRecents(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setWindowDecorationTransaction(android.window.WindowContainerToken p0, int p1, android.view.SurfaceControl.Transaction p2) { return null; }
    public android.window.WindowContainerTransaction setWindowingMode(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction startActivityInTaskFragment(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, android.os.Bundle p3) { return null; }
    public android.window.WindowContainerTransaction startShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.os.Bundle p2) { return null; }
    public android.window.WindowContainerTransaction startTask(int p0, android.os.Bundle p1) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Change implements android.os.Parcelable {
        public static final int CHANGE_BOUNDS_TRANSACTION = 2;
        public static final int CHANGE_DISABLE_LAUNCH_ADJACENT = 4096;
        public static final int CHANGE_DISABLE_PIP = 2048;
        public static final int CHANGE_DISALLOW_OVERRIDE_BOUNDS_FOR_CHILDREN = 131072;
        public static final int CHANGE_DISALLOW_OVERRIDE_WINDOWING_MODE_FOR_CHILDREN = 262144;
        public static final int CHANGE_DRAG_RESIZING = 128;
        public static final int CHANGE_FOCUSABLE = 1;
        public static final int CHANGE_FORCE_EXCLUDED_FROM_RECENTS = 512;
        public static final int CHANGE_FORCE_NO_PIP = 32;
        public static final int CHANGE_FORCE_TRANSLUCENT = 64;
        public static final int CHANGE_FULLSCREEN_REQUEST_ALLOW_MODE = 65536;
        public static final int CHANGE_HANDLE_PACKAGE_UPDATE = 32768;
        public static final int CHANGE_HIDDEN = 8;
        public static final int CHANGE_IGNORE_ORIENTATION_REQUEST = 16;
        public static final int CHANGE_INTERCEPT_BACK_PRESSED = 16384;
        public static final int CHANGE_IS_TASK_MOVE_ALLOWED = 8192;
        public static final int CHANGE_LAUNCH_NEXT_TO_BUBBLE = 1024;
        public static final int CHANGE_PIP_CALLBACK = 4;
        public static final int CHANGE_RELATIVE_BOUNDS = 256;
        public static final int CHANGE_WINDOW_DECORATION_TRANSACTION = 524288;
        public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction.Change> CREATOR = null;
        private int mActivityWindowingMode;
        private android.view.SurfaceControl.Transaction mBoundsChangeTransaction;
        private int mChangeMask;
        private boolean mConfigAtTransitionEnd;
        private int mConfigSetMask;
        private final android.content.res.Configuration mConfiguration = null;
        private boolean mDisableLaunchAdjacent;
        private boolean mDisablePip;
        private boolean mDisallowOverrideBoundsForChildren;
        private boolean mDisallowOverrideWindowingModeForChildren;
        private boolean mDragResizing;
        private boolean mFocusable;
        private boolean mForceExcludedFromRecents;
        private boolean mForceTranslucent;
        private int mFullscreenRequestAllowMode;
        private boolean mHandlePackageUpdate;
        private boolean mHidden;
        private boolean mIgnoreOrientationRequest;
        private boolean mInterceptBackPressed;
        private boolean mIsTaskMoveAllowed;
        private boolean mLaunchNextToBubble;
        private android.graphics.Rect mRelativeBounds;
        private int mSelfMovable;
        private int mSeqId;
        private android.view.SurfaceControl.Transaction mWindowDecorationTransaction;
        private int mWindowSetMask;
        private int mWindowingMode;
        private Change() {}
        private Change(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public int getActivityWindowingMode() { return 0; }
        public android.view.SurfaceControl.Transaction getBoundsChangeTransaction() { return null; }
        public int getChangeMask() { return 0; }
        public boolean getConfigAtTransitionEnd() { return false; }
        public int getConfigSetMask() { return 0; }
        public android.content.res.Configuration getConfiguration() { return null; }
        public boolean getDisableLaunchAdjacent() { return false; }
        public boolean getDisablePip() { return false; }
        public boolean getDisallowOverrideBoundsForChildren() { return false; }
        public boolean getDisallowOverrideWindowingModeForChildren() { return false; }
        public boolean getDragResizing() { return false; }
        public boolean getFocusable() { return false; }
        public boolean getForceExcludedFromRecents() { return false; }
        public boolean getForceTranslucent() { return false; }
        public int getFullscreenRequestAllowMode() { return 0; }
        public boolean getHandlePackageUpdate() { return false; }
        public boolean getHidden() { return false; }
        public boolean getIgnoreOrientationRequest() { return false; }
        public boolean getInterceptBackPressed() { return false; }
        public boolean getIsTaskMoveAllowed() { return false; }
        public boolean getLaunchNextToBubble() { return false; }
        public android.graphics.Rect getRelativeBounds() { return null; }
        public int getSelfMovable() { return 0; }
        public int getSeqId() { return 0; }
        public android.view.SurfaceControl.Transaction getWindowDecorationTransaction() { return null; }
        public int getWindowSetMask() { return 0; }
        public int getWindowingMode() { return 0; }
        public void merge(android.window.WindowContainerTransaction.Change p0, boolean p1) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ChangeMask {
        }
    }

    public static final class HierarchyOp implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction.HierarchyOp> CREATOR = null;
        public static final int HIERARCHY_OP_TYPE_ADD_INSETS_FRAME_PROVIDER = 10;
        public static final int HIERARCHY_OP_TYPE_ADD_TASK_FRAGMENT_OPERATION = 17;
        public static final int HIERARCHY_OP_TYPE_APP_COMPAT_REACHABILITY = 24;
        public static final int HIERARCHY_OP_TYPE_CHILDREN_TASKS_REPARENT = 2;
        public static final int HIERARCHY_OP_TYPE_CLEAR_ADJACENT_ROOTS = 15;
        public static final int HIERARCHY_OP_TYPE_CONTINUE_PACKAGE_UPDATE = 28;
        public static final int HIERARCHY_OP_TYPE_FINISH_ACTIVITY = 14;
        public static final int HIERARCHY_OP_TYPE_LAUNCH_TASK = 5;
        public static final int HIERARCHY_OP_TYPE_MOVE_PIP_ACTIVITY_TO_PINNED_TASK = 18;
        public static final int HIERARCHY_OP_TYPE_PENDING_INTENT = 7;
        public static final int HIERARCHY_OP_TYPE_REMOVE_INSETS_FRAME_PROVIDER = 11;
        public static final int HIERARCHY_OP_TYPE_REMOVE_ROOT_TASK = 23;
        public static final int HIERARCHY_OP_TYPE_REMOVE_TASK = 13;
        public static final int HIERARCHY_OP_TYPE_REORDER = 1;
        public static final int HIERARCHY_OP_TYPE_REPARENT = 0;
        public static final int HIERARCHY_OP_TYPE_RESTORE_BACK_NAVIGATION = 20;
        public static final int HIERARCHY_OP_TYPE_RESTORE_TRANSIENT_ORDER = 9;
        public static final int HIERARCHY_OP_TYPE_SET_ADJACENT_ROOTS = 4;
        public static final int HIERARCHY_OP_TYPE_SET_ALWAYS_ON_TOP = 12;
        public static final int HIERARCHY_OP_TYPE_SET_ANIMATION_DELEGATE = 27;
        public static final int HIERARCHY_OP_TYPE_SET_EXCLUDE_INSETS_TYPES = 21;
        public static final int HIERARCHY_OP_TYPE_SET_IS_TRIMMABLE = 19;
        public static final int HIERARCHY_OP_TYPE_SET_KEYGUARD_STATE = 22;
        public static final int HIERARCHY_OP_TYPE_SET_LAUNCH_ADJACENT_FLAG_ROOT = 6;
        public static final int HIERARCHY_OP_TYPE_SET_LAUNCH_ROOT = 3;
        public static final int HIERARCHY_OP_TYPE_SET_PRESERVE_LEAF_TASK_IF_RELAUNCH = 29;
        public static final int HIERARCHY_OP_TYPE_SET_REPARENT_LEAF_TASK_IF_RELAUNCH = 16;
        public static final int HIERARCHY_OP_TYPE_SET_SAFE_REGION_BOUNDS = 25;
        public static final int HIERARCHY_OP_TYPE_SET_SYSTEM_BAR_VISIBILITY_OVERRIDE = 26;
        public static final int HIERARCHY_OP_TYPE_START_SHORTCUT = 8;
        public static final java.lang.String LAUNCH_KEY_SHORTCUT_CALLING_PACKAGE = "android:transaction.hop.shortcut_calling_package";
        public static final java.lang.String LAUNCH_KEY_TASK_ID = "android:transaction.hop.taskId";
        public static final java.lang.String REACHABILITY_EVENT_X = "android:transaction.reachability_x";
        public static final java.lang.String REACHABILITY_EVENT_Y = "android:transaction.reachability_y";
        private android.content.Intent mActivityIntent;
        private int[] mActivityTypes;
        private boolean mAlwaysOnTop;
        private android.os.Bundle mAppCompatOptions;
        private android.graphics.Rect mBounds;
        private android.os.IBinder mCaller;
        private boolean mClearWindowingMode;
        private android.os.IBinder mContainer;
        private android.os.IBinder[] mContainers;
        private int mExcludeInsetsTypes;
        private int mForciblyHidingInsetsTypes;
        private int mForciblyShowingInsetsTypes;
        private boolean mIncludingParents;
        private android.view.InsetsFrameProvider mInsetsFrameProvider;
        private boolean mIsTrimmableFromRecents;
        private android.window.KeyguardState mKeyguardState;
        private boolean mKillProcess;
        private android.os.Bundle mLaunchOptions;
        private android.app.PendingIntent mPendingIntent;
        private boolean mPreserveLeafTaskIfRelaunch;
        private boolean mRemoveFromRecents;
        private android.os.IBinder mReparent;
        private boolean mReparentLeafTaskIfRelaunch;
        private boolean mReparentTopOnly;
        private android.graphics.Rect mSafeRegionBounds;
        private android.content.pm.ShortcutInfo mShortcutInfo;
        private android.window.TaskFragmentOperation mTaskFragmentOperation;
        private boolean mToTop;
        private final int mType = 0;
        private int[] mWindowingModes;
        private HierarchyOp(int p0) {}
        private HierarchyOp(android.os.Parcel p0) {}
        public HierarchyOp(android.window.WindowContainerTransaction.HierarchyOp p0) {}
        public static android.window.WindowContainerTransaction.HierarchyOp createForAdjacentRoots(android.os.IBinder p0, android.os.IBinder p1) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForChildrenTasksReparent(android.os.IBinder p0, android.os.IBinder p1, int[] p2, int[] p3, boolean p4, boolean p5, boolean p6) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForClearAdjacentRoots(android.os.IBinder p0) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForReachability(android.os.IBinder p0, int p1, int p2, int p3) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForRemoveRootTask(android.os.IBinder p0) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForRemoveTask(android.os.IBinder p0, boolean p1, boolean p2) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForReorder(android.os.IBinder p0, boolean p1, boolean p2) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForReparent(android.os.IBinder p0, android.os.IBinder p1, boolean p2) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetLaunchAdjacentFlagRoot(android.os.IBinder p0, boolean p1) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetLaunchRoot(android.os.IBinder p0, int[] p1, int[] p2) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetSafeRegionBounds(android.os.IBinder p0, android.graphics.Rect p1) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetTaskTrimmableFromRecents(android.os.IBinder p0, boolean p1) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForStartShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.os.Bundle p2) { return null; }
        public static android.window.WindowContainerTransaction.HierarchyOp createForTaskLaunch(int p0, android.os.Bundle p1) { return null; }
        public static java.lang.String hopToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public android.content.Intent getActivityIntent() { return null; }
        public int[] getActivityTypes() { return null; }
        public android.os.Bundle getAppCompatOptions() { return null; }
        public android.graphics.Rect getBounds() { return null; }
        public android.os.IBinder getCaller() { return null; }
        public boolean getClearWindowingMode() { return false; }
        public android.os.IBinder getContainer() { return null; }
        public android.os.IBinder[] getContainers() { return null; }
        public int getExcludeInsetsTypes() { return 0; }
        public int getForciblyHidingInsetsTypes() { return 0; }
        public int getForciblyShowingInsetsTypes() { return 0; }
        public android.view.InsetsFrameProvider getInsetsFrameProvider() { return null; }
        public android.window.KeyguardState getKeyguardState() { return null; }
        public boolean getKillProcess() { return false; }
        public android.os.Bundle getLaunchOptions() { return null; }
        public android.os.IBinder getNewParent() { return null; }
        public android.app.PendingIntent getPendingIntent() { return null; }
        public boolean getRemoveFromRecents() { return false; }
        public boolean getReparentTopOnly() { return false; }
        public android.graphics.Rect getSafeRegionBounds() { return null; }
        public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
        public android.window.TaskFragmentOperation getTaskFragmentOperation() { return null; }
        public boolean getToTop() { return false; }
        public int getType() { return 0; }
        public int[] getWindowingModes() { return null; }
        public boolean includingParents() { return false; }
        public boolean isAlwaysOnTop() { return false; }
        public boolean isPreserveLeafTaskIfRelaunch() { return false; }
        public boolean isReparent() { return false; }
        public boolean isReparentLeafTaskIfRelaunch() { return false; }
        public boolean isTrimmableFromRecents() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        private static class Builder {
            private android.content.Intent mActivityIntent;
            private int[] mActivityTypes;
            private boolean mAlwaysOnTop;
            private android.os.Bundle mAppCompatOptions;
            private android.graphics.Rect mBounds;
            private android.os.IBinder mCaller;
            private boolean mClearWindowingMode;
            private android.os.IBinder mContainer;
            private android.os.IBinder[] mContainers;
            private int mExcludeInsetsTypes;
            private int mForciblyHidingInsetsTypes;
            private int mForciblyShowingInsetsTypes;
            private boolean mIncludingParents;
            private android.view.InsetsFrameProvider mInsetsFrameProvider;
            private boolean mIsTrimmableFromRecents;
            private android.window.KeyguardState mKeyguardState;
            private boolean mKillProcess;
            private android.os.Bundle mLaunchOptions;
            private android.app.PendingIntent mPendingIntent;
            private boolean mPreserveLeafTaskIfRelaunch;
            private boolean mRemoveFromRecents;
            private android.os.IBinder mReparent;
            private boolean mReparentLeafTaskIfRelaunch;
            private boolean mReparentTopOnly;
            private android.graphics.Rect mSafeRegionBounds;
            private android.content.pm.ShortcutInfo mShortcutInfo;
            private android.window.TaskFragmentOperation mTaskFragmentOperation;
            private boolean mToTop;
            private final int mType = 0;
            private int[] mWindowingModes;
            Builder(int p0) {}
            android.window.WindowContainerTransaction.HierarchyOp build() { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setActivityIntent(android.content.Intent p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setActivityTypes(int[] p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setAlwaysOnTop(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setAppCompatOptions(android.os.Bundle p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setBounds(android.graphics.Rect p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setCaller(android.os.IBinder p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setClearWindowingMode(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setContainer(android.os.IBinder p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setContainers(android.os.IBinder[] p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setExcludeInsetsTypes(int p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setIncludingParents(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setInsetsFrameProvider(android.view.InsetsFrameProvider p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setIsTrimmableFromRecents(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setKeyguardState(android.window.KeyguardState p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setKillProcess(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setLaunchOptions(android.os.Bundle p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setPreserveLeafTaskIfRelaunch(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setRemoveFromRecents(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setReparentContainer(android.os.IBinder p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setReparentLeafTaskIfRelaunch(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setReparentTopOnly(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setSafeRegionBounds(android.graphics.Rect p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setShortcutInfo(android.content.pm.ShortcutInfo p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setSystemBarVisibilityOverride(int p0, int p1) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setTaskFragmentOperation(android.window.TaskFragmentOperation p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setToTop(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setWindowingModes(int[] p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HierarchyOpType {
        }
    }

    public static class TaskFragmentAdjacentParams {
        private static final java.lang.String DELAY_PRIMARY_LAST_ACTIVITY_REMOVAL = "android:transaction.adjacent.option.delay_primary_removal";
        private static final java.lang.String DELAY_SECONDARY_LAST_ACTIVITY_REMOVAL = "android:transaction.adjacent.option.delay_secondary_removal";
        private boolean mDelayPrimaryLastActivityRemoval;
        private boolean mDelaySecondaryLastActivityRemoval;
        public TaskFragmentAdjacentParams() {}
        public TaskFragmentAdjacentParams(android.os.Bundle p0) {}
        public void setShouldDelayPrimaryLastActivityRemoval(boolean p0) {}
        public void setShouldDelaySecondaryLastActivityRemoval(boolean p0) {}
        public boolean shouldDelayPrimaryLastActivityRemoval() { return false; }
        public boolean shouldDelaySecondaryLastActivityRemoval() { return false; }
        android.os.Bundle toBundle() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowContainerTransactionFlags {
    }
}
