package com.android.internal.widget.remotecompose.player.platform;

public class DefaultTypefaceResolver implements com.android.internal.widget.remotecompose.player.platform.TypefaceResolver {
    private static final java.lang.String SYSTEM_FONTS_PATH = "/system/fonts/";
    private final com.android.internal.widget.remotecompose.core.RemoteContext mContext = null;
    private final java.util.LinkedHashMap<java.lang.String, android.graphics.fonts.Font.Builder> mFontBuilderCache = null;
    private final java.util.LinkedHashMap<java.lang.String, java.lang.String> mPathCache = null;
    private final java.util.LinkedHashMap<java.lang.String, android.graphics.Typeface> mTypefaceCache = null;
    public DefaultTypefaceResolver(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    private android.graphics.fonts.Font.Builder createFontBuilder(byte[] p0, int p1, boolean p2) { return null; }
    private android.graphics.Typeface createTypeface(android.graphics.Typeface p0, int p1, boolean p2) { return null; }
    private android.graphics.Typeface createTypeface(java.lang.String p0, int p1, boolean p2, android.graphics.Typeface p3, int p4, boolean p5) { return null; }
    private android.graphics.fonts.Font.Builder fbFromString(java.lang.String p0, int p1, boolean p2) { return null; }
    private java.lang.String getFontPath(java.lang.String p0) { return null; }
    private android.graphics.Typeface tfFromString(java.lang.String p0, int p1, boolean p2, android.graphics.Typeface p3, int p4, boolean p5) { return null; }
    public com.android.internal.widget.remotecompose.player.platform.FontInstance resolve(int p0, int p1, boolean p2, android.graphics.Typeface p3, int p4, boolean p5) { return null; }
    public com.android.internal.widget.remotecompose.player.platform.FontInstance resolve(java.lang.String p0, int p1, boolean p2, android.graphics.Typeface p3, int p4, boolean p5) { return null; }

    private static class SimpleFontInstance implements com.android.internal.widget.remotecompose.player.platform.FontInstance {
        private final android.graphics.Typeface mTypeface = null;
        SimpleFontInstance(android.graphics.Typeface p0) {}
        public android.graphics.Typeface applyVariationSettings(java.lang.String[] p0, float[] p1) { return null; }
        public android.graphics.Typeface getTypeface() { return null; }
        public void setOnLoadedListener(java.lang.Runnable p0) {}
    }

    private static class BuilderFontInstance implements com.android.internal.widget.remotecompose.player.platform.FontInstance {
        private final android.graphics.fonts.Font.Builder mBuilder = null;
        private android.graphics.Typeface mTypeface;
        BuilderFontInstance(android.graphics.fonts.Font.Builder p0) {}
        private android.graphics.Typeface buildTypeface(android.graphics.fonts.FontVariationAxis[] p0) { return null; }
        public android.graphics.Typeface applyVariationSettings(java.lang.String[] p0, float[] p1) { return null; }
        public android.graphics.Typeface getTypeface() { return null; }
        public void setOnLoadedListener(java.lang.Runnable p0) {}
    }
}
