package android.view;

public class RemoteAnimationTarget implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationTarget> CREATOR = null;
    public static final int MODE_CHANGING = 2;
    public static final int MODE_CLOSING = 1;
    public static final int MODE_OPENING = 0;
    public boolean allowEnterPip;
    public int backgroundColor;
    public final android.graphics.Rect clipRect = null;
    public final android.graphics.Rect contentInsets = null;
    public float cornerRadius;
    public boolean hasAnimatingParent;
    public boolean isNotInRecents;
    public final boolean isTranslucent = false;
    public final android.view.SurfaceControl leash = null;
    public final android.graphics.Rect localBounds = null;
    public final int mode = 0;
    @java.lang.Deprecated
    public final android.graphics.Point position = null;
    @java.lang.Deprecated
    public final int prefixOrderIndex = 0;
    public int rotationChange;
    public final android.graphics.Rect screenSpaceBounds = null;
    public boolean showBackdrop;
    @java.lang.Deprecated
    public final android.graphics.Rect sourceContainerBounds = null;
    public final android.graphics.Rect startBounds = null;
    public final android.view.SurfaceControl startLeash = null;
    public final int taskId = 0;
    public android.app.ActivityManager.RunningTaskInfo taskInfo;
    public boolean willShowImeOnTarget;
    public final android.app.WindowConfiguration windowConfiguration = null;
    public final int windowType = 0;
    public RemoteAnimationTarget(int p0, int p1, android.view.SurfaceControl p2, boolean p3, android.graphics.Rect p4, android.graphics.Rect p5, int p6, android.graphics.Point p7, android.graphics.Rect p8, android.graphics.Rect p9, android.app.WindowConfiguration p10, boolean p11, android.view.SurfaceControl p12, android.graphics.Rect p13, android.app.ActivityManager.RunningTaskInfo p14, boolean p15) {}
    public RemoteAnimationTarget(int p0, int p1, android.view.SurfaceControl p2, boolean p3, android.graphics.Rect p4, android.graphics.Rect p5, int p6, android.graphics.Point p7, android.graphics.Rect p8, android.graphics.Rect p9, android.app.WindowConfiguration p10, boolean p11, android.view.SurfaceControl p12, android.graphics.Rect p13, android.app.ActivityManager.RunningTaskInfo p14, boolean p15, int p16) {}
    public RemoteAnimationTarget(android.os.Parcel p0) {}
    private static void printPoint(android.graphics.Point p0, java.io.PrintWriter p1) {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int getRotationChange() { return 0; }
    public void release() {}
    public void setRotationChange(int p0) {}
    public void setShowBackdrop(boolean p0) {}
    public void setWillShowImeOnTarget(boolean p0) {}
    public boolean willShowImeOnTarget() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }
}
