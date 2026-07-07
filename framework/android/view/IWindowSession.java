package android.view;

public interface IWindowSession extends android.os.IInterface {
    public void addSharedAnimationProvider(android.view.IWindow p0, android.window.sharedsurface.ISharedAnimationProvider p1, android.window.sharedsurface.SharedAnimationParams p2, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p3) throws android.os.RemoteException;
    public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) throws android.os.RemoteException;
    public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) throws android.os.RemoteException;
    public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean cancelDraw(android.view.IWindow p0, int p1) throws android.os.RemoteException;
    public void clearTouchableRegion(android.view.IWindow p0) throws android.os.RemoteException;
    public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException;
    public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException;
    public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) throws android.os.RemoteException;
    public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) throws android.os.RemoteException;
    public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException;
    public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException;
    public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) throws android.os.RemoteException;
    public android.view.InputChannel grantInputChannel(android.view.WindowInputChannelParams p0) throws android.os.RemoteException;
    public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) throws android.os.RemoteException;
    public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException;
    public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, int p6, float p7, float p8, float p9, float p10, android.content.ClipData p11) throws android.os.RemoteException;
    public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean prepareFrame(android.view.IWindow p0, int p1) throws android.os.RemoteException;
    public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8, android.view.WindowRelayoutResult p9) throws android.os.RemoteException;
    public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8) throws android.os.RemoteException;
    public void remove(android.os.IBinder p0) throws android.os.RemoteException;
    public void removeSharedAnimationProvider(android.window.sharedsurface.ISharedAnimationProvider p0) throws android.os.RemoteException;
    public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) throws android.os.RemoteException;
    public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException;
    public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException;
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException;
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.os.RemoteException;
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException;
    public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException;
    public void setOnBackInvokedCallbackInfoToEmbedded(android.window.InputTransferToken p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException;
    public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException;
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException;
    public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException;
    public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void updateInputChannel(android.view.WindowInputChannelParams p0) throws android.os.RemoteException;
    public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void updateSharedAnimationFilters(android.window.sharedsurface.ISharedAnimationProvider p0, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p1) throws android.os.RemoteException;
    public void updateSharedAnimationParams(android.window.sharedsurface.ISharedAnimationProvider p0, android.window.sharedsurface.SharedAnimationParams p1) throws android.os.RemoteException;
    public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException;

    public static class Default implements android.view.IWindowSession {
        public Default() {}
        public void addSharedAnimationProvider(android.view.IWindow p0, android.window.sharedsurface.ISharedAnimationProvider p1, android.window.sharedsurface.SharedAnimationParams p2, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p3) throws android.os.RemoteException {}
        public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) throws android.os.RemoteException { return 0; }
        public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
        public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean cancelDraw(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
        public void clearTouchableRegion(android.view.IWindow p0) throws android.os.RemoteException {}
        public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
        public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
        public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) throws android.os.RemoteException {}
        public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException {}
        public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) throws android.os.RemoteException {}
        public android.view.InputChannel grantInputChannel(android.view.WindowInputChannelParams p0) throws android.os.RemoteException { return null; }
        public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
        public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, int p6, float p7, float p8, float p9, float p10, android.content.ClipData p11) throws android.os.RemoteException { return null; }
        public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean prepareFrame(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
        public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8, android.view.WindowRelayoutResult p9) throws android.os.RemoteException { return 0; }
        public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8) throws android.os.RemoteException {}
        public void remove(android.os.IBinder p0) throws android.os.RemoteException {}
        public void removeSharedAnimationProvider(android.window.sharedsurface.ISharedAnimationProvider p0) throws android.os.RemoteException {}
        public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
        public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
        public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException {}
        public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
        public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.os.RemoteException {}
        public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
        public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
        public void setOnBackInvokedCallbackInfoToEmbedded(android.window.InputTransferToken p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
        public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
        public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException {}
        public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException { return false; }
        public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void updateInputChannel(android.view.WindowInputChannelParams p0) throws android.os.RemoteException {}
        public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void updateSharedAnimationFilters(android.window.sharedsurface.ISharedAnimationProvider p0, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p1) throws android.os.RemoteException {}
        public void updateSharedAnimationParams(android.window.sharedsurface.ISharedAnimationProvider p0, android.window.sharedsurface.SharedAnimationParams p1) throws android.os.RemoteException {}
        public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowSession {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowSession";
        static final int TRANSACTION_addSharedAnimationProvider = 42;
        static final int TRANSACTION_addToDisplay = 1;
        static final int TRANSACTION_addToDisplayAsUser = 2;
        static final int TRANSACTION_cancelDragAndDrop = 13;
        static final int TRANSACTION_cancelDraw = 39;
        static final int TRANSACTION_clearTouchableRegion = 38;
        static final int TRANSACTION_dragRecipientEntered = 14;
        static final int TRANSACTION_dragRecipientExited = 15;
        static final int TRANSACTION_dropForAccessibility = 11;
        static final int TRANSACTION_finishDrawing = 9;
        static final int TRANSACTION_finishMovingTask = 25;
        static final int TRANSACTION_generateDisplayHash = 35;
        static final int TRANSACTION_getWindowId = 22;
        static final int TRANSACTION_grantEmbeddedWindowFocus = 34;
        static final int TRANSACTION_grantInputChannel = 32;
        static final int TRANSACTION_moveFocusToAdjacentWindow = 40;
        static final int TRANSACTION_notifyImeWindowVisibilityChangedFromClient = 41;
        static final int TRANSACTION_onRectangleOnScreenRequested = 21;
        static final int TRANSACTION_outOfMemory = 6;
        static final int TRANSACTION_performDrag = 10;
        static final int TRANSACTION_pokeDrawLock = 23;
        static final int TRANSACTION_prepareFrame = 8;
        static final int TRANSACTION_relayout = 4;
        static final int TRANSACTION_relayoutAsync = 5;
        static final int TRANSACTION_remove = 3;
        static final int TRANSACTION_removeSharedAnimationProvider = 43;
        static final int TRANSACTION_reportDecorViewGestureInterceptionChanged = 30;
        static final int TRANSACTION_reportDropResult = 12;
        static final int TRANSACTION_reportKeepClearAreasChanged = 31;
        static final int TRANSACTION_reportSystemGestureExclusionChanged = 29;
        static final int TRANSACTION_sendWallpaperCommand = 20;
        static final int TRANSACTION_setInsets = 7;
        static final int TRANSACTION_setOnBackInvokedCallbackInfo = 36;
        static final int TRANSACTION_setOnBackInvokedCallbackInfoToEmbedded = 37;
        static final int TRANSACTION_setShouldZoomOutWallpaper = 18;
        static final int TRANSACTION_setWallpaperDisplayOffset = 19;
        static final int TRANSACTION_setWallpaperPosition = 16;
        static final int TRANSACTION_setWallpaperZoomOut = 17;
        static final int TRANSACTION_startMovingTask = 24;
        static final int TRANSACTION_updateAnimatingTypes = 28;
        static final int TRANSACTION_updateInputChannel = 33;
        static final int TRANSACTION_updateRequestedVisibleTypes = 27;
        static final int TRANSACTION_updateSharedAnimationFilters = 44;
        static final int TRANSACTION_updateSharedAnimationParams = 45;
        static final int TRANSACTION_updateTapExcludeRegion = 26;
        public Stub() { super(); }
        public static android.view.IWindowSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.IWindowSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addSharedAnimationProvider(android.view.IWindow p0, android.window.sharedsurface.ISharedAnimationProvider p1, android.window.sharedsurface.SharedAnimationParams p2, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p3) throws android.os.RemoteException {}
            public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) throws android.os.RemoteException { return 0; }
            public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) throws android.os.RemoteException { return 0; }
            public android.os.IBinder asBinder() { return null; }
            public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean cancelDraw(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
            public void clearTouchableRegion(android.view.IWindow p0) throws android.os.RemoteException {}
            public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
            public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
            public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) throws android.os.RemoteException {}
            public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException {}
            public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) throws android.os.RemoteException {}
            public android.view.InputChannel grantInputChannel(android.view.WindowInputChannelParams p0) throws android.os.RemoteException { return null; }
            public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
            public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
            public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, int p6, float p7, float p8, float p9, float p10, android.content.ClipData p11) throws android.os.RemoteException { return null; }
            public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean prepareFrame(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
            public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8, android.view.WindowRelayoutResult p9) throws android.os.RemoteException { return 0; }
            public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8) throws android.os.RemoteException {}
            public void remove(android.os.IBinder p0) throws android.os.RemoteException {}
            public void removeSharedAnimationProvider(android.window.sharedsurface.ISharedAnimationProvider p0) throws android.os.RemoteException {}
            public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
            public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
            public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException {}
            public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
            public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.os.RemoteException {}
            public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
            public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
            public void setOnBackInvokedCallbackInfoToEmbedded(android.window.InputTransferToken p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
            public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
            public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException {}
            public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException { return false; }
            public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void updateInputChannel(android.view.WindowInputChannelParams p0) throws android.os.RemoteException {}
            public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void updateSharedAnimationFilters(android.window.sharedsurface.ISharedAnimationProvider p0, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p1) throws android.os.RemoteException {}
            public void updateSharedAnimationParams(android.window.sharedsurface.ISharedAnimationProvider p0, android.window.sharedsurface.SharedAnimationParams p1) throws android.os.RemoteException {}
            public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
        }
    }
}
