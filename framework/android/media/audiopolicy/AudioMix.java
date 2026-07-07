package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioMix implements android.os.Parcelable {
    private static final int CALLBACK_FLAGS_ALL = 1;
    public static final int CALLBACK_FLAG_NOTIFY_ACTIVITY = 1;
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioMix> CREATOR = null;
    public static final int MIX_STATE_DISABLED = -1;
    public static final int MIX_STATE_IDLE = 0;
    public static final int MIX_STATE_MIXING = 1;
    public static final int MIX_TYPE_INVALID = -1;
    public static final int MIX_TYPE_PLAYERS = 0;
    public static final int MIX_TYPE_RECORDERS = 1;
    private static final int PRIVILEDGED_CAPTURE_MAX_BYTES_PER_SAMPLE = 2;
    private static final int PRIVILEDGED_CAPTURE_MAX_CHANNEL_NUMBER = 1;
    private static final int PRIVILEDGED_CAPTURE_MAX_SAMPLE_RATE = 16000;
    public static final int ROUTE_FLAG_LOOP_BACK = 2;
    public static final int ROUTE_FLAG_LOOP_BACK_RENDER = 3;
    public static final int ROUTE_FLAG_RENDER = 1;
    private static final int ROUTE_FLAG_SUPPORTED = 3;
    int mCallbackFlags;
    java.lang.String mDeviceAddress;
    final int mDeviceSystemType = 0;
    private android.media.AudioFormat mFormat;
    private boolean mIsPersistent;
    int mMixState;
    private int mMixType;
    private int mRouteFlags;
    private android.media.audiopolicy.AudioMixingRule mRule;
    private final android.os.IBinder mToken = null;
    private int mVirtualDeviceId;
    private AudioMix(android.media.audiopolicy.AudioMixingRule p0, android.media.AudioFormat p1, int p2, int p3, int p4, java.lang.String p5, android.os.IBinder p6, int p7) {}
    private AudioMix(android.media.audiopolicy.AudioMixingRule p0, android.media.AudioFormat p1, int p2, int p3, int p4, java.lang.String p5, android.os.IBinder p6, int p7, boolean p8) {}
    public static java.lang.String canBeUsedForPrivilegedMediaCapture(android.media.AudioFormat p0) { return null; }
    public boolean containsMatchAttributeRuleForUsage(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioFormat getFormat() { return null; }
    public int getMixState() { return 0; }
    public int getMixType() { return 0; }
    public java.lang.String getRegistration() { return null; }
    public int getRouteFlags() { return 0; }
    public android.media.audiopolicy.AudioMixingRule getRule() { return null; }
    public int hashCode() { return 0; }
    public boolean isAffectingUsage(int p0) { return false; }
    public boolean isForCallRedirection() { return false; }
    public boolean isPersistent() { return false; }
    public boolean isRoutedToDevice(int p0, java.lang.String p1) { return false; }
    public boolean matchesVirtualDeviceId(int p0) { return false; }
    public void setAudioMixingRule(android.media.audiopolicy.AudioMixingRule p0) {}
    void setRegistration(java.lang.String p0) {}
    public void setVirtualDeviceId(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private int mCallbackFlags;
        private java.lang.String mDeviceAddress;
        private int mDeviceSystemType;
        private android.media.AudioFormat mFormat;
        private boolean mIsPersistent;
        private int mRouteFlags;
        private android.media.audiopolicy.AudioMixingRule mRule;
        private android.os.IBinder mToken;
        private int mVirtualDeviceId;
        Builder() {}
        public Builder(android.media.audiopolicy.AudioMixingRule p0) throws java.lang.IllegalArgumentException {}
        private int getLoopbackDeviceSystemTypeForAudioMixingRule(android.media.audiopolicy.AudioMixingRule p0) { return 0; }
        public android.media.audiopolicy.AudioMix build() throws java.lang.IllegalArgumentException { return null; }
        android.media.audiopolicy.AudioMix.Builder setCallbackFlags(int p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMix.Builder setDevice(int p0, java.lang.String p1) { return null; }
        public android.media.audiopolicy.AudioMix.Builder setDevice(android.media.AudioDeviceInfo p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMix.Builder setFormat(android.media.AudioFormat p0) throws java.lang.IllegalArgumentException { return null; }
        android.media.audiopolicy.AudioMix.Builder setMixingRule(android.media.audiopolicy.AudioMixingRule p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMix.Builder setPersistent(boolean p0) { return null; }
        public android.media.audiopolicy.AudioMix.Builder setRouteFlags(int p0) throws java.lang.IllegalArgumentException { return null; }
        android.media.audiopolicy.AudioMix.Builder setToken(android.os.IBinder p0) { return null; }
        android.media.audiopolicy.AudioMix.Builder setVirtualDeviceId(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RouteFlags {
    }
}
