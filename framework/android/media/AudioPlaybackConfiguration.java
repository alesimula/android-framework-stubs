package android.media;

public final class AudioPlaybackConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioPlaybackConfiguration> CREATOR = null;
    private static final boolean DEBUG = false;
    public static final java.lang.String EXTRA_PLAYER_EVENT_CHANNEL_MASK = "android.media.extra.PLAYER_EVENT_CHANNEL_MASK";
    public static final java.lang.String EXTRA_PLAYER_EVENT_MUTE = "android.media.extra.PLAYER_EVENT_MUTE";
    public static final java.lang.String EXTRA_PLAYER_EVENT_SAMPLE_RATE = "android.media.extra.PLAYER_EVENT_SAMPLE_RATE";
    public static final java.lang.String EXTRA_PLAYER_EVENT_SPATIALIZED = "android.media.extra.PLAYER_EVENT_SPATIALIZED";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int MUTED_BY_APP_OPS = 8;
    @android.annotation.SystemApi
    public static final int MUTED_BY_CLIENT_VOLUME = 16;
    @android.annotation.SystemApi
    public static final int MUTED_BY_MASTER = 1;
    @android.annotation.SystemApi
    public static final int MUTED_BY_OP_CONTROL_AUDIO = 128;
    @android.annotation.SystemApi
    public static final int MUTED_BY_OP_PLAY_AUDIO = 8;
    @android.annotation.SystemApi
    public static final int MUTED_BY_PORT_VOLUME = 64;
    @android.annotation.SystemApi
    public static final int MUTED_BY_STREAM_MUTED = 4;
    @android.annotation.SystemApi
    public static final int MUTED_BY_STREAM_VOLUME = 2;
    @android.annotation.SystemApi
    public static final int MUTED_BY_VOLUME_SHAPER = 32;
    public static final int[] PLAYER_DEVICEIDS_INVALID = null;
    public static final int PLAYER_DEVICEID_INVALID = 0;
    public static final int PLAYER_PIID_INVALID = -1;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_IDLE = 1;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_PAUSED = 3;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_RELEASED = 0;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_STARTED = 2;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_STOPPED = 4;
    @android.annotation.SystemApi
    public static final int PLAYER_STATE_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_AAUDIO = 13;
    public static final int PLAYER_TYPE_EXTERNAL_PROXY = 15;
    public static final int PLAYER_TYPE_HW_SOURCE = 14;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_JAM_AUDIOTRACK = 1;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_JAM_MEDIAPLAYER = 2;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_JAM_SOUNDPOOL = 3;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_SLES_AUDIOPLAYER_BUFFERQUEUE = 11;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_SLES_AUDIOPLAYER_URI_FD = 12;
    @android.annotation.SystemApi
    public static final int PLAYER_TYPE_UNKNOWN = -1;
    public static final int PLAYER_UPDATE_DEVICE_ID = 5;
    public static final int PLAYER_UPDATE_FORMAT = 8;
    public static final int PLAYER_UPDATE_MUTED = 7;
    public static final int PLAYER_UPDATE_PORT_ID = 6;
    public static final int PLAYER_UPID_INVALID = -1;
    private static final java.lang.String TAG = null;
    public static android.media.AudioPlaybackConfiguration.PlayerDeathMonitor sPlayerDeathMonitor;
    private int mClientPid;
    private int mClientUid;
    private int[] mDeviceIds;
    private android.media.AudioPlaybackConfiguration.FormatInfo mFormatInfo;
    private android.media.AudioPlaybackConfiguration.IPlayerShell mIPlayerShell;
    private int mMutedState;
    private android.media.AudioAttributes mPlayerAttr;
    private final int mPlayerIId = 0;
    private int mPlayerState;
    private int mPlayerType;
    private int mSessionId;
    private final java.lang.Object mUpdateablePropLock = null;
    private AudioPlaybackConfiguration(int p0) {}
    public AudioPlaybackConfiguration(android.media.PlayerBase.PlayerIdCard p0, int p1, int p2, int p3) {}
    private AudioPlaybackConfiguration(android.os.Parcel p0) {}
    public static android.media.AudioPlaybackConfiguration anonymizedCopy(android.media.AudioPlaybackConfiguration p0) { return null; }
    private boolean isMuteAffectingActiveState() { return false; }
    private void playerDied() {}
    public static java.lang.String playerStateToString(int p0) { return null; }
    private void setUpdateableFields(int[] p0, int p1, int p2, android.media.AudioPlaybackConfiguration.FormatInfo p3) {}
    public static java.lang.String toLogFriendlyPlayerState(int p0) { return null; }
    public static java.lang.String toLogFriendlyPlayerType(int p0) { return null; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    @java.lang.Deprecated
    public android.media.AudioDeviceInfo getAudioDeviceInfo() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceInfo> getAudioDeviceInfos() { return null; }
    @android.annotation.SystemApi
    public int getChannelMask() { return 0; }
    @android.annotation.SystemApi
    public int getClientPid() { return 0; }
    @android.annotation.SystemApi
    public int getClientUid() { return 0; }
    android.media.IPlayer getIPlayer() { return null; }
    @android.annotation.SystemApi
    public int getMutedBy() { return 0; }
    @android.annotation.SystemApi
    public int getPlayerInterfaceId() { return 0; }
    @android.annotation.SystemApi
    public android.media.PlayerProxy getPlayerProxy() { return null; }
    @android.annotation.SystemApi
    public int getPlayerState() { return 0; }
    @android.annotation.SystemApi
    public int getPlayerType() { return 0; }
    @android.annotation.SystemApi
    public int getSampleRate() { return 0; }
    @android.annotation.SystemApi
    public int getSessionId() { return 0; }
    public boolean handleAudioAttributesEvent(android.media.AudioAttributes p0) { return false; }
    public boolean handleFormatEvent(android.media.AudioPlaybackConfiguration.FormatInfo p0) { return false; }
    public boolean handleMutedEvent(int p0) { return false; }
    public boolean handleSessionIdEvent(int p0) { return false; }
    public boolean handleStateEvent(int p0, int[] p1) { return false; }
    public int hashCode() { return 0; }
    public void init() {}
    @android.annotation.SystemApi
    public boolean isActive() { return false; }
    @android.annotation.SystemApi
    public boolean isMuted() { return false; }
    @android.annotation.SystemApi
    public boolean isSpatialized() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class FormatInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.AudioPlaybackConfiguration.FormatInfo> CREATOR = null;
        static final android.media.AudioPlaybackConfiguration.FormatInfo DEFAULT = null;
        final boolean mIsSpatialized = false;
        final int mNativeChannelMask = 0;
        final int mSampleRate = 0;
        private FormatInfo(android.os.Parcel p0) {}
        public FormatInfo(boolean p0, int p1, int p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    static final class IPlayerShell implements android.os.IBinder.DeathRecipient {
        private volatile android.media.IPlayer mIPlayer;
        final android.media.AudioPlaybackConfiguration mMonitor = null;
        IPlayerShell(android.media.AudioPlaybackConfiguration p0, android.media.IPlayer p1) {}
        public void binderDied() {}
        android.media.IPlayer getIPlayer() { return null; }
        void monitorDeath() {}
        void release() {}
    }

    public static interface PlayerDeathMonitor {
        public void playerDeath(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerMuteEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlayerType {
    }
}
