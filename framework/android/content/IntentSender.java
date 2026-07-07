package android.content;

public class IntentSender implements android.os.Parcelable {
    private static final long COVER_INTENT_SENDER = 405995292L;
    public static final android.os.Parcelable.Creator<android.content.IntentSender> CREATOR = null;
    private static final long REMOVE_HIDDEN_SEND_INTENT_METHOD = 356174596L;
    private static final android.os.Bundle SEND_INTENT_DEFAULT_OPTIONS = null;
    private static final java.lang.String TAG = "IntentSender";
    private android.app.ActivityManager.PendingIntentInfo mCachedInfo;
    private final android.content.IIntentSender mTarget = null;
    android.os.IBinder mWhitelistToken;
    public IntentSender(android.content.IIntentSender p0) {}
    public IntentSender(android.content.IIntentSender p0, android.os.IBinder p1) {}
    public IntentSender(android.os.IBinder p0) {}
    private android.app.ActivityManager.PendingIntentInfo getCachedInfo() { return null; }
    private android.os.Bundle getSendIntentDefaultOptions() { return null; }
    public static android.content.IntentSender readIntentSenderOrNullFromParcel(android.os.Parcel p0) { return null; }
    public static void writeIntentSenderOrNullToParcel(android.content.IntentSender p0, android.os.Parcel p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCreatorPackage() { return null; }
    public int getCreatorUid() { return 0; }
    public android.os.UserHandle getCreatorUserHandle() { return null; }
    public android.content.IIntentSender getTarget() { return null; }
    @java.lang.Deprecated
    public java.lang.String getTargetPackage() { return null; }
    public android.os.IBinder getWhitelistToken() { return null; }
    public int hashCode() { return 0; }
    public boolean isImmutable() { return false; }
    public void sendIntent(android.content.Context p0, int p1, android.content.Intent p2, android.content.IntentSender.OnFinished p3, android.os.Handler p4) throws android.content.IntentSender.SendIntentException {}
    public void sendIntent(android.content.Context p0, int p1, android.content.Intent p2, android.content.IntentSender.OnFinished p3, android.os.Handler p4, java.lang.String p5) throws android.content.IntentSender.SendIntentException {}
    @java.lang.Deprecated
    public void sendIntent(android.content.Context p0, int p1, android.content.Intent p2, android.content.IntentSender.OnFinished p3, android.os.Handler p4, java.lang.String p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void sendIntent(android.content.Context p0, int p1, android.content.Intent p2, java.lang.String p3, android.os.Bundle p4, java.util.concurrent.Executor p5, android.content.IntentSender.OnFinished p6) throws android.content.IntentSender.SendIntentException {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class FinishedDispatcher extends android.content.IIntentReceiver.Stub implements java.lang.Runnable {
        private final java.util.concurrent.Executor mExecutor = null;
        private android.content.Intent mIntent;
        private final android.content.IntentSender mIntentSender = null;
        private int mResultCode;
        private java.lang.String mResultData;
        private android.os.Bundle mResultExtras;
        private final android.content.IntentSender.OnFinished mWho = null;
        FinishedDispatcher(android.content.IntentSender p0, android.content.IntentSender.OnFinished p1, java.util.concurrent.Executor p2) { super(); }
        public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) {}
        public void run() {}
    }

    public static interface OnFinished {
        public void onSendFinished(android.content.IntentSender p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4);
    }

    public static class SendIntentException extends android.util.AndroidException {
        public SendIntentException() { super(); }
        public SendIntentException(java.lang.Exception p0) { super(); }
        public SendIntentException(java.lang.String p0) { super(); }
    }
}
