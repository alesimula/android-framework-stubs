package android.os;

public class SystemService {
    private static java.lang.Object sPropertyLock;
    private static java.util.HashMap<java.lang.String, android.os.SystemService.State> sStates;
    public SystemService() {}
    public static android.os.SystemService.State getState(java.lang.String p0) { return null; }
    public static boolean isRunning(java.lang.String p0) { return false; }
    public static boolean isStopped(java.lang.String p0) { return false; }
    public static void restart(java.lang.String p0) {}
    public static void start(java.lang.String p0) {}
    public static void stop(java.lang.String p0) {}
    public static void waitForAnyStopped(java.lang.String... p0) {}
    public static void waitForState(java.lang.String p0, android.os.SystemService.State p1, long p2) throws java.util.concurrent.TimeoutException {}

    public static enum State {
        RESTARTING,
        RUNNING,
        STOPPED,
        STOPPING;
        private static final android.os.SystemService.State[] $VALUES = null;
        private State() {}
    }
}
