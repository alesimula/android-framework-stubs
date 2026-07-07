package android.window;

class TaskSnapshotListenerTracker extends android.window.ITaskSnapshotListener.Stub {
    private final java.util.ArrayList<android.window.TaskSnapshotListener> mLocalListeners = null;
    private final android.window.TaskSnapshotManager mManager = null;
    TaskSnapshotListenerTracker(android.window.TaskSnapshotManager p0) { super(); }
    boolean isEmpty() { return false; }
    public void onTaskSnapshotChanged(int p0, android.window.TaskSnapshot p1) {}
    public void onTaskSnapshotReleased(int p0) {}
    void registerLocalListener(android.window.TaskSnapshotListener p0) {}
    void unregisterLocalListener(android.window.TaskSnapshotListener p0) {}
}
