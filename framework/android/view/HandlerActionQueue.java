package android.view;

public class HandlerActionQueue {
    private android.view.HandlerActionQueue.HandlerAction[] mActions;
    private int mCount;
    public HandlerActionQueue() {}
    public void executeActions(android.os.Handler p0) {}
    public long getDelay(int p0) { return 0L; }
    public java.lang.Runnable getRunnable(int p0) { return null; }
    public void post(java.lang.Runnable p0) {}
    public void postDelayed(java.lang.Runnable p0, long p1) {}
    public void removeCallbacks(java.lang.Runnable p0) {}
    public int size() { return 0; }

    private static class HandlerAction {
        final java.lang.Runnable action = null;
        final long delay = 0L;
        public HandlerAction(java.lang.Runnable p0, long p1) {}
        public boolean matches(java.lang.Runnable p0) { return false; }
    }
}
