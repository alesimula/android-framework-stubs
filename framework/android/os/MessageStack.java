package android.os;

public final class MessageStack {
    private static final java.lang.Object QUITTING_NODE_OBJ = null;
    private static final java.lang.String TAG = "MessageStack";
    private static final java.lang.invoke.VarHandle sFreelistHead = null;
    private static final java.lang.invoke.VarHandle sTop = null;
    private final android.os.MessageHeap mAsyncHeap = null;
    private volatile android.os.Message mFreelistHeadValue;
    private android.os.Message mLooperProcessed;
    private final android.os.MessageHeap mSyncHeap = null;
    private volatile android.os.Message mTopValue;
    public MessageStack() {}
    private android.os.MessageHeap getHeap(android.os.Message p0) { return null; }
    private android.os.MessageHeap getHeap(boolean p0) { return null; }
    private boolean isQuittingMessage(android.os.Message p0) { return false; }
    private boolean maybeRemoveFromHeap(android.os.Message p0) { return false; }
    private boolean messageMatches(android.os.Message p0, android.os.Message.MessageCompare p1, android.os.Handler p2, int p3, java.lang.Object p4, java.lang.Runnable p5, long p6) { return false; }
    private void removeFromStack(android.os.Message p0) {}
    public int combinedHeapCapacitiesForTest() { return 0; }
    public int combinedHeapSizesForTest() { return 0; }
    public void dispose() {}
    public void drainFreelist() {}
    int dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) { return 0; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    public int freelistSizeForTest() { return 0; }
    public long getQuittingTimestamp() throws java.lang.IllegalStateException { return 0L; }
    public boolean hasMessages(android.os.Message.MessageCompare p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    public void heapSweep() {}
    public boolean isQuitting() { return false; }
    public int moveMatchingToFreelist(android.os.Message.MessageCompare p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return 0; }
    public boolean moveSyncBarrierToFreelist(int p0) { return false; }
    public android.os.Message peek(boolean p0) { return null; }
    android.os.Message peekLastMessageForTest() { return null; }
    public android.os.Message pop(boolean p0) { return null; }
    public boolean pushMessage(android.os.Message p0) { return false; }
    public boolean pushQuitting(long p0) { return false; }
    public void remove(android.os.Message p0) {}
    public int sizeForTest() { return 0; }
}
