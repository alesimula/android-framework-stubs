package android.window;

public class SystemPerformanceHinter {
    public static final int HINT_ADPF = 4;
    public static final int HINT_ALL = 7;
    private static final int HINT_GLOBAL = 5;
    private static final int HINT_NO_OP = 0;
    private static final int HINT_PER_DISPLAY = 2;
    public static final int HINT_SF = 3;
    public static final int HINT_SF_EARLY_WAKEUP = 1;
    public static final int HINT_SF_FRAME_RATE = 2;
    private static final java.lang.String TAG = "SystemPerformanceHinter";
    private final java.util.ArrayList<android.window.SystemPerformanceHinter.HighPerfSession> mActiveSessions = null;
    private android.os.PerformanceHintManager.Session mAdpfSession;
    private android.window.SystemPerformanceHinter.DisplayRootProvider mDisplayRootProvider;
    private final android.gui.EarlyWakeupInfo mEarlyWakeupInfo = null;
    private final android.util.SparseArray<android.view.SurfaceControl> mHighFrameRateDisplaySurfaceControls = null;
    public long mTraceTag;
    private final android.view.SurfaceControl.Transaction mTransaction = null;
    public SystemPerformanceHinter(android.content.Context p0, android.window.SystemPerformanceHinter.DisplayRootProvider p1) {}
    public SystemPerformanceHinter(android.content.Context p0, android.window.SystemPerformanceHinter.DisplayRootProvider p1, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p2) {}
    private void asyncTraceBegin(int p0, int p1) {}
    private void asyncTraceEnd(int p0) {}
    private int calculateActiveHintFlags(int p0) { return 0; }
    private int calculateActiveHintFlagsForDisplay(int p0, int p1) { return 0; }
    private void endSession(android.window.SystemPerformanceHinter.HighPerfSession p0) {}
    private boolean nowDisabled(int p0, int p1, int p2) { return false; }
    private boolean nowEnabled(int p0, int p1, int p2) { return false; }
    private void startSession(android.window.SystemPerformanceHinter.HighPerfSession p0) {}
    public android.window.SystemPerformanceHinter.HighPerfSession createSession(int p0, int p1, java.lang.String p2) { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void setAdpfSession(android.os.PerformanceHintManager.Session p0) {}
    public android.window.SystemPerformanceHinter.HighPerfSession startSession(int p0, int p1, java.lang.String p2) { return null; }

    public static interface DisplayRootProvider {
        public android.view.SurfaceControl getRootForDisplay(int p0);
    }

    public class HighPerfSession implements java.lang.AutoCloseable {
        private final int displayId = 0;
        private final int hintFlags = 0;
        private java.lang.String mTraceName;
        private final java.lang.String reason = null;
        protected HighPerfSession(android.window.SystemPerformanceHinter p0, int p1, int p2, java.lang.String p3) {}
        boolean asyncTraceBegin() { return false; }
        boolean asyncTraceEnd() { return false; }
        public void close() {}
        public void finalize() {}
        public void start() {}
    }

    private static @interface HintFlags {
    }

    private class NoOpHighPerfSession extends android.window.SystemPerformanceHinter.HighPerfSession {
        public NoOpHighPerfSession(android.window.SystemPerformanceHinter p0) { super(null, 0, 0, null); }
        public void close() {}
        public void start() {}
    }
}
