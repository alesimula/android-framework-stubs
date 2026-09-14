package android.app;

public final class AppInteractionSession implements java.lang.AutoCloseable {
    public static final int CLOSE_REASON_CALLER_INITIATED = 2;
    public static final int CLOSE_REASON_TIMEOUT = 1;
    public static final int CLOSE_REASON_UNKNOWN = 0;
    private static final java.lang.String TAG = "AppInteractionSession";
    private final android.util.ArrayMap<android.app.AppInteractionSession.LifecycleListener, java.util.concurrent.Executor> mLifecycleListeners = null;
    private final java.lang.Object mLock = null;
    private android.app.IAppInteractionLifecycleListener mRemoteLifecycleListener;
    private final android.app.IAppInteractionSession mSession = null;
    AppInteractionSession(android.app.IAppInteractionSession p0) {}
    private void dispatchSessionClosed(int p0) {}
    private boolean isValidClosedReason(int p0) { return false; }
    public void addLifecycleListener(java.util.concurrent.Executor p0, android.app.AppInteractionSession.LifecycleListener p1) {}
    public void close() {}
    public android.app.IAppInteractionSession getInterface() { return null; }
    public void removeLifecycleListener(android.app.AppInteractionSession.LifecycleListener p0) {}
    public void update(android.app.AppInteractionSession.UpdateParams p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.app.AppInteractionException> p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CloseReason {
    }

    public static final class CreateParams {
        private final android.os.Bundle mExtras = null;
        private final java.util.function.Consumer<android.content.IntentSender> mOnStartIntentSenderCallback = null;
        private final java.util.concurrent.Executor mOnStartIntentSenderCallbackExecutor = null;
        private final java.util.List<java.lang.String> mTargetPackages = null;
        private CreateParams(java.util.concurrent.Executor p0, java.util.function.Consumer<android.content.IntentSender> p1, java.util.List<java.lang.String> p2, android.os.Bundle p3) {}
        public android.os.Bundle getExtras() { return null; }
        public java.util.function.Consumer<android.content.IntentSender> getOnStartIntentSenderCallback() { return null; }
        public java.util.concurrent.Executor getOnStartIntentSenderCallbackExecutor() { return null; }
        public java.util.List<java.lang.String> getTargetPackages() { return null; }

        public static final class Builder {
            private android.os.Bundle mExtras;
            private java.util.function.Consumer<android.content.IntentSender> mOnStartIntentSenderCallback;
            private java.util.concurrent.Executor mOnStartIntentSenderCallbackExecutor;
            private java.util.List<java.lang.String> mTargetPackages;
            public Builder() {}
            public android.app.AppInteractionSession.CreateParams build() { return null; }
            public android.app.AppInteractionSession.CreateParams.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.app.AppInteractionSession.CreateParams.Builder setOnStartIntentSenderCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.content.IntentSender> p1) { return null; }
            public android.app.AppInteractionSession.CreateParams.Builder setTargetPackages(java.util.List<java.lang.String> p0) { return null; }
        }
    }

    public static interface LifecycleListener {
        default public void onAppInteractionSessionClosed(android.app.AppInteractionSession p0, int p1) {}
    }

    public static final class UpdateParams {
        private final java.util.List<java.lang.String> mAdditionalTargetPackages = null;
        private final android.os.Bundle mExtras = null;
        private final java.util.function.Consumer<android.content.IntentSender> mOnStartIntentSenderCallback = null;
        private final java.util.concurrent.Executor mOnStartIntentSenderCallbackExecutor = null;
        private UpdateParams(java.util.concurrent.Executor p0, java.util.function.Consumer<android.content.IntentSender> p1, java.util.List<java.lang.String> p2, android.os.Bundle p3) {}
        public java.util.List<java.lang.String> getAdditionalTargetPackages() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public java.util.function.Consumer<android.content.IntentSender> getOnStartIntentSenderCallback() { return null; }
        public java.util.concurrent.Executor getOnStartIntentSenderCallbackExecutor() { return null; }

        public static final class Builder {
            private java.util.List<java.lang.String> mAdditionalTargetPackages;
            private android.os.Bundle mExtras;
            private java.util.function.Consumer<android.content.IntentSender> mOnStartIntentSenderCallback;
            private java.util.concurrent.Executor mOnStartIntentSenderCallbackExecutor;
            public Builder() {}
            public android.app.AppInteractionSession.UpdateParams build() { return null; }
            public android.app.AppInteractionSession.UpdateParams.Builder setAdditionalTargetPackages(java.util.List<java.lang.String> p0) { return null; }
            public android.app.AppInteractionSession.UpdateParams.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.app.AppInteractionSession.UpdateParams.Builder setOnStartIntentSenderCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.content.IntentSender> p1) { return null; }
        }
    }
}
