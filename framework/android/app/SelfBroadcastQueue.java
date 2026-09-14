package android.app;

public final class SelfBroadcastQueue {
    private static final boolean DEBUG = false;
    private static final android.content.ReceiverFinishController NO_OP_FINISH_CONTROLLER = null;
    private static final java.lang.String TAG = "SelfBroadcastQueue";
    public static final java.lang.String TRACE_TRACK_EXECUTION = "self_broadcast_execution";
    private static android.app.SelfBroadcastQueue sInstance;
    private android.app.SelfBroadcastData mActiveBroadcast;
    private int mActiveReceiverIndex;
    private final android.os.Handler mHandler = null;
    private final java.util.ArrayDeque<android.app.SelfBroadcastData> mQueue = null;
    private SelfBroadcastQueue() {}
    private void checkAndDeliverResultTo() {}
    private boolean dispatchNextReceiver() { return false; }
    private void dispatchReceiver(android.app.ReceiverInfo p0, android.content.ReceiverFinishController p1, boolean p2) {}
    private void finishActiveBroadcast() {}
    public static android.app.SelfBroadcastQueue getInstance() { return null; }
    private static java.lang.String getReceiverName(android.app.ReceiverInfo p0) { return null; }
    private void handleReceiverFinished(android.content.BroadcastReceiver.PendingResult p0) {}
    private static boolean isAssumedDelivered(android.app.SelfBroadcastData p0, android.app.ReceiverInfo p1) { return false; }
    private static boolean isNoAbort(android.content.Intent p0) { return false; }
    private void processNextBroadcast() {}
    private void traceActiveBroadcastExecutionBegin() {}
    private void traceActiveBroadcastExecutionEnd() {}
    private void traceReceiverDispatchBegin(android.app.ReceiverInfo p0) {}
    private void traceReceiverDispatchEnd() {}
    public void enqueue(android.app.SelfBroadcastData p0) {}
    public void resetStateForTesting(long p0) {}

    private final class SelfBroadcastFinishController implements android.content.ReceiverFinishController {
        private final android.app.SelfBroadcastData mBroadcast = null;
        private boolean mReleased;
        SelfBroadcastFinishController(android.app.SelfBroadcastQueue p0, android.app.SelfBroadcastData p1) {}
        public void finishReceiver(android.content.BroadcastReceiver.PendingResult p0) {}
    }
}
