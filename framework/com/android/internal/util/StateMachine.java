package com.android.internal.util;

public class StateMachine {
    public static final boolean HANDLED = true;
    public static final boolean NOT_HANDLED = false;
    private static final int SM_INIT_CMD = -2;
    private static final int SM_QUIT_CMD = -1;
    private java.lang.String mName;
    private com.android.internal.util.StateMachine.SmHandler mSmHandler;
    private android.os.HandlerThread mSmThread;
    protected StateMachine(java.lang.String p0) {}
    protected StateMachine(java.lang.String p0, android.os.Handler p1) {}
    protected StateMachine(java.lang.String p0, android.os.Looper p1) {}
    private void initStateMachine(java.lang.String p0, android.os.Looper p1) {}
    public void addLogRec(java.lang.String p0) {}
    public final void addState(com.android.internal.util.State p0) {}
    public final void addState(com.android.internal.util.State p0, com.android.internal.util.State p1) {}
    public final java.util.Collection<com.android.internal.util.StateMachine.LogRec> copyLogRecs() { return null; }
    public final void deferMessage(android.os.Message p0) {}
    public void dispatchMessage(int p0) {}
    public void dispatchMessage(int p0, int p1) {}
    public void dispatchMessage(int p0, int p1, int p2) {}
    public void dispatchMessage(int p0, int p1, int p2, java.lang.Object p3) {}
    public void dispatchMessage(int p0, java.lang.Object p1) {}
    public void dispatchMessage(android.os.Message p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public final android.os.Message getCurrentMessage() { return null; }
    public final com.android.internal.util.IState getCurrentState() { return null; }
    public final android.os.Handler getHandler() { return null; }
    public final com.android.internal.util.StateMachine.LogRec getLogRec(int p0) { return null; }
    public final int getLogRecCount() { return 0; }
    public final int getLogRecMaxSize() { return 0; }
    public final int getLogRecSize() { return 0; }
    protected java.lang.String getLogRecString(android.os.Message p0) { return null; }
    public final java.lang.String getName() { return null; }
    protected java.lang.String getWhatToString(int p0) { return null; }
    protected void haltedProcessMessage(android.os.Message p0) {}
    protected final boolean hasDeferredMessages(int p0) { return false; }
    protected final boolean hasMessages(int p0) { return false; }
    public boolean isDbg() { return false; }
    protected final boolean isQuit(android.os.Message p0) { return false; }
    protected void log(java.lang.String p0) {}
    protected void logAndAddLogRec(java.lang.String p0) {}
    protected void logd(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void loge(java.lang.String p0, java.lang.Throwable p1) {}
    protected void logi(java.lang.String p0) {}
    protected void logv(java.lang.String p0) {}
    protected void logw(java.lang.String p0) {}
    public final android.os.Message obtainMessage() { return null; }
    public final android.os.Message obtainMessage(int p0) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1, int p2) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public final android.os.Message obtainMessage(int p0, java.lang.Object p1) { return null; }
    protected void onHalting() {}
    protected void onPostHandleMessage(android.os.Message p0) {}
    protected void onPreHandleMessage(android.os.Message p0) {}
    protected void onQuitting() {}
    public final void quit() {}
    public final void quitNow() {}
    public final void quitNow(boolean p0) {}
    protected boolean recordLogRec(android.os.Message p0) { return false; }
    protected final void removeDeferredMessages(int p0) {}
    protected final void removeMessages(int p0) {}
    public final void removeState(com.android.internal.util.State p0) {}
    public void sendMessage(int p0) {}
    public void sendMessage(int p0, int p1) {}
    public void sendMessage(int p0, int p1, int p2) {}
    public void sendMessage(int p0, int p1, int p2, java.lang.Object p3) {}
    public void sendMessage(int p0, java.lang.Object p1) {}
    public void sendMessage(android.os.Message p0) {}
    protected final void sendMessageAtFrontOfQueue(int p0) {}
    protected final void sendMessageAtFrontOfQueue(int p0, int p1) {}
    protected final void sendMessageAtFrontOfQueue(int p0, int p1, int p2) {}
    protected final void sendMessageAtFrontOfQueue(int p0, int p1, int p2, java.lang.Object p3) {}
    protected final void sendMessageAtFrontOfQueue(int p0, java.lang.Object p1) {}
    protected final void sendMessageAtFrontOfQueue(android.os.Message p0) {}
    public void sendMessageDelayed(int p0, int p1, int p2, long p3) {}
    public void sendMessageDelayed(int p0, int p1, int p2, java.lang.Object p3, long p4) {}
    public void sendMessageDelayed(int p0, int p1, long p2) {}
    public void sendMessageDelayed(int p0, long p1) {}
    public void sendMessageDelayed(int p0, java.lang.Object p1, long p2) {}
    public void sendMessageDelayed(android.os.Message p0, long p1) {}
    public void setDbg(boolean p0) {}
    public final void setInitialState(com.android.internal.util.State p0) {}
    public final void setLogOnlyTransitions(boolean p0) {}
    public final void setLogRecSize(int p0) {}
    public void start() {}
    protected void start(boolean p0) {}
    public java.lang.String toString() { return null; }
    public final void transitionTo(com.android.internal.util.IState p0) {}
    public final void transitionToHaltingState() {}
    protected void unhandledMessage(android.os.Message p0) {}

    public static class LogRec {
        private com.android.internal.util.IState mDstState;
        private java.lang.String mInfo;
        private com.android.internal.util.IState mOrgState;
        private com.android.internal.util.StateMachine mSm;
        private com.android.internal.util.IState mState;
        private long mTime;
        private int mWhat;
        LogRec(com.android.internal.util.StateMachine p0, android.os.Message p1, java.lang.String p2, com.android.internal.util.IState p3, com.android.internal.util.IState p4, com.android.internal.util.IState p5) {}
        public com.android.internal.util.IState getDestState() { return null; }
        public java.lang.String getInfo() { return null; }
        public com.android.internal.util.IState getOriginalState() { return null; }
        public com.android.internal.util.IState getState() { return null; }
        public long getTime() { return 0L; }
        public long getWhat() { return 0L; }
        public java.lang.String toString() { return null; }
        public void update(com.android.internal.util.StateMachine p0, android.os.Message p1, java.lang.String p2, com.android.internal.util.IState p3, com.android.internal.util.IState p4, com.android.internal.util.IState p5) {}
    }

    private static class LogRecords {
        private static final int DEFAULT_SIZE = 20;
        private int mCount;
        private boolean mLogOnlyTransitions;
        private java.util.Vector<com.android.internal.util.StateMachine.LogRec> mLogRecVector;
        private int mMaxSize;
        private int mOldestIndex;
        private LogRecords() {}
        void add(com.android.internal.util.StateMachine p0, android.os.Message p1, java.lang.String p2, com.android.internal.util.IState p3, com.android.internal.util.IState p4, com.android.internal.util.IState p5) {}
        void cleanup() {}
        int count() { return 0; }
        com.android.internal.util.StateMachine.LogRec get(int p0) { return null; }
        boolean logOnlyTransitions() { return false; }
        void setLogOnlyTransitions(boolean p0) {}
        void setSize(int p0) {}
        int size() { return 0; }
    }

    private static class SmHandler extends android.os.Handler {
        private static final java.lang.Object mSmHandlerObj = null;
        private boolean mDbg;
        private final java.util.ArrayList<android.os.Message> mDeferredMessages = null;
        private com.android.internal.util.State mDestState;
        private final com.android.internal.util.StateMachine.SmHandler.HaltingState mHaltingState = null;
        private boolean mHasQuit;
        private com.android.internal.util.State mInitialState;
        private boolean mIsConstructionCompleted;
        private final com.android.internal.util.StateMachine.LogRecords mLogRecords = null;
        private android.os.Message mMsg;
        private final com.android.internal.util.StateMachine.SmHandler.QuittingState mQuittingState = null;
        private com.android.internal.util.StateMachine mSm;
        private final java.util.HashMap<com.android.internal.util.State, com.android.internal.util.StateMachine.SmHandler.StateInfo> mStateInfo = null;
        private com.android.internal.util.StateMachine.SmHandler.StateInfo[] mStateStack;
        private int mStateStackTopIndex;
        private com.android.internal.util.StateMachine.SmHandler.StateInfo[] mTempStateStack;
        private int mTempStateStackCount;
        private boolean mTransitionInProgress;
        private SmHandler(android.os.Looper p0, com.android.internal.util.StateMachine p1) { super(); }
        private final com.android.internal.util.StateMachine.SmHandler.StateInfo addState(com.android.internal.util.State p0, com.android.internal.util.State p1) { return null; }
        private final void cleanupAfterQuitting() {}
        private final void completeConstruction(boolean p0) {}
        private final void deferMessage(android.os.Message p0) {}
        private final android.os.Message getCurrentMessage() { return null; }
        private final com.android.internal.util.IState getCurrentState() { return null; }
        private final void invokeEnterMethods(int p0) {}
        private final void invokeExitMethods(com.android.internal.util.StateMachine.SmHandler.StateInfo p0) {}
        private final boolean isDbg() { return false; }
        private final boolean isQuit(android.os.Message p0) { return false; }
        private final void moveDeferredMessageAtFrontOfQueue() {}
        private final int moveTempStateStackToStateStack() { return 0; }
        private void performTransitions(com.android.internal.util.State p0, android.os.Message p1) {}
        private final com.android.internal.util.State processMsg(android.os.Message p0) { return null; }
        private final void quit() {}
        private final void quitNow(boolean p0) {}
        private void removeState(com.android.internal.util.State p0) {}
        private final void setDbg(boolean p0) {}
        private final void setInitialState(com.android.internal.util.State p0) {}
        private final void setupInitialStateStack() {}
        private final com.android.internal.util.StateMachine.SmHandler.StateInfo setupTempStateStackWithStatesToEnter(com.android.internal.util.State p0) { return null; }
        private final void transitionTo(com.android.internal.util.IState p0) {}
        public final void handleMessage(android.os.Message p0) {}

        private class HaltingState extends com.android.internal.util.State {
            private HaltingState(com.android.internal.util.StateMachine.SmHandler p0) { super(); }
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        private static class QuittingState extends com.android.internal.util.State {
            private QuittingState() { super(); }
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        private static class StateInfo {
            boolean active;
            final com.android.internal.util.StateMachine.SmHandler.StateInfo parentStateInfo = null;
            final com.android.internal.util.State state = null;
            StateInfo(com.android.internal.util.State p0, com.android.internal.util.StateMachine.SmHandler.StateInfo p1) {}
            public java.lang.String toString() { return null; }
        }
    }
}
