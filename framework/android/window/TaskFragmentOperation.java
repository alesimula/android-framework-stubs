package android.window;

public final class TaskFragmentOperation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentOperation> CREATOR = null;
    public static final int OP_TYPE_CLEAR_ADJACENT_TASK_FRAGMENTS = 5;
    public static final int OP_TYPE_CREATE_OR_MOVE_TASK_FRAGMENT_DECOR_SURFACE = 12;
    public static final int OP_TYPE_CREATE_TASK_FRAGMENT = 0;
    public static final int OP_TYPE_DELETE_TASK_FRAGMENT = 1;
    public static final int OP_TYPE_PRIVILEGED_REORDER_TO_BOTTOM_OF_TASK = 1001;
    public static final int OP_TYPE_PRIVILEGED_REORDER_TO_TOP_OF_TASK = 1002;
    public static final int OP_TYPE_PRIVILEGED_SET_CAN_AFFECT_SYSTEM_UI_FLAGS = 1004;
    public static final int OP_TYPE_PRIVILEGED_SET_MOVE_TO_BOTTOM_IF_CLEAR_WHEN_LAUNCH = 1003;
    public static final int OP_TYPE_REMOVE_TASK_FRAGMENT_DECOR_SURFACE = 13;
    public static final int OP_TYPE_REORDER_TO_FRONT = 10;
    public static final int OP_TYPE_REPARENT_ACTIVITY_TO_TASK_FRAGMENT = 3;
    public static final int OP_TYPE_REQUEST_FOCUS_ON_TASK_FRAGMENT = 6;
    public static final int OP_TYPE_SET_ADJACENT_TASK_FRAGMENTS = 4;
    public static final int OP_TYPE_SET_ANIMATION_PARAMS = 8;
    public static final int OP_TYPE_SET_COMPANION_TASK_FRAGMENT = 7;
    public static final int OP_TYPE_SET_DECOR_SURFACE_BOOSTED = 15;
    public static final int OP_TYPE_SET_DIM_ON_TASK = 14;
    public static final int OP_TYPE_SET_ISOLATED_NAVIGATION = 11;
    public static final int OP_TYPE_SET_PINNED = 16;
    public static final int OP_TYPE_SET_RELATIVE_BOUNDS = 9;
    public static final int OP_TYPE_START_ACTIVITY_IN_TASK_FRAGMENT = 2;
    public static final int OP_TYPE_UNKNOWN = -1;
    public static final int PRIVILEGED_OP_START = 1000;
    private final android.content.Intent mActivityIntent = null;
    private final android.os.IBinder mActivityToken = null;
    private final android.window.TaskFragmentAnimationParams mAnimationParams = null;
    private final boolean mBooleanValue = false;
    private final android.os.Bundle mBundle = null;
    private final int mOpType = 0;
    private final android.os.IBinder mSecondaryFragmentToken = null;
    private final android.view.SurfaceControl.Transaction mSurfaceTransaction = null;
    private final android.window.TaskFragmentCreationParams mTaskFragmentCreationParams = null;
    private TaskFragmentOperation(int p0, android.window.TaskFragmentCreationParams p1, android.os.IBinder p2, android.content.Intent p3, android.os.Bundle p4, android.os.IBinder p5, android.window.TaskFragmentAnimationParams p6, boolean p7, android.view.SurfaceControl.Transaction p8) {}
    private TaskFragmentOperation(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.Intent getActivityIntent() { return null; }
    public android.os.IBinder getActivityToken() { return null; }
    public android.window.TaskFragmentAnimationParams getAnimationParams() { return null; }
    public boolean getBooleanValue() { return false; }
    public android.os.Bundle getBundle() { return null; }
    public int getOpType() { return 0; }
    public android.os.IBinder getSecondaryFragmentToken() { return null; }
    public android.view.SurfaceControl.Transaction getSurfaceTransaction() { return null; }
    public android.window.TaskFragmentCreationParams getTaskFragmentCreationParams() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.Intent mActivityIntent;
        private android.os.IBinder mActivityToken;
        private android.window.TaskFragmentAnimationParams mAnimationParams;
        private boolean mBooleanValue;
        private android.os.Bundle mBundle;
        private final int mOpType = 0;
        private android.os.IBinder mSecondaryFragmentToken;
        private android.view.SurfaceControl.Transaction mSurfaceTransaction;
        private android.window.TaskFragmentCreationParams mTaskFragmentCreationParams;
        public Builder(int p0) {}
        public android.window.TaskFragmentOperation build() { return null; }
        public android.window.TaskFragmentOperation.Builder setActivityIntent(android.content.Intent p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setActivityToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setAnimationParams(android.window.TaskFragmentAnimationParams p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setBooleanValue(boolean p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setBundle(android.os.Bundle p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setSecondaryFragmentToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setSurfaceTransaction(android.view.SurfaceControl.Transaction p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setTaskFragmentCreationParams(android.window.TaskFragmentCreationParams p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationType {
    }
}
