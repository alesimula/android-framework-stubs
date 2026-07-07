package android.service.voice;

@android.annotation.SystemApi
public final class HotwordAudioStream implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordAudioStream> CREATOR = null;
    private static final byte[] DEFAULT_INITIAL_EMPTY_AUDIO = null;
    public static final java.lang.String KEY_AUDIO_STREAM_COPY_BUFFER_LENGTH_BYTES = "android.service.voice.key.AUDIO_STREAM_COPY_BUFFER_LENGTH_BYTES";
    private final android.media.AudioFormat mAudioFormat = null;
    private final android.os.ParcelFileDescriptor mAudioStreamParcelFileDescriptor = null;
    private final byte[] mInitialAudio = null;
    private final android.os.PersistableBundle mMetadata = null;
    private final android.media.AudioTimestamp mTimestamp = null;
    HotwordAudioStream(android.media.AudioFormat p0, android.os.ParcelFileDescriptor p1, android.media.AudioTimestamp p2, android.os.PersistableBundle p3, byte[] p4) {}
    HotwordAudioStream(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static byte[] defaultInitialAudio() { return null; }
    private static android.os.PersistableBundle defaultMetadata() { return null; }
    private static android.media.AudioTimestamp defaultTimestamp() { return null; }
    private java.lang.String initialAudioToString() { return null; }
    public android.service.voice.HotwordAudioStream.Builder buildUpon() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioFormat getAudioFormat() { return null; }
    public android.os.ParcelFileDescriptor getAudioStreamParcelFileDescriptor() { return null; }
    public byte[] getInitialAudio() { return null; }
    public android.os.PersistableBundle getMetadata() { return null; }
    public android.media.AudioTimestamp getTimestamp() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        public android.service.voice.HotwordAudioStream.Builder setInitialAudio(byte[] p0) { return null; }
    }

    public static final class Builder extends android.service.voice.HotwordAudioStream.BaseBuilder {
        private android.media.AudioFormat mAudioFormat;
        private android.os.ParcelFileDescriptor mAudioStreamParcelFileDescriptor;
        private long mBuilderFieldsSet;
        private byte[] mInitialAudio;
        private android.os.PersistableBundle mMetadata;
        private android.media.AudioTimestamp mTimestamp;
        public Builder(android.media.AudioFormat p0, android.os.ParcelFileDescriptor p1) { super(); }
        private void checkNotUsed() {}
        public android.service.voice.HotwordAudioStream build() { return null; }
        public android.service.voice.HotwordAudioStream.Builder setAudioFormat(android.media.AudioFormat p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setAudioStreamParcelFileDescriptor(android.os.ParcelFileDescriptor p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setMetadata(android.os.PersistableBundle p0) { return null; }
        public android.service.voice.HotwordAudioStream.Builder setTimestamp(android.media.AudioTimestamp p0) { return null; }
    }
}
