package com.android.internal.policy;

public class FoldLockSettingsObserver extends android.database.ContentObserver {
    private static final java.util.Set<java.lang.String> SETTING_VALUES = null;
    public static final java.lang.String SETTING_VALUE_DEFAULT = "selective_stay_awake_key";
    public static final java.lang.String SETTING_VALUE_SELECTIVE_STAY_AWAKE = "selective_stay_awake_key";
    public static final java.lang.String SETTING_VALUE_SLEEP_ON_FOLD = "sleep_on_fold_key";
    public static final java.lang.String SETTING_VALUE_STAY_AWAKE_ON_FOLD = "stay_awake_on_fold_key";
    private final android.content.Context mContext = null;
    java.lang.String mFoldLockSetting;
    public FoldLockSettingsObserver(android.os.Handler p0, android.content.Context p1) { super((android.os.Handler)null); }
    public boolean isSelectiveStayAwake() { return false; }
    public boolean isSleepOnFold() { return false; }
    public boolean isStayAwakeOnFold() { return false; }
    public void onChange(boolean p0) {}
    public void register() {}
    java.lang.String request() { return null; }
    void requestAndCacheFoldLockSetting() {}
    void setCurrentFoldSetting(java.lang.String p0) {}
    public void unregister() {}
}
