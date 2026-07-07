package android.window;

public final class TaskFragmentAnimationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentAnimationParams> CREATOR = null;
    public static final android.window.TaskFragmentAnimationParams DEFAULT = null;
    public static final int DEFAULT_ANIMATION_BACKGROUND_COLOR = 0;
    private final int mAnimationBackgroundColor = 0;
    private final int mChangeAnimationResId = 0;
    private final int mCloseAnimationResId = 0;
    private final int mOpenAnimationResId = 0;
    private TaskFragmentAnimationParams(int p0, int p1, int p2, int p3) {}
    private TaskFragmentAnimationParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAnimationBackgroundColor() { return 0; }
    public int getChangeAnimationResId() { return 0; }
    public int getCloseAnimationResId() { return 0; }
    public int getOpenAnimationResId() { return 0; }
    public boolean hasOverrideAnimation() { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAnimationBackgroundColor;
        private int mChangeAnimationResId;
        private int mCloseAnimationResId;
        private int mOpenAnimationResId;
        public Builder() {}
        public android.window.TaskFragmentAnimationParams build() { return null; }
        public android.window.TaskFragmentAnimationParams.Builder setAnimationBackgroundColor(int p0) { return null; }
        public android.window.TaskFragmentAnimationParams.Builder setChangeAnimationResId(int p0) { return null; }
        public android.window.TaskFragmentAnimationParams.Builder setCloseAnimationResId(int p0) { return null; }
        public android.window.TaskFragmentAnimationParams.Builder setOpenAnimationResId(int p0) { return null; }
    }
}
