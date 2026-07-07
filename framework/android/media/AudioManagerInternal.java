package android.media;

public abstract class AudioManagerInternal {
    public AudioManagerInternal() {}
    public abstract void addAssistantServiceUid(int p0, int p1);
    public abstract int getRingerModeInternal();
    public abstract boolean isUserPlayingAudio(int p0);
    public abstract void removeAssistantServiceUid(int p0);
    public abstract void setAccessibilityServiceUids(android.util.IntArray p0);
    public abstract void setActiveAssistantServicesUids(android.util.IntArray p0);
    public abstract void setInputMethodServiceUid(int p0);
    public abstract void setRingerModeDelegate(android.media.AudioManagerInternal.RingerModeDelegate p0);
    public abstract void setRingerModeInternal(int p0, java.lang.String p1);
    public abstract void silenceRingerModeInternal(java.lang.String p0);
    public abstract void updateRingerModeAffectedStreamsInternal();

    public static interface RingerModeDelegate {
        public boolean canVolumeDownEnterSilent();
        public int getRingerModeAffectedStreams(int p0);
        public int onSetRingerModeExternal(int p0, int p1, java.lang.String p2, int p3, android.media.VolumePolicy p4);
        public int onSetRingerModeInternal(int p0, int p1, java.lang.String p2, int p3, android.media.VolumePolicy p4);
    }
}
