package com.android.internal.os;

public class NativeBinderStats {
    static final int DEFAULT_CALL_SHARDING = 20;
    static final boolean DEFAULT_ENABLED = false;
    static final int DEFAULT_PROCESS_SHARDING = 50;
    static final int DEFAULT_SPAM_SHARDING = 10;
    static final int DEFAULT_SYSTEM_CALL_SHARDING = 100;
    static final int DEFAULT_SYSTEM_PROCESS_SHARDING = 10;
    static final int DEFAULT_SYSTEM_SPAM_SHARDING = 50;
    private static final java.lang.String TAG = "NativeBinderStats";
    public int mCallSharding;
    private final android.content.Context mContext = null;
    public boolean mEnabled;
    public int mProcessSharding;
    private final com.android.internal.os.NativeBinderStats.SettingsObserver mSettingsObserver = null;
    public int mSpamSharding;
    public int mSystemCallSharding;
    public int mSystemProcessSharding;
    public int mSystemSpamSharding;
    public NativeBinderStats(android.content.Context p0) {}
    public com.android.internal.os.NativeBinderStats.SettingsObserver getSettingsObserverForTesting() { return null; }
    public void systemReady() {}

    public class SettingsObserver extends android.database.ContentObserver {
        private static final java.lang.String KEY_CALL_SHARDING = "call_sharding";
        private static final java.lang.String KEY_ENABLED = "enabled";
        private static final java.lang.String KEY_PROCESS_SHARDING = "process_sharding";
        private static final java.lang.String KEY_SPAM_SHARDING = "spam_sharding";
        private static final java.lang.String KEY_SYSTEM_CALL_SHARDING = "system_call_sharding";
        private static final java.lang.String KEY_SYSTEM_PROCESS_SHARDING = "system_process_sharding";
        private static final java.lang.String KEY_SYSTEM_SPAM_SHARDING = "system_spam_sharding";
        private final android.content.Context mContext = null;
        private final android.util.KeyValueListParser mParser = null;
        private final android.net.Uri mUri = null;
        SettingsObserver(com.android.internal.os.NativeBinderStats p0, android.content.Context p1) { super((android.os.Handler)null); }
        void onChange() {}
        public void onChange(boolean p0, android.net.Uri p1, int p2) {}
        void register() {}
    }
}
