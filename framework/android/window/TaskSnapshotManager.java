package android.window;

public class TaskSnapshotManager {
    private static final android.util.Singleton<android.window.ITaskSnapshotManager> ISnapshotManagerSingleton = null;
    public static final int RESOLUTION_ANY = 3;
    public static final int RESOLUTION_HIGH = 1;
    public static final int RESOLUTION_LOW = 2;
    private static final java.lang.String TAG = "TaskSnapshotManager";
    private static boolean sIsUsed;
    private final java.lang.ref.Cleaner mCleaner = null;
    private final android.window.TaskSnapshotManager.GlobalSnapshotTracker mGlobalSnapshotTracker = null;
    private android.window.TaskSnapshotListenerTracker mInternalListener;
    private final java.lang.Object mLock = null;
    private TaskSnapshotManager() {}
    public static int convertRetrieveFlag(boolean p0) { return 0; }
    public static android.window.TaskSnapshotManager getInstance() { return null; }
    public static boolean isResolutionMatch(android.window.TaskSnapshot p0, int p1) { return false; }
    public static boolean isUsed() { return false; }
    public static void validateResolution(int p0) {}
    void createTrackerWithCount(int p0, android.window.TaskSnapshot p1, int p2) {}
    public void dump(java.io.PrintWriter p0) {}
    public android.window.TaskSnapshot getTaskSnapshot(int p0, int p1) throws android.os.RemoteException { return null; }
    public void registerTaskSnapshotListener(android.window.TaskSnapshotListener p0) {}
    void removeTracker(android.window.TaskSnapshotManager.SnapshotTracker p0) {}
    public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
    public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
    public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException { return null; }
    public void unregisterTaskSnapshotListener(android.window.TaskSnapshotListener p0) {}

    private class GlobalSnapshotTracker {
        final android.util.SparseArray<android.window.TaskSnapshotManager.GlobalSnapshotTracker.SingleTaskTracker> mSnapshotTrackers = null;
        private GlobalSnapshotTracker(android.window.TaskSnapshotManager p0) {}
        void createTracker(int p0, android.window.TaskSnapshot p1) {}
        void createTracker(int p0, android.window.TaskSnapshot p1, int p2) {}
        void dump(java.io.PrintWriter p0) {}
        android.window.TaskSnapshotManager.SnapshotTracker peekLatestSnapshot(int p0, int p1) { return null; }
        void removeTracker(android.window.TaskSnapshotManager.SnapshotTracker p0, boolean p1) {}

        static class SingleTaskTracker {
            static final java.util.Comparator<android.window.TaskSnapshotManager.SnapshotTracker> TRACKER_ORDER = null;
            final java.util.TreeSet<android.window.TaskSnapshotManager.SnapshotTracker> mHighResSortedTrackers = null;
            final java.util.TreeSet<android.window.TaskSnapshotManager.SnapshotTracker> mLowResSortedTrackers = null;
            SingleTaskTracker() {}
            private static android.window.TaskSnapshotManager.SnapshotTracker peekFirst(java.util.TreeSet<android.window.TaskSnapshotManager.SnapshotTracker> p0) { return null; }
            void addTracker(android.window.TaskSnapshotManager.SnapshotTracker p0) {}
            void dump(java.io.PrintWriter p0) {}
            boolean isEmpty() { return false; }
            android.window.TaskSnapshotManager.SnapshotTracker peekLatestSnapshot(int p0) { return null; }
            void stopTrack(android.window.TaskSnapshotManager.SnapshotTracker p0, boolean p1) {}
        }
    }

    private static final class NoPreloadHolder {
        private static final android.window.TaskSnapshotManager sInstance = null;
        private NoPreloadHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Resolution {
    }

    static class SnapshotTracker extends android.util.AndroidRuntimeException {
        private static final int ROOT_STACK_TRACE_COUNT = 4;
        final long mCaptureTime = 0L;
        final boolean mIsLowResolution = false;
        int mReferenceCount;
        final java.lang.ref.WeakReference<android.window.TaskSnapshot> mSnapshot = null;
        final long mSnapshotId = 0L;
        final int mTaskId = 0;
        SnapshotTracker(int p0, android.window.TaskSnapshot p1, int p2) { super(); }
        static java.lang.StringBuilder buildDumpString(android.util.AndroidRuntimeException p0) { return null; }
        int decreaseReference() { return 0; }
        void dump(java.io.PrintWriter p0) {}
        public java.lang.String getMessage() { return null; }
        void increaseReference() {}
    }
}
