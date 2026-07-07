package com.android.internal.policy;

public class ForceShowNavBarSettingsObserver extends android.database.ContentObserver {
    private android.content.Context mContext;
    private java.lang.Runnable mOnChangeRunnable;
    public ForceShowNavBarSettingsObserver(android.os.Handler p0, android.content.Context p1) { super((android.os.Handler)null); }
    public boolean isEnabled() { return false; }
    public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}
    public void register() {}
    public void setOnChangeRunnable(java.lang.Runnable p0) {}
    public void unregister() {}
}
