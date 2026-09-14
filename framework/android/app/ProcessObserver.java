package android.app;

public abstract class ProcessObserver extends android.app.IProcessObserver.Stub {
    public ProcessObserver() { super(); }
    public void onForegroundActivitiesChanged(int p0, int p1, boolean p2) {}
    public void onForegroundServicesChanged(int p0, int p1, int p2) {}
    public void onProcessDied(int p0, int p1) {}
    public void onProcessStarted(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {}
}
