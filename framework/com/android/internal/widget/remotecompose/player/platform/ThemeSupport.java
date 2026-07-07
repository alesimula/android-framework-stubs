package com.android.internal.widget.remotecompose.player.platform;

public class ThemeSupport {
    com.android.internal.widget.remotecompose.player.platform.ThemeSupport.AndroidColors mAndroid;
    java.util.HashMap<java.lang.String, com.android.internal.widget.remotecompose.player.platform.ThemeSupport.ColorEngine> mColorEngineMap;
    java.util.HashMap<java.lang.String, java.lang.Integer> mColorMap;
    android.content.Context mContext;
    com.android.internal.widget.remotecompose.player.platform.RemoteComposeView mInner;
    public ThemeSupport() {}
    private int getColorFromResource(int p0) { return 0; }
    private int lookupColor(java.lang.String p0) { return 0; }
    private void setRColor(java.lang.String p0, int p1) {}
    public void mapColors(android.content.Context p0, com.android.internal.widget.remotecompose.player.platform.RemoteComposeView p1) {}

    static class AndroidColorEngine implements com.android.internal.widget.remotecompose.player.platform.ThemeSupport.ColorEngine {
        com.android.internal.widget.remotecompose.player.platform.ThemeSupport.AndroidColors mColors;
        AndroidColorEngine() {}
        public void getColors(android.content.Context p0, com.android.internal.widget.remotecompose.core.operations.ColorTheme p1) {}
    }

    static class AndroidColors {
        int[] mId;
        java.lang.String[] mName;
        AndroidColors() {}
        private static long[] $d2j$hex$9bfe34d5$decode_J(java.lang.String p0) { return null; }
        private static int[] $d2j$hex$9bfe34d5$decode_I(java.lang.String p0) { return null; }
        private static short[] $d2j$hex$9bfe34d5$decode_S(java.lang.String p0) { return null; }
        private static byte[] $d2j$hex$9bfe34d5$decode_B(java.lang.String p0) { return null; }
    }

    static interface ColorEngine {
        public void getColors(android.content.Context p0, com.android.internal.widget.remotecompose.core.operations.ColorTheme p1);
    }
}
