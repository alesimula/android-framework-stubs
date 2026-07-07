package android.content;

public class ContentProviderClient implements android.content.ContentInterface, java.lang.AutoCloseable {
    private static final long CALL_NOT_CANCELLED_TIMEOUT_MILLIS = 21600000L;
    private static final java.lang.String TAG = "ContentProviderClient";
    private static android.os.Handler sAnrHandler;
    private static final java.lang.Object sLock = null;
    private android.content.ContentProviderClient.NotRespondingRunnable mAnrRunnable;
    private android.content.ContentProviderClient.NotRespondingRunnable mAnrRunnableOnCancel;
    private long mAnrTimeout;
    private long mAnrTimeoutOnCancel;
    private final android.content.AttributionSource mAttributionSource = null;
    private final java.lang.String mAuthority = null;
    private android.content.ContentProviderClient.CallNotCancelledRunnable mCallNotCancelledRunnable;
    private long mCallNotCancelledTimeoutMillis;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    private final android.content.IContentProvider mContentProvider = null;
    private final android.content.ContentResolver mContentResolver = null;
    private final java.lang.String mPackageName = null;
    private final boolean mStable = false;
    public ContentProviderClient(android.content.ContentResolver p0, android.content.IContentProvider p1, java.lang.String p2, boolean p3) {}
    public ContentProviderClient(android.content.ContentResolver p0, android.content.IContentProvider p1, boolean p2) {}
    private void afterRemote() {}
    private void afterRemote(android.os.CancellationSignal p0) {}
    private void beforeRemote() {}
    private void beforeRemote(android.os.CancellationSignal p0) {}
    private boolean closeInternal() { return false; }
    @java.lang.Deprecated
    public static void closeQuietly(android.content.ContentProviderClient p0) {}
    private <T extends java.lang.Object> T execute(android.content.ContentProviderClient.RemoteCall<T> p0) throws android.os.RemoteException { return null; }
    private <T extends java.lang.Object> T execute(android.os.CancellationSignal p0, android.content.ContentProviderClient.CancellableRemoteCall<T> p1) throws android.os.RemoteException { return null; }
    private <T extends java.lang.Object> T executeWithFileNotFound(android.os.CancellationSignal p0, android.content.ContentProviderClient.RemoteCallWithFileNotFound<T> p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    private <T extends java.lang.Object> T executeWithOperationApplicationException(android.content.ContentProviderClient.RemoteCallWithOperationApplicationException<T> p0) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    private android.os.CancellationSignal maybeWrapNotRespondingSignal(android.os.CancellationSignal p0) { return null; }
    private android.os.ICancellationSignal prepareRemoteCancellationSignal(android.os.CancellationSignal p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static void releaseQuietly(android.content.ContentProviderClient p0) {}
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> p0) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) throws android.os.RemoteException { return 0; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
    public final android.net.Uri canonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public int checkUriPermission(android.net.Uri p0, int p1, int p2) throws android.os.RemoteException { return 0; }
    public void close() {}
    public int delete(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    public android.content.ContentProvider getLocalContentProvider() { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) throws android.os.RemoteException { return null; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) throws android.os.RemoteException { return null; }
    public boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) throws android.os.RemoteException { return false; }
    @java.lang.Deprecated
    public boolean release() { return false; }
    public void setCallNotCancelledTimeout(long p0) {}
    @android.annotation.SystemApi
    public void setDetectNotResponding(long p0) {}
    @android.annotation.SystemApi
    public void setDetectNotRespondingOnCancel(long p0, long p1) {}
    public final android.net.Uri uncanonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) throws android.os.RemoteException { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }

    private final class CallNotCancelledRunnable implements java.lang.Runnable {
        private CallNotCancelledRunnable(android.content.ContentProviderClient p0) {}
        public void run() {}
    }

    @java.lang.FunctionalInterface
    private static interface CancellableRemoteCall<T extends java.lang.Object> {
        public T apply(android.os.ICancellationSignal p0) throws android.os.RemoteException;
    }

    private static final class CursorWrapperInner extends android.database.CrossProcessCursorWrapper {
        CursorWrapperInner(android.database.Cursor p0) { super(null); }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    private class NotRespondingRunnable implements java.lang.Runnable {
        private NotRespondingRunnable(android.content.ContentProviderClient p0) {}
        public void run() {}
    }

    @java.lang.FunctionalInterface
    private static interface RemoteCall<T extends java.lang.Object> {
        public T apply() throws android.os.RemoteException;
    }

    @java.lang.FunctionalInterface
    private static interface RemoteCallWithFileNotFound<T extends java.lang.Object> {
        public T apply(android.os.ICancellationSignal p0) throws android.os.RemoteException, java.io.FileNotFoundException;
    }

    @java.lang.FunctionalInterface
    private static interface RemoteCallWithOperationApplicationException<T extends java.lang.Object> {
        public T apply() throws android.os.RemoteException, android.content.OperationApplicationException;
    }
}
