package android.telephony;

public final class MessageUpgradeController {
    private static final java.lang.String TAG = null;
    private static volatile android.telephony.MessageUpgradeController sInstance;
    private static final android.util.SparseArray<android.telephony.MessageUpgradeWorker> sUpgradeWorkers = null;
    private MessageUpgradeController(android.content.Context p0) {}
    public static void dispatchMmsPendingIntentsIfUpgraded(android.content.Context p0, int p1, android.net.Uri p2, android.content.ContentValues p3) {}
    public static void dispatchSmsPendingIntentsIfUpgraded(android.content.Context p0, int p1, android.net.Uri p2, android.content.ContentValues p3) {}
    private static android.telephony.MessageUpgradeController getInstance(android.content.Context p0) { return null; }
    private android.telephony.MessageUpgradeWorker getUpgradeWorkerForUser(android.content.Context p0, int p1) { return null; }
    public static boolean isMessageUpgradeSupportedForPackage(android.content.Context p0, int p1, java.lang.String p2, boolean p3) { return false; }
    private void onUserRemoved(android.os.UserHandle p0) {}
    private void registerUserRemovedReceiver(android.content.Context p0) {}
    public static void upgradeMessage(android.content.Context p0, int p1, android.net.Uri p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, java.util.concurrent.Executor p5, java.util.function.Consumer<java.lang.Integer> p6) {}
}
