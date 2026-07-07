package android.app.jank;

public class StateTracker {
    protected static final int MAX_CONCURRENT_STATE_COUNT = 25;
    private static final int MAX_POOL_SIZE = 500;
    protected static final int MAX_PREVIOUSLY_ACTIVE_STATE_COUNT = 1000;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.app.jank.StateTracker.StateData> mActiveStates = null;
    private final android.view.Choreographer mChoreographer = null;
    private int mLayerId;
    private final java.lang.Object mLock = null;
    private final java.util.ArrayList<android.app.jank.StateTracker.StateData> mPreviousStates = null;
    private final android.util.Pools.SynchronizedPool<android.app.jank.StateTracker.StateData> mStateDataObjectPool = null;
    public StateTracker(android.view.Choreographer p0, int p1) {}
    private static boolean isStateTraceable(android.app.jank.StateTracker.StateData p0) { return false; }
    private void traceStateEnd(android.app.jank.StateTracker.StateData p0) {}
    private void traceStateStart(android.app.jank.StateTracker.StateData p0) {}
    public void addPendingStateData(java.util.List<android.app.jank.StateTracker.StateData> p0) {}
    public java.lang.String getStateKey(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void putState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void removeState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void retrieveAllStates(java.util.ArrayList<android.app.jank.StateTracker.StateData> p0) {}
    void setLayerId(int p0) {}
    public void stateProcessingComplete() {}
    public void updateState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}

    public static final class StateData {
        public boolean mProcessed;
        public java.lang.String mStateDataKey;
        public java.lang.String mStateTraceKey;
        public long mVsyncIdEnd;
        public long mVsyncIdStart;
        public java.lang.String mWidgetCategory;
        public java.lang.String mWidgetId;
        public java.lang.String mWidgetState;
        public StateData() {}
    }
}
