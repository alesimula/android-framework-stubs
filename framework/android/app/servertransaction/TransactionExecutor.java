package android.app.servertransaction;

public class TransactionExecutor {
    private static final boolean DEBUG_RESOLVER = false;
    private static final java.lang.String TAG = "TransactionExecutor";
    private final android.app.servertransaction.TransactionExecutorHelper mHelper = null;
    private final android.app.servertransaction.PendingTransactionActions mPendingActions = null;
    private final android.app.ClientTransactionHandler mTransactionHandler = null;
    public TransactionExecutor(android.app.ClientTransactionHandler p0) {}
    private void cycleToPath(android.app.ActivityThread.ActivityClientRecord p0, int p1, boolean p2, android.app.servertransaction.ClientTransaction p3) {}
    private void executeLifecycleItem(android.app.servertransaction.ClientTransaction p0, android.app.servertransaction.ActivityLifecycleItem p1) {}
    private void executeNonLifecycleItem(android.app.servertransaction.ClientTransaction p0, android.app.servertransaction.ClientTransactionItem p1, boolean p2) {}
    private void performLifecycleSequence(android.app.ActivityThread.ActivityClientRecord p0, android.util.IntArray p1, android.app.servertransaction.ClientTransaction p2) {}
    public void cycleToPath(android.app.ActivityThread.ActivityClientRecord p0, int p1, android.app.servertransaction.ClientTransaction p2) {}
    public void execute(android.app.servertransaction.ClientTransaction p0) {}
    public void executeTransactionItems(android.app.servertransaction.ClientTransaction p0) {}
}
