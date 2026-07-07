package android.window;

public class WindowOrganizer {
    private static final android.util.Singleton<android.window.IWindowOrganizerController> IWindowOrganizerControllerSingleton = null;
    public WindowOrganizer() {}
    public static android.window.ITransitionMetricsReporter getTransitionMetricsReporter() { return null; }
    static android.window.IWindowOrganizerController getWindowOrganizerController() { return null; }
    public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.WindowContainerTransactionCallback p1) { return 0; }
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    public void finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) {}
    public void registerTransitionPlayer(android.window.ITransitionPlayer p0) {}
    public boolean shareTransactionQueue() { return false; }
    public android.os.IBinder startNewTransition(int p0, android.window.WindowContainerTransaction p1) { return null; }
    public void startTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) {}
    public void unregisterTransitionPlayer(android.window.ITransitionPlayer p0) {}
}
