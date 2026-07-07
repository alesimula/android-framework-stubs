package android.app;

public class AppCompatTaskInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.AppCompatTaskInfo> CREATOR = null;
    private static final int FLAGS_COMPAT_UI_INTERESTED = 131051;
    private static final int FLAGS_ORGANIZER_INTERESTED = 126944;
    private static final int FLAG_BASE = 1;
    private static final int FLAG_ELIGIBLE_FOR_LETTERBOX_EDU = 2;
    private static final int FLAG_ELIGIBLE_FOR_USER_ASPECT_RATIO_BUTTON = 64;
    private static final int FLAG_ENABLE_RESTART_MENU_FOR_DISPLAY_MOVE = 1024;
    private static final int FLAG_FULLSCREEN_OVERRIDE_SYSTEM = 128;
    private static final int FLAG_FULLSCREEN_OVERRIDE_USER = 256;
    public static final int FLAG_HAS_MAIN_WINDOW_ROUNDED_CORNERS = 16384;
    public static final int FLAG_HAS_MIN_ASPECT_RATIO_OVERRIDE = 512;
    private static final int FLAG_IN_SIZE_COMPAT = 8;
    public static final int FLAG_IS_EXCLUDE_CAPTION_INSETS = 32768;
    private static final int FLAG_IS_FROM_LETTERBOX_DOUBLE_TAP = 32;
    public static final int FLAG_IS_LEAF_TASK = 8192;
    public static final int FLAG_IS_LETTERBOX_RUNNING = 65536;
    private static final int FLAG_LETTERBOXED = 4;
    private static final int FLAG_LETTERBOX_DOUBLE_TAP_ENABLED = 16;
    private static final int FLAG_LETTERBOX_EDU_ENABLED = 1;
    public static final int FLAG_OPT_OUT_EDGE_TO_EDGE = 2048;
    public static final int FLAG_SAFE_REGION_LETTERBOXED = 4096;
    private static final int FLAG_UNDEFINED = 0;
    private int mTopActivityFlags;
    public final android.graphics.Rect topActivityAppBounds = null;
    public android.graphics.Rect topActivityLetterboxBounds;
    public int topActivityLetterboxHeight;
    public int topActivityLetterboxHorizontalPosition;
    public int topActivityLetterboxVerticalPosition;
    public int topActivityLetterboxWidth;
    public float topNonResizableActivityAspectRatio;
    private AppCompatTaskInfo() {}
    public AppCompatTaskInfo(android.app.AppCompatTaskInfo p0) {}
    private AppCompatTaskInfo(android.os.Parcel p0) {}
    static android.app.AppCompatTaskInfo create() { return null; }
    private boolean isTopActivityFlagEnabled(int p0) { return false; }
    private void setTopActivityFlag(int p0, boolean p1) {}
    public void clearTopActivityFlags() {}
    public int describeContents() { return 0; }
    public boolean eligibleForLetterboxEducation() { return false; }
    public boolean eligibleForUserAspectRatioButton() { return false; }
    public boolean equalsForCompatUi(android.app.AppCompatTaskInfo p0) { return false; }
    public boolean equalsForTaskOrganizer(android.app.AppCompatTaskInfo p0) { return false; }
    public boolean hasCompatUI() { return false; }
    public boolean hasIsExcludeCaptionInsets() { return false; }
    public boolean hasMainWindowRoundedCorners() { return false; }
    public boolean hasMinAspectRatioOverride() { return false; }
    public boolean hasOptOutEdgeToEdge() { return false; }
    public boolean isFromLetterboxDoubleTap() { return false; }
    public boolean isLeafTask() { return false; }
    public boolean isLetterboxDoubleTapEnabled() { return false; }
    public boolean isLetterboxEducationEnabled() { return false; }
    public boolean isRestartMenuEnabledForDisplayMove() { return false; }
    public boolean isSystemFullscreenOverrideEnabled() { return false; }
    public boolean isTopActivityInSizeCompat() { return false; }
    public boolean isTopActivityLetterboxRunning() { return false; }
    public boolean isTopActivityLetterboxed() { return false; }
    public boolean isTopActivityPillarboxShaped() { return false; }
    public boolean isTopActivitySafeRegionLetterboxed() { return false; }
    public boolean isUserFullscreenOverrideEnabled() { return false; }
    void readFromParcel(android.os.Parcel p0) {}
    public void setEligibleForLetterboxEducation(boolean p0) {}
    public void setEligibleForUserAspectRatioButton(boolean p0) {}
    public void setHasMainWindowRoundedCorners(boolean p0) {}
    public void setHasMinAspectRatioOverride(boolean p0) {}
    public void setIsExcludeCaptionInsets(boolean p0) {}
    public void setIsFromLetterboxDoubleTap(boolean p0) {}
    public void setIsLeafTask(boolean p0) {}
    public void setLetterboxDoubleTapEnabled(boolean p0) {}
    public void setLetterboxEducationEnabled(boolean p0) {}
    public void setOptOutEdgeToEdge(boolean p0) {}
    public void setRestartMenuEnabledForDisplayMove(boolean p0) {}
    public void setSystemFullscreenOverrideEnabled(boolean p0) {}
    public void setTopActivityInSizeCompat(boolean p0) {}
    public void setTopActivityLetterboxRunning(boolean p0) {}
    public void setTopActivityLetterboxed(boolean p0) {}
    public void setTopActivitySafeRegionLetterboxed(boolean p0) {}
    public void setUserFullscreenOverrideEnabled(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TopActivityFlag {
    }
}
