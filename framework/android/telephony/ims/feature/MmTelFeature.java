package android.telephony.ims.feature;

public class MmTelFeature extends android.telephony.ims.feature.ImsFeature {
    @android.annotation.SystemApi
    public static final int AUDIO_HANDLER_ANDROID = 0;
    @android.annotation.SystemApi
    public static final int AUDIO_HANDLER_BASEBAND = 1;
    public static final int EPS_FALLBACK_REASON_INVALID = -1;
    @android.annotation.SystemApi
    public static final int EPS_FALLBACK_REASON_NO_NETWORK_RESPONSE = 2;
    @android.annotation.SystemApi
    public static final int EPS_FALLBACK_REASON_NO_NETWORK_TRIGGER = 1;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_UNKNOWN_CALL = "android.telephony.ims.feature.extra.IS_UNKNOWN_CALL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_USSD = "android.telephony.ims.feature.extra.IS_USSD";
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_DIRECTION_INCOMING = 0;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_DIRECTION_OUTGOING = 1;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_EMERGENCY = 0;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_EMERGENCY_SMS = 1;
    public static final int IMS_TRAFFIC_TYPE_NONE = -1;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_REGISTRATION = 5;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_SMS = 4;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_UT_XCAP = 6;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_VIDEO = 3;
    @android.annotation.SystemApi
    public static final int IMS_TRAFFIC_TYPE_VOICE = 2;
    private static final java.lang.String LOG_TAG = "MmTelFeature";
    @android.annotation.SystemApi
    public static final int PROCESS_CALL_CSFB = 1;
    @android.annotation.SystemApi
    public static final int PROCESS_CALL_IMS = 0;
    private java.util.concurrent.Executor mExecutor;
    private final android.telephony.ims.aidl.IImsMmTelFeature mImsMMTelBinder = null;
    private android.telephony.ims.aidl.IImsMmTelListener mListener;
    private android.telephony.ims.stub.ImsSmsImplBase mSmsImpl;
    private java.util.HashMap<android.telephony.ims.feature.ImsTrafficSessionCallback, android.telephony.ims.feature.MmTelFeature.ImsTrafficSessionCallbackWrapper> mTrafficCallbacks;
    @android.annotation.SystemApi
    public MmTelFeature() { super(); }
    @android.annotation.SystemApi
    public MmTelFeature(java.util.concurrent.Executor p0) { super(); }
    private void acknowledgeSms(int p0, int p1, int p2) {}
    private void acknowledgeSms(int p0, int p1, int p2, byte[] p3) {}
    private void acknowledgeSmsReport(int p0, int p1, int p2) {}
    private android.telephony.ims.aidl.IImsMmTelListener getListener() { return null; }
    private java.lang.String getSmsFormat() { return null; }
    private void onMemoryAvailable(int p0) {}
    private void onSmsReady() {}
    private void sendSms(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, byte[] p5) {}
    private void setListener(android.telephony.ims.aidl.IImsMmTelListener p0) {}
    private void setSmsListener(android.telephony.ims.aidl.IImsSmsListener p0) {}
    @android.annotation.SystemApi
    public void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1) {}
    @android.annotation.SystemApi
    public void changeOfferedRtpHeaderExtensionTypes(java.util.Set<android.telephony.ims.RtpHeaderExtensionType> p0) {}
    @android.annotation.SystemApi
    public void clearMediaThreshold(int p0) {}
    @android.annotation.SystemApi
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsCallSessionImplBase createCallSession(android.telephony.ims.ImsCallProfile p0) { return null; }
    public com.android.ims.internal.IImsCallSession createCallSessionInterface(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
    public final android.telephony.ims.aidl.IImsMmTelFeature getBinder() { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsEcbmImplBase getEcbm() { return null; }
    protected com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
    public android.telephony.ims.stub.ImsSmsImplBase getImsSmsImpl() { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpoint() { return null; }
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsSmsImplBase getSmsImplementation() { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsUtImplBase getUt() { return null; }
    protected com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
    @android.annotation.SystemApi
    public final void modifyImsTrafficSession(int p0, android.telephony.ims.feature.ImsTrafficSessionCallback p1) {}
    @android.annotation.SystemApi
    public final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
    @android.annotation.SystemApi
    public final android.telephony.ims.ImsCallSessionListener notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public final void notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.os.Bundle p1) {}
    public final void notifyIncomingCallSession(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public final void notifyMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
    @android.annotation.SystemApi
    public final void notifyRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
    @android.annotation.SystemApi
    public void notifySrvccCanceled() {}
    @android.annotation.SystemApi
    public void notifySrvccCompleted() {}
    @android.annotation.SystemApi
    public void notifySrvccFailed() {}
    @android.annotation.SystemApi
    public void notifySrvccStarted(java.util.function.Consumer<java.util.List<android.telephony.ims.SrvccCall>> p0) {}
    @android.annotation.SystemApi
    public final void notifyVoiceMessageCountUpdate(int p0) {}
    @android.annotation.SystemApi
    public void onFeatureReady() {}
    @android.annotation.SystemApi
    public void onFeatureRemoved() {}
    @android.annotation.SystemApi
    public boolean queryCapabilityConfiguration(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public final android.telephony.ims.feature.MmTelFeature.MmTelCapabilities queryCapabilityStatus() { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.MediaQualityStatus queryMediaQualityStatus(int p0) { return null; }
    @android.annotation.SystemApi
    public final void setCallAudioHandler(int p0) {}
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}
    @android.annotation.SystemApi
    public void setMediaThreshold(int p0, android.telephony.ims.MediaThreshold p1) {}
    @android.annotation.SystemApi
    public void setTerminalBasedCallWaitingStatus(boolean p0) {}
    @android.annotation.SystemApi
    public void setUiTtyMode(int p0, android.os.Message p1) {}
    @android.annotation.SystemApi
    public int shouldProcessCall(java.lang.String[] p0) { return 0; }
    @android.annotation.SystemApi
    public final void startImsTrafficSession(int p0, int p1, int p2, java.util.concurrent.Executor p3, android.telephony.ims.feature.ImsTrafficSessionCallback p4) {}
    @android.annotation.SystemApi
    public final void stopImsTrafficSession(android.telephony.ims.feature.ImsTrafficSessionCallback p0) {}
    @android.annotation.SystemApi
    public final void triggerEpsFallback(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EpsFallbackReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsAudioHandler {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsTrafficDirection {
    }

    public static class ImsTrafficSessionCallbackWrapper {
        public static final int INVALID_TOKEN = -1;
        private static final int MAX_TOKEN = 65536;
        private static final java.util.concurrent.atomic.AtomicInteger sTokenGenerator = null;
        private android.telephony.ims.feature.MmTelFeature.ImsTrafficSessionCallbackWrapper.IImsTrafficSessionCallbackStub mCallback;
        private android.telephony.ims.feature.ImsTrafficSessionCallback mImsTrafficSessionCallback;
        private int mToken;
        private ImsTrafficSessionCallbackWrapper(android.telephony.ims.feature.ImsTrafficSessionCallback p0) {}
        private static int generateToken() { return 0; }
        final android.telephony.ims.feature.MmTelFeature.ImsTrafficSessionCallbackWrapper.IImsTrafficSessionCallbackStub getCallbackBinder() { return null; }
        final int getToken() { return 0; }
        final void reset() {}
        final void update(java.util.concurrent.Executor p0) {}

        private static class IImsTrafficSessionCallbackStub extends android.telephony.ims.aidl.IImsTrafficSessionCallback.Stub {
            private java.util.concurrent.Executor mExecutor;
            private java.lang.ref.WeakReference<android.telephony.ims.feature.ImsTrafficSessionCallback> mImsTrafficSessionCallbackWeakRef;
            IImsTrafficSessionCallbackStub(android.telephony.ims.feature.ImsTrafficSessionCallback p0, java.util.concurrent.Executor p1) { super(); }
            public void onError(android.telephony.ims.feature.ConnectionFailureInfo p0) {}
            public void onReady() {}
            void update(java.util.concurrent.Executor p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsTrafficType {
    }

    public static class Listener extends android.telephony.ims.aidl.IImsMmTelListener.Stub {
        public Listener() { super(); }
        public void onAudioModeIsVoipChanged(int p0) {}
        public android.telephony.ims.aidl.IImsCallSessionListener onIncomingCall(com.android.ims.internal.IImsCallSession p0, java.lang.String p1, android.os.Bundle p2) { return null; }
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
        public void onModifyImsTrafficSession(int p0, int p1) {}
        public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onStartImsTrafficSession(int p0, int p1, int p2, int p3, android.telephony.ims.aidl.IImsTrafficSessionCallback p4) {}
        public void onStopImsTrafficSession(int p0) {}
        public void onTriggerEpsFallback(int p0) {}
        public void onVoiceMessageCountUpdate(int p0) {}
    }

    public static class MmTelCapabilities extends android.telephony.ims.feature.ImsFeature.Capabilities {
        public static final int CAPABILITY_TYPE_CALL_COMPOSER = 16;
        public static final int CAPABILITY_TYPE_CALL_COMPOSER_BUSINESS_ONLY = 32;
        public static final int CAPABILITY_TYPE_MAX = 33;
        public static final int CAPABILITY_TYPE_NONE = 0;
        public static final int CAPABILITY_TYPE_SMS = 8;
        public static final int CAPABILITY_TYPE_UT = 4;
        public static final int CAPABILITY_TYPE_VIDEO = 2;
        public static final int CAPABILITY_TYPE_VOICE = 1;
        @android.annotation.SystemApi
        public MmTelCapabilities() { super(); }
        @android.annotation.SystemApi
        public MmTelCapabilities(int p0) { super(); }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public MmTelCapabilities(android.telephony.ims.feature.ImsFeature.Capabilities p0) { super(); }
        @android.annotation.SystemApi
        public final void addCapabilities(int p0) {}
        public final boolean isCapable(int p0) { return false; }
        @android.annotation.SystemApi
        public final void removeCapabilities(int p0) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MmTelCapability {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessCallResult {
    }
}
