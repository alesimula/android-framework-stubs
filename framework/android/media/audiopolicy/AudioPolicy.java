package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioPolicy {
    private static final boolean DEBUG = false;
    public static final int FOCUS_POLICY_DUCKING_DEFAULT = 0;
    public static final int FOCUS_POLICY_DUCKING_IN_APP = 0;
    public static final int FOCUS_POLICY_DUCKING_IN_POLICY = 1;
    private static final int MSG_FOCUS_ABANDON = 5;
    private static final int MSG_FOCUS_GRANT = 1;
    private static final int MSG_FOCUS_LOSS = 2;
    private static final int MSG_FOCUS_REQUEST = 4;
    private static final int MSG_MIX_STATE_UPDATE = 3;
    private static final int MSG_POLICY_STATUS_CHANGE = 0;
    private static final int MSG_VOL_ADJUST = 6;
    public static final int POLICY_STATUS_REGISTERED = 2;
    public static final int POLICY_STATUS_UNREGISTERED = 1;
    private static final java.lang.String TAG = "AudioPolicy";
    private static android.media.IAudioService sService;
    private java.util.ArrayList<java.lang.ref.WeakReference<android.media.AudioRecord>> mCaptors;
    private android.media.audiopolicy.AudioPolicyConfig mConfig;
    private android.content.Context mContext;
    private final android.media.audiopolicy.AudioPolicy.EventHandler mEventHandler = null;
    private android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener mFocusListener;
    private java.util.ArrayList<java.lang.ref.WeakReference<android.media.AudioTrack>> mInjectors;
    private final boolean mIsFocusPolicy = false;
    private final boolean mIsTestFocusPolicy = false;
    private final java.lang.Object mLock = null;
    private final android.media.audiopolicy.IAudioPolicyCallback mPolicyCb = null;
    private final android.media.projection.MediaProjection mProjection = null;
    private java.lang.String mRegistrationId;
    private int mStatus;
    private final android.media.audiopolicy.AudioPolicy.AudioPolicyStatusListener mStatusListener = null;
    private final android.media.audiopolicy.AudioPolicy.AudioPolicyVolumeCallback mVolCb = null;
    private AudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.content.Context p1, android.os.Looper p2, android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener p3, android.media.audiopolicy.AudioPolicy.AudioPolicyStatusListener p4, boolean p5, boolean p6, android.media.audiopolicy.AudioPolicy.AudioPolicyVolumeCallback p7, android.media.projection.MediaProjection p8) {}
    private static java.lang.String addressForTag(android.media.audiopolicy.AudioMix p0) { return null; }
    private int checkCallingOrSelfPermission(java.lang.String p0) { return 0; }
    private void checkMixReadyToUse(android.media.audiopolicy.AudioMix p0, boolean p1) throws java.lang.IllegalArgumentException {}
    private static android.content.AttributionSource getAttributionSource(android.content.Context p0) { return null; }
    private android.media.AudioAttributes getRecordAudioAttributesForMix(android.media.audiopolicy.AudioMix p0, android.media.AudioAttributes p1) { return null; }
    private static android.media.IAudioService getService() { return null; }
    private android.media.AudioAttributes getTrackAudioAttributesForMix(android.media.audiopolicy.AudioMix p0, android.media.AudioAttributes p1) { return null; }
    private boolean isAudioPolicyRegisteredLocked() { return false; }
    private boolean isCallRedirectionPolicy() { return false; }
    private boolean isLoopbackRenderPolicy() { return false; }
    private void onPolicyStatusChange() {}
    private boolean policyReadyToUse() { return false; }
    public static int resolveAudioOwnerVirtualDeviceId(android.content.Context p0, int p1) { return 0; }
    private void sendMsg(int p0) {}
    private void sendMsg(int p0, java.lang.Object p1, int p2) {}
    public int attachMixes(java.util.List<android.media.audiopolicy.AudioMix> p0) { return 0; }
    public android.media.audiopolicy.IAudioPolicyCallback cb() { return null; }
    @android.annotation.SystemApi
    public int clearFadeManagerConfigurationForFocusLoss() { return 0; }
    public android.media.AudioRecord createAudioRecordSink(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException { return null; }
    public android.media.AudioRecord createAudioRecordSink(android.media.audiopolicy.AudioMix p0, android.media.AudioRecord.Builder p1) { return null; }
    public android.media.AudioTrack createAudioTrackSource(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException { return null; }
    public android.media.AudioTrack createAudioTrackSource(android.media.audiopolicy.AudioMix p0, android.media.AudioTrack.Builder p1) { return null; }
    public int detachMixes(java.util.List<android.media.audiopolicy.AudioMix> p0) { return 0; }
    public android.content.AttributionSource getAttributionSource() { return null; }
    public android.media.audiopolicy.AudioPolicyConfig getConfig() { return null; }
    @android.annotation.SystemApi
    public android.media.FadeManagerConfiguration getFadeManagerConfigurationForFocusLoss() { return null; }
    public int getFocusDuckingBehavior() { return 0; }
    public java.util.List<android.media.AudioFocusInfo> getFocusStack() { return null; }
    public android.media.projection.MediaProjection getMediaProjection() { return null; }
    public java.util.List<android.media.audiopolicy.AudioMix> getMixes() { return null; }
    public java.lang.String getRegistration() { return null; }
    public int getStatus() { return 0; }
    public boolean hasFocusListener() { return false; }
    public void invalidateCaptorsAndInjectors() {}
    public boolean isFocusPolicy() { return false; }
    public boolean isTestFocusPolicy() { return false; }
    public boolean isVolumeController() { return false; }
    @android.annotation.SystemApi
    public boolean removeUidDeviceAffinity(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeUserIdDeviceAffinity(int p0) { return false; }
    public void reset() {}
    public boolean sendFocusLoss(android.media.AudioFocusInfo p0) throws java.lang.IllegalStateException { return false; }
    public void sendFocusLossAndUpdate(android.media.AudioFocusInfo p0) throws java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    public int setFadeManagerConfigurationForFocusLoss(android.media.FadeManagerConfiguration p0) { return 0; }
    public int setFocusDuckingBehavior(int p0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { return 0; }
    public void setRegistration(java.lang.String p0) {}
    @android.annotation.SystemApi
    public boolean setUidDeviceAffinity(int p0, java.util.List<android.media.AudioDeviceInfo> p1) { return false; }
    @android.annotation.SystemApi
    public boolean setUserIdDeviceAffinity(int p0, java.util.List<android.media.AudioDeviceInfo> p1) { return false; }
    public java.lang.String toLogFriendlyString() { return null; }
    public int updateMixingRules(java.util.List<android.util.Pair<android.media.audiopolicy.AudioMix, android.media.audiopolicy.AudioMixingRule>> p0) { return 0; }

    public static abstract class AudioPolicyFocusListener {
        public AudioPolicyFocusListener() {}
        public void onAudioFocusAbandon(android.media.AudioFocusInfo p0) {}
        public void onAudioFocusGrant(android.media.AudioFocusInfo p0, int p1) {}
        public void onAudioFocusLoss(android.media.AudioFocusInfo p0, boolean p1) {}
        public void onAudioFocusRequest(android.media.AudioFocusInfo p0, int p1) {}
    }

    public static abstract class AudioPolicyStatusListener {
        public AudioPolicyStatusListener() {}
        public void onMixStateUpdate(android.media.audiopolicy.AudioMix p0) {}
        public void onStatusChange() {}
    }

    public static abstract class AudioPolicyVolumeCallback {
        public AudioPolicyVolumeCallback() {}
        public void onVolumeAdjustment(int p0) {}
    }

    public static class Builder {
        private android.content.Context mContext;
        private android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener mFocusListener;
        private boolean mIsFocusPolicy;
        private boolean mIsTestFocusPolicy;
        private android.os.Looper mLooper;
        private java.util.ArrayList<android.media.audiopolicy.AudioMix> mMixes;
        private android.media.projection.MediaProjection mProjection;
        private android.media.audiopolicy.AudioPolicy.AudioPolicyStatusListener mStatusListener;
        private android.media.audiopolicy.AudioPolicy.AudioPolicyVolumeCallback mVolCb;
        public Builder(android.content.Context p0) {}
        public android.media.audiopolicy.AudioPolicy.Builder addMix(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioPolicy build() { return null; }
        public void setAudioPolicyFocusListener(android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener p0) {}
        public void setAudioPolicyStatusListener(android.media.audiopolicy.AudioPolicy.AudioPolicyStatusListener p0) {}
        public android.media.audiopolicy.AudioPolicy.Builder setAudioPolicyVolumeCallback(android.media.audiopolicy.AudioPolicy.AudioPolicyVolumeCallback p0) { return null; }
        public android.media.audiopolicy.AudioPolicy.Builder setIsAudioFocusPolicy(boolean p0) { return null; }
        public android.media.audiopolicy.AudioPolicy.Builder setIsTestFocusPolicy(boolean p0) { return null; }
        public android.media.audiopolicy.AudioPolicy.Builder setLooper(android.os.Looper p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioPolicy.Builder setMediaProjection(android.media.projection.MediaProjection p0) { return null; }
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.audiopolicy.AudioPolicy p0, android.media.audiopolicy.AudioPolicy p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PolicyStatus {
    }
}
