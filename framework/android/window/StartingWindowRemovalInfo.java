package android.window;

public final class StartingWindowRemovalInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.StartingWindowRemovalInfo> CREATOR = null;
    public static final int DEFER_MODE_DEFAULT = 0;
    public static final int DEFER_MODE_NONE = 3;
    public static final int DEFER_MODE_NORMAL = 1;
    public static final int DEFER_MODE_ROTATION = 2;
    public int deferRemoveMode;
    public android.graphics.Rect mainFrame;
    public boolean playRevealAnimation;
    public boolean removeImmediately;
    public float roundedCornerRadius;
    public int taskId;
    public android.view.SurfaceControl windowAnimationLeash;
    public boolean windowlessSurface;
    public StartingWindowRemovalInfo() {}
    private StartingWindowRemovalInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeferMode {
    }
}
