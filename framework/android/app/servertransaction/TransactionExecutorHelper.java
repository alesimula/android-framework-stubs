package android.app.servertransaction;

public class TransactionExecutorHelper {
    private static final int DESTRUCTION_PENALTY = 10;
    private static final int[] ON_RESUME_PRE_EXCUTION_STATES = null;
    private static final java.lang.String TAG = null;
    private final android.util.IntArray mLifecycleSequence = null;
    public TransactionExecutorHelper() {}
    private static int findNextLifecycleItemIndex(java.util.List<android.app.servertransaction.ClientTransactionItem> p0, int p1, android.os.IBinder p2) { return 0; }
    private static android.app.Activity getActivityForToken(android.os.IBinder p0, android.app.ClientTransactionHandler p1) { return null; }
    static java.lang.String getActivityName(android.os.IBinder p0, android.app.ClientTransactionHandler p1) { return null; }
    public static android.app.servertransaction.ActivityLifecycleItem getLifecycleRequestForCurrentState(android.app.ActivityThread.ActivityClientRecord p0) { return null; }
    static java.lang.String getShortActivityName(android.os.IBinder p0, android.app.ClientTransactionHandler p1) { return null; }
    static java.lang.String getStateName(int p0) { return null; }
    private static int lastCallbackRequestingStateIndex(java.util.List<android.app.servertransaction.ClientTransactionItem> p0, int p1, int p2, android.os.IBinder p3) { return 0; }
    private static boolean pathInvolvesDestruction(android.util.IntArray p0) { return false; }
    static boolean shouldExcludeLastLifecycleState(java.util.List<android.app.servertransaction.ClientTransactionItem> p0, int p1) { return false; }
    static java.lang.String tId(android.app.servertransaction.ClientTransaction p0) { return null; }
    static java.lang.String transactionToString(android.app.servertransaction.ClientTransaction p0, android.app.ClientTransactionHandler p1) { return null; }
    public int getClosestOfStates(android.app.ActivityThread.ActivityClientRecord p0, int[] p1) { return 0; }
    public int getClosestPreExecutionState(android.app.ActivityThread.ActivityClientRecord p0, int p1) { return 0; }
    public android.util.IntArray getLifecyclePath(int p0, int p1, boolean p2) { return null; }
}
