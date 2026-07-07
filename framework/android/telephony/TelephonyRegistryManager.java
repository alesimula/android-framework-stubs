package android.telephony;

@android.annotation.SystemApi
public class TelephonyRegistryManager {
    private static final long LISTEN_CODE_CHANGE = 147600208L;
    public static final int SIM_ACTIVATION_TYPE_DATA = 1;
    public static final int SIM_ACTIVATION_TYPE_VOICE = 0;
    private static final java.lang.String TAG = "TelephonyRegistryManager";
    private static final java.util.WeakHashMap<android.telephony.TelephonyManager.CarrierPrivilegesCallback, java.lang.ref.WeakReference<android.telephony.TelephonyRegistryManager.CarrierPrivilegesCallbackWrapper>> sCarrierPrivilegeCallbacks = null;
    private static com.android.internal.telephony.ITelephonyRegistry sRegistry;
    private static final java.util.Map<android.telephony.satellite.SatelliteStateChangeListener, java.lang.ref.WeakReference<android.telephony.TelephonyRegistryManager.SatelliteStateChangeListenerWrapper>> sSatelliteStateChangeListeners = null;
    private final java.util.concurrent.ConcurrentHashMap<android.telephony.CarrierConfigManager.CarrierConfigChangeListener, com.android.internal.telephony.ICarrierConfigChangeListener> mCarrierConfigChangeListenerMap = null;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.ConcurrentHashMap<android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener, com.android.internal.telephony.IOnSubscriptionsChangedListener> mOpportunisticSubscriptionChangedListenerMap = null;
    private final java.util.concurrent.ConcurrentHashMap<android.telephony.SubscriptionManager.OnSubscriptionsChangedListener, com.android.internal.telephony.IOnSubscriptionsChangedListener> mSubscriptionChangedListenerMap = null;
    public TelephonyRegistryManager(android.content.Context p0) {}
    private java.util.Set<java.lang.Integer> getEventsFromBitmask(int p0) { return null; }
    private void listenFromCallback(boolean p0, boolean p1, int p2, java.lang.String p3, java.lang.String p4, android.telephony.TelephonyCallback p5, int[] p6, boolean p7) {}
    public void addCarrierConfigChangedListener(java.util.concurrent.Executor p0, android.telephony.CarrierConfigManager.CarrierConfigChangeListener p1) {}
    public void addCarrierPrivilegesCallback(int p0, java.util.concurrent.Executor p1, android.telephony.TelephonyManager.CarrierPrivilegesCallback p2) {}
    public void addOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p0, java.util.concurrent.Executor p1) {}
    public void addOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0, java.util.concurrent.Executor p1) {}
    public void addSatelliteStateChangeListener(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteStateChangeListener p1) {}
    public java.util.Set<java.lang.Integer> getEventsFromCallback(android.telephony.TelephonyCallback p0) { return null; }
    public void listenFromListener(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.telephony.PhoneStateListener p5, int p6, boolean p7) {}
    public void notifyActiveDataSubIdChanged(int p0) {}
    public void notifyAllowedNetworkTypesChanged(int p0, int p1, int p2, long p3) {}
    public void notifyBarringInfoChanged(int p0, int p1, android.telephony.BarringInfo p2) {}
    public void notifyCallForwardingChanged(int p0, boolean p1) {}
    public void notifyCallQualityChanged(int p0, int p1, android.telephony.CallQuality p2, int p3) {}
    public void notifyCallStateChanged(int p0, int p1, int p2, java.lang.String p3) {}
    @android.annotation.SystemApi
    public void notifyCallStateChangedForAllSubscriptions(int p0, java.lang.String p1) {}
    public void notifyCallbackModeRestarted(int p0, int p1, int p2, long p3) {}
    public void notifyCallbackModeStarted(int p0, int p1, int p2, long p3) {}
    public void notifyCallbackModeStopped(int p0, int p1, int p2, int p3) {}
    public void notifyCarrierConfigChanged(int p0, int p1, int p2, int p3) {}
    public void notifyCarrierNetworkChange(int p0, int p1, boolean p2) {}
    public void notifyCarrierNetworkChange(int p0, boolean p1) {}
    public void notifyCarrierNetworkChange(boolean p0) {}
    public void notifyCarrierPrivilegesChanged(int p0, java.util.Set<java.lang.String> p1, java.util.Set<java.lang.Integer> p2) {}
    public void notifyCarrierRoamingNtnAvailableServicesChanged(int p0, int[] p1) {}
    public void notifyCarrierRoamingNtnEligibleStateChanged(int p0, boolean p1) {}
    public void notifyCarrierRoamingNtnModeChanged(int p0, boolean p1) {}
    public final void notifyCarrierRoamingNtnSignalStrengthChanged(int p0, android.telephony.satellite.NtnSignalStrength p1) {}
    public void notifyCarrierServiceChanged(int p0, java.lang.String p1, int p2) {}
    public void notifyCellInfoChanged(int p0, java.util.List<android.telephony.CellInfo> p1) {}
    public void notifyCellLocation(int p0, android.telephony.CellIdentity p1) {}
    public void notifyCellularIdentifierDisclosedChanged(int p0, int p1, android.telephony.CellularIdentifierDisclosure p2) {}
    public void notifyDataActivationStateChanged(int p0, int p1, int p2) {}
    public void notifyDataActivityChanged(int p0, int p1) {}
    public void notifyDataActivityChanged(int p0, int p1, int p2) {}
    public void notifyDataConnectionForSubscriber(int p0, int p1, android.telephony.PreciseDataConnectionState p2) {}
    public void notifyDataEnabled(int p0, int p1, boolean p2, int p3) {}
    public void notifyDisconnectCause(int p0, int p1, int p2, int p3) {}
    public void notifyDisplayInfoChanged(int p0, int p1, android.telephony.TelephonyDisplayInfo p2) {}
    public void notifyDomainSelectionEmergencyModeEntered(int p0, int p1, int p2) {}
    public void notifyDomainSelectionEmergencyModeExited(int p0, int p1, int p2) {}
    public void notifyEmergencyNumberList(int p0, int p1) {}
    public void notifyImsDisconnectCause(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    public void notifyLinkCapacityEstimateChanged(int p0, int p1, java.util.List<android.telephony.LinkCapacityEstimate> p2) {}
    public void notifyMediaQualityStatusChanged(int p0, int p1, android.telephony.ims.MediaQualityStatus p2) {}
    public void notifyMessageWaitingChanged(int p0, int p1, boolean p2) {}
    public void notifyNetworkSecurityEvents(int p0, int p1, java.util.Set<android.telephony.NetworkSecurityEvent> p2) {}
    public void notifyOpportunisticSubscriptionInfoChanged() {}
    @android.annotation.SystemApi
    public void notifyOutgoingEmergencyCall(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) {}
    public void notifyOutgoingEmergencySms(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) {}
    public void notifyPhoneCapabilityChanged(android.telephony.PhoneCapability p0) {}
    public void notifyPhysicalChannelConfigForSubscriber(int p0, int p1, java.util.List<android.telephony.PhysicalChannelConfig> p2) {}
    public void notifyPreciseCallState(int p0, int p1, int[] p2, java.lang.String[] p3, int[] p4, int[] p5) {}
    public void notifyRadioPowerStateChanged(int p0, int p1, int p2) {}
    public void notifyRegistrationFailed(int p0, int p1, android.telephony.CellIdentity p2, java.lang.String p3, int p4, int p5, int p6) {}
    public void notifySatellitePurchaseModeChanged(int p0, boolean p1, int p2) {}
    public void notifySatelliteStateChanged(boolean p0) {}
    public void notifySecurityAlgorithmsChanged(int p0, int p1, android.telephony.SecurityAlgorithmUpdate p2) {}
    public void notifyServiceStateChanged(int p0, int p1, android.telephony.ServiceState p2) {}
    public void notifySignalStrengthChanged(int p0, int p1, android.telephony.SignalStrength p2) {}
    public void notifySimultaneousCellularCallingSubscriptionsChanged(java.util.Set<java.lang.Integer> p0) {}
    public void notifySrvccStateChanged(int p0, int p1) {}
    public void notifySubscriptionInfoChanged() {}
    public void notifyUserMobileDataStateChanged(int p0, int p1, boolean p2) {}
    public void notifyVoiceActivationStateChanged(int p0, int p1, int p2) {}
    public void registerTelephonyCallback(boolean p0, boolean p1, java.util.concurrent.Executor p2, int p3, java.lang.String p4, java.lang.String p5, android.telephony.TelephonyCallback p6, boolean p7) {}
    public void removeCarrierConfigChangedListener(android.telephony.CarrierConfigManager.CarrierConfigChangeListener p0) {}
    public void removeCarrierPrivilegesCallback(android.telephony.TelephonyManager.CarrierPrivilegesCallback p0) {}
    public void removeOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p0) {}
    public void removeOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) {}
    public void removeSatelliteStateChangeListener(android.telephony.satellite.SatelliteStateChangeListener p0) {}
    public void unregisterTelephonyCallback(int p0, java.lang.String p1, java.lang.String p2, android.telephony.TelephonyCallback p3, boolean p4) {}

    private static class CarrierPrivilegesCallbackWrapper extends com.android.internal.telephony.ICarrierPrivilegesCallback.Stub implements com.android.internal.listeners.ListenerExecutor {
        private final java.lang.ref.WeakReference<android.telephony.TelephonyManager.CarrierPrivilegesCallback> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CarrierPrivilegesCallbackWrapper(android.telephony.TelephonyManager.CarrierPrivilegesCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onCarrierPrivilegesChanged(java.util.List<java.lang.String> p0, int[] p1) {}
        public void onCarrierServiceChanged(java.lang.String p0, int p1) {}
    }

    private static class SatelliteStateChangeListenerWrapper extends com.android.internal.telephony.ISatelliteStateChangeListener.Stub implements com.android.internal.listeners.ListenerExecutor {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.lang.ref.WeakReference<android.telephony.satellite.SatelliteStateChangeListener> mListener = null;
        SatelliteStateChangeListenerWrapper(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteStateChangeListener p1) { super(); }
        public void onSatelliteEnabledStateChanged(boolean p0) {}
    }
}
