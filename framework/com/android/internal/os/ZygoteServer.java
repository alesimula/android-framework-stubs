package com.android.internal.os;

class ZygoteServer {
    static final boolean $assertionsDisabled = false;
    private static final int INVALID_TIMESTAMP = -1;
    public static final java.lang.String TAG = "ZygoteServer";
    private boolean mCloseSocketFd;
    private boolean mIsFirstPropertyCheck;
    private boolean mIsForkChild;
    private long mLastPropCheckTimestamp;
    private boolean mUsapPoolEnabled;
    private final java.io.FileDescriptor mUsapPoolEventFD = null;
    private com.android.internal.os.ZygoteServer.UsapPoolRefillAction mUsapPoolRefillAction;
    private int mUsapPoolRefillDelayMs;
    private int mUsapPoolRefillThreshold;
    private long mUsapPoolRefillTriggerTimestamp;
    private int mUsapPoolSizeMax;
    private int mUsapPoolSizeMin;
    private final android.net.LocalServerSocket mUsapPoolSocket = null;
    private final boolean mUsapPoolSupported = false;
    private android.net.LocalServerSocket mZygoteSocket;
    ZygoteServer() {}
    ZygoteServer(boolean p0) {}
    private com.android.internal.os.ZygoteConnection acceptCommandPeer(java.lang.String p0) { return null; }
    private void fetchUsapPoolPolicyProps() {}
    private void fetchUsapPoolPolicyPropsIfUnfetched() {}
    private void fetchUsapPoolPolicyPropsWithMinInterval() {}
    private void resetUsapRefillState() {}
    void closeServerSocket() {}
    protected com.android.internal.os.ZygoteConnection createNewConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { return null; }
    java.lang.Runnable fillUsapPool(int[] p0, boolean p1) { return null; }
    java.io.FileDescriptor getZygoteSocketFileDescriptor() { return null; }
    public boolean isUsapPoolEnabled() { return false; }
    void registerServerSocketAtAbstractName(java.lang.String p0) {}
    java.lang.Runnable runSelectLoop(java.lang.String p0) { return null; }
    void setForkChild() {}
    java.lang.Runnable setUsapPoolStatus(boolean p0, android.net.LocalSocket p1) { return null; }

    private static enum UsapPoolRefillAction {
        DELAYED,
        IMMEDIATE,
        NONE;
        private static final com.android.internal.os.ZygoteServer.UsapPoolRefillAction[] $VALUES = null;
        private UsapPoolRefillAction() {}
    }
}
