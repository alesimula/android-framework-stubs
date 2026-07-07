package android.app;

public class WallpaperManager {
    public static final java.lang.String ACTION_CHANGE_LIVE_WALLPAPER = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER";
    public static final java.lang.String ACTION_CROP_AND_SET_WALLPAPER = "android.service.wallpaper.CROP_AND_SET_WALLPAPER";
    public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
    public static final java.lang.String COMMAND_DROP = "android.home.drop";
    public static final java.lang.String COMMAND_FREEZE = "android.wallpaper.freeze";
    public static final java.lang.String COMMAND_GOING_TO_SLEEP = "android.wallpaper.goingtosleep";
    public static final java.lang.String COMMAND_KEYGUARD_APPEARING = "android.wallpaper.keyguardappearing";
    public static final java.lang.String COMMAND_KEYGUARD_GOING_AWAY = "android.wallpaper.keyguardgoingaway";
    public static final java.lang.String COMMAND_LOCKSCREEN_LAYOUT_CHANGED = "android.wallpaper.lockscreen_layout_changed";
    public static final java.lang.String COMMAND_LOCKSCREEN_TAP = "android.wallpaper.lockscreen_tap";
    public static final java.lang.String COMMAND_REAPPLY = "android.wallpaper.reapply";
    public static final java.lang.String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
    public static final java.lang.String COMMAND_TAP = "android.wallpaper.tap";
    public static final java.lang.String COMMAND_TRANSFORM_SURFACE_CONTROL = "android.wallpaper.transform_surface_control";
    public static final java.lang.String COMMAND_UNFREEZE = "android.wallpaper.unfreeze";
    public static final java.lang.String COMMAND_WAKING_UP = "android.wallpaper.wakingup";
    private static final boolean DEBUG = false;
    public static final java.lang.String EXTRA_FROM_FOREGROUND_APP = "android.service.wallpaper.extra.FROM_FOREGROUND_APP";
    public static final java.lang.String EXTRA_LIVE_WALLPAPER_COMPONENT = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT";
    public static final java.lang.String EXTRA_NEW_WALLPAPER_ID = "android.service.wallpaper.extra.ID";
    public static final java.lang.String EXTRA_WHICH_WALLPAPER_CHANGED = "android.service.wallpaper.extra.WHICH_WALLPAPER_CHANGED";
    public static final int FLAG_LOCK = 2;
    public static final int FLAG_SYSTEM = 1;
    private static final android.graphics.RectF LOCAL_COLOR_BOUNDS = null;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 0;
    public static final int ORIENTATION_SQUARE_LANDSCAPE = 3;
    public static final int ORIENTATION_SQUARE_PORTRAIT = 2;
    public static final int ORIENTATION_UNKNOWN = -1;
    private static final java.lang.String PROP_WALLPAPER = "ro.config.wallpaper";
    private static final java.lang.String PROP_WALLPAPER_COMPONENT = "ro.config.wallpaper_component";
    static final long RETURN_DEFAULT_ON_SECURITY_EXCEPTION = 239784307L;
    private static java.lang.String TAG;
    static final long THROW_ON_SECURITY_EXCEPTION = 237508058L;
    private static final java.lang.String VALUE_CMF_COLOR = null;
    private static final java.lang.String WALLPAPER_CMF_PATH = "/wallpaper/image/";
    public static final java.lang.String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
    private static android.app.WallpaperManager.Globals sGlobals;
    private static final java.lang.Object sSync = null;
    private final android.app.WallpaperManager.ColorManagementProxy mCmProxy = null;
    private final android.content.Context mContext = null;
    private float mWallpaperXStep;
    private float mWallpaperYStep;
    private final boolean mWcgEnabled = false;
    WallpaperManager() {}
    WallpaperManager(android.app.IWallpaperManager p0, android.content.Context p1, android.os.Handler p2) {}
    private static void checkExactlyOneWallpaperFlagSet(int p0) {}
    private void copyStreamToWallpaperFile(java.io.InputStream p0, java.io.FileOutputStream p1) throws java.io.IOException {}
    static long generateHashCode(android.graphics.Bitmap p0) { return 0L; }
    public static android.content.ComponentName getCmfDefaultWallpaperComponent(android.content.Context p0) { return null; }
    private static java.lang.String getCmfWallpaperPath() { return null; }
    private static android.os.ParcelFileDescriptor getDefaultSystemWallpaperFile() { return null; }
    private static java.util.List<java.lang.String> getDefaultSystemWallpaperPaths() { return null; }
    public static android.content.ComponentName getDefaultWallpaperComponent(android.content.Context p0) { return null; }
    public static android.app.WallpaperManager getInstance(android.content.Context p0) { return null; }
    private static android.graphics.RectF getMaxCropRect(int p0, int p1, int p2, int p3, float p4, float p5) { return null; }
    public static int getOrientation(android.graphics.Point p0) { return 0; }
    public static int getRotatedOrientation(int p0) { return 0; }
    private android.os.ParcelFileDescriptor getWallpaperFile(int p0, int p1, boolean p2) { return null; }
    private static java.io.InputStream getWallpaperInputStream(java.lang.String p0) { return null; }
    static void initGlobals(android.app.IWallpaperManager p0, android.os.Looper p1) {}
    private static boolean isComponentExist(android.content.Context p0, android.content.ComponentName p1) { return false; }
    public static java.io.InputStream openDefaultWallpaper(android.content.Context p0, int p1) { return null; }
    public static java.io.InputStream openRawDefaultWallpaper(android.content.Context p0) { return null; }
    private int setBitmapWithDescription(android.graphics.Bitmap p0, android.app.wallpaper.WallpaperDescription p1, boolean p2, int p3, int p4) throws java.io.IOException { return 0; }
    private final void validateRect(android.graphics.Rect p0) {}
    public void addOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2) throws java.lang.IllegalArgumentException {}
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1) {}
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2) {}
    public void clear() throws java.io.IOException {}
    public void clear(int p0) throws java.io.IOException {}
    public void clearWallpaper() {}
    @android.annotation.SystemApi
    public void clearWallpaper(int p0, int p1) {}
    public void clearWallpaperOffsets(android.os.IBinder p0) {}
    public void forgetLoadedWallpaper() {}
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Bitmap getBitmap(boolean p0) { return null; }
    public android.graphics.Bitmap getBitmap(boolean p0, int p1) { return null; }
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1) { return null; }
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1, int p2) { return null; }
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1, int p2, boolean p3) { return null; }
    public android.util.SparseArray<android.graphics.Rect> getBitmapCrops(int p0) { return null; }
    public java.util.List<android.graphics.Rect> getBitmapCrops(android.graphics.Point p0, java.util.List<android.graphics.Point> p1, java.util.Map<android.graphics.Point, android.graphics.Rect> p2) { return null; }
    public java.util.List<android.graphics.Rect> getBitmapCrops(java.util.List<android.graphics.Point> p0, int p1, boolean p2) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable() { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4, int p5) { return null; }
    public android.app.WallpaperManager.ColorManagementProxy getColorManagementProxy() { return null; }
    public android.content.Intent getCropAndSetWallpaperIntent(android.net.Uri p0) { return null; }
    public int getDesiredMinimumHeight() { return 0; }
    public int getDesiredMinimumWidth() { return 0; }
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    public android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getFastDrawable() { return null; }
    public android.graphics.drawable.Drawable getFastDrawable(int p0) { return null; }
    public android.app.IWallpaperManager getIWallpaperManager() { return null; }
    public android.app.WallpaperColors getWallpaperColors(int p0) { return null; }
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1) { return null; }
    public android.app.WallpaperColors getWallpaperColors(android.graphics.Bitmap p0, java.util.Map<android.graphics.Point, android.graphics.Rect> p1) { return null; }
    @android.annotation.SystemApi
    public float getWallpaperDimAmount() { return 0.0f; }
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0) { return null; }
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, int p1) { return null; }
    @android.annotation.SystemApi
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, boolean p1) { return null; }
    public int getWallpaperId(int p0) { return 0; }
    public int getWallpaperIdForUser(int p0, int p1) { return 0; }
    public android.app.WallpaperInfo getWallpaperInfo() { return null; }
    public android.app.WallpaperInfo getWallpaperInfo(int p0) { return null; }
    public android.app.WallpaperInfo getWallpaperInfo(int p0, int p1) { return null; }
    public android.os.ParcelFileDescriptor getWallpaperInfoFile() { return null; }
    public android.app.WallpaperInfo getWallpaperInfoForUser(int p0) { return null; }
    @android.annotation.SystemApi
    public android.app.wallpaper.WallpaperInstance getWallpaperInstance(int p0) { return null; }
    public android.app.wallpaper.WallpaperInstance getWallpaperInstance(int p0, boolean p1) { return null; }
    public boolean hasResourceWallpaper(int p0) { return false; }
    public boolean hasSetWallpaper() { return false; }
    public boolean isLockscreenLiveWallpaperEnabled() { return false; }
    public boolean isSetWallpaperAllowed() { return false; }
    @android.annotation.SystemApi
    public boolean isWallpaperBackupEligible(int p0) { return false; }
    public boolean isWallpaperSupported() { return false; }
    public boolean lockScreenWallpaperExists() { return false; }
    public android.graphics.Rect peekBitmapDimensions() { return null; }
    public android.graphics.Rect peekBitmapDimensions(int p0) { return null; }
    public android.graphics.Rect peekBitmapDimensions(int p0, boolean p1) { return null; }
    public android.graphics.Rect peekBitmapDimensionsAsUser(int p0, boolean p1, int p2) { return null; }
    public android.graphics.drawable.Drawable peekDrawable() { return null; }
    public android.graphics.drawable.Drawable peekDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable peekFastDrawable() { return null; }
    public android.graphics.drawable.Drawable peekFastDrawable(int p0) { return null; }
    public void removeOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1) {}
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) {}
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3, int p4) throws java.io.IOException { return 0; }
    public void setBitmap(android.graphics.Bitmap p0) throws java.io.IOException {}
    public int setBitmapWithCrops(android.graphics.Bitmap p0, java.util.Map<android.graphics.Point, android.graphics.Rect> p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.SystemApi
    public int setBitmapWithDescription(android.graphics.Bitmap p0, android.app.wallpaper.WallpaperDescription p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.SystemApi
    public void setDisplayOffset(android.os.IBinder p0, int p1, int p2) {}
    public void setDisplayPadding(android.graphics.Rect p0) {}
    public int setResource(int p0, int p1) throws java.io.IOException { return 0; }
    public void setResource(int p0) throws java.io.IOException {}
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public void setStream(java.io.InputStream p0) throws java.io.IOException {}
    @android.annotation.SystemApi
    public int setStreamWithCrops(java.io.InputStream p0, android.util.SparseArray<android.graphics.Rect> p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public int setStreamWithCrops(java.io.InputStream p0, java.util.Map<android.graphics.Point, android.graphics.Rect> p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.SystemApi
    public int setStreamWithDescription(java.io.InputStream p0, android.app.wallpaper.WallpaperDescription p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.SystemApi
    public boolean setWallpaperComponent(android.content.ComponentName p0) { return false; }
    public boolean setWallpaperComponent(android.content.ComponentName p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setWallpaperComponentWithDescription(android.app.wallpaper.WallpaperDescription p0, int p1) { return false; }
    public boolean setWallpaperComponentWithDescription(android.app.wallpaper.WallpaperDescription p0, int p1, int p2) { return false; }
    @android.annotation.SystemApi
    public boolean setWallpaperComponentWithFlags(android.content.ComponentName p0, int p1) { return false; }
    public boolean setWallpaperComponentWithFlags(android.content.ComponentName p0, int p1, int p2) { return false; }
    @android.annotation.SystemApi
    public void setWallpaperDimAmount(float p0) {}
    public void setWallpaperOffsetSteps(float p0, float p1) {}
    public void setWallpaperOffsets(android.os.IBinder p0, float p1, float p2) {}
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) {}
    public boolean shouldEnableWideColorGamut() { return false; }
    public void suggestDesiredDimensions(int p0, int p1) {}
    public boolean wallpaperSupportsWcg(int p0) { return false; }

    private static class CachedWallpaper {
        final android.graphics.Bitmap mCachedWallpaper = null;
        final int mCachedWallpaperUserId = 0;
        final int mWhich = 0;
        CachedWallpaper(android.graphics.Bitmap p0, int p1, int p2) {}
        boolean isValid(int p0, int p1) { return false; }
    }

    public static class ColorManagementProxy {
        private final java.util.Set<android.graphics.ColorSpace> mSupportedColorSpaces = null;
        public ColorManagementProxy(android.content.Context p0) {}
        void doColorManagement(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1) {}
        public java.util.Set<android.graphics.ColorSpace> getSupportedColorSpaces() { return null; }
        boolean isSupportedColorSpace(android.graphics.ColorSpace p0) { return false; }
    }

    static class FastBitmapDrawable extends android.graphics.drawable.Drawable {
        private final android.graphics.Bitmap mBitmap = null;
        private int mDrawLeft;
        private int mDrawTop;
        private final int mHeight = 0;
        private final android.graphics.Paint mPaint = null;
        private final int mWidth = 0;
        private FastBitmapDrawable(android.graphics.Bitmap p0) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public int getIntrinsicHeight() { return 0; }
        public int getIntrinsicWidth() { return 0; }
        public int getMinimumHeight() { return 0; }
        public int getMinimumWidth() { return 0; }
        public int getOpacity() { return 0; }
        public void setAlpha(int p0) {}
        public void setBounds(int p0, int p1, int p2, int p3) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public void setDither(boolean p0) {}
        public void setFilterBitmap(boolean p0) {}
    }

    private static class Globals extends android.app.IWallpaperManagerCallback.Stub {
        private android.app.WallpaperManager.CachedWallpaper mCachedWallpaper;
        private boolean mColorCallbackRegistered;
        private final java.util.ArrayList<android.util.Pair<android.app.WallpaperManager.OnColorsChangedListener, android.os.Handler>> mColorListeners = null;
        private android.graphics.Bitmap mDefaultWallpaper;
        private android.app.ILocalWallpaperColorConsumer mLocalColorCallback;
        private android.util.ArrayMap<android.app.WallpaperManager.LocalWallpaperColorConsumer, android.util.ArraySet<android.graphics.RectF>> mLocalColorCallbackAreas;
        private android.os.Handler mMainLooperHandler;
        private final android.app.IWallpaperManager mService = null;
        Globals(android.app.IWallpaperManager p0, android.os.Looper p1) { super(); }
        private android.graphics.Bitmap getCurrentWallpaperLocked(android.content.Context p0, int p1, int p2, boolean p3, android.app.WallpaperManager.ColorManagementProxy p4) { return null; }
        private android.graphics.Bitmap getDefaultWallpaper(android.content.Context p0, int p1) { return null; }
        private boolean isStaticWallpaper(int p0) { return false; }
        public void addOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) {}
        public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2, int p3) {}
        void forgetLoadedWallpaper() {}
        android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) { return null; }
        public void onWallpaperChanged() {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) {}
        public android.graphics.Bitmap peekWallpaperBitmap(android.content.Context p0, boolean p1, int p2, int p3, boolean p4, android.app.WallpaperManager.ColorManagementProxy p5) { return null; }
        public android.graphics.Bitmap peekWallpaperBitmap(android.content.Context p0, boolean p1, int p2, android.app.WallpaperManager.ColorManagementProxy p3) { return null; }
        public android.graphics.Rect peekWallpaperDimensions(android.content.Context p0, boolean p1, int p2, int p3) { return null; }
        public void removeOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0, int p1, int p2, int p3) {}
        public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1, int p2) {}
    }

    public static interface LocalWallpaperColorConsumer {
        public void onColorsChanged(android.graphics.RectF p0, android.app.WallpaperColors p1);
    }

    public static interface OnColorsChangedListener {
        public void onColorsChanged(android.app.WallpaperColors p0, int p1);
        default public void onColorsChanged(android.app.WallpaperColors p0, int p1, int p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenOrientation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetWallpaperFlags {
    }

    private class WallpaperSetCompletion extends android.app.IWallpaperManagerCallback.Stub {
        final java.util.concurrent.CountDownLatch mLatch = null;
        public WallpaperSetCompletion(android.app.WallpaperManager p0) { super(); }
        public void onWallpaperChanged() throws android.os.RemoteException {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) throws android.os.RemoteException {}
        public void waitForCompletion() {}
    }
}
