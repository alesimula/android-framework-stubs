package android.telephony.ims;

@android.annotation.SystemApi
public class ImsService extends android.app.Service {
    private static final java.util.Map<java.lang.Long, java.lang.String> CAPABILITIES_LOG_MAP = null;
    public static final long CAPABILITY_EMERGENCY_OVER_MMTEL = 1L;
    public static final long CAPABILITY_MAX_INDEX = Long.valueOf(0L);
    public static final long CAPABILITY_SIP_DELEGATE_CREATION = 2L;
    public static final long CAPABILITY_SUPPORTS_SIMULTANEOUS_CALLING = 8L;
    public static final long CAPABILITY_TERMINAL_BASED_CALL_WAITING = 4L;
    private static final java.lang.String LOG_TAG = "ImsService";
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.ims.ImsService";
    private final android.util.SparseArray<android.util.SparseBooleanArray> mCreateImsFeatureWithSlotIdFlagMap = null;
    private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
    private java.util.concurrent.Executor mExecutor;
    private final java.lang.Object mExecutorLock = null;
    private final android.util.SparseArray<android.util.SparseArray<android.telephony.ims.feature.ImsFeature>> mFeaturesBySlot = null;
    protected final android.os.IBinder mImsServiceController = null;
    private android.telephony.ims.aidl.IImsServiceControllerListener mListener;
    private final java.lang.Object mListenerLock = null;
    public ImsService() { super(); }
    private void addImsFeature(int p0, int p1, android.telephony.ims.feature.ImsFeature p2) {}
    private void addImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    private android.telephony.ims.aidl.IImsMmTelFeature createEmergencyOnlyMmTelFeatureInternal(int p0) { return null; }
    private android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeatureInternal(int p0, int p1) { return null; }
    private android.telephony.ims.aidl.IImsRcsFeature createRcsFeatureInternal(int p0, int p1) { return null; }
    private void executeMethodAsync(java.lang.Runnable p0, java.lang.String p1) {}
    private <T extends java.lang.Object> T executeMethodAsyncForResult(java.util.function.Supplier<T> p0, java.lang.String p1) { return null; }
    private java.util.concurrent.Executor getCachedExecutor() { return null; }
    public static java.lang.String getCapabilitiesString(long p0) { return null; }
    private android.util.SparseBooleanArray getImsFeatureCreatedForSlot(int p0) { return null; }
    private void notifySubscriptionRemoved(int p0) {}
    private void releaseResource() {}
    private void removeImsFeature(int p0, int p1) {}
    private void removeImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    private void resetImsInternal(int p0, int p1) {}
    private static long sanitizeCapabilities(long p0) { return 0L; }
    private void setImsFeatureCreatedForSlot(int p0, int p1, boolean p2) {}
    private void setupFeature(android.telephony.ims.feature.ImsFeature p0, int p1, int p2) {}
    public android.telephony.ims.feature.MmTelFeature createEmergencyOnlyMmTelFeature(int p0) { return null; }
    @java.lang.Deprecated
    public android.telephony.ims.feature.MmTelFeature createMmTelFeature(int p0) { return null; }
    public android.telephony.ims.feature.MmTelFeature createMmTelFeatureForSubscription(int p0, int p1) { return null; }
    @java.lang.Deprecated
    public android.telephony.ims.feature.RcsFeature createRcsFeature(int p0) { return null; }
    public android.telephony.ims.feature.RcsFeature createRcsFeatureForSubscription(int p0, int p1) { return null; }
    @java.lang.Deprecated
    public void disableIms(int p0) {}
    public void disableImsForSubscription(int p0, int p1) {}
    @java.lang.Deprecated
    public void enableIms(int p0) {}
    public void enableImsForSubscription(int p0, int p1) {}
    @java.lang.Deprecated
    public android.telephony.ims.stub.ImsConfigImplBase getConfig(int p0) { return null; }
    public android.telephony.ims.stub.ImsConfigImplBase getConfigForSubscription(int p0, int p1) { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public android.telephony.ims.feature.ImsFeature getImsFeature(int p0, int p1) { return null; }
    public long getImsServiceCapabilities() { return 0L; }
    @java.lang.Deprecated
    public android.telephony.ims.stub.ImsRegistrationImplBase getRegistration(int p0) { return null; }
    public android.telephony.ims.stub.ImsRegistrationImplBase getRegistrationForSubscription(int p0, int p1) { return null; }
    public android.telephony.ims.stub.SipTransportImplBase getSipTransport(int p0) { return null; }
    public boolean isImsFeatureCreatedForSlot(int p0, int p1) { return false; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException {}
    public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() { return null; }
    public void readyForFeatureCreation() {}
    public void resetIms(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsServiceCapability {
    }

    public static class Listener extends android.telephony.ims.aidl.IImsServiceControllerListener.Stub {
        public Listener() { super(); }
        public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) {}
    }
}
