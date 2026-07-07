package android.media;

public final class AudioMixerAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioMixerAttributes> CREATOR = null;
    public static final int MIXER_BEHAVIOR_BIT_PERFECT = 1;
    public static final int MIXER_BEHAVIOR_DEFAULT = 0;
    private final android.media.AudioFormat mFormat = null;
    private final int mMixerBehavior = 0;
    AudioMixerAttributes(android.media.AudioFormat p0, int p1) {}
    private AudioMixerAttributes(android.os.Parcel p0) {}
    private java.lang.String mixerBehaviorToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioFormat getFormat() { return null; }
    public int getMixerBehavior() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.media.AudioFormat mFormat = null;
        private int mMixerBehavior;
        public Builder(android.media.AudioFormat p0) {}
        public android.media.AudioMixerAttributes build() { return null; }
        public android.media.AudioMixerAttributes.Builder setMixerBehavior(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MixerBehavior {
    }
}
