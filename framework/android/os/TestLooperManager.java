package android.os;

public class TestLooperManager {
    private static final android.util.ArraySet<android.os.Looper> sHeldLoopers = null;
    private final java.util.concurrent.LinkedBlockingQueue<android.os.TestLooperManager.MessageExecution> mExecuteQueue = null;
    private final android.os.Looper mLooper = null;
    private final java.util.concurrent.CountDownLatch mLooperHolderLatch = null;
    private final boolean mLooperIsMyLooper = false;
    private final android.os.MessageQueue mQueue = null;
    private boolean mReleased;
    public TestLooperManager(android.os.Looper p0) {}
    private void checkReleased() {}
    private void waitForLooperHolder() {}
    public void execute(android.os.Message p0) {}
    public android.os.MessageQueue getMessageQueue() { return null; }
    @java.lang.Deprecated
    public android.os.MessageQueue getQueue() { return null; }
    public boolean hasMessages(android.os.Handler p0, java.lang.Object p1, int p2) { return false; }
    public boolean hasMessages(android.os.Handler p0, java.lang.Object p1, java.lang.Runnable p2) { return false; }
    public boolean isBlockedOnSyncBarrier() { return false; }
    public android.os.Message next() { return null; }
    public java.lang.Long peekWhen() { return null; }
    public android.os.Message poll() { return null; }
    public void recycle(android.os.Message p0) {}
    public void release() {}

    private class LooperHolder implements java.lang.Runnable {
        private LooperHolder(android.os.TestLooperManager p0) {}
        private void processMessage(android.os.TestLooperManager.MessageExecution p0) {}
        public void run() {}
    }

    private static class MessageExecution {
        private android.os.Message m;
        private java.lang.Throwable response;
        private MessageExecution() {}
    }
}
