package android.hardware.contexthub;

@android.annotation.SystemApi
public final class DataFlowNewDataAlertPolicy {
    public static final int POLICY_TYPE_HIGH_WATERMARK = 2;
    public static final int POLICY_TYPE_NEVER = 0;
    public static final int POLICY_TYPE_OPPORTUNISTIC = 1;
    public static final int POLICY_TYPE_PERIODIC = 3;
    public static final int POLICY_TYPE_STREAMING = 4;
    private final int mData = 0;
    private final int mPolicyType = 0;
    public DataFlowNewDataAlertPolicy(int p0, int p1) {}
    public static android.hardware.contexthub.DataFlowNewDataAlertPolicy createHighWatermarkPolicy(int p0) { return null; }
    public static android.hardware.contexthub.DataFlowNewDataAlertPolicy createNeverNotifyPolicy() { return null; }
    public static android.hardware.contexthub.DataFlowNewDataAlertPolicy createOpportunisticPolicy(int p0) { return null; }
    public static android.hardware.contexthub.DataFlowNewDataAlertPolicy createPeriodicPolicy(java.time.Duration p0) { return null; }
    public static android.hardware.contexthub.DataFlowNewDataAlertPolicy createStreamingPolicy() { return null; }
    public int getData() { return 0; }
    public int getPolicyType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PolicyType {
    }
}
