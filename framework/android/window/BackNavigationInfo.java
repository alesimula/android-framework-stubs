package android.window;

public final class BackNavigationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.BackNavigationInfo> CREATOR = null;
    public static final java.lang.String KEY_DISPLAY_ID = "DisplayId";
    public static final java.lang.String KEY_NAVIGATION_FINISHED = "NavigationFinished";
    public static final java.lang.String KEY_TOUCH_GESTURE_TRANSFERRED = "TouchGestureTransferred";
    public static final int TYPE_CALLBACK = 4;
    public static final int TYPE_CROSS_ACTIVITY = 2;
    public static final int TYPE_CROSS_TASK = 3;
    public static final int TYPE_DIALOG_CLOSE = 0;
    public static final int TYPE_IN_TRANSITION = 5;
    public static final int TYPE_RETURN_TO_HOME = 1;
    public static final int TYPE_TASK_ROOT_INTERCEPTION = 6;
    public static final int TYPE_UNDEFINED = -1;
    private final boolean mAnimationCallback = false;
    private boolean mAppProgressGenerationAllowed;
    private final android.window.BackNavigationInfo.CustomAnimationInfo mCustomAnimationInfo = null;
    private final int mFocusedTaskId = 0;
    private final int mLetterboxColor = 0;
    private final android.window.IOnBackInvokedCallback mOnBackInvokedCallback = null;
    private final android.os.RemoteCallback mOnBackNavigationDone = null;
    private final boolean mPrepareRemoteAnimation = false;
    private final android.graphics.Rect mTouchableRegion = null;
    private final int mType = 0;
    private BackNavigationInfo(int p0, android.os.RemoteCallback p1, android.window.IOnBackInvokedCallback p2, boolean p3, boolean p4, android.window.BackNavigationInfo.CustomAnimationInfo p5, int p6, android.graphics.Rect p7, boolean p8, int p9) {}
    private BackNavigationInfo(android.os.Parcel p0) {}
    public static java.lang.String typeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void disableAppProgressGenerationAllowed() {}
    public android.window.BackNavigationInfo.CustomAnimationInfo getCustomAnimationInfo() { return null; }
    public int getFocusedTaskId() { return 0; }
    public int getLetterboxColor() { return 0; }
    public android.window.IOnBackInvokedCallback getOnBackInvokedCallback() { return null; }
    public android.graphics.Rect getTouchableRegion() { return null; }
    public int getType() { return 0; }
    public boolean isAnimationCallback() { return false; }
    public boolean isAppProgressGenerationAllowed() { return false; }
    public boolean isPrepareRemoteAnimation() { return false; }
    public void onBackNavigationFinished(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackTargetType {
    }

    public static class Builder {
        private boolean mAnimationCallback;
        private boolean mAppProgressGenerationAllowed;
        private android.window.BackNavigationInfo.CustomAnimationInfo mCustomAnimationInfo;
        private int mFocusedTaskId;
        private int mLetterboxColor;
        private android.window.IOnBackInvokedCallback mOnBackInvokedCallback;
        private android.os.RemoteCallback mOnBackNavigationDone;
        private boolean mPrepareRemoteAnimation;
        private android.graphics.Rect mTouchableRegion;
        private int mType;
        public Builder() {}
        public android.window.BackNavigationInfo build() { return null; }
        public android.window.BackNavigationInfo.Builder setAnimationCallback(boolean p0) { return null; }
        public android.window.BackNavigationInfo.Builder setAppProgressAllowed(boolean p0) { return null; }
        public android.window.BackNavigationInfo.Builder setCustomAnimation(java.lang.String p0, int p1, int p2, int p3) { return null; }
        public android.window.BackNavigationInfo.Builder setFocusedTaskId(int p0) { return null; }
        public android.window.BackNavigationInfo.Builder setLetterboxColor(int p0) { return null; }
        public android.window.BackNavigationInfo.Builder setOnBackInvokedCallback(android.window.IOnBackInvokedCallback p0) { return null; }
        public android.window.BackNavigationInfo.Builder setOnBackNavigationDone(android.os.RemoteCallback p0) { return null; }
        public android.window.BackNavigationInfo.Builder setPrepareRemoteAnimation(boolean p0) { return null; }
        public android.window.BackNavigationInfo.Builder setTouchableRegion(android.graphics.Rect p0) { return null; }
        public android.window.BackNavigationInfo.Builder setType(int p0) { return null; }
        public android.window.BackNavigationInfo.Builder setWindowAnimations(java.lang.String p0, int p1) { return null; }
    }

    public static final class CustomAnimationInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.BackNavigationInfo.CustomAnimationInfo> CREATOR = null;
        private int mCustomBackground;
        private int mCustomEnterAnim;
        private int mCustomExitAnim;
        private final java.lang.String mPackageName = null;
        private int mWindowAnimations;
        private CustomAnimationInfo(android.os.Parcel p0) {}
        public CustomAnimationInfo(java.lang.String p0) {}
        public int describeContents() { return 0; }
        public int getCustomBackground() { return 0; }
        public int getCustomEnterAnim() { return 0; }
        public int getCustomExitAnim() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public int getWindowAnimations() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
