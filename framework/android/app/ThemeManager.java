package android.app;

public class ThemeManager {
    private final android.content.theming.IThemeManager mService = null;
    private final java.util.Map<android.app.ThemeManager.OnThemeSettingsChangedListener, android.app.ThemeManager.ThemeSettingsCallbackWrapper> mSettingsCallbacks = null;
    private final java.util.Map<android.app.ThemeManager.OnThemeChangedListener, android.app.ThemeManager.ThemeChangedCallbackWrapper> mThemeCallbacks = null;
    public ThemeManager(android.content.theming.IThemeManager p0) {}
    public static java.util.Map<java.lang.String, android.graphics.Color> extractColorPairs(android.content.om.FabricatedOverlay p0) { return null; }
    public void addOnThemeChangedListener(java.util.concurrent.Executor p0, android.app.ThemeManager.OnThemeChangedListener p1) {}
    public void addOnThemeSettingsChangedListener(java.util.concurrent.Executor p0, android.app.ThemeManager.OnThemeSettingsChangedListener p1) {}
    public android.content.om.FabricatedOverlay generateDynamicColorOverlay(android.content.theming.ThemeInfo p0) { return null; }
    public android.content.theming.ThemeSettings getThemeSettings() { return null; }
    public android.content.theming.ThemeSettings getThemeSettingsOrDefault() { return null; }
    public android.content.theming.ThemeInfo getUserThemeInfo() { return null; }
    public void removeOnThemeChangedListener(android.app.ThemeManager.OnThemeChangedListener p0) {}
    public void removeOnThemeSettingsChangedListener(android.app.ThemeManager.OnThemeSettingsChangedListener p0) {}
    public boolean updateThemeSettings(android.content.theming.ThemeSettings p0) { return false; }

    public static interface OnThemeChangedListener {
        public void onThemeChanged(android.content.theming.ThemeInfo p0);
    }

    public static interface OnThemeSettingsChangedListener {
        public void onThemeSettingsChanged(android.content.theming.ThemeSettings p0, android.content.theming.ThemeSettings p1);
    }

    private static class ThemeChangedCallbackWrapper extends android.content.theming.IThemeChangedCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.app.ThemeManager.OnThemeChangedListener mListener = null;
        ThemeChangedCallbackWrapper(java.util.concurrent.Executor p0, android.app.ThemeManager.OnThemeChangedListener p1) { super(); }
        public void onThemeChanged(android.content.theming.ThemeInfo p0) {}
    }

    private static class ThemeSettingsCallbackWrapper extends android.content.theming.IThemeSettingsCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.app.ThemeManager.OnThemeSettingsChangedListener mListener = null;
        ThemeSettingsCallbackWrapper(java.util.concurrent.Executor p0, android.app.ThemeManager.OnThemeSettingsChangedListener p1) { super(); }
        public void onSettingsChanged(android.content.theming.ThemeSettings p0, android.content.theming.ThemeSettings p1) {}
    }
}
