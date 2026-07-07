package android.os;

public final class DdmSyncState {
    private static int sCurrentStageIndex;
    public DdmSyncState() {}
    private static java.lang.String getInternalState() { return null; }
    public static android.os.DdmSyncState.Stage getStage() { return null; }
    public static void next(android.os.DdmSyncState.Stage p0) {}
    public static void reset() {}

    public static enum Stage {
        Attach,
        Bind,
        Boot,
        Debugger,
        Named,
        Running;
        private static final android.os.DdmSyncState.Stage[] $VALUES = null;
        final java.lang.String mLabel = null;
        private Stage() {}
        public int toInt() { return 0; }
    }
}
