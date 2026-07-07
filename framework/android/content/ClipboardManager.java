package android.content;

public class ClipboardManager extends android.text.ClipboardManager {
    public static final java.lang.String DEVICE_CONFIG_ALLOW_VIRTUALDEVICE_SILOS = "allow_virtualdevice_silos";
    public static final boolean DEVICE_CONFIG_DEFAULT_ALLOW_VIRTUALDEVICE_SILOS = true;
    public static final boolean DEVICE_CONFIG_DEFAULT_SHOW_ACCESS_NOTIFICATIONS = true;
    public static final java.lang.String DEVICE_CONFIG_SHOW_ACCESS_NOTIFICATIONS = "show_access_notifications";
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private final java.util.ArrayList<android.content.ClipboardManager.OnPrimaryClipChangedListener> mPrimaryClipChangedListeners = null;
    private final android.content.IOnPrimaryClipChangedListener.Stub mPrimaryClipChangedServiceListener = null;
    private final android.content.IClipboard mService = null;
    public ClipboardManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    public void addPrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener p0) {}
    @android.annotation.SystemApi
    public boolean areClipboardAccessNotificationsEnabled() { return false; }
    public void clearPrimaryClip() {}
    public android.content.ClipData getPrimaryClip() { return null; }
    public android.content.ClipDescription getPrimaryClipDescription() { return null; }
    public java.lang.String getPrimaryClipSource() { return null; }
    @java.lang.Deprecated
    public java.lang.CharSequence getText() { return null; }
    public boolean hasPrimaryClip() { return false; }
    @java.lang.Deprecated
    public boolean hasText() { return false; }
    public void notifyUserAuthorizedClipAccess(int p0) {}
    public void removePrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener p0) {}
    void reportPrimaryClipChanged() {}
    @android.annotation.SystemApi
    public void setClipboardAccessNotificationsEnabled(boolean p0) {}
    public void setPrimaryClip(android.content.ClipData p0) {}
    @android.annotation.SystemApi
    public void setPrimaryClipAsPackage(android.content.ClipData p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setText(java.lang.CharSequence p0) {}

    public static interface OnPrimaryClipChangedListener {
        public void onPrimaryClipChanged();
    }
}
