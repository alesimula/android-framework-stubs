package android.media;

public class LoudnessCodecDispatcher implements android.media.CallbackUtil.DispatcherStub {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "LoudnessCodecDispatcher";
    private final android.media.IAudioService mAudioService = null;
    public LoudnessCodecDispatcher(android.media.IAudioService p0) {}
    public void addLoudnessCodecInfo(int p0, int p1, android.media.LoudnessCodecInfo p2) {}
    public void addLoudnessCodecListener(android.media.LoudnessCodecController p0, java.util.concurrent.Executor p1, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p2) {}
    public android.os.Bundle getLoudnessCodecParams(android.media.LoudnessCodecInfo p0) { return null; }
    public void register(boolean p0) {}
    public void removeLoudnessCodecInfo(int p0, android.media.LoudnessCodecInfo p1) {}
    public void removeLoudnessCodecListener(android.media.LoudnessCodecController p0) {}
    public void startLoudnessCodecUpdates(int p0) {}
    public void stopLoudnessCodecUpdates(int p0) {}

    private static final class LoudnessCodecUpdatesDispatcherStub extends android.media.ILoudnessCodecUpdatesDispatcher.Stub {
        private static android.media.LoudnessCodecDispatcher.LoudnessCodecUpdatesDispatcherStub sLoudnessCodecStub;
        private final java.util.HashMap<android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener, android.media.LoudnessCodecController> mConfiguratorListener = null;
        private final java.lang.Object mLock = null;
        private final android.media.CallbackUtil.LazyListenerManager<android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener> mLoudnessListenerMgr = null;
        private LoudnessCodecUpdatesDispatcherStub() { super(); }
        private static android.os.Bundle filterLoudnessParams(android.os.Bundle p0) { return null; }
        public static android.media.LoudnessCodecDispatcher.LoudnessCodecUpdatesDispatcherStub getInstance() { return null; }
        void addLoudnessCodecListener(android.media.CallbackUtil.DispatcherStub p0, android.media.LoudnessCodecController p1, java.util.concurrent.Executor p2, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p3) {}
        public void dispatchLoudnessCodecParameterChange(int p0, android.os.PersistableBundle p1) {}
        void removeLoudnessCodecListener(android.media.LoudnessCodecController p0) {}
    }
}
