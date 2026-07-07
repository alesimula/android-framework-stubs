package android.content;

public abstract class BroadcastReceiver {
    private static final boolean DEBUG_STORE_ENABLED = Boolean.valueOf(false);
    private boolean mDebugUnregister;
    private android.content.BroadcastReceiver.PendingResult mPendingResult;
    public BroadcastReceiver() {}
    public final void abortBroadcast() {}
    void checkSynchronousHint() {}
    public final void clearAbortBroadcast() {}
    public final boolean getAbortBroadcast() { return false; }
    public final boolean getDebugUnregister() { return false; }
    public final android.content.BroadcastReceiver.PendingResult getPendingResult() { return null; }
    public final int getResultCode() { return 0; }
    public final java.lang.String getResultData() { return null; }
    public final android.os.Bundle getResultExtras(boolean p0) { return null; }
    @android.annotation.SystemApi
    public final android.os.UserHandle getSendingUser() { return null; }
    public int getSendingUserId() { return 0; }
    public java.lang.String getSentFromPackage() { return null; }
    public int getSentFromUid() { return 0; }
    public final android.content.BroadcastReceiver.PendingResult goAsync() { return null; }
    public final boolean isInitialStickyBroadcast() { return false; }
    public final boolean isOrderedBroadcast() { return false; }
    public abstract void onReceive(android.content.Context p0, android.content.Intent p1);
    public android.os.IBinder peekService(android.content.Context p0, android.content.Intent p1) { return null; }
    public final void setDebugUnregister(boolean p0) {}
    public final void setOrderedHint(boolean p0) {}
    public final void setPendingResult(android.content.BroadcastReceiver.PendingResult p0) {}
    public final void setResult(int p0, java.lang.String p1, android.os.Bundle p2) {}
    public final void setResultCode(int p0) {}
    public final void setResultData(java.lang.String p0) {}
    public final void setResultExtras(android.os.Bundle p0) {}

    public static class PendingResult {
        public static final int TYPE_COMPONENT = 0;
        public static final int TYPE_REGISTERED = 1;
        public static final int TYPE_UNREGISTERED = 2;
        boolean mAbortBroadcast;
        final boolean mAssumeDeliveredHint = false;
        private android.content.ReceiverFinishController mFinishController;
        boolean mFinished;
        final int mFlags = 0;
        final boolean mInitialStickyHint = false;
        final boolean mOrderedHint = false;
        java.lang.String mReceiverClassName;
        int mResultCode;
        java.lang.String mResultData;
        android.os.Bundle mResultExtras;
        final int mSendingUser = 0;
        final java.lang.String mSentFromPackage = null;
        final int mSentFromUid = 0;
        final android.os.IBinder mToken = null;
        final int mType = 0;
        public PendingResult(int p0, java.lang.String p1, android.os.Bundle p2, int p3, boolean p4, boolean p5, android.os.IBinder p6, int p7, int p8) {}
        public PendingResult(int p0, java.lang.String p1, android.os.Bundle p2, int p3, boolean p4, boolean p5, boolean p6, android.os.IBinder p7, int p8, int p9, int p10, java.lang.String p11) {}
        public static boolean guessAssumeDelivered(int p0, boolean p1) { return false; }
        public final void abortBroadcast() {}
        void checkSynchronousHint() {}
        public final void clearAbortBroadcast() {}
        public final void finish() {}
        public final boolean getAbortBroadcast() { return false; }
        public final int getResultCode() { return 0; }
        public final java.lang.String getResultData() { return null; }
        public final android.os.Bundle getResultExtras(boolean p0) { return null; }
        public int getSendingUserId() { return 0; }
        public java.lang.String getSentFromPackage() { return null; }
        public int getSentFromUid() { return 0; }
        public void sendFinished(android.app.IActivityManager p0) {}
        public void setExtrasClassLoader(java.lang.ClassLoader p0) {}
        public void setFinishController(android.content.ReceiverFinishController p0) {}
        public final void setResult(int p0, java.lang.String p1, android.os.Bundle p2) {}
        public final void setResultCode(int p0) {}
        public final void setResultData(java.lang.String p0) {}
        public final void setResultExtras(android.os.Bundle p0) {}
    }
}
