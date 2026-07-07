package android.window;

public abstract class TaskSnapshotListener {
    public TaskSnapshotListener() {}
    protected void onTaskSnapshotChanged(int p0, android.window.TaskSnapshot p1) {}
    protected void onTaskSnapshotReleased(int p0) {}
}
