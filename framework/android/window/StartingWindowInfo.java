package android.window;

public final class StartingWindowInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.StartingWindowInfo> CREATOR = null;
    public static final int STARTING_WINDOW_TYPE_LEGACY_SPLASH_SCREEN = 4;
    public static final int STARTING_WINDOW_TYPE_NONE = 0;
    public static final int STARTING_WINDOW_TYPE_SNAPSHOT = 2;
    public static final int STARTING_WINDOW_TYPE_SOLID_COLOR_SPLASH_SCREEN = 3;
    public static final int STARTING_WINDOW_TYPE_SPLASH_SCREEN = 1;
    public static final int STARTING_WINDOW_TYPE_WINDOWLESS = 5;
    public static final int TYPE_PARAMETER_ACTIVITY_CREATED = 16;
    public static final int TYPE_PARAMETER_ACTIVITY_DRAWN = 64;
    public static final int TYPE_PARAMETER_ALLOW_HANDLE_SOLID_COLOR_SCREEN = 128;
    public static final int TYPE_PARAMETER_ALLOW_TASK_SNAPSHOT = 8;
    public static final int TYPE_PARAMETER_APP_PREFERS_ICON = 512;
    public static final int TYPE_PARAMETER_LEGACY_SPLASH_SCREEN = -2147483648;
    public static final int TYPE_PARAMETER_NEW_TASK = 1;
    public static final int TYPE_PARAMETER_PROCESS_RUNNING = 4;
    public static final int TYPE_PARAMETER_TASK_SWITCH = 2;
    public static final int TYPE_PARAMETER_USE_SOLID_COLOR_SPLASH_SCREEN = 32;
    public static final int TYPE_PARAMETER_WINDOWLESS = 256;
    public android.os.IBinder appToken;
    public boolean isKeyguardOccluded;
    public android.view.WindowManager.LayoutParams mainWindowLayoutParams;
    public int requestedVisibleTypes;
    public android.view.SurfaceControl rootSurface;
    public int splashScreenThemeResId;
    public int startingWindowTypeParameter;
    public android.content.pm.ActivityInfo targetActivityInfo;
    public final android.graphics.Rect taskBounds = null;
    public android.app.ActivityManager.RunningTaskInfo taskInfo;
    public android.window.TaskSnapshot taskSnapshot;
    public android.os.IBinder transitionToken;
    public android.window.IWindowlessStartingSurfaceCallback windowlessStartingSurfaceCallback;
    public StartingWindowInfo() {}
    private StartingWindowInfo(android.os.Parcel p0) {}
    public boolean allowHandleSolidColorSplashScreen() { return false; }
    public int describeContents() { return 0; }
    public void notifyAddComplete(android.view.SurfaceControl p0) {}
    void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface StartingTypeParams {
    }

    public static @interface StartingWindowType {
    }
}
