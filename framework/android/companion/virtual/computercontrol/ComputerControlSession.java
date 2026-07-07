package android.companion.virtual.computercontrol;

public final class ComputerControlSession implements java.lang.AutoCloseable {
    public static final int ACTION_GO_BACK = 1;
    public static final java.lang.String ACTION_REQUEST_ACCESS = "android.companion.virtual.computercontrol.action.REQUEST_ACCESS";
    public static final int BLOCK_REASON_AUTHENTICATION_PROMPT_REQUESTED = 4;
    public static final int BLOCK_REASON_CALLER_INITIATED = 3;
    public static final int BLOCK_REASON_DISALLOWED_ACTIVITY_LAUNCH = 2;
    public static final int BLOCK_REASON_SECURE_CONTENT = 1;
    public static final int BLOCK_REASON_SUSPENDED = 5;
    public static final int BLOCK_REASON_UNKNOWN = 0;
    public static final int CLOSE_REASON_CALLER_INITIATED = 1;
    public static final int CLOSE_REASON_SESSION_EMPTY = 4;
    public static final int CLOSE_REASON_SESSION_TIMED_OUT = 3;
    public static final int CLOSE_REASON_UNKNOWN = 0;
    public static final int CLOSE_REASON_USER_INITIATED = 2;
    public static final int ERROR_DEVICE_LOCKED = 2;
    public static final int ERROR_PERMISSION_DENIED = 3;
    public static final int ERROR_SESSION_LIMIT_REACHED = 1;
    public static final int ERROR_UNKNOWN = 0;
    public static final java.lang.String EXTRA_AUTOMATING_PACKAGE_NAME = "android.companion.virtual.computercontrol.extra.AUTOMATING_PACKAGE_NAME";
    public static final java.lang.String EXTRA_IS_BLOCKED = "android.companion.virtual.computercontrol.extra.IS_BLOCKED";
    public static final java.lang.String EXTRA_PREVIEW_INTENT = "android.companion.virtual.computercontrol.extra.PREVIEW_INTENT";
    public static final int RESULT_STOP_AUTOMATION = 1;
    private static final int SCREENSHOT_TIMEOUT_MS = 5000;
    private static final java.lang.String TAG = null;
    private static final int TRACE_COOKIE_REQUEST_SCREENSHOT = 0;
    public static final int UNSTABLE_REASON_CALLER_INTERACTION = 1;
    public static final int UNSTABLE_REASON_INSETS_CHANGE = 2;
    public static final int UNSTABLE_REASON_UNKNOWN = 0;
    private final android.companion.virtual.computercontrol.ComputerControlSession.InjectedA11yManager mA11yManager = null;
    private final android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy mAccessibilityProxy = null;
    private final android.util.Size mDisplaySize = null;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private android.media.ImageReader mImageReader;
    private final java.lang.Object mImageReaderLock = null;
    private final android.companion.virtual.computercontrol.LifecycleStateTracker mLifecycle = null;
    private final java.lang.Runnable mOnClosedRunnable = null;
    private android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotCallbackRecord mOneShotPendingScreenshotCallback;
    private android.companion.virtual.computercontrol.ComputerControlSession.LifecycleCallback mRegisteredLifecycleCallback;
    private final android.companion.virtual.computercontrol.IComputerControlLifecycleCallback mRemoteLifecycleCallback = null;
    private java.lang.Runnable mScreenshotTimeoutRunnable;
    private final android.companion.virtual.computercontrol.IComputerControlSession mSession = null;
    private final java.lang.String mTraceTrack = null;
    public ComputerControlSession(int p0, android.companion.virtual.computercontrol.IComputerControlSession p1, android.companion.virtual.computercontrol.ComputerControlSession.InjectedA11yManager p2, java.lang.Runnable p3) {}
    public ComputerControlSession(int p0, android.companion.virtual.computercontrol.IComputerControlSession p1, android.companion.virtual.computercontrol.ComputerControlSession.InjectedA11yManager p2, java.lang.Runnable p3, android.hardware.display.DisplayManagerGlobal p4) {}
    private android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver createInteractionResultReceiver(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.companion.virtual.computercontrol.ComputerControlSession.InteractionException> p1) { return null; }
    private void fireScreenshotCallback(java.util.function.Consumer<android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException>> p0) {}
    private void fireScreenshotCallbackIfReady(android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotCallbackRecord p0) {}
    private void launchApplication(java.lang.String p0, java.lang.String p1) {}
    private void onImageAvailable() {}
    private void onScreenshotError(android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotCallbackRecord p0, int p1, java.lang.String p2) {}
    private void releaseResources() {}
    private android.media.Image requestScreenshotSync() { return null; }
    private static int translateResultToScreenshotError(int p0) { return 0; }
    private void validateTouchCoordinates(int p0, int p1) {}
    public void addPackagesForAutomation(java.util.List<java.lang.String> p0, java.util.concurrent.Executor p1, android.companion.virtual.computercontrol.ComputerControlSession.TargetPackagesAdditionCallback p2) {}
    @java.lang.Deprecated
    public void attachNotificationInfo(int p0, java.lang.String p1) {}
    public void clearLifecycleCallback() {}
    public void clearStabilityListener() {}
    public void close() {}
    public android.companion.virtual.computercontrol.InteractiveMirror createInteractiveMirror(com.android.internal.os.IResultReceiver p0) { return null; }
    @java.lang.Deprecated
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getAccessibilityWindows() { return null; }
    public android.util.Size getDisplaySize() { return null; }
    public android.media.Image getScreenshot() { return null; }
    public void handOverApplications() {}
    public void insertText(java.lang.String p0, boolean p1, boolean p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.OutcomeReceiver<java.lang.Void, android.companion.virtual.computercontrol.ComputerControlSession.InteractionException> p5) {}
    @java.lang.Deprecated
    public void launchApplication(android.content.ComponentName p0) {}
    @java.lang.Deprecated
    public void launchApplication(java.lang.String p0) {}
    public void longPress(int p0, int p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<java.lang.Void, android.companion.virtual.computercontrol.ComputerControlSession.InteractionException> p4) {}
    public void notifyBlocked() {}
    public void notifySuspend() {}
    public void onMirrorInsetsChanged() {}
    public void performAction(int p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, android.companion.virtual.computercontrol.ComputerControlSession.InteractionException> p3) {}
    public boolean requestResume() { return false; }
    public void requestScreenshot(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException> p1, android.os.CancellationSignal p2) {}
    public void requestUiSnapshot(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.companion.virtual.computercontrol.ComputerControlUiSnapshot, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException> p1, android.os.CancellationSignal p2) {}
    public void setLifecycleCallback(java.util.concurrent.Executor p0, android.companion.virtual.computercontrol.ComputerControlSession.LifecycleCallback p1) {}
    public void setPreviewIntent(android.app.PendingIntent p0) {}
    public void setStabilityListener(java.time.Duration p0, java.util.concurrent.Executor p1, android.companion.virtual.computercontrol.ComputerControlSession.StabilityListener p2) {}
    public void startActivity(android.content.Intent p0, android.os.Bundle p1) {}
    public void swipe(int p0, int p1, int p2, int p3, android.os.CancellationSignal p4, java.util.concurrent.Executor p5, android.os.OutcomeReceiver<java.lang.Void, android.companion.virtual.computercontrol.ComputerControlSession.InteractionException> p6) {}
    public void tap(int p0, int p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<java.lang.Void, android.companion.virtual.computercontrol.ComputerControlSession.InteractionException> p4) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface Action {
    }

    public static interface Callback {
        @java.lang.Deprecated
        public void onSessionClosed();
        public void onSessionCreated(android.companion.virtual.computercontrol.ComputerControlSession p0);
        public void onSessionCreationFailed(int p0);
        public void onSessionPending(android.content.IntentSender p0);
    }

    public static class CallbackProxy extends android.companion.virtual.computercontrol.IComputerControlSessionCallback.Stub {
        private final android.companion.virtual.computercontrol.ComputerControlSession.Callback mCallback = null;
        private final android.content.Context mContext = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private android.companion.virtual.computercontrol.ComputerControlSession mSession;
        public CallbackProxy(android.content.Context p0, java.util.concurrent.Executor p1, android.companion.virtual.computercontrol.ComputerControlSession.Callback p2) { super(); }
        private void onSessionClosed() {}
        public void onSessionCreated(int p0, android.companion.virtual.computercontrol.IComputerControlSession p1) {}
        public void onSessionCreationFailed(int p0) {}
        public void onSessionPending(android.app.PendingIntent p0) {}
    }

    public static interface InjectedA11yManager {
        public void registerDisplayProxy(android.view.accessibility.AccessibilityDisplayProxy p0);
        public void unregisterDisplayProxy(android.view.accessibility.AccessibilityDisplayProxy p0);
    }

    public static class InteractionException extends java.lang.Exception {
        public static final int ERROR_CANCELED = 1;
        public static final int ERROR_FAILED = 2;
        public static final int ERROR_NOT_PERMITTED = 3;
        public static final int ERROR_UNKNOWN = 0;
        private final int mErrorCode = 0;
        public InteractionException(int p0) { super(); }
        public int getErrorCode() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ErrorCode {
        }
    }

    public static interface LifecycleCallback {
        public void onActive();
        public void onBlocked(int p0, java.lang.String p1);
        public void onClosed(int p0);
    }

    private static final class ScreenshotCallbackRecord {
        private final android.os.CancellationSignal cancellationSignal = null;
        private final java.util.concurrent.Executor executor = null;
        private final java.util.concurrent.atomic.AtomicBoolean isRequestSuccess = null;
        private final java.util.concurrent.atomic.AtomicReference<android.media.Image> pendingImage = null;
        private final android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException> receiver = null;
        private final java.lang.String traceTrack = null;
        ScreenshotCallbackRecord(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException> p2, android.os.CancellationSignal p3) {}
        ScreenshotCallbackRecord(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException> p2, android.os.CancellationSignal p3, java.util.concurrent.atomic.AtomicBoolean p4, java.util.concurrent.atomic.AtomicReference<android.media.Image> p5) {}
        public android.os.CancellationSignal cancellationSignal() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.util.concurrent.Executor executor() { return null; }
        void fire(java.util.function.Consumer<android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException>> p0) {}
        public final int hashCode() { return 0; }
        public java.util.concurrent.atomic.AtomicBoolean isRequestSuccess() { return null; }
        public java.util.concurrent.atomic.AtomicReference<android.media.Image> pendingImage() { return null; }
        public android.os.OutcomeReceiver<android.media.Image, android.companion.virtual.computercontrol.ComputerControlSession.ScreenshotException> receiver() { return null; }
        public final java.lang.String toString() { return null; }
        public java.lang.String traceTrack() { return null; }
    }

    public static class ScreenshotException extends java.lang.Exception {
        public static final int ERROR_CANCELED = 2;
        public static final int ERROR_DUPLICATE_REQUEST = 6;
        public static final int ERROR_INTERNAL = 4;
        public static final int ERROR_PROHIBITED = 3;
        public static final int ERROR_REMOTE = 5;
        public static final int ERROR_SCREEN_UNCHANGED = 7;
        public static final int ERROR_TIMEOUT = 1;
        public static final int ERROR_UNKNOWN = 0;
        private final int mErrorCode = 0;
        public ScreenshotException(int p0) { super(); }
        public int getErrorCode() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ErrorCode {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface SessionBlockReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface SessionCloseReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface SessionCreationError {
    }

    public static interface StabilityListener {
        public void onSessionStable();
        default public void onSessionUnstable(int p0) {}
    }

    public static interface TargetPackagesAdditionCallback {
        public static final int ERROR_PERMISSION_DENIED = 3;
        public static final int ERROR_UNKNOWN = 0;
        public void onTargetPackagesAdditionFailure(int p0);
        public void onTargetPackagesAdditionPending(android.content.IntentSender p0);
        public void onTargetPackagesAdditionSuccess();

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
        public static @interface TargetPackagesAdditionError {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface UnstableReason {
    }
}
