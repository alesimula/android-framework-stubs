package android.media;

public abstract class PlayerBase {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_APP_OPS = false;
    private static final java.lang.String TAG = "PlayerBase";
    private static android.media.IAudioService sService;
    private com.android.internal.app.IAppOpsService mAppOps;
    private com.android.internal.app.IAppOpsCallback mAppOpsCallback;
    protected android.media.AudioAttributes mAttributes;
    protected float mAuxEffectSendLevel;
    private int[] mDeviceIds;
    private boolean mHasAppOpsPlayAudio;
    private final int mImplType = 0;
    protected float mLeftVolume;
    private final java.lang.Object mLock = null;
    private float mPanMultiplierL;
    private float mPanMultiplierR;
    protected int mPlayerIId;
    protected float mRightVolume;
    private int mStartDelayMs;
    private int mState;
    private float mVolMultiplier;
    PlayerBase(android.media.AudioAttributes p0, int p1) {}
    public static void deprecateStreamTypeForPlayback(int p0, java.lang.String p1, java.lang.String p2) throws java.lang.IllegalArgumentException {}
    private static android.media.IAudioService getService() { return null; }
    protected static int resolvePlaybackSessionId(android.content.Context p0, int p1) { return 0; }
    private void updatePlayerVolume() {}
    private void updateState(int p0, int[] p1) {}
    void basePause() {}
    protected void baseRegisterPlayer(int p0) {}
    void baseRelease() {}
    int baseSetAuxEffectSendLevel(float p0) { return 0; }
    void baseSetPan(float p0) {}
    void baseSetStartDelayMs(int p0) {}
    void baseSetVolume(float p0, float p1) {}
    void baseStart(int[] p0) {}
    void baseStop() {}
    void baseUpdateAudioAttributes(android.media.AudioAttributes p0) {}
    void baseUpdateDeviceIds(java.util.List<android.media.AudioDeviceInfo> p0) {}
    void baseUpdateSessionId(int p0) {}
    protected java.lang.String getCurrentOpPackageName() { return null; }
    public int getPlayerIId() { return 0; }
    protected int getStartDelayMs() { return 0; }
    abstract int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1);
    abstract android.media.VolumeShaper.State playerGetVolumeShaperState(int p0);
    abstract void playerPause();
    abstract int playerSetAuxEffectSendLevel(boolean p0, float p1);
    abstract void playerSetVolume(boolean p0, float p1, float p2);
    abstract void playerStart();
    abstract void playerStop();
    public void setStartDelayMs(int p0) {}
    void setVolumeMultiplier(float p0) {}

    private static class IPlayerWrapper extends android.media.IPlayer.Stub {
        private final java.lang.ref.WeakReference<android.media.PlayerBase> mWeakPB = null;
        public IPlayerWrapper(android.media.PlayerBase p0) { super(); }
        public void applyVolumeShaper(android.media.VolumeShaperConfiguration p0, android.media.VolumeShaperOperation p1) {}
        public void pause() {}
        public void setPan(float p0) {}
        public void setStartDelayMs(int p0) {}
        public void setVolume(float p0) {}
        public void start() {}
        public void stop() {}
    }

    public static class PlayerIdCard implements android.os.Parcelable {
        public static final int AUDIO_ATTRIBUTES_DEFINED = 1;
        public static final int AUDIO_ATTRIBUTES_NONE = 0;
        public static final android.os.Parcelable.Creator<android.media.PlayerBase.PlayerIdCard> CREATOR = null;
        public final android.media.AudioAttributes mAttributes = null;
        public final android.media.IPlayer mIPlayer = null;
        public final int mPlayerType = 0;
        public final int mSessionId = 0;
        PlayerIdCard(int p0, android.media.AudioAttributes p1, android.media.IPlayer p2, int p3) {}
        private PlayerIdCard(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
