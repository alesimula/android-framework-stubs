package android.graphics;

public final class BLASTBufferQueue {
    public long mNativeObject;
    public BLASTBufferQueue(java.lang.String p0, boolean p1) {}
    private static native android.view.Surface nativeAidlGetSurfaceForPixelCopy(long p0);
    private static native void nativeAidlMergeWithNextTransaction(long p0, long p1);
    private static native void nativeAidlSetRemoteForTest(long p0, android.os.IBinder p1);
    private static native void nativeAidlStopContinuousSyncTransaction(long p0);
    private static native boolean nativeAidlSyncNextTransaction(long p0, android.gui.ITransactionReadyCallback p1, boolean p2);
    private static native void nativeAidlUpdate(long p0, long p1, long p2, long p3, int p4);
    private static native void nativeApplyPendingTransactions(long p0, long p1);
    private static native void nativeClearSyncTransaction(long p0);
    private static native long nativeCreate(java.lang.String p0, boolean p1);
    private static native void nativeDestroy(long p0);
    private static native android.view.SurfaceControl.Transaction nativeGatherPendingTransactions(long p0, long p1);
    private static native android.os.IBinder nativeGetIBinder(long p0);
    private static native long nativeGetLastAcquiredFrameNum(long p0);
    private static native android.view.Surface nativeGetSurface(long p0, boolean p1);
    private static native boolean nativeIsSameSurfaceControl(long p0, long p1);
    private static native void nativeMergeWithNextTransaction(long p0, long p1, long p2);
    private static native void nativeSetApplyToken(long p0, android.os.IBinder p1);
    private static native void nativeSetCornerRadiiCallback(long p0, android.graphics.BLASTBufferQueue.CornerRadiiCallback p1);
    private static native void nativeSetTransactionHangCallback(long p0, android.gui.ITransactionHangCallback p1);
    private static native void nativeSetWaitForBufferReleaseCallback(long p0, android.graphics.BLASTBufferQueue.WaitForBufferReleaseCallback p1);
    private static native void nativeStopContinuousSyncTransaction(long p0);
    private static native boolean nativeSyncNextTransaction(long p0, android.gui.ITransactionReadyCallback p1, boolean p2);
    private static native void nativeUpdate(long p0, long p1, long p2, long p3, int p4);
    public void aidlMergeWithNextTransaction(android.view.SurfaceControl.Transaction p0) {}
    public void aidlStopContinuousSyncTransaction() {}
    public boolean aidlSyncNextTransaction(boolean p0, android.gui.ITransactionReadyCallback p1) { return false; }
    public void aidlUpdate(android.view.SurfaceControl p0, int p1, int p2, int p3) {}
    public void applyPendingTransactions(long p0) {}
    public void clearSyncTransaction() {}
    public android.view.Surface createSurface() { return null; }
    public android.view.Surface createSurfaceWithHandle() { return null; }
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.view.SurfaceControl.Transaction gatherPendingTransactions(long p0) { return null; }
    public android.gui.IBLASTBufferQueue getIBlastBufferQueue() { return null; }
    public long getLastAcquiredFrameNum() { return 0L; }
    public android.view.Surface getSurfaceForPixelCopy() { return null; }
    public boolean isSameSurfaceControl(android.view.SurfaceControl p0) { return false; }
    public void mergeWithNextTransaction(long p0, long p1) {}
    public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public void setApplyToken(android.os.IBinder p0) {}
    public void setCornerRadiiCallback(android.graphics.BLASTBufferQueue.CornerRadiiCallback p0) {}
    public void setRemoteForTest(android.gui.IBLASTBufferQueue p0) {}
    public void setTransactionHangCallback(android.gui.ITransactionHangCallback p0) {}
    public void setWaitForBufferReleaseCallback(android.graphics.BLASTBufferQueue.WaitForBufferReleaseCallback p0) {}
    public void stopContinuousSyncTransaction() {}
    public boolean syncNextTransaction(java.util.function.Consumer<android.view.SurfaceControl.Transaction> p0) { return false; }
    public boolean syncNextTransaction(boolean p0, android.gui.ITransactionReadyCallback p1) { return false; }
    public void update(android.view.SurfaceControl p0, int p1, int p2, int p3) {}

    public static interface CornerRadiiCallback {
        public void onCornerRadiiChanged(float[] p0);
    }

    public static interface WaitForBufferReleaseCallback {
        public void onWaitForBufferRelease(long p0);
    }
}
