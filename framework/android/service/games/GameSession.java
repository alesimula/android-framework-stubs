package android.service.games;

@android.annotation.SystemApi
public abstract class GameSession {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "GameSession";
    private boolean mAreTransientInsetsVisibleDueToGesture;
    private android.content.Context mContext;
    private android.service.games.IGameSessionController mGameSessionController;
    private android.service.games.GameSession.GameSessionRootView mGameSessionRootView;
    final android.service.games.IGameSession mInterface = null;
    private android.service.games.GameSession.LifecycleState mLifecycleState;
    private android.view.SurfaceControlViewHost mSurfaceControlViewHost;
    private int mTaskId;
    public GameSession() {}
    private void doDestroy() {}
    private void handleScreenshotResult(android.service.games.GameSession.ScreenshotCallback p0, android.service.games.GameScreenshotResult p1, java.lang.Throwable p2) {}
    public void attach(android.service.games.IGameSessionController p0, int p1, android.content.Context p2, android.view.SurfaceControlViewHost p3, int p4, int p5) {}
    public void dispatchTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) {}
    void doCreate() {}
    public void moveToState(android.service.games.GameSession.LifecycleState p0) {}
    public void onCreate() {}
    public void onDestroy() {}
    public void onGameTaskFocusChanged(boolean p0) {}
    public void onTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) {}
    public final boolean restartGame() { return false; }
    public void setTaskOverlayView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public final void startActivityFromGameSessionForResult(android.content.Intent p0, android.os.Bundle p1, java.util.concurrent.Executor p2, android.service.games.GameSessionActivityCallback p3) {}
    public void takeScreenshot(java.util.concurrent.Executor p0, android.service.games.GameSession.ScreenshotCallback p1) {}

    private static final class GameSessionRootView extends android.widget.FrameLayout {
        private final android.view.SurfaceControlViewHost mSurfaceControlViewHost = null;
        GameSessionRootView(android.content.Context p0, android.view.SurfaceControlViewHost p1) { super((android.content.Context)null); }
        protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    }

    public static enum LifecycleState {
        CREATED,
        DESTROYED,
        INITIALIZED,
        TASK_FOCUSED,
        TASK_UNFOCUSED;
        private static final android.service.games.GameSession.LifecycleState[] $VALUES = null;
        private LifecycleState() {}
    }

    public static interface ScreenshotCallback {
        public static final int ERROR_TAKE_SCREENSHOT_INTERNAL_ERROR = 0;
        public void onFailure(int p0);
        public void onSuccess();

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ScreenshotFailureStatus {
        }
    }
}
