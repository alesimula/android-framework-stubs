package com.android.internal.policy;

public class GestureNavigationSettingsObserver extends android.database.ContentObserver {
    private android.os.Handler mBgHandler;
    private android.content.Context mContext;
    private android.os.Handler mMainHandler;
    private java.lang.Runnable mOnChangeRunnable;
    public GestureNavigationSettingsObserver(android.os.Handler p0, android.os.Handler p1, android.content.Context p2, java.lang.Runnable p3) { super((android.os.Handler)null); }
    private float getUnscaledInset(android.content.res.Resources p0) { return 0.0f; }
    public boolean areNavigationButtonForcedVisible() { return false; }
    public int getLeftSensitivity(android.content.res.Resources p0) { return 0; }
    public int getLeftSensitivityForCallingUser(android.content.res.Resources p0) { return 0; }
    public int getRightSensitivity(android.content.res.Resources p0) { return 0; }
    public int getRightSensitivityForCallingUser(android.content.res.Resources p0) { return 0; }
    public void onChange(boolean p0) {}
    public void register() {}
    public void registerForCallingUser() {}
    public void unregister() {}
}
