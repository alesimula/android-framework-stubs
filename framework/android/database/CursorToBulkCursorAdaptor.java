package android.database;

public final class CursorToBulkCursorAdaptor extends android.database.BulkCursorNative implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String TAG = "Cursor";
    private android.database.CrossProcessCursor mCursor;
    private android.database.CursorWindow mFilledWindow;
    private final java.lang.Object mLock = null;
    private android.database.CursorToBulkCursorAdaptor.ContentObserverProxy mObserver;
    private final java.lang.String mProviderName = null;
    public CursorToBulkCursorAdaptor(android.database.Cursor p0, android.database.IContentObserver p1, java.lang.String p2) { super(); }
    private void closeFilledWindowLocked() {}
    private void createAndRegisterObserverProxyLocked(android.database.IContentObserver p0) {}
    private void disposeLocked() {}
    private void throwIfCursorIsClosed() {}
    private void unregisterObserverProxyLocked() {}
    public void binderDied() {}
    public void close() {}
    public void deactivate() {}
    public android.database.BulkCursorDescriptor getBulkCursorDescriptor() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.database.CursorWindow getWindow(int p0) { return null; }
    public void onMove(int p0) {}
    public int requery(android.database.IContentObserver p0) { return 0; }
    public android.os.Bundle respond(android.os.Bundle p0) { return null; }

    private static final class ContentObserverProxy extends android.database.ContentObserver {
        protected android.database.IContentObserver mRemote;
        public ContentObserverProxy(android.database.IContentObserver p0, android.os.IBinder.DeathRecipient p1) { super((android.os.Handler)null); }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}
        public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0) { return false; }
    }
}
