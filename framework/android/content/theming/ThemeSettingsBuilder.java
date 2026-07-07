package android.content.theming;

public final class ThemeSettingsBuilder {
    private ThemeSettingsBuilder() {}
    static android.content.theming.ThemeSettings createSettingsForService(java.time.Instant p0, int p1, boolean p2, java.util.List<android.graphics.Color> p3) { return null; }

    static final class BuilderImpl implements android.content.theming.ThemeSettingsBuilder.StyleSelector, android.content.theming.ThemeSettingsBuilder.SeedConfiguration, android.content.theming.ThemeSettingsBuilder.DualSeedConfiguration {
        private java.time.Instant mAppliedTimestamp;
        private java.lang.Integer mThemeStyle;
        BuilderImpl() {}
        private android.content.theming.ThemeSettings build(boolean p0, java.util.List<android.graphics.Color> p1) { return null; }
        public android.content.theming.ThemeSettings buildFromWallpaper() { return null; }
        public android.content.theming.ThemeSettings buildFromWallpaper(android.graphics.Color p0) { return null; }
        public android.content.theming.ThemeSettings buildFromWallpaper(android.graphics.Color p0, android.graphics.Color p1) { return null; }
        public android.content.theming.ThemeSettings buildPreset(android.graphics.Color p0) { return null; }
        public android.content.theming.ThemeSettings buildPreset(android.graphics.Color p0, android.graphics.Color p1) { return null; }
        public android.content.theming.ThemeSettingsBuilder.DualSeedConfiguration cmf() { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration expressive() { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration fruitSalad() { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration monochromatic() { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration rainbow() { return null; }
        android.content.theming.ThemeSettingsBuilder.BuilderImpl setAppliedTimestamp(java.time.Instant p0) { return null; }
        android.content.theming.ThemeSettingsBuilder.SeedConfiguration setStyle(int p0) { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration spritz() { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration tonalSpot() { return null; }
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration vibrant() { return null; }
    }

    public static interface DualSeedConfiguration {
        public android.content.theming.ThemeSettings buildFromWallpaper();
        public android.content.theming.ThemeSettings buildFromWallpaper(android.graphics.Color p0, android.graphics.Color p1);
        public android.content.theming.ThemeSettings buildPreset(android.graphics.Color p0, android.graphics.Color p1);
    }

    public static interface SeedConfiguration {
        public android.content.theming.ThemeSettings buildFromWallpaper();
        public android.content.theming.ThemeSettings buildFromWallpaper(android.graphics.Color p0);
        public android.content.theming.ThemeSettings buildPreset(android.graphics.Color p0);
    }

    public static interface StyleSelector {
        public android.content.theming.ThemeSettingsBuilder.DualSeedConfiguration cmf();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration expressive();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration fruitSalad();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration monochromatic();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration rainbow();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration spritz();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration tonalSpot();
        public android.content.theming.ThemeSettingsBuilder.SeedConfiguration vibrant();
    }
}
