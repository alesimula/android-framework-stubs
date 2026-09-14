package android.app.admin.policy;

public class DeviceRadioState {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> MANAGED_ESIM_OUTGOING_TRANSFER = null;
    public static final int MANAGED_ESIM_OUTGOING_TRANSFER_ALLOWED = 1;
    public static final int MANAGED_ESIM_OUTGOING_TRANSFER_DISALLOWED = 2;
    private DeviceRadioState() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ManagedEsimOutgoingTransfer {
    }
}
