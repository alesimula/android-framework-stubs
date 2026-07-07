package android.media;

@android.annotation.SystemApi
public final class VolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.VolumeInfo> CREATOR = null;
    public static final int INDEX_NOT_SET = -100;
    private static final java.lang.String TAG = "VolumeInfo";
    private static android.media.VolumeInfo sDefaultVolumeInfo;
    private static android.media.IAudioService sService;
    private final boolean mHasMuteState = false;
    private final boolean mIsMuted = false;
    private final int mMaxVolIndex = 0;
    private final int mMinVolIndex = 0;
    private final int mStreamType = 0;
    private final boolean mUsesStreamType = false;
    private final android.media.audiopolicy.AudioVolumeGroup mVolGroup = null;
    private final int mVolIndex = 0;
    private VolumeInfo(android.os.Parcel p0) {}
    private VolumeInfo(boolean p0, boolean p1, boolean p2, int p3, int p4, int p5, android.media.audiopolicy.AudioVolumeGroup p6, int p7) {}
    public static android.media.VolumeInfo getDefaultVolumeInfo() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getMaxVolumeIndex() { return 0; }
    public int getMinVolumeIndex() { return 0; }
    public int getStreamType() { return 0; }
    public android.media.audiopolicy.AudioVolumeGroup getVolumeGroup() { return null; }
    public int getVolumeIndex() { return 0; }
    @java.lang.Deprecated
    public boolean hasMuteCommand() { return false; }
    public boolean hasMuteState() { return false; }
    public boolean hasStreamType() { return false; }
    public boolean hasVolumeGroup() { return false; }
    public int hashCode() { return 0; }
    public boolean isMuted() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mHasMuteState;
        private boolean mIsMuted;
        private int mMaxVolIndex;
        private int mMinVolIndex;
        private int mStreamType;
        private boolean mUsesStreamType;
        private android.media.audiopolicy.AudioVolumeGroup mVolGroup;
        private int mVolIndex;
        public Builder(int p0) {}
        public Builder(android.media.VolumeInfo p0) {}
        public Builder(android.media.audiopolicy.AudioVolumeGroup p0) {}
        public android.media.VolumeInfo build() { return null; }
        public android.media.VolumeInfo.Builder setMaxVolumeIndex(int p0) { return null; }
        public android.media.VolumeInfo.Builder setMinVolumeIndex(int p0) { return null; }
        public android.media.VolumeInfo.Builder setMuted(boolean p0) { return null; }
        public android.media.VolumeInfo.Builder setVolumeIndex(int p0) { return null; }
    }
}
