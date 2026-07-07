package android.hardware.soundtrigger;

@android.annotation.SystemApi
public class SoundTrigger {
    public static final java.lang.String FAKE_HAL_ARCH = "injection";
    public static final int MODEL_PARAM_INVALID = -1;
    public static final int MODEL_PARAM_THRESHOLD_FACTOR = 0;
    public static final int RECOGNITION_MODE_GENERIC = 8;
    public static final int RECOGNITION_MODE_USER_AUTHENTICATION = 4;
    public static final int RECOGNITION_MODE_USER_IDENTIFICATION = 2;
    public static final int RECOGNITION_MODE_VOICE_TRIGGER = 1;
    public static final int RECOGNITION_STATUS_ABORT = 1;
    public static final int RECOGNITION_STATUS_FAILURE = 2;
    public static final int RECOGNITION_STATUS_GET_STATE_RESPONSE = 3;
    public static final int RECOGNITION_STATUS_SUCCESS = 0;
    public static final int STATUS_BAD_VALUE = Integer.valueOf(0);
    public static final int STATUS_BUSY = Integer.valueOf(0);
    public static final int STATUS_DEAD_OBJECT = Integer.valueOf(0);
    public static final int STATUS_ERROR = -2147483648;
    public static final int STATUS_INVALID_OPERATION = Integer.valueOf(0);
    public static final int STATUS_NO_INIT = Integer.valueOf(0);
    public static final int STATUS_OK = 0;
    public static final int STATUS_PERMISSION_DENIED = Integer.valueOf(0);
    private static final java.lang.String TAG = "SoundTrigger";
    private static java.lang.Object mServiceLock;
    private SoundTrigger() {}
    private static android.hardware.soundtrigger.SoundTriggerModule attachModule(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2) { return null; }
    @java.lang.Deprecated
    public static android.hardware.soundtrigger.SoundTriggerModule attachModuleAsMiddleman(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2, android.media.permission.Identity p3, android.media.permission.Identity p4) { return null; }
    public static android.hardware.soundtrigger.SoundTriggerModule attachModuleAsOriginator(int p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Handler p2, android.media.permission.Identity p3) { return null; }
    private static void convertDescriptorsToModuleProperties(android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] p0, java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p1) {}
    private static android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService getService() { return null; }
    public static int handleException(java.lang.Exception p0) { return 0; }
    public static int listModules(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0) { return 0; }
    @java.lang.Deprecated
    public static int listModulesAsMiddleman(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0, android.media.permission.Identity p1, android.media.permission.Identity p2) { return 0; }
    @java.lang.Deprecated
    public static int listModulesAsOriginator(java.util.ArrayList<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> p0, android.media.permission.Identity p1) { return 0; }

    public static class ConfidenceLevel implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel> CREATOR = null;
        public final int confidenceLevel = 0;
        public final int userId = 0;
        public ConfidenceLevel(int p0, int p1) {}
        private static android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class GenericRecognitionEvent extends android.hardware.soundtrigger.SoundTrigger.RecognitionEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent> CREATOR = null;
        public GenericRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, long p9, android.os.IBinder p10) { super(0, 0, false, 0, 0, 0, false, (android.media.AudioFormat)null, (byte[])null, 0L); }
        public GenericRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, boolean p9, long p10, android.os.IBinder p11) { super(0, 0, false, 0, 0, 0, false, (android.media.AudioFormat)null, (byte[])null, 0L); }
        private static android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent fromParcelForGeneric(android.os.Parcel p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static final class GenericSoundModel extends android.hardware.soundtrigger.SoundTrigger.SoundModel implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.GenericSoundModel> CREATOR = null;
        public GenericSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2) { super(null, null, 0, null, 0); }
        public GenericSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, int p3) { super(null, null, 0, null, 0); }
        private static android.hardware.soundtrigger.SoundTrigger.GenericSoundModel fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Keyphrase implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.Keyphrase> CREATOR = null;
        private final int mId = 0;
        private final java.util.Locale mLocale = null;
        private final int mRecognitionModes = 0;
        private final java.lang.String mText = null;
        private final int[] mUsers = null;
        public Keyphrase(int p0, int p1, java.util.Locale p2, java.lang.String p3, int[] p4) {}
        public static android.hardware.soundtrigger.SoundTrigger.Keyphrase readFromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getId() { return 0; }
        public java.util.Locale getLocale() { return null; }
        public int getRecognitionModes() { return 0; }
        public java.lang.String getText() { return null; }
        public int[] getUsers() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class KeyphraseRecognitionEvent extends android.hardware.soundtrigger.SoundTrigger.RecognitionEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent> CREATOR = null;
        public final android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] keyphraseExtras = null;
        public KeyphraseRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p9, long p10, android.os.IBinder p11) { super(0, 0, false, 0, 0, 0, false, (android.media.AudioFormat)null, (byte[])null, 0L); }
        public KeyphraseRecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p9, boolean p10, long p11, android.os.IBinder p12) { super(0, 0, false, 0, 0, 0, false, (android.media.AudioFormat)null, (byte[])null, 0L); }
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent fromParcelForKeyphrase(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class KeyphraseRecognitionExtra implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> CREATOR = null;
        public final int coarseConfidenceLevel = 0;
        public final android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel[] confidenceLevels = null;
        public final int id = 0;
        public final int recognitionModes = 0;
        public KeyphraseRecognitionExtra(int p0, int p1, int p2) {}
        public KeyphraseRecognitionExtra(int p0, int p1, int p2, android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel[] p3) {}
        private static android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getCoarseConfidenceLevel() { return 0; }
        public java.util.Collection<android.hardware.soundtrigger.SoundTrigger.ConfidenceLevel> getConfidenceLevels() { return null; }
        public int getKeyphraseId() { return 0; }
        public int getRecognitionModes() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class KeyphraseSoundModel extends android.hardware.soundtrigger.SoundTrigger.SoundModel implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel> CREATOR = null;
        private final android.hardware.soundtrigger.SoundTrigger.Keyphrase[] mKeyphrases = null;
        public KeyphraseSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, android.hardware.soundtrigger.SoundTrigger.Keyphrase[] p3) { super(null, null, 0, null, 0); }
        public KeyphraseSoundModel(java.util.UUID p0, java.util.UUID p1, byte[] p2, android.hardware.soundtrigger.SoundTrigger.Keyphrase[] p3, int p4) { super(null, null, 0, null, 0); }
        public static android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel readFromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.soundtrigger.SoundTrigger.Keyphrase[] getKeyphrases() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ModelParamRange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ModelParamRange> CREATOR = null;
        private final int mEnd = 0;
        private final int mStart = 0;
        public ModelParamRange(int p0, int p1) {}
        private ModelParamRange(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getEnd() { return 0; }
        public int getStart() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModelParamTypes {
    }

    public static final class ModuleProperties implements android.os.Parcelable {
        public static final int AUDIO_CAPABILITY_ECHO_CANCELLATION = 1;
        public static final int AUDIO_CAPABILITY_NOISE_SUPPRESSION = 2;
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> CREATOR = null;
        private final int mAudioCapabilities = 0;
        private final java.lang.String mDescription = null;
        private final int mId = 0;
        private final java.lang.String mImplementor = null;
        private final int mMaxBufferMillis = 0;
        private final int mMaxKeyphrases = 0;
        private final int mMaxSoundModels = 0;
        private final int mMaxUsers = 0;
        private final int mPowerConsumptionMw = 0;
        private final int mRecognitionModes = 0;
        private final boolean mReturnsTriggerInEvent = false;
        private final java.lang.String mSupportedModelArch = null;
        private final boolean mSupportsCaptureTransition = false;
        private final boolean mSupportsConcurrentCapture = false;
        private final java.util.UUID mUuid = null;
        private final int mVersion = 0;
        public ModuleProperties(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, int p6, int p7, int p8, int p9, boolean p10, int p11, boolean p12, int p13, boolean p14, int p15) {}
        private static android.hardware.soundtrigger.SoundTrigger.ModuleProperties fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getAudioCapabilities() { return 0; }
        public java.lang.String getDescription() { return null; }
        public int getId() { return 0; }
        public java.lang.String getImplementor() { return null; }
        public int getMaxBufferMillis() { return 0; }
        public int getMaxKeyphrases() { return 0; }
        public int getMaxSoundModels() { return 0; }
        public int getMaxUsers() { return 0; }
        public int getPowerConsumptionMw() { return 0; }
        public int getRecognitionModes() { return 0; }
        public java.lang.String getSupportedModelArch() { return null; }
        public java.util.UUID getUuid() { return null; }
        public int getVersion() { return 0; }
        public int hashCode() { return 0; }
        public boolean isCaptureTransitionSupported() { return false; }
        public boolean isConcurrentCaptureSupported() { return false; }
        public boolean isTriggerReturnedInEvent() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AudioCapabilities {
        }
    }

    public static final class RecognitionConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.RecognitionConfig> CREATOR = null;
        private final int mAudioCapabilities = 0;
        private final boolean mCaptureRequested = false;
        private final byte[] mData = null;
        private final android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] mKeyphrases = null;
        private final boolean mMultipleTriggersAllowed = false;
        @java.lang.Deprecated
        public RecognitionConfig(boolean p0, boolean p1, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p2, byte[] p3) {}
        private RecognitionConfig(boolean p0, boolean p1, android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] p2, byte[] p3, int p4) {}
        private static android.hardware.soundtrigger.SoundTrigger.RecognitionConfig fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public int getAudioCapabilities() { return 0; }
        public byte[] getData() { return null; }
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> getKeyphrases() { return null; }
        public final int hashCode() { return 0; }
        public boolean isCaptureRequested() { return false; }
        public boolean isMultipleTriggersAllowed() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private int mAudioCapabilities;
            private boolean mCaptureRequested;
            private byte[] mData;
            private android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra[] mKeyphrases;
            private boolean mMultipleTriggersAllowed;
            public Builder() {}
            public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig build() { return null; }
            public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.Builder setAudioCapabilities(int p0) { return null; }
            public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.Builder setCaptureRequested(boolean p0) { return null; }
            public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.Builder setData(byte[] p0) { return null; }
            public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.Builder setKeyphrases(java.util.Collection<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p0) { return null; }
            public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.Builder setMultipleTriggersAllowed(boolean p0) { return null; }
        }
    }

    public static class RecognitionEvent {
        public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.SoundTrigger.RecognitionEvent> CREATOR = null;
        public final boolean captureAvailable = false;
        public final int captureDelayMs = 0;
        public final android.media.AudioFormat captureFormat = null;
        public final int capturePreambleMs = 0;
        public final int captureSession = 0;
        public final byte[] data = null;
        public final long halEventReceivedMillis = 0L;
        public final boolean recognitionStillActive = false;
        public final int soundModelHandle = 0;
        public final int status = 0;
        public final android.os.IBinder token = null;
        public final boolean triggerInData = false;
        public RecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, long p9) {}
        public RecognitionEvent(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, boolean p9, long p10, android.os.IBinder p11) {}
        protected static android.hardware.soundtrigger.SoundTrigger.RecognitionEvent fromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.media.AudioFormat getCaptureFormat() { return null; }
        public int getCaptureSession() { return 0; }
        public byte[] getData() { return null; }
        public long getHalEventReceivedMillis() { return 0L; }
        public android.os.IBinder getToken() { return null; }
        public int hashCode() { return 0; }
        public boolean isCaptureAvailable() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionModes {
    }

    public static class SoundModel {
        public static final int TYPE_GENERIC_SOUND = 1;
        public static final int TYPE_KEYPHRASE = 0;
        public static final int TYPE_UNKNOWN = -1;
        private final byte[] mData = null;
        private final int mType = 0;
        private final java.util.UUID mUuid = null;
        private final java.util.UUID mVendorUuid = null;
        private final int mVersion = 0;
        public SoundModel(java.util.UUID p0, java.util.UUID p1, int p2, byte[] p3, int p4) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public byte[] getData() { return null; }
        public int getType() { return 0; }
        public java.util.UUID getUuid() { return null; }
        public java.util.UUID getVendorUuid() { return null; }
        public int getVersion() { return 0; }
        public int hashCode() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SoundModelType {
        }
    }

    public static interface StatusListener {
        public void onModelUnloaded(int p0);
        public void onRecognition(android.hardware.soundtrigger.SoundTrigger.RecognitionEvent p0);
        public void onResourcesAvailable();
        public void onServiceDied();
    }
}
