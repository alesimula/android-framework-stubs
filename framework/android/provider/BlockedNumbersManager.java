package android.provider;

@android.annotation.SystemApi
public final class BlockedNumbersManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BLOCK_SUPPRESSION_STATE_CHANGED = "android.provider.action.BLOCK_SUPPRESSION_STATE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_PAYPHONE = "block_payphone_calls_setting";
    @android.annotation.SystemApi
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_PRIVATE = "block_private_number_calls_setting";
    @android.annotation.SystemApi
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNAVAILABLE = "block_unavailable_calls_setting";
    @android.annotation.SystemApi
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNKNOWN = "block_unknown_calls_setting";
    @android.annotation.SystemApi
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNREGISTERED = "block_numbers_not_in_contacts_setting";
    @android.annotation.SystemApi
    public static final java.lang.String ENHANCED_SETTING_KEY_SHOW_EMERGENCY_CALL_NOTIFICATION = "show_emergency_call_notification";
    private static final java.lang.String LOG_TAG = null;
    private static final int NUM_DIALABLE_DIGITS_TO_LOG = Integer.valueOf(0);
    private android.content.Context mContext;
    public BlockedNumbersManager(android.content.Context p0) {}
    private static int getDialableCount(java.lang.String p0) { return 0; }
    private static java.lang.String obfuscatePhoneNumber(java.lang.String p0) { return null; }
    private void verifyBlockedNumbersPermission() {}
    @android.annotation.SystemApi
    public void endBlockSuppression() {}
    @android.annotation.SystemApi
    public android.provider.BlockedNumbersManager.BlockSuppressionStatus getBlockSuppressionStatus() { return null; }
    @android.annotation.SystemApi
    public boolean getBlockedNumberSetting(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public void notifyEmergencyContact() {}
    @android.annotation.SystemApi
    public void setBlockedNumberSetting(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public boolean shouldShowEmergencyCallNotification() { return false; }
    @android.annotation.SystemApi
    public int shouldSystemBlockNumber(java.lang.String p0, int p1, boolean p2) { return 0; }

    @android.annotation.SystemApi
    public static final class BlockSuppressionStatus {
        private boolean mIsSuppressed;
        private long mUntilTimestampMillis;
        BlockSuppressionStatus(boolean p0, long p1) {}
        public boolean getIsSuppressed() { return false; }
        public long getUntilTimestampMillis() { return 0L; }
        public java.lang.String toString() { return null; }
    }
}
