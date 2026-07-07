package android.view;

public class BatchedInputEventReceiver extends android.view.InputEventReceiver {
    private final android.view.BatchedInputEventReceiver.BatchedInputCallback mBatchedInputCallback = null;
    private boolean mBatchedInputScheduled;
    private boolean mBatchingEnabled;
    private final android.view.Choreographer mChoreographer = null;
    private final java.lang.Runnable mConsumeBatchedInputEvents = null;
    private final android.os.Handler mHandler = null;
    private final java.lang.String mTag = null;
    public BatchedInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, android.view.Choreographer p2) { super(null, null); }
    private void scheduleBatchedInput() {}
    private void traceBoolVariable(java.lang.String p0, boolean p1) {}
    private void unscheduleBatchedInput() {}
    public void dispose() {}
    protected void doConsumeBatchedInput(long p0) {}
    public void onBatchedInputEventPending(int p0) {}
    public void setBatchingEnabled(boolean p0) {}

    private final class BatchedInputCallback implements android.view.Choreographer.VsyncCallback {
        private BatchedInputCallback(android.view.BatchedInputEventReceiver p0) {}
        public void onVsync(android.view.Choreographer.FrameData p0) {}
    }

    public static class SimpleBatchedInputEventReceiver extends android.view.BatchedInputEventReceiver {
        protected android.view.BatchedInputEventReceiver.SimpleBatchedInputEventReceiver.InputEventListener mListener;
        public SimpleBatchedInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, android.view.Choreographer p2, android.view.BatchedInputEventReceiver.SimpleBatchedInputEventReceiver.InputEventListener p3) { super(null, null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}

        public static interface InputEventListener {
            public boolean onInputEvent(android.view.InputEvent p0);
        }
    }
}
