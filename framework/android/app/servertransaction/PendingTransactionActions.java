package android.app.servertransaction;

public class PendingTransactionActions {
    private boolean mCallOnPostCreate;
    private android.os.Bundle mOldState;
    private boolean mRestoreInstanceState;
    private android.app.servertransaction.PendingTransactionActions.StopInfo mStopInfo;
    public PendingTransactionActions() {}
    public void clear() {}
    public android.os.Bundle getOldState() { return null; }
    public android.app.servertransaction.PendingTransactionActions.StopInfo getStopInfo() { return null; }
    public void setCallOnPostCreate(boolean p0) {}
    public void setOldState(android.os.Bundle p0) {}
    public void setRestoreInstanceState(boolean p0) {}
    public void setStopInfo(android.app.servertransaction.PendingTransactionActions.StopInfo p0) {}
    public boolean shouldCallOnPostCreate() { return false; }
    public boolean shouldRestoreInstanceState() { return false; }

    public static class StopInfo implements java.lang.Runnable {
        private static final java.lang.String TAG = "ActivityStopInfo";
        private android.app.ActivityThread.ActivityClientRecord mActivity;
        private java.lang.CharSequence mDescription;
        private android.app.HandoffActivityData mHandoffActivityData;
        private android.os.PersistableBundle mPersistentState;
        private android.os.Bundle mState;
        public StopInfo() {}
        private java.lang.String collectBundleStates() { return null; }
        public void run() {}
        public void setActivity(android.app.ActivityThread.ActivityClientRecord p0) {}
        public void setDescription(java.lang.CharSequence p0) {}
        public void setHandoffActivityData(android.app.HandoffActivityData p0) {}
        public void setPersistentState(android.os.PersistableBundle p0) {}
        public void setState(android.os.Bundle p0) {}
    }
}
