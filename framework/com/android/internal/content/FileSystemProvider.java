package com.android.internal.content;

public abstract class FileSystemProvider extends android.provider.DocumentsProvider {
    private static final long ASYNC_CURSOR_TIMEOUT_MS = Long.valueOf(0L);
    private static final int DEFAULT_SEARCH_RESULT_LIMIT = 23;
    protected static final java.lang.String DIRECTORY_TRASH_STORAGE = ".trash-storage";
    private static final boolean LOG_INOTIFY = false;
    private static final int MAX_SEARCH_RESULT_LIMIT = 1000;
    private static final java.util.regex.Pattern PATTERN_EXPIRES_FILE = null;
    protected static final java.lang.String PREFIX_TRASHED = "trashed";
    private static final java.lang.String QUERY_ARG_REQUERY_SEQUENCE = "android:query-arg-requery-sequence";
    private static final java.lang.String QUERY_ARG_USE_ASYNC = "android:query-arg-use-async";
    protected static final java.lang.String SUPPORTED_QUERY_ARGS = null;
    private static final java.lang.String TAG = "FileSystemProvider";
    private java.lang.String[] mDefaultProjection;
    protected java.util.concurrent.ExecutorService mFetchExecutor;
    protected android.os.Handler mHandler;
    private final android.util.ArrayMap<java.io.File, com.android.internal.content.FileSystemProvider.DirectoryObserver> mObservers = null;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.database.Cursor> mSequenceCache = null;
    private final java.util.concurrent.atomic.AtomicInteger mSequenceGenerator = null;
    public FileSystemProvider() { super(); }
    private void addOriginalRelativePath(android.database.MatrixCursor.RowBuilder p0, java.lang.String[] p1, java.io.File p2) throws java.io.FileNotFoundException {}
    private void addToCacheAndScheduleCleanup(int p0, android.database.Cursor p1) {}
    private android.database.Cursor checkAsyncResultCache(android.os.Bundle p0) { return null; }
    private com.android.internal.content.FileSystemProvider.LoadingCursor createLoadingCursor(java.lang.String[] p0, int p1) { return null; }
    private void executeCleanup(int p0) {}
    private java.lang.String getDocumentType(java.lang.String p0, java.io.File p1) throws java.io.FileNotFoundException { return null; }
    private int getNextAsyncSequenceNumber() { return 0; }
    private java.lang.String getOriginalParentPath(java.io.File p0) { return null; }
    private void includeMediaStoreTrashFiles(android.database.MatrixCursor p0, java.lang.String p1) throws java.io.FileNotFoundException {}
    private void includeTrashFiles(android.database.MatrixCursor p0, java.io.File p1) throws java.io.FileNotFoundException {}
    private boolean isAsyncLoadingAllowed() { return false; }
    private boolean isAsyncLoadingRequest(android.os.Bundle p0) { return false; }
    private boolean isTrashFile(java.io.File p0) { return false; }
    private static java.lang.String joinNewline(java.lang.String... p0) { return null; }
    private boolean matchSearchQueryArguments(java.io.File p0, android.os.Bundle p1) { return false; }
    private void notifyTrashChange(java.lang.String p0) {}
    private android.os.ParcelFileDescriptor openFileForRead(java.io.File p0) throws java.io.FileNotFoundException { return null; }
    private android.database.Cursor querySearchDocumentsSync(java.io.File p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, android.os.Bundle p3) throws java.io.FileNotFoundException { return null; }
    private java.lang.String removeTrashPrefixFromPath(java.lang.String p0) { return null; }
    private java.lang.String removeTrashPrefixFromSegment(java.lang.String p0) { return null; }
    private java.lang.String[] resolveProjection(java.lang.String[] p0) { return null; }
    private void scanFile(java.io.File p0) {}
    private void startDirectoryLoader(java.io.File p0, java.lang.String[] p1, boolean p2, int p3, com.android.internal.content.FileSystemProvider.LoadingCursor p4, java.lang.String p5) {}
    private void startObserving(java.io.File p0, android.net.Uri p1, com.android.internal.content.FileSystemProvider.DirectoryCursor p2) {}
    private void startSearchLoader(java.io.File p0, java.util.Set<java.lang.String> p1, android.os.Bundle p2, java.lang.String[] p3, int p4, com.android.internal.content.FileSystemProvider.LoadingCursor p5) {}
    private void stopObserving(java.io.File p0, com.android.internal.content.FileSystemProvider.DirectoryCursor p1) {}
    private static void updateMediaStore(android.content.Context p0, java.io.File p1) {}
    protected abstract android.net.Uri buildNotificationUri(java.lang.String p0);
    protected android.net.Uri buildTrashNotificationUri(java.lang.String p0) { return null; }
    protected boolean callingAppHasManageDocumentsPermissions() { return false; }
    public java.lang.String createDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public void deleteDocument(java.lang.String p0) throws java.io.FileNotFoundException {}
    protected final java.util.List<java.lang.String> findDocumentPath(java.io.File p0, java.io.File p1) throws java.io.FileNotFoundException { return null; }
    protected abstract java.lang.String getDocIdForFile(java.io.File p0) throws java.io.FileNotFoundException;
    public android.os.Bundle getDocumentMetadata(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public java.lang.String getDocumentType(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    protected final java.io.File getFileForDocId(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    protected abstract java.io.File getFileForDocId(java.lang.String p0, boolean p1) throws java.io.FileNotFoundException;
    protected java.lang.String getRelativePathFromRoot(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    protected android.database.MatrixCursor.RowBuilder includeFile(android.database.MatrixCursor p0, java.lang.String p1, java.io.File p2) throws java.io.FileNotFoundException { return null; }
    public boolean isChildDocument(java.lang.String p0, java.lang.String p1) { return false; }
    protected boolean isSubtreeSearchSupported() { return false; }
    protected boolean isTrashSupported(java.io.File p0) throws java.io.FileNotFoundException { return false; }
    public java.lang.String moveDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    protected void onCreate(java.lang.String[] p0) {}
    public boolean onCreate() { return false; }
    protected void onDocIdChanged(java.lang.String p0) {}
    protected void onDocIdDeleted(java.lang.String p0, boolean p1) {}
    public android.os.ParcelFileDescriptor openDocument(java.lang.String p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openDocumentThumbnail(java.lang.String p0, android.graphics.Point p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor queryChildDocuments(java.lang.String p0, java.lang.String[] p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor queryChildDocuments(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    protected android.database.Cursor queryChildDocuments(java.lang.String p0, java.lang.String[] p1, java.lang.String p2, boolean p3) throws java.io.FileNotFoundException { return null; }
    public final android.database.Cursor queryChildDocumentsForManage(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor queryDocument(java.lang.String p0, java.lang.String[] p1) throws java.io.FileNotFoundException { return null; }
    protected final android.database.Cursor querySearchDocuments(java.io.File p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, android.os.Bundle p3) throws java.io.FileNotFoundException { return null; }
    protected final android.database.Cursor queryTrashDocuments(java.io.File p0, java.lang.String p1, java.lang.String[] p2) throws java.io.FileNotFoundException { return null; }
    public java.lang.String renameDocument(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public java.lang.String restoreDocumentFromTrash(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    protected boolean shouldBlockDirectoryFromTree(java.lang.String p0) throws java.io.FileNotFoundException { return false; }
    protected final boolean shouldHideDocument(java.io.File p0) throws java.io.FileNotFoundException { return false; }
    protected boolean shouldHideDocument(java.lang.String p0) throws java.io.FileNotFoundException { return false; }
    public void shutdown() {}
    public java.lang.String trashDocument(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    protected boolean typeSupportsMetadata(java.lang.String p0) { return false; }

    private class DirectoryCursor extends android.database.MatrixCursor {
        private final java.io.File mFile = null;
        public DirectoryCursor(com.android.internal.content.FileSystemProvider p0, java.lang.String[] p1, java.lang.String p2, java.io.File p3) { super((java.lang.String[])null); }
        public void close() {}
        public void notifyChanged() {}
    }

    private static class DirectoryObserver extends android.os.FileObserver {
        private static final int NOTIFY_EVENTS = 4044;
        private final java.util.concurrent.CopyOnWriteArrayList<com.android.internal.content.FileSystemProvider.DirectoryCursor> mCursors = null;
        private final java.io.File mFile = null;
        private final android.net.Uri mNotifyUri = null;
        private final android.content.ContentResolver mResolver = null;
        DirectoryObserver(java.io.File p0, android.content.ContentResolver p1, android.net.Uri p2) { super((java.io.File)null); }
        public void onEvent(int p0, java.lang.String p1) {}
        public java.lang.String toString() { return null; }
    }

    private static class LoadingCursor extends android.database.MatrixCursor {
        private java.util.concurrent.Future<?> mJob;
        LoadingCursor(java.lang.String[] p0) { super((java.lang.String[])null); }
        public void close() {}
        public void notifyChanged() {}
        public void setJob(java.util.concurrent.Future<?> p0) {}
    }
}
