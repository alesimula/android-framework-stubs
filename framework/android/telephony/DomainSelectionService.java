package android.telephony;

@android.annotation.SystemApi
public abstract class DomainSelectionService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "DomainSelectionService";
    public static final int SCAN_TYPE_FULL_SERVICE = 2;
    public static final int SCAN_TYPE_LIMITED_SERVICE = 1;
    public static final int SCAN_TYPE_NO_PREFERENCE = 0;
    public static final int SELECTOR_TYPE_CALLING = 1;
    public static final int SELECTOR_TYPE_SMS = 2;
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.DomainSelectionService";
    private final android.os.IBinder mDomainSelectionServiceController = null;
    private java.util.concurrent.Executor mExecutor;
    private final java.lang.Object mExecutorLock = null;
    public DomainSelectionService() { super(); }
    private static void executeMethodAsync(java.util.concurrent.Executor p0, java.lang.Runnable p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    private void executeMethodAsyncNoException(java.util.concurrent.Executor p0, java.lang.Runnable p1, java.lang.String p2, java.lang.String p3) {}
    public static java.lang.String getDomainName(int p0) { return null; }
    public final java.util.concurrent.Executor getCachedExecutor() { return null; }
    public java.util.concurrent.Executor getCreateExecutor() { return null; }
    public void onBarringInfoUpdated(int p0, int p1, android.telephony.BarringInfo p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDomainSelection(android.telephony.DomainSelectionService.SelectionAttributes p0, android.telephony.TransportSelectorCallback p1);
    public void onServiceStateUpdated(int p0, int p1, android.telephony.ServiceState p2) {}

    private final class DomainSelectorWrapper {
        private static final java.lang.String TAG = "DomainSelectorWrapper";
        private com.android.internal.telephony.IDomainSelector mCallbackBinder;
        DomainSelectorWrapper(android.telephony.DomainSelectionService p0, android.telephony.DomainSelector p1, java.util.concurrent.Executor p2) {}
        public com.android.internal.telephony.IDomainSelector getCallbackBinder() { return null; }

        private class IDomainSelectorAdapter extends com.android.internal.telephony.IDomainSelector.Stub {
            private final java.lang.ref.WeakReference<android.telephony.DomainSelector> mDomainSelectorWeakRef = null;
            private final java.util.concurrent.Executor mExecutor = null;
            IDomainSelectorAdapter(android.telephony.DomainSelectionService.DomainSelectorWrapper p0, android.telephony.DomainSelector p1, java.util.concurrent.Executor p2) { super(); }
            public void finishSelection() {}
            public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyScanType {
    }

    public static final class SelectionAttributes implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.telephony.DomainSelectionService.SelectionAttributes> CREATOR = null;
        private static final java.lang.String TAG = "SelectionAttributes";
        private android.net.Uri mAddress;
        private java.lang.String mCallId;
        private int mCause;
        private android.telephony.EmergencyRegistrationResult mEmergencyRegistrationResult;
        private android.telephony.ims.ImsReasonInfo mImsReasonInfo;
        private boolean mIsEmergency;
        private boolean mIsExitedFromAirplaneMode;
        private boolean mIsTestEmergencyNumber;
        private boolean mIsVideoCall;
        private int mSelectorType;
        private int mSlotIndex;
        private int mSubId;
        private SelectionAttributes(int p0, int p1, java.lang.String p2, android.net.Uri p3, int p4, boolean p5, boolean p6, boolean p7, boolean p8, android.telephony.ims.ImsReasonInfo p9, int p10, android.telephony.EmergencyRegistrationResult p11) {}
        private SelectionAttributes(android.os.Parcel p0) {}
        public SelectionAttributes(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
        private static boolean equalsHandlesNulls(java.lang.Object p0, java.lang.Object p1) { return false; }
        private void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.net.Uri getAddress() { return null; }
        public java.lang.String getCallId() { return null; }
        public int getCsDisconnectCause() { return 0; }
        public android.telephony.EmergencyRegistrationResult getEmergencyRegistrationResult() { return null; }
        public android.telephony.ims.ImsReasonInfo getPsDisconnectCause() { return null; }
        public int getSelectorType() { return 0; }
        public int getSlotIndex() { return 0; }
        public int getSubscriptionId() { return 0; }
        public int hashCode() { return 0; }
        public boolean isEmergency() { return false; }
        public boolean isExitedFromAirplaneMode() { return false; }
        public boolean isTestEmergencyNumber() { return false; }
        public boolean isVideoCall() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private android.net.Uri mAddress;
            private java.lang.String mCallId;
            private int mCause;
            private android.telephony.EmergencyRegistrationResult mEmergencyRegistrationResult;
            private android.telephony.ims.ImsReasonInfo mImsReasonInfo;
            private boolean mIsEmergency;
            private boolean mIsExitedFromAirplaneMode;
            private boolean mIsTestEmergencyNumber;
            private boolean mIsVideoCall;
            private final int mSelectorType = 0;
            private final int mSlotIndex = 0;
            private final int mSubId = 0;
            public Builder(int p0, int p1, int p2) {}
            public android.telephony.DomainSelectionService.SelectionAttributes build() { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setAddress(android.net.Uri p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setCallId(java.lang.String p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setCsDisconnectCause(int p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setEmergency(boolean p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setEmergencyRegistrationResult(android.telephony.EmergencyRegistrationResult p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setExitedFromAirplaneMode(boolean p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setPsDisconnectCause(android.telephony.ims.ImsReasonInfo p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setTestEmergencyNumber(boolean p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setVideoCall(boolean p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SelectorType {
    }

    private final class TransportSelectorCallbackWrapper implements android.telephony.TransportSelectorCallback {
        private static final java.lang.String TAG = "TransportSelectorCallbackWrapper";
        private final com.android.internal.telephony.ITransportSelectorCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private android.telephony.DomainSelectionService.TransportSelectorCallbackWrapper.ITransportSelectorResultCallbackAdapter mResultCallback;
        private android.telephony.DomainSelectionService.DomainSelectorWrapper mSelectorWrapper;
        TransportSelectorCallbackWrapper(android.telephony.DomainSelectionService p0, com.android.internal.telephony.ITransportSelectorCallback p1, java.util.concurrent.Executor p2) {}
        public void onCreated(android.telephony.DomainSelector p0) {}
        public void onSelectionTerminated(int p0) {}
        public void onWlanSelected(boolean p0) {}
        public void onWwanSelected(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0) {}

        private class ITransportSelectorResultCallbackAdapter extends com.android.internal.telephony.ITransportSelectorResultCallback.Stub {
            private final java.util.function.Consumer<android.telephony.WwanSelectorCallback> mConsumer = null;
            private final java.util.concurrent.Executor mExecutor = null;
            ITransportSelectorResultCallbackAdapter(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0, java.util.concurrent.Executor p1) { super(); }
            public void onCompleted(com.android.internal.telephony.IWwanSelectorCallback p0) {}
        }
    }

    private final class WwanSelectorCallbackWrapper implements android.telephony.WwanSelectorCallback, android.os.CancellationSignal.OnCancelListener {
        private static final java.lang.String TAG = "WwanSelectorCallbackWrapper";
        private final com.android.internal.telephony.IWwanSelectorCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private android.telephony.DomainSelectionService.WwanSelectorCallbackWrapper.IWwanSelectorResultCallbackAdapter mResultCallback;
        WwanSelectorCallbackWrapper(android.telephony.DomainSelectionService p0, com.android.internal.telephony.IWwanSelectorCallback p1, java.util.concurrent.Executor p2) {}
        public void onCancel() {}
        public void onDomainSelected(int p0, boolean p1) {}
        public void onRequestEmergencyNetworkScan(java.util.List<java.lang.Integer> p0, int p1, boolean p2, android.os.CancellationSignal p3, java.util.function.Consumer<android.telephony.EmergencyRegistrationResult> p4) {}

        private class IWwanSelectorResultCallbackAdapter extends com.android.internal.telephony.IWwanSelectorResultCallback.Stub {
            private final java.util.function.Consumer<android.telephony.EmergencyRegistrationResult> mConsumer = null;
            private final java.util.concurrent.Executor mExecutor = null;
            IWwanSelectorResultCallbackAdapter(java.util.function.Consumer<android.telephony.EmergencyRegistrationResult> p0, java.util.concurrent.Executor p1) { super(); }
            public void onComplete(android.telephony.EmergencyRegistrationResult p0) {}
        }
    }
}
