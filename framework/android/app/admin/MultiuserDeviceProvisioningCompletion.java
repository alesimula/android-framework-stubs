package android.app.admin;

public class MultiuserDeviceProvisioningCompletion extends android.app.admin.IDeviceProvisioningCallback.Stub {
    private static final java.lang.String TAG = "MultiuserDeviceProvisioningCompletion";
    private volatile int mErrorCode;
    private final java.util.concurrent.CountDownLatch mLatch = null;
    public MultiuserDeviceProvisioningCompletion() { super(); }
    public void onFailure(int p0) {}
    public void onSuccess() {}
    public void waitForCompletion(int p0) throws android.app.admin.ProvisioningException {}
}
