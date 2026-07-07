package android.os;

public final class WaitState {
    private static final long COUNTER_BITS = 20L;
    private static final long HAS_SYNC_BARRIER = 4611686018427387904L;
    private static final long IS_COUNTER = -9223372036854775808L;
    private static final long MASK = 4611686018427387903L;
    public WaitState() {}
    public static long composeDeadline(long p0, boolean p1) { return 0L; }
    public static long getCount(long p0) { return 0L; }
    public static long getTSMillis(long p0) { return 0L; }
    public static boolean hasSyncBarrier(long p0) { return false; }
    public static long incrementCounter(long p0) { return 0L; }
    public static long incrementDeadline(long p0) { return 0L; }
    public static long initCounter() { return 0L; }
    public static boolean isCounter(long p0) { return false; }
}
