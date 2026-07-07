package android.app;

public class ThemeManager {
    private final android.content.theming.IThemeManager mService = null;
    public ThemeManager(android.content.theming.IThemeManager p0) {}
    public static java.util.Map<java.lang.String, android.graphics.Color> extractColorPairs(android.content.om.FabricatedOverlay p0) { return null; }
    public android.content.om.FabricatedOverlay generateDynamicColorOverlay(android.content.theming.ThemeInfo p0) { return null; }
    public android.content.theming.ThemeSettings getThemeSettings() { return null; }
    public android.content.theming.ThemeSettings getThemeSettingsOrDefault() { return null; }
    public android.content.theming.ThemeInfo getUserThemeInfo() { return null; }
    public void registerThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) {}
    public boolean registerThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) { return false; }
    public void unregisterThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) {}
    public boolean unregisterThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) { return false; }
    public boolean updateThemeSettings(android.content.theming.ThemeSettings p0) { return false; }
}
