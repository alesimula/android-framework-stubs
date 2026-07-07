package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioVolumeGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioVolumeGroup> CREATOR = null;
    public static final int DEFAULT_VOLUME_GROUP = -1;
    private static final java.lang.String TAG = "AudioVolumeGroup";
    private static java.util.List<android.media.audiopolicy.AudioVolumeGroup> sAudioVolumeGroups;
    private static final java.lang.Object sLock = null;
    private final android.media.AudioAttributes[] mAudioAttributes = null;
    private int mId;
    private int[] mLegacyStreamTypes;
    private final java.lang.String mName = null;
    AudioVolumeGroup(java.lang.String p0, int p1, android.media.AudioAttributes[] p2, int[] p3) {}
    public static java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() { return null; }
    private static java.util.List<android.media.audiopolicy.AudioVolumeGroup> initializeAudioVolumeGroups() { return null; }
    private boolean isInternalGroup() { return false; }
    private static native int native_list_audio_volume_groups(java.util.ArrayList<android.media.audiopolicy.AudioVolumeGroup> p0);
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.media.AudioAttributes> getAudioAttributes() { return null; }
    public int getId() { return 0; }
    public int[] getLegacyStreamTypes() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String name() { return null; }
    public java.lang.String toString() { return null; }
    java.lang.String toString(java.lang.String p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
