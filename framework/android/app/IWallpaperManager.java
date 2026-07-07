package android.app;

public interface IWallpaperManager extends android.os.IInterface {
    public void addOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.graphics.Rect getBitmapCrop(android.graphics.Point p0, int[] p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException;
    public java.util.List getBitmapCrops(java.util.List<android.graphics.Point> p0, int p1, boolean p2, int p3) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getCroppedDefaultWallpaper(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.Bundle getCurrentBitmapCrops(int p0, int p1) throws android.os.RemoteException;
    public java.util.List getFutureBitmapCrops(android.graphics.Point p0, java.util.List<android.graphics.Point> p1, int[] p2, java.util.List<android.graphics.Rect> p3) throws android.os.RemoteException;
    public int getHeightHint(int p0) throws android.os.RemoteException;
    public java.lang.String getName() throws android.os.RemoteException;
    @java.lang.Deprecated
    public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException;
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException;
    public float getWallpaperDimAmount() throws android.os.RemoteException;
    public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException;
    public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getWallpaperInfoFile(int p0) throws android.os.RemoteException;
    public android.app.WallpaperInfo getWallpaperInfoWithFlags(int p0, int p1) throws android.os.RemoteException;
    public android.app.wallpaper.WallpaperInstance getWallpaperInstance(int p0, int p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getWallpaperWithFeature(java.lang.String p0, java.lang.String p1, android.app.IWallpaperManagerCallback p2, int p3, android.os.Bundle p4, int p5, boolean p6) throws android.os.RemoteException;
    public int getWidthHint(int p0) throws android.os.RemoteException;
    public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasSetWallpaper() throws android.os.RemoteException;
    public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException;
    public boolean isStaticWallpaper(int p0) throws android.os.RemoteException;
    public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException;
    public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException;
    public boolean lockScreenWallpaperExists() throws android.os.RemoteException;
    public void notifyGoingToSleep(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void notifyWakingUp(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException;
    public void removeOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.app.wallpaper.WallpaperDescription p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException;
    public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setWallpaperComponentChecked(android.app.wallpaper.WallpaperDescription p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void setWallpaperDescriptionId(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setWallpaperDimAmount(float p0, int p1, boolean p2) throws android.os.RemoteException;
    public void settingsRestored() throws android.os.RemoteException;
    public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.app.IWallpaperManager {
        public Default() {}
        public void addOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public android.graphics.Rect getBitmapCrop(android.graphics.Point p0, int[] p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException { return null; }
        public java.util.List getBitmapCrops(java.util.List<android.graphics.Point> p0, int p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getCroppedDefaultWallpaper(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getCurrentBitmapCrops(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List getFutureBitmapCrops(android.graphics.Point p0, java.util.List<android.graphics.Point> p1, int[] p2, java.util.List<android.graphics.Rect> p3) throws android.os.RemoteException { return null; }
        public int getHeightHint(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        @java.lang.Deprecated
        public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
        public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public float getWallpaperDimAmount() throws android.os.RemoteException { return 0.0f; }
        public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getWallpaperInfoFile(int p0) throws android.os.RemoteException { return null; }
        public android.app.WallpaperInfo getWallpaperInfoWithFlags(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.app.wallpaper.WallpaperInstance getWallpaperInstance(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getWallpaperWithFeature(java.lang.String p0, java.lang.String p1, android.app.IWallpaperManagerCallback p2, int p3, android.os.Bundle p4, int p5, boolean p6) throws android.os.RemoteException { return null; }
        public int getWidthHint(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean hasSetWallpaper() throws android.os.RemoteException { return false; }
        public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isStaticWallpaper(int p0) throws android.os.RemoteException { return false; }
        public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean lockScreenWallpaperExists() throws android.os.RemoteException { return false; }
        public void notifyGoingToSleep(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void notifyWakingUp(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
        public void removeOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.app.wallpaper.WallpaperDescription p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException { return null; }
        public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setWallpaperComponentChecked(android.app.wallpaper.WallpaperDescription p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void setWallpaperDescriptionId(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void setWallpaperDimAmount(float p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void settingsRestored() throws android.os.RemoteException {}
        public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IWallpaperManager";
        static final int TRANSACTION_addOnLocalColorsChangedListener = 30;
        static final int TRANSACTION_clearWallpaper = 17;
        static final int TRANSACTION_getBitmapCrop = 11;
        static final int TRANSACTION_getBitmapCrops = 8;
        static final int TRANSACTION_getCroppedDefaultWallpaper = 7;
        static final int TRANSACTION_getCurrentBitmapCrops = 9;
        static final int TRANSACTION_getFutureBitmapCrops = 10;
        static final int TRANSACTION_getHeightHint = 21;
        static final int TRANSACTION_getName = 23;
        static final int TRANSACTION_getWallpaper = 5;
        static final int TRANSACTION_getWallpaperColors = 28;
        static final int TRANSACTION_getWallpaperDimAmount = 37;
        static final int TRANSACTION_getWallpaperIdForUser = 12;
        static final int TRANSACTION_getWallpaperInfo = 13;
        static final int TRANSACTION_getWallpaperInfoFile = 16;
        static final int TRANSACTION_getWallpaperInfoWithFlags = 14;
        static final int TRANSACTION_getWallpaperInstance = 15;
        static final int TRANSACTION_getWallpaperWithFeature = 6;
        static final int TRANSACTION_getWidthHint = 20;
        static final int TRANSACTION_hasNamedWallpaper = 18;
        static final int TRANSACTION_hasSetWallpaper = 40;
        static final int TRANSACTION_isSetWallpaperAllowed = 26;
        static final int TRANSACTION_isStaticWallpaper = 39;
        static final int TRANSACTION_isWallpaperBackupEligible = 27;
        static final int TRANSACTION_isWallpaperSupported = 25;
        static final int TRANSACTION_lockScreenWallpaperExists = 38;
        static final int TRANSACTION_notifyGoingToSleep = 35;
        static final int TRANSACTION_notifyWakingUp = 34;
        static final int TRANSACTION_registerWallpaperColorsCallback = 31;
        static final int TRANSACTION_removeOnLocalColorsChangedListener = 29;
        static final int TRANSACTION_setDimensionHints = 19;
        static final int TRANSACTION_setDisplayPadding = 22;
        static final int TRANSACTION_setInAmbientMode = 33;
        static final int TRANSACTION_setWallpaper = 1;
        static final int TRANSACTION_setWallpaperComponent = 3;
        static final int TRANSACTION_setWallpaperComponentChecked = 2;
        static final int TRANSACTION_setWallpaperDescriptionId = 4;
        static final int TRANSACTION_setWallpaperDimAmount = 36;
        static final int TRANSACTION_settingsRestored = 24;
        static final int TRANSACTION_unregisterWallpaperColorsCallback = 32;
        public Stub() { super(); }
        public static android.app.IWallpaperManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IWallpaperManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public android.graphics.Rect getBitmapCrop(android.graphics.Point p0, int[] p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException { return null; }
            public java.util.List getBitmapCrops(java.util.List<android.graphics.Point> p0, int p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getCroppedDefaultWallpaper(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getCurrentBitmapCrops(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List getFutureBitmapCrops(android.graphics.Point p0, java.util.List<android.graphics.Point> p1, int[] p2, java.util.List<android.graphics.Rect> p3) throws android.os.RemoteException { return null; }
            public int getHeightHint(int p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getName() throws android.os.RemoteException { return null; }
            @java.lang.Deprecated
            public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
            public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public float getWallpaperDimAmount() throws android.os.RemoteException { return 0.0f; }
            public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getWallpaperInfoFile(int p0) throws android.os.RemoteException { return null; }
            public android.app.WallpaperInfo getWallpaperInfoWithFlags(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.app.wallpaper.WallpaperInstance getWallpaperInstance(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getWallpaperWithFeature(java.lang.String p0, java.lang.String p1, android.app.IWallpaperManagerCallback p2, int p3, android.os.Bundle p4, int p5, boolean p6) throws android.os.RemoteException { return null; }
            public int getWidthHint(int p0) throws android.os.RemoteException { return 0; }
            public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean hasSetWallpaper() throws android.os.RemoteException { return false; }
            public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isStaticWallpaper(int p0) throws android.os.RemoteException { return false; }
            public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean lockScreenWallpaperExists() throws android.os.RemoteException { return false; }
            public void notifyGoingToSleep(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void notifyWakingUp(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
            public void removeOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.app.wallpaper.WallpaperDescription p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException { return null; }
            public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setWallpaperComponentChecked(android.app.wallpaper.WallpaperDescription p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void setWallpaperDescriptionId(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void setWallpaperDimAmount(float p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void settingsRestored() throws android.os.RemoteException {}
            public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
