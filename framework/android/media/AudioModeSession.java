package android.media;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class AudioModeSession implements java.lang.AutoCloseable {
    public static final int ROUTING_RESULT_FAILED = 1;
    public static final int ROUTING_RESULT_PREEMPTED = 2;
    public static final int ROUTING_RESULT_SUCCESSFUL = 0;
    public static final int ROUTING_RESULT_TIMED_OUT = 3;
    private final android.media.audio.IAudioModeSession mSession = null;
    public AudioModeSession(android.media.audio.IAudioModeSession p0) {}
    public void close() {}
    public java.util.List<android.media.AudioModeSession.AudioRoute> getAvailableRoutes() { return null; }
    public void setClientPaused(boolean p0) {}
    public void setDisplayActiveUseCase(boolean p0) {}
    public void setMode(int p0) {}
    public int setRequestedRoute(android.media.AudioModeSession.AudioRoute p0) { return 0; }

    public static final class AudioRoute {
        private final android.media.audio.IAudioModeSession.Route mRoute = null;
        AudioRoute(android.media.audio.IAudioModeSession.Route p0) {}
        private static android.media.AudioDeviceAttributes deviceIdentityToAttributes(android.media.audio.DeviceIdentity p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.media.AudioDeviceAttributes getInputDevice() { return null; }
        public android.media.AudioDeviceAttributes getPrimaryDevice() { return null; }
        android.media.audio.IAudioModeSession.Route getRoute() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            private android.media.AudioDeviceAttributes mInputDevice;
            private final android.media.AudioDeviceAttributes mOutputDevice = null;
            public Builder(android.media.AudioDeviceAttributes p0) {}
            public android.media.AudioModeSession.AudioRoute build() { return null; }
            public android.media.AudioModeSession.AudioRoute.Builder setInputDevice(android.media.AudioDeviceAttributes p0) { return null; }
        }
    }

    public static interface Callback {
        public void onAvailableRoutesChanged(java.util.List<android.media.AudioModeSession.AudioRoute> p0);
        public void onClosed();
        public void onExternalRequestedRouteChanged(android.media.AudioModeSession.AudioRoute p0, int p1);
        public void onPaused();
        public void onResumed(int p0);
        public void onRoutingResult(int p0, android.media.AudioModeSession.AudioRoute p1, int p2);
    }

    public static final class Request {
        private final android.media.audio.AudioModeSessionRequest mParcelable = null;
        private Request(android.media.audio.AudioModeSessionRequest p0) {}
        public android.content.AttributionSource getClientAttribution() { return null; }
        public int getInitialMode() { return 0; }
        public java.util.List<java.lang.Integer> getNoFocusModes() { return null; }
        public android.media.audio.AudioModeSessionRequest getParcelable() { return null; }
        public boolean isDisplayActiveUseCase() { return false; }

        public static final class Builder {
            private android.content.AttributionSource mClientAttribution;
            private boolean mIsDisplayActiveUseCase;
            private int mMode;
            private java.util.List<java.lang.Integer> mNoFocusModes;
            private android.media.AudioModeSession.AudioRoute mRequestedRoute;
            public Builder() {}
            public android.media.AudioModeSession.Request build() { return null; }
            public android.media.AudioModeSession.Request.Builder setClientAttribution(android.content.AttributionSource p0) { return null; }
            public android.media.AudioModeSession.Request.Builder setDisplayActiveUseCase(boolean p0) { return null; }
            public android.media.AudioModeSession.Request.Builder setInitialMode(int p0) { return null; }
            public android.media.AudioModeSession.Request.Builder setNoFocusModes(java.util.List<java.lang.Integer> p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RoutingResult {
    }
}
