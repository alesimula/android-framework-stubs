package android.app.admin;

public class PolicyValueCallbackHandler {
    private static final java.lang.String TAG = "PolicyValueCallbackHandler";
    private final java.util.Map<android.app.admin.PolicyValueCallbackHandler.DeviceCallbackKey, android.app.admin.IDevicePolicyValueCallback> mDeviceCallbacks = null;
    private final java.lang.String mPackageName = null;
    private final android.app.admin.IDevicePolicyManager mService = null;
    public PolicyValueCallbackHandler(java.lang.String p0, android.app.admin.IDevicePolicyManager p1) {}
    private static <T extends java.lang.Object> T policyValueFromTransport(android.app.admin.PolicyIdentifier<T> p0, android.app.admin.PolicyValueTransport p1) { return null; }
    public <T extends java.lang.Object> void addResolvedDeviceWidePolicyCallback(android.app.admin.PolicyIdentifier<T> p0, java.util.concurrent.Executor p1, android.app.admin.ResolvedDeviceWidePolicyCallback<T> p2) {}
    public <T extends java.lang.Object> void removeResolvedDeviceWidePolicyCallback(android.app.admin.PolicyIdentifier<T> p0, android.app.admin.ResolvedDeviceWidePolicyCallback<T> p1) {}

    private static final class DeviceCallbackKey {
        private final android.app.admin.ResolvedDeviceWidePolicyCallback<?> mCallback = null;
        private final android.app.admin.PolicyIdentifier<?> mId = null;
        DeviceCallbackKey(android.app.admin.PolicyIdentifier<?> p0, android.app.admin.ResolvedDeviceWidePolicyCallback<?> p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
