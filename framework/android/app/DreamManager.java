package android.app;

public class DreamManager {
    private final android.content.Context mContext = null;
    private final com.android.internal.util.ClientListenerMultiplexer<android.app.DreamManager.DreamListener, android.service.dreams.IDreamManager, android.service.dreams.IDreamManagerListener> mMultiplexer = null;
    private final android.service.dreams.IDreamManager mService = null;
    public DreamManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    private void assertDreamSwitcherFlag() {}
    public boolean areDreamsSupported() { return false; }
    public boolean canStartDreaming(boolean p0) { return false; }
    public android.service.dreams.DreamPlaylist getDreamPlaylist() { return null; }
    public boolean isDreaming() { return false; }
    public boolean isScreensaverEnabled() { return false; }
    public void registerListener(java.util.concurrent.Executor p0, android.app.DreamManager.DreamListener p1) {}
    public void setActiveDream(android.content.ComponentName p0) {}
    public boolean setActiveDreamComponent(android.content.ComponentName p0) { return false; }
    public void setDevicePostured(boolean p0, int p1) {}
    public void setDreamIsObscured(boolean p0) {}
    public void setDreamOverlay(android.content.ComponentName p0) {}
    public void setScreensaverEnabled(boolean p0) {}
    public void setSystemDreamComponent(android.content.ComponentName p0) {}
    public void startDream() {}
    public void stopDream() {}
    public void unregisterListener(android.app.DreamManager.DreamListener p0) {}

    private final class DreamEventListener extends android.service.dreams.IDreamManagerListener.Stub {
        private DreamEventListener(android.app.DreamManager p0) { super(); }
        public void onPlaylistChanged(android.service.dreams.DreamPlaylist p0) {}
    }

    public static interface DreamListener {
        default public void onPlaylistChanged(android.service.dreams.DreamPlaylist p0) {}
    }
}
