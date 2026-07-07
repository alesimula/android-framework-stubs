package android.telephony.ims.stub;

public class ImsRegistrationImplBase {
    public static final int DEFAULT_THROTTLE_SEC = 0;
    private static final java.lang.String LOG_TAG = "ImsRegistrationImplBase";
    public static final int REASON_ALLOWED_NETWORK_TYPES_CHANGED = 3;
    public static final int REASON_HANDOVER_FAILED = 6;
    public static final int REASON_NON_IMS_CAPABLE_NETWORK = 4;
    public static final int REASON_RADIO_POWER_OFF = 5;
    public static final int REASON_SIM_REFRESH = 2;
    public static final int REASON_SIM_REMOVED = 1;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_VOPS_NOT_SUPPORTED = 7;
    private static final int REGISTRATION_STATE_UNKNOWN = -1;
    public static final int REGISTRATION_TECH_3G = 4;
    public static final int REGISTRATION_TECH_CROSS_SIM = 2;
    public static final int REGISTRATION_TECH_IWLAN = 1;
    public static final int REGISTRATION_TECH_LTE = 0;
    public static final int REGISTRATION_TECH_MAX = 5;
    public static final int REGISTRATION_TECH_NONE = -1;
    public static final int REGISTRATION_TECH_NR = 3;
    private final android.telephony.ims.aidl.IImsRegistration mBinder = null;
    private final com.android.internal.telephony.util.RemoteCallbackListExt<android.telephony.ims.aidl.IImsRegistrationCallback> mCallbacks = null;
    private final com.android.internal.telephony.util.RemoteCallbackListExt<android.telephony.ims.aidl.IImsRegistrationCallback> mEmergencyCallbacks = null;
    private android.telephony.ims.ImsReasonInfo mEmergencyLastDisconnectCause;
    private int mEmergencyLastDisconnectRadioTech;
    private int mEmergencyLastDisconnectSuggestedAction;
    private android.telephony.ims.ImsRegistrationAttributes mEmergencyRegistrationAttributes;
    private int mEmergencyRegistrationState;
    private java.util.concurrent.Executor mExecutor;
    private android.telephony.ims.ImsReasonInfo mLastDisconnectCause;
    private int mLastDisconnectRadioTech;
    private int mLastDisconnectSuggestedAction;
    private final java.lang.Object mLock = null;
    private android.telephony.ims.ImsRegistrationAttributes mRegistrationAttributes;
    private int mRegistrationState;
    private android.net.Uri[] mUris;
    private boolean mUrisSet;
    @android.annotation.SystemApi
    public ImsRegistrationImplBase() {}
    @android.annotation.SystemApi
    public ImsRegistrationImplBase(java.util.concurrent.Executor p0) {}
    private void addEmergencyRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
    private void addRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
    private void broadcastToCallbacksLocked(java.util.function.Consumer<android.telephony.ims.aidl.IImsRegistrationCallback> p0, boolean p1) {}
    private boolean isEmergency(android.telephony.ims.ImsRegistrationAttributes p0) { return false; }
    private void onSubscriberAssociatedUriChanged(android.telephony.ims.aidl.IImsRegistrationCallback p0, android.net.Uri[] p1) {}
    private void removeEmergencyRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) {}
    private void removeRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) {}
    private void updateNewCallbackWithState(android.telephony.ims.aidl.IImsRegistrationCallback p0, boolean p1) throws android.os.RemoteException {}
    private void updateToDisconnectedEmergencyState(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) {}
    private void updateToDisconnectedState(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) {}
    private void updateToEmergencyState(android.telephony.ims.ImsRegistrationAttributes p0, int p1) {}
    private void updateToState(android.telephony.ims.ImsRegistrationAttributes p0, int p1) {}
    public final void clearRegistrationCache() {}
    public final android.telephony.ims.aidl.IImsRegistration getBinder() { return null; }
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, android.telephony.ims.SipDetails p3) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, android.telephony.ims.ImsRegistrationAttributes p2) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, android.telephony.ims.ImsRegistrationAttributes p2, int p3) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, android.telephony.ims.SipDetails p1) {}
    @android.annotation.SystemApi
    public final void onRegistered(int p0) {}
    @android.annotation.SystemApi
    public final void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) {}
    @android.annotation.SystemApi
    public final void onRegistering(int p0) {}
    @android.annotation.SystemApi
    public final void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) {}
    @android.annotation.SystemApi
    public final void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
    @android.annotation.SystemApi
    public final void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    @android.annotation.SystemApi
    public final void onTechnologyChangeFailed(android.telephony.ims.ImsReasonInfo p0, android.telephony.ims.ImsRegistrationAttributes p1) {}
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}
    public void triggerDeregistration(int p0) {}
    @android.annotation.SystemApi
    public void triggerFullNetworkRegistration(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public void triggerSipDelegateDeregistration() {}
    @android.annotation.SystemApi
    public void updateSipDelegateRegistration() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsDeregistrationReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsRegistrationTech {
    }
}
