package android.os;

public final class MessageQueue {
    private static final boolean DEBUG = false;
    private static int INDEFINITE_TIMEOUT_MS;
    private static final long MPTR_TEARDOWN_MASK = -9223372036854775808L;
    private static final java.lang.String TAG_D = "DeliQueue";
    private static final java.lang.String TAG_L = "LegacyMessageQueue";
    public static final long USE_NEW_MESSAGEQUEUE = 421623328L;
    private static final java.lang.invoke.VarHandle sMptrRefCount = null;
    private static final java.lang.invoke.VarHandle sNextFrontInsertSeq = null;
    private static final java.lang.invoke.VarHandle sNextInsertSeq = null;
    private static boolean sUseDeliQueue;
    private static boolean sUseDeliQueueInitialized;
    private static final java.lang.invoke.VarHandle sWaitState = null;
    private int mAsyncMessageCount;
    private boolean mBlocked;
    private android.util.SparseArray<android.os.MessageQueue.FileDescriptorRecord> mFileDescriptorRecords;
    private final java.lang.Object mFileDescriptorRecordsLock = null;
    private final java.util.ArrayList<android.os.MessageQueue.IdleHandler> mIdleHandlers = null;
    private final java.lang.Object mIdleHandlersLock = null;
    private android.os.Message mLast;
    private volatile android.os.LooperDoctor mLooperDoctor;
    private final java.lang.Thread mLooperThread = null;
    private final java.util.concurrent.atomic.AtomicLong mMessageCount = null;
    android.os.Message mMessages;
    private volatile long mMptrRefCountValue;
    private int mNextBarrierToken;
    private final java.util.concurrent.atomic.AtomicInteger mNextBarrierTokenAtomic = null;
    private volatile long mNextFrontInsertSeqValue;
    private volatile long mNextInsertSeqValue;
    private int mNextPollTimeoutMillis;
    private android.os.MessageQueue.IdleHandler[] mPendingIdleHandlers;
    private long mPtr;
    private final boolean mQuitAllowed = false;
    private boolean mQuitting;
    private final android.os.MessageStack mStack = null;
    private volatile android.os.Message mSyncBarrier;
    private final java.lang.String mThreadName = null;
    private final long mTid = 0L;
    private volatile long mWaitState;
    private boolean mWorkerShouldQuit;
    MessageQueue(boolean p0) {}
    private void addIdleHandlerDeliQueue(android.os.MessageQueue.IdleHandler p0) {}
    private void addIdleHandlerLegacy(android.os.MessageQueue.IdleHandler p0) {}
    private void addOnFileDescriptorEventListenerDeliQueue(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    private void addOnFileDescriptorEventListenerLegacy(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    private static boolean computeUseDeliQueue(boolean p0) { return false; }
    private void concurrentWake() {}
    private void decAndTraceMessageCount() {}
    private void decAndTraceMessageCount(int p0) {}
    private void decrementMptrRefs() {}
    private int dispatchEvents(int p0, int p1) { return 0; }
    private void dispose() {}
    private boolean enqueueMessageDeliQueue(android.os.Message p0, long p1) { return false; }
    private boolean enqueueMessageLegacy(android.os.Message p0, long p1) { return false; }
    private boolean enqueueMessageUnchecked(android.os.Message p0, long p1) { return false; }
    public static java.lang.String getImplName() { return null; }
    static boolean getUseConcurrent() { return false; }
    private boolean hasEqualMessagesDeliQueue(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    private boolean hasEqualMessagesLegacy(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    private boolean hasMessagesDeliQueue(android.os.Handler p0) { return false; }
    private boolean hasMessagesDeliQueue(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    private boolean hasMessagesDeliQueue(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) { return false; }
    private boolean hasMessagesLegacy(android.os.Handler p0) { return false; }
    private boolean hasMessagesLegacy(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    private boolean hasMessagesLegacy(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) { return false; }
    private void incAndTraceMessageCount(android.os.Message p0, long p1) {}
    private boolean incrementMptrRefs() { return false; }
    private static boolean isBarrier(android.os.Message p0) { return false; }
    private boolean isIdleDeliQueue() { return false; }
    private boolean isIdleLegacy() { return false; }
    private boolean isPollingDeliQueue() { return false; }
    private boolean isPollingLegacy() { return false; }
    private boolean isPollingLocked() { return false; }
    private android.os.Message legacyPeekOrPoll(boolean p0) { return null; }
    private static void logDeadThread(android.os.Message p0) {}
    private boolean looperCheckIsIdle() { return false; }
    private static native void nativeDestroy(long p0);
    private static native long nativeInit();
    private static native boolean nativeIsPolling(long p0);
    private native void nativePollOnce(long p0, int p1);
    private static native void nativeSetFileDescriptorEvents(long p0, int p1, int p2);
    private static native void nativeSetSkipEpollWaitForZeroTimeout(long p0);
    private static native void nativeWake(long p0);
    private android.os.Message nextDeliQueue() { return null; }
    private android.os.Message nextLegacy() { return null; }
    private static void onResetForTestCalled() {}
    private int onSyncBarrierPosted(int p0) { return 0; }
    private void onSyncBarrierRemoved(int p0) {}
    private boolean onUnknownSyncBarrierUsed(int p0) { return false; }
    private android.os.Message peekLastMessageDeliQueue() { return null; }
    private android.os.Message peekLastMessageLegacy() { return null; }
    private int postSyncBarrierDeliQueue() { return 0; }
    private int postSyncBarrierLegacy() { return 0; }
    private void removeAllFdRecords() {}
    private void removeAllFutureMessages(long p0) {}
    private void removeAllFutureMessagesLocked() {}
    private void removeAllMessages() {}
    private void removeAllMessagesLocked() {}
    private void removeCallbacksAndEqualMessagesDeliQueue(android.os.Handler p0, java.lang.Object p1) {}
    private void removeCallbacksAndEqualMessagesLegacy(android.os.Handler p0, java.lang.Object p1) {}
    private void removeCallbacksAndMessagesDeliQueue(android.os.Handler p0, java.lang.Object p1) {}
    private void removeCallbacksAndMessagesLegacy(android.os.Handler p0, java.lang.Object p1) {}
    private void removeEqualMessagesDeliQueue(android.os.Handler p0, int p1, java.lang.Object p2) {}
    private void removeEqualMessagesDeliQueue(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    private void removeEqualMessagesLegacy(android.os.Handler p0, int p1, java.lang.Object p2) {}
    private void removeEqualMessagesLegacy(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    private void removeIdleHandlerDeliQueue(android.os.MessageQueue.IdleHandler p0) {}
    private void removeIdleHandlerLegacy(android.os.MessageQueue.IdleHandler p0) {}
    private void removeMessagesDeliQueue(android.os.Handler p0, int p1, java.lang.Object p2) {}
    private void removeMessagesDeliQueue(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    private void removeMessagesLegacy(android.os.Handler p0, int p1, java.lang.Object p2) {}
    private void removeMessagesLegacy(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    private void removeOnFileDescriptorEventListenerDeliQueue(java.io.FileDescriptor p0) {}
    private void removeOnFileDescriptorEventListenerLegacy(java.io.FileDescriptor p0) {}
    private void removeSyncBarrierDeliQueue(int p0) {}
    private void removeSyncBarrierLegacy(int p0) {}
    private void resetDeliQueue() {}
    private void resetLegacy() {}
    private void resetSyncBarrierTokens() {}
    private void setFileDescriptorEvents(int p0, int p1) {}
    private void setMptrTeardownAndWaitForRefsToDrop() {}
    static void setSkipEpollWaitForZeroTimeout(long p0) {}
    public static void setUseDeliQueue(boolean p0) {}
    private void traceMessageCount() {}
    private void updateOnFileDescriptorEventListenerLocked(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    public void addIdleHandler(android.os.MessageQueue.IdleHandler p0) {}
    public void addOnFileDescriptorEventListener(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    boolean enqueueMessage(android.os.Message p0, long p1) { return false; }
    protected void finalize() throws java.lang.Throwable {}
    java.lang.Thread getLooperThread() { return null; }
    boolean hasEqualMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0) { return false; }
    boolean hasMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) { return false; }
    boolean isBlockedOnSyncBarrier() { return false; }
    public boolean isIdle() { return false; }
    public boolean isPolling() { return false; }
    void maybeDrainFreelist() {}
    android.os.Message next() { return null; }
    android.os.Message nextMessage(boolean p0, boolean p1) { return null; }
    public android.os.Message peekLastMessageForTest() { return null; }
    java.lang.Long peekWhenForTest() { return null; }
    android.os.Message pollForTest() { return null; }
    public int postSyncBarrier() { return 0; }
    void quit(boolean p0) {}
    void removeCallbacksAndEqualMessages(android.os.Handler p0, java.lang.Object p1) {}
    void removeCallbacksAndMessages(android.os.Handler p0, java.lang.Object p1) {}
    void removeEqualMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeEqualMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void removeIdleHandler(android.os.MessageQueue.IdleHandler p0) {}
    void removeMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void removeOnFileDescriptorEventListener(java.io.FileDescriptor p0) {}
    public void removeSyncBarrier(int p0) {}
    public void resetForTest() {}
    public void setLooperDoctor(android.os.LooperDoctor p0) {}

    static final class FileDescriptorRecord {
        public final java.io.FileDescriptor mDescriptor = null;
        public int mEvents;
        public android.os.MessageQueue.OnFileDescriptorEventListener mListener;
        public int mSeq;
        public FileDescriptorRecord(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    }

    public static interface IdleHandler {
        public boolean queueIdle();
    }

    public static interface OnFileDescriptorEventListener {
        public static final int EVENT_ERROR = 4;
        public static final int EVENT_INPUT = 1;
        public static final int EVENT_OUTPUT = 2;
        public int onFileDescriptorEvents(java.io.FileDescriptor p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Events {
        }
    }
}
