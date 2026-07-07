package android.telephony;

public class MessageUpgradeWorker {
    private static final java.lang.String AUTHORITY_MMS = "mms";
    private static final java.lang.String AUTHORITY_SMS = "sms";
    private static final boolean IS_DEBUG = false;
    private static final int MAX_PENDING_INTENTS = 50;
    private static final java.lang.String TAG = null;
    private java.lang.String mCachedDefaultSmsPackage;
    private boolean mCachedIsUpgradeSupported;
    private final android.content.Context mContext = null;
    private final android.content.BroadcastReceiver mDefaultSmsAppChangedReceiver = null;
    private final java.lang.Object mMessageUpgradeLock = null;
    private final android.telephony.MessageUpgradeWorker.PendingIntentCache mMmsPendingSentIntents = null;
    private final java.util.concurrent.ScheduledExecutorService mScheduler = null;
    private final android.service.messaging.AlternativeMessageTransportServiceWrapper mServiceWrapper = null;
    private final android.telephony.MessageUpgradeWorker.PendingIntentCache mSmsPendingDeliveryIntents = null;
    private final android.telephony.MessageUpgradeWorker.PendingIntentCache mSmsPendingSentIntents = null;
    public MessageUpgradeWorker(android.content.Context p0) {}
    private void discardAllPendingIntents(android.telephony.MessageUpgradeWorker.MessageType p0, long p1) {}
    private void discardUpgradedMessagePendingIntents(android.telephony.MessageUpgradeWorker.PendingIntentCache p0, long p1, boolean p2) {}
    private void dispatchDeliveryIntents(java.util.List<android.app.PendingIntent> p0, int p1) {}
    private void dispatchSentIntents(android.content.Context p0, java.util.List<android.app.PendingIntent> p1, int p2, int p3) {}
    private java.lang.String getCachedDefaultSmsAppPackage() { return null; }
    private java.util.List<android.app.PendingIntent> getUpgradedMessagePendingIntents(android.telephony.MessageUpgradeWorker.PendingIntentCache p0, long p1) { return null; }
    private boolean isMessageUpgradeSupported() { return false; }
    private void logMessageUpgradeResolved(int p0, android.telephony.MessageUpgradeWorker.MessageType p1, int p2, boolean p3) {}
    private long parseMessageId(android.net.Uri p0) { return 0L; }
    private android.telephony.MessageUpgradeWorker.MessageType parseMessageType(android.net.Uri p0) { return null; }
    private void registerOnSmsAppChangedReceiver(android.content.Context p0) {}
    private void rejectUpgradeRequest(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    private void storePendingIntents(android.telephony.MessageUpgradeWorker.MessageType p0, long p1, java.util.List<android.app.PendingIntent> p2, java.util.List<android.app.PendingIntent> p3) {}
    private void updateCachedDefaultSmsPackageData() {}
    public void close() {}
    public void dispatchMmsPendingIntentsIfUpgraded(android.net.Uri p0, android.content.ContentValues p1) {}
    public void dispatchSmsPendingIntentsIfUpgraded(android.net.Uri p0, android.content.ContentValues p1) {}
    public boolean isMessageUpgradeSupportedForPackage(java.lang.String p0, boolean p1) { return false; }
    public void upgradeMessage(android.net.Uri p0, java.util.List<android.app.PendingIntent> p1, java.util.List<android.app.PendingIntent> p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}

    private static enum MessageType {
        MMS,
        SMS,
        UNKNOWN;
        private static final android.telephony.MessageUpgradeWorker.MessageType[] $VALUES = null;
        private MessageType() {}
    }

    private static class PendingIntentCache extends java.util.LinkedHashMap<java.lang.Long, android.telephony.MessageUpgradeWorker.PendingIntentRecord> {
        private final int mMaxSize = 0;
        PendingIntentCache(int p0) { super(); }
        protected boolean removeEldestEntry(java.util.Map.Entry<java.lang.Long, android.telephony.MessageUpgradeWorker.PendingIntentRecord> p0) { return false; }
    }

    private static class PendingIntentRecord {
        final long mAddedTimeMs = 0L;
        final int mIntentType = 0;
        final java.util.List<android.app.PendingIntent> mIntents = null;
        final int mOriginalMessageType = 0;
        final int mSourceType = 0;
        PendingIntentRecord(java.util.List<android.app.PendingIntent> p0, int p1, int p2, int p3) {}
    }
}
