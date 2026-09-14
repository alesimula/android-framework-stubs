package android.app.privatecompute;

public abstract class EgressReceiverService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.app.privatecompute.EgressReceiverService";
    private static final java.lang.String TAG = "EgressReceiverService";
    private final android.os.IBinder mBinder = null;
    public EgressReceiverService() { super(); }
    private void dispatchRequest(android.app.privatecompute.EgressRequest<?> p0, android.app.privatecompute.IEgressCallback p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onQueryReceived(android.app.privatecompute.AssistantQueryRequest p0, android.os.OutcomeReceiver<android.app.privatecompute.AssistantQueryResponse, android.app.privatecompute.PccEgressException> p1) {}

    private static class EgressOutcomeReceiver<R extends android.app.privatecompute.EgressResponse> implements android.os.OutcomeReceiver<R, android.app.privatecompute.PccEgressException> {
        private final android.app.privatecompute.IEgressCallback mCallback = null;
        EgressOutcomeReceiver(android.app.privatecompute.IEgressCallback p0) {}
        public void onError(android.app.privatecompute.PccEgressException p0) {}
        public void onResult(R p0) {}
    }
}
