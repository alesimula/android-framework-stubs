package android.service.dreams;

public final class DreamOverlayConnectionHandler {
    private static final int MSG_ADD_CONSUMER = 1;
    private static final int MSG_OVERLAY_CLIENT_READY = 3;
    private static final int MSG_REMOVE_CONSUMER = 2;
    private static final java.lang.String TAG = "DreamOverlayConnection";
    private final android.service.dreams.DreamOverlayConnectionHandler.OverlayConnectionCallback mCallback = null;
    private android.service.dreams.IDreamOverlayClient mClient;
    private final com.android.internal.util.ObservableServiceConnection<android.service.dreams.IDreamOverlay> mConnection = null;
    private final java.util.List<java.util.function.Consumer<android.service.dreams.IDreamOverlayClient>> mConsumers = null;
    private final android.os.Handler mHandler = null;
    private final java.lang.Runnable mOnDisconnected = null;
    DreamOverlayConnectionHandler(android.content.Context p0, android.os.Looper p1, android.content.Intent p2, java.lang.Runnable p3) {}
    public DreamOverlayConnectionHandler(android.content.Context p0, android.os.Looper p1, android.content.Intent p2, java.lang.Runnable p3, android.service.dreams.DreamOverlayConnectionHandler.Injector p4) {}
    private void onAddConsumer(java.util.function.Consumer<android.service.dreams.IDreamOverlayClient> p0) {}
    private void onOverlayClientReady(android.service.dreams.IDreamOverlayClient p0) {}
    private void onRemoveConsumer(java.util.function.Consumer<android.service.dreams.IDreamOverlayClient> p0) {}
    public void addConsumer(java.util.function.Consumer<android.service.dreams.IDreamOverlayClient> p0) {}
    public boolean bind() { return false; }
    public void removeConsumer(java.util.function.Consumer<android.service.dreams.IDreamOverlayClient> p0) {}
    public void unbind() {}

    public static class Injector {
        public Injector() {}
        public com.android.internal.util.ObservableServiceConnection<android.service.dreams.IDreamOverlay> buildConnection(android.content.Context p0, android.os.Handler p1, android.content.Intent p2) { return null; }
    }

    private final class OverlayConnectionCallback implements com.android.internal.util.ObservableServiceConnection.Callback<android.service.dreams.IDreamOverlay> {
        private final android.service.dreams.IDreamOverlayClientCallback mClientCallback = null;
        private OverlayConnectionCallback(android.service.dreams.DreamOverlayConnectionHandler p0) {}
        public void onConnected(com.android.internal.util.ObservableServiceConnection<android.service.dreams.IDreamOverlay> p0, android.service.dreams.IDreamOverlay p1) {}
        public void onDisconnected(com.android.internal.util.ObservableServiceConnection<android.service.dreams.IDreamOverlay> p0, int p1) {}
    }

    private final class OverlayHandlerCallback implements android.os.Handler.Callback {
        private OverlayHandlerCallback(android.service.dreams.DreamOverlayConnectionHandler p0) {}
        public boolean handleMessage(android.os.Message p0) { return false; }
    }
}
