package android.app;

public class LocaleManager {
    private static final java.lang.String TAG = "LocaleManager";
    private android.content.Context mContext;
    private android.app.ILocaleManager mService;
    public LocaleManager(android.content.Context p0, android.app.ILocaleManager p1) {}
    private void setApplicationLocales(java.lang.String p0, android.os.LocaleList p1, boolean p2) {}
    public android.os.LocaleList getApplicationLocales() { return null; }
    public android.os.LocaleList getApplicationLocales(java.lang.String p0) { return null; }
    public android.app.LocaleConfig getOverrideLocaleConfig() { return null; }
    public android.os.LocaleList getSystemLocales() { return null; }
    public void setApplicationLocales(android.os.LocaleList p0) {}
    @android.annotation.SystemApi
    public void setApplicationLocales(java.lang.String p0, android.os.LocaleList p1) {}
    public void setOverrideLocaleConfig(android.app.LocaleConfig p0) {}
    public void setSystemLocales(android.os.LocaleList p0) {}
}
