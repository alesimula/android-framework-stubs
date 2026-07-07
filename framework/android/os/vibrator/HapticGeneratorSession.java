package android.os.vibrator;

@android.annotation.SystemApi
public final class HapticGeneratorSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "HapticGeneratorSession";
    private final android.os.vibrator.IHapticGeneratorSession mSession = null;
    public HapticGeneratorSession(android.os.vibrator.IHapticGeneratorSession p0) {}
    public void close() {}
    public android.os.vibrator.HapticGeneratorChannelStream generateHapticChannelStream(android.os.VibrationEffect p0) { return null; }

    public static final class Config implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.vibrator.HapticGeneratorSession.Config> CREATOR = null;
        private final android.media.AudioFormat mAudioFormat = null;
        private final android.os.ParcelableHolder mVendorExtension = null;
        public Config(android.media.AudioFormat p0, android.os.ParcelableHolder p1) {}
        private Config(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public android.media.AudioFormat getAudioFormat() { return null; }
        public android.os.ParcelableHolder getVendorExtension() { return null; }
        public void validate() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
