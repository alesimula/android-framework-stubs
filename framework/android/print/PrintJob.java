package android.print;

public final class PrintJob {
    private android.print.PrintJobInfo mCachedInfo;
    private final android.print.PrintManager mPrintManager = null;
    PrintJob(android.print.PrintJobInfo p0, android.print.PrintManager p1) {}
    private boolean isInImmutableState() { return false; }
    public void cancel() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.print.PrintJobId getId() { return null; }
    public android.print.PrintJobInfo getInfo() { return null; }
    public int hashCode() { return 0; }
    public boolean isBlocked() { return false; }
    public boolean isCancelled() { return false; }
    public boolean isCompleted() { return false; }
    public boolean isFailed() { return false; }
    public boolean isQueued() { return false; }
    public boolean isStarted() { return false; }
    public void restart() {}
}
