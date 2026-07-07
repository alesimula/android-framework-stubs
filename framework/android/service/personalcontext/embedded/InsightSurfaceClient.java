package android.service.personalcontext.embedded;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public class InsightSurfaceClient implements java.lang.AutoCloseable {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int REGISTRATION_STATE_NOT_REGISTERED = 0;
    private static final int REGISTRATION_STATE_REGISTERED = 2;
    private static final int REGISTRATION_STATE_REGISTERING = 1;
    private static final java.lang.String TAG = "InsightSurfaceClient";
    private android.service.personalcontext.embedded.InsightSurfaceClient.CallbackWrapper mCallbacks;
    private final android.service.personalcontext.embedded.IInsightSurfaceClient mClient = null;
    private android.service.personalcontext.embedded.InsightSurfaceClientInfo mClientInfo;
    private final android.content.Context mContext = null;
    private final java.util.List<android.service.personalcontext.embedded.InsightSurfaceClient.InsightReceiver> mInsightReceivers = null;
    private java.util.Set<android.service.personalcontext.hint.ContextHint> mPendingHints;
    private final java.lang.Object mRegistrationLock = null;
    private int mRegistrationState;
    private android.service.personalcontext.embedded.InsightSurfaceSession mSession;
    private InsightSurfaceClient(android.content.Context p0, int p1, int p2, android.graphics.Color p3, int p4, boolean p5, boolean p6, int p7, java.util.List<android.service.personalcontext.embedded.InsightSurfaceClient.InsightReceiver> p8) {}
    private void executeWithCallbacks(java.util.function.Consumer<android.service.personalcontext.embedded.InsightSurfaceClient.ClientCallback> p0) {}
    private static boolean isValidMeasureSpec(int p0) { return false; }
    private static boolean isValidNestedScrollAxes(int p0) { return false; }
    public void close() {}
    public android.graphics.Color getBackgroundColor() { return null; }
    public android.service.personalcontext.embedded.InsightSurfaceClientInfo getClientInfo() { return null; }
    public int getMeasureSpecHeight() { return 0; }
    public int getMeasureSpecWidth() { return 0; }
    public int getNestedScrollAxes() { return 0; }
    public java.util.List<android.service.personalcontext.embedded.InsightSurfaceClient.InsightReceiver> getReceivers() { return null; }
    public int getThemeResourceId() { return 0; }
    public boolean isNestedScrollAxisLocked() { return false; }
    public void publishHints(java.util.Set<android.service.personalcontext.hint.ContextHint> p0) {}
    public void register(java.util.concurrent.Executor p0, android.service.personalcontext.embedded.InsightSurfaceClient.ClientCallback p1) {}
    public boolean shouldBlur() { return false; }
    public void unregister() {}
    public android.service.personalcontext.embedded.InsightSurfaceClientInfo updateClientInfo(android.service.personalcontext.embedded.InsightSurfaceClientUpdate p0) { return null; }

    public static final class Builder {
        private android.graphics.Color mBackgroundColor;
        private final android.content.Context mContext = null;
        private int mHeightMeasureSpec;
        private int mNestedScrollAxes;
        private boolean mNestedScrollAxisLocked;
        private final java.util.List<android.service.personalcontext.embedded.InsightSurfaceClient.InsightReceiver> mReceivers = null;
        private boolean mShouldBlur;
        private int mThemeResourceId;
        private int mWidthMeasureSpec;
        public Builder(android.content.Context p0) {}
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder addReceiver(android.service.personalcontext.embedded.InsightSurfaceClient.InsightReceiver p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient build() { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder setBackgroundColor(android.graphics.Color p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder setMeasureSpecs(int p0, int p1) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder setNestedScrollAxes(int p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder setNestedScrollAxisLocked(boolean p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder setShouldBlur(boolean p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClient.Builder setThemeResourceId(int p0) { return null; }
    }

    private static final class CallbackWrapper {
        private final android.service.personalcontext.embedded.InsightSurfaceClient.ClientCallback callbacks = null;
        private final java.util.concurrent.Executor executor = null;
        private CallbackWrapper(java.util.concurrent.Executor p0, android.service.personalcontext.embedded.InsightSurfaceClient.ClientCallback p1) {}
        public android.service.personalcontext.embedded.InsightSurfaceClient.ClientCallback callbacks() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.util.concurrent.Executor executor() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    public static interface ClientCallback {
        default public void onError(android.service.personalcontext.embedded.InsightSurfaceSessionException p0) {}
        default public void onSessionCreated(android.service.personalcontext.embedded.InsightSurfaceSession p0) {}
        default public void onSessionDestroyed(android.service.personalcontext.embedded.InsightSurfaceSession p0) {}
        default public void onSessionUpdated(android.service.personalcontext.embedded.InsightSurfaceSession p0) {}
        default public void onSizeChanged(int p0, int p1) {}
    }

    public static interface InsightReceiver {
        public boolean onReceive(android.service.personalcontext.insight.ContextInsight p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RegistrationState {
    }
}
