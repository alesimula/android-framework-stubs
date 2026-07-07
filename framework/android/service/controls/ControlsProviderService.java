package android.service.controls;

public abstract class ControlsProviderService extends android.app.Service {
    public static final java.lang.String ACTION_ADD_CONTROL = "android.service.controls.action.ADD_CONTROL";
    public static final java.lang.String CALLBACK_BUNDLE = "CALLBACK_BUNDLE";
    public static final java.lang.String CALLBACK_TOKEN = "CALLBACK_TOKEN";
    public static final int CONTROLS_SURFACE_ACTIVITY_PANEL = 0;
    public static final int CONTROLS_SURFACE_DREAM = 1;
    public static final java.lang.String EXTRA_CONTROL = "android.service.controls.extra.CONTROL";
    public static final java.lang.String EXTRA_CONTROLS_SURFACE = "android.service.controls.extra.CONTROLS_SURFACE";
    public static final java.lang.String EXTRA_LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS = "android.service.controls.extra.LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS";
    public static final java.lang.String META_DATA_PANEL_ACTIVITY = "android.service.controls.META_DATA_PANEL_ACTIVITY";
    public static final java.lang.String SERVICE_CONTROLS = "android.service.controls.ControlsProviderService";
    public static final java.lang.String TAG = "ControlsProviderService";
    private android.service.controls.ControlsProviderService.RequestHandler mHandler;
    private android.os.IBinder mToken;
    public ControlsProviderService() { super(); }
    private static boolean isStatelessControl(android.service.controls.Control p0) { return false; }
    public static void requestAddControl(android.content.Context p0, android.content.ComponentName p1, android.service.controls.Control p2) {}
    public abstract java.util.concurrent.Flow.Publisher<android.service.controls.Control> createPublisherFor(java.util.List<java.lang.String> p0);
    public abstract java.util.concurrent.Flow.Publisher<android.service.controls.Control> createPublisherForAllAvailable();
    public java.util.concurrent.Flow.Publisher<android.service.controls.Control> createPublisherForSuggested() { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final boolean onUnbind(android.content.Intent p0) { return false; }
    public abstract void performControlAction(java.lang.String p0, android.service.controls.actions.ControlAction p1, java.util.function.Consumer<java.lang.Integer> p2);

    private static class ActionMessage {
        final android.service.controls.actions.ControlAction mAction = null;
        final android.service.controls.IControlsActionCallback mCb = null;
        final java.lang.String mControlId = null;
        ActionMessage(java.lang.String p0, android.service.controls.actions.ControlAction p1, android.service.controls.IControlsActionCallback p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ControlsSurface {
    }

    private class RequestHandler extends android.os.Handler {
        private static final int MSG_ACTION = 3;
        private static final int MSG_LOAD = 1;
        private static final int MSG_LOAD_SUGGESTED = 4;
        private static final int MSG_SUBSCRIBE = 2;
        RequestHandler(android.service.controls.ControlsProviderService p0, android.os.Looper p1) { super(); }
        private java.util.function.Consumer<java.lang.Integer> consumerFor(java.lang.String p0, android.service.controls.IControlsActionCallback p1) { return null; }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class SubscribeMessage {
        final java.util.List<java.lang.String> mControlIds = null;
        final android.service.controls.IControlsSubscriber mSubscriber = null;
        SubscribeMessage(java.util.List<java.lang.String> p0, android.service.controls.IControlsSubscriber p1) {}
    }

    private static class SubscriberProxy implements java.util.concurrent.Flow.Subscriber<android.service.controls.Control> {
        private android.content.Context mContext;
        private android.service.controls.IControlsSubscriber mCs;
        private boolean mEnforceStateless;
        private android.service.controls.ControlsProviderService.SubscriptionAdapter mSubscription;
        private android.os.IBinder mToken;
        SubscriberProxy(android.content.Context p0, boolean p1, android.os.IBinder p2, android.service.controls.IControlsSubscriber p3) {}
        SubscriberProxy(boolean p0, android.os.IBinder p1, android.service.controls.IControlsSubscriber p2) {}
        private void handleRemoteException(android.os.RemoteException p0) {}
        public void onComplete() {}
        public void onError(java.lang.Throwable p0) {}
        public void onNext(android.service.controls.Control p0) {}
        public void onSubscribe(java.util.concurrent.Flow.Subscription p0) {}
    }

    private static class SubscriptionAdapter extends android.service.controls.IControlsSubscription.Stub {
        final java.util.concurrent.Flow.Subscription mSubscription = null;
        SubscriptionAdapter(java.util.concurrent.Flow.Subscription p0) { super(); }
        public void cancel() {}
        public void request(long p0) {}
    }
}
