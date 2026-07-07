package android.companion.virtual.audio;

final class UserRestrictionsDetector extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "UserRestrictionsDetector";
    private final android.content.Context mContext = null;
    private boolean mIsUnmuteMicDisallowed;
    private final java.lang.Object mLock = null;
    private final android.os.UserManager mUserManager = null;
    private android.companion.virtual.audio.UserRestrictionsDetector.UserRestrictionsCallback mUserRestrictionsCallback;
    UserRestrictionsDetector(android.content.Context p0) { super(); }
    boolean isUnmuteMicrophoneDisallowed() { return false; }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    void register(android.companion.virtual.audio.UserRestrictionsDetector.UserRestrictionsCallback p0) {}
    void unregister() {}

    static interface UserRestrictionsCallback {
        public void onMicrophoneRestrictionChanged(boolean p0);
    }
}
