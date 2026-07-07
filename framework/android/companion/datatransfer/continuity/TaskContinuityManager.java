package android.companion.datatransfer.continuity;

@android.annotation.SystemApi
public class TaskContinuityManager {
    public static final int HANDOFF_AVAILABILITY_STATUS_AVAILABLE = 0;
    public static final int HANDOFF_AVAILABILITY_STATUS_DISABLED_BY_POLICY = 1;
    public static final int HANDOFF_AVAILABILITY_STATUS_UNSUPPORTED_HARDWARE = 2;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_DEVICE_NOT_FOUND = 5;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_HANDOFF_DISABLED = 7;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_NO_DATA_PROVIDED_BY_TASK = 2;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_OTHER_INTERNAL_ERROR = 6;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_SENDER_LOST_CONNECTION = 3;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_TASK_NOT_FOUND = 1;
    public static final int HANDOFF_REQUEST_RESULT_FAILURE_TIMEOUT = 4;
    public static final int HANDOFF_REQUEST_RESULT_SUCCESS = 0;
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.companion.datatransfer.continuity.TaskContinuityManager.HandoffFeatureStateListener, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffFeatureStateListenerHolder> mHandoffFeatureStateListenerHolders = null;
    private final android.util.ArrayMap<android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener, android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListenerHolder> mRemoteTaskListenerHolders = null;
    private final android.companion.datatransfer.continuity.ITaskContinuityManager mService = null;
    public TaskContinuityManager(android.content.Context p0, android.companion.datatransfer.continuity.ITaskContinuityManager p1) {}
    public void registerHandoffFeatureStateListener(java.util.concurrent.Executor p0, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffFeatureStateListener p1) {}
    public void registerRemoteTaskListener(java.util.concurrent.Executor p0, android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p1) {}
    public void requestHandoff(int p0, int p1, java.util.concurrent.Executor p2, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffRequestCallback p3) {}
    public void setHandoffForDeviceEnabled(boolean p0) {}
    public void unregisterHandoffFeatureStateListener(android.companion.datatransfer.continuity.TaskContinuityManager.HandoffFeatureStateListener p0) {}
    public void unregisterRemoteTaskListener(android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandoffAvailabilityStatus {
    }

    public static interface HandoffFeatureStateListener {
        public void onHandoffFeatureStateChanged(int p0, boolean p1);
    }

    private final class HandoffFeatureStateListenerHolder extends android.companion.datatransfer.continuity.IHandoffFeatureStateListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.datatransfer.continuity.TaskContinuityManager.HandoffFeatureStateListener mListener = null;
        HandoffFeatureStateListenerHolder(android.companion.datatransfer.continuity.TaskContinuityManager p0, java.util.concurrent.Executor p1, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffFeatureStateListener p2) { super(); }
        public void onHandoffFeatureStateChanged(int p0, boolean p1) throws android.os.RemoteException {}
    }

    public static interface HandoffRequestCallback {
        public void onHandoffRequestFinished(int p0, int p1, int p2);
    }

    private final class HandoffRequestCallbackHolder extends android.companion.datatransfer.continuity.IHandoffRequestCallback.Stub {
        private final android.companion.datatransfer.continuity.TaskContinuityManager.HandoffRequestCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        HandoffRequestCallbackHolder(android.companion.datatransfer.continuity.TaskContinuityManager p0, java.util.concurrent.Executor p1, android.companion.datatransfer.continuity.TaskContinuityManager.HandoffRequestCallback p2) { super(); }
        public void onHandoffRequestFinished(int p0, int p1, int p2) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandoffRequestResultCode {
    }

    public static interface RemoteTaskListener {
        public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0);
    }

    private final class RemoteTaskListenerHolder extends android.companion.datatransfer.continuity.IRemoteTaskListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener mListener = null;
        RemoteTaskListenerHolder(android.companion.datatransfer.continuity.TaskContinuityManager p0, java.util.concurrent.Executor p1, android.companion.datatransfer.continuity.TaskContinuityManager.RemoteTaskListener p2) { super(); }
        public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0) throws android.os.RemoteException {}
    }
}
