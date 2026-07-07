package android.webkit;

public abstract class WebSettings {
    @android.annotation.SystemApi
    public static final long ENABLE_SIMPLIFIED_DARK_MODE = 214741472L;
    @android.annotation.SystemApi
    public static final long ENABLE_USER_AGENT_REDUCTION = 371034303L;
    public static final int FORCE_DARK_AUTO = 1;
    public static final int FORCE_DARK_OFF = 0;
    public static final int FORCE_DARK_ON = 2;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    @java.lang.Deprecated
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;
    public static final int MENU_ITEM_NONE = 0;
    public static final int MENU_ITEM_PROCESS_TEXT = 4;
    public static final int MENU_ITEM_SHARE = 1;
    public static final int MENU_ITEM_WEB_SEARCH = 2;
    public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
    public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
    public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
    public WebSettings() {}
    public static java.lang.String getDefaultUserAgent(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public abstract boolean enableSmoothTransition();
    @android.annotation.SystemApi
    public abstract boolean getAcceptThirdPartyCookies();
    public abstract boolean getAllowContentAccess();
    public abstract boolean getAllowFileAccess();
    public abstract boolean getAllowFileAccessFromFileURLs();
    public abstract boolean getAllowUniversalAccessFromFileURLs();
    public abstract boolean getBlockNetworkImage();
    public abstract boolean getBlockNetworkLoads();
    public abstract boolean getBuiltInZoomControls();
    public abstract int getCacheMode();
    public abstract java.lang.String getCursiveFontFamily();
    @java.lang.Deprecated
    public abstract boolean getDatabaseEnabled();
    @java.lang.Deprecated
    public abstract java.lang.String getDatabasePath();
    public abstract int getDefaultFixedFontSize();
    public abstract int getDefaultFontSize();
    public abstract java.lang.String getDefaultTextEncodingName();
    @java.lang.Deprecated
    public abstract android.webkit.WebSettings.ZoomDensity getDefaultZoom();
    public abstract int getDisabledActionModeMenuItems();
    public abstract boolean getDisplayZoomControls();
    public abstract boolean getDomStorageEnabled();
    public abstract java.lang.String getFantasyFontFamily();
    public abstract java.lang.String getFixedFontFamily();
    public int getForceDark() { return 0; }
    public abstract boolean getJavaScriptCanOpenWindowsAutomatically();
    public abstract boolean getJavaScriptEnabled();
    public abstract android.webkit.WebSettings.LayoutAlgorithm getLayoutAlgorithm();
    @java.lang.Deprecated
    public abstract boolean getLightTouchEnabled();
    public abstract boolean getLoadWithOverviewMode();
    public abstract boolean getLoadsImagesAutomatically();
    public abstract boolean getMediaPlaybackRequiresUserGesture();
    public abstract int getMinimumFontSize();
    public abstract int getMinimumLogicalFontSize();
    public abstract int getMixedContentMode();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract boolean getNavDump();
    public abstract boolean getOffscreenPreRaster();
    @java.lang.Deprecated
    public abstract android.webkit.WebSettings.PluginState getPluginState();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract boolean getPluginsEnabled();
    @java.lang.Deprecated
    public java.lang.String getPluginsPath() { return null; }
    public abstract boolean getSafeBrowsingEnabled();
    public abstract java.lang.String getSansSerifFontFamily();
    @java.lang.Deprecated
    public abstract boolean getSaveFormData();
    @java.lang.Deprecated
    public abstract boolean getSavePassword();
    public abstract java.lang.String getSerifFontFamily();
    public abstract java.lang.String getStandardFontFamily();
    @java.lang.Deprecated
    public android.webkit.WebSettings.TextSize getTextSize() { return null; }
    public abstract int getTextZoom();
    @java.lang.Deprecated
    public boolean getUseDoubleTree() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract boolean getUseWebViewBackgroundForOverscrollBackground();
    public abstract boolean getUseWideViewPort();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract int getUserAgent();
    public abstract java.lang.String getUserAgentString();
    @android.annotation.SystemApi
    public abstract boolean getVideoOverlayForEmbeddedEncryptedVideoEnabled();
    public boolean isAlgorithmicDarkeningAllowed() { return false; }
    @android.annotation.SystemApi
    public abstract void setAcceptThirdPartyCookies(boolean p0);
    public void setAlgorithmicDarkeningAllowed(boolean p0) {}
    public abstract void setAllowContentAccess(boolean p0);
    public abstract void setAllowFileAccess(boolean p0);
    @java.lang.Deprecated
    public abstract void setAllowFileAccessFromFileURLs(boolean p0);
    @java.lang.Deprecated
    public abstract void setAllowUniversalAccessFromFileURLs(boolean p0);
    @java.lang.Deprecated
    public void setAppCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    public void setAppCacheMaxSize(long p0) {}
    @java.lang.Deprecated
    public void setAppCachePath(java.lang.String p0) {}
    public abstract void setBlockNetworkImage(boolean p0);
    public abstract void setBlockNetworkLoads(boolean p0);
    public abstract void setBuiltInZoomControls(boolean p0);
    public abstract void setCacheMode(int p0);
    public abstract void setCursiveFontFamily(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void setDatabaseEnabled(boolean p0);
    @java.lang.Deprecated
    public abstract void setDatabasePath(java.lang.String p0);
    public abstract void setDefaultFixedFontSize(int p0);
    public abstract void setDefaultFontSize(int p0);
    public abstract void setDefaultTextEncodingName(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void setDefaultZoom(android.webkit.WebSettings.ZoomDensity p0);
    public abstract void setDisabledActionModeMenuItems(int p0);
    public abstract void setDisplayZoomControls(boolean p0);
    public abstract void setDomStorageEnabled(boolean p0);
    @java.lang.Deprecated
    public abstract void setEnableSmoothTransition(boolean p0);
    public abstract void setFantasyFontFamily(java.lang.String p0);
    public abstract void setFixedFontFamily(java.lang.String p0);
    public void setForceDark(int p0) {}
    @java.lang.Deprecated
    public abstract void setGeolocationDatabasePath(java.lang.String p0);
    public abstract void setGeolocationEnabled(boolean p0);
    public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean p0);
    public abstract void setJavaScriptEnabled(boolean p0);
    public abstract void setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm p0);
    @java.lang.Deprecated
    public abstract void setLightTouchEnabled(boolean p0);
    public abstract void setLoadWithOverviewMode(boolean p0);
    public abstract void setLoadsImagesAutomatically(boolean p0);
    public abstract void setMediaPlaybackRequiresUserGesture(boolean p0);
    public abstract void setMinimumFontSize(int p0);
    public abstract void setMinimumLogicalFontSize(int p0);
    public abstract void setMixedContentMode(int p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setNavDump(boolean p0);
    public abstract void setNeedInitialFocus(boolean p0);
    public abstract void setOffscreenPreRaster(boolean p0);
    @java.lang.Deprecated
    public abstract void setPluginState(android.webkit.WebSettings.PluginState p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setPluginsEnabled(boolean p0);
    @java.lang.Deprecated
    public void setPluginsPath(java.lang.String p0) {}
    @java.lang.Deprecated
    public abstract void setRenderPriority(android.webkit.WebSettings.RenderPriority p0);
    public abstract void setSafeBrowsingEnabled(boolean p0);
    public abstract void setSansSerifFontFamily(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void setSaveFormData(boolean p0);
    @java.lang.Deprecated
    public abstract void setSavePassword(boolean p0);
    public abstract void setSerifFontFamily(java.lang.String p0);
    public abstract void setStandardFontFamily(java.lang.String p0);
    public abstract void setSupportMultipleWindows(boolean p0);
    public abstract void setSupportZoom(boolean p0);
    @java.lang.Deprecated
    public void setTextSize(android.webkit.WebSettings.TextSize p0) {}
    public abstract void setTextZoom(int p0);
    @java.lang.Deprecated
    public void setUseDoubleTree(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setUseWebViewBackgroundForOverscrollBackground(boolean p0);
    public abstract void setUseWideViewPort(boolean p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setUserAgent(int p0);
    public abstract void setUserAgentString(java.lang.String p0);
    @android.annotation.SystemApi
    public abstract void setVideoOverlayForEmbeddedEncryptedVideoEnabled(boolean p0);
    public abstract boolean supportMultipleWindows();
    public abstract boolean supportZoom();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CacheMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForceDark {
    }

    public static enum LayoutAlgorithm {
        NARROW_COLUMNS,
        NORMAL,
        SINGLE_COLUMN,
        TEXT_AUTOSIZING;
        private static final android.webkit.WebSettings.LayoutAlgorithm[] $VALUES = null;
        private LayoutAlgorithm() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    private static @interface MenuItemFlags {
    }

    public static enum PluginState {
        OFF,
        ON,
        ON_DEMAND;
        private static final android.webkit.WebSettings.PluginState[] $VALUES = null;
        private PluginState() {}
    }

    public static enum RenderPriority {
        HIGH,
        LOW,
        NORMAL;
        private static final android.webkit.WebSettings.RenderPriority[] $VALUES = null;
        private RenderPriority() {}
    }

    @java.lang.Deprecated
    public static enum TextSize {
        LARGER,
        LARGEST,
        NORMAL,
        SMALLER,
        SMALLEST;
        private static final android.webkit.WebSettings.TextSize[] $VALUES = null;
        int value;
        private TextSize() {}
    }

    public static enum ZoomDensity {
        CLOSE,
        FAR,
        MEDIUM;
        private static final android.webkit.WebSettings.ZoomDensity[] $VALUES = null;
        int value;
        private ZoomDensity() {}
        public int getValue() { return 0; }
    }
}
